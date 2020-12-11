import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Attention, ce code ne fonctionne qu'avec des documents CSV valide
 */
public class Main {

	private static final String COMMA_DELIMITER = ",";

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		List<List<String>> records = new ArrayList<>();
		int l = 0;
		int c = 0;
		try (BufferedReader br = new BufferedReader(new FileReader("file.csv"))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		        String[] values = line.split(COMMA_DELIMITER);
		        l = l+1;
		        if (l==1) c = values.length; //C'est la première ligne qui donne le nombre de colonne
		    }
		    System.out.println("Nombre de colonnnes :");
		    System.out.println(c);
			System.out.println("Nombre de lignes :");
	        System.out.println(l);
		}
	}
}
