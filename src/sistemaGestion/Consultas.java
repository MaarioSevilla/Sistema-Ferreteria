/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaGestion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Consultas {
    CConexion cc=new CConexion();
    Connection cn=cc.conexion();
    String idioma="";
    String tamaño="";
    String id="";
    int retorno=0;
    protected int acceder(String usuario,String password){
        String tipo="";
        String Estado="";
        String sql="SELECT * FROM usuarios WHERE usuario='"+usuario+"' && password='"+password+"'";
        try{
        Statement st = cn.createStatement();
        ResultSet rs=st.executeQuery(sql);
        while(rs.next()){
            id=rs.getString("id_usuario");
            tipo=rs.getString("tipoUser");
            Estado=rs.getString("estado");
            idioma=rs.getString("idioma");
            tamaño=rs.getString("letra");
        }
        if(Estado.equals("activo")&& tipo.equals("administrador")){
            retorno = 1;
            EnviaDatos();
        }
        if(Estado.equals("activo") && tipo.equals("empleado")){
            retorno = 2;
            EnviaDatos();
        }
        }catch(SQLException ex){
            JFError error= new JFError();
            error.mensaje("ERROR : "+ex);
            error.setVisible(true);
        }
        return retorno;
    }
    
    private void EnviaDatos(){
        String idi=idioma;
        String tam=tamaño;
        String ide=id;
        PasaDatos lk =new PasaDatos();
        lk.setIdioma(idioma);
    }
}
