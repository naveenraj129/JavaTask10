package org.example;

public class Main {
    public static void main(String[] args) {
        Tea[] teas = new Tea[3];
        teas[0] = new GreenTea();
        teas[1] = new BlackTea();
        teas[2] = new HerbalTea();

        for (Tea tea : teas) {
            tea.prepareTea();
            tea.addMilk();
            tea.addSugar();
        }
    }
}
