package view;

import javax.swing.JOptionPane;

import br.com.jonas.estruturas.PilhaInt;
import controller.NPRController;

public class Principal {

	public static void main(String[] args) {
		PilhaInt p = new PilhaInt();
		NPRController npr = new NPRController();
		
		int opc = 0;
		
		while(opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma operação: \n 1 - Adicionar valor; \n 2 - Informar a operação; \n 3 - Excluir ultimo valor; \n 4 - Limpar todos os valores; \n 9 - Sair."));
			switch(opc) {
				case 1:
					int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
					npr.insereValor(p, valor);
					break;
				case 2:
					String op = "";
					while(true) {
						op = JOptionPane.showInputDialog("Informe a operação a ser realizada(+, -, *, /): ");
						if(op.contains("+") || op.contains("-") || op.contains("*") || op.contains("/")) {
							break;
						}
					}
					System.out.println(npr.npr(p, op));
					break;
				case 3:
					try {
						p.pop();
					} catch (Exception e) {
						System.err.println("Não há valores a serem excluidos");
					}
					break;
				case 4:
					while(!p.isEmpty()) {
						try {
							p.pop();
						} catch (Exception e) {
							System.err.println("Não há valores a serem excluidos");
						}
					}
					break;
				case 9:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Operação inválida!");
			}
		}
	}
}
