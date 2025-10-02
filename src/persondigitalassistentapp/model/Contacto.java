
package persondigitalassistentapp.model;

import java.util.ArrayList;


public class Contacto {

    private Integer id;
    private String nombre;
    private String email;
    private String telefono;
    private static ArrayList<Contacto> contactos = new ArrayList<>();

    public Contacto(String nombre, String email, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }
    
    public Contacto(int id, String nombre, String email, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public static void setContactos(ArrayList<Contacto> contactos) {
        Contacto.contactos = contactos;
    }
   
    public static void addContacto(Contacto c){
    
        contactos.add(c);
    }
    
    public static int searchContacto(String email){
  
        int i = 0;
        for(Contacto m: contactos){
            if(m.getEmail().equalsIgnoreCase(email)){
            
                return i;
            }
        i++; 
        }
        return -1;
    }
    
    public static Contacto verContacto(int id){
        return contactos.get(id);
    }
    
    
    
    
    

    @Override
    public String toString() {
        return "Contacto \n" + 
                "Id:" + id + 
                "\n Nombre:" + nombre + 
                "\n Email:" + email + 
                "\n Telefono:" + telefono ;
    }

}
