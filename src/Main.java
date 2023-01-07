import device.Device;

public class Main {
    public static void main(String[] args) {

        Car BMW = new Car(40000.0, "blue", "ON");
        BMW.fuelType = null;

        System.out.println("Typ paliwa: " + BMW.fuelType);
        System.out.println("Kolor auta: " + BMW.color);
        System.out.println("Przebieg: " + BMW.millage);

        Car fiat = new Car(3000.0,"red","ON");
        System.out.println();
        System.out.println("Paliwo: " + fiat.fuelType);
        System.out.println("Kolor auta: " + fiat.color);
        System.out.println("Przebieg: " + fiat.millage);
        System.out.println(fiat.yearOfProduction);

        Animal kot = new Animal("Ssak");
        kot.name = "puszek";
        kot.weight = 1.5;
        kot.alive = true;
        System.out.println("gatunek: " + kot.species);
        System.out.println("imie: " + kot.name);
        System.out.println("waga: " + kot.weight);
        if(kot.alive == true)
        {
            System.out.println("czy zyje: tak");}
        else{
            System.out.println("czy zyje: nie");
        }

        kot.takeForAWalk();
        kot.takeForAWalk();
        kot.takeForAWalk();
        kot.takeForAWalk();
        kot.takeForAWalk();
        kot.feed();

        Human kacper = new Human("Kacper");
        kacper.feed();
        System.out.println(kacper.weight);
        System.out.println(kacper.species);

        Phone iphone = new Phone(4.3, "aa");
        System.out.println(iphone.screenSize);
        System.out.println(iphone.os);
        System.out.println(iphone.producer);
        System.out.println(iphone.model);

    }
}