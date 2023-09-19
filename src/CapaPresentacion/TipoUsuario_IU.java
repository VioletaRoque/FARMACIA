package CapaPresentacion;

import CapaDatos.TipoUsuario;
import CapaNegocio.TipoUsuarioBD;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TipoUsuario_IU extends javax.swing.JInternalFrame {

    public TipoUsuario_IU() {
        initComponents();
        reportar();
    }

    private void limpiar() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtNombre.requestFocus();
    }

    private void exito(String mensaje) {
        JOptionPane.showConfirmDialog(this, mensaje, "MENSAJE", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }

    private void error(String mensaje) {
        JOptionPane.showConfirmDialog(this, mensaje, "ERROR", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }

    private void advertencia(String mensaje) {
        JOptionPane.showConfirmDialog(this, mensaje, "ADVERTENCIA", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }

    private void reportar() {
        try {
            setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
            DefaultTableModel tabla_temporal;
            TipoUsuarioBD oTipoUsuarioBD = new TipoUsuarioBD();
            tabla_temporal = oTipoUsuarioBD.reportarTipoUsuario();
            tabla_reporte_TipoUsuario.setModel(tabla_temporal);

            int cant = tabla_temporal.getRowCount();
            txtCantidad.setText("" + cant);
            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        } catch (Exception e) {
            e.printStackTrace();
            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_reporte_TipoUsuario = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        bntEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        bntCerrar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("TIPO DE USUARIO"));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("TIPO DE USUARIO");

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("Codigo");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCodigo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtCodigo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCodigo.setEnabled(false);

        txtNombre.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Cantidad");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCantidad.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtCantidad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCantidad.setEnabled(false);

        tabla_reporte_TipoUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tabla_reporte_TipoUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla_reporte_TipoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_reporte_TipoUsuarioMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_reporte_TipoUsuario);

        btnRegistrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/guardar.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/lapiz.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        bntEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bntEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/eliminar2.png"))); // NOI18N
        bntEliminar.setText("Eliminar");
        bntEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bntEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bntCerrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bntCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cerrar.png"))); // NOI18N
        bntCerrar.setText("Cerrar");
        bntCerrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bntCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNombre)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(bntEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bntCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnModificar)
                    .addComponent(bntEliminar)
                    .addComponent(btnLimpiar)
                    .addComponent(bntCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCerrarActionPerformed
        dispose();      // TODO add your handling code here:
    }//GEN-LAST:event_bntCerrarActionPerformed

    private void bntEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEliminarActionPerformed
        if (txtCodigo.getText().length() > 0) {
            int aviso = JOptionPane.showConfirmDialog(rootPane, "Estas seguro(a) de eliminar 🤔🤔");
            if (aviso == 0) {
                int codigo = Integer.parseInt(txtCodigo.getText().trim());
                TipoUsuarioBD oTipoUsuarioBD = new TipoUsuarioBD();
                TipoUsuario oTipoUsuario = new TipoUsuario();
                oTipoUsuario.setIdtipoUsuario(codigo);
                boolean rpta = oTipoUsuarioBD.eliminarTipoUsuario(oTipoUsuario);
                if (rpta) {
                    exito("Se elimino correctamente");
                    reportar();
                    limpiar();

                } else {
                    error("Hay problemas...😃🙄");
                }
            } else {
            }

        } else {
            error("Falta codigo");
        }

    }//GEN-LAST:event_bntEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (txtCodigo.getText().length() > 0) {
            if (txtNombre.getText().length() > 0) {

                TipoUsuario oTipoUsuario = new TipoUsuario();
                TipoUsuarioBD oTipoUsuarioBD = new TipoUsuarioBD();

                oTipoUsuario.setIdtipoUsuario(Integer.parseInt(txtCodigo.getText().trim()));
                oTipoUsuario.setTuNombre(txtNombre.getText().toUpperCase());

                boolean rpta = oTipoUsuarioBD.modificarTipoUsuario(oTipoUsuario);

                if (rpta) {
                    exito("Se registro con exito");
                    reportar();
                    limpiar();
                } else {
                    error("Tienes problemas al registrar");
                }

            } else {
                error("Ingresa tunombre");
                txtNombre.requestFocus();
            }
        } else {
            error("No existe el codigo al modificar");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (txtNombre.getText().length() > 0) {
            if (txtCodigo.getText().length() == 0) {
                TipoUsuario oTipoUsuario = new TipoUsuario();
                TipoUsuarioBD oTipoUsuarioBD = new TipoUsuarioBD();
                oTipoUsuario.setTuNombre(txtNombre.getText().trim().toUpperCase());
                boolean rpta = oTipoUsuarioBD.registrarTipoUsuario(oTipoUsuario);
                if (rpta) {
                    exito("Se registro correctamente");
                    reportar();
                    limpiar();
                } else {
                    error("Tienes problemas al registrar");
                }
            } else {
                error("No puedes registrar por que ta existe...");
            }
        } else {
            error("Ingresa tu nombre");
            txtNombre.requestFocus();

        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void tabla_reporte_TipoUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_reporte_TipoUsuarioMousePressed
        if (evt.getClickCount() == 2) {
            int fila_Seleccionada = tabla_reporte_TipoUsuario.getSelectedRow();
            txtCodigo.setText(tabla_reporte_TipoUsuario.getValueAt(fila_Seleccionada, 0).toString());
            txtNombre.setText(tabla_reporte_TipoUsuario.getValueAt(fila_Seleccionada, 1).toString());
        }
    }//GEN-LAST:event_tabla_reporte_TipoUsuarioMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCerrar;
    private javax.swing.JButton bntEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_reporte_TipoUsuario;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
