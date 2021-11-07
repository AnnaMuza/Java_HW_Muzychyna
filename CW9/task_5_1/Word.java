package CW9.task_5_1;


public class Word {
    private String word;

    Word() { this.word = ""; }
    Word(String word) { this.word = word; }

    @Override
    public String toString() { return word; }
}