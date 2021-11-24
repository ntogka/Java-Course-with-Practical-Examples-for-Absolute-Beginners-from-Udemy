package intermediate.endsection;

public class Criminal extends Person{

    public static final int SUCCESS_PERCENTAGE = 20;

    public Criminal(String name, String nickname, int yearOfBorn, String expertIn, Item[] item) {
        super(name, nickname, yearOfBorn, expertIn, item);
    }

    @Override
    public void printBioData() {
        System.out.println("Criminal person: ");
        super.printBioData();
    }
}
