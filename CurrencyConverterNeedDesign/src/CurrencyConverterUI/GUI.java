/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CurrencyConverterUI;
import currencyconverter.CurrencyConverter;
import javax.swing.table.DefaultTableModel;
import org.json.JSONObject;
import java.awt.Insets;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;

/**
 *
 * @author MNami
 */
public class GUI extends javax.swing.JFrame {

     // Define colors (these should be at the class level)
    private final Color COLOR_BACKGROUND = Color.WHITE;
    private final Color COLOR_INPUT_BACKGROUND = Color.WHITE;
    private final Color COLOR_TEXT_DARK = new Color(50, 50, 50);
    private final Color COLOR_TEXT_LIGHT = Color.WHITE;
    private final Color COLOR_ACCENT = new Color(74, 144, 226);
    private final Color COLOR_TABLE_GRID = new Color(220, 220, 220);
    private final Color COLOR_TABLE_HEADER_BG = new Color(225, 225, 230);
    private final Color COLOR_TABLE_HEADER_FG = new Color(50, 50, 50);
   
/**
     * Creates new form GUI
     * 
     */
        public GUI() {
        initComponents();
        applyCustomStyles();
    }
        
        private void applyCustomStyles() {
        // --- Main Frame ---
        // This is the key change to make the overall background consistent
        jPanel1.setBackground(COLOR_BACKGROUND); // For the left navigation panel
        jPanel2.setBackground(COLOR_BACKGROUND); // For the content of the first tab (Bulk Exchange)
        jPanel3.setBackground(COLOR_BACKGROUND); // For the content of the second tab (Specific Exchange)
        // You might also want to set the JTabbedPane background if it shows through,
        // but often styling the content panels is sufficient.
        // jTabbedPane1.setBackground(COLOR_BACKGROUND);


        // --- Labels ---
        jLabel1.setForeground(COLOR_TEXT_DARK);
        jLabel1.setFont(new Font("Segoe UI", Font.PLAIN, 13)); // Example of changing font

        jLabel2.setForeground(COLOR_TEXT_DARK);
        jLabel2.setFont(new Font("Segoe UI", Font.PLAIN, 13));

        // --- ComboBox ---
        jComboBoxBaseCurrency.setBackground(COLOR_INPUT_BACKGROUND);
        jComboBoxBaseCurrency.setForeground(COLOR_TEXT_DARK);
        jComboBoxBaseCurrency.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        // Note: Full ComboBox styling can be tricky and L&F dependent.
        // For deeper customization, you might need a custom renderer or a modern L&F.

        // --- TextField ---
        jTextFieldAmount.setBackground(COLOR_INPUT_BACKGROUND);
        jTextFieldAmount.setForeground(COLOR_TEXT_DARK);
        jTextFieldAmount.setCaretColor(COLOR_ACCENT); // Cursor color
        jTextFieldAmount.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        jTextFieldAmount.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200)), // Subtle border
            BorderFactory.createEmptyBorder(5, 8, 5, 8) // Padding inside
        ));


        // --- Button ---
        ExchangeButton.setBackground(COLOR_ACCENT);
        ExchangeButton.setForeground(COLOR_TEXT_LIGHT);
        ExchangeButton.setFont(new Font("Segoe UI", Font.BOLD, 13));
        ExchangeButton.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(COLOR_ACCENT.darker(), 1), // Darker border for depth
            BorderFactory.createEmptyBorder(8, 15, 8, 15) // Padding
        ));
        // Remove focus paint for a cleaner look if desired
        // ExchangeButton.setFocusPainted(false);


        // --- Table & ScrollPane ---
        jTable1.setBackground(COLOR_INPUT_BACKGROUND);
        jTable1.setForeground(COLOR_TEXT_DARK);
        jTable1.setGridColor(COLOR_TABLE_GRID);
        jTable1.setRowHeight(25); // Increase row height for better readability
        jTable1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        jTable1.setSelectionBackground(COLOR_ACCENT.brighter().brighter()); // Lighter blue
        jTable1.setSelectionForeground(COLOR_TEXT_DARK);


        // Table Header
        jTable1.getTableHeader().setBackground(COLOR_TABLE_HEADER_BG); // This sets the background color
        jTable1.getTableHeader().setForeground(COLOR_TABLE_HEADER_FG); // This sets the text color
        jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jTable1.getTableHeader().setBorder(BorderFactory.createLineBorder(new Color(200,200,200)));


        // ScrollPane (that contains the table)
        jScrollPane1.getViewport().setBackground(COLOR_INPUT_BACKGROUND); // Important for the area around the table
        jScrollPane1.setBorder(BorderFactory.createLineBorder(new Color(200,200,200))); // Border for the scroll pane
        // jScrollPane1.setBackground(COLOR_BACKGROUND); // For scrollbar track, L&F dependent
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CurrencyConverter.putItem();
        jPanel1 = new javax.swing.JPanel();
        jButtonBulkExchangeTab = new javax.swing.JButton();
        jButtonSpecificExchangeTab = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxBaseCurrency = new javax.swing.JComboBox<>();
        jTextFieldAmount = new javax.swing.JTextField();
        ExchangeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jComboBoxBaseCurrencySpecific = new javax.swing.JComboBox<>();
        jTextFieldAmountSpecific = new javax.swing.JTextField();
        jLabelEnterAmount = new javax.swing.JLabel();
        jLabelBaseCurrency = new javax.swing.JLabel();
        jButtonExchangeSpecific = new javax.swing.JButton();
        jComboBoxBaseCurrencySpecific1 = new javax.swing.JComboBox<>();
        jLabelBaseCurrency1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelConvertedAmount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonBulkExchangeTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CurrencyConverterUI/images/money (1).png"))); // NOI18N);
    jButtonBulkExchangeTab.setMargin(new Insets(5, 8, 5, 8));
    jButtonBulkExchangeTab.setText("Bulk Exchange");
    jButtonBulkExchangeTab.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonBulkExchangeTabActionPerformed(evt);
        }
    });
    jPanel1.add(jButtonBulkExchangeTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 190, 70));

    jButtonSpecificExchangeTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CurrencyConverterUI/images/icons8-currency-exchange-40.png"))); // NOI18N);
    jButtonSpecificExchangeTab.setText("Specific Exchange");
    jButtonSpecificExchangeTab.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonSpecificExchangeTabActionPerformed(evt);
        }
    });
    jPanel1.add(jButtonSpecificExchangeTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 190, 70));

    getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 490));

    jLabel1.setText("Base Currency");

    jLabel2.setText("Enter Amount :");

    jComboBoxBaseCurrency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Euro", "United States Dollar", "Japanese Yen", "Bulgarian Lev", "Czech Koruna", "Danish Krone", "British Pound", "Hungarian Forint", "Polish Złoty", "Romanian Leu", "Swedish Krona", "Swiss Franc", "Icelandic Króna", "Norwegian Krone", "Croatian Kuna", "Russian Ruble", "Turkish Lira", "Australian Dollar", "Brazilian Real", "Canadian Dollar", "Chinese Yuan Renminbi", "Hong Kong Dollar", "Indonesian Rupiah", "Israeli New Shekel", "Indian Rupee", "South Korean Won", "Mexican Peso", "Malaysian Ringgit", "New Zealand Dollar", "Philippine Peso", "Singapore Dollar", "Thai Baht", "South African Rand" }));
    jComboBoxBaseCurrency.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jComboBoxBaseCurrencyActionPerformed(evt);
        }
    });

    jTextFieldAmount.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextFieldAmountActionPerformed(evt);
        }
    });

    ExchangeButton.setText("Exchange");
    ExchangeButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            ExchangeButtonActionPerformed(evt);
        }
    });

    jTable1.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "Currency Name", "Currency Code", "Rate", "Value"
        }
    ));
    jScrollPane1.setViewportView(jTable1);

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(108, 108, 108)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1)
                .addComponent(jComboBoxBaseCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(386, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(51, 51, 51))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jTextFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(ExchangeButton)))
                    .addGap(75, 75, 75))))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(59, 59, 59)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(jLabel2))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jComboBoxBaseCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ExchangeButton))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(349, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("tab1", jPanel2);

    jComboBoxBaseCurrencySpecific.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Euro", "United States Dollar", "Japanese Yen", "Bulgarian Lev", "Czech Koruna", "Danish Krone", "British Pound", "Hungarian Forint", "Polish Złoty", "Romanian Leu", "Swedish Krona", "Swiss Franc", "Icelandic Króna", "Norwegian Krone", "Croatian Kuna", "Russian Ruble", "Turkish Lira", "Australian Dollar", "Brazilian Real", "Canadian Dollar", "Chinese Yuan Renminbi", "Hong Kong Dollar", "Indonesian Rupiah", "Israeli New Shekel", "Indian Rupee", "South Korean Won", "Mexican Peso", "Malaysian Ringgit", "New Zealand Dollar", "Philippine Peso", "Singapore Dollar", "Thai Baht", "South African Rand" }));
    jComboBoxBaseCurrencySpecific.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jComboBoxBaseCurrencySpecificActionPerformed(evt);
        }
    });

    jTextFieldAmountSpecific.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextFieldAmountSpecificActionPerformed(evt);
        }
    });

    jLabelEnterAmount.setText("Enter Amount :");

    jLabelBaseCurrency.setText("Base Currency");

    jButtonExchangeSpecific.setText("Exchange");
    jButtonExchangeSpecific.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonExchangeSpecificActionPerformed(evt);
        }
    });

    jComboBoxBaseCurrencySpecific1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Euro", "United States Dollar", "Japanese Yen", "Bulgarian Lev", "Czech Koruna", "Danish Krone", "British Pound", "Hungarian Forint", "Polish Złoty", "Romanian Leu", "Swedish Krona", "Swiss Franc", "Icelandic Króna", "Norwegian Krone", "Croatian Kuna", "Russian Ruble", "Turkish Lira", "Australian Dollar", "Brazilian Real", "Canadian Dollar", "Chinese Yuan Renminbi", "Hong Kong Dollar", "Indonesian Rupiah", "Israeli New Shekel", "Indian Rupee", "South Korean Won", "Mexican Peso", "Malaysian Ringgit", "New Zealand Dollar", "Philippine Peso", "Singapore Dollar", "Thai Baht", "South African Rand" }));

    jLabelBaseCurrency1.setText("Base Currency");

    jLabel3.setText("Converted Amount");

    jLabelConvertedAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabelConvertedAmount.setText("0.0");
    jLabelConvertedAmount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addComponent(jButtonExchangeSpecific)
                    .addGap(283, 283, 283))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addComponent(jLabelConvertedAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(201, 201, 201))))
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(109, 109, 109)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabelEnterAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jComboBoxBaseCurrencySpecific, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelBaseCurrency))
                    .addGap(18, 18, 18)
                    .addComponent(jTextFieldAmountSpecific, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jComboBoxBaseCurrencySpecific1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabelBaseCurrency1))
            .addContainerGap(86, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(jLabelEnterAmount)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabelBaseCurrency)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBoxBaseCurrencySpecific, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jTextFieldAmountSpecific, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabelBaseCurrency1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jComboBoxBaseCurrencySpecific1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(40, 40, 40)
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabelConvertedAmount)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jButtonExchangeSpecific)
            .addContainerGap(534, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("tab2", jPanel3);

    getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, -35, -1, 830));

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExchangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExchangeButtonActionPerformed
        DefaultTableModel tableRateList = (DefaultTableModel)jTable1.getModel();
        int rowCount = tableRateList.getRowCount();
        //for loops to delete previous table
        for(int counter = 0; counter<rowCount; counter++ ){
            tableRateList.removeRow(0);
            
        
        }
        //Select combo box 
        String baseCurrency = (String) jComboBoxBaseCurrency.getSelectedItem();
        //method request API 
        String resp = CurrencyConverter.retrieveExchangeRate(baseCurrency);
        double amount = 1.0;
        try {
            //Get data from text field
            String amountString = jTextFieldAmount.getText();
            int count = amountString.indexOf(".");
            if (count != 0) {
                amountString = amountString + ".0";
            }
            amount = Double.parseDouble(amountString);
        } catch (NumberFormatException e) {
           System.err.println("Error parsing amount: " + e.getMessage());
            String amountString = null;
            JOptionPane.showMessageDialog(this, "Invalid amount: '" + amountString + "'. Please use numbers (e.g., 123.45).", "Input Error", JOptionPane.ERROR_MESSAGE);
            jTextFieldAmount.requestFocus();
            return;
        }
        
        JSONObject jo = new JSONObject(resp);
        
        //String exchangeRate = "";
        String[] data = {"", "", "", ""};
        Double convertedAmount;
        float exchangeRateFloat;
        int count = 0; 

        for (String i: CurrencyConverter.CURRENCY_CODES){
            exchangeRateFloat  = jo.getJSONObject("data").getFloat(i);
            convertedAmount = amount * exchangeRateFloat;
            
            //print in console
            System.out.println(i);
            System.out.println(exchangeRateFloat);
            
            
            //data in table 
            data[0] = CurrencyConverter.currencyFullNames[count];
            data[1] = i;
            data[2] = String.valueOf(exchangeRateFloat);
            data[3] = CurrencyConverter.currencySymbols[count] + " " + String.valueOf(CurrencyConverter.round(convertedAmount, 2));
           
            tableRateList.addRow(data);
            count++;
            
        }
    }//GEN-LAST:event_ExchangeButtonActionPerformed

    private void jTextFieldAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAmountActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldAmountActionPerformed

    private void jButtonBulkExchangeTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBulkExchangeTabActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButtonBulkExchangeTabActionPerformed

    private void jButtonSpecificExchangeTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSpecificExchangeTabActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButtonSpecificExchangeTabActionPerformed

    private void jTextFieldAmountSpecificActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAmountSpecificActionPerformed
 
    }//GEN-LAST:event_jTextFieldAmountSpecificActionPerformed

    private void jButtonExchangeSpecificActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExchangeSpecificActionPerformed
        String baseCurrency = (String) jComboBoxBaseCurrencySpecific.getSelectedItem();
        String targetCurrency = (String) jComboBoxBaseCurrencySpecific1.getSelectedItem();
        //method request API 
        String resp = CurrencyConverter.retrieveExchangeRate(baseCurrency);
        double amount = 1.0;
        try {
            //Get data from text field
            String amountString = jTextFieldAmountSpecific.getText();
            int count = amountString.indexOf(".");
            if (count != 0) {
                amountString = amountString + ".0";
            }
            amount = Double.parseDouble(amountString);
        } catch (NumberFormatException e) {
            System.err.println("Error parsing amount: " + e.getMessage());
            String amountString = null;
            JOptionPane.showMessageDialog(this, "Invalid amount: '" + amountString + "'. Please use numbers (e.g., 123.45).", "Input Error", JOptionPane.ERROR_MESSAGE);
            jTextFieldAmount.requestFocus();
            return;
        }
        
        JSONObject jo = new JSONObject(resp);
        String targetCurrencyCode = CurrencyConverter.currencyCodeFullName.get(targetCurrency);
        System.out.println(targetCurrency);
        float exchangeRateFloat  = jo.getJSONObject("data").getFloat(targetCurrencyCode);
        double convertedAmount = amount * exchangeRateFloat;
        double roundedConvertedAmount = CurrencyConverter.round(convertedAmount, 2);
        jLabelConvertedAmount.setText(CurrencyConverter.currencyCodeSymbol.get(targetCurrencyCode) + "" + Double.toString(roundedConvertedAmount));
    }//GEN-LAST:event_jButtonExchangeSpecificActionPerformed

    private void jComboBoxBaseCurrencySpecificActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBaseCurrencySpecificActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxBaseCurrencySpecificActionPerformed

    private void jComboBoxBaseCurrencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBaseCurrencyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxBaseCurrencyActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExchangeButton;
    private javax.swing.JButton jButtonBulkExchangeTab;
    private javax.swing.JButton jButtonExchangeSpecific;
    private javax.swing.JButton jButtonSpecificExchangeTab;
    private javax.swing.JComboBox<String> jComboBoxBaseCurrency;
    private javax.swing.JComboBox<String> jComboBoxBaseCurrencySpecific;
    private javax.swing.JComboBox<String> jComboBoxBaseCurrencySpecific1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBaseCurrency;
    private javax.swing.JLabel jLabelBaseCurrency1;
    private javax.swing.JLabel jLabelConvertedAmount;
    private javax.swing.JLabel jLabelEnterAmount;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldAmount;
    private javax.swing.JTextField jTextFieldAmountSpecific;
    // End of variables declaration//GEN-END:variables
}
