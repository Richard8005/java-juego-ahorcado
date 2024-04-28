import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        //Clase scanner que nos permite que el usuario escriba        
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglos:
        char[] lettrasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < lettrasAdivinadas.length; i++) {
            lettrasAdivinadas[i] = '_';
            
        }

        // Estructura de control iterativa (Bucle)

        while (!palabraAdivinada && intentos < intentosMaximos) {
                                                   // Esto se usa cuando tenemos una palabra de chars                         
            System.out.println("Palabra a adivinar: " + String.valueOf(lettrasAdivinadas) + "(" + palabraSecreta.length() + " letras)");

            System.out.println("Introduce una letra, por favor");
            
            // Usamos la clase scanner para pedir una letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            // Estructura de control iterativa (Bucle)
            for (int i = 0; i < palabraSecreta.length(); i++) {
                // Estructura de control condicional
                if(palabraSecreta.charAt(i)== letra){
                    lettrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                    
                }
            }

            if(!letraCorrecta){
                intentos++;
                System.out.println("¡Incorrecto! Te quedan "  + ( intentosMaximos - intentos) + " intentos.");
            }            
            
            if (String.valueOf(lettrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("¡Felicidades, haz adivinado la palabra secreta: " + palabraSecreta);
                
            }
        }

        if(!palabraAdivinada){
            System.out.println("¡Que pena, te haz quedado sin intentos! GAME OVER");

        }
        
        scanner.close();
    }
}
