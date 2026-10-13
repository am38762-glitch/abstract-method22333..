package ug.gov.main;


import ug.gov. id.IdService;
import ug.gov. tax.TaxService;
import ug.gov. passport.PassportService;
import ug.gov. business.BusinessService;

import java.util.Scanner;
public class MainCode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IdService idService = new IdService();
        TaxService taxService = new TaxService();
        PassportService passportService = new PassportService();
        BusinessService businessService = new BusinessService();

        System.out.println("=== Unified Government Services System (Interactive) ===");

        1.National ID Verification
        System.out.print("Enter National ID number to verify: ");
        String nationalId = scanner.nextLine();
        idService.verifyNationalId(nationalId);

        System.out.println("----------------------------------------");

        // 2. Tax Collection
        System.out.print("Enter the taxpayer name (Company or Individual): ");
        String taxpayerName = scanner.nextLine();
        System.out.print("Enter the tax amount to collect: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline buffer
        taxService.processTaxCollection(taxpayerName, amount);

        System.out.println("----------------------------------------");

        // 3. Passport Issuance
        System.out.print("Enter citizen name for passport issuance: ");
        String citizenName = scanner.nextLine();
        passportService.issuePassport(citizenName);

        System.out.println("----------------------------------------");

        // 4. Business Registration
        System.out.print("Enter business name to register: ");
        String businessName = scanner.nextLine();
        businessService.registerBusiness(businessName);

        System.out.println("\n--- All interactive operations executed successfully ---");
        scanner.close();
    }
}
