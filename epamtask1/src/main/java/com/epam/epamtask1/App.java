package com.epam.epamtask1;

import java.util.*;

class App{
    public static void main(String[] args){
    	List<Gifts> gifts=new ArrayList<>();
    	Candies c1=new Candies(1.20F,20.5F,2);
        Candies c2=new Candies(1.23F,2.00F,10);
        Gheesweets g1=new Gheesweets(4.00F,3.21F,4); 
        Gheesweets g2=new  Gheesweets (3.21F,1.23F,2);
        Barfis m1=new Barfis(20.00F,3.21F,6);
        Barfis m2=new Barfis(30.21F,2.31F,4);
        Wafers w1=new Wafers(30.00F,30.00F,1);
        Wafers w2=new Wafers(4.23F,45.00F,3);
        Candies c5=new Candies(0.23F,0.50F,20);
        Marshmello b1=new Marshmello(13.21F,16.43F,13);
        Marshmello b2=new Marshmello(6.43F,72.32F,5);
        Candies c3=new Candies(1.71F,3.00F,12);
        Candies c4=new Candies(2.63F,12.00F,5);
        gifts.add(c1);
        gifts.add(c2);
        gifts.add(w1);
        gifts.add(w2);
        gifts.add(m1);
        gifts.add(m2);
        gifts.add(g1);
        gifts.add(g2);
        gifts.add(c3);
        gifts.add(c4);
        gifts.add(b1);
        gifts.add(b2);
        gifts.add(c5);
    List<Chocolate> chocolates=new ArrayList<Chocolate>();
    for(int i=0;i<gifts.size();i++) {
    	if(gifts.get(i) instanceof Chocolate) {
    		Chocolate c=(Chocolate)gifts.get(i);
    		chocolates.add(c);
    		
    	}
    }
    
    Collections.sort(chocolates,new Comparator<Chocolate>(){ 
            public int compare(Chocolate g1,Chocolate g2) 
            { 
                return (int)g1.getWeight()-(int)g2.getWeight(); 
            } 
        });
      System.out.println("After sorting the  weights of chocolates:");
      float totalgiftsweight=0.0F;
        for(int i=0;i<chocolates.size();i++){
            System.out.println(chocolates.get(i).getType()+" "+chocolates.get(i).getWeight()+" "+chocolates.get(i).quantity);
            totalgiftsweight+=chocolates.get(i).weight;
        }
        System.out.println("totalweight of chocolates:"+totalgiftsweight);
        int count1=0,count2=0;
        for(int i=0;i<chocolates.size();i++) {
        	if(chocolates.get(i) instanceof Candies) {
        		if(chocolates.get(i).weight<=1.5) {
        			count1++;
        		}
        		else {
        			count2++;
        		}
        	}
        }
        System.out.println("candies whose weights lessthan 1.6 : "+count1);
        System.out.println("candies whose weights greaterthan 1.5 : "+count2);
        
    }
}

    
