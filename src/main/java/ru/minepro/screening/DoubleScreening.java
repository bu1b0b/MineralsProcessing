package ru.minepro.screening;

import java.util.ArrayList;

import ru.minepro.interfaces.ScreeningProcess;
import ru.minepro.product.Product;

public class DoubleScreening implements ScreeningProcess {

	// TODO реализовать грохочение на 2-х ситном грохоте

	private String processName = "Грох. 2-ситное";

	private double Qh;

	private double Scrush;
	private double Dmax;
	private double dmax;

	private ArrayList<Product> inputProducts;
	private Product outputProduct1;
	private Product outputProduct2;
	private Product outputProduct3;

	public DoubleScreening() {
		inputProducts = new ArrayList<Product>();
		outputProduct1 = new Product();
		outputProduct2 = new Product();
		outputProduct3 = new Product();

	}

	@Override
	public void enrichOre() {
		outputProduct1.clearProduct();
		outputProduct2.clearProduct();
		outputProduct3.clearProduct();

		Qh = 0;

		for (Product p : inputProducts) {
			Qh += p.getQh();
		}

		dmax = Dmax / Scrush;

		// outputProduct.setQh(Qh);
		// outputProduct.setDmax(dmax);

	}

	@Override
	public void addInputProduct(Product product) {
		if (!inputProducts.contains(product)) {
			inputProducts.add(product);
			enrichOre();
		}
	}

	@Override
	public ArrayList<Product> getInputProducts() {
		return inputProducts;
	}

	@Override
	public void removeInputProduct(Product product) {
		inputProducts.remove(product);
	}

	@Override
	public Product getOutputProduct() {
		return null;
	}

	@Override
	public Product getOutputProduct(int productNumb) {
		enrichOre();
		Product out = null;
		if (productNumb == 1) {
			out = outputProduct1;
		}
		if (productNumb == 2) {
			out = outputProduct2;
		}
		if (productNumb == 3) {
			out = outputProduct3;
		}
		return out;

	}

	///// Impl Process

	@Override
	public double getQh() {
		return Qh;
	}

	@Override
	public String getProcessName() {
		return processName;
	}

} // class end
