/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.forms;

import com.sv.udb.clases.Ejercicio5;

/**
 *
 * @author Jose Lira
 */
public class FrmEjerc5 extends javax.swing.JFrame {

    /**
     * Creates new form FrmEjerc5
     */
    private String nueva;
    private String operacion;
    
    public FrmEjerc5() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pantalla.setFocusable(true);
        this.lbl.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantalla = new javax.swing.JTextField();
        btnlim = new javax.swing.JButton();
        entre = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        por = new javax.swing.JButton();
        btndos = new javax.swing.JButton();
        btntres = new javax.swing.JButton();
        btnuno = new javax.swing.JButton();
        menos = new javax.swing.JButton();
        btncin = new javax.swing.JButton();
        btnsei = new javax.swing.JButton();
        btncua = new javax.swing.JButton();
        mas = new javax.swing.JButton();
        btnoch = new javax.swing.JButton();
        btnnue = new javax.swing.JButton();
        btnsie = new javax.swing.JButton();
        txtigua = new javax.swing.JButton();
        btnpun = new javax.swing.JButton();
        btncer = new javax.swing.JButton();
        lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 255, 204));

        pantalla.setEditable(false);
        pantalla.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pantalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pantallaKeyTyped(evt);
            }
        });

        btnlim.setBackground(new java.awt.Color(0, 204, 51));
        btnlim.setForeground(new java.awt.Color(255, 255, 255));
        btnlim.setText("C");
        btnlim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimActionPerformed(evt);
            }
        });

        entre.setBackground(new java.awt.Color(0, 204, 51));
        entre.setForeground(new java.awt.Color(255, 255, 255));
        entre.setText("/");
        entre.setSelected(true);
        entre.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\Jose Morales\\Desktop\\escritorio\\Cuarto\\POO\\GUIA02_POO1\\1486217211_arrow_left.png")); // NOI18N
        entre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entreActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 204, 51));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("+/-");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        por.setBackground(new java.awt.Color(0, 204, 51));
        por.setForeground(new java.awt.Color(255, 255, 255));
        por.setText("x");
        por.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porActionPerformed(evt);
            }
        });

        btndos.setBackground(new java.awt.Color(0, 204, 51));
        btndos.setForeground(new java.awt.Color(255, 255, 255));
        btndos.setText("2");
        btndos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndosActionPerformed(evt);
            }
        });

        btntres.setBackground(new java.awt.Color(0, 204, 51));
        btntres.setForeground(new java.awt.Color(255, 255, 255));
        btntres.setText("3");
        btntres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntresActionPerformed(evt);
            }
        });

        btnuno.setBackground(new java.awt.Color(0, 204, 51));
        btnuno.setForeground(new java.awt.Color(255, 255, 255));
        btnuno.setText("1");
        btnuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnunoActionPerformed(evt);
            }
        });

        menos.setBackground(new java.awt.Color(0, 204, 51));
        menos.setForeground(new java.awt.Color(255, 255, 255));
        menos.setText("-");
        menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosActionPerformed(evt);
            }
        });

        btncin.setBackground(new java.awt.Color(0, 204, 51));
        btncin.setForeground(new java.awt.Color(255, 255, 255));
        btncin.setText("5");
        btncin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncinActionPerformed(evt);
            }
        });

        btnsei.setBackground(new java.awt.Color(0, 204, 51));
        btnsei.setForeground(new java.awt.Color(255, 255, 255));
        btnsei.setText("6");
        btnsei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnseiActionPerformed(evt);
            }
        });

        btncua.setBackground(new java.awt.Color(0, 204, 51));
        btncua.setForeground(new java.awt.Color(255, 255, 255));
        btncua.setText("4");
        btncua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncuaActionPerformed(evt);
            }
        });

        mas.setBackground(new java.awt.Color(0, 204, 51));
        mas.setForeground(new java.awt.Color(255, 255, 255));
        mas.setText("+");
        mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masActionPerformed(evt);
            }
        });

        btnoch.setBackground(new java.awt.Color(0, 204, 51));
        btnoch.setForeground(new java.awt.Color(255, 255, 255));
        btnoch.setText("8");
        btnoch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnochActionPerformed(evt);
            }
        });

        btnnue.setBackground(new java.awt.Color(0, 204, 51));
        btnnue.setForeground(new java.awt.Color(255, 255, 255));
        btnnue.setText("9");
        btnnue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnueActionPerformed(evt);
            }
        });

        btnsie.setBackground(new java.awt.Color(0, 204, 51));
        btnsie.setForeground(new java.awt.Color(255, 255, 255));
        btnsie.setText("7");
        btnsie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsieActionPerformed(evt);
            }
        });

        txtigua.setBackground(new java.awt.Color(0, 204, 51));
        txtigua.setForeground(new java.awt.Color(255, 255, 255));
        txtigua.setText("=");
        txtigua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtiguaActionPerformed(evt);
            }
        });

        btnpun.setBackground(new java.awt.Color(0, 204, 51));
        btnpun.setForeground(new java.awt.Color(255, 255, 255));
        btnpun.setText(".");
        btnpun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpunActionPerformed(evt);
            }
        });

        btncer.setBackground(new java.awt.Color(0, 204, 51));
        btncer.setForeground(new java.awt.Color(255, 255, 255));
        btncer.setText("0");
        btncer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerActionPerformed(evt);
            }
        });

        lbl.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btncer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnsie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btncua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnuno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(por, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mas, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnoch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnpun, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(menos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(entre, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btncin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btndos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnsei, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnnue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtigua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btntres, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnlim, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnlim, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(btntres, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnsei, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnnue, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtigua, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))
                            .addComponent(por, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addComponent(btnuno, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btncua, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnsie, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btncer, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(menos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(entre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(btndos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btncin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnoch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnpun, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntresActionPerformed
       
             this.nueva = pantalla.getText(); 
             this.nueva += "3";
             pantalla.setText(nueva);
       
    }//GEN-LAST:event_btntresActionPerformed

    private void btnunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnunoActionPerformed
this.nueva = pantalla.getText();
this.nueva += "1";
pantalla.setText(nueva);

    }//GEN-LAST:event_btnunoActionPerformed

    private void btncerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerActionPerformed
this.nueva = pantalla.getText();
this.nueva += "0";
pantalla.setText(nueva);
    }//GEN-LAST:event_btncerActionPerformed

    private void btndosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndosActionPerformed
   this.nueva = pantalla.getText();
this.nueva += "2";
pantalla.setText(nueva);

    }//GEN-LAST:event_btndosActionPerformed

    private void btncuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncuaActionPerformed
this.nueva = pantalla.getText();
this.nueva += "4";
pantalla.setText(nueva);
    }//GEN-LAST:event_btncuaActionPerformed

    private void btncinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncinActionPerformed
this.nueva = pantalla.getText();
this.nueva += "5";
pantalla.setText(nueva);
    }//GEN-LAST:event_btncinActionPerformed

    private void btnseiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseiActionPerformed
this.nueva = pantalla.getText();
this.nueva += "6";
pantalla.setText(nueva);
    }//GEN-LAST:event_btnseiActionPerformed

    private void btnsieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsieActionPerformed
this.nueva = pantalla.getText();
this.nueva += "7";
pantalla.setText(nueva);
    }//GEN-LAST:event_btnsieActionPerformed

    private void btnochActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnochActionPerformed
this.nueva = pantalla.getText();
this.nueva += "8";
pantalla.setText(nueva);
    }//GEN-LAST:event_btnochActionPerformed

    private void btnnueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnueActionPerformed
this.nueva = pantalla.getText();
this.nueva += "9";
pantalla.setText(nueva);
    }//GEN-LAST:event_btnnueActionPerformed

    private void btnpunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpunActionPerformed
for(int i=0;i<pantalla.getText().length(); i++ )
if ( pantalla.getText().charAt(i) == '.') //Detectar si hay un punto decimal en la cadena
{
btnpun.setEnabled(false);
}
else
{
    this.nueva = pantalla.getText();
    this.nueva += ".";
    pantalla.setText(nueva);
}
    }//GEN-LAST:event_btnpunActionPerformed

    private void masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masActionPerformed
        try {
            btnpun.setEnabled(true); 
         Ejercicio5 obje = new Ejercicio5 ();
         obje.setPrimera(pantalla.getText());
         lbl.setText(obje.getResul());

pantalla.setText("");
this.operacion = "suma";  
mas.setEnabled(false);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_masActionPerformed

    private void txtiguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtiguaActionPerformed
try{       
    btnpun.setEnabled(true); 
        mas.setEnabled(true);
        menos.setEnabled(true);
        por.setEnabled(true);
        entre.setEnabled(true);
        
        
        String valor = pantalla.getText();
         double valo = Double.parseDouble(valor);        
         double val = Double.parseDouble(lbl.getText());
          double resu;
        switch(this.operacion)
        {           
            case "suma":
                     resu = val + valo;                       
                pantalla.setText(Double.toString(resu));
                break;
            case "resta":
                      resu = val - valo;                       
                pantalla.setText(Double.toString(resu));
                break;
            case "multi":
                      resu = val * valo;                       
                 pantalla.setText(Double.toString(resu));
                break;
                    case "division":
                       resu = val / valo;                       
                pantalla.setText(Double.toString(resu));
                break;
        }
}
catch (Exception e) {
        }
    }//GEN-LAST:event_txtiguaActionPerformed

    private void btnlimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimActionPerformed

        pantalla.setText("");
        btnpun.setEnabled(true); 
        mas.setEnabled(true);
        menos.setEnabled(true);
        por.setEnabled(true);
        entre.setEnabled(true);

    }//GEN-LAST:event_btnlimActionPerformed

    private void menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosActionPerformed
        try {
            btnpun.setEnabled(true); 
            Ejercicio5 obje = new Ejercicio5();
            obje.setPrimera(pantalla.getText());  
            lbl.setText(obje.getResul());
            pantalla.setText("");
            this.operacion = "resta";
            menos.setEnabled(false);
        } catch (Exception e) {
        }
 //this.primera = pantalla.getText();
    }//GEN-LAST:event_menosActionPerformed

    private void entreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entreActionPerformed
        try {
            btnpun.setEnabled(true); 
            Ejercicio5 obje = new Ejercicio5();
            obje.setPrimera(pantalla.getText());
            lbl.setText(obje.getResul());
  //          this.primera = pantalla.getText();
            pantalla.setText("");
            this.operacion = "division";
            entre.setEnabled(false);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_entreActionPerformed

    private void porActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porActionPerformed
        try {
            btnpun.setEnabled(true); 
            Ejercicio5 obje = new Ejercicio5();
            obje.setPrimera(pantalla.getText());
            lbl.setText(obje.getResul());
            pantalla.setText("");
            this.operacion = "multi";
            por.setEnabled(false);
        } catch (Exception e) {
        }


    }//GEN-LAST:event_porActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
double num = Double.parseDouble(pantalla.getText());
pantalla.setText(Double.toString(num * -1));

    }//GEN-LAST:event_jButton8ActionPerformed
    private void pantallaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pantallaKeyTyped

    }//GEN-LAST:event_pantallaKeyTyped

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
            java.util.logging.Logger.getLogger(FrmEjerc5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEjerc5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEjerc5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEjerc5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEjerc5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncer;
    private javax.swing.JButton btncin;
    private javax.swing.JButton btncua;
    private javax.swing.JButton btndos;
    private javax.swing.JButton btnlim;
    private javax.swing.JButton btnnue;
    private javax.swing.JButton btnoch;
    private javax.swing.JButton btnpun;
    private javax.swing.JButton btnsei;
    private javax.swing.JButton btnsie;
    private javax.swing.JButton btntres;
    private javax.swing.JButton btnuno;
    private javax.swing.JButton entre;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel lbl;
    private javax.swing.JButton mas;
    private javax.swing.JButton menos;
    private javax.swing.JTextField pantalla;
    private javax.swing.JButton por;
    private javax.swing.JButton txtigua;
    // End of variables declaration//GEN-END:variables
}
