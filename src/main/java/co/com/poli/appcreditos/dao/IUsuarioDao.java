/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.dao;

import co.com.poli.appcreditos.model.Usuario;
import java.util.List;

/**
 *
 * @author ANDRESCOGI
 */
public interface IUsuarioDao {
    
    String crearUsuario(Usuario usuario);
    List<Usuario> ObtenerListaUsuarios();
    //String TopCredito();
    //String prestamoMayor();
    //String prestanMas();
}
