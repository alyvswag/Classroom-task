package OopIntro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Masinin adin daxil edin: ");
            String make = scanner.nextLine();
            System.out.print("Masinin modelin daxil edin: ");
            String model = scanner.nextLine();
            System.out.print("Masinin buraxilis ilin daxil edin: ");
            int year =Integer.parseInt(scanner.nextLine()) ;
            Car c = new Car(make, model, year);
            c.displayInfo();
            System.out.println(" ");
            System.out.print("Yeni masin elave etmek isteyirsiniz?(beli,xeyr): ");
            String istifadeciSecimi = scanner.nextLine();
            if(!istifadeciSecimi.equals("beli")){
                break;
            }
            System.out.println(" ");
        }
    }
}
