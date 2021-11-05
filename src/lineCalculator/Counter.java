package lineCalculator;

public class Counter {

    private boolean Stop;
    private int lineCounter;
    private int characterCounter;

public Counter() {

        lineCounter = 0;
        characterCounter = 0;
}

    public static boolean addLines(String text) {
    }

    public int getNumberofLines() {
    return lineCounter;
}
public int getNumberofCharacters() {
    return characterCounter;
}

public void addLines() {
        lineCounter = lineCounter + 1;
    }

    public static void addCharacters(String Characters) {
        characterCounter = characterCounter + Characters.length();
    }

}
