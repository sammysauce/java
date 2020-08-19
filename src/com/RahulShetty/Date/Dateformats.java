package com.RahulShetty.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateformats {
    public static void main(String[] args) {

        Date d = new Date ();
        SimpleDateFormat sdf = new SimpleDateFormat("d/M/YYYY");
        SimpleDateFormat sd = new SimpleDateFormat("d/M/YYYY hh:mm");

        System.out.println(sdf.format(d));
        System.out.println(sd.format(d));
            System.out.println(d.toString());
        }
    }

