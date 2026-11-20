package activite52.serverPackage;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class BanqueServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            BanqueImpl banque = new BanqueImpl();
            Naming.rebind("rmi://localhost:1099/banque", banque);
            System.out.println("Le serveur de la banque est démarré");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}