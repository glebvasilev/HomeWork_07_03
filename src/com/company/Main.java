package com.company;

import java.util.Date;

class Act {
    /*
     *  Class serves for acts
     */

    protected int number;
    protected Date Date;
    protected String[] goods = {"one","two"};
    static int count;

    public Act(int number, Date Date, String[] goods) {
        this.number = number;
        this.Date = Date;
        this.goods = goods;
        count++;
    }

    public void setNumber(int number) {

        this.number = number;
    }
    public void setDate(Date date) {

        this.Date = Date;
    }
    public void setGoods(String[] goods) {

        this.goods = goods;
    }
    public static int getCount(){

        return count;
    }
}
class Agreement {
    /*
     *  Class serves for agreements
     */

    protected int number;
    protected Date Date;
    protected String[] goods = {"one","two"};
    static int count;

    public Agreement(int number, Date Date, String[] goods) {
        this.number = number;
        this.Date = Date;
        this.goods = goods;
        count++;
    }

    public void setNumber(int number) {

        this.number = number;
    }
    public void setDate(Date date) {

        this.Date = Date;
    }
    public void setGoods(String[] goods) {

        this.goods = goods;
    }
    public static int getCount(){

        return count;
    }
}

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        Act a = new Act(1, date, args);
        System.out.println("Now we have " + Act.getCount() + " act");
        Agreement b = new Agreement(1, date, args);
        System.out.println("Now we have " + Agreement.getCount() + " agreement");
    }
}