package com.RahulShetty.Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendardemo {
    public static void main(String[] args) {

        Calendar cal =Calendar.getInstance();

        SimpleDateFormat sd = new SimpleDateFormat("d/M/YYYY hh:mm");

        System.out.println(sd.format(cal.getTime()));

        System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.get(Calendar.MINUTE));
        }
    }

