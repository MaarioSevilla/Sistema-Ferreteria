/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaGestion;

/**
 *
 * @author sevilla
 */
import java.sql.*;
import javax.swing.JOptionPane;
import sistemaGestion.JFError;
public class CConexion {
    public Statement sentencia;
    public ResultSet resultado;  
    public static Connection conexion(){
        Connection conecta = null;
            try {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:8889/CasaVieja";
		conecta=DriverManager.getConnection(url, "root", "root");                
                //JOptionPane.showMessageDialog(null, "conexion exitosa");
	    } catch (ClassNotFoundException | SQLException e){
                                JFError error= new JFError();
                                error.mensaje("ERROR : "+e);
                                error.setVisible(true);
				//JOptionPane.showMessageDialog(null,"ERROR "+e);
	    }
	    return conecta;
    }

    public static ResultSet getTabla(String Consulta){
        Connection conecta= conexion();
        Statement st;
        ResultSet datos=null;
        try {
            st= (Statement) conecta.createStatement();
            datos=st.executeQuery(Consulta);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return datos;
    }
}

