package com.zuoyanD.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringUtils {

    public static LocalDate formateDateFromStr(String dateStr, String formatStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatStr);
        return LocalDate.parse(dateStr, formatter);
    }
}
