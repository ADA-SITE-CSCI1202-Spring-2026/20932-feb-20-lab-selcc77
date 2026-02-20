import java.util.Scanner;
import week05.invoice.Invoice;

public class ArrayOfInvoices {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many invoices? ");
        int n = input.nextInt();
        input.nextLine();  // consume newline

        Invoice[] invoices = new Invoice[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nInvoice #" + (i + 1));

            System.out.print("Part number: ");
            String partNumber = input.nextLine();

            System.out.print("Part description: ");
            String partDescription = input.nextLine();

            System.out.print("Quantity: ");
            int quantity = input.nextInt();

            System.out.print("Price per item: ");
            double price = input.nextDouble();
            input.nextLine(); // consume newline

            invoices[i] = new Invoice(partNumber, partDescription, quantity, price);
        }

        System.out.println("\n--- Invoice Results ---");

        for (int i = 0; i < n; i++) {
            System.out.println("Invoice #" + (i + 1));
            System.out.println("Part: " + invoices[i].getPartNumber());
            System.out.println("Description: " + invoices[i].getPartDescription());
            System.out.println("Amount: $" + invoices[i].getInvoiceAmount());
            System.out.println();
        }

        input.close();
    }
}