package actividad2;


public class peliculas_39 {
    
    int año;
    String titulo;
    String genero;
    String creador;
    
    
    public void mostrarDatos(){
        
        System.out.println("año: " +año);
        System.out.println("titulo: "+titulo);
        System.out.println("genero: "+genero);
        System.out.println("creador: "+creador);
    
    }
    
    public void actualizarTitulo(String nuevoTitulo){
        this.titulo = nuevoTitulo;
    }
    
}
