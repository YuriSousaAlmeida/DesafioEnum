import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter department name:");
        String auxDep=sc.nextLine();
        Department dept = new Department(auxDep);
        System.out.println("Enter worker data:");
        System.out.printf("Name:");
        String auxName=sc.nextLine();
        System.out.printf("Level " + WorkerLevel.listLevels() +": ");
        int auxLevel=sc.nextInt();
        System.out.printf("Base salary:");
        Double auxBsalary=sc.nextDouble();
        Worker worker1 = new Worker(auxName,WorkerLevel.fromCode(auxLevel),auxBsalary,dept);
        System.out.println(worker1.toString());

        System.out.printf("How many contracts to this worker? ");
        int op1=sc.nextInt();
        sc.nextLine();


        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (int i=0;i<op1;i++){
            System.out.println("Enter contract #"+ (i+1) + " data:");
            System.out.printf("Date (DD/MM/YYYY):");
            LocalDate date = LocalDate.parse(sc.nextLine(),fmt1);
            System.out.printf("Value per hour: ");
            Double auxValueHour=sc.nextDouble();
            System.out.printf("Duration(hours): ");
            Integer auxHour=sc.nextInt();
            sc.nextLine();
            HourContract h1=new HourContract(date, auxValueHour, auxHour);
            worker1.addContract(h1);
        }

        System.out.printf("Enter month and year to calculate income(MM/YYYY):");
        System.out.printf("Month: ");
        Integer auxMonth=sc.nextInt();
        System.out.printf("Year: ");
        Integer auxYear=sc.nextInt();
        sc.nextLine();
        System.out.println("Name: " + worker1.getName());
        System.out.println("Department: " + worker1.getDepartment());
        System.out.println("Income for "+auxMonth+"/"+auxYear+": " +worker1.income(auxYear,auxMonth));

    }
}