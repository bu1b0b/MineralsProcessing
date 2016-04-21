package ru.minepro.main;

public abstract class MineProControlUtil {

	private static MPController mPController;

	public static MPController getmPController() {
		return mPController;
	}

	public static void setmPController(MPController mPController) {
		MineProControlUtil.mPController = mPController;
	}

} // class end
