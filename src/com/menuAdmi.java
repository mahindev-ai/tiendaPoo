/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;
import java.awt.Color;
import static java.awt.Color.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author devin
 */
public class menuAdmi extends javax.swing.JFrame {
    int xMouse,yMouse;
    /**
     * Creates new form Menu_admi
     */
    public menuAdmi() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        crearVendedorButton = new javax.swing.JPanel();
        crearVendedorLabel = new javax.swing.JLabel();
        boligrafo = new javax.swing.JLabel();
        llamarVendedorButton = new javax.swing.JPanel();
        llamarProveedorLabel = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        verInventarioButton = new javax.swing.JPanel();
        verInventarioLabel = new javax.swing.JLabel();
        cajaPaquete = new javax.swing.JLabel();
        verVentasButton = new javax.swing.JPanel();
        verVentasLabel = new javax.swing.JLabel();
        bolsaCompra = new javax.swing.JLabel();
        verFacturasButton = new javax.swing.JPanel();
        verFacturasLabel = new javax.swing.JLabel();
        factura = new javax.swing.JLabel();
        titleSeparator1 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        menuClose = new javax.swing.JPanel();
        closeButton = new javax.swing.JPanel();
        closeLabel = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        index = new javax.swing.JPanel();
        titleIndex = new javax.swing.JLabel();
        crearVendedor = new javax.swing.JPanel();
        llamarVendedor = new javax.swing.JPanel();
        verInventario = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        verVentas = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        verFacturas = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(800, 500));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(0, 0, 0));

        crearVendedorButton.setBackground(new java.awt.Color(0, 0, 0));

        crearVendedorLabel.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        crearVendedorLabel.setForeground(new java.awt.Color(255, 255, 255));
        crearVendedorLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        crearVendedorLabel.setText("Crear vendedor");
        crearVendedorLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearVendedorLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        crearVendedorLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearVendedorLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crearVendedorLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crearVendedorLabelMouseExited(evt);
            }
        });

        boligrafo.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        boligrafo.setForeground(new java.awt.Color(255, 255, 255));
        boligrafo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boligrafo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boligrafo.png"))); // NOI18N
        boligrafo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boligrafo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boligrafo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boligrafoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boligrafoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boligrafoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout crearVendedorButtonLayout = new javax.swing.GroupLayout(crearVendedorButton);
        crearVendedorButton.setLayout(crearVendedorButtonLayout);
        crearVendedorButtonLayout.setHorizontalGroup(
            crearVendedorButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearVendedorButtonLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(boligrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crearVendedorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        crearVendedorButtonLayout.setVerticalGroup(
            crearVendedorButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crearVendedorLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
            .addGroup(crearVendedorButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boligrafo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        llamarVendedorButton.setBackground(new java.awt.Color(0, 0, 0));

        llamarProveedorLabel.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        llamarProveedorLabel.setForeground(new java.awt.Color(255, 255, 255));
        llamarProveedorLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        llamarProveedorLabel.setText("Llamar proveedor");
        llamarProveedorLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        llamarProveedorLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        llamarProveedorLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                llamarProveedorLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                llamarProveedorLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                llamarProveedorLabelMouseExited(evt);
            }
        });

        telefono.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        telefono.setForeground(new java.awt.Color(255, 255, 255));
        telefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telefono.png"))); // NOI18N
        telefono.setToolTipText("");
        telefono.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        telefono.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        telefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telefonoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                telefonoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                telefonoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout llamarVendedorButtonLayout = new javax.swing.GroupLayout(llamarVendedorButton);
        llamarVendedorButton.setLayout(llamarVendedorButtonLayout);
        llamarVendedorButtonLayout.setHorizontalGroup(
            llamarVendedorButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(llamarVendedorButtonLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(llamarProveedorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        llamarVendedorButtonLayout.setVerticalGroup(
            llamarVendedorButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(llamarProveedorLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(llamarVendedorButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(telefono)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        verInventarioButton.setBackground(new java.awt.Color(0, 0, 0));

        verInventarioLabel.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        verInventarioLabel.setForeground(new java.awt.Color(255, 255, 255));
        verInventarioLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        verInventarioLabel.setText("Ver inventario");
        verInventarioLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verInventarioLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        verInventarioLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verInventarioLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                verInventarioLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verInventarioLabelMouseExited(evt);
            }
        });

        cajaPaquete.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        cajaPaquete.setForeground(new java.awt.Color(255, 255, 255));
        cajaPaquete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cajaPaquete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caja-del-paquete.png"))); // NOI18N
        cajaPaquete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cajaPaquete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cajaPaquete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cajaPaqueteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cajaPaqueteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cajaPaqueteMouseExited(evt);
            }
        });

        javax.swing.GroupLayout verInventarioButtonLayout = new javax.swing.GroupLayout(verInventarioButton);
        verInventarioButton.setLayout(verInventarioButtonLayout);
        verInventarioButtonLayout.setHorizontalGroup(
            verInventarioButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verInventarioButtonLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(cajaPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verInventarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        verInventarioButtonLayout.setVerticalGroup(
            verInventarioButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verInventarioLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, verInventarioButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cajaPaquete)
                .addContainerGap())
        );

        verVentasButton.setBackground(new java.awt.Color(0, 0, 0));

        verVentasLabel.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        verVentasLabel.setForeground(new java.awt.Color(255, 255, 255));
        verVentasLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        verVentasLabel.setText("Ver ventas");
        verVentasLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verVentasLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        verVentasLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verVentasLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                verVentasLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verVentasLabelMouseExited(evt);
            }
        });

        bolsaCompra.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        bolsaCompra.setForeground(new java.awt.Color(255, 255, 255));
        bolsaCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bolsaCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bolsa-de-la-compra.png"))); // NOI18N
        bolsaCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bolsaCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bolsaCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bolsaCompraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bolsaCompraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bolsaCompraMouseExited(evt);
            }
        });

        javax.swing.GroupLayout verVentasButtonLayout = new javax.swing.GroupLayout(verVentasButton);
        verVentasButton.setLayout(verVentasButtonLayout);
        verVentasButtonLayout.setHorizontalGroup(
            verVentasButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verVentasButtonLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(bolsaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verVentasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        verVentasButtonLayout.setVerticalGroup(
            verVentasButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verVentasLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(verVentasButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bolsaCompra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        verFacturasButton.setBackground(new java.awt.Color(0, 0, 0));

        verFacturasLabel.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        verFacturasLabel.setForeground(new java.awt.Color(255, 255, 255));
        verFacturasLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        verFacturasLabel.setText("Ver facturas");
        verFacturasLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verFacturasLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        verFacturasLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verFacturasLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                verFacturasLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verFacturasLabelMouseExited(evt);
            }
        });

        factura.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        factura.setForeground(new java.awt.Color(255, 255, 255));
        factura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/factura.png"))); // NOI18N
        factura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        factura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        factura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facturaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                facturaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                facturaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout verFacturasButtonLayout = new javax.swing.GroupLayout(verFacturasButton);
        verFacturasButton.setLayout(verFacturasButtonLayout);
        verFacturasButtonLayout.setHorizontalGroup(
            verFacturasButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verFacturasButtonLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(factura, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verFacturasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        verFacturasButtonLayout.setVerticalGroup(
            verFacturasButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verFacturasLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(verFacturasButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(factura)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        titleSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        titleSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Menu de opciones");

        jLabel15.setFont(new java.awt.Font("Poppins Medium", 0, 32)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("ADMINISTRADOR");

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleSeparator1)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(crearVendedorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(llamarVendedorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(verInventarioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(verVentasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(verFacturasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(titleSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(crearVendedorButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(llamarVendedorButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(verInventarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(verVentasButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(verFacturasButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        background.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 600));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blanco.png"))); // NOI18N
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
        background.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 40));

        menuClose.setBackground(new java.awt.Color(255, 255, 255));
        menuClose.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeButton.setBackground(new java.awt.Color(255, 255, 255));

        closeLabel.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        closeLabel.setForeground(new java.awt.Color(0, 0, 0));
        closeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeLabel.setText("X");
        closeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout closeButtonLayout = new javax.swing.GroupLayout(closeButton);
        closeButton.setLayout(closeButtonLayout);
        closeButtonLayout.setHorizontalGroup(
            closeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );
        closeButtonLayout.setVerticalGroup(
            closeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        menuClose.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 45, 40));

        background.add(menuClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 0, -1, -1));

        index.setBackground(new java.awt.Color(255, 255, 255));

        titleIndex.setFont(new java.awt.Font("Poppins Medium", 0, 32)); // NOI18N
        titleIndex.setForeground(new java.awt.Color(51, 51, 51));
        titleIndex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleIndex.setText("MENÚ ADMINISTRADOR");

        javax.swing.GroupLayout indexLayout = new javax.swing.GroupLayout(index);
        index.setLayout(indexLayout);
        indexLayout.setHorizontalGroup(
            indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(indexLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(titleIndex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(155, 155, 155))
        );
        indexLayout.setVerticalGroup(
            indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(indexLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(titleIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(428, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", index);

        javax.swing.GroupLayout crearVendedorLayout = new javax.swing.GroupLayout(crearVendedor);
        crearVendedor.setLayout(crearVendedorLayout);
        crearVendedorLayout.setHorizontalGroup(
            crearVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        crearVendedorLayout.setVerticalGroup(
            crearVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", crearVendedor);

        javax.swing.GroupLayout llamarVendedorLayout = new javax.swing.GroupLayout(llamarVendedor);
        llamarVendedor.setLayout(llamarVendedorLayout);
        llamarVendedorLayout.setHorizontalGroup(
            llamarVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        llamarVendedorLayout.setVerticalGroup(
            llamarVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", llamarVendedor);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        verInventario.setViewportView(jTable1);

        jTabbedPane1.addTab("tab4", verInventario);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        verVentas.setViewportView(jTable2);

        jTabbedPane1.addTab("tab5", verVentas);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        verFacturas.setViewportView(jTable3);

        jTabbedPane1.addTab("tab6", verFacturas);

        background.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 650, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void cambiarColor(JPanel panel, JLabel label, Color colorPanel, Color colorLabel) {
        panel.setBackground(colorPanel);
        label.setForeground(colorLabel);
    }
    private void crearVendedorLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearVendedorLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_crearVendedorLabelMouseClicked

    private void crearVendedorLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearVendedorLabelMouseEntered
        crearVendedorButton.setBackground(new Color(106,105,105));
        crearVendedorLabel.setForeground(Color.BLACK);
    }//GEN-LAST:event_crearVendedorLabelMouseEntered

    private void crearVendedorLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearVendedorLabelMouseExited
        crearVendedorButton.setBackground(Color.BLACK);
        crearVendedorLabel.setForeground(Color.white);
    }//GEN-LAST:event_crearVendedorLabelMouseExited

    private void boligrafoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boligrafoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_boligrafoMouseClicked

    private void boligrafoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boligrafoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_boligrafoMouseEntered

    private void boligrafoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boligrafoMouseExited
        
    }//GEN-LAST:event_boligrafoMouseExited

    private void llamarProveedorLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_llamarProveedorLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_llamarProveedorLabelMouseClicked

    private void llamarProveedorLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_llamarProveedorLabelMouseEntered
        llamarVendedorButton.setBackground(new Color(106,105,105));
        llamarProveedorLabel.setForeground(Color.BLACK);
    }//GEN-LAST:event_llamarProveedorLabelMouseEntered

    private void llamarProveedorLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_llamarProveedorLabelMouseExited
        llamarVendedorButton.setBackground(Color.BLACK);
        llamarProveedorLabel.setForeground(Color.white);
    }//GEN-LAST:event_llamarProveedorLabelMouseExited

    private void telefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefonoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoMouseClicked

    private void telefonoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefonoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoMouseEntered

    private void telefonoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefonoMouseExited
        
    }//GEN-LAST:event_telefonoMouseExited

    private void verInventarioLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verInventarioLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_verInventarioLabelMouseClicked

    private void verInventarioLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verInventarioLabelMouseEntered
        verInventarioButton.setBackground(new Color(106,105,105));
        verInventarioLabel.setForeground(Color.BLACK);
    }//GEN-LAST:event_verInventarioLabelMouseEntered

    private void verInventarioLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verInventarioLabelMouseExited
        verInventarioButton.setBackground(Color.BLACK);
        verInventarioLabel.setForeground(Color.white);
    }//GEN-LAST:event_verInventarioLabelMouseExited

    private void cajaPaqueteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajaPaqueteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaPaqueteMouseClicked

    private void cajaPaqueteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajaPaqueteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaPaqueteMouseEntered

    private void cajaPaqueteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajaPaqueteMouseExited
        
    }//GEN-LAST:event_cajaPaqueteMouseExited

    private void verVentasLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verVentasLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_verVentasLabelMouseClicked

    private void verVentasLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verVentasLabelMouseEntered
        verVentasButton.setBackground(new Color(106,105,105));
        verVentasLabel.setForeground(Color.BLACK);
    }//GEN-LAST:event_verVentasLabelMouseEntered

    private void verVentasLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verVentasLabelMouseExited
        verVentasButton.setBackground(Color.BLACK);
        verVentasLabel.setForeground(Color.white);
    }//GEN-LAST:event_verVentasLabelMouseExited

    private void bolsaCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bolsaCompraMouseClicked
        
    }//GEN-LAST:event_bolsaCompraMouseClicked

    private void bolsaCompraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bolsaCompraMouseEntered
        
    }//GEN-LAST:event_bolsaCompraMouseEntered

    private void bolsaCompraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bolsaCompraMouseExited
        
    }//GEN-LAST:event_bolsaCompraMouseExited

    private void verFacturasLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verFacturasLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_verFacturasLabelMouseClicked

    private void verFacturasLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verFacturasLabelMouseEntered
        verFacturasButton.setBackground(new Color(106,105,105));
        verFacturasLabel.setForeground(Color.BLACK);
    }//GEN-LAST:event_verFacturasLabelMouseEntered

    private void verFacturasLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verFacturasLabelMouseExited
        verFacturasButton.setBackground(Color.BLACK);
        verFacturasLabel.setForeground(Color.white);
    }//GEN-LAST:event_verFacturasLabelMouseExited

    private void facturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_facturaMouseClicked

    private void facturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_facturaMouseEntered

    private void facturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_facturaMouseExited

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        // agregar cierre:
    }//GEN-LAST:event_closeLabelMouseClicked

    private void closeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseEntered
        cambiarColor(closeButton, closeLabel, RED, WHITE);
    }//GEN-LAST:event_closeLabelMouseEntered

    private void closeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseExited
        cambiarColor(closeButton, closeLabel, WHITE, BLACK);
    }//GEN-LAST:event_closeLabelMouseExited

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
            java.util.logging.Logger.getLogger(menuAdmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuAdmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuAdmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuAdmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuAdmi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel boligrafo;
    private javax.swing.JLabel bolsaCompra;
    private javax.swing.JLabel cajaPaquete;
    private javax.swing.JPanel closeButton;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JPanel crearVendedor;
    private javax.swing.JPanel crearVendedorButton;
    private javax.swing.JLabel crearVendedorLabel;
    private javax.swing.JLabel factura;
    private javax.swing.JLabel header;
    private javax.swing.JPanel index;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel llamarProveedorLabel;
    private javax.swing.JPanel llamarVendedor;
    private javax.swing.JPanel llamarVendedorButton;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuClose;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel titleIndex;
    private javax.swing.JSeparator titleSeparator1;
    private javax.swing.JScrollPane verFacturas;
    private javax.swing.JPanel verFacturasButton;
    private javax.swing.JLabel verFacturasLabel;
    private javax.swing.JScrollPane verInventario;
    private javax.swing.JPanel verInventarioButton;
    private javax.swing.JLabel verInventarioLabel;
    private javax.swing.JScrollPane verVentas;
    private javax.swing.JPanel verVentasButton;
    private javax.swing.JLabel verVentasLabel;
    // End of variables declaration//GEN-END:variables
}
