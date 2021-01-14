package mobillebuilder;

public class Samsung extends Mobile implements ExynosSeries {

	public Samsung(String brandName, String model, double IP) {

		super(brandName, model, IP);

	}

	// override

	public void addDisplay() {

		displayPanel = "120HZ";

		displaySize = "6.7 Inch";

		displayType = "Super AMOLED";

		System.out.println("Type : " + displayType + "\nResolution :" + displayResolution + "\nPanel : " + displayPanel
				+ "\nSize : " + displaySize);

	}

	public void mobileVariant(int ram, int rom) {

		int camera = 108;

		int battery = 7000;

		System.out.println("Ram : " + ram + "GB" + "\nRom : " + rom + "GB" + "\nCamera : " + camera + "mp"
				+ "\nBattery Capacity : " + battery + " MAH");

		System.out.println();

	}

	public void addExynos() {

		double clockSpeed = 2.4;

		System.out.println("Samsung Exynos series");

		System.out.println("Series : " + series + "\nGPU : " + GPU + "\nClock Speed : " + clockSpeed + "GHz");

		System.out.println();

	}

}
