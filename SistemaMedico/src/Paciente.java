public class Paciente {
    private String cedula;
    private String nombre;
    private String sintomas;
    private String diagnostico;
    private String tratamiento;

    public Paciente(String cedula, String nombre, String sintomas, String diagnostico, String tratamiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSintomas() {
        return sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    @Override
    public String toString() {
        return cedula + "," + nombre + "," + sintomas + "," + diagnostico + "," + tratamiento;
    }
}
