package com;

import java.awt.Color;

public class loginVendedor extends javax.swing.JFrame {

    int xMouse,yMouse;
    
    public loginVendedor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        titleSeparator1 = new javax.swing.JSeparator();
        lognUserLabel = new javax.swing.JLabel();
        lognUserSeparator2 = new javax.swing.JSeparator();
        lognUserTextField = new javax.swing.JTextField();
        lognPassLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        buttonPanel = new javax.swing.JPanel();
        entrarLabel = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        header = new javax.swing.JPanel();
        close = new javax.swing.JPanel();
        closeButtonLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(800, 500));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login Vendedor");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 56, 270, 40));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Img.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 540));

        jLabel3.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Inicie sesión para continuar");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 96, -1, -1));

        titleSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        background.add(titleSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 400, 20));

        lognUserLabel.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lognUserLabel.setForeground(new java.awt.Color(102, 102, 102));
        lognUserLabel.setText("Ingresar usuario");
        background.add(lognUserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 190, 180, -1));
        background.add(lognUserSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 243, 270, 10));

        lognUserTextField.setBackground(new java.awt.Color(255, 255, 255));
        lognUserTextField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lognUserTextField.setForeground(new java.awt.Color(204, 204, 204));
        lognUserTextField.setText("Nombre de usuario");
        lognUserTextField.setBorder(null);
        lognUserTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lognUserTextFieldMousePressed(evt);
            }
        });
        lognUserTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lognUserTextFieldActionPerformed(evt);
            }
        });
        background.add(lognUserTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 210, 270, 40));

        lognPassLabel.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lognPassLabel.setForeground(new java.awt.Color(102, 102, 102));
        lognPassLabel.setText("Ingrese su contraseña");
        background.add(lognPassLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 270, 190, -1));
        background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 322, 270, 10));

        buttonPanel.setBackground(new java.awt.Color(0, 0, 0));

        entrarLabel.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        entrarLabel.setForeground(new java.awt.Color(255, 255, 255));
        entrarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entrarLabel.setText("Entrar");
        entrarLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrarLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        entrarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                entrarLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                entrarLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        background.add(buttonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 350, 210, 40));

        passField.setBackground(new java.awt.Color(255, 255, 255));
        passField.setForeground(new java.awt.Color(204, 204, 204));
        passField.setText("******************");
        passField.setBorder(null);
        passField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passFieldMousePressed(evt);
            }
        });
        background.add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 290, 270, 40));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        close.setBackground(new java.awt.Color(255, 255, 255));

        closeButtonLabel.setBackground(new java.awt.Color(255, 255, 255));
        closeButtonLabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        closeButtonLabel.setForeground(new java.awt.Color(0, 0, 0));
        closeButtonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeButtonLabel.setText("X");
        closeButtonLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeButtonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeButtonLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeButtonLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout closeLayout = new javax.swing.GroupLayout(close);
        close.setLayout(closeLayout);
        closeLayout.setHorizontalGroup(
            closeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closeButtonLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );
        closeLayout.setVerticalGroup(
            closeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closeButtonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 755, Short.MAX_VALUE)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        background.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lognUserTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lognUserTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lognUserTextFieldActionPerformed

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        //nops ayuda a saber la posición de nuestro mouse para luego mover la
        //barra a voluntad.
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        //con esta acción podemos mover la barra a volundad
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void closeButtonLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonLabelMouseClicked
        dispose();
        java.awt.EventQueue.invokeLater(() -> {
            new quienEres().setVisible(true);
        });
    }//GEN-LAST:event_closeButtonLabelMouseClicked

    private void closeButtonLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonLabelMouseEntered
        close.setBackground(Color.red);
        closeButtonLabel.setForeground(Color.white);
    }//GEN-LAST:event_closeButtonLabelMouseEntered

    private void closeButtonLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonLabelMouseExited
        close.setBackground(Color.white);
        closeButtonLabel.setForeground(Color.black);
    }//GEN-LAST:event_closeButtonLabelMouseExited

    private void entrarLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarLabelMouseExited
        buttonPanel.setBackground(Color.BLACK);
        entrarLabel.setForeground(Color.white);
    }//GEN-LAST:event_entrarLabelMouseExited

    private void entrarLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarLabelMouseEntered
        buttonPanel.setBackground(new Color(106,105,105));
        entrarLabel.setForeground(Color.BLACK);
    }//GEN-LAST:event_entrarLabelMouseEntered

    private void entrarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_entrarLabelMouseClicked

    private void lognUserTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lognUserTextFieldMousePressed
        if(lognUserTextField.getText().equals("Nombre de usuario")){
            lognUserTextField.setText("");
            lognUserTextField.setForeground(Color.black);
        }
        if(String.valueOf(passField.getPassword()).isEmpty()){
            passField.setText("******************");
            passField.setForeground(Color.gray);
        }
    }//GEN-LAST:event_lognUserTextFieldMousePressed

    private void passFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passFieldMousePressed
        if(String.valueOf(passField.getPassword()).equals("******************")){
            passField.setText("");
            passField.setForeground(Color.black);
        }
        if(lognUserTextField.getText().isEmpty()){
            lognUserTextField.setText("Nombre de usuario");
            lognUserTextField.setForeground(Color.gray);
        }
    }//GEN-LAST:event_passFieldMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel close;
    private javax.swing.JLabel closeButtonLabel;
    private javax.swing.JLabel entrarLabel;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lognPassLabel;
    private javax.swing.JLabel lognUserLabel;
    private javax.swing.JSeparator lognUserSeparator2;
    private javax.swing.JTextField lognUserTextField;
    private javax.swing.JPasswordField passField;
    private javax.swing.JSeparator titleSeparator1;
    // End of variables declaration//GEN-END:variables
}