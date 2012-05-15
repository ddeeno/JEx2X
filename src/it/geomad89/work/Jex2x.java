package it.geomad89.work;

import java.awt.EventQueue;

public class Jex2x {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Finestra window;
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finestra window = new Finestra();
					window.visible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		Parser p = new Parser(args[0], args[1]);		
		p.conversion();
	}

}
