package praktikum.tujuh.interfaces.extend;

import praktikum.tujuh.interfaces.BentukKeliling;
import praktikum.tujuh.interfaces.BentukLuas;

public interface BentukInterface extends BentukLuas, BentukKeliling {
	public static final double PHI=3.14;
	public void tulis();
}
