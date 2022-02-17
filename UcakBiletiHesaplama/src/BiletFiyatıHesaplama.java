import java.util.Scanner;

public class BiletFiyatıHesaplama {

	public static void main(String[] args) {
		// Km birim fiyatı: 0.10$
		// 12 yaşından küçükse toplam fiyata %50 indirim
		// 12-24 yaş arasındaysa %10 indirim
		// 65 yaşından büyükse %30 indirim
		// Gidiş-Dönüş bileti satın alınırsa %20 indirim
		// Bu koşullara göre uçak bileti fiyatı hesaplayan program.

		Scanner scan = new Scanner(System.in);
		int km, yas, tip;
		System.out.print("Mesafeyi Giriniz: ");
		km = scan.nextInt();
		System.out.print("\nYaşınızı Giriniz: ");
		yas = scan.nextInt();
		System.out.print("\nYolculuk Tipini Seçiniz (1=Tek Gidiş, 2=Gidiş-Dönüş): ");
		tip = scan.nextInt();
		
		double normalFiyat, yasİndirimi, tipİndirimi;
		
		if (km > 0 && yas > 0 && (tip==1 || tip==2)) {
			normalFiyat = km * 0.10;
			if (yas < 12) {
				yasİndirimi = normalFiyat * 0.5;
			}else if (yas >= 12 && yas <= 24) {
				yasİndirimi = normalFiyat * 0.10;
			}else if (yas >= 65) {
				yasİndirimi = normalFiyat * 0.30;
			}else {
				yasİndirimi = 0;
			}
			normalFiyat -= yasİndirimi;
			if (tip == 2) {
				tipİndirimi = normalFiyat * 0.20;
				normalFiyat = (normalFiyat - tipİndirimi) * 2;
			}
			System.out.println("\nBilet Tutarı: " + normalFiyat + "$");
		}else {
			System.out.println("Girdiğiniz değerler eksik veya yanlış!");
		}

	}

}
