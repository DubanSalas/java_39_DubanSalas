package actividad2;


public class principal {
   
    
    public static void main(String[] args){
        
       System.out.println("Mostrar Datos");
       
       peliculas_39 peli1 = new peliculas_39();
       
       peli1.año = 2007;
       peli1.titulo = "Soy leyenda";
       peli1.genero = "Acción";
       peli1.creador = "Warner Bros";
       
       peli1.mostrarDatos();
       
       peli1.actualizarTitulo("Soy leyenda - Edición especial");
       System.out.println("Titulo actualizado: ");
       peli1.mostrarDatos();
        
    
    
    }
}
