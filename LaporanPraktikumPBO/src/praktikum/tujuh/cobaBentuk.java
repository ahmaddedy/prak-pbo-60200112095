package praktikum.tujuh;

import praktikum.tujuh.bentuk.BujurSangkar;
import praktikum.tujuh.bentuk.bentuk;
import praktikum.tujuh.bentuk.segitigaSamaKaki;
import praktikum.tujuh.bentuk.segitigaSamaSisi;

public class cobaBentuk {
	public static void cetakBangun(bentuk b){
		System.out.println(b.hitungLuas());
		b.tulis();
		b.geser(5, 5);
	}
	public static void main(String[] args) {
		cetakBangun(new BujurSangkar());
		cetakBangun(new segitigaSamaKaki());
		cetakBangun(new segitigaSamaSisi());
	}
}
