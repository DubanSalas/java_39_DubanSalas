package actividad3;


public class Actividad3_39 {
    
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    public int sumar(int numero1, int numero2){
        this.suma = numero1 + numero2;
        return this.suma;
    
    }
    
    public int resta(int numero1, int numero2){
        this.resta = numero1 - numero2;
        return this.resta;
    
    }
    
    public int multiplicar(int numero1, int numero2){
        this.multiplicacion = numero1 * numero2;
        return this.multiplicacion;
    
    }
    
    public int dividir(int numero1, int numero2){
        this.division = numero1 / numero2;
        return this.division;
    
    }
    


    public void mostrarResultados() {
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
    
}
