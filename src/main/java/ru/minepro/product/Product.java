package ru.minepro.product;

import ru.minepro.interfaces.Ore;

public class Product implements Ore {

	// TODO дорарботать продукт и исх руду

	private double Qh;
	private double dmax;

	public Product() {

	}

	public double getQh() {
		return Qh;
	}

	public void setQh(double qh) {
		Qh = qh;
	}

	public double getDmax() {
		return dmax;
	}

	public void setDmax(double dmax) {
		this.dmax = dmax;
	}

	public void clearProduct() {
		Qh = 0;
		dmax = 0;
	}

	@Override
	public void getOre() {
		//

	}

	@Override
	public void setOre() {
		//

	}

} // class end
