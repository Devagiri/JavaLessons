package org.ananta.itCompany.employee;

public class Designer extends Employee {
    private String[] designerSKillSet;
    private String computer;

    public Designer() {}

    public Designer(String[] designerSKillSet, String computer) {
        this.designerSKillSet = designerSKillSet;
        this.computer = computer;
    }

    public Designer(String firstName, String lastName, int age, int salary, String[] designerSKillSet, String computer) {
        super(firstName, lastName, age, salary);
        this.designerSKillSet = designerSKillSet;
        this.computer = computer;
    }

    public String[] getDesignerSKillSet() {
        return designerSKillSet;
    }

    public void setDesignerSKillSet(String[] designerSKillSet) {
        this.designerSKillSet = designerSKillSet;
    }

    public String getComputer() {
        return computer;
    }

    public void setComputer(String computer) {
        this.computer = computer;
    }

    @Override
    public void work() {
        draw();
        showSketches();
        draw();
    }

    private void draw() {
        System.out.println("Рисую...");
    }

     public void showSketches() {
         System.out.println("Еще не нарисовал...");
     }
}
