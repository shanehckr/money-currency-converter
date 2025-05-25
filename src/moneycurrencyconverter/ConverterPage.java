/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package moneycurrencyconverter;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import javax.swing.SwingUtilities;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.Timer;
import javax.swing.event.DocumentListener;

/**
 *
 * @author kearl
 */
public class ConverterPage extends javax.swing.JFrame {
   
    boolean showCurrencyPairs = false;
    boolean appStarted = false;
    String selectedBase = "";
    
     // Currency list
    private final List<String> currencyList;
    
    // Currency pairs
    Map<String, List<String>> pairSuggestions = new HashMap<>();
    
    // Currency conversion rates
    Map<String, Double> rates = new HashMap<>();
    
    public ConverterPage() {
        initComponents();
        
        // Frame size
        setSize(425,610);
              
        currencyList = Arrays.asList (
                "AED - Emirati Dirhams",
                "AFN - Afghan Afghani",
                "ALL - Albanian Leke",
                "AMD - Armenian Drams",
                "ANG - Dutch Guilder",
                "AOA - Angolan Kwanzas",
                "ARS - Argentine Pesos",
                "AUD - Australian Dollar",
                "AZN - Azerbaijan Manats",
                "BAM - Bosnian Convertible Marks",
                "BBD - Bajan Dollars",
                "BDT - Bangladeshi Taka",
                "BGN - Bulgarian Leva",
                "BHD - Bahraini Dinar",
                "BIF - Burunduin Franc",
                "BMD - Bermudian Dollar",
                "BND - Bruneian Dollar",
                "BOB - Bolivian Boliviano",
                "BRL - BBRLrazilian Real",
                "BSD - Bahamian Dollar",
                "BTN - Bhutanese Ngultrum",
                "BWP - Botswana Pula",
                "BYN - Belarusian Ruble",
                "BZD - Belizean Dollars",
                "CAD - Canadian Dollar",
                "CDF - Congolese Francs",
                "CHF - Swiss Francs",
                "CLP - Chilean Pesos",
                "CNY - Chinese Yuan",
                "COP - Colombian Peso",
                "CRC - Costa Rican Colon",
                "CUP - Cuban Peso",
                "CVE - Cape Verdean Escudo",
                "CZK - Czech Koruna",
                "DJF - Djiboutian Francs",
                "DKK - Danish Krone",
                "DOP - Dominican Pesos",
                "DZD - Algerian Dinar",
                "EEK - Estonian Kroon",
                "EGP - Egyptian Pound",
                "ERN  - Eritrean Nakfas",
                "ETB - Ethiopian Birr",
                "EUR - Euros",
                "FJD - Fijian Dollars",
                "FKP - Falkland Island Pounds",
                "GBP - British Pound",
                "GEL - Georgian Lari",
                "GGP - Guernsey Pounds",
                "GHS - Ghanaian Cedis",
                "GIP - Gibraltar Pounds",
                "GMD - Gambian Dalasi",
                "GNF - Guinean Franc",
                "GTQ - Guatemalan Quetzales",
                "GYD - Guyanese Dollar",
                "HKD - Hong Kong Dollars",
                "HNL - Honduran Lempiras",
                "HTG - Haitian Gourdes",
                "HUF - Hungarian Forints",
                "IDR - Indonesian Rupiahs",
                "ILS - Israeli New Shekels",
                "IMP - Isle of Man Pounds",
                "INR - Indian Rupees",
                "IQD - Iraqi Dinars",
                "IRR - Iranian Rials",
                "ISK - Icelandic Kronur",
                "JEP - Jersey Pound",
                "JMD - Jamaican Dollars",
                "JOD - Jordanian Dinars",
                "JPY - Japanese Yen",
                "KES - Kenyan Shilling",
                "KGS - Kyrgyzstan Soms",
                "KHR - Cambodian Riels",
                "KMF - Comorian Francs",
                "KPW - North Korean Won",
                "KRW - South Korea Won",
                "KWD - Kuwaiti Dinars",
                "KYD - Caymanian Dollar",
                "KZT - Kazakhstan Tenge",
                "LAK - Lao Kips",
                "LBP - Lebanese Pounds",
                "LKR - Sri Lankan Rupees",
                "LRD - Liberian Dollar",
                "LSL - Basotho Maloti",
                "LTL - Lithuanian Lital",
                "LVL - Latvia Lati",
                "LYD - Libyan Dinar",
                "MAD - Moroccan Dirhams",
                "MDL - Moldovan Lei",
                "MGA - Malagasy Ariary",
                "MKD - Macedoninan Denars",
                "MMK - Burmese Kyats",
                "MNT - Mongolian Tugriks",
                "MOP - Macau Patacas",
                "MRU - Mauritanian Ouguiyas",
                "MUR - Mauritian Rupees",
                "MVR - Maldivian Rufiyaa",
                "MWK - Malawian Kwacha",
                "MXN - Mexican Pesos",
                "MYR - Malaysian Ringgits",
                "MZN - Mozambican Meticais",
                "NAD - Namibian Dollars",
                "NGN - Nigerian Nairas",
                "NIO - Nicaraguan Cordobas",
                "NOK - Norwegian Kroner",
                "NPR - Nepalese Rupees",
                "NZD - New Zealand Dollars",
                "OMR - Omani Rials",
                "PAB - Panamanian Balboa",
                "PEN - Peruvian Soles",
                "PGK - Papua New Guinea Kina",
                "PHP - Philippine Peso",
                "PKR - Pakistani Rupees",
                "PLN - Polish Zlotych",
                "PYG - Paraguayan Guarani",
                "QAR - Qatari Rials",
                "RON - Romanian Lei",
                "RSD - Serbian Dinar",
                "RUB - Russian Rubles",
                "RWF - Rwandan Francs",
                "SAR - Saudi Arabian Riyals",
                "SBD - Solomon Islands Dollar",
                "SCR - Seychellois Rupees",
                "SDG - Sudanese Pounds",
                "SEK - Swedish Kronor",
                "SGD - Singapore Dollars",
                "SHP - Saint Helenian Pound",
                "SLE - Sierra Leonenean Leone",
                "SOS - Somali Shillings",
                "SRD - Surinamese Dollars",
                "STN - Sao Tomean Dobras",
                "SVC - Salvadoran Colon",
                "SYP - Syrian Pounds",
                "SZL - Swazi Lilangeni",
                "THB - Thai Baht",
                "TJS - Tajikistani Somoni",
                "TMT - Turkmenistani Manats",
                "TND - Tunisian Dinars",
                "TOP - Tongan Pa'anga",
                "TRY - Turkish Lira",
                "TTD - Trinidadian Dollars",
                "TVD - Tuvaluan Dollar",
                "TWD - Taiwan New Dollars",
                "TZS - Tanzanian Shillings",
                "UAH - Ukrainian Hryvni",
                "UGX - Ugandan Shillings",
                "UYU - Uruguayan Peso",
                "UZS - Uzbekistani Sums",
                "VES - Venezuelan Bolívares",
                "VND - Vietnamese Dong",
                "VUV - Ni-Vanuatu Vatu",
                "WST - Samoan Tala",
                "XCG - Caribbean Guilder",
                "YER - Yemeni Rials",
                "ZAR - South African Rand",
                "ZMW - Zambian Kwacha",
                "ZWG - Zimbabwean Dollar",
                "DKK - Danish Krone",
                "EUR - Guadeloupe",
                "USD - Guam",
                "EUR - Martinique",
                "XCD - East Caribbean Dollar",
                "XPF - CFP Francs",
                "NZD - Niue",
                "AUD - Norfolk Islands",
                "USD - Northern Mariana Island",
                "USD - Palau",
                "NZD - Pitcairn Islands",
                "USD - Puerto Rico",
                "EUR - ReunionCHANGE",
                "EUR - Saint BarthelemyCHANGE",
                "XCD - Saint Kitts and Nevis",
                "XCD - Saint Lucia",
                "EUR - Saint Martin",
                "EUR - Saint Pierre and Miquelon",
                "XCD - East Caribbean Dollar",
                "EUR - Cyprus",
                "XAF - Central African Francs",
                "XOF - CFA Francs",
                "SSP - South Sudanese Pound",
                "USD - United States of America"
        );    
        
        cbFrom.removeAllItems();
        cbTo.removeAllItems();
         
        for (String currency: currencyList) {
            
            cbFrom.addItem(currency);
            cbTo.addItem(currency);
        }
        
        // Set combo boxes editable
        cbFrom.setEditable(true);
        cbTo.setEditable(true);
        
       searchBar(cbFrom, currencyList);
       searchBar(cbTo, currencyList);
     
       
        cbFrom.setSelectedItem("ALL - Emirati Dirhams");
        cbTo.setSelectedItem("AFN - Afghan Afghani");
        
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
    private void searchBar(JComboBox<String> comboBox, List<String> fullItemList) {
        JTextField editor = (JTextField) comboBox.getEditor().getEditorComponent();
DefaultComboBoxModel<String> originalModel = new DefaultComboBoxModel<>();
        
         for (String item : fullItemList) {
        originalModel.addElement(item);
    }
    
    final String[] oldSelection = {null};
    
    // Add a delay timer to prevent filtering on every keystroke
    final Timer filterTimer = new Timer(300, null);
    filterTimer.setRepeats(false);
    
    editor.getDocument().addDocumentListener(new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            filterTimer.restart();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            filterTimer.restart();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            filterTimer.restart();
        }
    });
    
    filterTimer.addActionListener(e -> {
        String input = editor.getText();
        if (input == null) input = "";
        
        // Save current position
        final int caretPosition = editor.getCaretPosition();
        oldSelection[0] = input;
        
        // Only show popup if input is not empty
        boolean showPopup = input.length() > 0;
        
        if (input.isEmpty()) {
            // If empty, restore the original full list
            comboBox.setModel(originalModel);
            editor.setText("");
        } else {
         
            DefaultComboBoxModel<String> filteredModel = new DefaultComboBoxModel<>();
            String inputLower = input.toLowerCase();
            
            // More efficient filtering - limit number of results to improve performance
            int maxResults = 20;
            int count = 0;
            
            for (String item : fullItemList) {
                if (item.toLowerCase().contains(inputLower)) {
                    filteredModel.addElement(item);
                    count++;
                    if (count >= maxResults) break;
                }
            }
            
            if (filteredModel.getSize() > 0) {
                comboBox.setModel(filteredModel);
                if (showPopup) {
                    comboBox.setSelectedItem(input);
                    editor.setText(input);
                    editor.setCaretPosition(caretPosition);
                    
                  
                    if (editor.isFocusOwner() && filteredModel.getSize() > 0) {
                        comboBox.showPopup();
                    }
                }
            }
        }
    });
    
   
    editor.addFocusListener(new java.awt.event.FocusAdapter() {
        @Override
        public void focusGained(java.awt.event.FocusEvent evt) {
            if (editor.getText().length() > 0) {
                filterTimer.restart();
            }
        }
    });
    
   
    editor.addFocusListener(new java.awt.event.FocusAdapter() {
        @Override
        public void focusLost(java.awt.event.FocusEvent evt) {
            comboBox.hidePopup();
        }
    });
    
   
    comboBox.addActionListener(evt -> {
        if (comboBox.getSelectedItem() != null) {
            String selected = comboBox.getSelectedItem().toString();
            if (!selected.equals(oldSelection[0])) {
                editor.setText(selected);
                comboBox.hidePopup();
            }
        }
    });
}
    
   
    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
     
           try {
            // User input
            double amount = Double.parseDouble(txtAmount.getText());
            
            // Extract curreny from combo box
            String fromFull = cbFrom.getSelectedItem().toString();
            String toFull = cbTo.getSelectedItem().toString();

            String fromCode = fromFull.split(" ")[0];
            String toCode = toFull.split(" ")[0];
            
            double rateFrom = rates.get(fromCode);
            double rateTo = rates.get(toCode);

            // Formula
            double result = amount / rateFrom * rateTo;
            double reverseResult = amount / rateTo * rateFrom;
            
            lblFromValue.setText(String.format(" %s =", fromCode));
            // Show result
            lblResult.setText(String.format("%.8f %s", result, toCode));
            // Show current currency rates
            lblToValue.setText(String.format(" %s = %.5f %s", toCode, reverseResult, fromCode));
            
            lblFromValue.setVisible(true);
            lblResult.setVisible(true);
            lblToValue.setVisible(true);
            btnConvert.setVisible(false);

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
      
        String selectedFull = (String) cbFrom.getSelectedItem();

        if (selectedFull == null) return;

        if (!showCurrencyPairs && pairSuggestions.containsKey(selectedFull)) {
            selectedBase = selectedFull;

            cbFrom.removeAllItems();
            cbFrom.insertItemAt("Change Base Currency", 0);

            // Add selected base currency first
            cbFrom.addItem(selectedFull);

            // Add currency pairs directly (already formatted)
            List<String> pairList = pairSuggestions.get(selectedFull);
            for (String pair : pairList) {
                cbFrom.addItem(pair);
            }

            cbFrom.setSelectedIndex(1);
            showCurrencyPairs = true;

        } else if (showCurrencyPairs) {
            if (selectedFull.equals("Change Base Currency")) {
                // Restore base currency options
                cbFrom.removeAllItems();
                for (String currency : currencyList) {
                    cbFrom.addItem(currency);
                }
                cbFrom.setSelectedIndex(0);
                showCurrencyPairs = false;

            } else if (selectedFull.contains(" - ")) {
                // Handle pair selection
                String[] parts = selectedFull.split(" - ");
                if (parts.length == 2) {
                    String fromCode = parts[0].trim();
                    String toCode = parts[1].trim();

                    // Set cbFrom and cbTo to match selected currencies from currencyList
                    for (String currency : currencyList) {
                        if (currency.startsWith(fromCode)) {
                            cbFrom.setSelectedItem(currency);
                        }
                        if (currency.startsWith(toCode)) {
                            cbTo.setSelectedItem(currency);
                        }
                    }
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
