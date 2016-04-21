package ru.minepro.main;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class MineProMainPane extends Pane {

	public MineProMainPane() {
		super();
		this.setId("mineProMainPane");
		this.setFocusTraversable(true);

		initListeners(this);
	}

	private void initListeners(Pane personMainPane) {

		personMainPane.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent mouseEvent) {
				if (mouseEvent.getPickResult().getIntersectedNode().getClass().equals(personMainPane.getClass())) {
					// PaneControlUtil.getAncientTreePaneController().clearTargetPerson();
				}
			}
		});

	}

} // class end
