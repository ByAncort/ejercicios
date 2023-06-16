package formulario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conectar {
     Connection Bd=null;
public Connection conexion(){   
 try{
        Class.forName("com.mysql.jdbc.Driver");
        Bd = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/conexion", "root", "");
            System.out.println("Conexion aceptada");
        }
        catch (Exception e){
            System.out.println("Conexion invalida" + e);
            JOptionPane.showMessageDialog(null, "no se pudo conectar");
        }
        return Bd;
    }

    PreparedStatement createStatement(String insert_into_alumnoid_nombre_curso_values_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
