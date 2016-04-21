package ru.minepro.schemeunit;

import javafx.scene.shape.Line;
import ru.minepro.interfaces.VisiblePane;

public abstract class OreWarehousePane extends VisiblePane {

	private ProcessNameLabel myLabel;
	private ConnectCircle outputCircle;

	private Line line1;
	private Line line2;
	private Line line3;

	public OreWarehousePane(String procname) {
		super();

		myLabel = new ProcessNameLabel(procname);

		myLabel.setLayoutX(6);
		myLabel.setLayoutY(6);

		outputCircle = new ConnectCircle();

		outputCircle.setProductNumb(1);

		outputCircle.setCenterX(50);
		outputCircle.setCenterY(95);

		outputCircle.setId("outputCircle");

		drawScreenLines();

		OreWarehousePane.this.getChildren().addAll(myLabel, line1, line2, line3, outputCircle);

	}

	private void drawScreenLines() {
		line1 = new Line();
		line1.setStartX(50);
		line1.setStartY(25);
		line1.setEndX(80);
		line1.setEndY(85);

		line2 = new Line();
		line2.setStartX(80);
		line2.setStartY(85);
		line2.setEndX(20);
		line2.setEndY(85);

		line3 = new Line();
		line3.setStartX(20);
		line3.setStartY(85);
		line3.setEndX(50);
		line3.setEndY(25);

		line1.setId("schemeLine");
		line2.setId("schemeLine");
		line3.setId("schemeLine");

	}

} // class end
