package com.epam.epamtask1;
class Barfis extends Sweets implements Gifts{
	String str;
	Barfis(float w, float co, int q) {
		super(w, co, q);
		str="Barfis";
	}
	
	public String getType() {
		return this.str;
	}
	public float getWeight() {
		return weight;
	}
}