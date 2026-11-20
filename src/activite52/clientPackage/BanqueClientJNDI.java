package activite52.clientPackage;

import activite52.commonPackage.Compte;
import activite52.commonPackage.IBanque;

import javax.naming.Context;
import javax.naming.InitialContext;

public class BanqueClientJNDI {
    public static void main(String[] args) {
        try {
            Context ctx = new InitialContext();
            IBanque banque = (IBanque) ctx.lookup("banque");

            System.out.println(banque.creerCompte(new Compte(1, 1000)));
            System.out.println(banque.creerCompte(new Compte(1, 500)));
            System.out.println(banque.getInfoCompte(1));
            System.out.println(banque.getInfoCompte(99));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}