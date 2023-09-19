package CapaNegocio;

import CapaConexion.Conexion;
import CapaDatos.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UsuarioBD {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql;

    public DefaultTableModel reportarUsuario() {
        DefaultTableModel tablaTemporal;
        String[] titulos = {"DNI", "NOMBRES", "APELLIDOS", "DIRECCION", "CLAVE", "CELULAR", "TIPO USUARIO", "TIENDA"};
        String[] registros = new String[8];
        tablaTemporal = new DefaultTableModel(null, titulos);
        sql = "SELECT uDni,uNombre,uApellidos,uDireccion,uClave,uCelular,tuNombre,tienda FROM usuario AS u "
                + "INNER JOIN idtipoUsuario AS tp ON u.idtipoUsuario=tp.idtipoUsuario ";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {

                registros[0] = rs.getString("uDni");
                registros[1] = rs.getString("uNombre");
                registros[2] = rs.getString("uApellidos");
                registros[3] = rs.getString("uDireccion");
                registros[4] = rs.getString("uClave");
                registros[5] = rs.getString("uCelular");
                registros[6] = rs.getString("tuNombre");
                registros[7] = rs.getString("tienda");

                tablaTemporal.addRow(registros);
            }
            return tablaTemporal;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error al reportar usuario BD...", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public boolean registrarUsuario(Usuario u) {
        boolean rpta = false;
        sql = "INSERT INTO usuario (uDni,uNombre,uApellidos,uDireccion,uClave,uCelular,idtipoUsuario,tienda) VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, u.getuDni());
            pst.setString(2, u.getuNombre());
            pst.setString(3, u.getuApellidos());
            pst.setString(4, u.getuDireccion());
            pst.setString(5, u.getuClave());
            pst.setString(6, u.getuCelular());
            pst.setInt(7, u.getIdtipoUsuario());
            pst.setString(8, u.getTienda());

            rpta = pst.executeUpdate() == 1 ? true : false;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Problemas al registrar Usuario...", JOptionPane.ERROR_MESSAGE);
            return rpta;
        }
        return rpta;
    }

    public boolean modificarUsuario(Usuario u) {
        boolean rpta = false;

        sql = "UPDATE usuario SET uNombre=?,uApellidos=?,uDireccion=?,uClave=?,uCelular=?,idtipoUsuario=?,tienda=? WHERE uDni=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, u.getuNombre());
            pst.setString(2, u.getuApellidos());
            pst.setString(3, u.getuDireccion());
            pst.setString(4, u.getuClave());
            pst.setString(5, u.getuCelular());
            pst.setInt(6, u.getIdtipoUsuario());
            pst.setString(7, u.getTienda());
            pst.setString(8, u.getuDni());
            rpta = pst.executeUpdate() == 1 ? true : false;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return rpta;
        }
        return rpta;
    }
}
