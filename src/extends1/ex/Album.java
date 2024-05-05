package extends1.ex;

public class Album extends Item{
    private String name;

    public Album(String album, int price, String name) {
        super(album, price);
        this.name = name;
    }

    public void print() {
        System.out.println("- 아티스트: " + name);
    }
}
