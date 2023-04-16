package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheesetotal=0;
    private int toppingtotal=0;
    private int awaytotal=0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){this.price=300; bill="Base Price Of The Pizza: 300"+"\n";}
        else{this.price=400; bill="Base Price Of The Pizza: 400"+"\n";}
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        this.cheesetotal+=80;
        this.price+=80;
        return;
    }

    public void addExtraToppings(){
        if(isVeg){this.price+=70;  this.toppingtotal+=70;}
        else{this.price+=120;  this.toppingtotal+=120;}
        return;
    }

    public void addTakeaway(){
        awaytotal+=20;
        this.price+=20;
        return;
    }

    public String getBill(){
        if(cheesetotal!=0){bill+="Extra Cheese Added: "+this.cheesetotal+"\n";}
        if(toppingtotal!=0){bill+="Extra Topping Added: "+this.toppingtotal+"\n";}
        if(awaytotal!=0){bill+="Paperbag Added: "+this.awaytotal+"\n";}
        bill+="Total Price: "+this.price;
        return this.bill;
    }
}
