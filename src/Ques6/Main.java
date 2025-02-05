package Ques6;

public class Main {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.setName("State Bank of India");
        sbi.setHeadofficeAddress("Mumbai, Maharashtra");
        sbi.setChairmanName("Himanshi");
        sbi.setBranchCount(22000);
        sbi.setFdInterestRate(6.0);
        sbi.setPersonalLoanInterestRate(12.5);
        sbi.setHomeLoanInterestRate(8.5);

        BOI boi = new BOI();
        boi.setName("Bank of India");
        boi.setHeadofficeAddress("Mumbai, Maharashtra");
        boi.setChairmanName("Kareena");
        boi.setBranchCount(5000);
        boi.setFdInterestRate(6.5);
        boi.setPersonalLoanInterestRate(11.5);
        boi.setHomeLoanInterestRate(9.0);

        ICICI icici = new ICICI();
        icici.setName("ICICI Bank");
        icici.setHeadofficeAddress("Mumbai, Maharashtra");
        icici.setChairmanName("Sandeep");
        icici.setBranchCount(5000);
        icici.setFdInterestRate(7.0);
        icici.setPersonalLoanInterestRate(13.0);
        icici.setHomeLoanInterestRate(8.0);

        System.out.println(sbi);
        System.out.println(boi);
        System.out.println(icici);
    }
}
