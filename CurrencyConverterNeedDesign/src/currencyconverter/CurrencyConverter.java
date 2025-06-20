/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package currencyconverter;
import java.net.*;
import java.io.*;
import java.util.HashMap;
//import org.json.JSONObject;

/**
 *
 * @author MNami
 */
public class CurrencyConverter {
    
    public static final String[] CURRENCY_CODES = {
        "EUR", "USD", "JPY", "BGN", "CZK", "DKK", "GBP", "HUF",
        "PLN", "RON", "SEK", "CHF", "ISK", "NOK", "HRK", "RUB",
        "TRY", "AUD", "BRL", "CAD", "CNY", "HKD", "IDR", "ILS",
        "INR", "KRW", "MXN", "MYR", "NZD", "PHP", "SGD", "THB",
        "ZAR"
    };
    
    public static final String[] currencyFullNames = {
                "Euro",                     // EUR
                "United States Dollar",     // USD
                "Japanese Yen",             // JPY
                "Bulgarian Lev",            // BGN
                "Czech Koruna",             // CZK
                "Danish Krone",             // DKK
                "British Pound",            // GBP
                "Hungarian Forint",         // HUF
                "Polish Złoty",             // PLN
                "Romanian Leu",             // RON
                "Swedish Krona",            // SEK
                "Swiss Franc",              // CHF
                "Icelandic Króna",          // ISK
                "Norwegian Krone",          // NOK
                "Croatian Kuna",            // HRK (Historical, Croatia uses EUR)
                "Russian Ruble",            // RUB
                "Turkish Lira",             // TRY
                "Australian Dollar",        // AUD
                "Brazilian Real",           // BRL
                "Canadian Dollar",          // CAD
                "Chinese Yuan Renminbi",    // CNY
                "Hong Kong Dollar",         // HKD
                "Indonesian Rupiah",        // IDR
                "Israeli New Shekel",       // ILS
                "Indian Rupee",             // INR
                "South Korean Won",         // KRW
                "Mexican Peso",             // MXN
                "Malaysian Ringgit",        // MYR
                "New Zealand Dollar",       // NZD
                "Philippine Peso",          // PHP
                "Singapore Dollar",         // SGD
                "Thai Baht",                // THB
                "South African Rand"        // ZAR
        };
    
    public static final String[] currencySymbols = {
                "€",    // EUR
                "$",    // USD
                "¥",    // JPY
                "лв",   // BGN
                "Kč",   // CZK
                "kr.",  // DKK
                "£",    // GBP
                "Ft",   // HUF
                "zł",   // PLN
                "lei",  // RON
                "kr",   // SEK
                "CHF",  // CHF (often uses code, or Fr.)
                "kr",   // ISK
                "kr",   // NOK
                "kn",   // HRK
                "₽",    // RUB
                "₺",    // TRY
                "$",    // AUD
                "R$",   // BRL
                "$",    // CAD
                "¥",    // CNY
                "$",    // HKD
                "Rp",   // IDR
                "₪",    // ILS
                "₹",    // INR
                "₩",    // KRW
                "$",    // MXN
                "RM",   // MYR
                "$",    // NZD
                "₱",    // PHP
                "$",    // SGD
                "฿",    // THB
                "R"     // ZAR
            
        };
    
    public static HashMap<String, String> currencyCodeFullName = new HashMap<>();
    public static HashMap<String, String> currencyCodeSymbol = new HashMap<>();
    
    
    public static void putItem() {
        currencyCodeFullName.put("Euro", "EUR");
        currencyCodeFullName.put("United States Dollar", "USD");
        currencyCodeFullName.put("Japanese Yen", "JPY");
        currencyCodeFullName.put("Bulgarian Lev", "BGN");
        currencyCodeFullName.put("Czech Koruna", "CZK");
        currencyCodeFullName.put("Danish Krone", "DKK");
        currencyCodeFullName.put("British Pound", "GBP"); // Or "British Pound"
        currencyCodeFullName.put("Hungarian Forint", "HUF");
        currencyCodeFullName.put("Polish Złoty", "PLN"); // Note: Złoty uses a special character
        currencyCodeFullName.put("Romanian Leu", "RON");
        currencyCodeFullName.put("Swedish Krona", "SEK");
        currencyCodeFullName.put("Swiss Franc", "CHF");
        currencyCodeFullName.put("Icelandic Króna", "ISK"); // Note: Króna uses a special character
        currencyCodeFullName.put("Norwegian Krone", "NOK");
        currencyCodeFullName.put("Croatian Kuna", "HRK");
        currencyCodeFullName.put("Russian Ruble", "RUB");
        currencyCodeFullName.put("Turkish Lira", "TRY");
        currencyCodeFullName.put("Australian Dollar", "AUD");
        currencyCodeFullName.put("Brazilian Real", "BRL");
        currencyCodeFullName.put("Canadian Dollar", "CAD");
        currencyCodeFullName.put("Chinese Yuan Renminbi", "CNY"); // Or "Chinese Yuan"
        currencyCodeFullName.put("Hong Kong Dollar", "HKD");
        currencyCodeFullName.put("Indonesian Rupiah", "IDR");
        currencyCodeFullName.put("Israeli New Shekel", "ILS"); // Or "Israeli Shekel"
        currencyCodeFullName.put("Indian Rupee", "INR");
        currencyCodeFullName.put("South Korean Won", "KRW");
        currencyCodeFullName.put("Mexican Peso", "MXN");
        currencyCodeFullName.put("Malaysian Ringgit", "MYR"); // As you requested
        currencyCodeFullName.put("New Zealand Dollar", "NZD");
        currencyCodeFullName.put("Philippine Peso", "PHP");
        currencyCodeFullName.put("Singapore Dollar", "SGD");
        currencyCodeFullName.put("Thai Baht", "THB");
        currencyCodeFullName.put("South African Rand", "ZAR");
        currencyCodeSymbol.put("EUR", "€");
        currencyCodeSymbol.put("USD", "$");
        currencyCodeSymbol.put("JPY", "¥");
        currencyCodeSymbol.put("BGN", "лв");
        currencyCodeSymbol.put("CZK", "Kč");
        currencyCodeSymbol.put("DKK", "kr.");
        currencyCodeSymbol.put("GBP", "£");
        currencyCodeSymbol.put("HUF", "Ft");
        currencyCodeSymbol.put("PLN", "zł");
        currencyCodeSymbol.put("RON", "lei");
        currencyCodeSymbol.put("SEK", "kr");
        currencyCodeSymbol.put("CHF", "CHF"); // Or "Fr."
        currencyCodeSymbol.put("ISK", "kr");
        currencyCodeSymbol.put("NOK", "kr");
        currencyCodeSymbol.put("HRK", "kn");  // Note: Croatia adopted EUR in 2023, HRK is historical
        currencyCodeSymbol.put("RUB", "₽");
        currencyCodeSymbol.put("TRY", "₺");
        currencyCodeSymbol.put("AUD", "$");
        currencyCodeSymbol.put("BRL", "R$");
        currencyCodeSymbol.put("CAD", "$");
        currencyCodeSymbol.put("CNY", "¥");
        currencyCodeSymbol.put("HKD", "$");
        currencyCodeSymbol.put("IDR", "Rp");
        currencyCodeSymbol.put("ILS", "₪");
        currencyCodeSymbol.put("INR", "₹");
        currencyCodeSymbol.put("KRW", "₩");
        currencyCodeSymbol.put("MXN", "$");
        currencyCodeSymbol.put("MYR", "RM");
        currencyCodeSymbol.put("NZD", "$");
        currencyCodeSymbol.put("PHP", "₱");
        currencyCodeSymbol.put("SGD", "$");
        currencyCodeSymbol.put("THB", "฿");
        currencyCodeSymbol.put("ZAR", "R");
    }
    /*public static void main(String[] args) throws Exception {
        String baseCurrency = "MYR";
        String Resp = retrieveExchangeRate(baseCurrency);
        
        JSONObject jo = new JSONObject(Resp);
        System.out.println(jo.getJSONObject("data"));
            
        for (String i: CURRENCY_CODES){
            System.out.println(i);
            System.out.println(jo.getJSONObject("data").getFloat(i));
        }
    } */
    
    
    
    public static String retrieveExchangeRate(String baseCurrency) {
        String Resp = "";
        System.out.println(baseCurrency);
        System.out.println(currencyCodeFullName.get(baseCurrency));
        try {
            String BASE_URL = "https://api.freecurrencyapi.com/v1/latest?apikey=fca_live_62u0wjD6YPMkUzPP8I0L7ltJ1MCPpqpHOFV6uWzs";
            URL yahoo = new URL(BASE_URL + "&base_currency=" + currencyCodeFullName.get(baseCurrency));
            URLConnection yc = yahoo.openConnection();
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            yc.getInputStream()))) {
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    Resp = inputLine;
                    System.out.println(inputLine);
                }
                in.close();
            }
        }
        catch(Exception e) {
            return("Error: " + e);
        }
        return Resp;
    }
    
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }   
    
}
