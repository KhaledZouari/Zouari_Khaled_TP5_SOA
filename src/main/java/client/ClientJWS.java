package client;


import proxy.BanqueService;
import proxy.BanqueServiceService;

public class ClientJWS {
    public static void main(String[] args) {
        BanqueService bs =new BanqueServiceService().getBanqueServicePort();
        System.out.println(bs.conversion(4));
        System.out.println(bs.getCompte(1).toString());
    }
}