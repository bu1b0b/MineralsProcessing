package ru.minepro.crushing;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import ru.minepro.interfaces.Process;
import ru.minepro.schemeunit.CrushShredPane;

public class CrushSchemePane extends CrushShredPane {

	private Crushing crushing;

	public CrushSchemePane() {
		super("Дробление");

		this.setId("schemeUnit");
		this.setFocusTraversable(true);

		initListeners();

	}

	public void initListeners() {

		this.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent mouseEvent) {
				requestFocus();
				System.out.println(crushing.getProcessName());
			}
		});

	}

	public Crushing getCrushing() {
		return crushing;
	}

	public void setCrushing(Crushing crushing) {
		this.crushing = crushing;
	}

	@Override
	public Process getPaneProcess() {
		return crushing;
	}

	//////////////////////////////////////

} // class end
