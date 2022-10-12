import javax.swing.JOptionPane;
public class GraphicalUserInterface {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog(null,"What is your name");
		JOptionPane.showMessageDialog(null,"Hello "+name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your age"));
		JOptionPane.showMessageDialog(null,"you are "+age+" years old!");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your height"));
		JOptionPane.showMessageDialog(null,"you are "+height+" ft tall");
		
	}

}
