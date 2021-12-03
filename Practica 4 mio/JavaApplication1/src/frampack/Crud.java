
package frampack;

import Conexion.Conexion;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Crud extends javax.swing.JFrame {
    
         DefaultTableModel modelo;
    

    public Crud() {
        initComponents();
        
        
   
        String[] titulos = {"id","nombre","apellido","NombreDeUsuario","numero","correo","contraseña"};
    	modelo = new DefaultTableModel(null,titulos);
    	tablaUsuarios.setModel(modelo);
    	//Cargando los datos en mi tabla para que puedan ser mostrados al usuario.
    	this.consultar();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        NamC = new javax.swing.JLabel();
        LasNC = new javax.swing.JLabel();
        UserNamC = new javax.swing.JLabel();
        CorreoC = new javax.swing.JLabel();
        PhoneC = new javax.swing.JLabel();
        PassC = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        Actualizarbtn = new javax.swing.JButton();
        Elimbtn = new javax.swing.JButton();
        CerrarSesbtn = new javax.swing.JButton();
        Cancelarbtn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "nombre", "apellido", "nombre de usuario", "Correo electtronico", "telefono", "contraseña"
            }
        ));
        tablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUsuarios);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Crud");

        NamC.setText("Nombre:");

        LasNC.setText("Apellido:");

        UserNamC.setText("Nombre de Usuario:");

        CorreoC.setText("Correo electronico:");

        PhoneC.setText("Telefono:");

        PassC.setText("Contraseña:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        Actualizarbtn.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Actualizarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frampack/Imagen/actualizar.png"))); // NOI18N
        Actualizarbtn.setText("Actualizar");
        Actualizarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarbtnActionPerformed(evt);
            }
        });

        Elimbtn.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Elimbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frampack/Imagen/eliminar.png"))); // NOI18N
        Elimbtn.setText("Eliminar");
        Elimbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElimbtnActionPerformed(evt);
            }
        });

        CerrarSesbtn.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        CerrarSesbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frampack/Imagen/cerrar-sesion.png"))); // NOI18N
        CerrarSesbtn.setText("Cerrar session");
        CerrarSesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesbtnActionPerformed(evt);
            }
        });

        Cancelarbtn.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Cancelarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frampack/Imagen/cancelar.png"))); // NOI18N
        Cancelarbtn.setText("Cancelar");
        Cancelarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarbtnActionPerformed(evt);
            }
        });

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LasNC)
                            .addComponent(NamC))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(UserNamC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Actualizarbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(Elimbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CorreoC)
                    .addComponent(PhoneC)
                    .addComponent(PassC))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Cancelarbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CerrarSesbtn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(143, 143, 143))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(285, 285, 285))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamC)
                    .addComponent(CorreoC)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LasNC)
                    .addComponent(PhoneC)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserNamC)
                    .addComponent(PassC)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Actualizarbtn)
                    .addComponent(Cancelarbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CerrarSesbtn)
                    .addComponent(Elimbtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarbtnActionPerformed

         nuevo();
    }//GEN-LAST:event_CancelarbtnActionPerformed

    private void CerrarSesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesbtnActionPerformed

        IniciaSession event = new IniciaSession();
        
        event.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_CerrarSesbtnActionPerformed

    private void ElimbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElimbtnActionPerformed

        eliminar();
        consultar();

    }//GEN-LAST:event_ElimbtnActionPerformed

    private void ActualizarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarbtnActionPerformed

        modificar(); 
        consultar();
        nuevo();
      
    }//GEN-LAST:event_ActualizarbtnActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void tablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuariosMouseClicked
        
        
       int fila = tablaUsuarios.getSelectedRow();
        if (fila==-1){
            JOptionPane.showMessageDialog(null,"Usuario no seleccionado");

        }else{
            int id = Integer.parseInt((String)tablaUsuarios.getValueAt(fila,0).toString());
            String Usuario = (String)tablaUsuarios.getValueAt(fila,3);
            String Nombre = (String)tablaUsuarios.getValueAt(fila,1);
            String Apellido = (String)tablaUsuarios.getValueAt(fila,2);
            String Correo = (String)tablaUsuarios.getValueAt(fila,5);
            String Numero = (String)tablaUsuarios.getValueAt(fila,4);



            txtNombre.setText(Nombre);
            txtApellido.setText(Apellido);
            txtEmail.setText(Correo);
            txtTelefono.setText(Numero);
            txtUsuario.setText(Usuario);



        }  

    }//GEN-LAST:event_tablaUsuariosMouseClicked

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crud().setVisible(true);
            }
        });
    }
    
    
    void consultar(){
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
        }
 
        //Estableciendo conexión en mi base de datos.
        Conexion objConexion= new Conexion();
        //Try catch para el manejo de posibles errores.
          try {
            //Realizando consulta para traer todos los registros que esten en mi tabla usuario de mi base de datos sistema.
            ResultSet resultado = objConexion.consultarRegistros("SELECT * FROM Usuario");
            //Tomando todos los registros y guardandolo en un object para luego mostarlos en mi tabla del programa...
            while (resultado.next()) {
                Object[] oUsuario={resultado.getString("id"),resultado.getString("nombre"),resultado.getString("apellido"),resultado.getString("NombreDeUsuario"),resultado.getString("numero"),resultado.getString("correo"),resultado.getString("contraseña")};
                modelo.addRow(oUsuario);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    
    }
        

       
    void modificar(){
           
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String email = txtEmail.getText();
        String telefono = txtTelefono.getText();
        String usuario = txtUsuario.getText();
        String pass = password.getText();
        Conexion objConexion= new Conexion();
        //Recuperando los datos.

        int fila = tablaUsuarios.getSelectedRow();
        if (fila==-1){
            JOptionPane.showMessageDialog(null,"Usuario no seleccionado");
        
        }else{
            int id = Integer.parseInt((String)tablaUsuarios.getValueAt(fila,0).toString());

        //Estableciendo mi sentencia DELETE para poder borrar los registros que contenga mi tabla usuario.
        String strSentenciaInsert= String.format("update Usuario set NombreDeUsuario ='"+usuario+"',contraseña='"+pass+"',correo='"+email+"',nombre='"+nombre+"',apellido='"+apellido+"',numero='"+telefono+"' WHERE id = '"+id+"'");
        //Ejecutando sentencia...
        objConexion.ejecutarSentenciaMYSQL(strSentenciaInsert);
        //Actualizando tabla para que cargue nuevamente los registros.
        this.consultar();
        //Limpiando mis txtFields.
        this.nuevo();
        }
    }
    
    void eliminar(){
        
//Estableciendo conexión con mi Base De Datos sistema.
        Conexion objConexion= new Conexion();
        //Recuperando los datos.

        int fila = tablaUsuarios.getSelectedRow();
        if (fila==-1){
            JOptionPane.showMessageDialog(null,"Usuario no seleccionado");

        }else{
            int id = Integer.parseInt((String)tablaUsuarios.getValueAt(fila,0).toString());

        //Estableciendo mi sentencia DELETE para poder borrar los registros que contenga mi tabla usuario.
        String strSentenciaInsert= String.format("DELETE FROM Usuario WHERE id = %d",id);
        //Ejecutando sentencia...
        objConexion.ejecutarSentenciaMYSQL(strSentenciaInsert);
        //Actualizando tabla para que cargue nuevamente los registros.
        this.consultar();
        this.nuevo();
        }
        }
       
   
    void nuevo(){
        txtNombre.setText("");
        txtApellido.setText("");
        txtEmail.setText("");
        txtTelefono.setText("");
        txtUsuario.setText("");
        password.setText("");
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizarbtn;
    private javax.swing.JButton Cancelarbtn;
    private javax.swing.JButton CerrarSesbtn;
    private javax.swing.JLabel CorreoC;
    private javax.swing.JButton Elimbtn;
    private javax.swing.JLabel LasNC;
    private javax.swing.JLabel NamC;
    private javax.swing.JLabel PassC;
    private javax.swing.JLabel PhoneC;
    private javax.swing.JLabel UserNamC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField password;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void SetLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Conexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
