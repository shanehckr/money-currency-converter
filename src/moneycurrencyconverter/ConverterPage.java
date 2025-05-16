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
        cbFrom.addItem("AED");
        cbFrom.addItem("AFN");
        cbFrom.addItem("ALL");
        cbFrom.addItem("AMD");
        cbFrom.addItem("ANG");
        cbFrom.addItem("AOA");
        cbFrom.addItem("ARS");
        cbFrom.addItem("AUD");
        cbFrom.addItem("AZN");
        cbFrom.addItem("BAM");
        cbFrom.addItem("BBD");
        cbFrom.addItem("BDT");
        cbFrom.addItem("BGN");
        cbFrom.addItem("BHD");
        cbFrom.addItem("BIF");
        cbFrom.addItem("BMD");
        cbFrom.addItem("BND");
        cbFrom.addItem("BOB");
        cbFrom.addItem("BRL");
        cbFrom.addItem("BSD");
        cbFrom.addItem("BTN");
        cbFrom.addItem("BWP");
        cbFrom.addItem("BYN");
        cbFrom.addItem("BZD");
        cbFrom.addItem("CAD");
        cbFrom.addItem("CDF");
        cbFrom.addItem("CHF");
        cbFrom.addItem("CLP");
        cbFrom.addItem("CNY");
        cbFrom.addItem("COP");
        cbFrom.addItem("CRC");
        cbFrom.addItem("CUP");
        cbFrom.addItem("CVE");
        cbFrom.addItem("CZK");
        cbFrom.addItem("DJF");
        cbFrom.addItem("DKK");
        cbFrom.addItem("DOP");
        cbFrom.addItem("DZD");
        cbFrom.addItem("EEK");
        cbFrom.addItem("EGP");
        cbFrom.addItem("ERN");
        cbFrom.addItem("ETB");
        cbFrom.addItem("EUR");
        cbFrom.addItem("FJD");
        cbFrom.addItem("FKP");
        cbFrom.addItem("GBP");
        cbFrom.addItem("GEL");
        cbFrom.addItem("GGP");
        cbFrom.addItem("GHS");
        cbFrom.addItem("GIP");
        cbFrom.addItem("GMD");
        cbFrom.addItem("GNF");
        cbFrom.addItem("GTQ");
        cbFrom.addItem("GYD");
        cbFrom.addItem("HKD");
        cbFrom.addItem("HNL");
        cbFrom.addItem("HTG");
        cbFrom.addItem("HUF");
        cbFrom.addItem("IDR");
        cbFrom.addItem("ILS");
        cbFrom.addItem("IMP");
        cbFrom.addItem("INR");
        cbFrom.addItem("IQD");
        cbFrom.addItem("IRR");
        cbFrom.addItem("ISK");
        cbFrom.addItem("JEP");
        cbFrom.addItem("JMD");
        cbFrom.addItem("JOD");
        cbFrom.addItem("JPY");
        cbFrom.addItem("KES");
        cbFrom.addItem("KJS");
        cbFrom.addItem("KHR");
        cbFrom.addItem("KMF");
        cbFrom.addItem("KPW");
        cbFrom.addItem("KRW");
        cbFrom.addItem("KWD");
        cbFrom.addItem("KYD");
        cbFrom.addItem("KZT");
        cbFrom.addItem("LAK");
        cbFrom.addItem("LBP");
        cbFrom.addItem("LKR");
        cbFrom.addItem("LRD");
        cbFrom.addItem("LSL");
        cbFrom.addItem("LTL");
        cbFrom.addItem("LVL");
        cbFrom.addItem("LYD");
        cbFrom.addItem("MAD");
        cbFrom.addItem("MDL");
        cbFrom.addItem("MGA");
        cbFrom.addItem("MKD");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // CODE HERE
        // To combobox currencies
        cbTo.removeAllItems();
        cbTo.addItem("AED");
        cbTo.addItem("AFN");
        cbTo.addItem("ALL");
        cbTo.addItem("AMD"); 
        cbTo.addItem("ANG");
        cbTo.addItem("AOA");
        cbTo.addItem("ARS");
        cbTo.addItem("AUD");
        cbTo.addItem("AZN");
        cbTo.addItem("BAM");
        cbTo.addItem("BBD");
        cbTo.addItem("BDT");
        cbTo.addItem("BGN");
        cbTo.addItem("BHD");
        cbTo.addItem("BIF");
        cbTo.addItem("BMD");
        cbTo.addItem("BND");
        cbTo.addItem("BOB");
        cbTo.addItem("BRL");
        cbTo.addItem("BSD");
        cbTo.addItem("BTN");
        cbTo.addItem("BWP"); 
        cbTo.addItem("BYN");
        cbTo.addItem("BZD");
        cbTo.addItem("CAD");
        cbTo.addItem("CDF");
        cbTo.addItem("CHF");
        cbTo.addItem("CLP");
        cbTo.addItem("CNY");
        cbTo.addItem("COP");
        cbTo.addItem("CRC");
        cbTo.addItem("CUP");
        cbTo.addItem("CBE");
        cbTo.addItem("CZK");
        cbTo.addItem("DJF");
        cbTo.addItem("DKK");
        cbTo.addItem("DOP");
        cbTo.addItem("DZD");
        cbTo.addItem("EEK");
        cbTo.addItem("EJP");
        cbTo.addItem("ERN");
        cbTo.addItem("ETB");
        cbTo.addItem("EUR");
        cbTo.addItem("FJD");
        cbTo.addItem("FKP");
        cbTo.addItem("GBP");
        cbTo.addItem("GEL");
        cbTo.addItem("GGP");
        cbTo.addItem("GHS");
        cbTo.addItem("GIP");
        cbTo.addItem("GMD");
        cbTo.addItem("GNF");
        cbTo.addItem("GTQ");
        cbTo.addItem("GYD");
        cbTo.addItem("HKD");
        cbTo.addItem("HNL");
        cbTo.addItem("HTG");
        cbTo.addItem("HUF"); 
        cbTo.addItem("IDR");
        cbTo.addItem("ILS");
        cbTo.addItem("IMP");
        cbTo.addItem("INR");
        cbTo.addItem("IQD");
        cbTo.addItem("IRR");
        cbTo.addItem("ISK");
        cbTo.addItem("JEP");
        cbTo.addItem("JMD");
        cbTo.addItem("JOD");
        cbTo.addItem("JPY");
        cbTo.addItem("KES");
        cbTo.addItem("KJS");
        cbTo.addItem("KHR");
        cbTo.addItem("KMF");
        cbTo.addItem("KPW");
        cbTo.addItem("KRW");
        cbTo.addItem("KWD"); 
        cbTo.addItem("KYD");
        cbTo.addItem("KZT");
        cbTo.addItem("LAK");
        cbTo.addItem("LBP");
        cbTo.addItem("LKR");
        cbTo.addItem("LRD");
        cbTo.addItem("LSL");
        cbTo.addItem("LTL");
        cbTo.addItem("LVL");
        cbTo.addItem("LYD");
        cbTo.addItem("MAD");
        cbTo.addItem("MDL");
        cbTo.addItem("MGA");
        cbTo.addItem("MKD");
        
        
        
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
                cbFrom.addItem("AED");
                cbFrom.addItem("AFN");
                cbFrom.addItem("ALL");
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
