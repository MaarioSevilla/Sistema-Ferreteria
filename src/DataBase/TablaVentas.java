package DataBase;

import Clases.Productos;
import Clases.Ventas;
import static DataBase.TablaProductos.on;
import sistemaGestion.CConexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TablaVentas {
    public static void mostrarTabla(JTable tabla){
        DefaultTableModel modelo= new DefaultTableModel();
        ResultSet rs =CConexion.getTabla("SELECT*FROM ventas");
        modelo.setColumnIdentifiers(new Object[]{"id_venta","id_producto","descripcion","nombre_cliente","fecha","id_usuario"});
        try {
            while(rs.next()){//mientras haya algo despues
                modelo.addRow(new  Object[]{
                rs.getString("id_venta"),
                rs.getString("id_producto"),
                rs.getString("descripcion"),
                rs.getString("nombre_cliente"),
                rs.getString("fecha"),
                rs.getString("id_usuario")
                });
            }
            //Asigna el modelo a la tabla
            tabla.setModel(modelo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void insertarVentas(Ventas p) throws SQLException{
        on =CConexion.conexion();
        Statement st= on.createStatement();/*Ejecutar un actualizacion*/
        st.executeUpdate("INSERT INTO ventas"
                        +"(id_producto,descripcion,nombre_cliente,fecha,id_usuario)"
                        +"VALUES('"+p.getIdProducto()+"','"+p.getDescripcion()+"','"+p.getNomCliente()+"','"+p.getFecha()+"','"+p.getIdUsuario()+"')");
        JOptionPane.showMessageDialog(null,"Nuevo registro");
        p.setIdProducto(0);
        p.setDescripcion(null);
        p.setNomCliente(null);
        p.setFecha(null);
        p.setIdUsuario(0);
        on.close();
    }
}
