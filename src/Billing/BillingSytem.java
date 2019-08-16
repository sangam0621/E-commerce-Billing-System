package Billing;


public class BillingSytem extends javax.swing.JFrame {
    String operations;
    String answers;
    double firstnum,secondnum,result;
    
    public BillingSytem() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtDisplay = new javax.swing.JTextField();
        bdiv = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        badd = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        bsub = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        bmul = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bdecimal = new javax.swing.JButton();
        bpercent = new javax.swing.JButton();
        bans = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        bclear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setPreferredSize(new java.awt.Dimension(330, 360));
        jPanel1.setLayout(null);

        txtDisplay.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        txtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisplayActionPerformed(evt);
            }
        });
        jPanel1.add(txtDisplay);
        txtDisplay.setBounds(20, 20, 250, 50);

        bdiv.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        bdiv.setText("/");
        bdiv.setPreferredSize(new java.awt.Dimension(60, 50));
        bdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdivActionPerformed(evt);
            }
        });
        jPanel1.add(bdiv);
        bdiv.setBounds(210, 250, 50, 40);

        b1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        b1.setText("1");
        b1.setPreferredSize(new java.awt.Dimension(60, 50));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1);
        b1.setBounds(20, 80, 50, 40);

        b2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        b2.setText("2");
        b2.setPreferredSize(new java.awt.Dimension(60, 50));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2);
        b2.setBounds(80, 80, 50, 40);

        b3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        b3.setText("3");
        b3.setPreferredSize(new java.awt.Dimension(60, 50));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel1.add(b3);
        b3.setBounds(150, 80, 50, 40);

        badd.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        badd.setText("+");
        badd.setPreferredSize(new java.awt.Dimension(60, 50));
        badd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baddActionPerformed(evt);
            }
        });
        jPanel1.add(badd);
        badd.setBounds(210, 80, 50, 40);

        b4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        b4.setText("4");
        b4.setPreferredSize(new java.awt.Dimension(60, 50));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel1.add(b4);
        b4.setBounds(20, 140, 50, 40);

        b5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        b5.setText("5");
        b5.setPreferredSize(new java.awt.Dimension(60, 50));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel1.add(b5);
        b5.setBounds(80, 140, 50, 40);

        b6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        b6.setText("6");
        b6.setPreferredSize(new java.awt.Dimension(60, 50));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jPanel1.add(b6);
        b6.setBounds(150, 140, 50, 40);

        bsub.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bsub.setText("-");
        bsub.setPreferredSize(new java.awt.Dimension(60, 50));
        bsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsubActionPerformed(evt);
            }
        });
        jPanel1.add(bsub);
        bsub.setBounds(210, 140, 50, 40);

        b7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        b7.setText("7");
        b7.setPreferredSize(new java.awt.Dimension(60, 50));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        jPanel1.add(b7);
        b7.setBounds(20, 190, 50, 40);

        b8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        b8.setText("8");
        b8.setPreferredSize(new java.awt.Dimension(60, 50));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel1.add(b8);
        b8.setBounds(80, 190, 50, 40);

        b9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        b9.setText("9");
        b9.setPreferredSize(new java.awt.Dimension(60, 50));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        jPanel1.add(b9);
        b9.setBounds(150, 190, 50, 40);

        bmul.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bmul.setText("*");
        bmul.setPreferredSize(new java.awt.Dimension(60, 50));
        bmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmulActionPerformed(evt);
            }
        });
        jPanel1.add(bmul);
        bmul.setBounds(210, 190, 50, 40);

        b0.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        b0.setText("0");
        b0.setPreferredSize(new java.awt.Dimension(60, 50));
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });
        jPanel1.add(b0);
        b0.setBounds(20, 250, 50, 40);

        bdecimal.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bdecimal.setText(".");
        bdecimal.setPreferredSize(new java.awt.Dimension(60, 50));
        bdecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdecimalActionPerformed(evt);
            }
        });
        jPanel1.add(bdecimal);
        bdecimal.setBounds(80, 250, 50, 40);

        bpercent.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bpercent.setText("%");
        bpercent.setPreferredSize(new java.awt.Dimension(60, 50));
        bpercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpercentActionPerformed(evt);
            }
        });
        jPanel1.add(bpercent);
        bpercent.setBounds(150, 250, 50, 40);

        bans.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bans.setText("=");
        bans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bansActionPerformed(evt);
            }
        });
        jPanel1.add(bans);
        bans.setBounds(150, 300, 110, 40);

        jButton18.setText("jButton1");
        jButton18.setPreferredSize(new java.awt.Dimension(60, 50));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18);
        jButton18.setBounds(210, 250, 50, 40);

        jButton19.setText("jButton1");
        jButton19.setPreferredSize(new java.awt.Dimension(60, 50));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19);
        jButton19.setBounds(210, 250, 50, 40);

        bclear.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bclear.setText("CE");
        bclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bclearActionPerformed(evt);
            }
        });
        jPanel1.add(bclear);
        bclear.setBounds(20, 300, 110, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 60, 310, 360);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(410, 60, 10, 10);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setPreferredSize(new java.awt.Dimension(930, 370));
        jPanel4.setLayout(null);

        jCheckBox3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jCheckBox3.setText("noodles");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox3);
        jCheckBox3.setBounds(10, 81, 120, 40);

        jCheckBox4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jCheckBox4.setText("Detergents");
        jCheckBox4.setPreferredSize(new java.awt.Dimension(130, 49));
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox4);
        jCheckBox4.setBounds(10, 130, 120, 40);

        jCheckBox5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jCheckBox5.setText("Pulses");
        jCheckBox5.setPreferredSize(new java.awt.Dimension(130, 49));
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox5);
        jCheckBox5.setBounds(10, 170, 120, 50);

        jCheckBox6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jCheckBox6.setText("Rice");
        jCheckBox6.setPreferredSize(new java.awt.Dimension(130, 49));
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox6);
        jCheckBox6.setBounds(10, 230, 130, 40);

        jCheckBox7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jCheckBox7.setText("Soft-Drinks");
        jCheckBox7.setPreferredSize(new java.awt.Dimension(130, 49));
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox7);
        jCheckBox7.setBounds(10, 280, 150, 50);

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("0");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField7);
        jTextField7.setBounds(180, 90, 60, 29);

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("0");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField8);
        jTextField8.setBounds(180, 130, 60, 29);

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("0");
        jPanel4.add(jTextField9);
        jTextField9.setBounds(180, 180, 60, 29);

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("0");
        jPanel4.add(jTextField10);
        jTextField10.setBounds(180, 240, 60, 29);

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("0");
        jPanel4.add(jTextField11);
        jTextField11.setBounds(180, 290, 60, 29);

        jPanel2.setPreferredSize(new java.awt.Dimension(630, 330));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setText("Total cost of Items");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 30, 184, 30);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("Total delivery cost");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 70, 190, 30);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setText("Total cost of Mileage");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 110, 220, 30);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setText("CGST");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 190, 80, 30);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setText("SGST");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 220, 70, 30);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("0");
        jPanel2.add(jTextField1);
        jTextField1.setBounds(290, 220, 200, 30);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("0");
        jPanel2.add(jTextField2);
        jTextField2.setBounds(290, 30, 200, 30);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("0");
        jPanel2.add(jTextField3);
        jTextField3.setBounds(290, 70, 200, 30);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("0");
        jPanel2.add(jTextField4);
        jTextField4.setBounds(290, 110, 200, 30);

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("0");
        jPanel2.add(jTextField6);
        jTextField6.setBounds(290, 180, 200, 30);

        jPanel4.add(jPanel2);
        jPanel2.setBounds(260, 70, 570, 260);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(360, 60, 930, 360);

        jPanel5.setPreferredSize(new java.awt.Dimension(1250, 110));
        jPanel5.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel10.setText("Total Amount");
        jPanel5.add(jLabel10);
        jLabel10.setBounds(20, 90, 120, 23);

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel11.setText("Subtotal");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(20, 10, 80, 23);

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel12.setText("Tax");
        jPanel5.add(jLabel12);
        jLabel12.setBounds(20, 50, 26, 23);

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("Rs.0.00");
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField12);
        jTextField12.setBounds(300, 80, 210, 30);

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("Rs.0.00");
        jPanel5.add(jTextField13);
        jTextField13.setBounds(300, 0, 210, 30);

        jTextField14.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setText("Rs.0.00");
        jPanel5.add(jTextField14);
        jTextField14.setBounds(300, 40, 210, 30);

        jButton1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton1.setText("CALCULATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1);
        jButton1.setBounds(900, 20, 170, 40);

        jButton2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2);
        jButton2.setBounds(640, 20, 200, 40);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(40, 430, 1250, 120);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("E-COMMERCE BILLING SYSTEM");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(400, 10, 610, 42);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdivActionPerformed

        firstnum=Double.parseDouble(txtDisplay.getText());
    txtDisplay.setText(" ");
    operations = "/";
    }//GEN-LAST:event_bdivActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        String EnterNumber=txtDisplay.getText() +b5.getText();
     txtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        String EnterNumber=txtDisplay.getText() +b6.getText();
     txtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_b6ActionPerformed

    private void bsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsubActionPerformed
       firstnum=Double.parseDouble(txtDisplay.getText());
    txtDisplay.setText(" ");
    operations = "-";
    }//GEN-LAST:event_bsubActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        String EnterNumber=txtDisplay.getText() +b7.getText();
     txtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
       String EnterNumber=txtDisplay.getText() +b8.getText();
     txtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
       String EnterNumber=txtDisplay.getText() +b9.getText();
     txtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_b9ActionPerformed

    private void bmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmulActionPerformed
       firstnum=Double.parseDouble(txtDisplay.getText());
    txtDisplay.setText(" ");
    operations = "*";
    }//GEN-LAST:event_bmulActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
     String EnterNumber=txtDisplay.getText() +b0.getText();
     txtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_b0ActionPerformed

    private void bdecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdecimalActionPerformed
       if(!txtDisplay.getText().contains("."))
        {
        txtDisplay.setText(display.getText() + bdecimal.getText());
       }
    }//GEN-LAST:event_bdecimalActionPerformed

    private void bpercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpercentActionPerformed
        firstnum=Double.parseDouble(txtDisplay.getText());
    txtDisplay.setText(" ");
    operations = "%";
    }//GEN-LAST:event_bpercentActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void bclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bclearActionPerformed
        txtDisplay.setText("");
    }//GEN-LAST:event_bclearActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        String EnterNumber=txtDisplay.getText() +b1.getText();
        txtDisplay.setText(EnterNumber);
       
    }//GEN-LAST:event_b1ActionPerformed

    private void bansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bansActionPerformed
        secondnum  =Double.parseDouble(txtDisplay.getText());
        
        if(operations =="+")
        {
            result =firstnum +secondnum;
            answers=String.format("%.2f",result);
            txtDisplay.setText(answers);
        }
        else if(operations == "-")
                {
                 result =firstnum - secondnum;
            answers=String.format("%.2f",result);
            txtDisplay.setText(answers);   
                }
        else if(operations =="*")
        {
            result =firstnum * secondnum;
            answers=String.format("%.2f",result);
            txtDisplay.setText(answers);
        }
        else if(operations =="/")
        {
            result =firstnum /secondnum;
            answers=String.format("%.2f",result);
            txtDisplay.setText(answers);
        }
       
        else
        {
            result =firstnum % secondnum;
            answers=String.format("%.2f",result);
            txtDisplay.setText(answers);
        }
            
    }//GEN-LAST:event_bansActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        String EnterNumber=txtDisplay.getText() +b4.getText();
     txtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_b4ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        String EnterNumber=txtDisplay.getText() +b3.getText();
     txtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_b3ActionPerformed

    private void baddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baddActionPerformed
    firstnum=Double.parseDouble(txtDisplay.getText());
    txtDisplay.setText(" ");
    operations = "+";
    }//GEN-LAST:event_baddActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
       String EnterNumber=txtDisplay.getText() +b2.getText();
     txtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_b2ActionPerformed

    private void txtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDisplayActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        if(jCheckBox6.isSelected())
        {
            jTextField10.setEditable(true);
            jTextField10.setText("");
            jTextField10.requestFocus();
        }
        else
        {
            jTextField10.setEditable(false);
            jTextField10.setText("0");
        }
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        if(jCheckBox4.isSelected())
        {
            jTextField8.setEditable(true);
            jTextField8.setText("");
            jTextField8.requestFocus();
        }
        else
        {
            jTextField8.setEditable(false);
            jTextField8.setText("0");
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtDisplay.setText("0");
        jTextField1.setText("0");
        jTextField2.setText("0");
        jTextField3.setText("0");
        jTextField4.setText("0");
        jTextField6.setText("0");
        jTextField7.setText("0");
        jTextField8.setText("0");
        jTextField9.setText("0");
        jTextField10.setText("0");
        jTextField11.setText("0");
        jTextField12.setText("Rs. 0.00");
        jTextField13.setText("Rs. 0.00");
        jTextField14.setText("Rs. 0.00");
        
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox6.setSelected(false);
        jCheckBox7.setSelected(false);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        if(jCheckBox3.isSelected())
        {
            jTextField7.setEditable(true);
            jTextField7.setText("");
            jTextField7.requestFocus();
        }
        else
        {
            jTextField7.setEditable(false);
            jTextField7.setText("0");
        }
        
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        if(jCheckBox5.isSelected())
        {
            jTextField9.setEditable(true);
            jTextField9.setText("");
            jTextField9.requestFocus();
        }
        else
        {
            jTextField9.setEditable(false);
            jTextField9.setText("0");
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        if(jCheckBox7.isSelected())
        {
            jTextField11.setEditable(true);
            jTextField11.setText("");
            jTextField11.requestFocus();
        }
        else
        {
            jTextField11.setEditable(false);
            jTextField11.setText("0");
        }
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if((jCheckBox3.isSelected())  ||(jCheckBox4.isSelected()) ||(jCheckBox5.isSelected()) ||(jCheckBox6.isSelected()) ||(jCheckBox7.isSelected()))
        {
          double n =Double.parseDouble(jTextField7.getText()) *50;
          double d =Double.parseDouble(jTextField8.getText()) *20;
          double p =Double.parseDouble(jTextField9.getText()) *45;
          double r =Double.parseDouble(jTextField10.getText()) *60;
          double s =Double.parseDouble(jTextField11.getText()) *35;
                  double totalitems= n + d + p + r + s;
          double del= totalitems *5/100;
          double mil= del* 50/100;
          
          double subtotal =totalitems +del +mil;
          double cgst =subtotal *9 /100;
          double sgst= cgst;
          
          double tax= cgst + sgst;
          
          double amount = subtotal + tax;
          
          String item=String.format("%.2f",totalitems);
          jTextField2.setText((String)item);
          
          String dly = String.format("%.2f",del);
          jTextField3.setText((String)dly);
          
          String m=String.format("%.2f",mil);
          jTextField4.setText((String)m);
          
          String c=String.format("%.2f",cgst);
          jTextField6.setText((String)c);
          
          String sg=String.format("%.2f",sgst);
          jTextField1.setText((String)sg);
          
          String sub=String.format("%.2f",subtotal);
          jTextField13.setText((String)sub);
          
          String ta=String.format("%.2f",tax);
          jTextField14.setText((String)ta);
          
          String tamount=String.format("%.2f",amount);
          jTextField12.setText((String)tamount);
          
          
        }    
else
    {
        txtDisplay.setText("Enter Choice");
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillingSytem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton badd;
    private javax.swing.JButton bans;
    private javax.swing.JButton bclear;
    private javax.swing.JButton bdecimal;
    private javax.swing.JButton bdiv;
    private javax.swing.JButton bmul;
    private javax.swing.JButton bpercent;
    private javax.swing.JButton bsub;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField txtDisplay;
    // End of variables declaration//GEN-END:variables

    private static class txtDisplay {

        public txtDisplay() {
        }
        
        
    }
}
