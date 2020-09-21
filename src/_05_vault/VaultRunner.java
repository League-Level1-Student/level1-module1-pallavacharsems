package _05_vault;

public class VaultRunner {
public static void main(String[] args) {
	Vault jamesVault = new Vault();
	boolean x = jamesVault.tryCode(9);
	System.out.println(x);
}
}
