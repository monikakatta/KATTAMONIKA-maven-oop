package com.epam.epamtask1;
class Marshmello extends Chocolate implements Gifts{
	String str;
	Marshmello(float w,float co,int q){
		super(w,co,q);
		str="Marshmello";
	}
	public String getType() {
		return this.str;
	}
	public float getWeight() {
		return weight;
	}
}