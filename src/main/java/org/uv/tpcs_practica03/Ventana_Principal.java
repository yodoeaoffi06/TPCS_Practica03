/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.uv.tpcs_practica03;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author yodoeaoffi06
 */
public class Ventana_Principal extends javax.swing.JFrame {

    private List<Producto> productosVenta = new ArrayList();

    /**
     * Creates new form GUI
     */
    public Ventana_Principal() {
        initComponents();
        this.setLocationRelativeTo(this);
        getId_Venta();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        lbVenta = new javax.swing.JLabel();
        tfVenta = new javax.swing.JTextField();
        lbFecha = new javax.swing.JLabel();
        dcFecha = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProductos = new javax.swing.JTable();
        lbCliente = new javax.swing.JLabel();
        btnBuscarCliente = new javax.swing.JButton();
        tfCliente = new javax.swing.JTextField();
        btnRemover = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnVender = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Práctica 3");

        lbVenta.setText("Venta:");

        tfVenta.setEditable(false);

        lbFecha.setText("Fecha:");

        dcFecha.setDateFormatString("YYYY-MM-dd");

        tableProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableProductos);

        lbCliente.setText("Cliente:");

        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnVender.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnVender.setText("Vender");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(panelFondoLayout.createSequentialGroup()
                            .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(panelFondoLayout.createSequentialGroup()
                                    .addComponent(lbCliente)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfCliente))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFondoLayout.createSequentialGroup()
                                    .addComponent(lbVenta)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelFondoLayout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addComponent(lbFecha)
                                    .addGap(18, 18, 18)
                                    .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(panelFondoLayout.createSequentialGroup()
                                            .addComponent(btnAgregar)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnRemover))
                                        .addComponent(dcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(panelFondoLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnBuscarCliente)))))
                    .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbVenta)
                                .addComponent(tfVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbFecha)))
                        .addGap(18, 18, 18)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCliente)
                            .addComponent(tfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemover, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        String nombreCliente = tfCliente.getText();

        String hql = "FROM cliente c WHERE c.nombre = :nombre";
        Query<Cliente> query = session.createQuery(hql, Cliente.class);
        query.setParameter("nombre", nombreCliente);

        Cliente clienteEncontrado = query.uniqueResult();

        if (clienteEncontrado != null) {
            Long idCliente = clienteEncontrado.getId_cliente();

            tfCliente.setText("" + idCliente);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        }

        transaction.commit();

        session.close();
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        AgregarProducto ventana = new AgregarProducto(new AgregarProductoCallBack() {
            @Override
            public void onVariableReceived(Producto producto) {
                productosVenta.add(producto);

                fillTable();
            }
        });

        ventana.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        int selectedRow = tableProductos.getSelectedRow();
        TableModel model = tableProductos.getModel();

        if (selectedRow != -1) {
            productosVenta.remove(selectedRow);
            fillTable();
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        if (!tfCliente.getText().equals("") && dcFecha.getDate() != null && !productosVenta.isEmpty()) {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();

            Venta venta = new Venta();
            venta.setId_venta(Long.parseLong(tfVenta.getText()));
            venta.setFecha(new java.sql.Date(dcFecha.getDate().getTime()));
            venta.setId_cliente(Long.parseLong(tfCliente.getText()));

            BigDecimal suma = BigDecimal.ZERO;

            for (Producto producto : productosVenta) {
                suma = suma.add(producto.getPrecio());
            }

            venta.setTotal(suma);

            session.save(venta);

            for (Producto producto : productosVenta) {
                if (producto != null) {
                    DetVenta detVenta = new DetVenta();
                    detVenta.setId_venta(venta.getId_venta());
                    int cantidad = Collections.frequency(productosVenta, producto);
                    BigDecimal total = producto.getPrecio().multiply(new BigDecimal(cantidad));

                    detVenta.setId_producto(producto.getId_producto());
                    detVenta.setCantidad(cantidad);
                    detVenta.setPrecio(total);

                    session.save(detVenta);
                }
            }

            transaction.commit();
            session.close();

            getId_Venta();
            productosVenta = new ArrayList<>();
            tfCliente.setText("");
            dcFecha.setDate(null);
            fillTable();
        } else {
            JOptionPane.showMessageDialog(null, "Llene adecuadamente los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVenderActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Principal().setVisible(true);
            }
        });
    }

    public void fillTable() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Producto");
        model.addColumn("Descripción");
        model.addColumn("Precio");

        for (Producto producto : productosVenta) {
            model.addRow(new Object[]{
                producto.getId_producto(),
                producto.getDescripcion(),
                producto.getPrecio()
            });
        }

        tableProductos.setModel(model);
    }

    public void getId_Venta() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Query<Long> query = session.createQuery("SELECT MAX(v.id_venta) FROM venta v", Long.class);

        Long ultimoIdVenta = query.uniqueResult();

        tfVenta.setText("" + (ultimoIdVenta + 1));

        transaction.commit();
        session.close();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnVender;
    private com.toedter.calendar.JDateChooser dcFecha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbVenta;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTable tableProductos;
    private javax.swing.JTextField tfCliente;
    private javax.swing.JTextField tfVenta;
    // End of variables declaration//GEN-END:variables
}
