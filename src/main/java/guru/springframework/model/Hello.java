package guru.springframework.model;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World");
        User user = User.builder().firstName("John").lastName("Thompson").build();
        System.out.println("Hello " + user);
    }
}
