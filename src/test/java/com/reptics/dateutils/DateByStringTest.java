/**
 * 
 */
package com.reptics.dateutils;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author billrooney
 *
 */
public class DateByStringTest {

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test method for {@link com.reptics.dateutils.DateByString#getStartDate(java.lang.String)}.
     */
    @Test
    public void testDateChoice() {    
        System.out.println(" Testing getStartDate");
        System.out.println("---------------------");
        System.out.println("           Today = " +com.reptics.dateutils.DateByString.getStartDate("Today") +" - "
                                                 +com.reptics.dateutils.DateByString.getEndDate("Today"));
        System.out.println("       Yesterday = " +com.reptics.dateutils.DateByString.getStartDate("Yesterday") +" - "
                                                 +com.reptics.dateutils.DateByString.getEndDate("Yesterday"));
        System.out.println("    Week to Date = " +com.reptics.dateutils.DateByString.getStartDate("Week to Date") +" - "
                                                 +com.reptics.dateutils.DateByString.getEndDate("Week to Date"));
        System.out.println("   Previous Week = " +com.reptics.dateutils.DateByString.getStartDate("Previous Week") +" - "
                                                 +com.reptics.dateutils.DateByString.getEndDate("Previous Week"));
        System.out.println("   Last 7 Days   = " +com.reptics.dateutils.DateByString.getStartDate("Last 7 Days") +" - "
                                                 +com.reptics.dateutils.DateByString.getEndDate("Last 7 Days"));
        System.out.println("   Last 30 Days  = " +com.reptics.dateutils.DateByString.getStartDate("Last 30 Days") +" - "
                                                 +com.reptics.dateutils.DateByString.getEndDate("Last 30 Days"));
        System.out.println("   Last 90 Days  = " +com.reptics.dateutils.DateByString.getStartDate("Last 90 Days") +" - "
                                                 +com.reptics.dateutils.DateByString.getEndDate("Last 90 Days"));
        System.out.println("   Month to Date = " +com.reptics.dateutils.DateByString.getStartDate("Month to Date") +" - "
                                                 +com.reptics.dateutils.DateByString.getEndDate("Month to Date"));
        System.out.println("  Previous Month = " +com.reptics.dateutils.DateByString.getStartDate("Previous Month") +" - "
                                                 +com.reptics.dateutils.DateByString.getEndDate("Previous Month"));
        System.out.println(" Quarter to Date = " +com.reptics.dateutils.DateByString.getStartDate("Quarter to Date") +" - "
                                                 +com.reptics.dateutils.DateByString.getEndDate("Quarter to Date"));
        System.out.println("Previous Quarter = " +com.reptics.dateutils.DateByString.getStartDate("Previous Quarter") +" - "
                                                 +com.reptics.dateutils.DateByString.getEndDate("Previous Quarter"));
        System.out.println("    Year to Date = " +com.reptics.dateutils.DateByString.getStartDate("Year to Date") +" - "
                                                 +com.reptics.dateutils.DateByString.getEndDate("Year to Date"));
        System.out.println("   Previous Year = " +com.reptics.dateutils.DateByString.getStartDate("Previous Year") +" - "
                                                 +com.reptics.dateutils.DateByString.getEndDate("Previous Year"));
        System.out.println("        All Time = " +com.reptics.dateutils.DateByString.getStartDate("All Time") +" - "
                                                 +com.reptics.dateutils.DateByString.getEndDate("All Time"));
        System.out.println("    User Defined = " +com.reptics.dateutils.DateByString.getStartDate("User Defined") +" - "
                                                 +com.reptics.dateutils.DateByString.getEndDate("User Defined"));
        System.out.println("    User Defined = " +com.reptics.dateutils.DateByString.getStartDate("User Defined", new Date()) +" - "
                                                 +com.reptics.dateutils.DateByString.getEndDate("User Defined", new Date()));
        System.out.println("      2000-01-01 = " +com.reptics.dateutils.DateByString.getStartDate("2000-01-01") +" - "
                                                 +com.reptics.dateutils.DateByString.getEndDate("2000-01-01"));
        System.out.println("      2010-02-02 = " +com.reptics.dateutils.DateByString.getStartDate("2010-02-02") +" - "
                                                 +com.reptics.dateutils.DateByString.getEndDate("2010-02-02"));
        System.out.println("      2011-03-03 = " +com.reptics.dateutils.DateByString.getStartDate("2011-03-03") +" - "
                                                 +com.reptics.dateutils.DateByString.getEndDate("20011-03-03"));
    }

}
