package creatures;

public abstract class Animal implements Feedable {

    public final String species;
    public String name;
    public Double weight;
    public Boolean alive;

    public Animal(String species) {
        this.species = species;
        this.alive = true;
        this.weight = 60.0;
    }

    public void feed(){
        if(this.alive == true) {
            this.weight += 0.5;
            System.out.println(this.name + " zostal nakarmiony jego aktualna waga to:" + this.weight);
        } else {
            System.out.println("nie mozesz nakarmic martwego zwierzecia");
        }
    }

    public void takeForAWalk(){
        if(this.alive == true) {
            this.weight -= 0.5;
            System.out.println(this.name + " zostal zabrany na spacer jego aktualna waga to: " + this.weight);
            if (this.weight <= 0) {
                this.alive = false;
                System.out.println("twoje zwierze umarlo");
            } else {
                System.out.println("nie mozesz wyjsc na spacer z martwym zwierzeciem");
            }
        }
    }
}
