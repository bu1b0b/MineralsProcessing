package ru.minepro.schemeunit;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import jfxtras.labs.util.event.MouseControlUtil;
import ru.minepro.product.Product;

public class ConnectCircle extends Circle {

	private int productNumb;

	Product product;

	public ConnectCircle() {
		super();
		this.setRadius(5);

		initListeners();

	}

	private void initListeners() {

		this.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent mouseEvent) {
				ConnectCircle.this.getParent().setOnMouseDragged(null);
			}
		});

		this.addEventFilter(MouseEvent.MOUSE_RELEASED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent mouseEvent) {
				ConnectCircle.this.getParent().setOnMouseDragged(null);
				MouseControlUtil.makeDraggable(ConnectCircle.this.getParent());
			}
		});

	}

	public int getProductNumb() {
		return productNumb;
	}

	public void setProductNumb(int productNumb) {
		this.productNumb = productNumb;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

} // ConnectCircle end
