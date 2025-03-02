import java.io.*;
import javax.swing.JOptionPane;

public class ConsultarSintomas {
    private static final String ARCHIVO = "pacientes.txt";

    public static void buscarPorSintomas(String sintomasBuscados) {
        System.out.println("Buscando síntomas: " + sintomasBuscados);

        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            boolean encontrado = false;

            while ((linea = br.readLine()) != null) {
                System.out.println("Leyendo línea: " + linea);

                String[] datos = linea.split(",");
                if (datos.length < 5) continue;

                String cedula = datos[0];
                String nombre = datos[1];
                String sintomas = datos[2];
                String diagnostico = datos[3];
                String tratamiento = datos[4];

                if (sintomas.toLowerCase().contains(sintomasBuscados.toLowerCase())) {
                    JOptionPane.showMessageDialog(null, "Paciente encontrado:\n" +
                            "Cédula: " + cedula + "\n" +
                            "Nombre: " + nombre + "\n" +
                            "Síntomas: " + sintomas + "\n" +
                            "Diagnóstico: " + diagnostico + "\n" +
                            "Tratamiento: " + tratamiento, 
                            "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    encontrado = true;
                    break; // 🔹 Evita que se sigan mostrando más alertas
                }
            }

            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "No se encontraron pacientes con esos síntomas.", 
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo de pacientes.", 
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
