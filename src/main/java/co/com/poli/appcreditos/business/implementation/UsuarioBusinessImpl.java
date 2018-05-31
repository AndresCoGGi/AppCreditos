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
public class UsuarioBusinessImpl implements IUsuarioBusiness {

    private UsuarioDaoImpl usuarioDaoImpl = new UsuarioDaoImpl();

    @Override
    public String crearUsuario(Usuario usuario) {
        return usuarioDaoImpl.crearUsuario(usuario);
    }

    @Override
    public List<Usuario> ObtenerListaUsuarios() {
        return usuarioDaoImpl.ObtenerListaUsuarios();
    }

    @Override
    public String TopCredito() {
        String mensaje = "";
        int vivienda = 0;
        int estudio = 0;
        int libre = 0;
        List<Usuario> listaUsuarios = usuarioDaoImpl.ObtenerListaUsuarios();
        for (Usuario userList : listaUsuarios) {
            if (userList.getTipoCredito().equals("vivienda")) {
                vivienda++;
            } else if (userList.getTipoCredito().equals("estudio")) {
                estudio++;
            } else if (userList.getTipoCredito().equals("libreinversion")) {
                libre++;
            }
        }
        if (vivienda > estudio && vivienda > libre) {
            mensaje = "Credito de vivienda, usado " + vivienda + " veces";
        } else if (estudio > vivienda && estudio > libre) {
            mensaje = "Credito de estudio, usado " + estudio + " veces";
        } else if (libre > vivienda && libre > estudio) {
            mensaje = "Credito de Libre Inversion, usado " + libre + " veces";
        } else {
            mensaje = "No hay un credito que sea el mas usado";
        }
        return mensaje;
    }

    @Override
    public String prestamoMayor() {
        String mensaje = "";
        Double vivienda = 0.0;
        Double estudio = 0.0;
        Double libre = 0.0;
        List<Usuario> listaUsuarios = usuarioDaoImpl.ObtenerListaUsuarios();
        for (Usuario userList : listaUsuarios) {
            if (userList.getTipoCredito().equals("vivienda")) {
                vivienda = vivienda + userList.getMonto();
            } else if (userList.getTipoCredito().equals("estudio")) {
                estudio = estudio + userList.getMonto();
            } else if (userList.getTipoCredito().equals("libreinversion")) {
                libre = libre + userList.getMonto();
            }
        }
        if (vivienda > estudio && vivienda > libre) {
            mensaje = "Credito de vivienda, con un valor acumulado de " + vivienda;
        } else if (estudio > vivienda && estudio > libre) {
            mensaje = "Credito de estudio, con un valor acumulado de " + estudio;
        } else if (libre > vivienda && libre > estudio) {
            mensaje = "Credito de Libre Inversion, con un valor acumulado de " + libre;
        }
        return mensaje;
    }

    @Override
    public String prestanMas() {
        String mensaje = "";
        Integer independiente = 0;
        Integer dependiente = 0;
        List<Usuario> listaUsuarios = usuarioDaoImpl.ObtenerListaUsuarios();
        for (Usuario userList : listaUsuarios) {
            if (userList.getTipoTrabajador().equals("independiente")) {
                independiente++;
            } else if (userList.getTipoTrabajador().equals("dependiente")) {
                dependiente++;
            }
        }
        if (independiente > dependiente) {
            mensaje = "Prestan mas los independientes, " + independiente;
        } else if (dependiente > independiente) {
            mensaje = "Prestan mas los dependientes, " + dependiente;
        } else {
            mensaje = "Hay igual numero de dependientes e indendientes";
        }
        return mensaje;
    }

    @Override
    public Boolean UsuarioExiste(String documento, String tipoCredito) {
        Boolean sw = false;
        List<Usuario> listaUsuarios = usuarioDaoImpl.ObtenerListaUsuarios();
        for (Usuario listaUsuario : listaUsuarios) {
            if (listaUsuario.getDocumento().equals(documento)) {
                if (listaUsuario.getTipoCredito().equals(tipoCredito)) {
                    sw = true;
                }
            }
        }
        return sw;
    }

    @Override
    public Boolean CreditoExiste(String idCredito) {
        Boolean sw = false;
        List<Usuario> listaUsuarios = usuarioDaoImpl.ObtenerListaUsuarios();
        for (Usuario listaUsuario : listaUsuarios) {
            if (listaUsuario.getCredito().equals(idCredito)) {
                sw = true;
            }
        }
        return sw;
    }

}
