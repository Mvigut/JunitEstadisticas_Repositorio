/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitestadisticas;

import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class Estadisticas {
    
    ArrayList <Integer> array;
    
    
    public Estadisticas(){
        array = new ArrayList <>();
    }
    /**
     * Metodo que calcula la media de numeros pasados como ArrayList de Strings
     * @param datos ArayList de String. Recibe los números en una coleccion de strings
     * @return Stringt devuelve un String con la media o con un mensaje de error.
     */
    String calcularMedia(ArrayList <String> datos){
        int resultado=0;
        
        for(String dato: datos){
            array.add(Integer.parseInt(dato));
        }
        if(array.size() <= 5 || array.size() > 20 ){
            array.clear();
            return "Error. Las aulas son de 5 a 20 alumnos";
        }
        
        for(int i=0;i<array.size();i++){
            resultado += array.get(i);
        }
        resultado /= array.size();
        array.clear();
        return ""+resultado;
        
    }
    
}
