import LerDatos.LerDatos;

import javax.swing.*;

public class ComprobarNumero implements Validador{
    public static void comprobador (){
        Integer opcion = LerDatos.lerEnteiro("Introduce un nomuero para comprobar paridad, o 0 para salir");
        if (opcion == 0){
            return;
        }else{
            if(Validador.esPar(opcion)){
                JOptionPane.showMessageDialog(null,"ES PAR");
            }else{
                JOptionPane.showMessageDialog(null, "ES IMPAR");
            }
            comprobador();
        }
    }
}
