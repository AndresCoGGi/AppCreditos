/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.business.implementation;

import co.com.poli.appcreditos.business.IUsuarioBusiness;
import co.com.poli.appcreditos.dao.implementation.UsuarioDaoImpl;
import co.com.poli.appcreditos.model.Tblusuarios;
import java.util.List;

/**
 *
 * @author ANDRESCOGI
 */
public class UsuarioBusinessImpl implements IUsuarioBusiness {

    private UsuarioDaoImpl usuarioDaoImpl = new UsuarioDaoImpl();

//    @Override
//    public String crearUsuario(Usuario usuario) {
//        return usuarioDaoImpl.crearUsuario(usuario);
//    }
//
//    @Override
//    public List<Usuario> ObtenerListaUsuarios() {
//        return usuarioDaoImpl.ObtenerListaUsuarios();
//    }
    @Override
    public Boolean crearUsuario(Tblusuarios usuario) {
        return usuarioDaoImpl.crearUsuario(usuario);
    }

    @Override
    public List<Tblusuarios> ObtenerListaUsuarios() {
        return usuarioDaoImpl.ObtenerListaUsuarios();
    }

    @Override
    public String TopCredito() {
        String mensaje = "";
        int vivienda = 0;
        int estudio = 0;
        int libre = 0;
        List<Tblusuarios> listaUsuarios = usuarioDaoImpl.ObtenerListaUsuarios();
        for (Tblusuarios listaUsuario : listaUsuarios) {
            if (listaUsuario.getTipocredito().equals("vivienda")) {
                vivienda++;
            } else if (listaUsuario.getTipocredito().equals("estudio")) {
                estudio++;
            } else if (listaUsuario.getTipocredito().equals("libreinversion")) {
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
        List<Tblusuarios> listaUsuarios = usuarioDaoImpl.ObtenerListaUsuarios();
        for (Tblusuarios listaUsuario : listaUsuarios) {
            if (listaUsuario.getTipocredito().equals("vivienda")) {
                vivienda = vivienda + listaUsuario.getMonto();
            } else if (listaUsuario.getTipocredito().equals("estudio")) {
                estudio = estudio + listaUsuario.getMonto();
            } else if (listaUsuario.getTipocredito().equals("libreinversion")) {
                libre = libre + listaUsuario.getMonto();
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
        List<Tblusuarios> listaUsuarios = usuarioDaoImpl.ObtenerListaUsuarios();
        for (Tblusuarios listaUsuario : listaUsuarios) {
            if (listaUsuario.getTipotrabajador().equals("independiente")) {
                independiente++;
            } else if (listaUsuario.getTipotrabajador().equals("dependiente")) {
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
        List<Tblusuarios> listaUsuarios = usuarioDaoImpl.ObtenerListaUsuarios();
        for (Tblusuarios listaUsuario : listaUsuarios) {
            if (listaUsuario.getDocumento().equals(documento)) {
                if (listaUsuario.getTipocredito().equals(tipoCredito)) {
                    sw = true;
                }
            }
        }
        return sw;
    }

    

    

}
