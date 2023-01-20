package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    /**
     * "this is a valid triangle"
     * "it's not a triangle"
     */
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) {
            System.out.println("it's not a triangle");
        } else if (firstSide + secondSide < thirdSide) {
            System.out.println("it's not a triangle");
        } else if (secondSide + thirdSide < firstSide) {
            System.out.println("it's not a triangle");
        } else if (thirdSide + firstSide < secondSide) {
            System.out.println("it's not a triangle");
        } else {
            System.out.println("this is a valid triangle");
        }
    }
}
