import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import PointOne.PaymentStrategy;
import PointOne.PaymentStrategyBuilder;
import PointOne.PaymentStyle;
import PointThree.Helper;
import PointTwo.Animal;
import PointTwo.Cat;
import PointTwo.Dog;
import PointTwo.Rooster;

public class App {
    public static void main(String[] args) throws Exception {
        // TODO implement some nice menu with a switch or something

        System.out.println("Question One:");
        questionOne();

        System.out.println("\nQuestion Two:");
        questionTwo();

        System.out.println("\nQuestion Three:");
        questionThree();

        System.out.println("\nQuestion Six and onwards:");
        foo2();

    }

    private static void questionOne() {
        PaymentStrategy paymentStrategy = PaymentStrategyBuilder.buildStrategy(PaymentStyle.CASH);

        paymentStrategy.pay();
    }

    private static void questionTwo() {
        Animal hellokitty = new Cat();
        Animal dogecoin = new Dog();
        Animal foghornLeghorn = new Rooster();
        System.out.println("Of course it compiles, why wouldn't it? " + hellokitty.makesNoise());
        System.out.println("Now let's iterate through the whole zoo's noises:\nEverybody make some noise!");

        Map<String, Animal> zoo = new HashMap<String, Animal>();
        zoo.put("hellokitty", hellokitty);
        zoo.put("dogecoin", dogecoin);
        zoo.put("foghornleghorn", foghornLeghorn);

        zoo.forEach((key, value) -> System.out.println(value.makesNoise()));
    }

    private static void questionThree() {
        // Human x = new Kid();
        // Will not compile, Human/Kid are not globally public
        // A public helper in the same package can be used.
        Helper helper = new Helper();
        System.out.println("Human firstKid = new Kid();\n firstKid.getName(); \n Result:");
        System.out.println(helper.getKidName() + "\n");

        // Cannot call firstKid.playsWithToys(). This will not work, Human does not have
        // playsWithToys() implemented but Kid does.
        // So we call secondKid.playsWithToys() because Kid secondKid = new Kid(); Kid
        // has playsWithToys() implemented.
        System.out.println("Kid secondKid = new Kid();\n secondKid.getKidPlaysWithToys(); \n Result:");
        System.out.println(helper.getKidPlaysWithToys() + "\n");
    }

    public static void foo() throws NoSuchMethodException, SQLException {
        var connection = DriverManager.getConnection("url", "user", "password");
        var statement = connection.createStatement();
        statement.executeQuery(Constants.CREATE_TABLE.toString());
        statement.executeQuery(Constants.FILL_TABLE.toString());
        statement.executeQuery(Constants.SELECT_EMPLOYEE_547.toString());
        statement.executeQuery(Constants.SELECT_EMPLOYEE_WITH_ID.toString());
        statement.executeQuery(Constants.CHANGE_LAST_NAME.toString());
        statement.executeQuery(Constants.ADD_EMPLOYEE.toString());
    }

    public static void foo2() {
        try {
            foo();
        } catch(NoSuchMethodException n) {
            System.err.println("NoSuchMethodException => " + n.getMessage());
        } catch(SQLException s) {
            System.err.println("SQLException => " + s.getMessage());
        } finally {
            System.out.println("we're been through some tough times, you and I\n But we did it in the end.");
        }
    }
}
