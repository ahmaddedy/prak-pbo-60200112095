package praktikum.tujuh.interfaces;

import praktikum.tujuh.interfaces.extend.BentukInterface;

public class Lingkaran implements BentukKeliling, BentukLuas, BentukInterface {
	private double jariJari;
	public Lingkaran(double jariJari){
		this.jariJari=jariJari;
	}
	public double hitungKeliling(){
		return 2*BentukKeliling.PHI*jariJari;
	}
	public double hitungLuas(){
		return BentukLuas.PHI*Math.pow(jariJari, 2);
	}
}
