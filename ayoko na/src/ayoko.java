
import javax.swing.ImageIcon;

public class ayoko.na extends javax.swing.JFrame {
    // ======== ADD THIS INNER CLASS ========
    private class ComboItem {
        private String text;
        private Icon icon;

        public ComboItem(String text, Icon icon) {
            this.text = text;
            this.icon = icon;
        }

        public String getText() {
            return text;
        }

        public Icon getIcon() {
            return icon;
        }

        @Override
        public String toString() {
            return text;
        }
    }

    // ======== ADD THIS RENDERER CLASS ========
    private class ComboBoxRenderer extends DefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value,
                int index, boolean isSelected, boolean cellHasFocus) {
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            
            if (value instanceof ComboItem) {
                ComboItem item = (ComboItem)value;
                setText(item.getText());
                setIcon(item.getIcon());
            }
            return this;
        }
    }

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        
        // ======== ADD THIS LINE TO SET RENDERER ========
        jComboBox1.setRenderer(new ComboBoxRenderer());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // ======== MODIFY THIS SECTION ========
        // First remove the existing model setup
        // Then add items with icons
        ImageIcon usFlag = createImageIcon("Screenshot (1).png", "USD");
        ImageIcon euFlag = createImageIcon("Screenshot (1).png", "EUR");
        ImageIcon jpFlag = createImageIcon("/flags/jp.png", "JPY");
        
        // Scale images if needed
        usFlag = scaleIcon(usFlag, 20, 20);
        euFlag = scaleIcon(euFlag, 20, 20);
        jpFlag = scaleIcon(jpFlag, 20, 20);
        
        // Add items to combo box
        jComboBox1.addItem(new ComboItem("US Dollar", usFlag));
        jComboBox1.addItem(new ComboItem("Euro", euFlag));
        jComboBox1.addItem(new ComboItem("Japanese Yen", jpFlag));
        // ======== END OF MODIFICATION ========

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    // ======== ADD THESE HELPER METHODS ========
    private ImageIcon createImageIcon(String path, String description) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
    
    private ImageIcon scaleIcon(ImageIcon icon, int width, int height) {
        if (icon == null) return null;
        Image img = icon.getImage();
        Image scaledImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImg);
    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // ======== MODIFY THIS METHOD ========
        ComboItem selected = (ComboItem)jComboBox1.getSelectedItem();
        System.out.println("Selected currency: " + selected.getText());
        // Add your currency conversion logic here
    }                                          

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<ComboItem> jComboBox1; // Change String to ComboItem
    // End of variables declaration                   
}