package InheritConcept;

public class BasePlusCommissionEmployeeComposition {
    CommissionEmployee commissionEmployee;
    public double baseSalary;

    public BasePlusCommissionEmployeeComposition(String first, String last, int ssn, double sales, double rate, double baseSalary) {
        commissionEmployee = new CommissionEmployee(first,last,ssn,sales,rate);
        this.baseSalary = baseSalary;

    }
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double earnings() {
        baseSalary = baseSalary + commissionEmployee.earnings();
        return baseSalary;
    }

    public String toString() {
        return String.format("%s %s\n%s: ", "base-salaried"
                + commissionEmployee.toString(), "base-salary", earnings());
    }

}
