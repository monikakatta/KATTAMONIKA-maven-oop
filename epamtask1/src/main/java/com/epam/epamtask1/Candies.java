package com.epam.epamtask1;
class Candies extends Chocolate implements Gifts{
	String str;
	Candies(float w,float co,int q){
		super(w,co,q);
		str="Candies";
	}
	public String getType() {
		return this.str;
	}
	public float getWeight() {
		return weight;
	}
}