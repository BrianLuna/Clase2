public class Main {
    public static void main(String[] args) {

        int numeroInicio = 2;
        int numeroFin = 12;
        boolean pares = false;

        while(numeroInicio <= numeroFin){
            if(numeroInicio % 2 == 0 && pares){
                System.out.println(numeroInicio);
            }

            if(numeroInicio % 2 == 1 && !pares){
                System.out.println(numeroInicio + 1);
                System.out.println("Chau");
            }

            numeroInicio++;
        }
    }
}
