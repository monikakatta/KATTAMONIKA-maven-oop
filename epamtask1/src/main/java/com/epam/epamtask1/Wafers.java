package com.epam.epamtask1;
class Wafers extends Chocolate implements Gifts{
	String str;
	Wafers(float w,float co,int q){
		super(w,co,q);
		str="Wafers";
	}
	public String getType() {
		return this.str;
	}
	public float getWeight() {
		return weight;
	}
}