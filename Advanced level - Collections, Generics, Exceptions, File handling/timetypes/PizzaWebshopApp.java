package advanced.timetypes;

import java.time.*;
import java.time.chrono.HijrahDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class PizzaWebshopApp {

    public static void main(String[] args) {

        LocalTime openingTime = LocalTime.of(11, 0);
        LocalTime clossingTime = LocalTime.of(22, 0);
        System.out.println("The restaurant is open from " + openingTime + " to " + clossingTime + " on every day.");

        LocalDate orderDate = LocalDate.now().minusDays(3);
        System.out.println("The pizza was ordered on " + orderDate);

        LocalDateTime orderDateTime = LocalDateTime.from(orderDate.atStartOfDay()).withHour(17);
        System.out.println("I submitted the order: " + orderDateTime);

        LocalTime deliveryTime = LocalTime.of(1,10);
        System.out.println("Delivery time: " + deliveryTime);

        LocalDateTime estimatedDeliveryDateTime = orderDateTime.plusHours(deliveryTime.getHour()).
                plusMinutes(deliveryTime.getMinute());
        System.out.println("The estimated delivery time: " + estimatedDeliveryDateTime);

        LocalDateTime realDeliveryDateTime = orderDateTime.plusMinutes(90);
        System.out.println("The real delivery time was: " + realDeliveryDateTime);

        long differenceBetweenEstimatedAndReal = ChronoUnit.MINUTES.between(estimatedDeliveryDateTime, realDeliveryDateTime);
        System.out.println("Difference: " + differenceBetweenEstimatedAndReal + " in minutes");

        if (estimatedDeliveryDateTime.isBefore(realDeliveryDateTime)) {
            System.out.println("The pizza didn't arrived in time.");
        } else {
            System.out.println("The pizza arrived in time.");
        }

        HijrahDate hijrahDate = HijrahDate.from(orderDate);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Based on Hijrah calendar I ordered my pizza on: " + dateTimeFormatter.format(hijrahDate));

        ZonedDateTime myLocalDateTime = orderDateTime.atZone(ZoneId.of("Europe/Athens"));
        System.out.println("The time I ordered pizza was " + myLocalDateTime + " in Athens.");
        ZonedDateTime tokioDateTime = myLocalDateTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.println("The time I ordered pizza was " + tokioDateTime + " in Tokyo.");

        for (String zoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println(zoneId);
        }


    }

}
