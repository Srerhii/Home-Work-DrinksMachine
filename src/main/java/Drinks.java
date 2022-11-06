public class Drinks {

public static final int COFFEE= 2;
public static final int TEA= 1;
public static final int LEMONADE = 3;
public static final int MOJITO= 4;
public static final int SODA= 1;
public static final int COCA_COLA= 4;


    public int GetPriceCoffee (){
        return COFFEE;
    }
    public int GetPriceTea (){
        return TEA;
    }
    public int GetPriceLemonade (){
        return LEMONADE;
    }
    public int GetPriceMojito (){
        return MOJITO;
    }
    public int GetPriceSoda (){
        return SODA;
    }
    public int GetPriceCoca_Cola (){
        return COCA_COLA;
    }
    public void MakeCOFFEE () {

    System.out.println(" приготовления COFFEE "+ "Цена "+COFFEE);}
    public void MakeTEA () {
        System.out.println("приготовления TEA "+"Цена "+TEA);}
    public void MakeLEMONADE () {
        System.out.println("приготовления LEMONADE "+"Цена "+LEMONADE);}

    public void MakeMOJITO () {
    System.out.println("приготовления MOJITO "+"Цена "+MOJITO);}

    public void MakeSODA () {
        System.out.println("приготовления SODA "+"Цена "+SODA);}

    public void MakeCOCA_COLA () {
        System.out.println("приготовления COCA_COLA "+"Цена "+COCA_COLA);}

}
