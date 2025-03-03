import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Archivo {
    private static final String ARCHIVO = "pacientes.dat";

    public static void agregarPaciente(Paciente paciente) {
        try (FileOutputStream fos = new FileOutputStream(ARCHIVO, true);
             DataOutputStream dos = new DataOutputStream(fos)) {
            dos.writeUTF(paciente.getCedula());
            dos.writeUTF(paciente.getNombre());
            dos.writeUTF(paciente.getSintomas());
            dos.writeUTF(paciente.getDiagnostico());
            dos.writeUTF(paciente.getTratamiento());
            
            System.out.println("Paciente agregado: " + paciente.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
