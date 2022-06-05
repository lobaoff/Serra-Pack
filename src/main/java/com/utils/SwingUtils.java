package com.utils;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SwingUtils{



    public static Date formatarData(String data)  {
        try {
            System.out.println(data);
            SimpleDateFormat fomart = new SimpleDateFormat("dd/MM/yyyy");
            Date dataFormatada = fomart.parse(data);
            return dataFormatada;
        }catch (ParseException e  ) {
            System.out.println("Erro ao formatar DATA");
            e.printStackTrace();
            return null;
        }
    }
}
