package activite51.serverPackage;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ConversionServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            ConversionImpl service = new ConversionImpl();
            Naming.rebind("rmi://localhost:1099/conversion", service);
            System.out.println("Le serveur de conversion est démarré");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}