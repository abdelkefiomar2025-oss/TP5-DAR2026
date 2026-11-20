package activite52.clientPackage;

import activite52.commonPackage.Compte;
import activite52.commonPackage.IBanque;

import java.rmi.Naming;

public class BanqueClient {
    public static void main(String[] args) {
        try {
            IBanque banque = (IBanque) Naming.lookup("rmi://localhost:1099/banque");

            System.out.println(banque.creerCompte(new Compte(1, 1000)));
            System.out.println(banque.creerCompte(new Compte(1, 500)));
            System.out.println(banque.getInfoCompte(1));
            System.out.println(banque.getInfoCompte(99));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}