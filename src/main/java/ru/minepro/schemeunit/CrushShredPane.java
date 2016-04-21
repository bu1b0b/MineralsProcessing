package ru.minepro.schemeunit;

import javafx.scene.shape.Circle;
import ru.minepro.interfaces.VisiblePane;

public abstract class CrushShredPane extends VisiblePane {

	private ProcessNameLabel myLabel;
	private DestroyCircle myCircle;
	private ConnectCircle inputCircle;
	private ConnectCircle outputCircle;

	public CrushShredPane(String procname) {
		super();

		myCircle = new DestroyCircle();
		myLabel = new ProcessNameLabel(procname);

		myLabel.setLayoutX(10);
		myLabel.setLayoutY(40);

		inputCircle = new ConnectCircle();
		outputCircle = new ConnectCircle();
		outputCircle.setProductNumb(1);

		inputCircle.setId("inputCircle");
		outputCircle.setId("outputCircle");

		inputCircle.setCenterX(50);
		inputCircle.setCenterY(5);

		outputCircle.setCenterX(50);
		outputCircle.setCenterY(95);

		CrushShredPane.this.getChildren().addAll(myCircle, myLabel, inputCircle, outputCircle);

	}

	//////////////////////////////////////

	class DestroyCircle extends Circle {

		public DestroyCircle() {
			super();
			this.setId("destroyCircle");
			this.setRadius(45);
			this.setCenterX(50);
			this.setCenterY(50);

		}

	} // DestroyCircle end

} // class end
