package Recus;

public class Alumne extends Persona{
    private String[] cursos;
    private boolean estaMatriculat;

    public Alumne(boolean _tePermisDeConduir, String _nom, int _edat, String[] _cursos, boolean _estaMatriculat) {
        super(_tePermisDeConduir, _nom, _edat);
        this.cursos = _cursos;
        this.estaMatriculat = _estaMatriculat;
    }

    public String[] getCursos() {
        return cursos;
    }

    public void setCursos(String[] _cursos) {
        this.cursos = _cursos;
    }

    public boolean isEstaMatriculat() {
        return estaMatriculat;
    }

    public void setEstaMatriculat(boolean _estaMatriculat) {
        this.estaMatriculat = _estaMatriculat;
    }
}
