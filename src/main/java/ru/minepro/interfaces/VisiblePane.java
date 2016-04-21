package ru.minepro.interfaces;

import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import jfxtras.labs.util.event.MouseControlUtil;
import ru.minepro.main.MineProControlUtil;

public abstract class VisiblePane extends Pane {

	public VisiblePane() {
		super();
		initVPL();
		MouseControlUtil.makeDraggable(this);

	}

	public abstract Process getPaneProcess();

	public void initVPL() {

		this.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				if (event.getCode() == KeyCode.DELETE) {
					MineProControlUtil.getmPController().removeProcess(VisiblePane.this);
				}
			}
		});

		this.addEventFilter(MouseEvent.MOUSE_RELEASED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent mouseEvent) {
				if (VisiblePane.this.getLayoutX() < 0) {
					VisiblePane.this.setLayoutX(50);
				}
				if (VisiblePane.this.getLayoutY() < 0) {
					VisiblePane.this.setLayoutY(50);
				}
				if (VisiblePane.this.getLayoutX() < 0 && VisiblePane.this.getLayoutY() < 0) {
					VisiblePane.this.setLayoutX(50);
					VisiblePane.this.setLayoutY(50);
				}
			}
		});

	}

} // class end
