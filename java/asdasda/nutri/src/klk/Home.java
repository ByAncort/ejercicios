/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 3__d
 */
public class Home extends javax.swing.JFrame {

    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    
    private String user;
    private String pass;

    //metodo constructor
    public Home(String user, String pass) {
        initComponents();
        jComboBox1.addItem("hombre");
        jComboBox1.addItem("mujer");
        this.user = user;
        this.pass = pass;
    }

    Home() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton2.setText("enviar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "hombre", "mujer" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Sexo:");

        jLabel2.setText("Altura(cm)");

        jLabel4.setText("Peso(kg)");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "volumen ", "definicion", "mantenimiento" }));

        jLabel5.setText("Objetivo");

        jLabel6.setText("Si previamente has completado el formulario no necesitas hacerlo de nuevo a menos que quieras actualizar los datos");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "title 5", "Title 6"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 comida", "2 comida", "3 comida", "4 comida", "5 comida", "6 comida" }));

        jLabel7.setText("Cantidad de comidas");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sedentario", "activo", "muy activo" }));

        jLabel8.setText("Nivel de actividad");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel4)))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(6, 6, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8)
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(334, 334, 334)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(354, 354, 354))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(48, 48, 48))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel5))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel8))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String userInput = user;
        String passInput = pass;
       
        CalcularCalorias calculadoraCalorias = new CalcularCalorias();
           calculadoraCalorias.actualizarUsuario(userInput, passInput);
         // Crear una instancia de la clase CalcularCalorias
        CalcularCalorias calculadora = new CalcularCalorias();

        // Llamar al método obtenerDatosDeBaseDeDatos() para obtener los datos de la base de datos
        calculadora.obtenerDatosDeBaseDeDatos();
        // Llamar al método calcularCalorias() para realizar el cálculo
        double caloriasCalculadas = calculadora.calcularCalorias();
// Hacer algo con el resultado de las calorías calculadas
        System.out.println("Calorías calculadas: " + caloriasCalculadas + " kcal");
         
         


       
       
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      // TODO add your handling code here:
    String objetivo = null;
   

    Connection conexion = null;
    PreparedStatement statement = null;
    ResultSet resultado = null;

    try {
        // Paso 2: Establecer la conexión con la base de datos
        String url = "jdbc:mysql://localhost:3306/nutricionista";
        conexion = DriverManager.getConnection(url, "root", "");

        // Paso 3: Crear una sentencia SQL y ejecutarla utilizando una sentencia preparada
        String consulta = "SELECT objetivo FROM user WHERE user=? AND pass=?";
        statement = conexion.prepareStatement(consulta);
        statement.setString(1, user);
        statement.setString(2, pass);
        resultado = statement.executeQuery();

        // Paso 4: Procesar el resultado (solo si hay un resultado)
        if (resultado.next()) {
            objetivo = resultado.getString("objetivo");
        } else {
            // Aquí puedes manejar el caso donde no se encuentra el usuario
            // Por ejemplo, mostrar un mensaje de error
            System.out.println("Usuario no encontrado.");
            return;
        }

    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        // Paso 5: Cerrar la conexión y los recursos (se debe hacer después de usarlos)
        try {
            if (resultado != null) {
                resultado.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Aquí tienes el valor de la variable "objetivo" obtenido de la base de datos
    System.out.println("Objetivo: " + objetivo);

    // Obtener el modelo de la tabla donde mostrar los resultados
    DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
    modelo.setRowCount(0); // Limpiar la tabla antes de llenarla con nuevos datos

    String sql = "SELECT * FROM alimentos where objetivo='" + objetivo + "'";
    try {
        // Crear una instancia de conexión
        Conectar cc = new Conectar();
        // Establecer una conexión con la base de datos
        Connection cn = cc.conexion();

        // Crear un arreglo para almacenar los datos de cada alimento
        Object[] alimentos = new Object[6]; // Cambiar el tamaño del arreglo según el número de columnas en la tabla

        // Crear una sentencia SQL y ejecutarla
        Statement statement2 = cn.createStatement();
        ResultSet resultado2 = statement2.executeQuery(sql);

        // Procesar los resultados y llenar la tabla con los datos
        while (resultado2.next()) {
            // Obtener los datos de cada columna y almacenarlos en el arreglo "alimentos"
            alimentos[0] = resultado2.getInt("id");
            alimentos[1] = resultado2.getString("nombre");
            alimentos[2] = resultado2.getDouble("calorias");
            alimentos[3] = resultado2.getDouble("proteina");
            alimentos[4] = resultado2.getDouble("carbohidratos");
            alimentos[5] = resultado2.getDouble("grasas");

            // Agregar una nueva fila en la tabla con los datos del alimento actual
            modelo.addRow(alimentos);
        }

        // Cerrar los recursos (resultado, statement y conexión)
        resultado2.close();
        statement2.close();
        cn.close();

    } catch (SQLException e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    
    
    public class CalcularCalorias {
        // Declarar las variables de clase para almacenar los datos obtenidos de la base de datos

        private double peso;
        private double altura;
        private String actividad;
       public String objetivo;

        public void obtenerDatosDeBaseDeDatos() {
            Connection conexion = null;
            Statement statement = null;
            ResultSet resultado = null;

            try {
                // Paso 2: Establecer la conexión con la base de datos
                String url = "jdbc:mysql://localhost:3306/nutricionista";
                conexion = DriverManager.getConnection(url, "root", "");

                // Paso 3: Crear una sentencia SQL y ejecutarla
                String consulta = "SELECT peso, altura, actividad, objetivo FROM user WHERE user='" + user + "' AND pass='" + pass + "'";
                statement = conexion.createStatement();
                resultado = statement.executeQuery(consulta);

                // Paso 4: Procesar los resultados
                while (resultado.next()) {
                    peso = resultado.getDouble("peso");
                    altura = resultado.getDouble("altura");
                    actividad = resultado.getString("actividad");
                    objetivo = resultado.getString("objetivo");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                // Paso 5: Cerrar la conexión y los recursos (se debe hacer después de usarlos)
                try {
                    if (resultado != null) {
                        resultado.close();
                    }
                    if (statement != null) {
                        statement.close();
                    }
                    if (conexion != null) {
                        conexion.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        public double calcularCalorias() {
            obtenerDatosDeBaseDeDatos();
            String alturaStr = jTextField3.getText();
            String pesoStr = jTextField4.getText();
            double alturaEnMetros = Double.parseDouble(alturaStr);
            double pesoEnKg = Double.parseDouble(pesoStr);
            double calCalorias = pesoEnKg * 22;

            if (actividad.equals("sedentario")) {
                double calActividad = calCalorias * 1.375;
                // Aquí puedes hacer lo que necesites con calActividad
                if (objetivo.trim().equalsIgnoreCase("definicion")) {
                    double calObjetivo = calActividad - 400;
                    System.out.println("Calorías con actividad sedentaria: " + calObjetivo + "kcal");
                }
                if (objetivo.trim().equalsIgnoreCase("volumen")) {
                    double calObjetivo = calActividad + 400;
                    System.out.println("Calorías con actividad sedentaria: " + calObjetivo + "kcal");
                }
                if (objetivo.trim().equalsIgnoreCase("mantenimiento")) {
                    System.out.println("Calorías con actividad sedentaria: " + calActividad + "kcal");
                }
            }

            if (actividad.equals("activo")) {
                double calActividad = calCalorias * 1.55;
                // Aquí puedes hacer lo que necesites con calActividad
                if (objetivo.trim().equalsIgnoreCase("definicion")) {
                    double calObjetivo = calActividad - 400;
                    System.out.println("Calorías con actividad sedentaria: " + calObjetivo + "kcal");
                }
                if (objetivo.trim().equalsIgnoreCase("volumen")) {
                    double calObjetivo = calActividad + 400;
                    System.out.println("Calorías con actividad sedentaria: " + calObjetivo + "kcal");
                }
                if (objetivo.trim().equalsIgnoreCase("mantenimiento")) {
                    System.out.println("Calorías con actividad sedentaria: " + calActividad + "kcal");
                }
            }
double calObjetivo=0;
            if (actividad.trim().equalsIgnoreCase("muy activo")) {
                double calActividad = calCalorias * 1.75;
                    
           
                
                // Aquí puedes hacer lo que necesites con calActividad
                if (objetivo.trim().equalsIgnoreCase("definicion")) {
                     calObjetivo = calActividad - 400;
                    System.out.println("Calorías con actividad sedentaria: " + calObjetivo + "kcal");
                }
                if (objetivo.trim().equalsIgnoreCase("voluMen")) {
                    
                     calObjetivo = calActividad + 400;
                    System.out.println("Calorías con actividad sedentaria: " + calObjetivo + "kcal");
                }
                if (objetivo.trim().equalsIgnoreCase("mantenimiento")) {
                    System.out.println("Calorías con actividad sedentaria: " + calActividad + "kcal");
                }
            }

            return calObjetivo;
        }
    

    
    
    
     
    
    
    public void actualizarUsuario(String userInput, String passInput) {
        // Crear una instancia de conexión
        Conectar cc = new Conectar();
        // Establecer una conexión con la base de datos
        Connection cn = cc.conexion();
        String objetivo = jComboBox2.getSelectedItem().toString();
        String Ccomidas = jComboBox3.getSelectedItem().toString();
        String actividad = jComboBox4.getSelectedItem().toString();
        String sexo = jComboBox1.getSelectedItem().toString();
        String alturaStr = jTextField3.getText();
        String pesoStr = jTextField4.getText();

// Verificar si los campos no están vacíos
        if (alturaStr != null && !"".equals(alturaStr)
                && pesoStr != null && !"".equals(pesoStr)
                && userInput != null && !"".equals(userInput)
                && passInput != null && !"".equals(passInput)) {

            try {
                // Convertir las cadenas de texto a double
                double alturaEnMetros = Double.parseDouble(alturaStr);
                double pesoEnKg = Double.parseDouble(pesoStr);

                // Calcular el IMC
                double imc = pesoEnKg / (alturaEnMetros * alturaEnMetros) * 10000;

                // Preparar la declaración SQL con marcadores de posición para los valores
                PreparedStatement pst = cn.prepareStatement("UPDATE user SET sexo = ?, altura = ?, peso = ?, imc = ?, objetivo =?, Ccomidas =?, actividad =? WHERE user = ? and pass = ?");

                // Establecer los valores para los marcadores de posición
                pst.setString(1, sexo);
                pst.setDouble(2, alturaEnMetros);
                pst.setDouble(3, pesoEnKg);
                pst.setDouble(4, imc);
                pst.setString(5, objetivo);
                pst.setString(6, Ccomidas);
                pst.setString(7, actividad);
                pst.setString(8, userInput);
                pst.setString(9, passInput);

                // Ejecutar la declaración SQL y obtener el número de filas afectadas
                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    // La actualización se realizó correctamente
                    JOptionPane.showMessageDialog(null, "Actualización exitosa.\nTu Índice de Masa Corporal (IMC) es: " + imc);
                } else {
                    // No se encontró el registro o no se realizó la actualización
                    JOptionPane.showMessageDialog(null, "Error al actualizar el registro");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error en los datos de altura o peso. Asegúrate de ingresar valores numéricos válidos.");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Ocurrió un error al actualizar registro.");
                System.out.println(e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe rellenar los datos solicitados.");
        }

    }
    }
  
    
    
    
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new HOME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

    private static class datos {

        public datos() {
        }
    }
}
