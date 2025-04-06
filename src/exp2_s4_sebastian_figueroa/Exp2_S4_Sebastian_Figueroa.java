package exp2_s4_sebastian_figueroa;
import java.util.Scanner;

public class Exp2_S4_Sebastian_Figueroa {

    public static void main(String[] args) {
        
        boolean salir = false;
        int opcion = 0;
        int edad = 0;
        String ubicacion = "";
        String preguntaEstudiante = "";
        String descuento = "";
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido/a al Teatro Moro! A continuacion se muestra lo que puedes hacer:");
        System.out.println("\n ---OPCIONES---");
        
        while (salir == false) { //bucle para iniciar varias veces el programa
            int precioZonaA = 15000;
            int precioZonaB = 10000;
            int precioZonaC = 5000;
            int total = 0;
            System.out.println("Elige una opcion: ");
            System.out.println("1. Comprar entradas");
            System.out.println("2. Salir del programa");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); //Scanner para que se lleve el enter de antes
            
            switch (opcion) { //Opciones del menú
                case 2: //Salir del programa
                    System.out.println("Adios!");
                    salir = true;
                    break;
                
                case 1: //Compra de entradas
                    System.out.println("Selecciona una ubicacion:");
                    System.out.println("- Zona A - Precio de las entradas = $15000");
                    System.out.println("- Zona B - Precio de las entradas = $10000");
                    System.out.println("- Zona C - Precio de las entradas = $5000");
                    System.out.println("A continuacion, escribe la letra de la zona que deseas: (A/B/C)");
                    
                    while (true) { //Selección de zona
                        ubicacion = scanner.nextLine();
                        if (ubicacion.equalsIgnoreCase("A") || ubicacion.equalsIgnoreCase("B") || ubicacion.equalsIgnoreCase("C")) {
                            break;
                        } else {
                            System.out.println("Zona equivocada, por favor, intentalo nuevamente");
                        } 
                    }
                                                
                    while (true) { //validando edad
                        System.out.println("Ingresa tu edad:"); 
                        edad = scanner.nextInt();
                        scanner.nextLine();
                            
                        if (edad >= 10 && edad <=100) {
                            break;
                        } else {
                            System.out.println("No has ingresado una edad correcta, por favor, intenta de nuevo");
                        }
                    }
                        
                    System.out.println("¿Eres estudiante? Sí/No");
                    preguntaEstudiante = scanner.nextLine();
                                
                    if (edad >= 60) { //Descuento por tercera edad, se prioriza el descuento mayor
                        descuento = "Tercera Edad";
                        System.out.println("Accedes a un descuento de tercera edad");
                        precioZonaA = (int)(precioZonaA - precioZonaA * 0.15);
                        precioZonaB = (int)(precioZonaB - precioZonaB * 0.15);
                        precioZonaC = (int)(precioZonaC - precioZonaC * 0.15);
                        
                    } else if (preguntaEstudiante.equalsIgnoreCase("SI") || preguntaEstudiante.equalsIgnoreCase("SÍ")) {
                        descuento = "Estudiante";
                        System.out.println("Accedes a un descuento para estudiantes");
                        precioZonaA = (int)(precioZonaA - precioZonaA * 0.10);
                        precioZonaB = (int)(precioZonaB - precioZonaB * 0.10);
                        precioZonaC = (int)(precioZonaC - precioZonaC * 0.10);        
                    } else {
                        descuento = "Sin descuento";
                    }
                        
                    switch (ubicacion.toUpperCase()) { //toUpperCase en caso de que usuario haya puesto zona en minúsculas
                        case "A":
                            total = precioZonaA;
                            System.out.println("Ubicación del asiento: Zona A");
                            System.out.println("Precio base de entrada: $15000");
                            System.out.println("Descuento aplicado: " + descuento);
                            System.out.println("Precio final a pagar: $" + total);
                            break;
                            
                        case "B":
                            total = precioZonaB;
                            System.out.println("Ubicación del asiento: Zona B");
                            System.out.println("Precio base de entrada: $10000");
                            System.out.println("Descuento aplicado: " + descuento);
                            System.out.println("Precio final a pagar: $" + total);
                            break;
                            
                        case "C":
                            total = precioZonaC;
                            System.out.println("Ubicación del asiento: Zona C");
                            System.out.println("Precio base de entrada: $5000");
                            System.out.println("Descuento aplicado: " + descuento);
                            System.out.println("Precio final a pagar: $" + total);
                            break;

                        default:
                            break;
                    }

                    break;
                
                default: //Validación input en el menú
                    System.out.println("No has elegido una opción correcta, recuerda, es 1 para comprar entradas y 2 para salir del programa");
        
            }
            
        }
        
        
    }
    
}
     

