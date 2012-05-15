package it.geomad89.work;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Parser {
	
	String inputPath;
	String outputPath;
	//final int BY_RAW = 1;
	//final int BY_COLUMN = 2;
	
	public Parser(String in, String out) {
		
		inputPath = in;
		outputPath = out;
	}
	
	public void conversion() {
		
		File file = new File(this.inputPath);

		XMLFile outputFile = new XMLFile(outputPath);
		outputFile.startXMLFile("root"); // TODO Documento da chiuder
		Workbook w;
		try {
			w = Workbook.getWorkbook(file); 
			Sheet sheet = w.getSheet(0);
			Cell[] etichette = sheet.getRow(0);
			int nRows = sheet.getRows();
			for (int i = 1; i < nRows; i++) {
				outputFile.addNestedNode("riga"); // TODO Nodo da chiudere
				Cell[] currentRow = sheet.getRow(i);
				for (int n = 0; n < currentRow.length; n++) {
					outputFile.addNode(etichette[n].getContents(), currentRow[n].getContents());
				}
				outputFile.closeNestedNode();
			}
			outputFile.closeXMLFile();
		} catch (Exception e) {e.printStackTrace();}
	}
}
