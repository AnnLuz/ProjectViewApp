
package persondigitalassistentapp.cruddata;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import persondigitalassistentapp.config.ConexionBaseDeDatos;
import persondigitalassistentapp.model.Contacto;
import persondigitalassistentapp.model.Login;


public class PersonalDigitalAssistentDao {
    
    //-----------registrar usuario -------------------
    
    public static boolean createUsuario(Login l){
    
        String sql = "INSERT INTO Login  (usuario,contraseña) VALUES (?,?)";
        try (Connection conn = ConexionBaseDeDatos.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, l.getUsuario());
            stmt.setString(2, l.getContraseña());

            

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
        //--------------Buscar usuario-------------------------
     public static boolean validarLogin(String usuario, String contraseña) {
        String sql = "SELECT * FROM Login WHERE usuario = ? AND contraseña = ?";

        try (Connection conn = ConexionBaseDeDatos.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.trim());
            stmt.setString(2, contraseña.trim());

            try (ResultSet rs = stmt.executeQuery()) {
                // Si rs.next() es true, encontró un registro => login válido
                return rs.next();
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    
    
    //-----------registrar contacto -------------------
    
    public static boolean create(Contacto c){
    
        String sql = "INSERT INTO PersonalDigitalAsistent  (nombre,email,telefono) VALUES (?,?,?)";
        try (Connection conn = ConexionBaseDeDatos.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, c.getNombre());
            stmt.setString(2, c.getEmail());
            stmt.setString(3, c.getTelefono());
            

            

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    // ----------- Mostrar contactos (ordenados alfabéticamente) -------------------
    public static List<Contacto> getAll() {
        List<Contacto> lista = new ArrayList<>();
        String sql = "SELECT * FROM PersonalDigitalAsistent ORDER BY nombre ASC";

        try (Connection conn = ConexionBaseDeDatos.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Contacto c = new Contacto(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("email"),
                        rs.getString("telefono")
                );
                lista.add(c);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

 // ----------- Editar contacto -------------------
    public static  boolean update(Contacto c) {
        String sql = "UPDATE PersonalDigitalAsistent SET nombre=?, email=?, telefono=? WHERE id=?";
        try (Connection conn = ConexionBaseDeDatos.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, c.getNombre());
            stmt.setString(2, c.getEmail());
            stmt.setString(3, c.getTelefono());
            stmt.setInt(4, c.getId());

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // ----------- Eliminar contacto -------------------
    public static boolean delete(int id) {
        String sql = "DELETE FROM PersonalDigitalAsistent WHERE id=?";
        try (Connection conn = ConexionBaseDeDatos.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
   
    public static Contacto buscarPorId(int id) {
        String sql = "SELECT * FROM PersonalDigitalAsistent WHERE id = ?";
        Contacto contacto = null;

        try (Connection conn = ConexionBaseDeDatos.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    contacto = new Contacto(
                       rs.getInt("id"),
                       rs.getString("nombre"),
                       rs.getString("email"),
                       rs.getString("telefono")
                    );
                }
            }
        } catch (SQLException e) {
        e.printStackTrace();
        }
        return contacto; // devuelve null si no encontró el contacto
    }
    
    public static List<Contacto> buscarPorNombre(String nombre) {
        List<Contacto> lista = new ArrayList<>();
        String sql = "SELECT * FROM PersonalDigitalAsistent WHERE nombre LIKE ? ORDER BY nombre ASC";

        try (Connection conn = ConexionBaseDeDatos.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nombre + "%"); // búsqueda progresiva, comienza con lo que se ingresa

        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Contacto c = new Contacto(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("email"),
                    rs.getString("telefono")
                );
                lista.add(c);
            }
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return lista; // devuelve lista vacía si no encontró coincidencias
}

    
    
}
