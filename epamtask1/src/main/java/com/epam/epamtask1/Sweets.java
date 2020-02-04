package com.epam.epamtask1;
 abstract class Sweets{
     String Category;
     float weight;
    int quantity;
    float cost;
    Sweets(float w,float co,int q){
        weight=w;
        cost=co;
        quantity=q;
    }
    abstract String getType();
    abstract float getWeight();
    
}