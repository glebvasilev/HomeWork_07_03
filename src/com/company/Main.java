package com.company;

import java.util.Date;

class Form {
    public int number;
    public Date date;
    public String[] goods;
}

class Act extends Form {
    /*
     *  Class serves for acts
     */

    public int number;
    public Date date;
    public String[] goods = {"one","two"};
    static int count;

    public Act(int number, Date date, String[] goods) {
        this.number = number;
        this.date = date;
        this.goods = goods;
        count++;
    }

    public static int getCount(){
        return count;
    }
}

class Agreement extends Form {
    /*
     *  Class serves for agreements
     */

    public int number;
    public Date date;
    public String[] goods = {"one","two"};
    static int count;

    public Agreement(int number, Date date, String[] goods) {
        this.number = number;
        this.date = date;
        this.goods = goods;
        count++;
    }

    public static int getCount(){
        return count;
    }
}

class Converter {
    public static Form convert(Form o) {
        if (o instanceof Act) {
            return new Agreement(o.number, o.date, o.goods);
        } else {
            return new Act(o.number, o.date, o.goods);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Act a = new Act(1, date, args);
        System.out.println("Now we have " + Act.getCount() + " act");
        Agreement b = new Agreement(1, date, args);
        System.out.println("Now we have " + Agreement.getCount() + " agreement");
        System.out.println("Converted from Act to: " + Converter.convert(a).getClass().getName());
        System.out.println("Converted from Agreement to: " + Converter.convert(b).getClass().getName());
    }
}