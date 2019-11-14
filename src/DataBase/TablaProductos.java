package DataBase;

import Clases.Productos;
import Clases.Usuarios;
import sistemaGestion.CConexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felip
 */
public class TablaProductos {
    public static Connection on;
    public static void mostrarTabla(JTable tabla){
        DefaultTableModel modelo= new DefaultTableModel();
        ResultSet rs =CConexion.getTabla("SELECT*FROM productos");
        modelo.setColumnIdentifiers(new Object[]{"id_producto","producto","descripcion","costo","cantidad"});
        try {
            while(rs.next()){//mientras haya algo despues
                modelo.addRow(new  Object[]{
                   rs.getString("id_producto"),
                   rs.getString("producto"),
                   rs.getString("descripcion"),
                   rs.getString("costo"),
                   rs.getString("cantidad")
                });
            }
            //Asigna el modelo a la tabla
            tabla.setModel(modelo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void insertarProductos(Productos p) throws SQLException{
        on =CConexion.conexion();
        Statement st= on.createStatement();/*Ejecutar un actualizacion*/
        st.executeUpdate("INSERT INTO productos"
                        +"(producto,descripcion,costo,cantidad)"
                        +"VALUES('"+p.getProducto()+"','"+p.getDescripcion()+"','"+p.getCosto()+"','"+p.getCantidad()+"')");
        JOptionPane.showMessageDialog(null,"Nuevo registro");
        p.setProducto(null);
        p.setDescripcion(null);
        p.setCosto(0);
        p.setCantidad(0);
        on.close();
    }
}
