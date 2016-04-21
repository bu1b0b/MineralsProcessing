package ru.minepro.schemeunit;

import javafx.scene.shape.Line;
import ru.minepro.interfaces.VisiblePane;

public abstract class OneScreenPane extends VisiblePane {

	private ProcessNameLabel myLabel;
	private ConnectCircle inputCircle;
	private ConnectCircle outputCircle1;
	private ConnectCircle outputCircle2;

	private Line line1;
	private Line line2;
	private Line line3;
	private Line line4;
	private Line line5;
	private Line line6;

	public OneScreenPane(String procname) {
		super();

		myLabel = new ProcessNameLabel(procname);

		myLabel.setLayoutX(10);
		myLabel.setLayoutY(80);

		inputCircle = new ConnectCircle();
		outputCircle1 = new ConnectCircle();
		outputCircle2 = new ConnectCircle();

		outputCircle1.setProductNumb(1);
		outputCircle2.setProductNumb(2);

		inputCircle.setCenterX(5);
		inputCircle.setCenterY(5);

		outputCircle1.setCenterX(95);
		outputCircle1.setCenterY(45);

		outputCircle2.setCenterX(95);
		outputCircle2.setCenterY(60);

		inputCircle.setId("inputCircle");
		outputCircle1.setId("outputCircle");
		outputCircle2.setId("outputCircle");

		drawScreenLines();

		OneScreenPane.this.getChildren().addAll(myLabel, line1, line2, line3, line4, line5, line6, inputCircle, outputCircle1, outputCircle2);

	}

	private void drawScreenLines() {
		line1 = new Line();
		line1.setStartX(10);
		line1.setStartY(35);
		line1.setEndX(80);
		line1.setEndY(55);

		line2 = new Line();
		line2.setStartX(10);
		line2.setStartY(35);
		line2.setEndX(50);
		line2.setEndY(80);

		line3 = new Line();
		line3.setStartX(80);
		line3.setStartY(55);
		line3.setEndX(50);
		line3.setEndY(80);

		line4 = new Line();
		line4.setStartX(10);
		line4.setStartY(35);
		line4.setEndX(13);
		line4.setEndY(25);

		line5 = new Line();
		line5.setStartX(13);
		line5.setStartY(25);
		line5.setEndX(83);
		line5.setEndY(45);

		line6 = new Line();
		line6.setStartX(80);
		line6.setStartY(55);
		line6.setEndX(83);
		line6.setEndY(45);

		line1.setId("schemeLine");
		line2.setId("schemeLine");
		line3.setId("schemeLine");
		line4.setId("schemeLine");
		line5.setId("schemeLine");
		line6.setId("schemeLine");

	}

} // class end
