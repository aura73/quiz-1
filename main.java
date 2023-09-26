import java.util.Scanner;
// Primera clase ejecutada
    public class main {
        public static void main(String[] args) {
            // Llamamos la clase Notas
            Notas n = new Notas();

            //Scanner para que el usuario introduzca sus datos
            Scanner sc = new Scanner(System.in);
            //Complejidad temporal: O(N) Complejidad Lineal
            // Accedemos al atributo [] materias y le asignamos valores
            n.materias = new int[5];
            for (int i = 0; i < n.materias.length; i++) {
                System.out.print("Introduce tu nota de materia "+ (i+1) + ": ");
                n.materias[i] = sc.nextInt();
            }

            // Accedemos al atributo nombre y lo guardamos
            System.out.print("Introduce tu nombre: ");
            n.nombre = sc.next();

            // llamamos a los métodos
            System.out.println("--------------------------------------------");
            n.promedio(n.materias);
            n.calificacion(n.promedio(n.materias));
            n.mostrarResultados(n.nombre, n.promedio(n.materias), n.calificacion(n.promedio(n.materias)));

        }
    }
