import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ConteoLineasCodigo {



	    public static void main(String[] args) {
	        // Directorio raíz de tu proyecto
	        String directorioProyecto = "C:\\Users\\nad95\\Downloads\\restaurantQuetzal (1)\\restaurantQuetzal";

	        // Llamada al método para contar las líneas de código
	        int lineasDeCodigo = contarLineasDeCodigo(new File(directorioProyecto));

	        // Imprimir el resultado
	        System.out.println("Total de líneas de código en el proyecto: " + lineasDeCodigo);
	    }

	    public static int contarLineasDeCodigo(File directorio) {
	        int totalLineas = 0;
	        if (directorio.isDirectory()) {
	            File[] archivos = directorio.listFiles();
	            if (archivos != null) {
	                for (File archivo : archivos) {
	                    totalLineas += contarLineasDeCodigo(archivo);
	                }
	            }
	        } else if (directorio.isFile() && esArchivoJava(directorio)) {
	            try {
	                totalLineas += contarLineasEnArchivo(directorio);
	            } catch (FileNotFoundException e) {
	                e.printStackTrace();
	            }
	        }
	        return totalLineas;
	    }

	    public static boolean esArchivoJava(File archivo) {
	        return archivo.getName().endsWith(".java");
	    }

	    public static int contarLineasEnArchivo(File archivo) throws FileNotFoundException {
	        int lineas = 0;
	        Scanner scanner = new Scanner(archivo);
	        while (scanner.hasNextLine()) {
	            String linea = scanner.nextLine().trim();
	            if (!linea.isEmpty()) {
	                lineas++;
	            }
	        }
	        scanner.close();
	        return lineas;
	    
	}

}
