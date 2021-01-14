package mobillebuilder;

import java.util.*;


interface QualcommSeries {

	int series = 865;

	String GPU = "adreno 680";

	void addSnapdragon();

}

interface MediatekSeries {

	int mseries = 1000;

	String mGPU = "Mali-G77 MC9";

	void addDimensity();

}

  interface ExynosSeries {

	int series = 9611;

	String GPU = "Mali-G72";

	void addExynos();

}

   class Mobile {

	protected static final String Version = "Android 12";

	protected double IP;

	protected String brandName;

	protected String model;

	// Default Display Type

	protected int displayResolution = 1080;

	protected String displayType = "FULL HD LCD";

	protected String displayPanel = "60HZ";

	protected String displaySize = "6.2 Inch";

	static int checked;

	protected Mobile(String brandName, String model, double IP) {

		this.brandName = brandName;

		this.model = model;

		this.IP = IP;

		checked++;

	}

	public void showDetails() {

		System.out.println("Brand Name : " + brandName + "\nModel no : " + model + "\nAndroid Version : " + Version
				+ "\nIP : " + IP);

	}

	public void addDisplay() {

		System.out.println("Default Display Type :");

		System.out.println("Type : " + displayType + "\nResolution :" + displayResolution + "\nPanel : " + displayPanel
				+ "\nSize : " + displaySize);

	}

}



public class Maintenance {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char e = 'a';

		do {

			System.out.println("Welcome to Smartphones Checker & Builder ");

			System.out.println("enter your choice");

			System.out.println("1.Redmi\n2.Samsung\n3.Exit");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:

				Redmi mi = new Redmi("Redmi", "Note 9", 126.11111);

				System.out.println("Welcome to Redmi by Xiaomi");

				System.out.println("choose type of device 1. Default 2. Processor Edition");

				int choose = sc.nextInt();

				mi.showDetails();

				mi.addDisplay();

				if (choose == 1) {

					mi.mobileVariant(4, 64);

					mi.addDimensity();

				} else {

					mi.mobileVariant(6, 128, "Qualcomm");

					mi.addSnapdragon();

				}

				System.out.println("Want go for Pro Version of Mobile : 1. Yes 2. No ?");

				int answer = sc.nextInt();

				if (answer == 1) {

					System.out.println("choose type of device 1. Default 2. Processor Edition");

					choose = sc.nextInt();

					Redmi mipro = new Redmi("Redmi", "Note 9 pro", 126.11112);

					mipro.showDetails();

					mipro.addDisplay("Super AMOLED", 120);

					if (choose == 1) {

						mipro.mobileVariant(6, 128);

						mipro.addDimensity();

					} else {

						mipro.mobileVariant(6, 128, "Qualcomm");

						mipro.addSnapdragon();

					}

				}

				break;

			case 2:

				System.out.println("Welocme to Samsung Mobiles");

				Samsung sam = new Samsung("Samsung", "Galaxy Note 21", 198.1112222);

				sam.showDetails();

				sam.addDisplay();

				sam.mobileVariant(6, 128);

				sam.addExynos();

				break;

			case 3:

				System.out.println("Thank You ! for used our services ");

				System.out.println("You have Checked and Builded : " + Mobile.checked + " Mobiles");

				e = 'e';

				break;

			default:

				System.out.println("enter valid choice");

			}

		} while (e != 'e');

		sc.close();

	}

}
