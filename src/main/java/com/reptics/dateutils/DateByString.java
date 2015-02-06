package com.reptics.dateutils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;

public class DateByString {

    private static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private static Logger logger = Logger.getLogger(DateByString.class);
    
    // This will return today if error
    
    public static Date getStartDate(String dateChoice) {
        return getStartDate(dateChoice, null);
    }
    
    // This will return today if error
    public static Date getEndDate(String dateChoice) {
        return getEndDate(dateChoice, null);
    }

    public static Date getStartDate(String dateChoice, Date inDate) {
        Date today = new Date();
        Calendar cal = Calendar.getInstance();
        
        logger.debug("getStartDate: date choice: " + dateChoice +" date: " +inDate);

        if ("Today".equals(dateChoice)) {
            return today;
        } else if ("Yesterday".equals(dateChoice)) {
            cal.setTime(today);
            cal.add(Calendar.DATE, -1);
            return cal.getTime();
        } else if ("Last 7 Days".equals(dateChoice)) {
            cal.setTime(today);
            cal.add(Calendar.DATE, -7);
            return cal.getTime();
        } else if ("Last 30 Days".equals(dateChoice)) {
            cal.setTime(today);
            cal.add(Calendar.DATE, -30);
            return cal.getTime();
        } else if ("Last 90 Days".equals(dateChoice)) {
            cal.setTime(today);
            cal.add(Calendar.DATE, -90);
            return cal.getTime();
        } else if ("Week to Date".equals(dateChoice)) {
            cal.setTime(today);
            cal.set(Calendar.DAY_OF_WEEK, 1);
            return cal.getTime();
        } else if ("Previous Week".equals(dateChoice)) {
            cal.setTime(today);
            cal.set(Calendar.DAY_OF_WEEK, 1);
            cal.add(Calendar.DAY_OF_WEEK, -1);
            cal.set(Calendar.DAY_OF_WEEK, 1);
            return cal.getTime();
        } else if ("Month to Date".equals(dateChoice)) {
            cal.setTime(today);
            cal.set(Calendar.DAY_OF_MONTH, 1);
            return cal.getTime();
        } else if ("Previous Month".equals(dateChoice)) {
            cal.setTime(today);
            cal.add(Calendar.MONTH, -1);
            cal.set(Calendar.DAY_OF_MONTH, 1);
            return cal.getTime();
        } else if ("Quarter to Date".equals(dateChoice)) {
            cal.setTime(today);
            int month = cal.get(Calendar.MONTH); /* 0 through 11 */
            int quarter = (month / 3);
            System.out.println("Month: " +month +" quarter:" +quarter);
            cal.set(Calendar.MONTH, quarter * 3);
            cal.set(Calendar.DAY_OF_MONTH, 1);
            return cal.getTime();
        } else if ("Previous Quarter".equals(dateChoice)) {
            cal.setTime(today);
            int month = cal.get(Calendar.MONTH); /* 0 through 11 */
            int quarter = (month / 4);
            cal.set(Calendar.MONTH, quarter * 3);
            cal.set(Calendar.DAY_OF_MONTH, 1);
            return cal.getTime();
        } else if ("Year to Date".equals(dateChoice)) {
            cal.setTime(today);
            cal.set(Calendar.DAY_OF_YEAR, 1);
            return cal.getTime();
        } else if ("Previous Year".equals(dateChoice)) {
            cal.setTime(today);
            cal.add(Calendar.YEAR, -1);
            cal.set(Calendar.DAY_OF_YEAR, 1);
            return cal.getTime();
        } else if ("All Time".equals(dateChoice)) {
            cal.setTime(today);
            cal.set(Calendar.YEAR, 2005);
            return cal.getTime();
        } else if ("User Defined".equals(dateChoice)) {
            return (inDate == null)  ? today : inDate;
        } else { 
            try {
                return dateFormat.parse(dateChoice);
            } catch (ParseException e) {
                logger.error("getStartDate: Unknown date choice: " + dateChoice +" or bad date string: " +inDate);
                return today;
            }
        }
    }

    public static Date getEndDate(String dateChoice, Date inDate) {
        Date today = new Date();
        Calendar cal = Calendar.getInstance();

        if ("Today".equals(dateChoice)) {
            return today;
        } else if ("Yesterday".equals(dateChoice)) {
            cal.setTime(today);
            cal.add(Calendar.DATE, -1);
            return cal.getTime();
        } else if ("Last 7 Days".equals(dateChoice)) {
            cal.setTime(today);
            cal.add(Calendar.DATE, -1);
            return cal.getTime();
        } else if ("Last 30 Days".equals(dateChoice)) {
            cal.setTime(today);
            cal.add(Calendar.DATE, -1);
            return cal.getTime();
        } else if ("Last 90 Days".equals(dateChoice)) {
            cal.setTime(today);
            cal.add(Calendar.DATE, -1);
            return cal.getTime();
        } else if ("Month to Date".equals(dateChoice)) {
            return today;
        } else if ("Previous Month".equals(dateChoice)) {
            cal.setTime(today);
            cal.add(Calendar.MONTH, -1);
            int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
            cal.set(Calendar.DAY_OF_MONTH, lastDay);
            return cal.getTime();
        } else if ("Week to Date".equals(dateChoice)) {
            return today;
        } else if ("Previous Week".equals(dateChoice)) {
            cal.setTime(today);
            cal.set(Calendar.DAY_OF_WEEK, 1);
            cal.add(Calendar.DAY_OF_WEEK, -1);
            return cal.getTime();
        } else if ("Quarter to Date".equals(dateChoice)) {
            return today;
        } else if ("Previous Quarter".equals(dateChoice)) {
            cal.setTime(today);
            int month = cal.get(Calendar.MONTH); /* 0 through 11 */
            int quarter = (month / 3) - 1;
            cal.set(Calendar.MONTH, (quarter * 3) + 2);
            int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
            cal.set(Calendar.DATE, lastDay);
            return cal.getTime();
        } else if ("Year to Date".equals(dateChoice)) {
            return today;
        } else if ("Previous Year".equals(dateChoice)) {
            cal.setTime(today);
            cal.add(Calendar.YEAR, -1);
            int lastDay = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
            cal.set(Calendar.DAY_OF_YEAR, lastDay);
            return cal.getTime();
        } else if ("All Time".equals(dateChoice)) {
            return today;
        } else if ("User Defined".equals(dateChoice)) {
            return (inDate == null)  ? today : inDate;
        } else { 
            try {
                return dateFormat.parse(dateChoice);
            } catch (ParseException e) {
                logger.error("getStartDate: Unknown date choice: " + dateChoice +" or bad date string: " +inDate);
                return today;
            }
        }
    }
}