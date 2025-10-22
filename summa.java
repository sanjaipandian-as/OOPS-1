import java.io.*;
import java.util.*;

public class Solution {
    static class Spacecraft{
        protected String name;
        protected int launchYear;

        protected Spacecraft(String name,int launchYear){
            this.name = name;
            this.launchYear = launchYear;
        }
    }

    static class MannedSpaceCraft extends Spacecraft{
        protected int crewCapacity;

        public MannedSpaceCraft(String name,int launchYear,int crewCapacity){
            super(name,launchYear);
            this.crewCapacity = crewCapacity;
        }
    } 

    static class LunarModule extends MannedSpaceCraft{
        private String landingSite;

        public LunarModule(String name,int launchYear,int crewCapacity,String landingSite){
            super(name,launchYear,crewCapacity);
            this.landingSite = landingSite;
        }

        public void displayDetails(){
            System.out.println("Spacecraft Name: "+name);
            System.out.println("Launch Year: "+launchYear);
            System.out.println("Crew Capacity: "+crewCapacity);
            System.out.println("Landing Site: "+landingSite);
        }

    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int launchYear = scanner.nextInt();
        int crewCapacity = scanner.nextInt();
        scanner.nextLine();
        String landingSite = scanner.nextLine();

        LunarModule craft = new LunarModule(name,launchYear,crewCapacity,landingSite);

        craft.displayDetails();

    }
}