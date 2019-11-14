package DataBase;

import Clases.Almacen;
import static DataBase.TablaProductos.on;
import sistemaGestion.CConexion;
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
public class TablaAlmacen {
     public static void mostrarTabla(JTable tabla){
        DefaultTableModel modelo= new DefaultTableModel();
        ResultSet rs =CConexion.getTabla("SELECT*FROM almacen");
        modelo.setColumnIdentifiers(new Object[]{"id_material","nombre_material","descripcion","tipo","cantidad"});
        try {
            while(rs.next()){//mientras haya algo despues
                modelo.addRow(new  Object[]{
                rs.getString("id_material"),
                rs.getString("nombre_material"),
                rs.getString("descripcion"),
                rs.getString("tipo"),
                rs.getString("cantidad")
                });
            }
            //Asigna el modelo a la tabla
            tabla.setModel(modelo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void insertarAlmacen(Almacen p) throws SQLException{
        on =CConexion.conexion();
        Statement st= on.createStatement();/*Ejecutar un actualizacion*/
        st.executeUpdate("INSERT INTO almacen"
                        +"(nombre_material,descripcion,tipo,cantidad)"
                        +"VALUES('"+p.getNombre_material()+"','"+p.getDescripcion()+"','"+p.getTipo()+"','"+p.getCantidad()+"')");
        JOptionPane.showMessageDialog(null,"Nuevo registro");
        p.setNombre_material(null);
        p.setDescripcion(null);
        p.setTipo(null);       
        p.setCantidad(0);
        on.close();
    }
   
}
