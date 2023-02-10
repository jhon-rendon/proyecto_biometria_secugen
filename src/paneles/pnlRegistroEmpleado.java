/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import biometria.JSGD;
import biometria.Secugen;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import negocio.PersonaControl;

/**
 *
 * @author RojeruSan
 */
public class pnlRegistroEmpleado extends javax.swing.JPanel {

    /**
     * Creates new form pnlHome
     */
    private byte[] huella           = null;
    private String rutaFotoOrigen   = null;
    private String rutaFotoDestino  = null;

    public pnlRegistroEmpleado() {
        initComponents();
        
       helper.Helper.obtenerMAC();
          

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        cedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfMiddlename = new javax.swing.JTextField();
        tfLastname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfCargo = new javax.swing.JTextField();
        tfEstado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        JlabelHuella = new javax.swing.JLabel();
        btnRegister1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabelFoto = new javax.swing.JLabel();
        jButtonCargarFoto = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jPanel2.setBackground(new java.awt.Color(174, 201, 222));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("REGISTRO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        btnRegister.setBackground(new java.awt.Color(219, 222, 218));
        btnRegister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegister.setText("Capturar Huella");
        btnRegister.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cedula");

        tfMiddlename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMiddlenameActionPerformed(evt);
            }
        });

        tfLastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLastnameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombres");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Apellidos");

        tfCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCargoActionPerformed(evt);
            }
        });

        tfEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEstadoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cargo");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Estado");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        JlabelHuella.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JlabelHuella, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(JlabelHuella, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnRegister1.setBackground(new java.awt.Color(219, 222, 218));
        btnRegister1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegister1.setText("Registrar");
        btnRegister1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegister1ActionPerformed(evt);
            }
        });

        jLabelFoto.setText("                    Foto");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
        );

        jButtonCargarFoto.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonCargarFoto.setText("Adjuntar Foto");
        jButtonCargarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarFotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfMiddlename, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButtonCargarFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfMiddlename, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(tfLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(tfCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(50, 50, 50)
                                .addComponent(btnRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCargarFoto)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(128, 128, 131));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/collection.png"))); // NOI18N
        jLabel7.setText("REGISTRAR EMPLEADO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(4679, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:

        Secugen lector = new Secugen();

        String msg = lector.openDevice();
        if (lector.deviceActivo) {

            //lector.getDeviceInfo();
            lector.capturaHuella();
            // lector.getImageIcon1();
            this.huella = lector.getRegMin1();

            JlabelHuella.setIcon(lector.getImageIcon1());

            lector.closeDevice();
            lector.deviceActivo = false;
        } else {
            JOptionPane.showMessageDialog(null, msg);
        }

        /*if(fname.isEmpty() || mname.isEmpty() || lname.isEmpty() || address.isEmpty() || username.isEmpty()){
            JOptionPane.showMessageDialog(this, "Fill up the Form Properly.", "Error", JOptionPane.ERROR_MESSAGE);

        }else{

            //start the login process.
            //userRegister(fname,mname,lname,address,username,password);

        }*/
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaActionPerformed

    private void tfMiddlenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMiddlenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMiddlenameActionPerformed

    private void tfLastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLastnameActionPerformed

    private void tfCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCargoActionPerformed

    private void tfEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEstadoActionPerformed

    private void btnRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegister1ActionPerformed
        // TODO add your handling code here:

        String mname = tfMiddlename.getText();
        String apellido = tfLastname.getText();
        String cc = cedula.getText();
        String cargo = tfCargo.getText();
        String estado = tfEstado.getText();

        if (mname.isEmpty() || apellido.isEmpty() || cc.isEmpty() || cargo.isEmpty() || estado.isEmpty() ) {
            JOptionPane.showMessageDialog(this, " Debe diligenciar todos los campos ");
        } else if (this.huella == null) {
            JOptionPane.showMessageDialog(this, " Debe capturar la huella ");
        }
        else if( this.rutaFotoDestino == null){
            JOptionPane.showMessageDialog(this, " Debe Adjuntar La Foto ");
        }
        else {
            PersonaControl personaControl = new PersonaControl();
            //personaControl.insertar2(this.huella, mname);
            String msg = personaControl.insertar(cc, mname, apellido, cargo, estado, this.huella,this.rutaFotoDestino);
            
            copyFile(this.rutaFotoOrigen, this.rutaFotoDestino);
            
            JOptionPane.showMessageDialog(null, msg);

            tfMiddlename.setText("");
            tfLastname.setText("");
            cedula.setText("");
            tfCargo.setText("");
            tfEstado.setText("");
            JlabelHuella.setIcon(null);
            this.rutaFotoOrigen = null;
            this.rutaFotoDestino = null;
            jLabelFoto.setIcon(null);
        }


    }//GEN-LAST:event_btnRegister1ActionPerformed
    public static void copyFile(String origen, String destino) {
        try {
            Path FROM = Paths.get(origen);
            Path TO = Paths.get(destino);
            CopyOption[] options = new CopyOption[]{
                StandardCopyOption.REPLACE_EXISTING,
                StandardCopyOption.COPY_ATTRIBUTES
            };

            Files.copy(FROM, TO, options);
            //JOptionPane.showMessageDialog(null, "Imagen Guardada");
            System.out.println("Imagen Guardada");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al Guardar Imagen");
            System.err.println(e.toString());
        }
    }


    private void jButtonCargarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarFotoActionPerformed
        // TODO add your handling code here:

        //Adjuntar Foto
        String Ruta = "";
        String destino = "\\172.16.30.8/Repositorio/java_prueba/";
        destino = destino.replace("\\", "\\\\");

        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("JGP & PNG", "jpg", "png");
        jFileChooser.setFileFilter(filtrado);

        int respuesta = jFileChooser.showOpenDialog(this);

        if (respuesta == JFileChooser.APPROVE_OPTION) {

            Ruta = jFileChooser.getSelectedFile().getPath();
            File fichero = jFileChooser.getSelectedFile();

            if ((fichero == null) || (fichero.getName().equals(""))) {

                System.out.println("No se ha seleccionado ninguna foto");
            } else {

                String nombreArchivo = fichero.getName();
                String extension = nombreArchivo.substring(nombreArchivo.lastIndexOf(".") + 1);
                
                extension  = extension.replace(" ","");
                
                 System.out.println( "Extension de imagen "+extension.toLowerCase() );
                 
                if ( extension.toLowerCase().equals("png") || extension.toLowerCase().equals("jpg")) {

                    System.out.println("nombreArchivo " + extension);

                    String archivo = destino + "" + this.cedula.getText() + "-" + nombreArchivo;
                    
                    this.rutaFotoOrigen  = Ruta;
                    this.rutaFotoDestino = archivo;

                    File folder = new File(destino);
                    if (!folder.exists()) {
                        // folder.mkdirs();
                    }
                    System.out.println("" + destino);
                    //copyFile(Ruta, archivo);

                    Image mImagen = new ImageIcon(Ruta).getImage();
                    ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(jLabelFoto.getWidth(), jLabelFoto.getHeight(), Image.SCALE_SMOOTH));
                    jLabelFoto.setText("");
                    jLabelFoto.setIcon(mIcono);

                }else{
                    JOptionPane.showMessageDialog(null, "No ha seleccionado una foto valida");
                }

            }

        }

        /*
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.PNG", "png");
        fc.setFileFilter(filtro);
        int seleccion = fc.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = fc.getSelectedFile();
            String ruta = fichero.getAbsolutePath();
            String nombreArchivo = fichero.getName();
            String archivo = destino + "" + nombreArchivo;

            File folder = new File(destino);
            if (!folder.exists()) {
                folder.mkdirs();
            }

            copyFile_Java7(ruta, archivo);

        }
         */

    }//GEN-LAST:event_jButtonCargarFotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlabelHuella;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnRegister1;
    private javax.swing.JTextField cedula;
    private javax.swing.JButton jButtonCargarFoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField tfCargo;
    private javax.swing.JTextField tfEstado;
    private javax.swing.JTextField tfLastname;
    private javax.swing.JTextField tfMiddlename;
    // End of variables declaration//GEN-END:variables
}
