package vincenzomola;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {

    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(
            "u4_w3_l3_pu");

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
