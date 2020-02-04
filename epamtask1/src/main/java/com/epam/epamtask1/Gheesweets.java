package com.epam.epamtask1;
class Gheesweets extends Sweets implements Gifts{
	String str;
	Gheesweets(float w, float co, int q) {
		super(w, co, q);
		str="gheesweets";
	}
	
	public String getType() {
		return this.str;
	}
	public float getWeight() {
		return weight;
	}
}