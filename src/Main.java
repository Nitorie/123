public class Main {
    public static void main(String[] args) {
        int name = 5;
        int [] ar ={1,2,3};
        Table blackTable = new Table();
        blackTable.color = "black";
        blackTable.h = 150;

        Table whiteTable = new Table();
        whiteTable.color = "white";
        whiteTable.h = 260;

        User firstUser = new User();
        firstUser.name = "UltraMaskik228";
        firstUser.login = "portfool";
        firstUser.password = 1216890165;

        whiteTable.print();
        blackTable.print();

        System.out.println("------------------------");
        System.out.println(firstUser.name + " " + firstUser.login + " " + firstUser.password);
    }
    public static void homeTask() {
        Car tesla = new Car();
        Car Porshe = new Car();
        tesla.isPower = true;
        tesla.print();
        tesla.print();

        changeColorForCar("red", tesla);
        tesla.print();
    }
    public static void changeColorForCar(String color, Car car) {
        car.color = color;

    }
    public static void Books() {
        Library library = new Library();
        Book b = new Book("Harry Potter");
        Book b1 = new Book("LOTR");
        library.addBooks(b);
        library.addBooks(b1);



        library.print();
    }
}