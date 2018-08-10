package Omega;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int opcionMenuPrincipal = 0;
        int opcionMenuVentas = 0;
        int opcionMenuCompras = 0;
        int numeroVentas = 0;
        int numeroCompras = 0;
        int contVenta1 = 0;
        int contVenta2 = 0;
        int contVenta3 = 0;
        int contVenta4 = 0;
        double cantTotalKilosProd1 = 0.00;
        double cantTotalKilosProd2 = 0.00;
        double cantTotalKilosProd3 = 0.00;
        double cantTotalKilosProd4 = 0.00;
        double cantKilosProd1 = 0.00;
        double cantKilosProd2 = 0.00;
        double cantKilosProd3 = 0.00;
        double cantKilosProd4 = 0.00;
        double valorVentaProd1 = 0.00;
        double valorVentaProd2 = 0.00;
        double valorVentaProd3 = 0.00;
        double valorVentaProd4 = 0.00;
        double subtotalVenta1 = 0.00;
        double subtotalVenta2 = 0.00;
        double subtotalVenta3 = 0.00;
        double subtotalVenta4 = 0.00;
        double totalVenta = 0.00;
        double impuestoVenta = 0.00;
        double descVenta1 = 0.00;
        double descVenta2 = 0.00;
        double descVenta3 = 0.00;
        double descVenta4 = 0.00;
        double valorCompraProd1 = 0.00;
        double valorCompraProd2 = 0.00;
        double valorCompraProd3 = 0.00;
        double valorCompraProd4 = 0.00;
        double subtotalCompras1 = 0.00;
        double subtotalCompras2 = 0.00;
        double subtotalCompras3 = 0.00;
        double subtotalCompras4 = 0.00;
        double cantKilosCompra1 = 0.00;
        double cantKilosCompra2 = 0.00;
        double cantKilosCompra3 = 0.00;
        double cantKilosCompra4 = 0.00;
        double cantTotalKilosCompras1 = 0.00;
        double cantTotalKilosCompras2 = 0.00;
        double cantTotalKilosCompras3 = 0.00;
        double cantTotalKilosCompras4 = 0.00;
        double totalCompras = 0.00;
        double efectivoCaja = 0;
        double efectivoIngresado = 0;
        char tipoCliente;
        char tipoProveedor;
        char opcionNuevaCompra;
        char opcionReportes = 0;
        String ventaMayorGanancia = "";
        String compraMayorGasto = "";
        String productoEstrella = "";

        Scanner read = new Scanner(System.in);
        do {
            System.out.println("||============================||");
            System.out.println("||       SISTEMA DE CAJA      ||");
            System.out.println("||============================||");
            System.out.println("|| Abrir caja         --- [1] ||");
            System.out.println("|| Ventas             --- [2] ||");
            System.out.println("|| Compras            --- [3] ||");
            System.out.println("|| Reportes           --- [4] ||");
            System.out.println("|| Cierre de Caja     --- [5] ||");
            System.out.println("|| Salir de Sistema   --- [6] ||");
            System.out.println("||============================||");
            System.out.println("Elija una opcion: ");
            opcionMenuPrincipal = read.nextInt();

            switch (opcionMenuPrincipal) {
                case 1:
                    System.out.println("Ingrese cantidad de efectivo en LPS: ");
                    efectivoIngresado = read.nextDouble();
                    efectivoCaja += efectivoIngresado;
                    System.out.println("La cantidad de LPS." + efectivoIngresado + " fue ingresado!");
                    System.out.println("El total en actualmente en caja es: LPS." + efectivoCaja + "\n");
                    break;
                case 2:
                    System.out.println("Determine tipo de cliente: ");
                    tipoCliente = read.next().toUpperCase().charAt(0);
                    if (tipoCliente != 'A' && tipoCliente != 'B' && tipoCliente != 'C')
                        System.out.println("Porfavor ingrese los valores aceptados : \'A\', \'B\', \'C\'!");
                    else
                        do {
                            System.out.println("||===========================================||");
                            System.out.println("||                   Ventas                  ||");
                            System.out.println("||===========================================||");
                            System.out.println("|| Azucar             | LPS. 30.00 | --- [1] ||");
                            System.out.println("|| Avena              | LPS. 25.00 | --- [2] ||");
                            System.out.println("|| Trigo              | LPS. 32.00 | --- [3] ||");
                            System.out.println("|| Maiz               | LPS. 20.00 | --- [4] ||");
                            System.out.println("|| Regresar a menu principal       | --- [5] ||");
                            System.out.println("||===========================================||");
                            System.out.println("Elija una opcion: ");
                            opcionMenuVentas = read.nextInt();

                            switch (opcionMenuVentas) {
                                case 1:
                                    if (tipoCliente == 'A') {
                                        System.out.println("Ingrese cantidad en kilos: ");
                                        cantKilosProd1 = read.nextDouble();
                                        if (cantKilosProd1 >= 0) {
                                            cantTotalKilosProd1 += cantKilosProd1;
                                            valorVentaProd1 = cantKilosProd1 * 30.00;
                                            subtotalVenta1 += valorVentaProd1; // incrementa subtotal
                                            efectivoCaja += valorVentaProd1; // incrementa ganancia
                                            if (subtotalVenta1 >= 1000 && subtotalVenta1 < 5000)
                                                descVenta1 = subtotalVenta1 * 0.05;
                                            else if (subtotalVenta1 >= 5000)
                                                descVenta1 = subtotalVenta1 * 0.1;
                                            else if (subtotalVenta1 < 1000)
                                                descVenta1 = 0;
                                            impuestoVenta = (subtotalVenta1 + subtotalVenta2 + subtotalVenta3 + subtotalVenta4) * 0.07;
                                            totalVenta = ((subtotalVenta1 - descVenta1) + (subtotalVenta2 - descVenta2) + (subtotalVenta3 - descVenta3) + (subtotalVenta4 - descVenta4));
                                            efectivoCaja += impuestoVenta; //incrementa ganancia
                                            System.out.println("\t *** Venta exitosa! *** \n");
                                            numeroVentas++;
                                            contVenta1++;
                                            System.out.println("Ingrese [Y] si desea comprar otros productos!");
                                            opcionNuevaCompra = read.next().toUpperCase().charAt(0);
                                                if (opcionNuevaCompra != 'Y') {
                                                    System.out.println("||======================");
                                                    System.out.println("||        Factura");
                                                    System.out.println("||======================");
                                                    System.out.println("|| Azucar LPS.30 || LPS." + subtotalVenta1 + " || " + cantTotalKilosProd1 + "kgs" + " || desc." + descVenta1);
                                                    System.out.println("|| Avena  LPS.25 || LPS." + subtotalVenta2 + " || " + cantTotalKilosProd2 + "kgs" + " || desc." + descVenta2);
                                                    System.out.println("|| Trigo  LPS.32 || LPS." + subtotalVenta3 + " || " + cantTotalKilosProd3 + "kgs" + " || desc." + descVenta3);
                                                    System.out.println("|| Maiz   LPS.20 || LPS." + subtotalVenta4 + " || " + cantTotalKilosProd4 + "kgs" + " || desc." + descVenta4);
                                                    System.out.println("||======================");
                                                    System.out.println("|| Subtotal:     || LPS." + totalVenta + " || Imp." + impuestoVenta);
                                                    System.out.println("|| Total:        || LPS." + (totalVenta + impuestoVenta));
                                                    System.out.println("||======================");
                                                    opcionMenuVentas = 5;
                                                }
                                        } else {
                                            System.out.println("Valor incorrecto fue ingresado!");
                                        }
                                    } else if (tipoCliente == 'B') {
                                        System.out.println("Ingrese cantidad en kilos: ");
                                        cantKilosProd1 = read.nextDouble();
                                        if (cantKilosProd1 >= 0) {
                                            cantTotalKilosProd1 += cantKilosProd1;
                                            valorVentaProd1 = cantKilosProd1 * 30.00;
                                            subtotalVenta1 += valorVentaProd1; // incrementa subtotal
                                            efectivoCaja += valorVentaProd1; // incrementa ganancia
                                            if (subtotalVenta1 >= 1000 && subtotalVenta1 < 5000)
                                                descVenta1 = subtotalVenta1 * 0.05;
                                            else if (subtotalVenta1 >= 5000)
                                                descVenta1 = subtotalVenta1 * 0.1;
                                            else if (subtotalVenta1 < 1000)
                                                descVenta1 = 0;
                                            impuestoVenta = (subtotalVenta1 + subtotalVenta2 + subtotalVenta3 + subtotalVenta4) * 0.07;
                                            totalVenta = ((subtotalVenta1 - descVenta1) + (subtotalVenta2 - descVenta2) + (subtotalVenta3 - descVenta3) + (subtotalVenta4 - descVenta4));
                                            efectivoCaja += impuestoVenta; //incrementa ganancia
                                            System.out.println("\t *** Venta existosa! *** \n");
                                            numeroVentas++;
                                            contVenta1++;
                                            System.out.println("Ingrese [Y] si desea comprar otros productos!");
                                            opcionNuevaCompra = read.next().toUpperCase().charAt(0);
                                            if (opcionNuevaCompra != 'Y') {
                                                System.out.println("||======================");
                                                System.out.println("||        Factura");
                                                System.out.println("||======================");
                                                System.out.println("|| Azucar LPS.30 || LPS." + subtotalVenta1 + " || " + cantTotalKilosProd1 + "kgs" + " || desc." + descVenta1);
                                                System.out.println("|| Avena  LPS.25 || LPS." + subtotalVenta2 + " || " + cantTotalKilosProd2 + "kgs" + " || desc." + descVenta2);
                                                System.out.println("|| Trigo  LPS.32 || LPS." + subtotalVenta3 + " || " + cantTotalKilosProd3 + "kgs" + " || desc." + descVenta3);
                                                System.out.println("|| Maiz   LPS.20 || LPS." + subtotalVenta4 + " || " + cantTotalKilosProd4 + "kgs" + " || desc." + descVenta4);
                                                System.out.println("||======================");
                                                System.out.println("|| Subtotal:     || LPS." + totalVenta + " || Imp." + impuestoVenta);
                                                System.out.println("|| Total:        || LPS." + (totalVenta + impuestoVenta));
                                                System.out.println("||======================");
                                                opcionMenuVentas = 5;
                                            }
                                        } else {
                                            System.out.println("Valor incorrecto fue ingresado!");
                                        }
                                    } else if (tipoCliente == 'C') {
                                        System.out.println("Cliente no puede adquirir este producto!");
                                    }
                                    break;
                                case 2:
                                    if (tipoCliente == 'A') {
                                        System.out.println("Ingrese cantidad en kilos: ");
                                        cantKilosProd2 = read.nextDouble();
                                        if (cantKilosProd2 >= 0) {
                                            cantTotalKilosProd2 += cantKilosProd2;
                                            valorVentaProd2 = cantKilosProd2 * 25.00;
                                            subtotalVenta2 += valorVentaProd2; // incrementa subtotal
                                            efectivoCaja += valorVentaProd2; // incrementa ganancia
                                            if (subtotalVenta2 >= 1000 && subtotalVenta2 < 5000)
                                                descVenta2 = subtotalVenta2 * 0.05;
                                            else if (subtotalVenta2 >= 5000)
                                                descVenta2 = subtotalVenta2 * 0.1;
                                            else if (subtotalVenta2 < 1000)
                                                descVenta2 = 0;
                                            impuestoVenta = (subtotalVenta1 + subtotalVenta2 + subtotalVenta3 + subtotalVenta4) * 0.07;
                                            totalVenta = ((subtotalVenta1 - descVenta1) + (subtotalVenta2 - descVenta2) + (subtotalVenta3 - descVenta3) + (subtotalVenta4 - descVenta4));
                                            efectivoCaja += impuestoVenta; //incrementa ganancia
                                            System.out.println("\t *** Venta existosa! *** \n");
                                            numeroVentas++;
                                            contVenta2++;
                                            System.out.println("Ingrese [Y] si desea comprar otros productos!");
                                            opcionNuevaCompra = read.next().toUpperCase().charAt(0);
                                            if (opcionNuevaCompra != 'Y') {
                                                System.out.println("||======================");
                                                System.out.println("||        Factura");
                                                System.out.println("||======================");
                                                System.out.println("|| Azucar LPS.30 || LPS." + subtotalVenta1 + " || " + cantTotalKilosProd1 + "kgs" + " || desc." + descVenta1);
                                                System.out.println("|| Avena  LPS.25 || LPS." + subtotalVenta2 + " || " + cantTotalKilosProd2 + "kgs" + " || desc." + descVenta2);
                                                System.out.println("|| Trigo  LPS.32 || LPS." + subtotalVenta3 + " || " + cantTotalKilosProd3 + "kgs" + " || desc." + descVenta3);
                                                System.out.println("|| Maiz   LPS.20 || LPS." + subtotalVenta4 + " || " + cantTotalKilosProd4 + "kgs" + " || desc." + descVenta4);
                                                System.out.println("||======================");
                                                System.out.println("|| Subtotal:     || LPS." + totalVenta + " || Imp." + impuestoVenta);
                                                System.out.println("|| Total:        || LPS." + (totalVenta + impuestoVenta));
                                                System.out.println("||======================");
                                                opcionMenuVentas = 5;
                                            }
                                        } else {
                                            System.out.println("Valor incorrecto fue ingresado!");
                                        }
                                    } else if (tipoCliente == 'B') {
                                        System.out.println("Ingrese cantidad en kilos: ");
                                        cantKilosProd2 = read.nextDouble();
                                        if (cantKilosProd2 >= 0) {
                                            cantTotalKilosProd2 += cantKilosProd2;
                                            valorVentaProd2 = cantKilosProd2 * 25.00;
                                            subtotalVenta2 += valorVentaProd2; // incrementa subtotal
                                            efectivoCaja += valorVentaProd2; // incrementa ganancia
                                            if (subtotalVenta2 >= 1000 && subtotalVenta2 < 5000)
                                                descVenta2 = subtotalVenta2 * 0.05;
                                            else if (subtotalVenta2 >= 5000)
                                                descVenta2 = subtotalVenta2 * 0.1;
                                            else if (subtotalVenta2 < 1000)
                                                descVenta2 = 0;
                                            impuestoVenta = (subtotalVenta1 + subtotalVenta2 + subtotalVenta3 + subtotalVenta4) * 0.07;
                                            totalVenta = ((subtotalVenta1 - descVenta1) + (subtotalVenta2 - descVenta2) + (subtotalVenta3 - descVenta3) + (subtotalVenta4 - descVenta4));
                                            efectivoCaja += impuestoVenta; //incrementa ganancia
                                            System.out.println("\t *** Venta existosa! *** \n");
                                            numeroVentas++;
                                            contVenta2++;
                                            System.out.println("Ingrese [Y] si desea comprar otros productos!");
                                            opcionNuevaCompra = read.next().toUpperCase().charAt(0);
                                            if (opcionNuevaCompra != 'Y') {
                                                System.out.println("||======================");
                                                System.out.println("||        Factura");
                                                System.out.println("||======================");
                                                System.out.println("|| Azucar LPS.30 || LPS." + subtotalVenta1 + " || " + cantTotalKilosProd1 + "kgs" + " || desc." + descVenta1);
                                                System.out.println("|| Avena  LPS.25 || LPS." + subtotalVenta2 + " || " + cantTotalKilosProd2 + "kgs" + " || desc." + descVenta2);
                                                System.out.println("|| Trigo  LPS.32 || LPS." + subtotalVenta3 + " || " + cantTotalKilosProd3 + "kgs" + " || desc." + descVenta3);
                                                System.out.println("|| Maiz   LPS.20 || LPS." + subtotalVenta4 + " || " + cantTotalKilosProd4 + "kgs" + " || desc." + descVenta4);
                                                System.out.println("||======================");
                                                System.out.println("|| Subtotal:     || LPS." + totalVenta + " || Imp." + impuestoVenta);
                                                System.out.println("|| Total:        || LPS." + (totalVenta + impuestoVenta));
                                                System.out.println("||======================");
                                                opcionMenuVentas = 5;
                                            }
                                        } else {
                                            System.out.println("Valor incorrecto fue ingresado!");
                                        }
                                    } else if (tipoCliente == 'C') {
                                        System.out.println("Cliente no puede adquirir este producto!");
                                    }
                                    break;
                                case 3:
                                    if (tipoCliente == 'A') {
                                        System.out.println("Ingrese cantidad en kilos: ");
                                        cantKilosProd3 = read.nextDouble();
                                        if (cantKilosProd3 >= 0) {
                                            cantTotalKilosProd3 += cantKilosProd3;
                                            valorVentaProd3 = cantKilosProd3 * 32.00;
                                            subtotalVenta3 += valorVentaProd3; // incrementa subtotal
                                            efectivoCaja += valorVentaProd3; // incrementa ganancia
                                            if (subtotalVenta3 >= 1000 && subtotalVenta3 < 5000)
                                                descVenta3 = subtotalVenta3 * 0.05;
                                            else if (subtotalVenta3 >= 5000)
                                                descVenta3 = subtotalVenta3 * 0.1;
                                            else if (subtotalVenta3 < 1000)
                                                descVenta3 = 0;
                                            impuestoVenta = (subtotalVenta1 + subtotalVenta2 + subtotalVenta3 + subtotalVenta4) * 0.07;
                                            totalVenta = ((subtotalVenta1 - descVenta1) + (subtotalVenta2 - descVenta2) + (subtotalVenta3 - descVenta3) + (subtotalVenta4 - descVenta4));
                                            efectivoCaja += impuestoVenta; //incrementa ganancia
                                            System.out.println("\t *** Venta existosa! *** \n");
                                            numeroVentas++;
                                            contVenta3++;
                                            System.out.println("Ingrese [Y] si desea comprar otros productos!");
                                            opcionNuevaCompra = read.next().toUpperCase().charAt(0);
                                            if (opcionNuevaCompra != 'Y') {
                                                System.out.println("||======================");
                                                System.out.println("||        Factura");
                                                System.out.println("||======================");
                                                System.out.println("|| Azucar LPS.30 || LPS." + subtotalVenta1 + " || " + cantTotalKilosProd1 + "kgs" + " || desc." + descVenta1);
                                                System.out.println("|| Avena  LPS.25 || LPS." + subtotalVenta2 + " || " + cantTotalKilosProd2 + "kgs" + " || desc." + descVenta2);
                                                System.out.println("|| Trigo  LPS.32 || LPS." + subtotalVenta3 + " || " + cantTotalKilosProd3 + "kgs" + " || desc." + descVenta3);
                                                System.out.println("|| Maiz   LPS.20 || LPS." + subtotalVenta4 + " || " + cantTotalKilosProd4 + "kgs" + " || desc." + descVenta4);
                                                System.out.println("||======================");
                                                System.out.println("|| Subtotal:     || LPS." + totalVenta + " || Imp." + impuestoVenta);
                                                System.out.println("|| Total:        || LPS." + (totalVenta + impuestoVenta));
                                                System.out.println("||======================");
                                                opcionMenuVentas = 5;
                                            }
                                        } else {
                                            System.out.println("Valor incorrecto fue ingresado!");
                                        }
                                    } else if (tipoCliente == 'B') {
                                        System.out.println("Ingrese cantidad en kilos: ");
                                        cantKilosProd3 = read.nextDouble();
                                        if (cantKilosProd3 >= 0) {
                                            cantTotalKilosProd3 += cantKilosProd3;
                                            valorVentaProd3 = cantKilosProd3 * 32.00;
                                            subtotalVenta3 += valorVentaProd3; // incrementa subtotal
                                            efectivoCaja += valorVentaProd3; // incrementa ganancia
                                            if (subtotalVenta3 >= 1000 && subtotalVenta3 < 5000)
                                                descVenta3 = subtotalVenta3 * 0.05;
                                            else if (subtotalVenta3 >= 5000)
                                                descVenta3 = subtotalVenta3 * 0.1;
                                            else if (subtotalVenta3 < 1000)
                                                descVenta3 = 0;
                                            impuestoVenta = (subtotalVenta1 + subtotalVenta2 + subtotalVenta3 + subtotalVenta4) * 0.07;
                                            totalVenta = ((subtotalVenta1 - descVenta1) + (subtotalVenta2 - descVenta2) + (subtotalVenta3 - descVenta3) + (subtotalVenta4 - descVenta4));
                                            efectivoCaja += impuestoVenta; //incrementa ganancia
                                            System.out.println("\t *** Venta existosa! *** \n");
                                            numeroVentas++;
                                            contVenta3++;
                                            System.out.println("Ingrese [Y] si desea comprar otros productos!");
                                            opcionNuevaCompra = read.next().toUpperCase().charAt(0);
                                            if (opcionNuevaCompra != 'Y') {
                                                System.out.println("||======================");
                                                System.out.println("||        Factura");
                                                System.out.println("||======================");
                                                System.out.println("|| Azucar LPS.30 || LPS." + subtotalVenta1 + " || " + cantTotalKilosProd1 + "kgs" + " || desc." + descVenta1);
                                                System.out.println("|| Avena  LPS.25 || LPS." + subtotalVenta2 + " || " + cantTotalKilosProd2 + "kgs" + " || desc." + descVenta2);
                                                System.out.println("|| Trigo  LPS.32 || LPS." + subtotalVenta3 + " || " + cantTotalKilosProd3 + "kgs" + " || desc." + descVenta3);
                                                System.out.println("|| Maiz   LPS.20 || LPS." + subtotalVenta4 + " || " + cantTotalKilosProd4 + "kgs" + " || desc." + descVenta4);
                                                System.out.println("||======================");
                                                System.out.println("|| Subtotal:     || LPS." + totalVenta + " || Imp." + impuestoVenta);
                                                System.out.println("|| Total:        || LPS." + (totalVenta + impuestoVenta));
                                                System.out.println("||======================");
                                                opcionMenuVentas = 5;
                                            }
                                        } else {
                                            System.out.println("Valor incorrecto fue ingresado!");
                                        }
                                    } else if (tipoCliente == 'C') {
                                        System.out.println("Cliente no puede adquirir este producto!");
                                    }
                                    break;
                                case 4:
                                    if (tipoCliente == 'A') {
                                        System.out.println("Ingrese cantidad en kilos: ");
                                        cantKilosProd4 = read.nextDouble();
                                        if (cantKilosProd4 >= 0) {
                                            cantTotalKilosProd4 += cantKilosProd4;
                                            valorVentaProd4 = cantKilosProd4 * 20.00;
                                            subtotalVenta4 += valorVentaProd4; // incrementa subtotal
                                            efectivoCaja += valorVentaProd4; // incrementa ganancia
                                            if (subtotalVenta4 >= 1000 && subtotalVenta4 < 5000)
                                                descVenta4 = subtotalVenta4 * 0.05;
                                            else if (subtotalVenta4 >= 5000)
                                                descVenta4 = subtotalVenta4 * 0.1;
                                            else if (subtotalVenta4 < 1000)
                                                descVenta4 = 0;
                                            impuestoVenta = (subtotalVenta1 + subtotalVenta2 + subtotalVenta3 + subtotalVenta4) * 0.07;
                                            totalVenta = ((subtotalVenta1 - descVenta1) + (subtotalVenta2 - descVenta2) + (subtotalVenta3 - descVenta3) + (subtotalVenta4 - descVenta4));
                                            efectivoCaja += impuestoVenta; //incrementa ganancia
                                            System.out.println("\t *** Venta existosa! *** \n");
                                            numeroVentas++;
                                            contVenta4++;
                                            System.out.println("Ingrese [Y] si desea comprar otros productos!");
                                            opcionNuevaCompra = read.next().toUpperCase().charAt(0);
                                            if (opcionNuevaCompra != 'Y') {
                                                System.out.println("||======================");
                                                System.out.println("||        Factura");
                                                System.out.println("||======================");
                                                System.out.println("|| Azucar LPS.30 || LPS." + subtotalVenta1 + " || " + cantTotalKilosProd1 + "kgs" + " || desc." + descVenta1);
                                                System.out.println("|| Avena  LPS.25 || LPS." + subtotalVenta2 + " || " + cantTotalKilosProd2 + "kgs" + " || desc." + descVenta2);
                                                System.out.println("|| Trigo  LPS.32 || LPS." + subtotalVenta3 + " || " + cantTotalKilosProd3 + "kgs" + " || desc." + descVenta3);
                                                System.out.println("|| Maiz   LPS.20 || LPS." + subtotalVenta4 + " || " + cantTotalKilosProd4 + "kgs" + " || desc." + descVenta4);
                                                System.out.println("||======================");
                                                System.out.println("|| Subtotal:     || LPS." + totalVenta + " || Imp." + impuestoVenta);
                                                System.out.println("|| Total:        || LPS." + (totalVenta + impuestoVenta));
                                                System.out.println("||======================");
                                                opcionMenuVentas = 5;
                                            }
                                        } else {
                                            System.out.println("Valor incorrecto fue ingresado!");
                                        }
                                    } else if (tipoCliente == 'B') {
                                        System.out.println("Cliente no puede adquirir este producto!");

                                    } else if (tipoCliente == 'C') {
                                        System.out.println("Ingrese cantidad en kilos: ");
                                        cantKilosProd4 = read.nextDouble();
                                        if (cantKilosProd4 >= 0) {
                                            cantTotalKilosProd4 += cantKilosProd4;
                                            valorVentaProd4 = cantKilosProd4 * 20.00;
                                            subtotalVenta4 += valorVentaProd4; // incrementa subtotal
                                            efectivoCaja += valorVentaProd4; // incrementa ganancia
                                            if (subtotalVenta4 >= 1000 && subtotalVenta4 < 5000)
                                                descVenta4 = subtotalVenta4 * 0.05;
                                            else if (subtotalVenta4 >= 5000)
                                                descVenta4 = subtotalVenta4 * 0.1;
                                            else if (subtotalVenta4 < 1000)
                                                descVenta4 = 0;
                                            impuestoVenta = (subtotalVenta1 + subtotalVenta2 + subtotalVenta3 + subtotalVenta4) * 0.07;
                                            totalVenta = ((subtotalVenta1 - descVenta1) + (subtotalVenta2 - descVenta2) + (subtotalVenta3 - descVenta3) + (subtotalVenta4 - descVenta4));
                                            efectivoCaja += impuestoVenta; //incrementa ganancia
                                            System.out.println("\t *** Venta existosa! *** \n");
                                            numeroVentas++;
                                            contVenta4++;
                                            System.out.println("Ingrese [Y] si desea comprar otros productos!");
                                            opcionNuevaCompra = read.next().toUpperCase().charAt(0);
                                            if (opcionNuevaCompra != 'Y') {
                                                System.out.println("||======================");
                                                System.out.println("||        Factura");
                                                System.out.println("||======================");
                                                System.out.println("|| Azucar LPS.30 || LPS." + subtotalVenta1 + " || " + cantTotalKilosProd1 + "kgs" + " || desc." + descVenta1);
                                                System.out.println("|| Avena  LPS.25 || LPS." + subtotalVenta2 + " || " + cantTotalKilosProd2 + "kgs" + " || desc." + descVenta2);
                                                System.out.println("|| Trigo  LPS.32 || LPS." + subtotalVenta3 + " || " + cantTotalKilosProd3 + "kgs" + " || desc." + descVenta3);
                                                System.out.println("|| Maiz   LPS.20 || LPS." + subtotalVenta4 + " || " + cantTotalKilosProd4 + "kgs" + " || desc." + descVenta4);
                                                System.out.println("||======================");
                                                System.out.println("|| Subtotal:     || LPS." + totalVenta + " || Imp." + impuestoVenta);
                                                System.out.println("|| Total:        || LPS." + (totalVenta + impuestoVenta));
                                                System.out.println("||======================");
                                                opcionMenuVentas = 5;
                                            }
                                        } else
                                            System.out.println("Valor incorrecto fue ingresado!");
                                        }
                                        break;
                                }
                        }while (opcionMenuVentas != 5);
                case 3:
                    System.out.println("Determine tipo de cliente: ");
                    tipoProveedor = read.next().toUpperCase().charAt(0);
                    if (tipoProveedor != 'A' && tipoProveedor != 'B' && tipoProveedor != 'C')
                        System.out.println("Porfavor ingrese los valores aceptados : \'A\', \'B\', \'C\'!");
                    else
                        do {
                            System.out.println("||===================================================||");
                            System.out.println("||                      Compras                      ||");
                            System.out.println("||===================================================||");
                            System.out.println("|| Azucar             | LPS. 25.00         | --- [1] ||");
                            System.out.println("|| Avena              | LPS. 20.00 / 22.00 | --- [2] ||");
                            System.out.println("|| Trigo              | LPS. 30.00         | --- [3] ||");
                            System.out.println("|| Maiz               | LPS. 18.00         | --- [4] ||");
                            System.out.println("|| Regresar a menu principal               | --- [5] ||");
                            System.out.println("||===================================================||");
                            System.out.println("Elija una opcion: ");
                            opcionMenuCompras = read.nextInt();

                            switch (opcionMenuCompras)
                            {
                                case 1:
                                    if (tipoProveedor == 'A') {
                                        System.out.println("Ingrese cantidad en kilos: ");
                                        cantKilosCompra1 = read.nextDouble();
                                        if (cantKilosCompra1 >= 0) {
                                            cantTotalKilosCompras1 += cantKilosCompra1;
                                            valorCompraProd1 = cantKilosCompra1 * 25.00;
                                            subtotalCompras1 += valorCompraProd1; // incrementa subtotal
                                            if (efectivoCaja < subtotalCompras1) {
                                                System.out.println("No se puede pagar la compra!");
                                            } else {
                                                efectivoCaja -= valorCompraProd1; // decrementa ganancia
                                                totalCompras = (subtotalCompras1 + subtotalCompras2 + subtotalCompras3 + subtotalCompras4);
                                                System.out.println("\t *** Compra existosa! *** \n");
                                                numeroCompras++;
                                                System.out.println("||===========================");
                                                System.out.println("||           Factura");
                                                System.out.println("||===========================");
                                                System.out.println("|| Azucar LPS.25      || LPS." + subtotalCompras1 + " || " + cantTotalKilosCompras1 + "kgs");
                                                System.out.println("|| Avena  LPS.20 / 22 || LPS." + subtotalCompras2 + " || " + cantTotalKilosCompras2 + "kgs");
                                                System.out.println("|| Trigo  LPS.32      || LPS." + subtotalCompras3 + " || " + cantTotalKilosCompras3 + "kgs");
                                                System.out.println("|| Maiz   LPS.20      || LPS." + subtotalCompras4 + " || " + cantTotalKilosCompras4 + "kgs");
                                                System.out.println("||===========================");
                                                System.out.println("|| Total:             || LPS." + totalCompras);
                                                System.out.println("||===========================");
                                                opcionMenuCompras = 5;
                                            }
                                        } else {
                                            System.out.println("Valor incorrecto fue ingresado!");
                                        }
                                    }else if (tipoProveedor == 'B') {
                                        System.out.println("Vendedor no vende dicho producto!");
                                    }else if (tipoProveedor == 'C') {
                                        System.out.println("Vendedor no vende dicho producto!");
                                    }
                                    break;
                                case 2:
                                    if (tipoProveedor == 'A') {
                                        System.out.println("Vendedor no vende dicho producto!");
                                    }else if (tipoProveedor == 'B') {
                                        System.out.println("Ingrese cantidad en kilos: ");
                                        cantKilosCompra1 = read.nextDouble();
                                        if (cantKilosCompra1 >= 0) {
                                            cantTotalKilosCompras1 += cantKilosCompra1;
                                            valorCompraProd1 = cantKilosCompra1 * 20.00;
                                            subtotalCompras1 += valorCompraProd1; // incrementa subtotal
                                            if (efectivoCaja < subtotalCompras1) {
                                                System.out.println("No se puede pagar la compra!");
                                            } else {
                                                efectivoCaja -= valorCompraProd1; // decrementa ganancia
                                                totalCompras = (subtotalCompras1 + subtotalCompras2 + subtotalCompras3 + subtotalCompras4);
                                                System.out.println("\t *** Compra existosa! *** \n");
                                                numeroCompras++;
                                                System.out.println("||===========================");
                                                System.out.println("||           Factura");
                                                System.out.println("||===========================");
                                                System.out.println("|| Azucar LPS.25      || LPS." + subtotalCompras1 + " || " + cantTotalKilosCompras1 + "kgs");
                                                System.out.println("|| Avena  LPS.20 / 22 || LPS." + subtotalCompras2 + " || " + cantTotalKilosCompras2 + "kgs");
                                                System.out.println("|| Trigo  LPS.32      || LPS." + subtotalCompras3 + " || " + cantTotalKilosCompras3 + "kgs");
                                                System.out.println("|| Maiz   LPS.20      || LPS." + subtotalCompras4 + " || " + cantTotalKilosCompras4 + "kgs");
                                                System.out.println("||===========================");
                                                System.out.println("|| Total:             || LPS." + totalCompras);
                                                System.out.println("||===========================");
                                                opcionMenuCompras = 5;
                                            }
                                        } else {
                                            System.out.println("Valor incorrecto fue ingresado!");
                                        }
                                    }else if (tipoProveedor == 'C') {
                                        System.out.println("Ingrese cantidad en kilos: ");
                                        cantKilosCompra1 = read.nextDouble();
                                        if (cantKilosCompra1 >= 0) {
                                            cantTotalKilosCompras1 += cantKilosCompra1;
                                            valorCompraProd1 = cantKilosCompra1 * 22.00;
                                            subtotalCompras1 += valorCompraProd1; // incrementa subtotal
                                            if (efectivoCaja < subtotalCompras1) {
                                                System.out.println("No se puede pagar la compra!");
                                            } else {
                                                efectivoCaja -= valorCompraProd1; // decrementa ganancia
                                                totalCompras = (subtotalCompras1 + subtotalCompras2 + subtotalCompras3 + subtotalCompras4);
                                                System.out.println("\t *** Compra existosa! *** \n");
                                                numeroCompras++;
                                                System.out.println("||===========================");
                                                System.out.println("||           Factura");
                                                System.out.println("||===========================");
                                                System.out.println("|| Azucar LPS.25      || LPS." + subtotalCompras1 + " || " + cantTotalKilosCompras1 + "kgs");
                                                System.out.println("|| Avena  LPS.20 / 22 || LPS." + subtotalCompras2 + " || " + cantTotalKilosCompras2 + "kgs");
                                                System.out.println("|| Trigo  LPS.32      || LPS." + subtotalCompras3 + " || " + cantTotalKilosCompras3 + "kgs");
                                                System.out.println("|| Maiz   LPS.20      || LPS." + subtotalCompras4 + " || " + cantTotalKilosCompras4 + "kgs");
                                                System.out.println("||===========================");
                                                System.out.println("|| Total:             || LPS." + totalCompras);
                                                System.out.println("||===========================");
                                                opcionMenuCompras = 5;
                                            }
                                        } else {
                                            System.out.println("Valor incorrecto fue ingresado!");
                                        }
                                    }
                                    break;
                                case 3:
                                    if (tipoProveedor == 'A') {
                                        System.out.println("Vendedor no vende dicho producto!");
                                    }else if (tipoProveedor == 'B') {
                                        System.out.println("Ingrese cantidad en kilos: ");
                                        cantKilosCompra1 = read.nextDouble();
                                        if (cantKilosCompra1 >= 0) {
                                            cantTotalKilosCompras1 += cantKilosCompra1;
                                            valorCompraProd1 = cantKilosCompra1 * 32.00;
                                            subtotalCompras1 += valorCompraProd1; // incrementa subtotal
                                            if (efectivoCaja < subtotalCompras1) {
                                                System.out.println("No se puede pagar la compra!");
                                            } else {
                                                efectivoCaja -= valorCompraProd1; // decrementa ganancia
                                                totalCompras = (subtotalCompras1 + subtotalCompras2 + subtotalCompras3 + subtotalCompras4);
                                                System.out.println("\t *** Compra existosa! *** \n");
                                                numeroCompras++;
                                                System.out.println("||===========================");
                                                System.out.println("||           Factura");
                                                System.out.println("||===========================");
                                                System.out.println("|| Azucar LPS.25      || LPS." + subtotalCompras1 + " || " + cantTotalKilosCompras1 + "kgs");
                                                System.out.println("|| Avena  LPS.20 / 22 || LPS." + subtotalCompras2 + " || " + cantTotalKilosCompras2 + "kgs");
                                                System.out.println("|| Trigo  LPS.32      || LPS." + subtotalCompras3 + " || " + cantTotalKilosCompras3 + "kgs");
                                                System.out.println("|| Maiz   LPS.20      || LPS." + subtotalCompras4 + " || " + cantTotalKilosCompras4 + "kgs");
                                                System.out.println("||===========================");
                                                System.out.println("|| Total:             || LPS." + totalCompras);
                                                System.out.println("||===========================");
                                                opcionMenuCompras = 5;
                                            }
                                        } else {
                                            System.out.println("Valor incorrecto fue ingresado!");
                                        }
                                    }else if (tipoProveedor == 'C') {
                                        System.out.println("Vendedor no vende dicho producto!");
                                    }
                                    break;
                                case 4:
                                    if (tipoProveedor == 'A') {
                                        System.out.println("Ingrese cantidad en kilos: ");
                                        cantKilosCompra1 = read.nextDouble();
                                        if (cantKilosCompra1 >= 0) {
                                            cantTotalKilosCompras1 += cantKilosCompra1;
                                            valorCompraProd1 = cantKilosCompra1 * 20.00;
                                            subtotalCompras1 += valorCompraProd1; // incrementa subtotal
                                            if (efectivoCaja < subtotalCompras1) {
                                                System.out.println("No se puede pagar la compra!");
                                            } else {
                                                efectivoCaja -= valorCompraProd1; // decrementa ganancia
                                                totalCompras = (subtotalCompras1 + subtotalCompras2 + subtotalCompras3 + subtotalCompras4);
                                                System.out.println("\t *** Compra existosa! *** \n");
                                                numeroCompras++;
                                                System.out.println("||===========================");
                                                System.out.println("||           Factura");
                                                System.out.println("||===========================");
                                                System.out.println("|| Azucar LPS.25      || LPS." + subtotalCompras1 + " || " + cantTotalKilosCompras1 + "kgs");
                                                System.out.println("|| Avena  LPS.20 / 22 || LPS." + subtotalCompras2 + " || " + cantTotalKilosCompras2 + "kgs");
                                                System.out.println("|| Trigo  LPS.32      || LPS." + subtotalCompras3 + " || " + cantTotalKilosCompras3 + "kgs");
                                                System.out.println("|| Maiz   LPS.20      || LPS." + subtotalCompras4 + " || " + cantTotalKilosCompras4 + "kgs");
                                                System.out.println("||===========================");
                                                System.out.println("|| Total:             || LPS." + totalCompras);
                                                System.out.println("||===========================");
                                                opcionMenuCompras = 5;
                                            }
                                        } else {
                                            System.out.println("Valor incorrecto fue ingresado!");
                                        }
                                    }else if (tipoProveedor == 'B') {
                                        System.out.println("Vendedor no vende dicho producto!");
                                    }else if (tipoProveedor == 'C') {
                                        System.out.println("Vendedor no vende dicho producto!");
                                    }
                                    break;
                            }
                        }while (opcionMenuCompras != 5);
                    break;
                case 4:
                    if (subtotalVenta1 > subtotalVenta2 && subtotalVenta1 > subtotalVenta3 && subtotalVenta1 > subtotalVenta4){
                        ventaMayorGanancia = "Azucar";
                    }else if (subtotalVenta2 > subtotalVenta1 && subtotalVenta2 > subtotalVenta3 && subtotalVenta2 > subtotalVenta4){
                        ventaMayorGanancia = "Avena";
                    }else if (subtotalVenta3 > subtotalVenta1 && subtotalVenta3 > subtotalVenta2 && subtotalVenta3 > subtotalVenta4){
                        ventaMayorGanancia = "Trigo";
                    }else if (subtotalVenta4 > subtotalVenta1 && subtotalVenta4 > subtotalVenta2 && subtotalVenta4 > subtotalVenta3){
                        ventaMayorGanancia = "Maiz";
                    }

                    if (subtotalCompras1 > subtotalCompras2 && subtotalCompras1 > subtotalCompras3 && subtotalCompras1 > subtotalCompras4){
                        compraMayorGasto = "Azucar";
                    }else if (subtotalCompras2 > subtotalCompras1 && subtotalCompras2 > subtotalCompras3 && subtotalCompras2 > subtotalCompras4){
                        compraMayorGasto = "Avena";
                    }else if (subtotalCompras3 > subtotalCompras1 && subtotalCompras3 > subtotalCompras2 && subtotalCompras3 > subtotalCompras4){
                        compraMayorGasto = "Trigo";
                    }else if (subtotalCompras4 > subtotalCompras1 && subtotalCompras4 > subtotalCompras2 && subtotalCompras4 > subtotalCompras3){
                        compraMayorGasto = "Maiz";
                    }

                    if (contVenta1 > contVenta2 && contVenta1 > contVenta3 && contVenta1 > contVenta4){
                        productoEstrella = "Azucar";
                    }else if (contVenta2 > contVenta1 && contVenta2 > contVenta3 && contVenta2 > contVenta4){
                        productoEstrella = "Avena";
                    }else if (contVenta3 > contVenta1 && contVenta3 > contVenta2 && contVenta3 > contVenta4){
                        productoEstrella = "Trigo";
                    }else if (contVenta4 > contVenta1 && contVenta4 > contVenta2 && contVenta4 > contVenta3){
                        productoEstrella = "Maiz";
                    }
                    do {
                        System.out.println("||========================");
                        System.out.println("||       Reportes         ");
                        System.out.println("||========================");
                        System.out.println("|| La cantidad actual en caja: " + efectivoCaja);
                        System.out.println("|| El numero de ventas realizadas fue de: " + numeroVentas);
                        System.out.println("|| El numero de compras realizidas fue de: " + numeroCompras);
                        System.out.println("|| El valor medio de compra y venta es de: ");
                        System.out.println("|| La venta con mayor ganancia fue: " + ventaMayorGanancia);
                        System.out.println("|| La compra con mayor gasto fue: " + compraMayorGasto);
                        System.out.println("|| Producto estrella del dia: " + productoEstrella);
                        System.out.println("||========================");
                        System.out.println("|| Ingrese [X] para regresar al menu principal");
                        opcionReportes = read.next().toUpperCase().charAt(0);
                    }while (opcionReportes != 'X');
                    break;
                case 5:
                    break;
            }
        }while (opcionMenuPrincipal != 6);
    }
}