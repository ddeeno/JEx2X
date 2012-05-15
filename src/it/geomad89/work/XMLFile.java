package it.geomad89.work;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class XMLFile {
	
	private XMLEventWriter eventWriter;
	private XMLEventFactory eventFactory;
	private StartElement rootName;
	private XMLEvent tab;
	private XMLEvent end;
	
	private List<String> nestedNode;
	private int cursor = 0;
	
	public XMLFile(String path) {
		
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
		try {
			eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(path));
		} catch (Exception e) {e.printStackTrace();}
		eventFactory = XMLEventFactory.newInstance();
		tab = eventFactory.createDTD("\t");
		end = eventFactory.createDTD("\n");
		nestedNode = new ArrayList<String>();
	}
	
	public void startXMLFile(String rn) {
		
		nestedNode.add(cursor++, rn);
		StartDocument sd = eventFactory.createStartDocument();
		StartElement se = eventFactory.createStartElement("", "", rn);
		try {
			eventWriter.add(sd);
			eventWriter.add(end);
			eventWriter.add(se);
			eventWriter.add(end);
		} catch (XMLStreamException e) {
			e.printStackTrace();
		}
		
	}
	
	public void addNode(String name, String value) throws XMLStreamException {
		
		name = (name == null)? "" : name;
		value = (value == null)? "" : value;
		
		for(int i = 0; i < cursor; i++) {
			eventWriter.add(tab);
		}
		
		StartElement sElement = eventFactory.createStartElement("", "", name);
		eventWriter.add(sElement);
		
		Characters cElement = eventFactory.createCharacters(value);
		eventWriter.add(cElement);
		
		EndElement eElement = eventFactory.createEndElement("", "", name);
		eventWriter.add(eElement);
		eventWriter.add(end);
		
	}
	
	public void addNestedNode(String name) throws XMLStreamException {
		
		name = (name == null)? "" : name;
		
		for(int i = 0; i < cursor; i++) {
			eventWriter.add(tab);
		}
		
		StartElement sElement = eventFactory.createStartElement("", "", name);
		eventWriter.add(sElement);
		eventWriter.add(end);
		nestedNode.add(cursor++, name);
	}
	
	public void closeNestedNode() throws XMLStreamException {
		
		cursor--;
		for(int i = 0; i < cursor; i++) {
			eventWriter.add(tab);
		}
		
		EndElement eElement = eventFactory.createEndElement("", "", nestedNode.get(cursor));
		eventWriter.add(eElement);
		eventWriter.add(end);
	}
	
	public void closeXMLFile() throws XMLStreamException {
		
		EndElement eElement = eventFactory.createEndElement("", "", nestedNode.get(0));
		eventWriter.add(eElement);
		eventWriter.add(end);
		eventWriter.add(eventFactory.createEndDocument());
		eventWriter.close();
	}
}
