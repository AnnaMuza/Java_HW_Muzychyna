import java.util.*;


public class CW11 {
    // 1.1
    static void task_1_1(String[] args) {
        String text = "white  blue red   orange  red";

        if (Objects.equals(text, "")) System.out.println(args.length);
        else System.out.println(text.split("\\s+").length);
    }


    // 1.2
    static void task_1_2(String[] args) {
        String text;

        if (args.length != 0) {
            Collections.reverse(Arrays.asList(args));
            System.out.println(String.join(" ", args));
        } else {
            text = "q w e r t y";
            String[] arr = text.split(" ");
            Collections.reverse(Arrays.asList(arr));
            System.out.println(String.join(" ", arr));
        }
    }


    // 1.3
    static void task_1_3() {
        String s = "small doge vs cheems";
        s = s.replaceAll("small", "very large");
        System.out.println(s);
    }


    // 1.4
    static void task_1_4() {
        String s = "a doge and an apple";
        s = s.replaceAll("\\ban? \\b", "");
        System.out.println(s);
    }


    // 1.5
    static void task_1_5() {
        String s = "large doge vs small cheems";
        String[] replace_str = {"small", "large"};

        for (String rep: replace_str) s = s.replaceAll(rep, "very " + rep);
        System.out.println(s);
    }


    // 1.6
    static void task_1_6() {
        String s = "this is example";
        StringBuffer sb = new StringBuffer(s);
        sb.append(", that we use to ilustrate the methods of class StringBuffer");
        System.out.println(sb.toString());
    }


    // 1.7
    static void task_1_7(String[] args) {
        String text;

        if (args.length != 0) text = String.join(" ", args);
        else text = """
                The Game Awards has an advisory committee which includes representatives from hardware manufacturers Microsoft, Sony, Nintendo, and AMD,
                along with several game publishers. This committee selects around thirty influential video game news organizations that are able to nominate and subsequently
                vote on the video games in several categories. The advisory committee otherwise does not participate in the nomination or voting process.
                During the nomination round, each of the news outlets provides a list of games in several categories; games for the esports-related categories are chosen
                by a specific subset of these outlets. The committee compiles the nominations and selects the most-nominated games for voting by these same outlets. Prior to 2017,
                there were 28 industry experts and representatives that selected the winners, while the awards from 2017 onwards have used over 50 such experts. In 2019,
                non-English media publications were added to the jury. Winners are determined by a blended vote between the voting jury (90%) and public fan voting (10%) via social media.""";

        String sentenceRegExp = "((\\b\\w+\\b[, ]{1,2})+(\\b\\w+\\b[.?]))+";
        String wordRegExp = "\\b\\w+\\b";
        String symbolRegExp = ".";
        String specSymbolRegExp = "[,.?]";
        String resStr;

        resStr = text.replaceAll(symbolRegExp, "#");
        long symbolsNumber = resStr.chars().filter(ch -> ch == '#').count();

        resStr = text.replaceAll(wordRegExp, "#");
        long wordsNumber = resStr.chars().filter(ch -> ch == '#').count();

        resStr = text.replaceAll(sentenceRegExp, "#");
        long sentencesNumber = resStr.chars().filter(ch -> ch == '#').count();

        resStr = text.replaceAll(specSymbolRegExp, "#");
        long specSymbolsNumber = resStr.chars().filter(ch -> ch == '#').count();

        System.out.println("Number of symbols = " + symbolsNumber);
        System.out.println("Number of words = " + wordsNumber);
        System.out.println("Number of punctuation marks = " + specSymbolsNumber);
        System.out.println("Number of sentences = " + sentencesNumber);
    }


    // 1.8
    static void task_1_8(String[] args, String word) {
        String text;

        if (args.length != 0) text = String.join(" ", args);
        else text = """
            The Game Awards is an annual awards ceremony honoring achievements in the video game industry. Established in 2014, the shows are produced and hosted by
            game journalist Geoff Keighley, who worked on its predecessor, the Spike Video Game Awards, for over ten years. In addition to the awards,
            The Game Awards also feature premieres of new games and in-depth looks at previously announced ones.""";

        int res = Math.max(text.indexOf(word.toLowerCase()), text.indexOf(word.toUpperCase()));
        if (res == -1) System.out.printf("Word \"%s\" is not in the text\n", word);
        else System.out.printf("Word \"%s\" is in the text\n", word);
    }


    public static void main(String[] args) {
        task_1_1(args);
        task_1_2(args);
        task_1_3();
        task_1_4();
        task_1_5();
        task_1_6();
        task_1_7(args);
        task_1_8(args, "game");
        task_1_8(args, "Game");
        task_1_8(args, "movie");
    }
}