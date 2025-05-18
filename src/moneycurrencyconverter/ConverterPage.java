/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package moneycurrencyconverter;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author kearl
 */
public class ConverterPage extends javax.swing.JFrame {
   
    boolean showCurrencyPairs = false;
    boolean appStarted = false;
    String selectedBase = "";
    
    // Currency pairs
    Map<String, List<String>> pairSuggestions = new HashMap<>();
    
    // Currency conversion rates
    Map<String, Double> rates = new HashMap<>();
    
    public ConverterPage() {
        initComponents();
        
        // Frame size
        setSize(425,610);
              
        
        // CODE HERE
        // From combobox currencies
        cbFrom.removeAllItems();
        cbFrom.addItem("AED - Emirati Dirhams");
        cbFrom.addItem("AFN - Afghan Afghan");
        cbFrom.addItem("ALL - Albanian Leke");
        cbFrom.addItem("AMD - Armenian Drams");
        cbFrom.addItem("ANG - Dutch Guilder");
        cbFrom.addItem("AOA - Angolan Kwanzas");
        cbFrom.addItem("ARS - Argentine Pesos");
        cbFrom.addItem("AUD - Australian Dollar");
        cbFrom.addItem("AZN - Azerbaijan Manats");
        cbFrom.addItem("BAM - Bosnian Convertible Marks");
        cbFrom.addItem("BBD - Bajan Dollars");
        cbFrom.addItem("BDT - Bangladeshi Taka");
        cbFrom.addItem("BGN - Bulgarian Leva");
        cbFrom.addItem("BHD - Bahraini Dinar");
        cbFrom.addItem("BIF - Burunduin Franc");
        cbFrom.addItem("BMD - Bermudian Dollar");
        cbFrom.addItem("BND - Bruneian Dollar");
        cbFrom.addItem("BOB - Bolivian Boliviano");
        cbFrom.addItem("BRL - Brazilian Real");
        cbFrom.addItem("BSD - Bahamian Dollar");
        cbFrom.addItem("BTN - Bhutanese Ngultrum");
        cbFrom.addItem("BWP - Botswana Pula");
        cbFrom.addItem("BYN - Belarusian Ruble");
        cbFrom.addItem("BZD - Belizean Dollars");
        cbFrom.addItem("CAD - Canadian Dollar");
        cbFrom.addItem("CDF - Congolese Francs");
        cbFrom.addItem("CHF - Swiss Francs");
        cbFrom.addItem("CLP - Chilean Pesos");
        cbFrom.addItem("CNY - Chinese Yuan");
        cbFrom.addItem("COP - Colombian Peso");
        cbFrom.addItem("CRC - Costa Rican Colon");
        cbFrom.addItem("CUP - Cuban Peso");
        cbFrom.addItem("CVE - Cape Verdean Escudo");
        cbFrom.addItem("CZK - Czech Koruna");
        cbFrom.addItem("DJF - Djiboutian Francs");
        cbFrom.addItem("DKK - Danish Krone");
        cbFrom.addItem("DOP - Dominican Pesos");
        cbFrom.addItem("DZD - Algerian Dinar");
        cbFrom.addItem("EEK - Estonian Kroon");
        cbFrom.addItem("EGP - Egyptian Pound");
        cbFrom.addItem("ERN - Eritrean Nakfas");
        cbFrom.addItem("ETB - Ethiopian Birr");
        cbFrom.addItem("EUR - Euros");
        cbFrom.addItem("FJD - Fijian Dollars");
        cbFrom.addItem("FKP - Falkland Island pounds");
        cbFrom.addItem("GBP - British Pound");
        cbFrom.addItem("GEL - Georgian Lari");
        cbFrom.addItem("GGP - Guernsey Pounds");
        cbFrom.addItem("GHS - Ghanaian Cedis");
        cbFrom.addItem("GIP - Gibraltar Pounds");
        cbFrom.addItem("GMD - Gambian Dalasi");
        cbFrom.addItem("GNF - Guinean Franc");
        cbFrom.addItem("GTQ - Guatemalan Quetzales");
        cbFrom.addItem("GYD - Guyanese Dollar");
        cbFrom.addItem("HKD - Hong Kong Dollars");
        cbFrom.addItem("HNL - Honduran Lempiras");
        cbFrom.addItem("HTG - Haitian Gourdes");
        cbFrom.addItem("HUF - Hungarian Forints");
        cbFrom.addItem("IDR - Indonesian Rupiahs");
        cbFrom.addItem("ILS - Israeli New Shekels");
        cbFrom.addItem("IMP - Isle of Man Pounds");
        cbFrom.addItem("INR - Indian Rupees");
        cbFrom.addItem("IQD - Iraqi Dinars");
        cbFrom.addItem("IRR - Iranian Rials");
        cbFrom.addItem("ISK - Icelandic Kronur");
        cbFrom.addItem("JEP - Jersey Pound");
        cbFrom.addItem("JMD - Jamaican Dollars");
        cbFrom.addItem("JOD - Jordanian Dinars");
        cbFrom.addItem("JPY - Japanese Yen");
        cbFrom.addItem("KES - Kenyan Shilling");
        cbFrom.addItem("KGS - Kyrgyzstan Soms");
        cbFrom.addItem("KHR - Cambodian Riels");
        cbFrom.addItem("KMF - Comorian Francs");
        cbFrom.addItem("KPW - North Korean Won");
        cbFrom.addItem("KRW - South Korea Won");
        cbFrom.addItem("KWD - Kuwaiti Dinars");
        cbFrom.addItem("KYD - Caymanian Dollar");
        cbFrom.addItem("KZT - Kazakhstan Tenge");
        cbFrom.addItem("LAK - Lao Kips");
        cbFrom.addItem("LBP - Lebanese Pounds");
        cbFrom.addItem("LKR - Sri Lankan Rupees");
        cbFrom.addItem("LRD - Liberian Dollar");
        cbFrom.addItem("LSL - Basotho Maloti");
        cbFrom.addItem("LTL - Lithuanian Lital");
        cbFrom.addItem("LVL - Latvia Lati");
        cbFrom.addItem("LYD - Libyan Dinar");
        cbFrom.addItem("MAD - Moroccan Dirhams");
        cbFrom.addItem("MDL - Moldovan Lei");
        cbFrom.addItem("MGA - Malagasy Ariary");
        cbFrom.addItem("MKD - Macedoninan Denars");
        cbFrom.addItem("MMK - Burmese Kyats");
        cbFrom.addItem("MNT - Mongolian Tugriks");
        cbFrom.addItem("MOP - Macau Patacas");
        cbFrom.addItem("MRU - Mauritanian Ouguiyas");
        cbFrom.addItem("MUR - Mauritian Rupees");
        cbFrom.addItem("MVR - Maldivian Rufiyaa");
        cbFrom.addItem("MWK - Malawian Kwacha");
        cbFrom.addItem("MXN - Mexican Pesos");
        cbFrom.addItem("MYR - Malaysian Ringgits");
        cbFrom.addItem("MZN - Mozambican Meticais");
        cbFrom.addItem("NAD - Namibian Dollars");
        cbFrom.addItem("NGN - Nigerian Nairas");
        cbFrom.addItem("NIO - Nicaraguan Cordobas");
        cbFrom.addItem("NOK - Norwegian Kroner");
        cbFrom.addItem("NPR - Nepalese Rupees");
        cbFrom.addItem("NZD - New Zealand Dollars");
        cbFrom.addItem("OMR - Omani Rials");
        cbFrom.addItem("PAB - Panamanian Balboa");
        cbFrom.addItem("PEN - Peruvian Soles");
        cbFrom.addItem("PGK - Papua New Guinea Kina");
        cbFrom.addItem("PHP - Philippine Peso");
        cbFrom.addItem("PKR - Pakistani Rupees");
        cbFrom.addItem("PLN - Polish Zlotych");
        cbFrom.addItem("PYG - Paraguayan Guarani");
        cbFrom.addItem("QAR - Qatari Rials");
        cbFrom.addItem("RON - Romanian Lei");
        cbFrom.addItem("RSD - Serbian Dinar");
        cbFrom.addItem("RUB - Russian Rubles");
        cbFrom.addItem("RWF - Rwandan Francs");
        cbFrom.addItem("SAR - Saudi Arabian Riyals");
        cbFrom.addItem("SBD - Solomon Islands Dollar");
        cbFrom.addItem("SCR - Seychellois Rupees");
        cbFrom.addItem("SDG - Sudanese Pounds");
        cbFrom.addItem("SEK - Swedish Kronor");
        cbFrom.addItem("SGD - Singapore Dollars");
        cbFrom.addItem("SHP - Saint Helenian Pound");
        cbFrom.addItem("SLE - Sierra Leonenean Leone");
        cbFrom.addItem("SOS - Somali Shillings");
        cbFrom.addItem("SRD - Surinamese Dollars");
        cbFrom.addItem("STN - Sao Tomean Dobras");
        cbFrom.addItem("SVC - Salvadoran Colon");
        cbFrom.addItem("SYP - Syrian Pounds");
        cbFrom.addItem("SZL - Swazi Lilangeni");
        cbFrom.addItem("THB - Thai Baht");
        cbFrom.addItem("TJS - Tajikistani Somoni");
        cbFrom.addItem("TMT - Turkmenistani Manats");
        cbFrom.addItem("TND - Tunisian Dinars");
        cbFrom.addItem("TOP - Tongan Pa'anga");
        cbFrom.addItem("TRY - Turkish Lira");
        cbFrom.addItem("TTD - Trinidadian Dollars");
        cbFrom.addItem("TVD - Tuvaluan Dollar");
        cbFrom.addItem("TWD - Taiwan New Dollars");
        cbFrom.addItem("TZS - Tanzanian Shillings");
        cbFrom.addItem("UAH - Ukrainian Hryvni");
        cbFrom.addItem("UGX - Ugandan Shillings");
        cbFrom.addItem("UYU - Uruguayan Peso");
        cbFrom.addItem("UZS - Uzbekistani Sums");
        cbFrom.addItem("VES - Venezuelan Bolívares");
        cbFrom.addItem("VND - Vietnamese Dong");
        cbFrom.addItem("VUV - Ni-Vanuatu Vatu");
        cbFrom.addItem("WST - Samoan Tala");
        cbFrom.addItem("XCG - Caribbean Guilder");
        cbFrom.addItem("YER - Yemeni Rials");
        cbFrom.addItem("ZAR - South African Rand");
        cbFrom.addItem("ZMW - Zambian Kwacha");
        cbFrom.addItem("ZWG - Zimbabwean Dollar");
        cbFrom.addItem("DKK - Danish Krone");
        cbFrom.addItem("EUR - Euros");
        cbFrom.addItem("USD - US dollar");
        cbFrom.addItem("EUR - Euros");
        cbFrom.addItem("XCD - East Caribbean Dollar");
        cbFrom.addItem("XPF - CFP Francs");
        cbFrom.addItem("NZD - New Zealand Dollar");
        cbFrom.addItem("AUD - Australian Dollars");
        cbFrom.addItem("USD - US Dollar");
        cbFrom.addItem("USD - US Dollar");
        cbFrom.addItem("NZD - New zealand Dollar");
        cbFrom.addItem("USD - US Dollar");
        cbFrom.addItem("EUR - Euros");
        cbFrom.addItem("EUR - Euros");
        cbFrom.addItem("XCD - East Caribbean Dollar");
        cbFrom.addItem("XCD - East Caribbean Dollar");
        cbFrom.addItem("EUR - Euros");
        cbFrom.addItem("EUR - Euros");
        cbFrom.addItem("XCD - East Caribbean Dollar");
        cbFrom.addItem("EUR - Euros");
        cbFrom.addItem("XAF - Central African Francs");
        cbFrom.addItem("XOF - CFA Francs");
        cbFrom.addItem("SSP - South Sudanese Pound");
        cbFrom.addItem("USD - US Dollars");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // CODE HERE
        // To combobox currencies
        cbTo.removeAllItems();
        cbFrom.addItem("AED - Emirati Dirhams");
        cbFrom.addItem("AFN - Afghan Afghan");
        cbFrom.addItem("ALL - Albanian Leke");
        cbFrom.addItem("AMD - Armenian Drams");
        cbFrom.addItem("ANG - Dutch Guilder");
        cbFrom.addItem("AOA - Angolan Kwanzas");
        cbFrom.addItem("ARS - Argentine Pesos");
        cbFrom.addItem("AUD - Australian Dollar");
        cbFrom.addItem("AZN - Azerbaijan Manats");
        cbFrom.addItem("BAM - Bosnian Convertible Marks");
        cbFrom.addItem("BBD - Bajan Dollars");
        cbFrom.addItem("BDT - Bangladeshi Taka");
        cbFrom.addItem("BGN - Bulgarian Leva");
        cbFrom.addItem("BHD - Bahraini Dinar");
        cbFrom.addItem("BIF - Burunduin Franc");
        cbFrom.addItem("BMD - Bermudian Dollar");
        cbFrom.addItem("BND - Bruneian Dollar");
        cbFrom.addItem("BOB - Bolivian Boliviano");
        cbFrom.addItem("BRL - Brazilian Real");
        cbFrom.addItem("BSD - Bahamian Dollar");
        cbFrom.addItem("BTN - Bhutanese Ngultrum");
        cbFrom.addItem("BWP - Botswana Pula");
        cbFrom.addItem("BYN - Belarusian Ruble");
        cbFrom.addItem("BZD - Belizean Dollars");
        cbFrom.addItem("CAD - Canadian Dollar");
        cbFrom.addItem("CDF - Congolese Francs");
        cbFrom.addItem("CHF - Swiss Francs");
        cbFrom.addItem("CLP - Chilean Pesos");
        cbFrom.addItem("CNY - Chinese Yuan");
        cbFrom.addItem("COP - Colombian Peso");
        cbFrom.addItem("CRC - Costa Rican Colon");
        cbFrom.addItem("CUP - Cuban Peso");
        cbFrom.addItem("CVE - Cape Verdean Escudo");
        cbFrom.addItem("CZK - Czech Koruna");
        cbFrom.addItem("DJF - Djiboutian Francs");
        cbFrom.addItem("DKK - Danish Krone");
        cbFrom.addItem("DOP - Dominican Pesos");
        cbFrom.addItem("DZD - Algerian Dinar");
        cbFrom.addItem("EEK - Estonian Kroon");
        cbFrom.addItem("EGP - Egyptian Pound");
        cbFrom.addItem("ERN - Eritrean Nakfas");
        cbFrom.addItem("ETB - Ethiopian Birr");
        cbFrom.addItem("EUR - Euros");
        cbFrom.addItem("FJD - Fijian Dollars");
        cbFrom.addItem("FKP - Falkland Island pounds");
        cbFrom.addItem("GBP - British Pound");
        cbFrom.addItem("GEL - Georgian Lari");
        cbFrom.addItem("GGP - Guernsey Pounds");
        cbFrom.addItem("GHS - Ghanaian Cedis");
        cbFrom.addItem("GIP - Gibraltar Pounds");
        cbFrom.addItem("GMD - Gambian Dalasi");
        cbFrom.addItem("GNF - Guinean Franc");
        cbFrom.addItem("GTQ - Guatemalan Quetzales");
        cbFrom.addItem("GYD - Guyanese Dollar");
        cbFrom.addItem("HKD - Hong Kong Dollars");
        cbFrom.addItem("HNL - Honduran Lempiras");
        cbFrom.addItem("HTG - Haitian Gourdes");
        cbFrom.addItem("HUF - Hungarian Forints");
        cbFrom.addItem("IDR - Indonesian Rupiahs");
        cbFrom.addItem("ILS - Israeli New Shekels");
        cbFrom.addItem("IMP - Isle of Man Pounds");
        cbFrom.addItem("INR - Indian Rupees");
        cbFrom.addItem("IQD - Iraqi Dinars");
        cbFrom.addItem("IRR - Iranian Rials");
        cbFrom.addItem("ISK - Icelandic Kronur");
        cbFrom.addItem("JEP - Jersey Pound");
        cbFrom.addItem("JMD - Jamaican Dollars");
        cbFrom.addItem("JOD - Jordanian Dinars");
        cbFrom.addItem("JPY - Japanese Yen");
        cbFrom.addItem("KES - Kenyan Shilling");
        cbFrom.addItem("KGS - Kyrgyzstan Soms");
        cbFrom.addItem("KHR - Cambodian Riels");
        cbFrom.addItem("KMF - Comorian Francs");
        cbFrom.addItem("KPW - North Korean Won");
        cbFrom.addItem("KRW - South Korea Won");
        cbFrom.addItem("KWD - Kuwaiti Dinars");
        cbFrom.addItem("KYD - Caymanian Dollar");
        cbFrom.addItem("KZT - Kazakhstan Tenge");
        cbFrom.addItem("LAK - Lao Kips");
        cbFrom.addItem("LBP - Lebanese Pounds");
        cbFrom.addItem("LKR - Sri Lankan Rupees");
        cbFrom.addItem("LRD - Liberian Dollar");
        cbFrom.addItem("LSL - Basotho Maloti");
        cbFrom.addItem("LTL - Lithuanian Lital");
        cbFrom.addItem("LVL - Latvia Lati");
        cbFrom.addItem("LYD - Libyan Dinar");
        cbFrom.addItem("MAD - Moroccan Dirhams");
        cbFrom.addItem("MDL - Moldovan Lei");
        cbFrom.addItem("MGA - Malagasy Ariary");
        cbFrom.addItem("MKD - Macedoninan Denars");
        cbFrom.addItem("MMK - Burmese Kyats");
        cbFrom.addItem("MNT - Mongolian Tugriks");
        cbFrom.addItem("MOP - Macau Patacas");
        cbFrom.addItem("MRU - Mauritanian Ouguiyas");
        cbFrom.addItem("MUR - Mauritian Rupees");
        cbFrom.addItem("MVR - Maldivian Rufiyaa");
        cbFrom.addItem("MWK - Malawian Kwacha");
        cbFrom.addItem("MXN - Mexican Pesos");
        cbFrom.addItem("MYR - Malaysian Ringgits");
        cbFrom.addItem("MZN - Mozambican Meticais");
        cbFrom.addItem("NAD - Namibian Dollars");
        cbFrom.addItem("NGN - Nigerian Nairas");
        cbFrom.addItem("NIO - Nicaraguan Cordobas");
        cbFrom.addItem("NOK - Norwegian Kroner");
        cbFrom.addItem("NPR - Nepalese Rupees");
        cbFrom.addItem("NZD - New Zealand Dollars");
        cbFrom.addItem("OMR - Omani Rials");
        cbFrom.addItem("PAB - Panamanian Balboa");
        cbFrom.addItem("PEN - Peruvian Soles");
        cbFrom.addItem("PGK - Papua New Guinea Kina");
        cbFrom.addItem("PHP - Philippine Peso");
        cbFrom.addItem("PKR - Pakistani Rupees");
        cbFrom.addItem("PLN - Polish Zlotych");
        cbFrom.addItem("PYG - Paraguayan Guarani");
        cbFrom.addItem("QAR - Qatari Rials");
        cbFrom.addItem("RON - Romanian Lei");
        cbFrom.addItem("RSD - Serbian Dinar");
        cbFrom.addItem("RUB - Russian Rubles");
        cbFrom.addItem("RWF - Rwandan Francs");
        cbFrom.addItem("SAR - Saudi Arabian Riyals");
        cbFrom.addItem("SBD - Solomon Islands Dollar");
        cbFrom.addItem("SCR - Seychellois Rupees");
        cbFrom.addItem("SDG - Sudanese Pounds");
        cbFrom.addItem("SEK - Swedish Kronor");
        cbFrom.addItem("SGD - Singapore Dollars");
        cbFrom.addItem("SHP - Saint Helenian Pound");
        cbFrom.addItem("SLE - Sierra Leonenean Leone");
        cbFrom.addItem("SOS - Somali Shillings");
        cbFrom.addItem("SRD - Surinamese Dollars");
        cbFrom.addItem("STN - Sao Tomean Dobras");
        cbFrom.addItem("SVC - Salvadoran Colon");
        cbFrom.addItem("SYP - Syrian Pounds");
        cbFrom.addItem("SZL - Swazi Lilangeni");
        cbFrom.addItem("THB - Thai Baht");
        cbFrom.addItem("TJS - Tajikistani Somoni");
        cbFrom.addItem("TMT - Turkmenistani Manats");
        cbFrom.addItem("TND - Tunisian Dinars");
        cbFrom.addItem("TOP - Tongan Pa'anga");
        cbFrom.addItem("TRY - Turkish Lira");
        cbFrom.addItem("TTD - Trinidadian Dollars");
        cbFrom.addItem("TVD - Tuvaluan Dollar");
        cbFrom.addItem("TWD - Taiwan New Dollars");
        cbFrom.addItem("TZS - Tanzanian Shillings");
        cbFrom.addItem("UAH - Ukrainian Hryvni");
        cbFrom.addItem("UGX - Ugandan Shillings");
        cbFrom.addItem("UYU - Uruguayan Peso");
        cbFrom.addItem("UZS - Uzbekistani Sums");
        cbFrom.addItem("VES - Venezuelan Bolívares");
        cbFrom.addItem("VND - Vietnamese Dong");
        cbFrom.addItem("VUV - Ni-Vanuatu Vatu");
        cbFrom.addItem("WST - Samoan Tala");
        cbFrom.addItem("XCG - Caribbean Guilder");
        cbFrom.addItem("YER - Yemeni Rials");
        cbFrom.addItem("ZAR - South African Rand");
        cbFrom.addItem("ZMW - Zambian Kwacha");
        cbFrom.addItem("ZWG - Zimbabwean Dollar");
        cbFrom.addItem("DKK - Danish Krone");
        cbFrom.addItem("EUR - Euros");
        cbFrom.addItem("USD - US dollar");
        cbFrom.addItem("EUR - Euros");
        cbFrom.addItem("XCD - East Caribbean Dollar");
        cbFrom.addItem("XPF - CFP Francs");
        cbFrom.addItem("NZD - New Zealand Dollar");
        cbFrom.addItem("AUD - Australian Dollars");
        cbFrom.addItem("USD - US Dollar");
        cbFrom.addItem("USD - US Dollar");
        cbFrom.addItem("NZD - New zealand Dollar");
        cbFrom.addItem("USD - US Dollar");
        cbFrom.addItem("EUR - Euros");
        cbFrom.addItem("EUR - Euros");
        cbFrom.addItem("XCD - East Caribbean Dollar");
        cbFrom.addItem("XCD - East Caribbean Dollar");
        cbFrom.addItem("EUR - Euros");
        cbFrom.addItem("EUR - Euros");
        cbFrom.addItem("XCD - East Caribbean Dollar");
        cbFrom.addItem("EUR - Euros");
        cbFrom.addItem("XAF - Central African Francs");
        cbFrom.addItem("XOF - CFA Francs");
        cbFrom.addItem("SSP - South Sudanese Pound");
        cbFrom.addItem("USD - US Dollars");
        
        
        
        
        
        // CODE HERE
        // Set currency pairs
        pairSuggestions.put("AED", Arrays.asList("AED - AFN", "AED - ALL"));
        pairSuggestions.put("AFN", Arrays.asList("AFN - AED", "AFN - ALL"));
        
        cbFrom.setSelectedItem("AED");
        cbTo.setSelectedItem("AFN");
        
        appStarted = true;
        
        // CODE HERE
        // Set currency rates vlaue
        rates.put("AED",3.67);
        rates.put("AFN",70.99);
        rates.put("ALL",86.81);
        rates.put("AMD",387.57);
        rates.put("ANG",1.78);
        rates.put("AOA",918.61);
        rates.put("ARS",1173.61);
        rates.put("AUD",1.56);
        rates.put("AZN",1.69);
        rates.put("BAM",1.71);
        rates.put("BBD",2.00);
        rates.put("BDT",121.43);
        rates.put("BGN",1.71);
        rates.put("BHD",0.376);
        rates.put("BIF",2974.26);
        rates.put("BMD",1.00);
        rates.put("BND",1.31);
        rates.put("BOB",6.91);
        rates.put("BRL", 5.62);
        rates.put("BSD", 1.00);
        rates.put("BTN", 85.17);
        rates.put("BWP", 13.67);
        rates.put("BYN", 3.27);
        rates.put("BZD", 2.01);
        rates.put("CAD", 1.38);
        rates.put("CDF", 2898.74);
        rates.put("CHF", 0.82);
        rates.put("CLP", 939.14);
        rates.put("CNY", 7.27);
        rates.put("COP", 4193.60);
        rates.put("CRC", 505.39);
        rates.put("CUP", 23.96);
        rates.put("CVE", 96.81);
        rates.put("CZK", 21.88);
        rates.put("DJF", 177.9);
        rates.put("DKK", 6.55);
        rates.put("DOP", 58.89);
        rates.put("DZD", 132.4);
        rates.put("EEK", 13.73);
        rates.put("EGP", 50.8);
        rates.put("ERN", 15.00);
        rates.put("ETB", 133.67);
        rates.put("EUR", 0.88);
        rates.put("FJD", 2.26);
        rates.put("FKP", 0.74);
        rates.put("GBP", 0.74);
        rates.put("GEL", 2.74);
        rates.put("GGP", 0.74);
        rates.put("GHS", 14.25);
        rates.put("GIP", 0.74);
        rates.put("GMD", 72.16);
        rates.put("GNF", 8660.00);
        rates.put("GTQ", 7.69);
        rates.put("GYD", 209.84);
        rates.put("HKD", 7.75);
        rates.put("HNL", 25.93);
        rates.put("HTG", 130.66);
        rates.put("HUF", 355.12);
        rates.put("IDR", 16732.42);
        rates.put("ILS", 3.62);
        rates.put("IMP", 0.74);
        rates.put("INR", 85.2);
        rates.put("IQD", 1310.00);
        rates.put("IRR", 42100.00);
        rates.put("ISK", 128.00);
        rates.put("JEP", 0.74);
        rates.put("JMD", 158.21);
        rates.put("JOD", 0.709);
        rates.put("JPY", 142.00);
        rates.put("KES", 129.22);
        rates.put("KGS", 87.35);
        rates.put("KHR", 4001.92);
        rates.put("KMF", 432.00);
        rates.put("KPW", 899.00);
        rates.put("KRW", 1429.00);
        rates.put("KWD", 0.306);
        rates.put("KYD", 0.83);
        rates.put("KZT", 511.51);
        rates.put("LAK", 21625.00);
        rates.put("LBP", 89775.00);
        rates.put("LKR", 299.28);
        rates.put("LRD", 199.84);
        rates.put("LSL", 18.57);
        rates.put("LTL", 3.03);
        rates.put("LVL", 0.61);
        rates.put("LYD", 5.465);
        rates.put("MAD", 9.26);
        rates.put("MDL", 17.15);
        rates.put("MGA", 4501.00);
        rates.put("MKD", 54.00);
        rates.put("MMK", 2099.00);
        rates.put("MNT", 3572.83);
        rates.put("MOP", 7.99);
        rates.put("MRU", 39.61);
        rates.put("MUR", 45.18);
        rates.put("MVR", 15.44);
        rates.put("MWK", 1733.40);
        rates.put("MXN", 19.55);
        rates.put("MYR", 4.32);
        rates.put("MZN", 63.87);
        rates.put("NAD", 18.55);
        rates.put("NGN", 1602.54);
        rates.put("NIO", 36.78);
        rates.put("NOK", 10.38);
        rates.put("NPR", 136.47);
        rates.put("NZD", 1.68);
        rates.put("OMR", 0.384);
        rates.put("PAB", 1.00);
        rates.put("PEN", 3.66);
        rates.put("PGK", 4.08);
        rates.put("PHP", 56.00);
        rates.put("PKR", 280.85);
        rates.put("PLN", 3.75);
        rates.put("PYG", 7994.00);
        rates.put("QAR", 3.64);
        rates.put("RON", 4.38);
        rates.put("RSD", 103.00);
        rates.put("RUB", 82.06);
        rates.put("RWF", 1414.00);
        rates.put("SAR", 3.75);
        rates.put("SBD", 8.43);
        rates.put("SCR", 14.29);
        rates.put("SDG", 600.15);
        rates.put("SEK", 9.66);
        rates.put("SGD", 1.3);
        rates.put("SHP", 0.74);
        rates.put("SLE", 22.79);
        rates.put("SOS", 570.00);
        rates.put("SRD", 36.73);
        rates.put("STN", 21.71);
        rates.put("SVC", 8.75);
        rates.put("SYP", 13001.00);
        rates.put("SZL", 18.36);
        rates.put("THB", 33.02);
        rates.put("TJS", 10.35);
        rates.put("TMT", 3.49);
        rates.put("TND", 2.988);
        rates.put("TOP", 2.4);
        rates.put("TRY", 38.52);
        rates.put("TTD", 6.78);
        rates.put("TVD", 1.54);
        rates.put("TWD", 30.72);
        rates.put("TZS", 2690.17);
        rates.put("UAH", 41.6);
        rates.put("UGX", 3662.00);
        rates.put("UYU", 41.97);
        rates.put("UZS", 12949.96);
        rates.put("VES", 87.1);
        rates.put("VND", 25998.00);
        rates.put("VUV", 121.00);
        rates.put("WST", 2.77);
        rates.put("XCG", 1.78);
        rates.put("YER", 244.00);
        rates.put("ZAR", 18.36);
        rates.put("ZMW", 27.83);
        rates.put("ZWG", 26.84);
        rates.put("DKK", 6.61);
        rates.put("EUR", 0.88);
        rates.put("USD", 1.00);
        rates.put("EUR", 0.88);
        rates.put("XCD", 2.71);
        rates.put("XPF", 105.00);
        rates.put("NZD", 1.68);
        rates.put("AUD", 1.55);
        rates.put("USD", 1.00);
        rates.put("USD", 1.00);
        rates.put("NZD", 1.68);
        rates.put("USD", 1.00);
        rates.put("EUR", 0.88);
        rates.put("EUR", 0.88);
        rates.put("XCD", 2.71);
        rates.put("XCD", 2.71);
        rates.put("EUR", 0.88);
        rates.put("EUR", 0.88);
        rates.put("XCD", 2.71);
        rates.put("EUR", 0.88);
        rates.put("XAF", 580.00);
        rates.put("XOF", 580.00);
        rates.put("SSP", 600.49);
        rates.put("USD", 1.00);
        
        
        
        
        
        // Hide labels for result
        lblFromValue.setVisible(false);
        lblResult.setVisible(false);
        lblToValue.setVisible(false);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblProject = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbFrom = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbTo = new javax.swing.JComboBox<>();
        btnConvert = new javax.swing.JButton();
        lblFromValue = new javax.swing.JLabel();
        lblResult = new javax.swing.JLabel();
        lblToValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        lblProject.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lblProject.setForeground(new java.awt.Color(0, 0, 102));
        lblProject.setText("Money Converter");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Amount");

        txtAmount.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });
        txtAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAmountKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("From");

        cbFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFromActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("To");

        cbTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbToActionPerformed(evt);
            }
        });

        btnConvert.setBackground(new java.awt.Color(0, 0, 102));
        btnConvert.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnConvert.setForeground(new java.awt.Color(255, 255, 255));
        btnConvert.setText("Convert");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        lblFromValue.setText("jLabel1");

        lblResult.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblResult.setText("jLabel1");

        lblToValue.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 228, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAmount, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbFrom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbTo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnConvert, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblResult)
                                            .addComponent(lblFromValue)
                                            .addComponent(lblToValue))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(lblProject)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblProject)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbTo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(lblFromValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResult)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblToValue)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
       
        lblFromValue.setVisible(true);
        lblResult.setVisible(true);
        lblToValue.setVisible(true);
        btnConvert.setVisible(false);
        
        try {
            double amount = Double.parseDouble(txtAmount.getText());

            String from = (String) cbFrom.getSelectedItem();
            String to = (String) cbTo.getSelectedItem();

            double rateFrom = rates.get(from);
            double rateTo = rates.get(to);

            // Formula
            double result = amount / rateFrom * rateTo;

            // Show result
            lblResult.setText(String.format("%.2f %s", result, to));
            
            // Show current currency rates
            lblFromValue.setText(String.format("1.00 %s = %.2f", from, rateFrom));
            lblToValue.setText(String.format("1.00 %s = %.2f", to, rateTo / rateFrom));

        } catch (NumberFormatException e) {
            lblResult.setText("Please enter a valid number.");
        } catch (Exception ex) {
            lblResult.setText("An error occurred. Check your inputs.");
        }

        
    }//GEN-LAST:event_btnConvertActionPerformed

    private void cbFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFromActionPerformed
        
        if (!appStarted) {
            return;
        }
        
        String selected = (String) cbFrom.getSelectedItem();
        
        if (selected == null) {
            return;
        }
        
        if (!showCurrencyPairs && pairSuggestions.containsKey(selected)) {
            selectedBase = selected;
            
            // Show pair suggestions for selected base
            cbFrom.removeAllItems();
            cbFrom.insertItemAt("Change Base Currency", 0);
            cbFrom.addItem(selectedBase);
            
            for (String pair : pairSuggestions.get(selectedBase)) {
                cbFrom.addItem(pair);
            }
            
            cbFrom.setSelectedItem(selectedBase);
            showCurrencyPairs = true;            
        } else if (showCurrencyPairs) {
            if (selected.equals("Change Base Currency")) {
                // Restore original base currency list
                cbFrom.removeAllItems();
                cbFrom.addItem("AED - Emirati Dirhams");
                cbFrom.addItem("AFN - Afghan Afghan");
                cbFrom.addItem("ALL - Albanian Leke");
                cbFrom.addItem("AMD - Armenian Drams");
                cbFrom.addItem("ANG - Dutch Guilder");
                cbFrom.addItem("AOA - Angolan Kwanzas");
                cbFrom.addItem("ARS - Argentine Pesos");
                cbFrom.addItem("AUD - Australian Dollar");
                cbFrom.addItem("AZN - Azerbaijan Manats");
                cbFrom.addItem("BAM - Bosnian Convertible Marks");
                cbFrom.addItem("BBD - Bajan Dollars");
                cbFrom.addItem("BDT - Bangladeshi Taka");
                cbFrom.addItem("BGN - Bulgarian Leva");
                cbFrom.addItem("BHD - Bahraini Dinar");
                cbFrom.addItem("BIF - Burunduin Franc");
                cbFrom.addItem("BMD - Bermudian Dollar");
                cbFrom.addItem("BND - Bruneian Dollar");
                cbFrom.addItem("BOB - Bolivian Boliviano");
                cbFrom.addItem("BRL - Brazilian Real");
                cbFrom.addItem("BSD - Bahamian Dollar");
                cbFrom.addItem("BTN - Bhutanese Ngultrum");
                cbFrom.addItem("BWP - Botswana Pula");
                cbFrom.addItem("BYN - Belarusian Ruble");
                cbFrom.addItem("BZD - Belizean Dollars");
                cbFrom.addItem("CAD - Canadian Dollar");
                cbFrom.addItem("CDF - Congolese Francs");
                cbFrom.addItem("CHF - Swiss Francs");
                cbFrom.addItem("CLP - Chilean Pesos");
                cbFrom.addItem("CNY - Chinese Yuan");
                cbFrom.addItem("COP - Colombian Peso");
                cbFrom.addItem("CRC - Costa Rican Colon");
                cbFrom.addItem("CUP - Cuban Peso");
                cbFrom.addItem("CVE - Cape Verdean Escudo");
                cbFrom.addItem("CZK - Czech Koruna");
                cbFrom.addItem("DJF - Djiboutian Francs");
                cbFrom.addItem("DKK - Danish Krone");
                cbFrom.addItem("DOP - Dominican Pesos");
                cbFrom.addItem("DZD - Algerian Dinar");
                cbFrom.addItem("EEK - Estonian Kroon");
                cbFrom.addItem("EGP - Egyptian Pound");
                cbFrom.addItem("ERN - Eritrean Nakfas");
                cbFrom.addItem("ETB - Ethiopian Birr");
                cbFrom.addItem("EUR - Euros");
                cbFrom.addItem("FJD - Fijian Dollars");
                cbFrom.addItem("FKP - Falkland Island pounds");
                cbFrom.addItem("GBP - British Pound");
                cbFrom.addItem("GEL - Georgian Lari");
                cbFrom.addItem("GGP - Guernsey Pounds");
                cbFrom.addItem("GHS - Ghanaian Cedis");
                cbFrom.addItem("GIP - Gibraltar Pounds");
                cbFrom.addItem("GMD - Gambian Dalasi");
                cbFrom.addItem("GNF - Guinean Franc");
                cbFrom.addItem("GTQ - Guatemalan Quetzales");
                cbFrom.addItem("GYD - Guyanese Dollar");
                cbFrom.addItem("HKD - Hong Kong Dollars");
                cbFrom.addItem("HNL - Honduran Lempiras");
                cbFrom.addItem("HTG - Haitian Gourdes");
                cbFrom.addItem("HUF - Hungarian Forints");
                cbFrom.addItem("IDR - Indonesian Rupiahs");
                cbFrom.addItem("ILS - Israeli New Shekels");
                cbFrom.addItem("IMP - Isle of Man Pounds");
                cbFrom.addItem("INR - Indian Rupees");
                cbFrom.addItem("IQD - Iraqi Dinars");
                cbFrom.addItem("IRR - Iranian Rials");
                cbFrom.addItem("ISK - Icelandic Kronur");
                cbFrom.addItem("JEP - Jersey Pound");
                cbFrom.addItem("JMD - Jamaican Dollars");
                cbFrom.addItem("JOD - Jordanian Dinars");
                cbFrom.addItem("JPY - Japanese Yen");
                cbFrom.addItem("KES - Kenyan Shilling");
                cbFrom.addItem("KGS - Kyrgyzstan Soms");
                cbFrom.addItem("KHR - Cambodian Riels");
                cbFrom.addItem("KMF - Comorian Francs");
                cbFrom.addItem("KPW - North Korean Won");
                cbFrom.addItem("KRW - South Korea Won");
                cbFrom.addItem("KWD - Kuwaiti Dinars");
                cbFrom.addItem("KYD - Caymanian Dollar");
                cbFrom.addItem("KZT - Kazakhstan Tenge");
                cbFrom.addItem("LAK - Lao Kips");
                cbFrom.addItem("LBP - Lebanese Pounds");
                cbFrom.addItem("LKR - Sri Lankan Rupees");
                cbFrom.addItem("LRD - Liberian Dollar");
                cbFrom.addItem("LSL - Basotho Maloti");
                cbFrom.addItem("LTL - Lithuanian Lital");
                cbFrom.addItem("LVL - Latvia Lati");
                cbFrom.addItem("LYD - Libyan Dinar");
                cbFrom.addItem("MAD - Moroccan Dirhams");
                cbFrom.addItem("MDL - Moldovan Lei");
                cbFrom.addItem("MGA - Malagasy Ariary");
                cbFrom.addItem("MKD - Macedoninan Denars");
                cbFrom.addItem("MMK - Burmese Kyats");
                cbFrom.addItem("MNT - Mongolian Tugriks");
                cbFrom.addItem("MOP - Macau Patacas");
                cbFrom.addItem("MRU - Mauritanian Ouguiyas");
                cbFrom.addItem("MUR - Mauritian Rupees");
                cbFrom.addItem("MVR - Maldivian Rufiyaa");
                cbFrom.addItem("MWK - Malawian Kwacha");
                cbFrom.addItem("MXN - Mexican Pesos");
                cbFrom.addItem("MYR - Malaysian Ringgits");
                cbFrom.addItem("MZN - Mozambican Meticais");
                cbFrom.addItem("NAD - Namibian Dollars");
                cbFrom.addItem("NGN - Nigerian Nairas");
                cbFrom.addItem("NIO - Nicaraguan Cordobas");
                cbFrom.addItem("NOK - Norwegian Kroner");
                cbFrom.addItem("NPR - Nepalese Rupees");
                cbFrom.addItem("NZD - New Zealand Dollars");
                cbFrom.addItem("OMR - Omani Rials");
                cbFrom.addItem("PAB - Panamanian Balboa");
                cbFrom.addItem("PEN - Peruvian Soles");
                cbFrom.addItem("PGK - Papua New Guinea Kina");
                cbFrom.addItem("PHP - Philippine Peso");
                cbFrom.addItem("PKR - Pakistani Rupees");
                cbFrom.addItem("PLN - Polish Zlotych");
                cbFrom.addItem("PYG - Paraguayan Guarani");
                cbFrom.addItem("QAR - Qatari Rials");
                cbFrom.addItem("RON - Romanian Lei");
                cbFrom.addItem("RSD - Serbian Dinar");
                cbFrom.addItem("RUB - Russian Rubles");
                cbFrom.addItem("RWF - Rwandan Francs");
                cbFrom.addItem("SAR - Saudi Arabian Riyals");
                cbFrom.addItem("SBD - Solomon Islands Dollar");
                cbFrom.addItem("SCR - Seychellois Rupees");
                cbFrom.addItem("SDG - Sudanese Pounds");
                cbFrom.addItem("SEK - Swedish Kronor");
                cbFrom.addItem("SGD - Singapore Dollars");
                cbFrom.addItem("SHP - Saint Helenian Pound");
                cbFrom.addItem("SLE - Sierra Leonenean Leone");
                cbFrom.addItem("SOS - Somali Shillings");
                cbFrom.addItem("SRD - Surinamese Dollars");
                cbFrom.addItem("STN - Sao Tomean Dobras");
                cbFrom.addItem("SVC - Salvadoran Colon");
                cbFrom.addItem("SYP - Syrian Pounds");
                cbFrom.addItem("SZL - Swazi Lilangeni");
                cbFrom.addItem("THB - Thai Baht");
                cbFrom.addItem("TJS - Tajikistani Somoni");
                cbFrom.addItem("TMT - Turkmenistani Manats");
                cbFrom.addItem("TND - Tunisian Dinars");
                cbFrom.addItem("TOP - Tongan Pa'anga");
                cbFrom.addItem("TRY - Turkish Lira");
                cbFrom.addItem("TTD - Trinidadian Dollars");
                cbFrom.addItem("TVD - Tuvaluan Dollar");
                cbFrom.addItem("TWD - Taiwan New Dollars");
                cbFrom.addItem("TZS - Tanzanian Shillings");
                cbFrom.addItem("UAH - Ukrainian Hryvni");
                cbFrom.addItem("UGX - Ugandan Shillings");
                cbFrom.addItem("UYU - Uruguayan Peso");
                cbFrom.addItem("UZS - Uzbekistani Sums");
                cbFrom.addItem("VES - Venezuelan Bolívares");
                cbFrom.addItem("VND - Vietnamese Dong");
                cbFrom.addItem("VUV - Ni-Vanuatu Vatu");
                cbFrom.addItem("WST - Samoan Tala");
                cbFrom.addItem("XCG - Caribbean Guilder");
                cbFrom.addItem("YER - Yemeni Rials");
                cbFrom.addItem("ZAR - South African Rand");
                cbFrom.addItem("ZMW - Zambian Kwacha");
                cbFrom.addItem("ZWG - Zimbabwean Dollar");
                cbFrom.addItem("DKK - Danish Krone");
                cbFrom.addItem("EUR - Euros");
                cbFrom.addItem("USD - US dollar");
                cbFrom.addItem("EUR - Euros");
                cbFrom.addItem("XCD - East Caribbean Dollar");
                cbFrom.addItem("XPF - CFP Francs");
                cbFrom.addItem("NZD - New Zealand Dollar");
                cbFrom.addItem("AUD - Australian Dollars");
                cbFrom.addItem("USD - US Dollar");
                cbFrom.addItem("USD - US Dollar");
                cbFrom.addItem("NZD - New zealand Dollar");
                cbFrom.addItem("USD - US Dollar");
                cbFrom.addItem("EUR - Euros");
                cbFrom.addItem("EUR - Euros");
                cbFrom.addItem("XCD - East Caribbean Dollar");
                cbFrom.addItem("XCD - East Caribbean Dollar");
                cbFrom.addItem("EUR - Euros");
                cbFrom.addItem("EUR - Euros");
                cbFrom.addItem("XCD - East Caribbean Dollar");
                cbFrom.addItem("EUR - Euros");
                cbFrom.addItem("XAF - Central African Francs");
                cbFrom.addItem("XOF - CFA Francs");
                cbFrom.addItem("SSP - South Sudanese Pound");
                cbFrom.addItem("USD - US Dollars");
                
                
                cbFrom.setSelectedIndex(0);
                showCurrencyPairs = false;
            } else if (selected.contains(" - ")) {
                // Extract the pair
                String [] parts = selected.split(" - ");
                if (parts.length == 2) {
                    String from = parts[0].trim();
                    String to = parts[1].trim();
                    
                    //Set cbFrom and cbTo
                    cbFrom.setSelectedItem(from);
                    cbTo.setSelectedItem(to);
                }
            }
        }       
        
                btnConvert.setVisible(true);
                lblFromValue.setVisible(false);
                lblResult.setVisible(false);
                lblToValue.setVisible(false);
    }//GEN-LAST:event_cbFromActionPerformed

    private void txtAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountKeyReleased
        btnConvert.setVisible(true);
        lblFromValue.setVisible(false);
        lblResult.setVisible(false);
        lblToValue.setVisible(false);
        
    }//GEN-LAST:event_txtAmountKeyReleased

    private void cbToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbToActionPerformed
        btnConvert.setVisible(true);
        lblFromValue.setVisible(false);
        lblResult.setVisible(false);
        lblToValue.setVisible(false);
    }//GEN-LAST:event_cbToActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountActionPerformed


    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConverterPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvert;
    private javax.swing.JComboBox<String> cbFrom;
    private javax.swing.JComboBox<String> cbTo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblFromValue;
    private javax.swing.JLabel lblProject;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblToValue;
    private javax.swing.JTextField txtAmount;
    // End of variables declaration//GEN-END:variables
}
