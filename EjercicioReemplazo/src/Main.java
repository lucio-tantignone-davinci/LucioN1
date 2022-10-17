import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"Bienbenido al programa");

		
    int numero = 10;
    
    //String nombre, String teleforno, String direccion,  String email, String cuit
    Editorial planeta = new Editorial("Planeta","1122345112","Avenida corrientes");
    
    planeta.setNombre("Sirve");
    JOptionPane.showMessageDialog(null, planeta.getNombre());
	}

}
