package ru.netology.datedelivery;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateDelivery {
    public String ReturnDate (int plusDays){
        LocalDate date = LocalDate.now();
        LocalDate dateDelivery = date.plusDays(plusDays);
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String dataText = dateDelivery.format(formatters);
        return dataText;

    }

}