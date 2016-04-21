package ru.minepro.screening;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import ru.minepro.interfaces.Process;
import ru.minepro.schemeunit.OneScreenPane;

public class OneScreenSchemePane extends OneScreenPane {

	// TODO изменить ID каждого класса??

	private OneScreening oneScreening;

	public OneScreenSchemePane() {
		super("Грох. 1-ситное");

		this.setId("schemeUnit");
		this.setFocusTraversable(true);

		initListeners();

	}

	public void initListeners() {

		this.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent mouseEvent) {
				requestFocus();
				System.out.println(oneScreening.getProcessName());

			}
		});
	}

	public OneScreening getOneScreening() {
		return oneScreening;
	}

	public void setOneScreening(OneScreening oneScreening) {
		this.oneScreening = oneScreening;
	}

	@Override
	public Process getPaneProcess() {
		return oneScreening;
	}

} // class end
