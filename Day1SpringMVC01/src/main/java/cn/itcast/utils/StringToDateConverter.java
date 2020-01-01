package cn.itcast.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

/**
 * @author zack
 * @create 2020-01-01-7:54
 */
public class StringToDateConverter implements Converter<String, Date> {


    @Override
    public Date convert(String source) {
        if (source == null) {
            throw new RuntimeException("input data");
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return  df.parse(source);
        } catch (ParseException e) {
            throw new RuntimeException("input data");
        }
    }
}
