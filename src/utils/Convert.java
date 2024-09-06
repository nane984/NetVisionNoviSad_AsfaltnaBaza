/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author brasa
 */
public class Convert {

    public static String shiftPointCutMinus(int a, int br) {
        try {
            double x = (double) a;
            if (x > 32768) {  // cut minus
                x = 0;
            }

            for (int i = 1; i <= br; i++) {
                x = x * .1;
            }

            DecimalFormat df = new DecimalFormat("#####.####");
            return df.format(x);
        } catch (Exception ex) {
            return "_";
        }
    }
    
    public static String shiftPointUnsign(int a, int br) {
        try {
            double x = (double) a;
            for (int i = 1; i <= br; i++) {
                x = x * .1;
            }
            DecimalFormat df = new DecimalFormat("#####.####");
            return df.format(x);
        } catch (Exception ex) {
            return "0";
        }
    }

    public static String shiftPointCutMinus(double a, int br) {
        try {
            double x = a;
            if (x > 32768) {  // cut minus
                x = 0;
            }

            for (int i = 1; i <= br; i++) {
                x = x * .1;
            }

            DecimalFormat df = new DecimalFormat("#####.####");
            return df.format(x);
        } catch (Exception ex) {
            return "_";
        }
    }

    public static double shiftPointDoubleSign(int a, int brDec) {
        try {
            double x = (double) a;

            if (x > 32768) {  // signed
                x = x - 65536;
            }

            for (int i = 1; i <= brDec; i++) {
                x = x * .1;
            }

            DecimalFormat df = new DecimalFormat("#####.##");
            return Double.parseDouble(df.format(x));
            //return x;
        } catch (Exception ex) {
            return 0;
        }
    }
    
    public static double shiftPointDoubleUnsign(int a, int br) {
        try {
            double x = (double) a;

            for (int i = 1; i <= br; i++) {
                x = x * .1;
            }

            DecimalFormat df = new DecimalFormat("#####.##");
            return Double.parseDouble(df.format(x));
            //return x;
        } catch (Exception ex) {
            return 0;
        }
    }

    public static String doubleToString(double a) {
        double x = (double) a;
        DecimalFormat df = new DecimalFormat("#####.##");
        return df.format(x);
    }

    public static int doubleToInt(double a, int br) {
        try {

            for (int i = 1; i <= br; i++) {
                a = a * 10;
            }
            return (int) a;
        } catch (Exception e) {
            return 0;
        }
    }

    public static int objectToInt(Object a, int br) {
        try {
            double x = (double) a;
            if (br > 0) {
                x = Math.round(x * Math.pow(10, br)) / Math.pow(10, br);
                for (int i = 1; i <= br; i++) {
                    x = x * 10;
                }
            }

            return (int) x;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
    
    public static float intToFloat(int visi, int nizi) {
        int a = 0;
        a = visi << 16 | nizi & 0xFFFF;
        float res = Float.intBitsToFloat(a);
        return res;
    }
    
    public static int[] floatTo2Ints(float in) {
        String pec = Integer.toHexString(Float.floatToIntBits(in));
        String fn = pec.substring(pec.length() - 4);
        String ln = pec.substring(0, pec.length() - 4);

        int[] result = new int[2];
        result[0] = getDecimal(fn);
        result[1] = getDecimal(ln);
        
        return result;
    }
    
    private static int getDecimal(String hex) {
        int val = Integer.parseInt(hex, 16);
        if (val > 32768) {         
            val = val - 65536;
        }
        return val;
    }

    public static double stringToDouble(String a) {
        try {
            double x = Double.parseDouble(a);
            return x;
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Uneli ste slovo.",
            //        "Alert", JOptionPane.WARNING_MESSAGE);
            return 0;
        }

    }

    public static double stringToDouble(String a, int point) {
        try {
            double x = Double.parseDouble(a);
            for (int i = 0; i < point; i++) {
                x = x * 10;
            }

            return x;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Uneli ste slovo.",
                    "Alert", JOptionPane.WARNING_MESSAGE);
            return 0;
        }

    }
    
    public static int getTwoRegisterIntShiftPointToInt(int hight, int low) {
        try {
            long h = hight;
            long l = low;
            long c = (long) h << 16 | l;
            int x = (int)c;

            return x;
        } catch (Exception e) {
            return 0;
        }
    }

    public static String getTwoRegisterIntShiftPoint(String hight, String low, int point) {
        try {
            long h = Long.parseLong(hight);
            long l = Long.parseLong(low);
            long c = (long) h << 16 | l;
            double x = c;
            String form = "";

            for (int i = 1; i <= point; i++) {
                x = x * .1;
                form = form + "#";
            }
            DecimalFormat df;
            if (point == 0) {
                df = new DecimalFormat("######");
            } else {
                df = new DecimalFormat("######." + form);
            }

            return df.format(x);
        } catch (Exception e) {
            return "0";
        }
    }

    public static double getTwoRegisterIntShiftPointToDouble(int hight, int low, int point) {
        try {
            long h = hight;
            long l = low;
            long c = (long) h << 16 | l;
            double x = c;
            String form = "";

            for (int i = 1; i <= point; i++) {
                x = x * .1;
                form = form + "#";
            }

            return x;
        } catch (Exception e) {
            return 0;
        }
    }
    

    public static int[] convertDoubleToTwoInt(long in) {
        int[] data = new int[2];

        data[0] = (int) (in & 0xFFFF);
        data[1] = (int) ((in >> 16) & 0xFFFF);

        if (data[0] > 32768) {  // signed
            data[0] = data[0] - 65536;
        }

        if (data[1] > 32768) {  // signed
            data[1] = data[1] - 65536;
        }

        return data;

    }

    public static String convertDateToString(Date date) {
        String dateStr = new String();
        String format = "dd.MM.yyyy  HH:mm:ss";
        DateFormat df = new SimpleDateFormat(format);
        try {
            dateStr = df.format(date);
        } catch (Exception ex) {
            //System.out.println(ex);
        }
        return dateStr;
    }
    
    public static String formatDateToString(String date) {
        if(!date.isEmpty()){
        try {
            final String OLD_FORMAT = "yyyy-MM-dd";
            final String NEW_FORMAT = "dd.MM.yyyy";
            
            String newDateString;

            SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
            Date d = sdf.parse(date);
            sdf.applyPattern(NEW_FORMAT);
            newDateString = sdf.format(d);
            
            return newDateString;
        } catch (ParseException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
        }else{
            return "";
        }
    }

    public static String convertDateToStringTime(Date date) {
        String dateStr = new String();
        String format = "HH:mm:ss";
        DateFormat df = new SimpleDateFormat(format);
        try {
            dateStr = df.format(date);
        } catch (Exception ex) {
            //System.out.println(ex);
        }
        return dateStr;
    }

    public static String convertDateToStringDate(Date date) {
        String dateStr = new String();
        String format = "dd.MM.yyyy";
        DateFormat df = new SimpleDateFormat(format);
        try {
            dateStr = df.format(date);
        } catch (Exception ex) {
            //System.out.println(ex);
        }
        return dateStr;
    }

    public static Date convertStringToDate(String dateStr) {
        Date date = null;
        DateFormat df = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        if (dateStr.length() > 7) {

            String[] datum = dateStr.split("\\.");

            String day = datum[0];
            String month = datum[1];
            String year = datum[2];

            try {
                date = df.parse(year + "-" + month + "-" + day + " 00" + ":" + "00" + ":" + "00");
                //System.out.println("Datum je " + convertDateToString(date));
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } else {
            try {
                //date=df.parse("2001-01-01");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        return date;
    }

    public static Date convertStringToDate(String dateStr, String vreme) {
        Date date = null;
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //System.out.println("Vreme je " + vreme);
        if (dateStr.length() > 7) {

            String[] datum = dateStr.split("\\.");

            String day = datum[0];
            String month = datum[1];
            String year = datum[2];

            String[] time = vreme.split("\\:");

            String hour = time[0];
            String min = time[1];

            try {
                date = df.parse(year + "-" + month + "-" + day + " " + hour + ":" + min + ":" + "59");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } else {
            try {
                //date=df.parse("2001-01-01");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        return date;
    }

    public static double format2decimals(double brIn) {
        try {
            String br = Double.toString(brIn);
            String[] ukloniE = br.split("E");
            String zameniTac = ukloniE[0].replace(".", " ");
            String[] ukloniTac = zameniTac.split(" ");
            String posleDecTacke = "0";

            if (ukloniTac.length > 1) {
                int brDec = 1;
                if (ukloniTac[1].length() > 1) {
                    brDec = 2;
                }
                posleDecTacke = ukloniTac[1].subSequence(0, brDec).toString();
            }
            String res = ukloniTac[0] + "." + posleDecTacke;
            
            double val = Double.parseDouble(res);
            return Math.round(val * 100.0) / 100.0;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
    
    public static double format2DecimalPrint(double brIn) {
        try {
            String br = Double.toString(brIn);
            String[] ukloniE = br.split("E");
            String zameniTac = ukloniE[0].replace(".", " ");
            String[] ukloniTac = zameniTac.split(" ");
            String posleDecTacke = "0";

            if (ukloniTac.length > 1) {
                int brDec = 1;
                if (ukloniTac[1].length() > 1) {
                    brDec = 2;
                }
                posleDecTacke = ukloniTac[1].subSequence(0, brDec).toString();
            }
            String res = ukloniTac[0] + "." + posleDecTacke;

            double val = Double.parseDouble(res);
            return Math.round(val * 10.0) / 10.0;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static double cutDecimal(double br) {
        try {
            double d = br;
            DecimalFormat df = new DecimalFormat("####");
            df.setRoundingMode(RoundingMode.DOWN);
            double outputNum = Double.valueOf(df.format(d));
            return outputNum;
        } catch (Exception e) {
            return 0;
        }
    }

   
    public static String nextValueValid(double oldValue, double newValue) {
        DecimalFormat df = new DecimalFormat("#####.##");

        if (newValue > oldValue) {
            return df.format(newValue);
        } else {
            return df.format(oldValue);
        }

    }
    
    public static int getPositivNumbers(int br){
        if(br>=0){
            return br;
        }else{
            return 0;
        }
    }

    public static String getRoundFloat(float db, int Format) {
        BigDecimal bd = new BigDecimal(Float.toString(db));
        bd = bd.setScale(Format, RoundingMode.HALF_UP);
        return bd.toString();
    }

    public static String getRoundDouble(double db, int Format) {
        BigDecimal bd = new BigDecimal(Double.toString(db));
        bd = bd.setScale(Format, RoundingMode.HALF_UP);
        return bd.toString();
    }

    public static int convertLongInInt_in1MinusIn2(double br1, String zalihe, int brDec) {
        int result;
        result = (int) ((long) br1 - Convert.stringToDouble(zalihe, brDec));
        return result;
    }
    
    public static int convertLongInInt_in1PlusIn2(double br1, String zalihe, int brDec) {
        int result;
        result = (int) ((long) br1 + Convert.stringToDouble(zalihe, brDec));
        return result;
    }
}
