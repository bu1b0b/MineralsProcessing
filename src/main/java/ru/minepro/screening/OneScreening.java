package ru.minepro.screening;

import java.util.ArrayList;

import ru.minepro.interfaces.ScreeningProcess;
import ru.minepro.product.Product;

public class OneScreening implements ScreeningProcess {

	// TODO доработать процесс грохочения на 1 ситном грохоте

	private String processName = "Грох. 1-ситное";
	private byte crushStage;

	private double Qh;

	private double Scrush;
	private double Dmax;
	private double dmax;

	private ArrayList<Product> inputProducts;
	private Product outputProduct;

	public OneScreening() {
		inputProducts = new ArrayList<Product>();
		outputProduct = new Product();
	}

	@Override
	public void enrichOre() {
		outputProduct.clearProduct();

		Qh = 0;

		for (Product p : inputProducts) {
			Qh += p.getQh();
		}

		dmax = Dmax / Scrush;

		outputProduct.setQh(Qh);
		outputProduct.setDmax(dmax);

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
		enrichOre();
		return outputProduct;
	}

	@Override
	public Product getOutputProduct(int productNumb) {
		// TODO Auto-generated method stub
		return null;
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
