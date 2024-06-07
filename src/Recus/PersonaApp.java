package Recus;

public class PersonaApp {
    public static void main(String[] args) {
        // Definició de constants GLOBALS
        int EDAT_MAXIMA_PROFESSOR = 25;
        int EDAT_MINIMA_PROFESSOR = 18;

        // Definició de variables
        int quantitatDeProfessors = 0;

        quantitatDeProfessors = jpc.llegirEnter("Quants professors vols entrar?: ",
                "\n\tERROR!!\n\tCal que entris un enter positiu!");

        System.out.println();

        Professor[] llistaDeProfessors = new Professor[quantitatDeProfessors];
        String[] nomsProfessors = new String[quantitatDeProfessors];
        int[] edatsProfessors = new int[quantitatDeProfessors];
        String[] departamentsProfessors = new String[quantitatDeProfessors];
        boolean[] tePermisDeConduirProfessors = new boolean[quantitatDeProfessors];
        boolean[] esTitularProfessors = new boolean[quantitatDeProfessors];
        String opcioesTitular;

        // Cridaré al constructor Gos que té només 4 paràmetres (
        // String _nom, int _edat, String _color, String _rasa, boolean _corretja)
        // No passaré el valor de l'atribut espècie i el posarà per defecte a Mamífer!
        for (int i = 0; i < esTitularProfessors.length; i++) {

            System.out.println("\n".repeat(3));
            String cadenaTitol = "Dades del gos " + (i + 1) + " de " + quantitatDeProfessors + " Professors";
            System.out.println("\n" + cadenaTitol);
            System.out.println("=".repeat(cadenaTitol.length()) + "\n");

            // crear un objecte de la subclasse
            nomsProfessors[i] = jpc.llegirCadena("Entra el nom del gos " + (i + 1) + ": ",
                    "\n\tERROR!!\n\tCal que entris un nom!");
            edatsProfessors[i] = jpc.llegirEnterInterval(
                    "Entra l'edat de " + nomsProfessors[i].toUpperCase() +
                            " (entre " + EDAT_MINIMA_PROFESSOR + " i " + EDAT_MAXIMA_PROFESSOR + "): ",
                    "\n\tERROR!!\n\tCal que entris un enter entre " +
                            EDAT_MINIMA_PROFESSOR + " i " + EDAT_MAXIMA_PROFESSOR + "!",
                    EDAT_MINIMA_PROFESSOR, EDAT_MAXIMA_PROFESSOR);

            departamentsProfessors[i] = jpc.llegirCadena("Entra el departament de " + nomsProfessors[i].toUpperCase() + " : ",
                    "\n\tERROR!!\n\tCal que entris un color!");
            tePermisDeConduirProfessors[i] = jpc.llegirCadena("Entra el permis de de " + nomsProfessors[i].toUpperCase() + " : ",
                    "\n\tERROR!!\n\tCal que entris una raça!");

            // System.out.print("\tEntra si cal corretja per portar el primer dels gossos
            // (s/n): "); de " + nomsGossos[i].toUpperCase() + " : ",
            opcioCorretja = jpc.llegirCaracterOpcions("Cal corretja per portar " + nomsGossos[i].toUpperCase() + " a passejar?: ",
                    "ERROR!!", "sn").toLowerCase().substring(0, 1);
            corretjaGossos[i] = (opcioCorretja == "s");
            System.out.println("Has entrat que per portar a passejar a "
                    + nomsGossos[i].toUpperCase() + ((opcioCorretja == "s")?" cal ":" no cal ") + "portar-lo lligat!");

            // Creem una instancia de Gos amb totes les dades recollides
            // i l'afegim al vector de Gossos llistaDeGossos
            llistaDeGossos[i] = new Gos(nomsGossos[i],edatsGossos[i],colorsGossos[i],rassesGossos[i],corretjaGossos[i]);

            System.out.println("Aquestes són les dades de " + nomsGossos[i].toUpperCase() + "\n" +
                    llistaDeGossos[i].toString());
        }
    }
}