package br.com.belezavip.belezavip.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConversorDeDatas {

    public static String converterDateToStrig(Date data){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        return formato.format(data);
    }

    public static Date ConverterStringToDate(String data) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        return formato.parse(data);
    }
}
