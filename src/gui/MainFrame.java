package gui;

import clases.Cliente;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import main.Main;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        this.setResizable(false); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        agregarCliente = new javax.swing.JButton();
        buscarCliente = new javax.swing.JButton();
        buscarTel = new javax.swing.JButton();
        buscarClientes = new javax.swing.JButton();
        borrarCliente = new javax.swing.JButton();
        mostrarClientes = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextPane();
        salir1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Source Serif Pro Semibold", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\ULP\\2do Cuatrimestre\\Laboratorio 1\\Proyectos\\Tp3_Obligatorio\\img\\book-solid.png")); // NOI18N
        jLabel1.setText("Directorio de clientes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(58, 58, 58))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        agregarCliente.setFont(new java.awt.Font("Source Serif Pro Semibold", 0, 18)); // NOI18N
        agregarCliente.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\ULP\\2do Cuatrimestre\\Laboratorio 1\\Proyectos\\Tp3_Obligatorio\\img\\square-plus-solid.png")); // NOI18N
        agregarCliente.setText("Agregar Cliente");
        agregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarClienteActionPerformed(evt);
            }
        });

        buscarCliente.setFont(new java.awt.Font("Source Serif Pro Semibold", 0, 18)); // NOI18N
        buscarCliente.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\ULP\\2do Cuatrimestre\\Laboratorio 1\\Proyectos\\Tp3_Obligatorio\\img\\buscarCliente.png")); // NOI18N
        buscarCliente.setText("Buscar Cliente");
        buscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarClienteActionPerformed(evt);
            }
        });

        buscarTel.setFont(new java.awt.Font("Source Serif Pro Semibold", 0, 18)); // NOI18N
        buscarTel.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\ULP\\2do Cuatrimestre\\Laboratorio 1\\Proyectos\\Tp3_Obligatorio\\img\\buscarTelefono.png")); // NOI18N
        buscarTel.setText("Buscar Telefono");
        buscarTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarTelActionPerformed(evt);
            }
        });

        buscarClientes.setFont(new java.awt.Font("Source Serif Pro Semibold", 0, 18)); // NOI18N
        buscarClientes.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\ULP\\2do Cuatrimestre\\Laboratorio 1\\Proyectos\\Tp3_Obligatorio\\img\\buscarClientes.png")); // NOI18N
        buscarClientes.setText("Buscar Clientes");
        buscarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarClientesActionPerformed(evt);
            }
        });

        borrarCliente.setFont(new java.awt.Font("Source Serif Pro Semibold", 0, 18)); // NOI18N
        borrarCliente.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\ULP\\2do Cuatrimestre\\Laboratorio 1\\Proyectos\\Tp3_Obligatorio\\img\\trash-can-solid.png")); // NOI18N
        borrarCliente.setText("Borrar Cliente");
        borrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarClienteActionPerformed(evt);
            }
        });

        mostrarClientes.setFont(new java.awt.Font("Source Serif Pro Semibold", 0, 18)); // NOI18N
        mostrarClientes.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\ULP\\2do Cuatrimestre\\Laboratorio 1\\Proyectos\\Tp3_Obligatorio\\img\\address-book-solid.png")); // NOI18N
        mostrarClientes.setText("Mostrar Clientes");
        mostrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarClientesActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(102, 0, 0));
        salir.setFont(new java.awt.Font("Source Serif Pro Semibold", 0, 18)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\ULP\\2do Cuatrimestre\\Laboratorio 1\\Proyectos\\Tp3_Obligatorio\\img\\door-open-solid.png")); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        resultado.setEditable(false);
        resultado.setBackground(new java.awt.Color(204, 204, 204));
        resultado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        resultado.setFont(new java.awt.Font("Source Code Pro Medium", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(resultado);

        salir1.setFont(new java.awt.Font("Source Serif Pro Semibold", 0, 18)); // NOI18N
        salir1.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\ULP\\2do Cuatrimestre\\Laboratorio 1\\Proyectos\\Tp3_Obligatorio\\img\\broom-solid.png")); // NOI18N
        salir1.setText("Limpiar");
        salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarTel, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(agregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(buscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(buscarTel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(buscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(borrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(mostrarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarClienteActionPerformed
        AgregarCliente agregar = new AgregarCliente();
        agregar.setVisible(true);
        agregar.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_agregarClienteActionPerformed

    private void buscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarClienteActionPerformed
        String mostrar = "";
        Cliente aux = Main.getDir().buscarCliente();
        if (aux != null) {
            mostrar += aux;
        } else {
            JOptionPane.showMessageDialog(null, "El numero ingresado"
                    + " no se encuentra asociado a ningun cliente");
        }
        resultado.setText(mostrar);
    }//GEN-LAST:event_buscarClienteActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        if((JOptionPane.showConfirmDialog(null, "Realmente "
                + "desea salir?", "Confirmar salida",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE))==0){
        System.exit(0);
        }
        
    }//GEN-LAST:event_salirActionPerformed

    private void buscarTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarTelActionPerformed
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
        resultado.setText(mostrar);

    }//GEN-LAST:event_buscarTelActionPerformed

    private void mostrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarClientesActionPerformed
        String mostrar = "";
        for (Map.Entry<String, Cliente> entry : Main.getDir().getDIRECTORIO().entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            mostrar += value + "Tel: " + key + "\n" + "------------------------" + "\n";
        }        // TODO add your handling code here:
        resultado.setText(mostrar);
    }//GEN-LAST:event_mostrarClientesActionPerformed

    private void buscarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarClientesActionPerformed
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
        resultado.setText(mostrar);
    }//GEN-LAST:event_buscarClientesActionPerformed

    private void borrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarClienteActionPerformed
        Main.getDir().borrarCliente();
    }//GEN-LAST:event_borrarClienteActionPerformed

    private void salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir1ActionPerformed
         resultado.setText("");
    }//GEN-LAST:event_salir1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarCliente;
    private javax.swing.JButton borrarCliente;
    private javax.swing.JButton buscarCliente;
    private javax.swing.JButton buscarClientes;
    private javax.swing.JButton buscarTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mostrarClientes;
    private javax.swing.JTextPane resultado;
    private javax.swing.JButton salir;
    private javax.swing.JButton salir1;
    // End of variables declaration//GEN-END:variables
}
