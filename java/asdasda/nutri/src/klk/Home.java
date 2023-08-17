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
import javax.swing.JTable;

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
        this.setLocationRelativeTo(null);
        jComboBox1.addItem("hombre");
        jComboBox1.addItem("mujer");
        this.user = user;
        this.pass = pass;
       try {
            Connection con = new Conectar().conexion();
            String sql = "SELECT * FROM user WHERE user = ? AND pass = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // Obtener los datos del usuario desde el ResultSet
                double pesoUsuario = rs.getDouble("peso");
                double alturaUsuario = rs.getDouble("altura");
                String actividadUsuario = rs.getString("actividad");
                String objetivoUsuario = rs.getString("objetivo");

                // Calcular el IMC
                double imc = pesoUsuario / (alturaUsuario * alturaUsuario) * 10000;

                // Calcular las calorías según las necesidades
                double calorias = calcularCalorias(actividadUsuario, objetivoUsuario, pesoUsuario);

                // Mostrar el IMC y las calorías en los JLabels
                jLabel9.setText("Su IMC es: " + imc);
                jLabel10.setText("Calorías necesarias: " + calorias);
            } else {
                jLabel9.setText("Usuario no encontrado");
                jLabel10.setText("");
            }

            rs.close();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
   
        
    }
    
private double calcularCalorias(String actividad, String objetivo, double peso) {
    double caloriasBase = 0.0;

    if (actividad.equalsIgnoreCase("sedentario")) {
        caloriasBase = peso * 22;
    } else if (actividad.equalsIgnoreCase("activo")) {
        caloriasBase = peso * 25;
    } else if (actividad.equalsIgnoreCase("muy activo")) {
        caloriasBase = peso * 30;
    }

    if (objetivo.equalsIgnoreCase("volumen")) {
        caloriasBase += 400;
    } else if (objetivo.equalsIgnoreCase("definicion")) {
        caloriasBase -= 400;
    }

    return caloriasBase;
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
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtalimentos = new javax.swing.JTable();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

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
        setType(java.awt.Window.Type.POPUP);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setText("enviar");
        jButton2.setActionCommand("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox1.setMaximumRowCount(2);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "hombre", "mujer" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Sexo:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Altura(cm)");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Peso(kg)");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel6.setText("Si previamente has completado el formulario no necesitas hacerlo de nuevo a menos que quieras actualizar los datos");

        jtalimentos.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jtalimentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nombre", "calorias", "proteina", "carbohidatos", "grasas", "tipo", "clasificacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtalimentos);

        jComboBox4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sedentario", "activo", "muy activo" }));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Nivel de actividad");

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setText("Volumen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 204, 255));
        jButton3.setText("Definicion");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 204, 255));
        jButton4.setText("Matenimieto");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(237, 237, 237)
                        .addComponent(jLabel1))))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(76, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
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
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8)
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(84, 84, 84))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(48, 48, 48))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel4))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
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
          try {
               DefaultTableModel modelo = (DefaultTableModel) jtalimentos.getModel();
        modelo.setRowCount(0); // Limpia los datos existentes en la tabla
        Connection con = new Conectar().conexion(); // Asumiendo que esta línea es correcta

        String sql = "SELECT nombre, calorias, proteina, carbohidratos, grasas, tipo, clasificacion FROM alimentos where tipo = 'volumen' ";
        PreparedStatement ps = con.prepareStatement(sql); 
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Object[] fila = new Object[7]; // Hay 7 columnas en tu base de datos

            fila[0] = rs.getString("nombre");
            fila[1] = rs.getDouble("calorias");
            fila[2] = rs.getDouble("proteina");
            fila[3] = rs.getDouble("carbohidratos");
            fila[4] = rs.getDouble("grasas");
            fila[5] = rs.getString("tipo");
            fila[6] = rs.getString("clasificacion");

            modelo.addRow(fila);
        }

        // Cerrar recursos
        rs.close();
        ps.close();
        con.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
            try {
               DefaultTableModel modelo = (DefaultTableModel) jtalimentos.getModel();
        modelo.setRowCount(0); // Limpia los datos existentes en la tabla
        Connection con = new Conectar().conexion(); // Asumiendo que esta línea es correcta

        String sql = "SELECT nombre, calorias, proteina, carbohidratos, grasas, tipo, clasificacion FROM alimentos where tipo = 'definicion' ";
        PreparedStatement ps = con.prepareStatement(sql); 
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Object[] fila = new Object[7]; // Hay 7 columnas en tu base de datos

            fila[0] = rs.getString("nombre");
            fila[1] = rs.getDouble("calorias");
            fila[2] = rs.getDouble("proteina");
            fila[3] = rs.getDouble("carbohidratos");
            fila[4] = rs.getDouble("grasas");
            fila[5] = rs.getString("tipo");
            fila[6] = rs.getString("clasificacion");

            modelo.addRow(fila);
        }

        // Cerrar recursos
        rs.close();
        ps.close();
        con.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
           try {
               DefaultTableModel modelo = (DefaultTableModel) jtalimentos.getModel();
        modelo.setRowCount(0); // Limpia los datos existentes en la tabla
        Connection con = new Conectar().conexion(); // Asumiendo que esta línea es correcta

        String sql = "SELECT nombre, calorias, proteina, carbohidratos, grasas, tipo, clasificacion FROM alimentos where tipo = 'mantenimiento' ";
        PreparedStatement ps = con.prepareStatement(sql); 
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Object[] fila = new Object[7]; // Hay 7 columnas en tu base de datos

            fila[0] = rs.getString("nombre");
            fila[1] = rs.getDouble("calorias");
            fila[2] = rs.getDouble("proteina");
            fila[3] = rs.getDouble("carbohidratos");
            fila[4] = rs.getDouble("grasas");
            fila[5] = rs.getString("tipo");
            fila[6] = rs.getString("clasificacion");

            modelo.addRow(fila);
        }

        // Cerrar recursos
        rs.close();
        ps.close();
        con.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    }//GEN-LAST:event_jButton4ActionPerformed

    
 public class MostrarDatos {

    public void cargarDatosEnTabla(JTable tabla) {
        try {
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            Connection con = new Conectar().conexion(); // Asumiendo que esta línea es correcta

            String sql = "SELECT nombre, calorias, proteina, carbohidratos, grasas, tipo, clasificacion FROM alimentos where tipo = 'volumen' ";
            PreparedStatement ps = con.prepareStatement(sql); 
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Object[] fila = new Object[7]; // Hay 7 columnas en tu base de datos

                fila[0] = rs.getString("nombre");
                fila[1] = rs.getDouble("calorias");
                fila[2] = rs.getDouble("proteina");
                fila[3] = rs.getDouble("carbohidratos");
                fila[4] = rs.getDouble("grasas");
                fila[5] = rs.getString("tipo");
                fila[6] = rs.getString("clasificacion");

                modelo.addRow(fila);
            }

            // Cerrar recursos (ResultSet, PreparedStatement y Connection) en un bloque finally
            rs.close();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

    
    
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
                PreparedStatement pst = cn.prepareStatement("UPDATE user SET sexo = ?, altura = ?, peso = ?, imc = ?, actividad =? WHERE user = ? and pass = ?");

                // Establecer los valores para los marcadores de posición
                pst.setString(1, sexo);
                pst.setDouble(2, alturaEnMetros);
                pst.setDouble(3, pesoEnKg);
                pst.setDouble(4, imc);
                pst.setString(5, actividad);
                pst.setString(6, userInput);
                pst.setString(7, passInput);

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
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable jtalimentos;
    // End of variables declaration//GEN-END:variables

    private static class datos {

        public datos() {
        }
    }
}
