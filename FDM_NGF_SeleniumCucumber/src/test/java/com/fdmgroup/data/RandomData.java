package com.fdmgroup.data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;


public class RandomData {
  
        public static String BirthDate() {
            LocalDate startDate = LocalDate.of(1900, 1, 1);
            LocalDate endDate = LocalDate.of(2005, 1, 1);
            long startEpochDay = startDate.toEpochDay();
            long endEpochDay = endDate.toEpochDay();
            long randomEpochDay = startEpochDay + (long) (Math.random() * (endEpochDay - startEpochDay));
            LocalDate randomDate = LocalDate.ofEpochDay(randomEpochDay);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
            return randomDate.format(formatter);
        }

     



         public static String MobileNumber() {
     
            Random random = new Random();
            
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 10; i++) {
             
                sb.append(random.nextInt(10));
            }
            
        
            return sb.toString();
        }

	public static String randomString() {
        int stringLength = 10;
        String alphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(stringLength);

        for (int i = 0; i < stringLength; i++) {
            int index = (int)(alphaNumericString.length() * Math.random());
            sb.append(alphaNumericString.charAt(index));
        }

        return sb.toString();
    }


public static String StreetAdress() {
	return (randomString() + "fake street" );
}

	public static String Email() {
		return (randomString() + "@gmail.com");
	}
}
