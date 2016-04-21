package ru.minepro.main;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import ru.minepro.crushing.CrushSchemePane;
import ru.minepro.crushing.Crushing;
import ru.minepro.interfaces.Process;
import ru.minepro.interfaces.VisiblePane;
import ru.minepro.orwarehouse.FirstWarehouseSchemePane;
import ru.minepro.product.Product;
import ru.minepro.screening.DobleScreenSchemePane;
import ru.minepro.screening.DoubleScreening;
import ru.minepro.screening.OneScreenSchemePane;
import ru.minepro.screening.OneScreening;
import ru.minepro.shredding.ShreddSchemePane;
import ru.minepro.shredding.Shredding;

public class MPController implements Initializable {

	@FXML
	private BorderPane rootBorderPane;
	@FXML
	private ScrollPane mainScrollPane;
	@FXML
	private Button addCrushButton;
	@FXML
	private Button addShreddButton;

	private MineProMainPane mainMineProPane;

	private ArrayList<Process> processes;

	Product product = new Product();

	/////////////////////////////

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		processes = new ArrayList<Process>();

		mainScrollPane.setHvalue(0);
		mainScrollPane.setVvalue(0);

		mainMineProPane = new MineProMainPane();
		mainScrollPane.setContent(mainMineProPane);

		MineProControlUtil.setmPController(this);

		product.setQh(2850);

		FirstWarehouseSchemePane firstWarehouseSchemePane = new FirstWarehouseSchemePane();
		// Crushing crush = new Crushing();
		// crush.addInputProduct(product);
		//
		// crush.enrichOre();

		// crushSchemePane.setCrushing(crush);
		// processes.add(crush);

		mainMineProPane.getChildren().add(firstWarehouseSchemePane);
		initNodePosition(firstWarehouseSchemePane);

	}

	public void addCrush() {
		product.setQh(2850);

		CrushSchemePane crushSchemePane = new CrushSchemePane();
		Crushing crush = new Crushing();
		crush.addInputProduct(product);

		crush.enrichOre();

		crushSchemePane.setCrushing(crush);
		processes.add(crush);

		mainMineProPane.getChildren().add(crushSchemePane);
		initNodePosition(crushSchemePane);

	}

	public void addShredd() {
		product.setQh(2850);

		ShreddSchemePane shreddSchemePane = new ShreddSchemePane();
		Shredding shredd = new Shredding();
		shredd.addInputProduct(product);

		shredd.enrichOre();

		shreddSchemePane.setShredding(shredd);
		processes.add(shredd);

		mainMineProPane.getChildren().add(shreddSchemePane);
		initNodePosition(shreddSchemePane);

	}

	public void addOneScreen() {
		product.setQh(2850);

		OneScreenSchemePane oneScreenSchemePane = new OneScreenSchemePane();
		OneScreening oneScreening = new OneScreening();
		oneScreening.addInputProduct(product);

		oneScreening.enrichOre();

		oneScreenSchemePane.setOneScreening(oneScreening);
		processes.add(oneScreening);

		mainMineProPane.getChildren().add(oneScreenSchemePane);
		initNodePosition(oneScreenSchemePane);

	}

	public void addDoubleScreen() {
		// try {
		product.setQh(2850);

		DobleScreenSchemePane dobleScreenSchemePane = new DobleScreenSchemePane();
		DoubleScreening doubleScreening = new DoubleScreening();
		doubleScreening.addInputProduct(product);

		doubleScreening.enrichOre();

		dobleScreenSchemePane.setDoubleScreening(doubleScreening);
		processes.add(doubleScreening);

		mainMineProPane.getChildren().add(dobleScreenSchemePane);
		initNodePosition(dobleScreenSchemePane);
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
	}

	//////////////////////////////////////

	private void initNodePosition(Node node) {
		if (mainScrollPane.getVvalue() < 0.2) {
			node.setLayoutY(mainMineProPane.getHeight() * mainScrollPane.getVvalue() + 10);
		} else if (mainScrollPane.getVvalue() > 0.8) {
			node.setLayoutY(mainMineProPane.getHeight() * mainScrollPane.getVvalue() - 110);
		} else {
			node.setLayoutY(mainMineProPane.getHeight() * mainScrollPane.getVvalue() - 50);
		}
		if (mainScrollPane.getHvalue() < 0.2) {
			node.setLayoutX(mainMineProPane.getWidth() * mainScrollPane.getHvalue() + 10);
		} else if (mainScrollPane.getHvalue() > 0.8) {
			node.setLayoutX(mainMineProPane.getWidth() * mainScrollPane.getHvalue() - 130);
		} else {
			node.setLayoutX(mainMineProPane.getWidth() * mainScrollPane.getHvalue() - 60);
		}
	}

	public void removeProcess(VisiblePane pane) {
		mainMineProPane.getChildren().remove(pane);
		processes.remove(pane.getPaneProcess());
		System.out.println(processes.size());
	}

} // class end
