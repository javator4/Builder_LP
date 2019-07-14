package pl.sda.builder;

public class Application {

    public static void main(String[] args) {

        User user = new User.Builder()
                .lastname("Test")
                .name("Test")
                .city("torun")
                .postalcode("87-100").build();

        System.out.println(user);
    }

}