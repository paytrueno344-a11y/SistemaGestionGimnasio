/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestiongimnasio.usuarios.sql;

import java.sql.Connection;
import sistemagestiongimnasio.conexion.bd.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author CUTT 5
 */
public class UsuariosSQL {

    public boolean existeUsuarioPassword(String usuario, String password) {
         boolean resultado = false;
        try {
            Connection conn = ConexionBD.obtieneConexion();

            String consulta = "SELECT count(*) as existe FROM usuarios WHERE usuario = ? and password = ?";

            PreparedStatement ps = conn.prepareStatement(consulta);
            ps.setString(1, usuario);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            rs.next();
            int resultadors = rs.getInt("existe");
            resultado = resultadors > 0;

        } catch (SQLException ex) {
            System.getLogger(UsuariosSQL.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return resultado;
    }

}
