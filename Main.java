import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Desktop;

import javax.swing.JOptionPane;
 
public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }
                       
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        convertFrom = new javax.swing.JComboBox<>();
        convertTo = new javax.swing.JComboBox<>();
        txtSizeLength = new javax.swing.JTextField();
        Convert = new javax.swing.JButton();
        History = new javax.swing.JButton();
        printValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setForeground(new java.awt.Color(153, 255, 153));

        jLabel1.setText("CONVERT FROM");

        jLabel2.setText("CONVERT TO");

        convertFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bits", "Bytes", "KB", "MB", "GB", "TB", "PB","EB","ZB", "YB", "KiB", "MiB", "GiB", "TiB", "PiB", "EiB", "ZiB", "YiB" })); //Convert From Combo Box

        convertTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bits", "Bytes", "KB", "MB", "GB", "TB", "PB","EB","ZB", "YB", "KiB", "MiB", "GiB", "TiB", "PiB", "EiB", "ZiB", "YiB" }));  //Convert To Combo Box

        txtSizeLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSizeLengthActionPerformed(evt);
            }
        });

        Convert.setText("Convert");
        Convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    ConvertActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        
        });

        History.setText("History");
        History.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryActionPerformed(evt);
            }
        });

        printValue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        printValue.setText("Answer:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSizeLength, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(convertFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(506, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(convertTo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(178, 178, 178))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Convert, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(316, 316, 316))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(printValue, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(History, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(800, 800, 800))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(convertTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(convertFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(txtSizeLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Convert).addComponent(History)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(printValue)
                .addGap(172, 172, 172))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void txtSizeLengthActionPerformed(java.awt.event.ActionEvent evt) {                                              
        
    }        
    
private void HistoryActionPerformed(java.awt.event.ActionEvent evt){ //Opens History.txt File
    try {
        File fileToOpen = new File("history.txt");
        if (fileToOpen.exists() && fileToOpen.isFile()) {
            Desktop.getDesktop().open(fileToOpen);
        } else {
            JOptionPane.showMessageDialog(this, "File not found.");
        }
    } catch (IOException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error opening file: " + ex.getMessage());
    }   
    }

    private void ConvertActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                        
        
        String ConvertFrom = convertFrom.getSelectedItem().toString();
        String ConvertTo = convertTo.getSelectedItem().toString();
        String inputText = txtSizeLength.getText();
        if(ConvertTo.equals(ConvertFrom)){
            JOptionPane.showMessageDialog(rootPane, "Damn you bored!");
        }
        else{
            try {
                double convertSize = Double.parseDouble(inputText);
                double inBytes = getBytes(convertSize,ConvertFrom); 
                double finalValue = getFinalvalue(inBytes,ConvertTo);
                String FinalValueWithoutE = String.format("%.0f", finalValue);
                printValue.setText(FinalValueWithoutE+" "+ ConvertTo);
                String conversionFrom = inputText +""+ConvertFrom;
                HistoryWriter(conversionFrom,ConvertTo);
    
                } catch (NumberFormatException e) 
                    {
                        System.out.println("Atleast use numbers not strings, Duh!");
                        JOptionPane.showMessageDialog(rootPane, "Please enter numbers");
                        txtSizeLength.setText("");
                    }
        
        }     
    }                                       
   
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Convert;
    private javax.swing.JComboBox<String> convertFrom;
    private javax.swing.JComboBox<String> convertTo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel printValue;
    private javax.swing.JTextField txtSizeLength;
    private javax.swing.JButton History;
    // End of variables declaration                   

    private double getBytes(double convertSize, String ConvertFrom) { //Converting everything to bytes
        
        switch(ConvertFrom){
        
            case "Bits" -> {
                return convertSize/8;           // 8 Bit = 1 Byte
            }   
            
            case "Bytes" -> {
                return convertSize;
            }
                
            case "KB" -> {
                return convertSize * 1000;
            }
            
            case "MB" -> {
                return convertSize*1000*1000;
            }
            
            case "GB" -> {
                return convertSize*1000*1000*1000;
            }
                
            case "TB" -> {
                return convertSize*1000*1000*1000*1000;
            }
                
            case "PB" -> {
                return convertSize*1000*1000*1000*1000*1000;
            }

            case "EB" -> {
                return convertSize*1000*1000*1000*1000*1000*1000;
            }

            case "ZB" -> { 
                return convertSize*1000*1000*1000*1000*1000*1000*1000;
            }

            case "YB" -> {
                return convertSize*1000*1000*1000*1000*1000*1000*1000*1000;
            }
            
            case "KiB" -> {
                return convertSize * 1024;
            }
             
             case "MiB" -> {
                 return convertSize*1024*1024;
            }
            
            case "GiB" -> {
                return convertSize*1024*1024*1024;
            }
                
            case "TiB" -> {
                return convertSize*1024*1024*1024*1024;
            }
                
            case "PiB" -> {
                return convertSize*1024*1024*1024*1024*1024;
            }   
            
            case "EiB" -> {
                return convertSize*1024*1024*1024*1024*1024*1024;
            }

             case "ZiB" ->{ //ZebiByte
                return convertSize*1024*1024*1024*1024*1024*1024*1024;
                
            }

            case "YiB" ->{ //YobiByte
                return convertSize*1024*1024*1024*1024*1024*1024*1024*1024;
            }
            
    }
        return 0;       
    }

    private double getFinalvalue(double inBytes, String ConvertTo) { //Recommended to add this to another file , since this is a function
                
        switch(ConvertTo){
        
            case "Bits" -> {
                return inBytes*8;       // 1Byte = 8 Bit
            }
            
            case "Bytes" -> {
                return inBytes;
            }
                
            case "KB" -> { //KiloByte
                return inBytes / 1000;
            }
            
            case "MB" -> {  //MegaByte
                return inBytes / 1000 / 1000;
            }
            
            case "GB" -> {  //GigaByte
                return inBytes/1000/1000/1000;
            }
                
            case "TB" -> {  // TeraByte
                return inBytes/1000/1000/1000/1000;
            }
                
            case "PB" -> {  //PetaByte
                return inBytes/1000/1000/1000/1000/1000;
            }

            case "EB" ->{   //ExaByte
                return inBytes/1000/1000/1000/1000/1000/1000; 
            }

            case "ZB" -> { //ZetaByte
                return inBytes/1000/1000/1000/1000/1000/1000/1000;
            }

            case "YB" -> {  //YottaByte
                return inBytes/1000/1000/1000/1000/1000/1000/1000/1000;
            }

            case "KiB" -> { //KibiByte
                return inBytes / 1024;
            }
             
             case "MiB" -> { //MebiByte
                 return inBytes/ 1024/ 1024;
            }
            
            case "GiB" -> { //GibiByte
                return inBytes/1024/1024/1024;
            }
                
            case "TiB" -> { //TebiByte
                return inBytes/1024/1024/1024/1024;
            }
                
            case "PiB" -> {  //PebiByte
                return inBytes/1024/1024/1024/1024/1024;
            } 
            
            case "EiB" -> {   //ExbiByte
                return inBytes/1024/1024/1024/1024/1024/1024;
            }

            case "ZiB" ->{ //ZebiByte
                return inBytes/1024/1024/1024/1024/1024/1024/1024;      
            }

            case "YiB" ->{ //YobiByte   //LARGEST SIZE , There are no other names after this.as of 2023 Oct 22th.
                return inBytes/1024/1024/1024/1024/1024/1024/1024/1024;
            }
            
        }
            
        return 0;
   }


private void HistoryWriter(String convertedFrom , String convertedTo) throws IOException{

        FileWriter fileWriter = new FileWriter("history.txt",true);
        BufferedWriter bw = new BufferedWriter(fileWriter);
        bw.write(convertedFrom +" was converted to " + convertedTo);
        bw.newLine();
        bw.close();
}
}
