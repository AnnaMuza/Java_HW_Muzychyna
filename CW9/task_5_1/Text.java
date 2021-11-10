package CW9.task_5_1;


public class Text {
    private Sentence[] text;
    private Sentence header;

    Text(String str) {
        String[] str_arr = str.split("[ ]+");
        text = new Sentence[str_arr.length];

        for (int i = 0;i < str_arr.length;i++){
            text[i] = new Sentence(str_arr[i]);
        }
    }

    Text(String[] str) {
        text = new Sentence[str.length];
        
        for (int i = 0; i < str.length; i++){
            text[i] = new Sentence(str[i]);
        }
    }

    public void set_header(Sentence s) {
        header = s;
    }

    public void print_header() {
        System.out.println(header);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        for (Sentence sentence : this.text)
            str.append(sentence.toString());

        return str.toString();
    }


}