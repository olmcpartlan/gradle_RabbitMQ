/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package GradleMQ;


public class App {

    public User CreateUser() {
        return new User();
    }


    public static void main(String[] args) {
        System.out.println(new App().CreateUser());
    }
}

