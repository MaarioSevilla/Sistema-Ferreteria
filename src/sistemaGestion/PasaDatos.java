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
public class PasaDatos {
    String idioma;
    String letra;
    public PasaDatos(){
    }
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    public String CaF (){
        String resultado;
        resultado=idioma;
        return resultado; 
    }
    public void setLetra(String letra) {
        this.letra = letra;
    }
    public String pasaIdiom(){
        System.out.print(idioma);
        return "hola"+CaF();
    }

    public String getIdioma() {
        System.out.print("okkjk"+idioma);
        return idioma;
    }
    
}
