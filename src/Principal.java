import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        ConsultaConversor consulta = new ConsultaConversor();
        String monedaOrigen = "";
        String monedaCambio = "";

        int opcion=0;
        while (opcion !=7) {
            System.out.println("""
                    ***** Sea bienvenido/a al Conversor de Moneda *****
                   Elija una opción de Cambio:
                    1) Dólar ==> Peso Argentino
                    2) Peso Argentino =>> Dólar
                    3) Dólar =>> Real Brasileño
                    4) Real Brasileño =>> Dólar
                    5) Dólar =>> Peso Colombiano
                    6) Peso Colombiano =>> Dólar
                    7) Salir
                    ***********************************
                    """);

            boolean opcionValida = false;
            while (!opcionValida) {
                try {
                    opcion = lectura.nextInt();
                    lectura.nextLine();
                    if (opcion >= 1 && opcion <= 7) {
                        opcionValida = true;

                    } else {
                        System.out.println("Opción no válida. Debe ser un número entre 1 y 8.");
                    }
                } catch (Exception e) {
                    System.out.println("Entrada no válida. Por favor ingrese un número entre 1 y 8.");
                    lectura.nextLine();
                }
            }
            try {

                if (opcion == 1) {
                    monedaOrigen = "USD";
                    monedaCambio = "ARS";
                }
                if (opcion == 2) {
                    monedaOrigen = "ARS";
                    monedaCambio = "USD";
                }
                if (opcion == 3) {
                    monedaOrigen = "USD";
                    monedaCambio = "BRL";
                }
                if (opcion == 4) {
                    monedaOrigen = "BRL";
                    monedaCambio = "USD";
                }
                if (opcion == 5) {
                    monedaOrigen = "USD";
                    monedaCambio = "COP";
                }
                if (opcion == 6) {
                    monedaOrigen = "COP";
                    monedaCambio = "USD";
                }
                if (opcion == 7 ) {
                    System.out.println("Gracias por usar nuestros servicios.");
                    break;
                }

                System.out.println("Ingrese el monto a convertir: ");
                var lecturaMonto = Double.valueOf(lectura.nextDouble());
                System.out.println("**********************************");
                Conversor conversor = consulta.consultaConversor(monedaOrigen, monedaCambio, lecturaMonto );

                double resultado = conversor.conversion_result();
                DecimalFormat df = new DecimalFormat("0.00");
                String conversionFomat = df.format(resultado);

                System.out.println("---> El valor de "+ lecturaMonto+ " ["+ monedaOrigen + "] corresponde a valor final de ["+ monedaCambio + "] "+ conversionFomat);
                GenerarArchivo generador = new GenerarArchivo();
                generador.guardarJson(conversor);
            } catch (NumberFormatException e) {
                System.out.println("Número no encontrado." + e.getMessage());
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                System.out.println("Finalizando la aplicación.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
