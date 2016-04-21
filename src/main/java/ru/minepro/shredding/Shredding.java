package ru.minepro.shredding;

import java.util.ArrayList;

import ru.minepro.interfaces.ShreddingProcess;
import ru.minepro.product.Product;

public class Shredding implements ShreddingProcess {

	private String processName = "Измельчение";
	private byte crushStage;

	private double Qh;

	private double Scrush;
	private double Dmax;
	private double dmax;

	private ArrayList<Product> inputProducts;
	private Product outputProduct;

	public Shredding() {
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
		return null;
	}

	///// CrushingProcess

	@Override
	public void setDmax(double Dmax) {
		this.Dmax = Dmax;
	}

	@Override
	public double getDmax() {
		return Dmax;
	}

	@Override
	public void setdmax(double dmax) {
		this.dmax = dmax;
	}

	@Override
	public double getdmax() {
		return dmax;
	}

	@Override
	public double getQh() {
		return Qh;
	}

	@Override
	public String getProcessName() {
		return processName;
	}

	///// CrushingProcess

} // class end
