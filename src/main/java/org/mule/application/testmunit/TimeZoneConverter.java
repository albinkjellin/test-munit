package org.mule.application.testmunit;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Created with IntelliJ IDEA.
 * User: albinkjellin
 * Date: 5/17/12
 * Time: 10:45 AM
 * To change this template use File | Settings | File Templates.
 */
public class TimeZoneConverter {

    public static void main(String[] args) {

        GregorianCalendar c = new GregorianCalendar();
        Date srcDate = new Date();
        c.setTime(srcDate);
        XMLGregorianCalendar startDate= null;
        try {
            startDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        System.out.println("Local Time = "+startDate);
        GregorianCalendar cUTC = new GregorianCalendar();
        cUTC.setTime(srcDate);
        cUTC.setTimeZone(TimeZone.getTimeZone("UTC"));
        XMLGregorianCalendar startDateUTC= null;
        try {
            startDateUTC = DatatypeFactory.newInstance().newXMLGregorianCalendar(cUTC);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
         System.out.println("Local Time = "+startDateUTC);

    }
}
