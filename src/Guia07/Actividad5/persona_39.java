package actividad5;


public class persona_39 {
    
    String nombre;
    int edad;
    
    
    public persona_39(String _nombre, int _edad){
        nombre = _nombre;
        edad = _edad;     
    }
    
    public persona_39(){
        nombre = "desconocido";
        edad = 0;
    }
    
    public void mostrarDatos(){
        
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
    
    public void actualizarNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }
    
}
