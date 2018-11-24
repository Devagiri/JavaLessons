package org.ananta.itCompany.employee;

public class Developer extends Employee {
    private String[] programmingSkillSet;
    private String prefferedOS;

    public Developer() {
    }

    public Developer(String firstName, String lastName, int age, int salary, String[] programmingSkillSet, String prefferedOS) {
        super(firstName, lastName, age, salary);
        this.programmingSkillSet = programmingSkillSet;
        this.prefferedOS = prefferedOS;
    }

    @Override
    public void work() {
        writeCode();
        drinkCoffie();
        eatCookie();
        writeCode();
    }

    public void drinkCoffie() {
        System.out.println("Пью кофе");
    }

    public void eatCookie() {
        System.out.println("Ем печенье");
    }

    private void writeCode() {
        String tehcs = "";
        for (String skill : programmingSkillSet) {
            tehcs = tehcs + ", " + skill;
        }
        System.out.println("Пишу код.... Использую " + tehcs);
    }

    public String[] getProgrammingSkillSet() {
        return programmingSkillSet;
    }

    public void setProgrammingSkillSet(String[] programmingSkillSet) {
        this.programmingSkillSet = programmingSkillSet;
    }

    public String getPrefferedOS() {
        return prefferedOS;
    }

    public void setPrefferedOS(String prefferedOS) {
        this.prefferedOS = prefferedOS;
    }
}
