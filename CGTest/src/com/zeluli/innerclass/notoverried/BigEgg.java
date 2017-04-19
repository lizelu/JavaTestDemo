package com.zeluli.innerclass.notoverried;

public class BigEgg extends Egg {
	public class Yolk {
		public Yolk() {
			System.out.println("BigEgg.Yolk");
		}
	}
	
	public BigEgg() {
		new Yolk();
	}
}
