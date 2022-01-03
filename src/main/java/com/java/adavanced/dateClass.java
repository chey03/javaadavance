package com.java.adavanced;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dateClass {

    public static void main(String[] args) {

        Date testdata = new Date();
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf.format(testdata));
        System.out.println(sdf.format(cal.getTime()));

        System.out.println(cal.getFirstDayOfWeek());

        System.out.println(cal.get(Calendar.DAY_OF_MONTH));

        System.out.printf(testdata.toString());
    }

}
