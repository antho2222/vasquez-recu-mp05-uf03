package Recus;

public class Persona {
    private boolean tePermisDeConduir;
    private String nom;
    private int edat;

    public Persona(boolean _tePermisDeConduir, String _nom, int _edat) {
        this.tePermisDeConduir = _tePermisDeConduir;
        this.nom = _nom;
        this.edat = _edat;
    }


    public boolean isTePermisDeConduir() {
        return tePermisDeConduir;
    }

    public void setTePermisDeConduir(boolean _tePermisDeConduir) {
        this.tePermisDeConduir = _tePermisDeConduir;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String _nom) {
        this.nom = _nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int _edat) {
        this.edat = _edat;
    }

}
