
import java.awt.event.ActionEvent;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombrePaciente = new javax.swing.JTextField();
        btAgregar = new javax.swing.JButton();
        btConsultarNombre = new javax.swing.JButton();
        btConsultarSintomas = new javax.swing.JButton();
        txtSintomas = new javax.swing.JTextField();
        txtDiagnostico = new javax.swing.JTextField();
        txtTratamiento = new javax.swing.JTextField();
        btLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Médico");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sistema Médico", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft YaHei UI", 1, 14), new java.awt.Color(0, 51, 204))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel1.setText("Cédula:");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel2.setText("Nombre del Paciente:");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel3.setText("Síntomas:");

        jLabel4.setText("Diagnóstico:");

        jLabel5.setText("Tratamiento:");

        btAgregar.setBackground(new java.awt.Color(51, 51, 255));
        btAgregar.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btAgregar.setText("Agregar");
        btAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }
        });

        btConsultarNombre.setBackground(new java.awt.Color(51, 51, 255));
        btConsultarNombre.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btConsultarNombre.setForeground(new java.awt.Color(255, 255, 255));
        btConsultarNombre.setText("Consultar por Nombre");
        btConsultarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarNombreActionPerformed(evt);
            }
        });

        btConsultarSintomas.setBackground(new java.awt.Color(51, 51, 255));
        btConsultarSintomas.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btConsultarSintomas.setForeground(new java.awt.Color(255, 255, 255));
        btConsultarSintomas.setText("Consultar por Síntomas");
        btConsultarSintomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarSintomasActionPerformed(evt);
            }
        });

        btLimpiar.setBackground(new java.awt.Color(51, 51, 255));
        btLimpiar.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDiagnostico))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSintomas))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTratamiento))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(txtCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btConsultarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                        .addGap(42, 42, 42)
                        .addComponent(btConsultarSintomas, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                        .addGap(55, 55, 55)
                        .addComponent(btAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                        .addGap(57, 57, 57)
                        .addComponent(btLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSintomas))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDiagnostico))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTratamiento)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtCedula))
                        .addGap(147, 147, 147)))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btConsultarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btConsultarSintomas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        txtCedula.setText("");
        txtNombrePaciente.setText("");
        txtSintomas.setText("");
        txtDiagnostico.setText("");
        txtTratamiento.setText("");
        txtCedula.requestFocus();
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
        String cedula = txtCedula.getText();
        String nombre = txtNombrePaciente.getText();
        String sintomas = txtSintomas.getText();
        String diagnostico = txtDiagnostico.getText();
        String tratamiento = txtTratamiento.getText();

        if (cedula.isEmpty() || nombre.isEmpty() || sintomas.isEmpty() || diagnostico.isEmpty() || tratamiento.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Paciente paciente = new Paciente(cedula, nombre, sintomas, diagnostico, tratamiento);

        Archivo.agregarPaciente(paciente);

        JOptionPane.showMessageDialog(this, "Paciente agregado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        limpiarCampos();
    }//GEN-LAST:event_btAgregarActionPerformed

    private void btConsultarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarNombreActionPerformed
        String nombreBuscar = txtNombrePaciente.getText();

    
        if (nombreBuscar.isEmpty() ){
            JOptionPane.showMessageDialog(null, "Ingrese un nombre por favor");
        }
        ConsultarNombre.porNombre(nombreBuscar);
      
    }//GEN-LAST:event_btConsultarNombreActionPerformed

    private void btConsultarSintomasActionPerformed(java.awt.event.ActionEvent evt) {                                                    
    String sintomasBuscados = txtSintomas.getText();
    
    if (sintomasBuscados.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor ingrese los síntomas a buscar.", 
                "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    ConsultarSintomas.buscarPorSintomas(sintomasBuscados);

        try (DataInputStream dis = new DataInputStream(
                new FileInputStream("pacientes.dat"))) {
            boolean encontrado = false;
            while (dis.available() > 0) {
                String cedula = dis.readUTF();
                String nombre = dis.readUTF();
                String sintomas = dis.readUTF();
                String diagnostico = dis.readUTF();
                String tratamiento = dis.readUTF();
                if (sintomas.equals(sintomasBuscados)) {

                    txtNombrePaciente.setText(nombre);
                    txtCedula.setText(cedula);
                    txtSintomas.setText(sintomas);
                    txtDiagnostico.setText(diagnostico);
                    txtTratamiento.setText(tratamiento);

                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "Paciente no encontrado", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (EOFException e) {
            //fin del archivo
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar los datos", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

    }                                                 

    private void btConsultarSintomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarSintomasActionPerformed
        String sintomasBuscados = txtSintomas.getText();

        if (sintomasBuscados.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese los síntomas a buscar.",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        ConsultarSintomas.buscarPorSintomas(sintomasBuscados);



    }//GEN-LAST:event_btConsultarSintomasActionPerformed

    private void limpiarCampos() {
        txtCedula.setText("");
        txtNombrePaciente.setText("");
        txtSintomas.setText("");
        txtDiagnostico.setText("");
        txtTratamiento.setText("");
        txtCedula.requestFocus(); // Colocar el foco en el campo de cédula
    }

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btConsultarNombre;
    private javax.swing.JButton btConsultarSintomas;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDiagnostico;
    private javax.swing.JTextField txtNombrePaciente;
    private javax.swing.JTextField txtSintomas;
    private javax.swing.JTextField txtTratamiento;
    // End of variables declaration//GEN-END:variables
}
