package ru.minepro.interfaces;

public interface CrushingProcess extends Process {

	void setCrushStage(byte crushStage);
	byte getCrushStage();

	void setDmax(double Dmax);
	double getDmax();

	void setdmax(double dmax);
	double getdmax();

	void setScrush(double Scrush);
	double getScrush();

} // class end
