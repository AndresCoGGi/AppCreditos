/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.controller;

import co.com.poli.appcreditos.business.implementation.UsuarioBusinessImpl;
import co.com.poli.appcreditos.model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ANDRESCOGI
 */
public class RegistrarServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        RequestDispatcher rd = null;
        UsuarioBusinessImpl uBusinessImpl = new UsuarioBusinessImpl();
        String accion = request.getParameter("accion");
        switch (accion) {
            case "crear":
                Boolean sw = false;
                Boolean sw2 = false;
                String numcredito = request.getParameter("txtcredito");
                String documento = request.getParameter("txtdocumento");
                String nombres = request.getParameter("txtnombre");
                Double monto = Double.valueOf(request.getParameter("txtmonto"));
                String tipotrabajador = request.getParameter("txttipotrabajador");
                String tipocredito = request.getParameter("txttipocredito");
                String trabaja = request.getParameter("txttrabaja");
                Usuario usuario = new Usuario(numcredito, documento, nombres, monto, tipotrabajador, tipocredito, trabaja);
                sw = uBusinessImpl.UsuarioExiste(documento, tipocredito);
                sw2 = uBusinessImpl.CreditoExiste(numcredito);
                if (sw == true) {
                    String menssaje = "Hola " + nombres + ", lo sentimos usted "
                            + "ya cuenta con un credito de " + tipocredito;
                    session.setAttribute("MENSAJE", menssaje);
                    rd = request.getRequestDispatcher("/mensaje.jsp");
                } else if (sw2 == true) {
                    String menssaje = "Ya existe el credito numero " + numcredito;
                    session.setAttribute("MENSAJE", menssaje);
                    rd = request.getRequestDispatcher("/mensaje.jsp");
                } else {
                    String mensaje = uBusinessImpl.crearUsuario(usuario);
                    List<Usuario> listaUsuarios = uBusinessImpl.ObtenerListaUsuarios();
                    session.setAttribute("LISTADO", listaUsuarios);
                    rd = request.getRequestDispatcher("/views/listarcreditos.jsp");
                }
                break;
            case "listar":
                List<Usuario> listaUsuarios2 = uBusinessImpl.ObtenerListaUsuarios();
                session.setAttribute("LISTADO", listaUsuarios2);
                rd = request.getRequestDispatcher("/views/listarcreditos.jsp");
                break;
            case "top":
                String mensajetop = "";
                mensajetop = uBusinessImpl.TopCredito();
                session.setAttribute("MENSAJE", mensajetop);
                rd = request.getRequestDispatcher("/mensaje.jsp");
                break;
            case "creditoMas":
                String menssaje = "";
                menssaje = uBusinessImpl.prestamoMayor();
                session.setAttribute("MENSAJE", menssaje);
                rd = request.getRequestDispatcher("/mensaje.jsp");
                break;
            case "prestanMas":
                String mensajeMas = "";
                mensajeMas = uBusinessImpl.prestanMas();
                session.setAttribute("MENSAJE", mensajeMas);
                rd = request.getRequestDispatcher("/mensaje.jsp");
                break;
            default:
                break;
        }
        rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
