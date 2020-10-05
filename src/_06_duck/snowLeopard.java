package _06_duck;

public class snowLeopard {
    String favoriteFood;
	int numberOfFriends;
	
	snowLeopard(String favoriteFood, int numberOfFriends){
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
	}
	void roar() {
		System.out.println("Snow Leopards roar!");
	}
	void run() {
		System.out.println("Snow Leopards run!");
	}
}
