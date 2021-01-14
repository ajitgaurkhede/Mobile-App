package mobillebuilder;

public class Redmi extends Mobile implements QualcommSeries, MediatekSeries {

	Redmi(String brandName, String model, double IP) {
		super(brandName, model, IP);

	}

	// override

	public void addDisplay() {

		displayPanel = "90HZ";

		displaySize = "6.5 Inch";

		System.out.println("Type : " + displayType + "\nResolution :" + displayResolution + "\nPanel : " + displayPanel
				+ "\nSize : " + displaySize);

	}

	public void mobileVariant(int ram, int rom) {

		int camera = 48;

		int battery = 4500;

		System.out.println("Ram : " + ram + "GB" + "\nRom : " + rom + "GB" + "\nCamera : " + camera + "mp"
				+ "\nBattery Capacity : " + battery + " MAH");

		System.out.println();

	}

	// pro version

	// overloading

	public void addDisplay(String type, int panel) {

		System.out.println("Type : " + type + "\nResolution :" + displayResolution + "\nPanel : " + panel + "HZ"
				+ "\nSize : " + displaySize);

		System.out.println();

	}

	// overloading

	public void mobileVariant(int ram, int rom, String processorEdition) {

		int camera = 64;

		int battery = 5000;

		System.out.println("Processor : " + processorEdition + " Edition");

		System.out.println("Ram : " + ram + "GB" + "\nRom : " + rom + "GB" + "\nCamera : " + camera + "mp"
				+ "\nBattery Capacity : " + battery + " MAH");

		System.out.println();

	}

	public void addSnapdragon() {

		System.out.println("Snapdragon 8 Series");

		double clockSpeed = 2.5;

		System.out.println("Series : " + series + "\nGPU : " + GPU + "\nClock Speed : " + clockSpeed + "GHz");

	}

	public void addDimensity() {

		double clockSpeed = 2.6;

		System.out.println("Dimensity series");

		System.out.println("Series : " + mseries + "\nGPU : " + mGPU + "\nClock Speed : " + clockSpeed + "GHz");

		System.out.println();

	}

}
