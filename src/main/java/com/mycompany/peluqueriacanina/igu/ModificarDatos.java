package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.Mascota;
import com.mycompany.peluqueriacanina.logica.Controladora;
import static java.awt.event.KeyEvent.VK_ENTER;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

public class ModificarDatos extends javax.swing.JFrame {

    Controladora control = null;
    int num_cliente;
    Mascota masco;

    public ModificarDatos(int num_cliente) {

        control = new Controladora();
        //this.num_cliente = num_cliente;
        initComponents();
        cargarDatos(num_cliente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextNombre = new javax.swing.JTextField();
        TextRaza = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TextColor = new javax.swing.JTextField();
        ComboAtencionEspecial = new javax.swing.JComboBox<>();
        ComboAlergico = new javax.swing.JComboBox<>();
        TextNombreDuenio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaObservaciones = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        TextCelular = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        BtnLimpiar = new javax.swing.JButton();
        BtnGuardarCambio = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Datos ");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("*Nombre:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("*Raza:");

        TextNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextNombreKeyTyped(evt);
            }
        });

        TextRaza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextRazaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextRazaKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("*Color:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("*Atencion especial:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("*Alergico:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("*Nombre duenio:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Observaciones:");

        TextColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextColorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextColorKeyTyped(evt);
            }
        });

        ComboAtencionEspecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));
        ComboAtencionEspecial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ComboAtencionEspecialKeyTyped(evt);
            }
        });

        ComboAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));

        TextNombreDuenio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextNombreDuenioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextNombreDuenioKeyTyped(evt);
            }
        });

        TextAreaObservaciones.setColumns(20);
        TextAreaObservaciones.setRows(5);
        TextAreaObservaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextAreaObservacionesKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextAreaObservacionesKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(TextAreaObservaciones);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("*Celular:");

        TextCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextCelularKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextCelularKeyTyped(evt);
            }
        });

        BtnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        BtnGuardarCambio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BtnGuardarCambio.setIcon(new javax.swing.ImageIcon("C:\\Users\\x\\Desktop\\disquete1.png")); // NOI18N
        BtnGuardarCambio.setText("Guardar Cambio");
        BtnGuardarCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarCambioActionPerformed(evt);
            }
        });
        BtnGuardarCambio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnGuardarCambioKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnGuardarCambio)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardarCambio)
                    .addComponent(BtnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(91, 91, 91)
                            .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel8))
                            .addGap(35, 35, 35)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TextColor, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                .addComponent(TextRaza)
                                .addComponent(ComboAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ComboAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TextNombreDuenio)
                                .addComponent(TextCelular)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(49, 49, 49)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(TextColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(ComboAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(ComboAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(TextNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel9.setText("Modificar Datos");

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\x\\Downloads\\perrito2.png")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(719, 719, 719)
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(410, 410, 410)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(130, 130, 130))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        TextNombre.setText("");
        TextRaza.setText("");
        TextColor.setText("");
        TextNombreDuenio.setText("");
        TextCelular.setText("");
        TextAreaObservaciones.setText("");
        ComboAlergico.setSelectedIndex(0);
        ComboAtencionEspecial.setSelectedIndex(0);
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void TextNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextNombreKeyTyped
        if (TextNombre.getText().length() >= 30) {
            evt.consume();
        }
        Character c = evt.getKeyChar();
        if (!Character.isLetter(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_TextNombreKeyTyped

    private void TextRazaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextRazaKeyTyped
        if (TextRaza.getText().length() >= 10) {
            evt.consume();
        }
        Character c = evt.getKeyChar();
        if (!Character.isLetter(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_TextRazaKeyTyped

    private void TextColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextColorKeyTyped
        if (TextColor.getText().length() >= 30) {
            evt.consume();
        }
        Character key = evt.getKeyChar();
        boolean caracteresPermitidos = key >= 97 && key <= 122 || key==32;
        if (!caracteresPermitidos) {
            evt.consume();
        }
    }//GEN-LAST:event_TextColorKeyTyped

    private void TextNombreDuenioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextNombreDuenioKeyTyped
        if (TextNombreDuenio.getText().length() >= 30) {
            evt.consume();
        }
        /*System.out.println("Llegue");*/
        Character key = evt.getKeyChar();
        boolean caracteresPermitidos = key >= 97 && key <= 122 || key==32;
        if (!caracteresPermitidos) {
   
            evt.consume();
        }

    }//GEN-LAST:event_TextNombreDuenioKeyTyped

    private void TextCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextCelularKeyTyped
        if (TextCelular.getText().length() >= 15) {
            evt.consume();
        }
        int key = evt.getKeyChar();
        boolean caracteresPermitidos = key >= 48 && key <= 57 || key == 45;

        if (!caracteresPermitidos) {
            evt.consume();
        }
    }//GEN-LAST:event_TextCelularKeyTyped

    private void TextAreaObservacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextAreaObservacionesKeyTyped

    }//GEN-LAST:event_TextAreaObservacionesKeyTyped

    private void ComboAtencionEspecialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ComboAtencionEspecialKeyTyped
        evt.consume();
    }//GEN-LAST:event_ComboAtencionEspecialKeyTyped

    private void TextNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextNombreKeyPressed
        if (evt.getKeyCode() == VK_ENTER) {
            TextRaza.requestFocus();
        }
    }//GEN-LAST:event_TextNombreKeyPressed

    private void TextRazaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextRazaKeyPressed
        if (evt.getKeyCode() == VK_ENTER) {
            TextColor.requestFocus();
        }
    }//GEN-LAST:event_TextRazaKeyPressed

    private void TextColorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextColorKeyPressed
        if (evt.getKeyCode() == VK_ENTER) {
            TextNombreDuenio.requestFocus();
        }

    }//GEN-LAST:event_TextColorKeyPressed

    private void TextNombreDuenioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextNombreDuenioKeyPressed
        if (evt.getKeyCode() == VK_ENTER) {
            TextCelular.requestFocus();
        }
    }//GEN-LAST:event_TextNombreDuenioKeyPressed

    private void TextCelularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextCelularKeyPressed
        if (evt.getKeyCode() == VK_ENTER) {
            TextAreaObservaciones.requestFocus();
        }
    }//GEN-LAST:event_TextCelularKeyPressed

    private void TextAreaObservacionesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextAreaObservacionesKeyPressed
        if (evt.getKeyCode() == VK_ENTER) {
            BtnGuardarCambio.requestFocus();
        }
    }//GEN-LAST:event_TextAreaObservacionesKeyPressed

    private void BtnGuardarCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarCambioActionPerformed

        if (TextNombre.getText().length() == 0) {
            showMessageDialog(null, "Debe ingresar el nombre");
            TextNombre.requestFocus();
        } else if (TextRaza.getText().length() == 0) {
            showMessageDialog(null, "Debe ingresar la raza");
        } else if (TextColor.getText().length() == 0) {
            showMessageDialog(null, "Debe ingresar la color");
            TextColor.requestFocus();
        } else if (ComboAtencionEspecial.getSelectedIndex() == 0) {
            showMessageDialog(null, "Debe ingresar la atencionEspecial");
            ComboAtencionEspecial.requestFocus();
        } else if (ComboAlergico.getSelectedIndex() == 0) {
            showMessageDialog(null, "Debe ingresar la Alergico");
            ComboAlergico.requestFocus();
        } else if (TextNombreDuenio.getText().length() == 0) {
            showMessageDialog(null, "Debe ingresar la Duenio");
            TextNombreDuenio.requestFocus();
        } else if (TextCelular.getText().length() == 0) {
            showMessageDialog(null, "Debe ingresar la celular");
            TextCelular.requestFocus();
        } else if (TextAreaObservaciones.getText().length() == 0) {
            showMessageDialog(null, "Debe ingresar la Observaciones");
            TextAreaObservaciones.requestFocus();
        } else {
//TODOS LOS DATOS DE LA MASCOTAS
            String nombreMasco = TextNombre.getText();
            String raza = TextRaza.getText();
            String color = TextColor.getText();
            String areaObservaciones = TextAreaObservaciones.getText();
            String alergico = (String) ComboAlergico.getSelectedItem();
            String atencionEspecial = (String) ComboAtencionEspecial.getSelectedItem();

            //TODOS LOS DATOS DEL DUEÑO
            String nombreDuenio = TextNombreDuenio.getText();
            String cel = TextCelular.getText();

            control.modificarMascota(masco, nombreMasco, raza, color, areaObservaciones, alergico, atencionEspecial, nombreDuenio, cel);

            //mensaje que tdo salio ok
            mostrarMensaje("Se edito correctamente", "Info", "Se edito correctamente");

            VerDatos pantalla = new VerDatos();
            pantalla.setVisible(true);
            pantalla.setLocationRelativeTo(null);
            this.dispose();


    }//GEN-LAST:event_BtnGuardarCambioActionPerformed
    }

    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    private void BtnGuardarCambioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnGuardarCambioKeyPressed

    }//GEN-LAST:event_BtnGuardarCambioKeyPressed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardarCambio;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JComboBox<String> ComboAlergico;
    private javax.swing.JComboBox<String> ComboAtencionEspecial;
    private javax.swing.JTextArea TextAreaObservaciones;
    private javax.swing.JTextField TextCelular;
    private javax.swing.JTextField TextColor;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JTextField TextNombreDuenio;
    private javax.swing.JTextField TextRaza;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos(int num_cliente) {

        this.masco = (Mascota) control.traerMascota(num_cliente);

        TextNombre.setText(masco.getNombre());
        TextRaza.setText(masco.getRaza());
        TextColor.setText(masco.getColor());
        TextNombreDuenio.setText(masco.getNombre());
        TextCelular.setText(masco.getUnDuenio().getCelDuenio());
        TextAreaObservaciones.setText(masco.getObservaciones());

        if (masco.getAlergico().equals("SI")) {
            ComboAlergico.setSelectedIndex(1);
        } else {
            if (masco.getAlergico().equals("NO")) {
                ComboAlergico.setSelectedIndex(2);
            }
        }
        if (masco.getAtencion_Especial().equals("SI")) {
            ComboAtencionEspecial.setSelectedIndex(1);
        } else {
            if (masco.getAtencion_Especial().equals("NO")) {
                ComboAtencionEspecial.setSelectedIndex(2);
            }
        }
    }

}
