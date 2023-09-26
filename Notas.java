   // Clase Notas
    public class Notas {
        // Atributos
        String nombre;
        int [] materias;

        //Metodos
        //Complejidad temporal: O(N) Complejidad Lineal
        public double promedio(int[] materias){
            //metodo calcula el promedio de los valores ingresados por teclado en main
            double suma = 0;
            for (int i = 0; i < materias.length; i++) {
                suma = suma + materias[i];
            }
            double promedio = suma / materias.length;
            return promedio;
        }

       //Complejidad temporal: O(1) Complejidad constante
        public char calificacion(double promedio){
            // metodo define que calificacion en letras  merece el estudiante
            char letra;
            if (promedio <= 100 && promedio > 90){
                letra = 'A';
            } else if (promedio <= 90 && promedio > 80) {
                letra = 'B';
            } else if (promedio <= 80 && promedio > 70) {
                letra = 'C';
            } else if (promedio <= 70 && promedio > 60) {
                letra = 'D';
            } else if (promedio <= 60 && promedio > 50) {
                letra = 'E';
            } else {
                letra = 'F';
            }
            return letra;
        }

        //Complejidad temporal: O(N) Complejidad lineal
        public void mostrarResultados(String nombre, double promedio, char letra){
            //metodo recorre el array
            System.out.println("Nombre del estudiante: " + nombre);
            promedio(materias);
            for (int i = 0; i < materias.length; i++) {
                System.out.println("Calificación "+ (i+1) + ": " + materias[i]);
            }
            // muestra los totales
            System.out.println("Promedio: " + promedio);
            System.out.println("Calificación: " + letra);
        }
    }
