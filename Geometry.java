public class Geometry{
    public static void main(String[] args){
        int Sides = 7;
        int Radius = 5;
        final int PI = 22/7;
        System.out.println("A heptagon has " + Sides + " sides.");
        System.out.println("A decagon has " + Radius + " sides.");
        System.out.println("A dodecagon has " + Sides + Radius + " sides.");
        System.out.println("The circumference of a circle with a radius of " + Radius + " is " + ((Radius * 2) * PI));
        
    }
}