package edu.stanford.rsl.tutorial.mskrecki;

import ij.ImageJ;
import edu.stanford.rsl.conrad.data.numeric.Grid2D;

public class MyPhantom extends Grid2D {

	public MyPhantom(int width, int height, double xSpacing, double ySpacing, double xOrigin, double yOrigin) {
		super(width, height);
		super.setOrigin(xOrigin, yOrigin);
		super.setSpacing(xSpacing, ySpacing);

		setRectangle(50, 50, 100, 200, 10);
	}
	
	private void setRectangle(int xPos, int yPos, int xSize, int ySize, int val) {
		for (int i = 0; i <= xSize; ++i) {
			setAtIndex(xPos+i, yPos, val);
			setAtIndex(xPos+i, yPos+ySize, val);	
		}
		
		for (int i = 0; i <= ySize; ++i) {
			setAtIndex(xPos, yPos+i, val);
			setAtIndex(xPos+xSize, yPos+i, val);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//new ImageJ();

		MyPhantom phantom = new MyPhantom(1000, 1000, 1.0, 1.0, 200.0, 100.0);
		phantom.show();
	}
}
