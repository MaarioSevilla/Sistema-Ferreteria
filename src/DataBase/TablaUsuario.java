package DataBase;


import Clases.Usuarios;
import sistemaGestion.CConexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TablaUsuario {
    public static Connection on;
    public static void mostrarTabla(JTable tabla){
        DefaultTableModel modelo= new DefaultTableModel();
        ResultSet rs =CConexion.getTabla("SELECT*FROM usuarios");
        modelo.setColumnIdentifiers(new Object[]{"id_usuario","usuario","password","tipoUser","estado","nombre",
                                    "apellidos","sexo","fechaNacimiento","Correo","nTelefono","idioma"});
        try {
            while(rs.next()){//mientras haya algo despues
                modelo.addRow(new  Object[]{
                   rs.getString("id_usuario"),
                   rs.getString("usuario"),
                   rs.getString("password"),
                   rs.getString("tipoUser"),
                   rs.getString("estado"),
                   rs.getString("nombre"),
                   rs.getString("apellidos"),
                   rs.getString("sexo"),
                   rs.getString("fechaNacimiento"),
                   rs.getString("Correo"),
                   rs.getString("nTelefono"),
                   rs.getString("idioma")
                });
            }
            //Asigna el modelo a la tabla
            tabla.setModel(modelo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void insertarUsuario(Usuarios u) throws SQLException{
        on =CConexion.conexion();
        Statement st= on.createStatement();/*Ejecutar un actualizacion*/
        st.executeUpdate("INSERT INTO usuarios"
                        +"(usuario,password,tipoUser,estado,nombre,apellidos,sexo,fechaNacimiento,Correo,nTelefono,idioma)"
                        +"VALUES('"+u.getUsuario()+"','"+u.getPassword()+"','"+u.getTipoUser()+"','"+u.getEstado()+"','"
                        +u.getNombre()+"','"+u.getApellidos()+"','"+u.getSexo()+"','"+u.getFechaNac()+"','"+u.getCorreo()
                        +"','"+u.getnTelefono()+"','"+u.getIdioma()+"')");
        JOptionPane.showMessageDialog(null,"Nuevo registro");
        u.setUsuario(null);
        u.setPassword(null);
        u.setTipoUser(null);
        u.setEstado(null);
        u.setNombre(null);
        u.setApellidos(null);
        u.setSexo(null);
        u.setFechaNac(null);
        u.setCorreo(null);
        u.setnTelefono(null);
        u.setIdioma(null);
        on.close();
    }
}
