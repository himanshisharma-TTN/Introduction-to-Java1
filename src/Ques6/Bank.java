package Ques6;
class Bank {
    private String name;
    private String headofficeAddress;
    private String chairmanName;
    private int branchCount;
    private double fdInterestRate;
    private double personalLoanInterestRate;
    private double homeLoanInterestRate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadofficeAddress() {
        return headofficeAddress;
    }

    public void setHeadofficeAddress(String headofficeAddress) {
        this.headofficeAddress = headofficeAddress;
    }

    public String getChairmanName() {
        return chairmanName;
    }

    public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;
    }

    public int getBranchCount() {
        return branchCount;
    }

    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }

    public double getFdInterestRate() {
        return fdInterestRate;
    }

    public void setFdInterestRate(double fdInterestRate) {
        this.fdInterestRate = fdInterestRate;
    }

    public double getPersonalLoanInterestRate() {
        return personalLoanInterestRate;
    }

    public void setPersonalLoanInterestRate(double personalLoanInterestRate) {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    public double getHomeLoanInterestRate() {
        return homeLoanInterestRate;
    }

    public void setHomeLoanInterestRate(double homeLoanInterestRate) {
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    @Override
    public String toString() {
        return "Bank [Name=" + name + ", Head Office Address=" + headofficeAddress + ", Chairman=" + chairmanName +
                ", Branch Count=" + branchCount + ", FD Interest Rate=" + fdInterestRate +
                ", Personal Loan Interest Rate=" + personalLoanInterestRate + ", Home Loan Interest Rate=" + homeLoanInterestRate + "]";
    }
}

class SBI extends Bank {
    @Override
    public String toString() {
        return "SBI " + super.toString();
    }
}

class BOI extends Bank {
    @Override
    public String toString() {
        return "BOI " + super.toString();
    }
}

class ICICI extends Bank {
    @Override
    public String toString() {
        return "ICICI " + super.toString();
    }
}