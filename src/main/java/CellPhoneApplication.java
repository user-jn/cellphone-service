import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("""
                
                ********************************
                    CELL PHONE SERVICE
                ********************************
                Welcome! Let's register your phones.
                """);

        CellPhone phone1 = new CellPhone();

        System.out.println("***PHONES 1's INFORMATION***");

        // now get inputs and call setter method for phone1
        System.out.print("What is the serial number?: ");
        int serialNumber = scnr.nextInt();
        scnr.nextLine();

        System.out.print("What model is the phone?: ");
        String model = scnr.nextLine();

        System.out.print("Who is the carrier?: ");
        String carrier = scnr.nextLine();

        System.out.print("What is the phone number? (###-###-####): ");
        String phoneNumber = scnr.nextLine();

        System.out.print("Who is the owner of the phone?: ");
        String owner = scnr.nextLine();

        // store information using setters
        phone1.setSerialNumber(serialNumber);
        phone1.setModel(model);
        phone1.setCarrier(carrier);
        phone1.setPhoneNumber(phoneNumber);
        phone1.setOwner(owner);

        System.out.println();


        // create another cellphone object
        CellPhone phone2 = new CellPhone();

        System.out.println("***PHONES 2's INFORMATION***");

        // now get inputs and call setter method for phone1
        System.out.print("What is the serial number?: ");
        int serialNumber2 = scnr.nextInt();
        scnr.nextLine();

        System.out.print("What model is the phone?: ");
        String model2 = scnr.nextLine();

        System.out.print("Who is the carrier?: ");
        String carrier2 = scnr.nextLine();

        System.out.print("What is the phone number? (###-###-####): ");
        String phoneNumber2 = scnr.nextLine();

        System.out.print("Who is the owner of the phone?: ");
        String owner2 = scnr.nextLine();

        // Store Phone 2 information using setters
        phone2.setSerialNumber(serialNumber2);
        phone2.setModel(model2);
        phone2.setCarrier(carrier2);
        phone2.setPhoneNumber(phoneNumber2);
        phone2.setOwner(owner2);

        // display both phones' information
        display(phone1);

        display(phone2);

        // call phones
        phone1.dial(phone2.getPhoneNumber());
        phone2.dial(phone1.getPhoneNumber());

        scnr.close();
    }



    public static void display(CellPhone phone) {
        System.out.printf("""
                        \n--- Phone ---
                        Serial Number: %d
                        Model: %s
                        Carrier: %s
                        Phone Number: %s
                        Owner: %s
                        """, phone.getSerialNumber(), phone.getModel(), phone.getCarrier(),
                phone.getPhoneNumber(), phone.getOwner());
    }
}