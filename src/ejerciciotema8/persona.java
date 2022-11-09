/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciotema8;

/**
 *
 * @author Augusto
 */
public class persona {
    public static void main(String[] args) {
        EjercicioTema8 objeto1 = new EjercicioTema8();
        
        objeto1.setEdad(35);
        System.out.println("La edad es "+ objeto1.getEdad());
        
        objeto1.setNombre("Augusto Lopez");
        System.out.println("El nombre del estudiante es " + objeto1.getNombre());
        
        objeto1.setPhone(04123711331);
        System.out.println("the phone number is " + objeto1.getPhone());
    }
    
}
