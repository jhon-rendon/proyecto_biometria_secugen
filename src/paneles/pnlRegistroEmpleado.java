/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import biometria.Secugen;
import entidades.Area;
import entidades.Persona;
import entidades.Cargo;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import negocio.AreaControl;
import negocio.CargoControl;
import negocio.PersonaControl;

/**
 *
 * @author RojeruSan
 */
public class pnlRegistroEmpleado extends javax.swing.JPanel {

    /**
     * Creates new form pnlHome
     */
    private byte[] huella = null;
    private String rutaFotoOrigen = null;
    private String rutaFotoDestino = null;
    private Secugen lector;

    public pnlRegistroEmpleado() {

        initComponents();

        lector = new Secugen();

        //Listar las  Areas
        AreaControl area = new AreaControl();
        List<Area> listadoAreas = new ArrayList<Area>();
        listadoAreas = area.ListarAreas();

        jComboBoxArea.addItem(new Area(0, "Seleccione el area"));
        for (Area item : listadoAreas) {
            jComboBoxArea.addItem(item);  //Almacenar en el JbcomBoArea los datos obtenidos de la base de datos con el listado de las Areas de la empresa
        }
        
        jLabelMsgLector.setVisible(false);

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
        btnCapturarHuella = new javax.swing.JButton();
        txtCedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfMiddlename = new javax.swing.JTextField();
        tfLastname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        JlabelHuella = new javax.swing.JLabel();
        btnRegistrarEmpleado = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabelFoto = new javax.swing.JLabel();
        jButtonCargarFoto = new javax.swing.JButton();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxArea = new javax.swing.JComboBox<>();
        jComboCargo = new javax.swing.JComboBox<>();
        jLabelMsgLector = new javax.swing.JLabel();
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

        btnCapturarHuella.setBackground(new java.awt.Color(219, 222, 218));
        btnCapturarHuella.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCapturarHuella.setText("Capturar Huella");
        btnCapturarHuella.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnCapturarHuella.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCapturarHuellaMousePressed(evt);
            }
        });
        btnCapturarHuella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapturarHuellaActionPerformed(evt);
            }
        });

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
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

        btnRegistrarEmpleado.setBackground(new java.awt.Color(219, 222, 218));
        btnRegistrarEmpleado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrarEmpleado.setText("Registrar");
        btnRegistrarEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnRegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEmpleadoActionPerformed(evt);
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

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        jComboBoxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Area");

        jComboBoxArea.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxAreaItemStateChanged(evt);
            }
        });

        jComboCargo.setEnabled(false);

        jLabelMsgLector.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelMsgLector.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMsgLector.setText("Coloque la Huella ..");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapturarHuella, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMsgLector))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfMiddlename, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel9))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxArea, 0, 250, Short.MAX_VALUE)
                                        .addComponent(jComboCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jLabel10)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnRegistrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCargarFoto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfMiddlename, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(tfLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jComboBoxArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnCapturarHuella, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jComboCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMsgLector))))
                .addContainerGap(36, Short.MAX_VALUE))
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
                .addContainerGap(162, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCapturarHuellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturarHuellaActionPerformed
        // TODO add your handling code here:

        //lector = new Secugen();
        this.btnCapturarHuella.setEnabled(false);

        lector.openDevice(); //Open dispositivo secugen
        if (lector.deviceActivo) {

            //Capturar huella
            if (lector.capturaHuella()) {
                this.huella = lector.getRegMin1(); //Guardar la huella capturada 
                JlabelHuella.setIcon(lector.getImageIcon1()); // Mostrar la huella capturada, representada como imagen en ub Jlabel   
            } else {
                helper.Helper.alerta(lector.getMsgError());
            }
            lector.closeDevice(); // Cerrar Dispositivo Secugen
            lector.deviceActivo = false; //Cambiar de estado la propiedad deviceActivo
        } else {
            lector.closeDevice(); // Cerrar Dispositivo Secugen
            lector.deviceActivo = false; //Cambiar de estado la propiedad deviceActivo
            helper.Helper.alerta(lector.getMsgError());
        }

        this.btnCapturarHuella.setEnabled(true);
        this.jLabelMsgLector.setVisible(false);

    }//GEN-LAST:event_btnCapturarHuellaActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void tfMiddlenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMiddlenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMiddlenameActionPerformed

    private void tfLastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLastnameActionPerformed

    private void btnRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEmpleadoActionPerformed
        // TODO add your handling code here:

        String mname = tfMiddlename.getText();
        String apellido = tfLastname.getText();
        String cc = txtCedula.getText();
        String estado = jComboBoxEstado.getSelectedItem().toString();
        Area areaSeleccionada = (Area) jComboBoxArea.getSelectedItem();
        Cargo cargoSeleccionado = (Cargo) jComboCargo.getSelectedItem();

        if (mname.isEmpty() || apellido.isEmpty() || cc.isEmpty() || estado.isEmpty() || this.jComboBoxArea.getSelectedIndex() == 0) {
            helper.Helper.alerta("Debe diligenciar todos los campos");
        } else if (!helper.Helper.isNumeric(cc)) {
            helper.Helper.alerta("La cedula de debe ser Numerica");
        } else if (this.huella == null) {
            helper.Helper.alerta("Debe capturar la huella ");
        } else if (this.rutaFotoDestino == null) {
            helper.Helper.alerta(" Debe Adjuntar La Foto");

        } else {

            PersonaControl personaControl = new PersonaControl();

            //Validar que no exista la cedula en la base de datos
            Persona dataPersona = personaControl.buscarByCedula(Integer.parseInt(cc));

            if (dataPersona == null) {
            } else {
                helper.Helper.alerta(" Ya existe un Empleado con la Cedula  " + cc + ", Asociada a " + dataPersona.getNombre() + " " + dataPersona.getApellido());
                return;
            }

            //Validar que la huella capturada no exista en la base de datos
            List<Persona> listado = new ArrayList<>();
            listado = personaControl.ListarPersonas();

            byte[] validHuella;
            for (Persona item : listado) {
                validHuella = (byte[]) item.getHuella();
                //Validar que la huella capturada no exista en la base de datos
                if (lector.verificarHuella(validHuella, this.huella)) {
                    helper.Helper.alerta("La Huella que intenta registrar ya existe en la base de datos y se encuentra asociada a " + item.getCedula() + " " + item.getNombre() + " " + item.getApellido());
                    return;
                }
            }
            
          
            String rutaFoto = this.rutaFotoDestino.replace("\\", "");
            boolean insert = personaControl.insertar(Integer.parseInt(cc), mname, apellido, cargoSeleccionado.getIdcargo(), estado, this.huella, rutaFoto, areaSeleccionada.getId());
    
            if (insert) {

                helper.Helper.copyFile(this.rutaFotoOrigen, this.rutaFotoDestino); //Copiar foto
                helper.Helper.alerta(" Registro creado Satisfactoriamente ");

                //Limpiar los campos
                tfMiddlename.setText("");
                tfLastname.setText("");
                txtCedula.setText("");
                JlabelHuella.setIcon(null);
                this.rutaFotoOrigen = null;
                this.rutaFotoDestino = null;
                jLabelFoto.setIcon(null);
            } else {
                helper.Helper.alerta("Error al crear el registro del empleado, intenta nuevamente");
            }

        }


    }//GEN-LAST:event_btnRegistrarEmpleadoActionPerformed


    private void jButtonCargarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarFotoActionPerformed
        // TODO add your handling code here:

        //Adjuntar Foto
        String Ruta = "";
        String destino = "\\10.190.15.1/Repositorio/Biometria/";
        //String destino = "C:\\appjava/tmp/";
        destino = destino.replace("\\", "\\\\");

        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("JGP JPEG & PNG", "jpg", "png", "jpeg");
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

                extension = extension.replace(" ", "");

                //System.out.println("Extension de imagen " + extension.toLowerCase());
                if (extension.toLowerCase().equals("png") || extension.toLowerCase().equals("jpg") || extension.toLowerCase().equals("jpeg") ) {

                    //System.out.println("nombreArchivo " + extension);
                    String archivo = destino + "" + this.txtCedula.getText() + "-" + helper.Helper.obtenerFechaCompleta() + "." + extension.toLowerCase();

                    this.rutaFotoOrigen = Ruta;
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

                } else {
                    JOptionPane.showMessageDialog(null, "No ha seleccionado una foto valida");
                }

            }

        }


    }//GEN-LAST:event_jButtonCargarFotoActionPerformed

    private void jComboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEstadoActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        // TODO add your handling code here:
        if (txtCedula.getText().length() >= 10) {
            evt.consume();
        }

    }//GEN-LAST:event_txtCedulaKeyTyped

    private void jComboBoxAreaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxAreaItemStateChanged
        // TODO add your handling code here:

        //Validar que se cambie de opcion en la lista de areas
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            //Validar que la opcion seleccionada sea valida
            if (this.jComboBoxArea.getSelectedIndex() > 0) {

                Area areaSeleccionada = (Area) jComboBoxArea.getSelectedItem();

                jComboCargo.setEnabled(false);
                jComboCargo.removeAllItems();
                //Listar Los cargos
                CargoControl cargo = new CargoControl();
                List<Cargo> listadoCargo = new ArrayList<Cargo>();
                listadoCargo = cargo.ListarCargosByIdArea(areaSeleccionada.getId());

                for (Cargo item : listadoCargo) {
                    jComboCargo.addItem(item);  //Almacenar en el jComboCargo los datos obtenidos de la base de datos con el listado de los Cargos de la empresa
                }
                jComboCargo.setEnabled(true);
            } else {
                jComboCargo.removeAllItems();
                jComboCargo.setEnabled(false);
            }

        }

    }//GEN-LAST:event_jComboBoxAreaItemStateChanged

    private void btnCapturarHuellaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCapturarHuellaMousePressed
        // TODO add your handling code here:
        
         this.jLabelMsgLector.setVisible(true);
    }//GEN-LAST:event_btnCapturarHuellaMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlabelHuella;
    private javax.swing.JButton btnCapturarHuella;
    private javax.swing.JButton btnRegistrarEmpleado;
    private javax.swing.JButton jButtonCargarFoto;
    private javax.swing.JComboBox<Area> jComboBoxArea;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JComboBox<Cargo> jComboCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelMsgLector;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField tfLastname;
    private javax.swing.JTextField tfMiddlename;
    private javax.swing.JTextField txtCedula;
    // End of variables declaration//GEN-END:variables
}
