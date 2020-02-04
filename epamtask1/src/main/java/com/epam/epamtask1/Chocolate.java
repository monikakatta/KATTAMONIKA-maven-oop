package com.epam.epamtask1;
abstract class Chocolate implements Gifts{
     float weight;
    int quantity;
    float cost;
    Chocolate(float w,float co,int q){
        weight=w;
        cost=co;
        quantity=q;
    }
}