package InheritConcept;

public class CommissionEmployee {
    private String fristName;
    private String lastName;
    private int socialSecurityNumber;
    private double commissionRate;
    private double grossSales;

    public CommissionEmployee(String first, String last, int ssn, double sales, double rate) {
        this.fristName = first;
        this.lastName = last;
        this.socialSecurityNumber = ssn;
        this.grossSales = sales;
        this.commissionRate = rate;
    }

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales >= 0.0) {
            this.grossSales = grossSales;
        } else {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
    }

    public double earnings() {
        return commissionRate * grossSales;
    }

    @Override
    public String toString(){
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                "Commision employee : ", getFristName() ,getLastName(),
                "SocialSecurityNumber : " , getSocialSecurityNumber(),
                "gross Sales : ",getGrossSales(),
                "Commision rate : ", getCommissionRate());
    }
}