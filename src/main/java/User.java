import java.util.Scanner;

public class User {
    public static void main(String[] args) {

        int total=0;
        int totalDrink=0;
        Drinks drinks = new Drinks();

        System.out.println("Выберете напитки: 1.COFFEE 2.TEA 3.LEMONADE 4.MOJITO 5.SODA 6.COCA_COLA 0.EXIT");
        Scanner scanner = new Scanner(System.in);
        int user;

        do {
            user = scanner.nextInt();

            switch (user) {
                case 1:
                    drinks.MakeCOFFEE();
                    total+=drinks.GetPriceCoffee();
                    totalDrink++;
                    break;

                case 2:
                    drinks.MakeTEA();
                    total+=drinks.GetPriceTea();
                    totalDrink++;
                    break;

                case 3:
                    drinks.MakeLEMONADE();
                    total+=drinks.GetPriceLemonade();
                    totalDrink++;
                    break;

                case 4:
                    drinks.MakeMOJITO();
                   total+= drinks.GetPriceMojito();
                    totalDrink++;
                    break;
                case 5:
                    drinks.MakeSODA();
                    total+=drinks.GetPriceSoda();
                    totalDrink++;
                    break;
                case 6:
                    drinks.MakeCOCA_COLA();
                    total+=drinks.GetPriceCoca_Cola();
                    totalDrink++;
                    break;
                case 0:
                    System.out.println("EXIT "+"\nколичество заказаных напитков "+totalDrink+"\n сумма заказа "+total);
                    break;
                default:
                    System.out.println("нет такого напитка");

            }

        }  while (user != 0) ;






    }
}
