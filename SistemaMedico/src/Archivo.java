import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Archivo {
    private static final String ARCHIVO = "pacientes.txt";

    public static void agregarPaciente(Paciente paciente) {
        try (FileOutputStream fos = new FileOutputStream(ARCHIVO, true);
             OutputStreamWriter writer = new OutputStreamWriter(fos)) {
            writer.write(paciente.toString()); 
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
