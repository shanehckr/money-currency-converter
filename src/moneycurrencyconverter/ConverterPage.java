package moneycurrencyconverter;

import java.awt.Component;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.*;

public class ConverterPage extends javax.swing.JFrame {

    boolean appStarted = false;
    String selectedBase = "";

    // Currency list
    private final List<String> currencyList;

    // Currency conversion rates
    Map<String, Double> rates = new HashMap<>();

    /**
     * This constructor set up the currency converter page.
     *
     * It initializes the window size, loads the currency list and its rates,
     * fills the "From" and "To" combo boxes with currencies, makes them
     * editable with search capability, and sets default selected currencies.
     */
    public ConverterPage() {
        initComponents();

        this.setLocationRelativeTo(null);

        currencyList = Arrays.asList(
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
                "BRL - Brazilian Real",
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
                "DKK - Denmark",
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
                "DKK - Greenland",
                "EUR - Guadeloupe",
                "USD - Guam",
                "EUR - Martinique",
                "XCD - East Caribbean Dollar",
                "XPF - CFP Francs",
                "NZD - Niue",
                "AUD - Norfolk Islands",
                "USD - Northern Mariana Island",
                "USD - Palau",
                "NZD -Pitcairn Islands",
                "USD - Puerto Rico",
                "EUR - Rèunion",
                "EUR - Saint Barthèlemy",
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

        rates.put("AED", 3.67);
        rates.put("AFN", 70.99);
        rates.put("ALL", 86.81);
        rates.put("AMD", 387.57);
        rates.put("ANG", 1.78);
        rates.put("AOA", 918.61);
        rates.put("ARS", 1173.61);
        rates.put("AUD", 1.56);
        rates.put("AZN", 1.69);
        rates.put("BAM", 1.71);
        rates.put("BBD", 2.00);
        rates.put("BDT", 121.43);
        rates.put("BGN", 1.71);
        rates.put("BHD", 0.376);
        rates.put("BIF", 2974.26);
        rates.put("BMD", 1.00);
        rates.put("BND", 1.31);
        rates.put("BOB", 6.91);
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

        cbFrom.removeAllItems();
        cbTo.removeAllItems();
        
        for (String currency : currencyList) {
            cbFrom.addItem(currency);
            cbTo.addItem(currency);
        }

        cbFrom.setEditable(true);
        cbTo.setEditable(true);

        searchBar(cbFrom, currencyList);
        searchBar(cbTo, currencyList);

        cbFrom.setSelectedItem("AED - Emirati Dirhams");
        cbTo.setSelectedItem("AFN - Afghan Afghani");
        
        appStarted = true;
        limitAmountInput();
        
        // Make labels not visible if there's no conversion
        lblFromValue.setVisible(false);
        lblResult.setVisible(false);
        lblToValue.setVisible(false);
    }

    /**
     * This method limits the user input in the amount text field to a maximum of 12 digits.
     */    
    
    private void limitAmountInput() {
        ((AbstractDocument) txtAmount.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                String current = fb.getDocument().getText(0, fb.getDocument().getLength());
                StringBuilder newText = new StringBuilder(current);
                newText.replace(offset, offset + length, text);

                if (newText.toString().matches("\\d{0,12}(\\.\\d*)?")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }

            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                replace(fb, offset, 0, string, attr);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paddingPanelOne = new javax.swing.JPanel();
        paddingPanelTwo = new javax.swing.JPanel();
        lblProject = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        lblFrom = new javax.swing.JLabel();
        cbFrom = new javax.swing.JComboBox<>();
        lblTo = new javax.swing.JLabel();
        cbTo = new javax.swing.JComboBox<>();
        btnConvert = new javax.swing.JButton();
        lblFromValue = new javax.swing.JLabel();
        lblResult = new javax.swing.JLabel();
        lblToValue = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Money Currency Converter");
        setResizable(false);

        paddingPanelOne.setBackground(new java.awt.Color(0, 0, 102));

        lblProject.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        lblProject.setForeground(new java.awt.Color(0, 0, 102));
        lblProject.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProject.setText("Money Converter");

        lblAmount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAmount.setForeground(new java.awt.Color(153, 153, 153));
        lblAmount.setText("Amount");

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

        lblFrom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFrom.setForeground(new java.awt.Color(153, 153, 153));
        lblFrom.setText("From");

        cbFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFromActionPerformed(evt);
            }
        });

        lblTo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTo.setForeground(new java.awt.Color(153, 153, 153));
        lblTo.setText("To");

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
        btnConvert.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        lblFromValue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFromValue.setText("jLabel1");

        lblResult.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblResult.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblResult.setText("jLabel1");

        lblToValue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblToValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblToValue.setText("jLabel1");

        javax.swing.GroupLayout paddingPanelTwoLayout = new javax.swing.GroupLayout(paddingPanelTwo);
        paddingPanelTwo.setLayout(paddingPanelTwoLayout);
        paddingPanelTwoLayout.setHorizontalGroup(
            paddingPanelTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paddingPanelTwoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(paddingPanelTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paddingPanelTwoLayout.createSequentialGroup()
                        .addComponent(lblAmount)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(paddingPanelTwoLayout.createSequentialGroup()
                        .addComponent(lblFromValue)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paddingPanelTwoLayout.createSequentialGroup()
                        .addGroup(paddingPanelTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblResult, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblToValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paddingPanelTwoLayout.createSequentialGroup()
                                .addGroup(paddingPanelTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paddingPanelTwoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(paddingPanelTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAmount, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbFrom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbTo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnConvert, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(30, 30, 30))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paddingPanelTwoLayout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(lblProject)
                .addGap(73, 73, 73))
        );
        paddingPanelTwoLayout.setVerticalGroup(
            paddingPanelTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paddingPanelTwoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblProject)
                .addGap(33, 33, 33)
                .addComponent(lblAmount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblFrom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTo)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paddingPanelOneLayout = new javax.swing.GroupLayout(paddingPanelOne);
        paddingPanelOne.setLayout(paddingPanelOneLayout);
        paddingPanelOneLayout.setHorizontalGroup(
            paddingPanelOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paddingPanelOneLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(paddingPanelOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paddingPanelOneLayout.createSequentialGroup()
                        .addComponent(btnCancel)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paddingPanelOneLayout.createSequentialGroup()
                        .addComponent(paddingPanelTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
        );
        paddingPanelOneLayout.setVerticalGroup(
            paddingPanelOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paddingPanelOneLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(paddingPanelTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        getContentPane().add(paddingPanelOne, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * This method filters the items in a combo box based on the user's search input.
     * 
     * @param comboBox the JComboBox to be filtered
     * @param fullItemList the complete list of items available for selection
     */
    
    private void searchBar(JComboBox<String> comboBox, List<String> fullItemList) {
        JTextField editor = (JTextField) comboBox.getEditor().getEditorComponent();
        DefaultComboBoxModel<String> originalModel = new DefaultComboBoxModel<>();

        for (String item : fullItemList) {
            originalModel.addElement(item);
        }

        final String[] oldSelection = {null};
        final boolean[] UpdatingModel = {false};
        final boolean[] dropdownClicked = {false};

        // Add a delay timer to prevent filtering on every keystroke
        final Timer filterTimer = new Timer(0, null);
        filterTimer.setRepeats(false);

        // Get the arrow button component
        Component[] components = comboBox.getComponents();
        JButton arrowButton = null;
        for (Component comp : components) {
            if (comp instanceof JButton) {
                arrowButton = (JButton) comp;
                break;
            }
        }

        if (arrowButton != null) {
            arrowButton.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    dropdownClicked[0] = true;

                    if (!UpdatingModel[0]) {
                        UpdatingModel[0] = true;
                        comboBox.setModel(originalModel);
                        UpdatingModel[0] = false;
                    }
                }
            });
        }

        comboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            @Override
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent e) {
                if (dropdownClicked[0]) {
                    if (!UpdatingModel[0]) {
                        UpdatingModel[0] = true;
                        comboBox.setModel(originalModel);
                        UpdatingModel[0] = false;
                    }
                    dropdownClicked[0] = false;
                }
            }

            @Override
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent e) {
                dropdownClicked[0] = false;
            }

            @Override
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent e) {
                dropdownClicked[0] = false;
            }
        });

        editor.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if (!UpdatingModel[0] && !dropdownClicked[0]) {
                    filterTimer.restart();
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if (!UpdatingModel[0] && !dropdownClicked[0]) {
                    filterTimer.restart();
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                if (!UpdatingModel[0] && !dropdownClicked[0]) {
                    filterTimer.restart();
                }
            }
        });

        filterTimer.addActionListener(e -> {
            if (UpdatingModel[0] || dropdownClicked[0]) {
                return;
            }
            String input = editor.getText();
            if (input == null) {
                input = "";
            }

            final int caretPosition = editor.getCaretPosition();
            oldSelection[0] = input;

            boolean showPopup = input.length() > 0;

            if (input.isEmpty()) {

                UpdatingModel[0] = true;
                comboBox.setModel(originalModel);
                editor.setText("");
                UpdatingModel[0] = false;
            } else {

                DefaultComboBoxModel<String> filteredModel = new DefaultComboBoxModel<>();
                String inputLower = input.toLowerCase();

                int maxResults = 20;
                int count = 0;

                for (String item : fullItemList) {
                    if (item.toLowerCase().contains(inputLower)) {
                        filteredModel.addElement(item);
                        count++;
                        if (count >= maxResults) {
                            break;
                        }
                    }
                }

                if (filteredModel.getSize() > 0) {
                    UpdatingModel[0] = true;
                    comboBox.setModel(filteredModel);

                    if (showPopup) {
                        comboBox.setSelectedItem(input);
                        editor.setText(input);
                        editor.setCaretPosition(Math.min(caretPosition, input.length()));

                        if (editor.isFocusOwner() && filteredModel.getSize() > 0) {
                            comboBox.showPopup();
                        }
                    }
                    UpdatingModel[0] = false;
                }
            }
        });

        editor.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (editor.getText().length() > 0 && !UpdatingModel[0] && !dropdownClicked[0]) {
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
            if (UpdatingModel[0]) {
                return;
            }
            if (comboBox.getSelectedItem() != null) {
                String selected = comboBox.getSelectedItem().toString();
                if (!selected.equals(oldSelection[0])) {
                    UpdatingModel[0] = true;

                    editor.setText(selected);
                    oldSelection[0] = selected;

                    comboBox.hidePopup();

                    SwingUtilities.invokeLater(() -> {
                        comboBox.setModel(originalModel);
                        comboBox.setSelectedItem(selected);
                        UpdatingModel[0] = false;
                    });
                }
            }
        });
    }

    /**
     * This method handles the currency conversion logic when the Convert button
     * is clicked. Converts the entered amount from one currency to another
     * using exchange rates.
     *
     * - Gets amount and selected currencies - Retrieves exchange rates from the
     * rates map
     * - Calculates and displays the converted and reverse amounts 
     * -  Shows error if input is invalid
     *
     * @param evt The action event triggered by clicking the Convert button.
     */

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed

        try {
            double amount = Double.parseDouble(txtAmount.getText());

            String fromFull = cbFrom.getSelectedItem().toString();
            String toFull = cbTo.getSelectedItem().toString();

            String fromCode = fromFull.split(" ")[0];
            String toCode = toFull.split(" ")[0];

            double rateFrom = rates.get(fromCode);
            double rateTo = rates.get(toCode);

            double result = amount / rateFrom * rateTo;
            double reverseResult = amount / rateTo * rateFrom;

            lblFromValue.setText(String.format(" %s =", fromCode));
            lblResult.setText(String.format("%.2f %s", result, toCode));
            lblToValue.setText(String.format(" %.2f %s = %.2f %s", amount, toCode, reverseResult, fromCode));

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

    /**
     * This method runs when the user selects an item in the "From" currency
     * combo box. It sets the selected currency as the base currency for
     * conversion.
     *
     * It also shows the Convert Button and hides the result labels until
     * conversion.
     *
     * @param evt The event triggered by selecting an item in the combo box.
     */

    private void cbFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFromActionPerformed

        if (!appStarted) {
            return;
        }

        String selectedFull = (String) cbFrom.getSelectedItem();
        if (selectedFull == null) {
            return;
        }

        selectedBase = selectedFull;

        btnConvert.setVisible(true);
        lblFromValue.setVisible(false);
        lblResult.setVisible(false);
        lblToValue.setVisible(false);

    }//GEN-LAST:event_cbFromActionPerformed

    /**
     * This method runs when a key is released in the amount text field. It
     * resets the result view by showing the Convert button and hiding ll result
     * labels.
     *
     * @param evt The key event triggered when a key is released.
     */

    private void txtAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountKeyReleased
        btnConvert.setVisible(true);
        lblFromValue.setVisible(false);
        lblResult.setVisible(false);
        lblToValue.setVisible(false);
    }//GEN-LAST:event_txtAmountKeyReleased

    /**
     * This method runs when the user selects an item in the "To" currency combo
     * box. It shows the Convert Button and hides the result labels to reset the
     * view.
     *
     * @param evt
     */

    private void cbToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbToActionPerformed
        btnConvert.setVisible(true);
        lblFromValue.setVisible(false);
        lblResult.setVisible(false);
        lblToValue.setVisible(false);
    }//GEN-LAST:event_cbToActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed

    }//GEN-LAST:event_txtAmountActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // Exit the application
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConverterPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConvert;
    private javax.swing.JComboBox<String> cbFrom;
    private javax.swing.JComboBox<String> cbTo;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblFrom;
    private javax.swing.JLabel lblFromValue;
    private javax.swing.JLabel lblProject;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblTo;
    private javax.swing.JLabel lblToValue;
    private javax.swing.JPanel paddingPanelOne;
    private javax.swing.JPanel paddingPanelTwo;
    private javax.swing.JTextField txtAmount;
    // End of variables declaration//GEN-END:variables
}
