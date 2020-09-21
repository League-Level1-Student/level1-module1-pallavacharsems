package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	Popcorn ice = new Popcorn("Caramel");
	Microwave heat = new Microwave();
	heat.putInMicrowave(ice);
	heat.setTime(3);
	heat.startMicrowave();		
	
}
}
