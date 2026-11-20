package activite51.clientPackage;

import activite51.commonPackage.IConversion;

import java.rmi.Naming;

public class ConversionClient {
    public static void main(String[] args) {
        try {
            IConversion service = (IConversion) Naming.lookup("rmi://localhost:1099/conversion");
            double resultat = service.convertirMontant(500);
            System.out.println("500 euros = " + resultat + " dinars");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}