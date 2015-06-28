package praktikum.enam.utama;
import praktikum.enam.Rangka;
public class Mobil {
	private Rangka Rangka;
	private praktikum.enam.Mesin Mesin;
	
	public Mobil(){
		Rangka = new Rangka();
		Mesin = new praktikum.enam.Mesin();
		
	}
	public static void main(String[] args) {
		new Mobil();
	}
}
