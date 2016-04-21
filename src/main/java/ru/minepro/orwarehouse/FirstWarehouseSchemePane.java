package ru.minepro.orwarehouse;

import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import ru.minepro.interfaces.Process;
import ru.minepro.schemeunit.OreWarehousePane;

public class FirstWarehouseSchemePane extends OreWarehousePane {

	public FirstWarehouseSchemePane() {
		super("Склад исх. руды");

		this.setId("schemeUnit");
		this.setFocusTraversable(true);

		initListeners();

	}

	public void initListeners() {

		this.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				if (event.getCode() == KeyCode.DELETE) {
					// MineProControlUtil.getmPController().removeProcess(VisiblePane.this);
				}
			}
		});

		this.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent mouseEvent) {
				requestFocus();
				System.out.println("Склад руды");
				// System.out.println(oneScreening.getProcessName());

			}
		});
	}

	@Override
	public Process getPaneProcess() {
		// TODO add warehouse process
		return null;
	}

} // class end
