# JasperServer Dynamic Date Picker#

This code defines a dynamic date picker for JasperServer. Add the jar file to the lib directory in order for the server to be able to run the code.

![Screen-Shot-2012-06-17-at-11.14.14-AM1.png]
![Alt text](/Screen-Shot-2012-06-17-at-11.14.14-AM1.png?raw=true "Optional Title")
![Alt text](../js-dynamic-dates/Screen-Shot-2012-06-17-at-11.14.14-AM1.png?raw=true "Optional Title")
![ScreenShot](/Screen-Shot-2012-06-17-at-11.14.14-AM1.png)
![ScreenShot](/js-dynamic-dates/Screen-Shot-2012-06-17-at-11.14.14-AM1.png)

First we need to create a set of parameters in the jrxml file that help us calculate and store the dates.

* PickDate – (String) This will be filled in with the date choice (“Yesterday”, This Week”, etc).
* StartDate – (Date) This is the users set start date (“User Defined”)
* EndDate-  (Date) This is the users set end date  (“User Defined”)
* StartDateChoice – (String) This is where we call the getStartDate method.
* EndDateChoice – (String) This is where we call the getEndDate method.
* For StartDateChoice we will set the “Default Value Expression” to: com.reptics.dateutils.DateByString.getStartDate($P{DateChoice},$P{StartDate})

We do something similar with EndDateChoice and then we need to use $P(EndDateChoice} in the query when looking for a date. This replaces strings like “This Year” with the date we calculated from the Java code.

To make this all work you need to define the correct input selectors in JasperServer for DateChoice, StartDate and EndDate.