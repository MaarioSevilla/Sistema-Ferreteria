package DataBase;

import Clases.Pedidos;
import static DataBase.TablaProductos.on;
import sistemaGestion.CConexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TablaPedidos {
    public static void mostrarTabla(JTable tabla){
        DefaultTableModel modelo= new DefaultTableModel();
        ResultSet rs =CConexion.getTabla("SELECT*FROM pedidos");
        modelo.setColumnIdentifiers(new Object[]{"id_pedido","id_producto","Descripcion","nombre_cliente","fecha","id_usuario"});
        try {
            while(rs.next()){//mientras haya algo despues
                modelo.addRow(new  Object[]{
                rs.getString("id_pedido"),
                rs.getString("id_producto"),
                rs.getString("Descripcion"),
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
    public static void insertarPedidos(Pedidos p) throws SQLException{
        on =CConexion.conexion();
        Statement st= on.createStatement();/*Ejecutar un actualizacion*/
        st.executeUpdate("INSERT INTO pedidos"
                        +"(id_producto,Descripcion,nombre_cliente,fecha,id_usuario)"
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
