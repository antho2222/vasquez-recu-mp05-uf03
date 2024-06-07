package Recus;

import java.util.Scanner;

public class jpc {
    // Definició de constants GLOBALS
    final static int CODI_ERROR = -99;

    // Definició de variables GLOBALS
    static Scanner teclat = new Scanner(System.in);

    /**
     * Nom funció: llegirCadena
     * /* Descripció: Funció per llegir una cadena de text, mostrant el
     * /* text rebut (missatgeAMostrar) per demanar a l'usuari
     * /* que entri una cadena de text. I mostrant un text d'Error,
     * /* també rebut (missatgeDError), pel cas que l'usuari entri
     * /* alguna cosa que no sigui una cadena de text.
     * /* @param: missatgeAMostrar de tipus cadena de text -> String
     * /* Text a mostrar per demanar una cadena de text a l'usuari!
     * /* @param: missatgeDError de tipus cadena de text -> String
     * /* Text a mostrar per quan l'usuari entra un valor erroni.
     * /* @return: cadenaLlegida de tipus cadena de text -> String
     * /* Enter positiu entrat per l'usuari.
     */
    public static String llegirCadena(String missatgeAMostrar, String missatgeDError) {
        String cadenaCodiError = String.valueOf(CODI_ERROR);
        String cadenaLlegida = "";
        do {
            try {
                System.out.print(missatgeAMostrar);
                cadenaLlegida = teclat.nextLine();
            } catch (Exception e) {
                System.out.println(missatgeDError);
                cadenaLlegida = cadenaCodiError;
            }
        } while (cadenaLlegida == cadenaCodiError);
        return cadenaLlegida;
    }

    /**
     * Nom funció: llegirEnter
     * Descripció: Funció per llegir un enter, mostrant el
     * text rebut (missatgeAMostrar) per demanar a l'usuari
     * que entri un enter. I mostrant un text d'Error,
     * també rebut (missatgeDError), pel cas que l'usuari entri
     * alguna cosa que no sigui un enter.
     *
     * @param: missatgeAMostrar de tipus cadena de text -> String
     *                          Text a mostrar per demanar una cadena de text a
     *                          l'usuari!
     * @param: missatgeDError   de tipus cadena de text -> String
     *                          Text a mostrar per quan l'usuari entra un valor
     *                          erroni.
     * @return: enterLlegit de tipus enter -> int
     *          Enter entrat per l'usuari.
     *          Observacions:
     *          * Fa servir la nostra funció llegirCadena
     */
    public static int llegirEnter(String missatgeAMostrar, String missatgeDError) {
        int enterLlegit = 0;
        // do while per controlar que l'usuari no entri un valor que no sigui un enter
        do {
            try {
                enterLlegit = Integer.parseInt(llegirCadena(missatgeAMostrar, missatgeDError));
            } catch (Exception e) {
                System.out.println(missatgeDError);
                enterLlegit = CODI_ERROR;
            } finally {
                teclat = new Scanner(System.in);
            }
        } while (enterLlegit == CODI_ERROR);
        return enterLlegit;
    }

    /**
     * Nom funció: llegirEnterPositiu
     * /* Descripció: Funció per llegir un enter positiu, mostrant el
     * text rebut (missatgeAMostrar) per demanar a l'usuari
     * que entri un enter. I mostrant un text d'Error, també
     * rebut (missatgeDError), pel cas que l'usuari entri alguna
     * cosa que no sigui un enter positiu.
     *
     * @param: cadenaDemanarNombre de tipus cadena de text -> String
     *                             Text a mostrar per demanar el nombre a l'usuari!
     * @param: cadenaError         de tipus cadena de text -> String
     *                             Text a mostrar per quan l'usuari entra un valor
     *                             erroni.
     * @return: enterPositiu de tipus enter -> int
     *          Enter positiu entrat per l'usuari.
     *          Observacions:
     *          * Fa servir la nostra funció llegirCadena
     */
    public static int llegirEnterPositiu(String missatgeAMostrar, String missatgeDError) {
        int enterPositiu = 0;
        do {
            enterPositiu = llegirEnter(missatgeAMostrar, missatgeDError);
            if (enterPositiu < 0) {
                System.out.println(missatgeDError);
                enterPositiu = CODI_ERROR;
            }
        } while (enterPositiu == CODI_ERROR);
        return enterPositiu;
    }

    /**
     *
     * Nom: llegirEnterInterval
     * Descripció: Funció per llegir un enter, mostrant el
     * text rebut (cadenaDemanarNombre) per demanar a l'usuari
     * que entri un enter, comprès en un interval de nombres rebut.
     * I mostrant un text d'Error, també rebut (cadenaError),
     * pel cas que l'usuari entri alguna cosa que no sigui un decimal.
     *
     * @author: Joan Pardo
     * @param: cadenaDemanarNombre
     *                             Text a mostrar per demanar el nombre a l'usuari!
     * @param: cadenaError
     *                             Text a mostrar per quan l'usuari entra un valor
     *                             erroni.
     * @param: limitInferior
     *                             Limit inferior de l'interval de nombres a
     *                             acceptar.
     * @param: limitSuperior
     *                             Limit superior de l'interval de nombres a
     *                             acceptar.
     * @return: decimalPositiu
     *          Decimal positiu entrat per l'usuari i que està comprès
     *          en l'interval de nombres també rebut.
     */
    public static int llegirEnterInterval(String missatgeAMostrar, String missatgeDError, int limitInferior,
                                          int limitSuperior) {
        int enterPositiu = 0;
        do {
            enterPositiu = llegirEnter(missatgeAMostrar, missatgeDError);
            if ((enterPositiu < limitInferior) ||
                    (enterPositiu > limitSuperior)) {
                System.out.println(missatgeDError);
                enterPositiu = CODI_ERROR;
            }
        } while (enterPositiu == CODI_ERROR);
        return enterPositiu;
    }

    /**
     * Nom: llegirDecimalPositiu
     * Descripció: Funció per llegir un decimal positiu, mostrant el
     * text rebut (cadenaDemanarNombre) per demanar a l'usuari
     * que entri un decimal. I mostrant un text d'Error, també
     * rebut (cadenaError), pel cas que l'usuari entri alguna
     * cosa que no sigui un decimal positiu.
     *
     * @author: Joan Pardo
     * @param: cadenaDemanarNombre de tipus cadena de text -> String
     *                             Text a mostrar per demanar el nombre a l'usuari!
     * @param: cadenaError         de tipus cadena de text -> String
     *                             Text a mostrar per quan l'usuari entra un valor
     *                             erroni.
     * @return: decimalPositiu de tipus decimal -> float
     *          Decimal positiu entrat per l'usuari.
     *          Observacions:
     *          Fa servir la nostra funció llegirCadena
     */
    public static float llegirDecimal(String missatgeAMostrar, String missatgeDError) {
        float decimalLlegit = 0;
        // do while per controlar que l'usuari no entri un valor que no sigui un enter
        do {
            System.out.print(missatgeAMostrar);
            try {
                decimalLlegit = Float.parseFloat(llegirCadena(missatgeAMostrar, missatgeDError));
            } catch (Exception e) {
                System.out.println(missatgeDError);
                decimalLlegit = CODI_ERROR;
            } finally {
                teclat = new Scanner(System.in);
            }
        } while (decimalLlegit == CODI_ERROR);
        return decimalLlegit;
    }

    /**
     *
     * Nom: llegirCaracterVector
     * Descripció: Funció per llegir un caracter entre un
     * vector amb diferents opcions , mostrant el text
     * rebut (cadenaDemanarNombre) per demanar a l'usuari
     * que entri un enter que existeixi en el vector rebut.
     * I mostrant un text d'Error, també rebut (cadenaError),
     * pel cas que l'usuari entri alguna cosa que no estigui
     * al vector rebut.
     *
     * @author: Joan Pardo
     * @param: missatgeAMostrar de tipus cadena de text -> String
     *                          Text a mostrar per demanar el caràcter a l'usuari!
     * @param: cadenaError      de tipus cadena de text -> String
     *                          Text a mostrar per quan l'usuari entra un valor
     *                          erroni.
     * @param: caracters        vàlids de tipus vector de caràcters -> char[]
     *                          Limit inferior de l'interval de nombres a acceptar.
     * @param: limitSuperior
     *                          Limit superior de l'interval de nombres a acceptar.
     * @return: decimalPositiu
     *          Decimal positiu entrat per l'usuari i que està comprès
     *          en l'interval de nombres també rebut.
     */
    public static String llegirCaracterOpcions(String missatgeAMostrar, String missatgeDError,
                                               String cadenaDeCaractersValids) {
        String cadenaCodiError = String.valueOf(CODI_ERROR);
        String caracterLlegit;
        String cadenaOpcions = "";
        int mida = cadenaDeCaractersValids.length();
        for (int i = 0; i < mida; i++) {
            cadenaOpcions += cadenaDeCaractersValids.substring(i,i+1);
            if(i != mida -1 ){
                cadenaOpcions += ", ";
            }
        }
        boolean caracterTrobat = false;
        do {
            try {
                System.out.print(missatgeAMostrar + " (" + cadenaOpcions + "): ");
                caracterLlegit = teclat.nextLine().toLowerCase().substring(0,1);


                caracterTrobat = cadenaDeCaractersValids.contains(caracterLlegit);

                // for (int i = 0; i < mida; i++) {
                //     if (caracterLlegit == cadenaDeCaractersValids.substring(i,i+1)) {
                //         caracterTrobat = true;
                //     }
                // }
                if (!caracterTrobat) {
                    System.out.println("El caràcter no es troba entre les opcions vàlides!");
                    caracterLlegit = cadenaCodiError;
                }
            } catch (Exception e) {
                System.out.println(missatgeDError);
                caracterLlegit = cadenaCodiError;
            }
        } while (caracterLlegit == cadenaCodiError);

        return caracterLlegit;

    }
}
