

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String senha = JOptionPane.showInputDialog(null, "Digite a senha:");
		if (senha == null || senha.trim().isEmpty()) {
            System.out.println("Senha inválida");
            System.exit(1);
        }

		ProvedorInfo provedor = ("designpatterns".equals(senha)) ? new ProvedorPrivate()
				: new PublicProvedor();

		provedor.exibirInformacao();
	}
}