
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ConsultarNombre {
     private static final String ARCHIVO = "pacientes.dat";
    public static void porNombre(String nombreBuscar) {
        String lista[] = new String[5];
        try (DataInputStream per = new DataInputStream(
                new FileInputStream(ARCHIVO))) {
            boolean encontrado = false;
            while (true) {
                String cedula = per.readUTF();
                String nombre = per.readUTF();
                String sintomas = per.readUTF();
                String diagnostico = per.readUTF();
                String tratamiento = per.readUTF();
                if (nombre.equals(nombreBuscar)) {

                

                    JOptionPane.showMessageDialog(null, "Datos recolectados de la consulta por nombre: "
                            + "\nCedula" + cedula
                            + "\nnombre:" + nombre
                            + "\n Sintomas: " + sintomas
                            + "\ndiagnostico" + diagnostico
                            + "\n tratamiento: " + tratamiento);
                    encontrado = true;

                    break;
                }
            }
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "Paciente no encontrado", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (EOFException e) {
            //fin del archivo
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar los datos", "Error",
                    JOptionPane.ERROR_MESSAGE);
                   
        }

    }

}
