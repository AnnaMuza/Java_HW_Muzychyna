package CW9.task_5_1;


public class Sentence {
    private Word[] sentence;

    Sentence(String str) {
        String[] str_arr = str.split("[ ]+");
        sentence = new Word[str_arr.length];

        for (int i = 0;i < str_arr.length;i++){
            sentence[i] = new Word(str_arr[i]);
        }
    }

    Sentence(String[] str) {
        sentence = new Word[str.length];

        for (int i = 0; i < str.length;i++){
            sentence[i] = new Word(str[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        for (Word word: sentence)
            str.append(word.toString()).append(' ');
            
        return str.toString();
    }
}

