package by.etc.programming_with_class.aggregation_and_composition.task_one;

public class Sentence {
    private Word[] words;
    private String sentence;


    public Sentence(Word[] words) {
        this.words = words;
        makeSentence();
    }


    public String getSentence() {
        return sentence;
    }


    void makeSentence() {
        sentence = "";
        for (Word w : words) {
            sentence += w.getWord();
        }
        sentence += ".";
    }


}
