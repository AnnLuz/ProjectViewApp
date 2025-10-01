
package persondigitalassistentapp.model;

import java.util.ArrayList;

public class Login {
    
    private static  int incrementadorId = 1;
    private int id;
    private String usuario;
    private String contraseña;
    private static ArrayList<Login> usuarios = new ArrayList<>();

    public Login( String usuario, String contraseña) {
        this.id = incrementadorId++ ;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public static ArrayList<Login> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Login> usuarios) {
        this.usuarios = usuarios;
    }
    
    public static int getIncrementadorId() {
        return incrementadorId;
    }

    public static void setIncrementadorId(int aIncrementadorId) {
        incrementadorId = aIncrementadorId;
    }
    
    public static void addUsuario(Login login){

        usuarios.add(login);
    
    }
    public static boolean validarUsuario(String usuario){
       
        String validUsuario = "^[a-zA-Z0-9_-]{6,20}$";
        
        if(usuario.length() >= 6){
                
            return usuario.matches(validUsuario);

        }else{

            return false;
            
        }

    }
    
    public static boolean validarContrasenia(String contrasenia){

         String validContrasenia = "^[a-zA-Z0-9_\\-*/#]{8,20}$";
        
        if(contrasenia.length() >=8){
        
            return contrasenia.matches(validContrasenia);
            
        }else{

            return false;

        }
    }

    @Override
    public String toString() {
        return "Login{" + "id=" + id + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", usuarios=" + usuarios + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
