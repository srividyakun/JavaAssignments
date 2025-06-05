package InheritConcept;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(String first, String last,
                                      int ssn, double sales, double rate, double baseSalary ) {
        super(first,last,ssn,sales,rate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double earnings() {
        baseSalary = baseSalary + super.earnings();
        return baseSalary;
    }

    public String toString() {
        return String.format("%s %s\n%s: ", "base-salaried"
                + super.toString(), "base-salary", earnings());
    }
}