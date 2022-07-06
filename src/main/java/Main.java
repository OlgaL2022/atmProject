import controller.AtmController;
import controller.BankController;
import controller.MenuController;
import dto.User;
import dto.UserCard;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        MenuController menuController = new MenuController();

        menuController.start();

        /*BankController bankController = new BankController();

        Date expiryDate = new Date(2022, Calendar.JUNE, 22);

         *//* Another option for making date
        try {
            expiryDate = new SimpleDateFormat("yyyy-MM-dd").parse("2022-06-23");
        }catch (Exception ex){
            System.out.println(ex);
        }
        *//*

        UserCard card = new UserCard(expiryDate,1245.50d,1234 );
        User user1 = new User("Tom Williams", "12345",card, 2.50);

        bankController.createUser(user1);

        AtmController atmController = new AtmController();

        atmController.setBankController(bankController);
        atmController.insertCard(user1.getCard());

        JOptionPane.showMessageDialog(null,atmController.deposit());
        JOptionPane.showMessageDialog(null,atmController.withdraw());

        JOptionPane.showMessageDialog(null, atmController.validateCard());

        JOptionPane.showMessageDialog(null,atmController.deposit());
        JOptionPane.showMessageDialog(null,atmController.withdraw());

        JOptionPane.showMessageDialog(null,atmController.removeCard());

        JOptionPane.showMessageDialog(null,atmController.withdraw());
*/
    }
}
