package com.utils;

import com.sun.xml.fastinfoset.util.CharArray;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SwingUtils{



    public static Date formatarData(String data)  {
        try {
           System.out.println(data);
            SimpleDateFormat fomart = new SimpleDateFormat("dd/MM/yyyy");
            return fomart.parse(data);
        }catch (ParseException e  ) {
            System.out.println("Erro ao formatar DATA");
            e.printStackTrace();
            return null;
        }
    }

    public static String formatarTelefone(String telefone) {
        StringBuilder tel = new StringBuilder();
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(telefone);
        if(matcher.find()) {
            for (int i = 0 ; i < telefone.toCharArray().length ; i++) {
                 pattern = Pattern.compile("[0-9]");
                    matcher = pattern.matcher(String.valueOf(telefone.toCharArray()[i]));
                if(matcher.find()) {
                    tel.append(telefone.toCharArray()[i]);

                }
            }

        }
        return tel.toString();
    }
}
