/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.business.implementation;

import co.com.poli.appcreditos.business.IUsuarioBusiness;
import co.com.poli.appcreditos.dao.implementation.UsuarioDaoImpl;
import co.com.poli.appcreditos.model.Usuario;
import java.util.List;

/**
 *
 * @author ANDRESCOGI
 */
public class UsuarioBusinessImpl implements IUsuarioBusiness{
    
    private UsuarioDaoImpl usuarioDaoImpl = new UsuarioDaoImpl();

    @Override
    public String crearUsuario(Usuario usuario) {
        return usuarioDaoImpl.crearUsuario(usuario);
    }

    @Override
    public List<Usuario> ObtenerListaUsuarios() {
        return usuarioDaoImpl.ObtenerListaUsuarios();
    }
    
}
