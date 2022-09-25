package main;
import clases.Cliente;
import clases.Directorio;
import gui.MainFrame;

import java.util.Scanner;
public class Main {
    public static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private static Directorio dir=new Directorio();

    
    public static void main(String[] args) {
        dir.getDIRECTORIO().put("1111", new Cliente("36576", "Luis", "Gonzalez", "Merlo", "sdadsad 457"));
        dir.getDIRECTORIO().put("2222", new Cliente("234324324", "Pedro", "Rodriguez", "Merlo", "sdadsad 457"));
        dir.getDIRECTORIO().put("3333", new Cliente("17687684", "Cristina", "Gonzalez", "Rincon", "PPPP 33"));
        dir.getDIRECTORIO().put("4444", new Cliente("17687684", "Cristina", "Gonzalez", "Rincon", "PPPP 33"));
        
        MainFrame mainF= new MainFrame();
        mainF.setVisible(true);
        mainF.setLocationRelativeTo(null);
    }

    public static Directorio getDir() {
        return dir;
    }
}
