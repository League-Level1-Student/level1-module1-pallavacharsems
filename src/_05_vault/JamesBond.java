package _05_vault;

public class JamesBond {

	int findCode(Vault ice) {
		for (int i = 0; i < 1000000; i++) {
			boolean x = ice.tryCode(i);
			if (x == true) {
				return i;

			}

			}
	return -1;	
	}
	}
