
package persondigitalassistentapp.controller;

import javax.swing.JFrame;
import persondigitalassistentapp.view.BuscarContactoView;
import persondigitalassistentapp.view.EdicionView;
import persondigitalassistentapp.view.EditarContactoView;
import persondigitalassistentapp.view.EliminarContactoView;
import persondigitalassistentapp.view.FirstView;
import persondigitalassistentapp.view.InicioSeccionView;
import persondigitalassistentapp.view.ListaDeContactosView;
import persondigitalassistentapp.view.LoginView;
import persondigitalassistentapp.view.MenuContactosView;
import persondigitalassistentapp.view.MenuRegistroView;
import persondigitalassistentapp.view.NuevoContactoView;
import persondigitalassistentapp.view.PersonalDigitalAssistentView;
import persondigitalassistentapp.view.RegistrarseView;

public class PersonalDigitalAssistentController {
    
    private static FirstView firstView = new FirstView();
    private static BuscarContactoView buscarContactoView = new BuscarContactoView();
    private static EditarContactoView editarContactoView = new EditarContactoView();
    private static EliminarContactoView eliminarContactoView = new EliminarContactoView();
    private static ListaDeContactosView listaDeContactosView = new ListaDeContactosView();
    private static NuevoContactoView nuevoContactoView = new NuevoContactoView();
    private static MenuContactosView menuContactosView = new MenuContactosView();
    private static MenuRegistroView menuRegistroView = new MenuRegistroView();
    private static EdicionView edicionView = new EdicionView();
    private static LoginView loginView = new LoginView();
    private static RegistrarseView registrarseView = new RegistrarseView();
    private static InicioSeccionView inicioSeccion = new InicioSeccionView();
    private static PersonalDigitalAssistentView personalDigitalAssistentView = new PersonalDigitalAssistentView();
   
   public static void onEdicionView(){
   
        edicionView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        edicionView.setVisible(true);
   
   
   }
   public static void onLogin(){
   
       loginView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       loginView.setVisible(true);
   
   
   }

   public static void onInicioSeccion(){
       
       inicioSeccion.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       inicioSeccion.setVisible(true);
       
   }
   
   public static void onRegistrarse(){
   
   
       registrarseView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       registrarseView.setVisible(true);
   
   }
    
    public static void onMenuContactosView(){
        menuContactosView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        menuContactosView.setVisible(true);
        
    
    }
    
    public static void onMenuRegistroView(){
        
        menuRegistroView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        menuRegistroView.setVisible(true);
    
    }

    public static void onFirstView(){
        firstView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        firstView.setVisible(true);
    
    
    }
    
    public static void onBuscarContactoView(){
    
         buscarContactoView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        buscarContactoView.setVisible(true);
    
    }
    
    public static void onEditarContactoView(){
    
    
        editarContactoView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        editarContactoView.mostrarDatos();
        editarContactoView.setVisible(true);
    }
    public static void onEliminarContactoView(){
    
        eliminarContactoView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        eliminarContactoView.mostrarDatos();
        eliminarContactoView.setVisible(true);
    
    }
    
    public static void onListaDeContatosView(){
    
        
        listaDeContactosView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        listaDeContactosView.mostrarDatos();
        listaDeContactosView.setVisible(true);
    }
    
    public static void onNuevoContactoView(){
    
        nuevoContactoView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        nuevoContactoView.setVisible(true);
    
    }
    
    public static void onPersonalDigitalAssistentView(){
    
        personalDigitalAssistentView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        personalDigitalAssistentView.setVisible(true);
    
    }
    
    public static void offInicioSeccion(){
    
        inicioSeccion.setVisible(false);
    
    }
    
    public static void offRegistrarse(){
    
        registrarseView.setVisible(false);
    
    }
    
    public static void offLogin(){
    
        loginView.setVisible(false);
    
    
    }
    
    public static void offFirstView(){
    
        firstView.setVisible(false);
    
    }
    
    public static void offBuscarContactoView(){
    
        buscarContactoView.setVisible(false);
    
    }
    
    public static void offEditarContactoView(){
    
    
        editarContactoView.setVisible(false);
    }
    public static void offEliminarContactoView(){
    
        eliminarContactoView.setVisible(false);
    
    }
     public static void offEdicionView(){

        menuContactosView.setVisible(false);

   }
    
    public static void offListaDeContatosView(){
    
        listaDeContactosView.setVisible(false);
    
    }
    
    public static void offNuevoContactoView(){
    
        nuevoContactoView.setVisible(false);
    
    }
    
    public static void offMenuContactosView(){
    
        menuContactosView.setVisible(false);
    
    }
    
    public static void offMenuRegistroView(){
    
        menuRegistroView.setVisible(false);
    
    }
    public static void offPersonalDigitalAssistentView(){
    
        personalDigitalAssistentView.setVisible(false);
    
    }
   }
