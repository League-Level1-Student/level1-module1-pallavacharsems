package _05_vault;

public class VaultRunner {
public static void main(String[] args) {
	Vault jamesVault = new Vault(10456);
    JamesBond j = new JamesBond();
    int findC = j.findCode(jamesVault);
    System.out.println(findC);
    
}

}


