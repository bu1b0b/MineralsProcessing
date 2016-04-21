package ru.minepro.interfaces;

import java.util.ArrayList;

import ru.minepro.product.Product;

public interface Process {

	String getProcessName();

	void enrichOre();
	double getQh();

	void addInputProduct(Product product);
	ArrayList<Product> getInputProducts();
	void removeInputProduct(Product product);

	Product getOutputProduct();

	Product getOutputProduct(int productNumb);

} // class end
