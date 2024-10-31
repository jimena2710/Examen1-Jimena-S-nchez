/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author jimen
 */
public class Examen1 {

//Atributos
    public String nombre = "";
    public int cedula;
    public int codigoFactura;
    public double montoFactura;
    public String sucursal = "";
    public double totalFactura = 0;
    public double totalComision = 0;
    public int puntos = 0;

    public static void main(String[] args) {
// Solicitar datos del vendedor
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del vendedor:");
        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del vendedor:");
        String codigoFactura = JOptionPane.showInputDialog("Ingrese el código del vendedor:");
        String sucursal = JOptionPane.showInputDialog("Ingrese el nombre de la sucursal:");

        Vendedor vendedor = new Vendedor(nombre, cedula, codigoFactura, sucursal);
        //Convertir los meses
        String Mes = JOptionPane.showInputDialog("Digite el número de mes: ");
        int Mess = Integer.parseInt(Mes);
        switch (Mess) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
            default:
                System.out.println("No es un número válido");
        }

        //Datos Factura
        String montoFactura = JOptionPane.showInputDialog("Ingrese el monto de la factura:");
        String productosElectronicos = JOptionPane.showInputDialog("Digite cuantos productos eléctricos son :");
        String productosAutomotrices = JOptionPane.showInputDialog("Digite cuantos productos automotrices son:");
        String productosConstruccion = JOptionPane.showInputDialog("Digite cuantos productos de construcción son:");
        //Parsear los datos
        double montoDeFactura=Double.parseDouble(montoFactura);
        int productosElectronico= Integer.parseInt(productosElectronicos);
        int productoAutomotriz=Integer.parseInt(productosAutomotrices);
        int productoConstruccion=Integer.parseInt(productosConstruccion);
    }
}

