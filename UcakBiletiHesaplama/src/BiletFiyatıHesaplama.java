import java.util.Scanner;

public class BiletFiyat�Hesaplama {

	public static void main(String[] args) {
		// Km birim fiyat�: 0.10$
		// 12 ya��ndan k���kse toplam fiyata %50 indirim
		// 12-24 ya� aras�ndaysa %10 indirim
		// 65 ya��ndan b�y�kse %30 indirim
		// Gidi�-D�n�� bileti sat�n al�n�rsa %20 indirim
		// Bu ko�ullara g�re u�ak bileti fiyat� hesaplayan program.

		Scanner scan = new Scanner(System.in);
		int km, yas, tip;
		System.out.print("Mesafeyi Giriniz: ");
		km = scan.nextInt();
		System.out.print("\nYa��n�z� Giriniz: ");
		yas = scan.nextInt();
		System.out.print("\nYolculuk Tipini Se�iniz (1=Tek Gidi�, 2=Gidi�-D�n��): ");
		tip = scan.nextInt();
		
		double normalFiyat, yas�ndirimi, tip�ndirimi;
		
		if (km > 0 && yas > 0 && (tip==1 || tip==2)) {
			normalFiyat = km * 0.10;
			if (yas < 12) {
				yas�ndirimi = normalFiyat * 0.5;
			}else if (yas >= 12 && yas <= 24) {
				yas�ndirimi = normalFiyat * 0.10;
			}else if (yas >= 65) {
				yas�ndirimi = normalFiyat * 0.30;
			}else {
				yas�ndirimi = 0;
			}
			normalFiyat -= yas�ndirimi;
			if (tip == 2) {
				tip�ndirimi = normalFiyat * 0.20;
				normalFiyat = (normalFiyat - tip�ndirimi) * 2;
			}
			System.out.println("\nBilet Tutar�: " + normalFiyat + "$");
		}else {
			System.out.println("Girdi�iniz de�erler eksik veya yanl��!");
		}

	}

}
