package org.ananta.itCompany.employee;

public class Manager extends Employee {
    private boolean researchingMarket;
    private boolean teamManaging;

    public Manager() {
    }

    public Manager(boolean researchingMarket, boolean teamManaging) {
        this.researchingMarket = researchingMarket;
        this.teamManaging = teamManaging;
    }

    public Manager(String firstName, String lastName, int age, int salary, boolean researchingMarket, boolean teamManaging) {
        super(firstName, lastName, age, salary);
        this.researchingMarket = researchingMarket;
        this.teamManaging = teamManaging;
    }

    private void manage() {
        if (researchingMarket) {
            System.out.println("Исследую рынок...");
        }

        if (teamManaging) {
            System.out.println("Управляю командой");
        }
    }

    public void launchMeeting() {
        System.out.println("Митингую");
    }

    @Override
    public void work() {
        manage();
        launchMeeting();
        manage();
    }

    public boolean isResearchingMarket() {
        return researchingMarket;
    }

    public void setResearchingMarket(boolean researchingMarket) {
        this.researchingMarket = researchingMarket;
    }

    public boolean isTeamManaging() {
        return teamManaging;
    }

    public void setTeamManaging(boolean teamManaging) {
        this.teamManaging = teamManaging;
    }
}
