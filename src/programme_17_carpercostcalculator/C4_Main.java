package programme_17_carpercostcalculator;

/**
 * Write a class with the name Calculator. The class needs two fields (instance variables) with name floor of type
 * Floor and carpet of type Carpet.
 * The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet and
 * it needs to initialize the fields.
 * Write the following methods (instance methods):
 * Method named getTotalCost without any parameters, it needs to return the calculated total cost to cover
 * the floor with a carpet.
 */
public class C4_Main {
    public static void main(String[] args) {
        C2_Carpet carpet = new C2_Carpet(3.5);
        C1_Floor floor = new C1_Floor(2.75, 4.0);
        C3_Calculator calculator = new C3_Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new C2_Carpet(1.5);
        floor = new C1_Floor(5.4, 4.5);
        calculator = new C3_Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }
}
