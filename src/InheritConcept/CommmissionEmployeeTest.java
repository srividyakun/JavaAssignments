package InheritConcept;

public class CommmissionEmployeeTest {
    public static void main(String[] args) {
CommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Anil","Kumar",10, 25.0,12,40000.0);
System.out.println(basePlusCommissionEmployee.toString());

        BasePlusCommissionEmployeeComposition basePlusCommissionEmployeeComp = new BasePlusCommissionEmployeeComposition("Vidya","kundeti",11,30.00,15,50000.0);
        System.out.println(basePlusCommissionEmployeeComp.getBaseSalary());
        System.out.println(basePlusCommissionEmployeeComp.toString());
    }
}
