import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class ProvedorInfo {
	protected abstract String recuperarInformacao();

	public void exibirInformacao() {
		System.out.println(recuperarInformacao());
	}

	protected Scanner criarScanner(File arquivo) {
		try {
			return new Scanner(arquivo);
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo n�o encontrado: " + arquivo.getPath());
			System.exit(1);
		}
		return null;
	}
}