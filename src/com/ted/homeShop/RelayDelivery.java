package com.ted.homeShop;

public class RelayDelivery implements Delivery {

    private int number;

    public RelayDelivery(int number) {
        this.number = number;
    }


    @Override
    public double getPrice() {
        if(number > 0 && number < 23){
            return 0;
        }
        else if( number > 22 && number < 48) {
            return 2.99;
        } else {
            return 4.99;
        }
    }
}
