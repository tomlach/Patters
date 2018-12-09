package pl.sda.creational.builder;

import java.time.LocalDate;

public class Customer  {
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private String pesel;
    private String profession;
    private String city;
    private String country;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", pesel='" + pesel + '\'' +
                ", profession='" + profession + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\n' +
                '}';
    }

    private Customer() {
    }
    
    public static Customer createEmpty(){
        return new Customer();
    }
    
    public static Builder create(String name, String lastName){
        return new Builder(name, lastName); 
    }
    
    public static Customer creatoDefaulty(){
        Customer customer = new Customer();
        customer.name = "";
        customer.lastName = "";
        customer.birthDate = LocalDate.now();
        return customer;
    }

    public static class Builder {
        private Customer customer = new Customer();

        public Builder(String name, String lastName) {
        }


        public Builder name(String name) {
            customer.name = name;
            return this;
        }

        public Builder lastName(String lastName) {
            customer.lastName = lastName;
            return this;
        }

        public Builder birthDate(LocalDate birthDate) {
            customer.birthDate = birthDate;
            return this;
        }

        public Builder pesel(String pesel) {
            customer.pesel = pesel;
            return this;
        }

        public Builder profession(String profession) {
            customer.profession = profession;
            return this;
        }

        public Builder city(String city) {
            customer.city = city;
            return this;
        }

        public Builder country(String country) {
            customer.country = country;
            return this;
        }

        public String getName() {
            return customer.name;
        }

        public String getLastName() {
            return customer.lastName;
        }

        public LocalDate getBirthDate() {
            return customer.birthDate;
        }

        public String getPesel() {
            return customer.pesel;
        }

        public String getprofession() {
            return customer.profession;
        }

        public String getcity() {
            return customer.city;
        }

        public String getCountry() {
            return customer.city;
        }


        public Customer build() {
            return customer;
        }

    }
}


