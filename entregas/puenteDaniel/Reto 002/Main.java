import java.util.Scanner;

public class Main extends modificarTerreno{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        char inputUsuario;
        boolean terminar = false;


        String[][] unaMatriz = {
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "}


        };

        int[] posicionCursor = {0, 0};

        int limiteInferior = 0;
        int limiteSuperior = unaMatriz.length - 1;
        int limiteIzquierdo = 0;
        int limiteDerecho = unaMatriz[0].length - 1;

        do {
            imprimeTerreno(unaMatriz, posicionCursor);
            System.out.println("Utilice las teclas WASD para moverse por el terreno");
            System.out.println("Utilice la tecla E para editar la celda actual");
            System.out.println("Utilice la tecla Q para salir del programa");
            System.out.print("Ingrese un valor: ");

            inputUsuario = entrada.nextLine().charAt(0);
            switch (inputUsuario) {
                case 's', 'S':
                    posicionCursor[0] = posicionCursor[0] + 1;
                    break;
                case 'w', 'W':
                    posicionCursor[0] = posicionCursor[0] - 1;
                    break;
                case 'a', 'A':
                    posicionCursor[1] = posicionCursor[1] - 1;
                    break;
                case 'd', 'D':
                    posicionCursor[1] = posicionCursor[1] + 1;
                    break;
                case 'E', 'e':
                    modificar(unaMatriz, posicionCursor);

                    break;
                case 'q', 'Q':
                    terminar = true;
            }

            if (posicionCursor[0] < limiteInferior) {
                posicionCursor[0] = limiteSuperior;
            }
            if (posicionCursor[0] > limiteSuperior) {
                posicionCursor[0] = limiteInferior;
            }
            if (posicionCursor[1] < limiteIzquierdo) {
                posicionCursor[1] = limiteDerecho;
            }
            if (posicionCursor[1] > limiteDerecho) {
                posicionCursor[1] = limiteIzquierdo;
            }


        } while (!terminar);
    }
}