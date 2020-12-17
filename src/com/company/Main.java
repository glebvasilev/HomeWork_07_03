package com.company;

class Act {
    /*
     *  Class serves for acts
     */

    protected int number;
    protected int date;
    protected String[] goods;
    static int count;

    public Act(int number, int date, String[] goods) {

        count++;
    }

    public void setNumber(int number) {

        this.number = number;
    }
    public void setDate(int date) {

        this.date = date;
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
    protected int date;
    protected String[] goods;
    static int count;

    public Agreement(int number, int date, String[] goods) {

        count++;
    }

    public void setNumber(int number) {

        this.number = number;
    }
    public void setDate(int date) {

        this.date = date;
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
        Act a = new Act(1,7,);
        System.out.println("Now we have " + Act.getCount() + " act");
        Agreement b = new Agreement(1,7,);
        System.out.println("Now we have " + Agreement.getCount() + " agreement");
    }
}