package actividad4;

import javax.swing.JOptionPane;

public class operecion {

    
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Registrar el primer nuemro: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Registrar el primer nuemro: "));
        
        Actividad_39 act = new Actividad_39();
        
        act.sumar(n1,n2);
        act.resta(n1,n2);
        act.multiplicar(n1,n2);
        act.dividir(n1,n2);
        
        act.mostrarResultados();
        
    }
    
}
