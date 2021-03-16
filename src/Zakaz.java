public class Zakaz {
    //Поля класса
    private double price;
    private String namezakaz;
    private int num;
    private int state = 0;
    private static int numCount; //Статичное поле


    // Методы класса

    public Zakaz(double price, String namezakaz) {
        numCount ++;
        this.price = price;
        this.namezakaz = namezakaz;
        this.num = numCount;
        this.state = 0;
    }

    public Zakaz() {
        numCount ++;
        this.num = numCount;
        this.price = 0;
        this.namezakaz = "";
        this.state = 0;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNamezakaz() {
        return namezakaz;
    }

    public void setNamezakaz(String namezakaz) {
        this.namezakaz = namezakaz;
    }

    public int getNum() {
        return num;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    //
}
