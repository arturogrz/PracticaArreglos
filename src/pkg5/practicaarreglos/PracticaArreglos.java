package pkg5.practicaarreglos;
import javax.swing.JOptionPane;
public class PracticaArreglos {
    public static void main(String[] args) {
        boolean acceso = false;
        String usuarios [][] = {
            {"Usuario1@email.com", "123"},
            {"Usuario2@email.com", "456"},
            {"Usuario3@email.com", "789"},
        };
        String email = JOptionPane.showInputDialog("Ingresa el correo: ");
        String password = JOptionPane.showInputDialog("Ingresa la contraseña: ");
        for (String[] usuario : usuarios) {
            if((email.equals(usuario[0]))&&(password.equals(usuario[1]))){
                acceso = true;
            }
        }
        if(acceso == true){
            JOptionPane.showMessageDialog(null,"Usuario y contraseña correctos.","Acceso",1);
        }else{
            JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrectos. Intentelo de nuevo","Acceso",0);
        }  
    }
}
