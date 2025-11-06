
class Candidato {
    private String nombre;
    private String partido;
    private String nacionalidad;

    public Candidato(String nombre, String partido, String nacionalidad) {
        this.nombre = nombre;
        this.partido = partido;
        this.nacionalidad = nacionalidad;
    }

    public void mostrarInformacion() {
        System.out.println("Candidato: " + nombre);
        System.out.println("Partido: " + partido);
        System.out.println("Nacionalidad: " + nacionalidad);
    }

    public String getNombre() {
        return nombre;
    }

    public String getPartido() {
        return partido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
}

//-----------------------------------------------------------

class Votacion {
    private String nombre;
    private int edad;
    private String nacionalidad;

    public Votacion(String nombre, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public boolean mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nacionalidad: " + nacionalidad);

        if (edad >= 18 && nacionalidad.equalsIgnoreCase("colombia")) {
            System.out.println(" Puedes votar");
            return true;
        } else {
            System.out.println(" No puedes votar");
            return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
}

//-----------------------------------------------------------

public class SistemaVotacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("------------------ BIENVENIDO A TU VOTO DE CONFIANZA -----------------------");
        System.out.println("----------------------------------------------------------------------------");

        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Ingresa tu nacionalidad: ");
        String nacionalidad = sc.nextLine();

        System.out.println("----------------------------------------------------------------------------");

        Votacion persona = new Votacion(nombre, edad, nacionalidad);
        boolean puedeVotar = persona.mostrarInfo();

        System.out.println("----------------------------------------------------------------------------");

        if (puedeVotar) {
            
            Candidato A = new Candidato("Javier", "Azul", "Palmira");
            Candidato B = new Candidato("Tamayo", "Rojo", "Cali");
            Candidato C = new Candidato("Sergio", "Verde", "Jamundí");

            System.out.println("Candidatos disponibles:\n");
            System.out.println("A:");
            A.mostrarInformacion();
            System.out.println("\nB:");
            B.mostrarInformacion();
            System.out.println("\nC:");
            C.mostrarInformacion();

            System.out.println("----------------------------------------------------------------------------");

            System.out.print("Por quién votarás (A, B o C): ");
            String voto = sc.nextLine().toLowerCase();

            System.out.println("\nHistorial de voto:");
            System.out.println("[" + nombre + ", " + edad + ", " + nacionalidad + ", " + voto + "]");
            System.out.println("----------------------------------------------------------------------------");

            switch (voto) {
                case "a":
                    System.out.println("Votaste por:");
                    A.mostrarInformacion();
                    break;
                case "b":
                    System.out.println("Votaste por:");
                    B.mostrarInformacion();
                    break;
                case "c":
                    System.out.println("Votaste por:");
                    C.mostrarInformacion();
                    break;
                default:
                    System.out.println("Candidato no disponible. Escribe solo A, B o C.");
            }
        } else {
            System.out.println("No puedes participar en la votación.");
        }

        sc.close();
    }
}