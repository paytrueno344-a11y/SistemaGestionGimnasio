/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestiongimnasio.reglas.negocio;

import sistemagestiongimnasio.usuarios.sql.UsuariosSQL;

/**
 *
 * @author CUTT 5
 */
public class UsuarioReglasNegocio {

    public boolean validaUsuario(String usuario, String password) {

        UsuariosSQL sql = new UsuariosSQL();

        boolean existeUsuarioPassword = sql.existeUsuarioPassword(usuario, password);
        return existeUsuarioPassword;
    }

}
