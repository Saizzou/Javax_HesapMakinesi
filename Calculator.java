package examples;

/**
 * @author r4d1x
 */
public class Calculator extends javax.swing.JFrame {

    double num,sonuc;
    int hesaplama;
    
    public Calculator() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        radio_grup = new javax.swing.ButtonGroup();
        line_Sayi = new javax.swing.JTextField();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_topla = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_cikar = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_carpim = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_nokta = new javax.swing.JButton();
        btn_esittir = new javax.swing.JButton();
        btn_bolme = new javax.swing.JButton();
        btn_temizle = new javax.swing.JButton();
        btn_geri = new javax.swing.JButton();
        radio_Aktiflestir = new javax.swing.JRadioButton();
        radio_Kilitle = new javax.swing.JRadioButton();
        label_aradeger = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hesap Makinesi");
        setType(java.awt.Window.Type.UTILITY);

        line_Sayi.setBackground(new java.awt.Color(234, 234, 234));
        line_Sayi.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        line_Sayi.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        line_Sayi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                line_SayiActionPerformed(evt);
            }
        });

        btn_7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_7.setText("7");
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_8.setText("8");
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        btn_9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_9.setText("9");
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });

        btn_topla.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_topla.setText("+");
        btn_topla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_toplaActionPerformed(evt);
            }
        });

        btn_4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_4.setText("4");
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_5.setText("5");
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        btn_6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_6.setText("6");
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_cikar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_cikar.setText("-");
        btn_cikar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cikarActionPerformed(evt);
            }
        });

        btn_1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_1.setText("1");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_2.setText("2");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_3.setText("3");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        btn_carpim.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_carpim.setText("X");
        btn_carpim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_carpimActionPerformed(evt);
            }
        });

        btn_0.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_0.setText("0");
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });

        btn_nokta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_nokta.setText(".");
        btn_nokta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_noktaActionPerformed(evt);
            }
        });

        btn_esittir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_esittir.setText("=");
        btn_esittir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_esittirActionPerformed(evt);
            }
        });

        btn_bolme.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_bolme.setText("/");
        btn_bolme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bolmeActionPerformed(evt);
            }
        });

        btn_temizle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_temizle.setText("C");
        btn_temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_temizleActionPerformed(evt);
            }
        });

        btn_geri.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_geri.setText("<--");
        btn_geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_geriActionPerformed(evt);
            }
        });

        radio_grup.add(radio_Aktiflestir);
        radio_Aktiflestir.setSelected(true);
        radio_Aktiflestir.setText("Aktiflestir");
        radio_Aktiflestir.setActionCommand("radio_Aktiflestir");
        radio_Aktiflestir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_AktiflestirActionPerformed(evt);
            }
        });

        radio_grup.add(radio_Kilitle);
        radio_Kilitle.setText("Kilitle");
        radio_Kilitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_KilitleActionPerformed(evt);
            }
        });

        label_aradeger.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_aradeger.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel1.setText("© Coded by R4d1x");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(line_Sayi)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_topla, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_cikar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_carpim, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_nokta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_esittir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_bolme, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radio_Aktiflestir)
                            .addComponent(radio_Kilitle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_geri, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_temizle, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label_aradeger, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_aradeger)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line_Sayi, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btn_temizle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(radio_Aktiflestir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radio_Kilitle))
                            .addComponent(btn_geri, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_topla, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cikar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_carpim, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_nokta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_esittir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_bolme, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        
    private void line_SayiActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        line_Sayi.setText(line_Sayi.getText() + "9");
    }                                     

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        line_Sayi.setText(line_Sayi.getText() + "1");
    }                                     

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        line_Sayi.setText(line_Sayi.getText() + "2");
    }                                     

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        line_Sayi.setText(line_Sayi.getText() + "3");
    }                                     

    private void btn_temizleActionPerformed(java.awt.event.ActionEvent evt) {                                            
        line_Sayi.setText("");
    }                                           

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        line_Sayi.setText(line_Sayi.getText() + "4");
    }                                     

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        line_Sayi.setText(line_Sayi.getText() + "5");
    }                                     

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        line_Sayi.setText(line_Sayi.getText() + "6");
    }                                     

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        line_Sayi.setText(line_Sayi.getText() + "7");
    }                                     

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        line_Sayi.setText(line_Sayi.getText() + "8");
    }                                     

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        line_Sayi.setText(line_Sayi.getText() + "0");
    }                                     

    private void btn_noktaActionPerformed(java.awt.event.ActionEvent evt) {                                          
        line_Sayi.setText(line_Sayi.getText() + ".");
    }                                         

    private void radio_AktiflestirActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        aktiflestir();
    }                                                 

    private void radio_KilitleActionPerformed(java.awt.event.ActionEvent evt) {                                              
        kilitle();
    }                                             

    private void btn_geriActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        int uzunluk = line_Sayi.getText().length();
        int silinen = line_Sayi.getText().length() - 1;
        String sonuc;
        
        if (uzunluk > 0){
            StringBuilder geri = new StringBuilder(line_Sayi.getText());
            geri.deleteCharAt(silinen);
            sonuc = geri.toString();
            line_Sayi.setText(sonuc);
        }
    }                                        

    private void btn_toplaActionPerformed(java.awt.event.ActionEvent evt) {                                          
        num = Double.parseDouble(line_Sayi.getText());
        hesaplama = 1;
        line_Sayi.setText("");
        label_aradeger.setText(num + "+");
    }                                         

    private void btn_esittirActionPerformed(java.awt.event.ActionEvent evt) {                                            
        label_aradeger.setText(label_aradeger.getText() + line_Sayi.getText());
        islemler();
    }                                           

    private void btn_cikarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        num = Double.parseDouble(line_Sayi.getText());
        hesaplama = 2;
        line_Sayi.setText("");
        label_aradeger.setText(num + "-");
    }                                         

    private void btn_carpimActionPerformed(java.awt.event.ActionEvent evt) {                                           
        num = Double.parseDouble(line_Sayi.getText());
        hesaplama = 3;
        line_Sayi.setText("");
        label_aradeger.setText(num + "x");
    }                                          

    private void btn_bolmeActionPerformed(java.awt.event.ActionEvent evt) {                                          
        num = Double.parseDouble(line_Sayi.getText());
        hesaplama = 4;
        line_Sayi.setText("");
        label_aradeger.setText(num + "/");
    }                                         
    
    public void kilitle(){
        line_Sayi.setEnabled(false);
        btn_0.setEnabled(false);
        btn_1.setEnabled(false);
        btn_2.setEnabled(false);
        btn_3.setEnabled(false);
        btn_4.setEnabled(false);
        btn_5.setEnabled(false);
        btn_6.setEnabled(false);
        btn_7.setEnabled(false);
        btn_8.setEnabled(false);
        btn_9.setEnabled(false);
        btn_nokta.setEnabled(false);
        btn_carpim.setEnabled(false);
        btn_topla.setEnabled(false);
        btn_cikar.setEnabled(false);
        btn_bolme.setEnabled(false);
        btn_esittir.setEnabled(false);
        btn_temizle.setEnabled(false);
        btn_geri.setEnabled(false);
    }
    
    public void aktiflestir(){
        line_Sayi.setEnabled(true);
        btn_0.setEnabled(true);
        btn_1.setEnabled(true);
        btn_2.setEnabled(true);
        btn_3.setEnabled(true);
        btn_4.setEnabled(true);
        btn_5.setEnabled(true);
        btn_6.setEnabled(true);
        btn_7.setEnabled(true);
        btn_8.setEnabled(true);
        btn_9.setEnabled(true);
        btn_nokta.setEnabled(true);
        btn_carpim.setEnabled(true);
        btn_topla.setEnabled(true);
        btn_cikar.setEnabled(true);
        btn_bolme.setEnabled(true);
        btn_esittir.setEnabled(true);
        btn_temizle.setEnabled(true);
        btn_geri.setEnabled(true);
    }
    
    public void islemler(){
        switch(hesaplama){
            case 1: //Toplama
                sonuc = num + Double.parseDouble(line_Sayi.getText());
                line_Sayi.setText(Double.toString(sonuc));
                break;
            
            case 2: //Cikarma
                sonuc = num - Double.parseDouble(line_Sayi.getText());
                line_Sayi.setText(Double.toString(sonuc));
                break;
                
            case 3: //Carpma
                sonuc = num * Double.parseDouble(line_Sayi.getText());
                line_Sayi.setText(Double.toString(sonuc));
                break;
                
            case 4: //Bölme
                sonuc = num / Double.parseDouble(line_Sayi.getText());
                line_Sayi.setText(Double.toString(sonuc));
                break;
                
        }
    }
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_bolme;
    private javax.swing.JButton btn_carpim;
    private javax.swing.JButton btn_cikar;
    private javax.swing.JButton btn_esittir;
    private javax.swing.JButton btn_geri;
    private javax.swing.JButton btn_nokta;
    private javax.swing.JButton btn_temizle;
    private javax.swing.JButton btn_topla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label_aradeger;
    private javax.swing.JTextField line_Sayi;
    private javax.swing.JRadioButton radio_Aktiflestir;
    private javax.swing.JRadioButton radio_Kilitle;
    private javax.swing.ButtonGroup radio_grup;
    // End of variables declaration                   
}
