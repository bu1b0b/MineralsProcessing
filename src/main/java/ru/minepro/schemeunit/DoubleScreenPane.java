package ru.minepro.schemeunit;

import javafx.scene.shape.Line;

public abstract class DoubleScreenPane extends OneScreenPane {

	private ConnectCircle outputCircle1;
	private ConnectCircle outputCircle2;
	private ConnectCircle outputCircle3;

	private Line line7;
	private Line line8;
	private Line line9;

	public DoubleScreenPane(String procname) {
		super(procname);

		// outputCircle1.setProductNumb(1);
		// outputCircle2.setProductNumb(2);
		// outputCircle3.setProductNumb(3);

		outputCircle3 = new ConnectCircle();

		outputCircle3.setProductNumb(3);

		outputCircle3.setCenterX(95);
		outputCircle3.setCenterY(30);

		outputCircle3.setId("outputCircle");

		drawScreenLines();

		DoubleScreenPane.this.getChildren().addAll(line7, line8, line9, outputCircle3);
	}

	private void drawScreenLines() {
		line7 = new Line();
		line7.setStartX(16);
		line7.setStartY(15);
		line7.setEndX(10);
		line7.setEndY(35);

		line8 = new Line();
		line8.setStartX(16);
		line8.setStartY(15);
		line8.setEndX(86);
		line8.setEndY(35);

		line9 = new Line();
		line9.setStartX(86);
		line9.setStartY(35);
		line9.setEndX(83);
		line9.setEndY(45);

		line7.setId("schemeLine");
		line8.setId("schemeLine");
		line9.setId("schemeLine");

	}

} // class end
