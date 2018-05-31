/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.data;

import co.com.poli.appcreditos.model.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ANDRESCOGI
 */
public class UsuarioData {
    
    //variables estatcas pertenecen en la clase pero no en los objetos
    private static List<Usuario> listaUsuarios;
    
    static{
        listaUsuarios = new ArrayList<Usuario>(){
            {
                add(new Usuario("001", "1020", "Andres Correa",1000D, 
                                       "independiente", "vivienda", "si"));
                add(new Usuario("002", "1030", "Santiago Correa",3000D, 
                                       "dependiente", "vivienda", "no"));
                add(new Usuario("003", "1040", "Bere Giraldo",1000D, 
                                       "independiente", "estudio", "si"));
                add(new Usuario("004", "1050", "Alberto Correa",1000D, 
                                       "independiente", "estudio", "si"));
                add(new Usuario("005", "1060", "Laura Diaz",7000D, 
                                       "dependiente", "estudio", "no"));
            }  
        };
    }

    public static List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public static void setListaUsuarios(List<Usuario> aListaUsuarios) {
        listaUsuarios = aListaUsuarios;
    }
    
    
}
