package Polymorphism;

public class Main {
    public static void main(String[] args) {
        int Jaws = 0;
        int Maze = 0;
        int Ind = 0;
        int Star = 0;
        int Forgettable = 0;
        for(int i = 0; i < 100000000; i++){
            Movie movie = randomMovie();
            if(movie.getName() == "Jaws") Jaws++;
            if(movie.getName() == "Maze Runner") Maze++;
            if(movie.getName() == "Independence Day") Ind++;
            if(movie.getName() == "Star Wars") Star++;
            if(movie.getName() == "Forgettable") Forgettable++;
            System.out.println("================================");
            System.out.println(movie.getName());
            System.out.println(movie.plot());
        }

        System.out.println("Jaws found: " + Jaws);
        System.out.println("Maze Runner found: " + Maze);
        System.out.println("Independence Day found: " + Ind);
        System.out.println("Star Wars found: " + Star);
        System.out.println("Forgettable movie found: " + Forgettable);
    }

    public static Movie randomMovie(){
        int number = (int) (Math.random() * 5);
        switch(number){
            case(0):
                return new Jaws();
            case(1):
                return new Independence_Day();
            case(2):
                return new Maze_Runner();
            case (3):
                return new Star_Wars();
            case(4):
                return new Forgettable();
        }
        return null;
    }
}

class Movie{
    private String name;

    public String getName() {
        return name;
    }

    public Movie(String name){
        this.name = name;
    }

    public String plot(){
        return "No plot here.";
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    @Override
    public String plot(){
        return "Shark eats people.";
    }
}

class Independence_Day extends Movie{
    public Independence_Day() {
        super("Independence Day");
    }

    @Override
    public String plot(){
        return "Aliens attempt to kill everyone.";
    }
}

class Maze_Runner extends Movie{
    public Maze_Runner(){
        super("Maze Runner");
    }

    @Override
    public String plot(){
        return "Kids try to escape maze.";
    }
}

class Star_Wars extends Movie{
    public Star_Wars(){
        super("Star Wars");
    }

    @Override
    public String plot(){
        return "Self-righteous hipsters obliviously commit war crimes.";
    }
}

class Forgettable extends Movie{
    public Forgettable(){
        super("Forgettable");
    }

    // not overriding plot method
}
