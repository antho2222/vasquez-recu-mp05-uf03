package Recus;

public class PersonaApp {
    public static void main(String[] args) {
        // Definició de constants GLOBALS
        int EDAT_MAXIMA_PROFESSOR = 25;
        int EDAT_MINIMA_PROFESSOR = 18;

        // Definició de variables
        int quantitatDeProfessors = 0;

        quantitatDeProfessors = jpc.llegirEnter("Quants gossos vols entrar?: ",
                "\n\tERROR!!\n\tCal que entris un enter positiu!");

        System.out.println();

        Gos[] llistaDeGossos = new Gos[quantitatDeGossos];

        String[] nomsGossos = new String[quantitatDeGossos];
        int[] edatsGossos = new int[quantitatDeGossos];
        String[] colorsGossos = new String[quantitatDeGossos];
        String[] rassesGossos = new String[quantitatDeGossos];
        boolean[] corretjaGossos = new boolean[quantitatDeGossos];
        String opcioCorretja;

        // Cridaré al constructor Gos que té només 4 paràmetres (
        // String _nom, int _edat, String _color, String _rasa, boolean _corretja)
        // No passaré el valor de l'atribut espècie i el posarà per defecte a Mamífer!
        for (int i = 0; i < corretjaGossos.length; i++) {

            System.out.println("\n".repeat(3));
            String cadenaTitol = "Dades del gos " + (i + 1) + " de " + quantitatDeGossos + " gossos";
            System.out.println("\n" + cadenaTitol);
            System.out.println("=".repeat(cadenaTitol.length()) + "\n");

            // crear un objecte de la subclasse
            nomsGossos[i] = jpc.llegirCadena("Entra el nom del gos " + (i + 1) + ": ",
                    "\n\tERROR!!\n\tCal que entris un nom!");
            edatsGossos[i] = jpc.llegirEnterInterval(
                    "Entra l'edat de " + nomsGossos[i].toUpperCase() +
                            " (entre " + EDAT_MINIMA_GOS + " i " + EDAT_MAXIMA_GOS + "): ",
                    "\n\tERROR!!\n\tCal que entris un enter entre " +
                            EDAT_MINIMA_GOS + " i " + EDAT_MAXIMA_GOS + "!",
                    EDAT_MINIMA_GOS, EDAT_MAXIMA_GOS);

            colorsGossos[i] = jpc.llegirCadena("Entra el color de " + nomsGossos[i].toUpperCase() + " : ",
                    "\n\tERROR!!\n\tCal que entris un color!");
            rassesGossos[i] = jpc.llegirCadena("Entra la raça de de " + nomsGossos[i].toUpperCase() + " : ",
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