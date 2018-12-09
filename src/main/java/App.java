import pl.sda.creational.builder.Customer;
import pl.sda.creational.factory.Profession;
import pl.sda.creational.factory.Warrior;
import pl.sda.creational.singleton.SingletonLogger;
import sun.util.resources.cldr.saq.CurrencyNames_saq;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Customer customer = new Customer.Builder("tomek", "lach")
                .name("frfr")
                .country("ssas")
                .birthDate(LocalDate.of(1989,05,23))
                .country("Polska")
                .build();

        System.out.println(customer);

        System.out.println("================================================================");
        System.out.println("================================================================+'\n");

        Warrior warrior1 = new Warrior("vcrcr", 2, Profession.ARCHER);
     warrior1.changeProfession(Profession.SWORDSMAN);

        System.out.println(warrior1);



        System.out.println("====================================================== + '\n");

        SingletonLogger.getInstance().log("cecececece");  // test logera
    }
}
