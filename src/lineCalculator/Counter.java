package lineCalculator;

public class Counter {

    private boolean endWord;
    private int lineCounter;
    private int characterCounter;

    public Counter() {

        lineCounter = 0;
        characterCounter = 0;
        endWord = false;
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

    public void addCharacters(String Characters)  {
        //Om jag får ordet stop uppdatera endWord, annars fortsätt
        if (Characters.equals("Stop"))
            endWord = true;
        else
        characterCounter = characterCounter + Characters.length();
    }

    public boolean getendWord() {

        return endWord;

    }
}
