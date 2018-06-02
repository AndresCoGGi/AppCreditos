/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.dao;

import co.com.poli.appcreditos.model.Tblusuarios;
import java.util.List;

/**
 *
 * @author ANDRESCOGI
 */
public interface IUsuarioDao {
    
    String crearUsuario(Tblusuarios usuario);
    List<Tblusuarios> ObtenerListaUsuarios();
}
