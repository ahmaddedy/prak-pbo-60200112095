package praktikum5;

public class Orang {
	public static void main(String[] args) {
		Orang objekOrang = new Orang();
		Hewan objekHewan = null;
		if (objekOrang instanceof Orang){
			System.out.println("objekOrang adalah instan dari kelas " +"Orang");
		}
		if (objekHewan ==null){
			System.out.println("objekHewan belum diinisalisasi");
		}
	}
}
