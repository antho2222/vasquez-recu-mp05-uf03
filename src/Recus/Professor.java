package Recus;

public class Professor extends Persona {
    private String departament;
    private boolean esTitular;

    public Professor(boolean _tePermisDeConduir, String _nom, int _edat, String _departament, boolean _esTitular) {
        super(_tePermisDeConduir, _nom, _edat);
        this.departament = _departament;
        this.esTitular = _esTitular;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String _departament) {
        this.departament = _departament;
    }

    public boolean isEsTitular() {
        return esTitular;
    }

    public void setEsTitular(boolean _esTitular) {
        this.esTitular = _esTitular;
    }
}
