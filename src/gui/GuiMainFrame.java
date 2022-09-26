package gui;

import clases.Cliente;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import main.Main;

public class GuiMainFrame extends javax.swing.JFrame {

    public GuiMainFrame() {
        initComponents();
        this.setResizable(false); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jLTiitulo = new javax.swing.JLabel();
        btnAgregarCliente = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        btnBuscarTel = new javax.swing.JButton();
        btnBuscarClientes = new javax.swing.JButton();
        btnBorrarCliente = new javax.swing.JButton();
        btnMostrarClientes = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jSpResultado = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextPane();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLTiitulo.setFont(new java.awt.Font("Source Serif Pro Semibold", 1, 48)); // NOI18N
        jLTiitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTiitulo.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\ULP\\2do Cuatrimestre\\Laboratorio 1\\Proyectos\\Tp3_Obligatorio\\img\\book-solid.png")); // NOI18N
        jLTiitulo.setText("Directorio de clientes");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(jLTiitulo)
                .addGap(58, 58, 58))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jLTiitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        btnAgregarCliente.setFont(new java.awt.Font("Source Serif Pro Semibold", 0, 18)); // NOI18N
        btnAgregarCliente.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\ULP\\2do Cuatrimestre\\Laboratorio 1\\Proyectos\\Tp3_Obligatorio\\img\\square-plus-solid.png")); // NOI18N
        btnAgregarCliente.setText("Agregar Cliente");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });

        btnBuscarCliente.setFont(new java.awt.Font("Source Serif Pro Semibold", 0, 18)); // NOI18N
        btnBuscarCliente.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\ULP\\2do Cuatrimestre\\Laboratorio 1\\Proyectos\\Tp3_Obligatorio\\img\\buscarCliente.png")); // NOI18N
        btnBuscarCliente.setText("Buscar Cliente");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btnBuscarTel.setFont(new java.awt.Font("Source Serif Pro Semibold", 0, 18)); // NOI18N
        btnBuscarTel.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\ULP\\2do Cuatrimestre\\Laboratorio 1\\Proyectos\\Tp3_Obligatorio\\img\\buscarTelefono.png")); // NOI18N
        btnBuscarTel.setText("Buscar Telefono");
        btnBuscarTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTelActionPerformed(evt);
            }
        });

        btnBuscarClientes.setFont(new java.awt.Font("Source Serif Pro Semibold", 0, 18)); // NOI18N
        btnBuscarClientes.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\ULP\\2do Cuatrimestre\\Laboratorio 1\\Proyectos\\Tp3_Obligatorio\\img\\buscarClientes.png")); // NOI18N
        btnBuscarClientes.setText("Buscar Clientes");
        btnBuscarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClientesActionPerformed(evt);
            }
        });

        btnBorrarCliente.setFont(new java.awt.Font("Source Serif Pro Semibold", 0, 18)); // NOI18N
        btnBorrarCliente.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\ULP\\2do Cuatrimestre\\Laboratorio 1\\Proyectos\\Tp3_Obligatorio\\img\\trash-can-solid.png")); // NOI18N
        btnBorrarCliente.setText("Borrar Cliente");
        btnBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarClienteActionPerformed(evt);
            }
        });

        btnMostrarClientes.setFont(new java.awt.Font("Source Serif Pro Semibold", 0, 18)); // NOI18N
        btnMostrarClientes.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\ULP\\2do Cuatrimestre\\Laboratorio 1\\Proyectos\\Tp3_Obligatorio\\img\\address-book-solid.png")); // NOI18N
        btnMostrarClientes.setText("Mostrar Clientes");
        btnMostrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarClientesActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(102, 0, 0));
        btnSalir.setFont(new java.awt.Font("Source Serif Pro Semibold", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\ULP\\2do Cuatrimestre\\Laboratorio 1\\Proyectos\\Tp3_Obligatorio\\img\\door-open-solid.png")); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtResultado.setEditable(false);
        txtResultado.setBackground(new java.awt.Color(204, 204, 204));
        txtResultado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtResultado.setFont(new java.awt.Font("Source Code Pro Medium", 0, 14)); // NOI18N
        jSpResultado.setViewportView(txtResultado);

        btnLimpiar.setFont(new java.awt.Font("Source Serif Pro Semibold", 0, 18)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\ULP\\2do Cuatrimestre\\Laboratorio 1\\Proyectos\\Tp3_Obligatorio\\img\\broom-solid.png")); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarTel, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jSpResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSpResultado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnBuscarTel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnBuscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(btnMostrarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        GuiAgregarCliente agregar = new GuiAgregarCliente();
        agregar.setVisible(true);
        agregar.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        String mostrar = "";
        Cliente aux = Main.getDir().buscarCliente();
        if (aux != null) {
            mostrar += aux;
        } else {
            JOptionPane.showMessageDialog(null, "El numero ingresado"
                    + " no se encuentra asociado a ningun cliente");
        }
        txtResultado.setText(mostrar);
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        if((JOptionPane.showConfirmDialog(null, "Realmente "
                + "desea salir?", "Confirmar salida",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE))==0){
        System.exit(0);
        }
        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTelActionPerformed
        String mostrar = "";
        ArrayList<String> auxList = Main.getDir().buscarTelefono();
        if (!auxList.isEmpty()) {
            for (String aux : auxList) {
                mostrar += aux + "\n";
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se econtraron "
                    + "clientes con ese apellido");
        }
        txtResultado.setText(mostrar);

    }//GEN-LAST:event_btnBuscarTelActionPerformed

    private void btnMostrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarClientesActionPerformed
        String mostrar = "";
        for (Map.Entry<String, Cliente> entry : Main.getDir().getDIRECTORIO().entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            mostrar += value + "Tel: " + key + "\n" + "------------------------" + "\n";
        }        // TODO add your handling code here:
        txtResultado.setText(mostrar);
    }//GEN-LAST:event_btnMostrarClientesActionPerformed

    private void btnBuscarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClientesActionPerformed
        TreeSet<Cliente> auxSet = Main.getDir().buscarClientes();
        String mostrar = "";
        if (!auxSet.isEmpty()) {
            for (Cliente aux : auxSet) {
                mostrar += aux + "\n" + "------------------------" + "\n";
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se econtraron "
                    + "clientes con radicados en esa ciudad");
        }
        txtResultado.setText(mostrar);
    }//GEN-LAST:event_btnBuscarClientesActionPerformed

    private void btnBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarClienteActionPerformed
        Main.getDir().borrarCliente();
    }//GEN-LAST:event_btnBorrarClienteActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
         txtResultado.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnBorrarCliente;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarClientes;
    private javax.swing.JButton btnBuscarTel;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMostrarClientes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLTiitulo;
    private javax.swing.JScrollPane jSpResultado;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextPane txtResultado;
    // End of variables declaration//GEN-END:variables
}
