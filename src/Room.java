
public class Room
{
    private String name,description;
    private char symbol;
    private Position position;

    public Room(String name, String description, char symbol, Position position){
        this.name = name;
        this.description = description;
        this.symbol = symbol;
        this.position = position;
    }

    public String getName(){
        return name;
    }
    public char getSymbol(){
        return symbol;
    }
    public Position getPosition(){
        return position;
    }
    public String getDescription(){
        return description;
    }

}
