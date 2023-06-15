import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static SistemaDeCitas sistemaDeCitas = new SistemaDeCitas();

    public static void main(String[] args) {
        // Crear la carpeta "db" si no existe
        File directorioDB = new File("db");
        if (!directorioDB.exists()) {
            if (directorioDB.mkdir()) {
                System.out.println("Carpeta 'db' creada exitosamente.");
            } else {
                System.out.println("Error al crear la carpeta 'db'.");
            }
        }
