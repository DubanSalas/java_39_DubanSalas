package actividad5;


public class Actividad5 {

    public static void main(String[] args) {
        persona_39 p1 = new persona_39("Dubam",19);
        
        p1.mostrarDatos();
        
        persona_39 p2 = new persona_39();
        
        p2.actualizarNombre("Fardy");
        System.out.println("Despues de actualizar el nombre: ");
        p2.mostrarDatos();
    }
    
}
