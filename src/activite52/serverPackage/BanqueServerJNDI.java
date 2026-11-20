package activite52.serverPackage;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.rmi.registry.LocateRegistry;

public class BanqueServerJNDI {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            BanqueImpl banque = new BanqueImpl();
            Context ctx = new InitialContext();
            ctx.rebind("banque", banque);
            System.out.println("Le serveur de la banque est démarré (JNDI)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}