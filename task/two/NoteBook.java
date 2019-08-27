package by.etc.task.two;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NoteBook {

    private ArrayList<String> notesList;

    void setData(String topic, int day, int month, int year, String email, String message) {
        if (checkTopicAndMessage(topic, message) && checkDate(day + "." + month + "." + year) && checkEmail(email)) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(new File(
                        "D:\\IdeaProjects\\BasicsTasks\\src\\by\\etc\\task\\two\\Notes"), true));
                writer.write("\t --- ");
                writer.write("\n\t topic: " + topic);
                writer.write("\n\t date of create: " + day + "." + month + "." + year);
                writer.write("\n\t e-mail: " + email);
                writer.write("\n\t message: " + message);
                writer.write("\n\t --- \n");
                writer.close();
                System.out.println("Note is added\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    void clear() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File(
                    "D:\\IdeaProjects\\BasicsTasks\\src\\by\\etc\\task\\two\\Notes")));
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    String getData() {
        String text = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File("D:\\IdeaProjects\\BasicsTasks\\src\\by\\etc\\task\\two\\Notes")));
            while (reader.read() != -1) {
                text += reader.readLine() + "\n";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

    void setNewSequence(ArrayList<String> sequence){

        notesList=sequence;
    }

    void showSequence(){

        System.out.println(notesList);
    }

    void saveData(){
        clear();
        String[]saveInFile;
        saveInFile=decorate(notesList);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File(
                    "D:\\IdeaProjects\\BasicsTasks\\src\\by\\etc\\task\\two\\Notes"),true));
            for(int i = 0 ; i < saveInFile.length ;i++) {
                writer.write(saveInFile[i]);

            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    ArrayList<String> findNotesByTopic(String text) {

        return expression("topic:.+", text);
    }

    ArrayList<String> findNotesByDate(int day, int month, int year) {

        return expression("date of create:.+", day + "." + month + "." + year);
    }

    ArrayList<String> findNotesByEmail(String email) {

        return expression("e-mail:.+", email);
    }

    ArrayList<String> findNotesByMessage(String message) {

        return expression("message:.+", message);
    }

    ArrayList<String> findSentence(String sentence) {
        ArrayList<String> word = new ArrayList<>();
        Pattern patternSen = Pattern.compile(".*" + sentence + ".*");
        Matcher matcherSen = patternSen.matcher(getData());
        while (matcherSen.find()) {
            word.add(matcherSen.group());
        }
        return word;
    }

    ArrayList<String> sortByTopic() {

        return sortStr(expression("topic:.+"));
    }

    ArrayList<String> sortByEmail() {

        return sortStr( expression("e-mail:.+"));
    }

    ArrayList<String> sortByMessage() {

        return sortStr(expression("message:.+"));
    }

    ArrayList<String> sortByDate() {
        ArrayList<String> topics = expression("date of create:.+");
        ArrayList<Integer> date = new ArrayList<>();
        for (int i = 0; i < topics.size(); i++) {
            String[] mas = topics.get(i).split("\\.");
            date.add(Integer.valueOf(mas[0].trim()) + Integer.valueOf(mas[1].trim()) * 31 + Integer.valueOf(mas[2].trim()) * 365);
        }
        return sortInt(date);
    }


    private boolean checkTopicAndMessage(String topic, String message) {
        if (topic.matches("\\s*.+\\s*") && message.matches("\\s*.+\\s*")) {
            System.out.println("Topic and message are correct");
            return true;
        } else {
            System.out.println("Topic and message are wrong");
            return false;
        }

    }

    private boolean checkDate(String date) {
        if (date.matches("(([1-2]|)?[0-9]|[3][0-1])?\\.[1-9]([0-2]|)?\\.[0-9]+")) {
            System.out.println("Date is correct");
            return true;
        } else {
            System.out.println("Date is wrong");
            return false;
        }
    }

    private boolean checkEmail(String email) {
        if (email.matches("[a-zA-Z0-9_\\-]+@mail\\.ru")) {
            System.out.println("E-mail is correct");
            return true;
        } else {
            System.out.println("E-mail is wrong");
            return false;
        }
    }

    private ArrayList<String> expression(String expression, String text) {
        ArrayList<String> note = new ArrayList<>();
        ArrayList<String> textParts = getDividedParts();
        ArrayList<String> sentenceParts;
        ArrayList<String> wordParts;
        for (String t : textParts) {

            sentenceParts = getSentences(expression, t);

            for (String s : sentenceParts) {

                wordParts = getWords(text, s);

                for (String w : wordParts) {
                    if (w.trim().equals(text)) {
                        note.add(t + "\n");
                    }
                }
            }
        }
        return note;
    }

    private ArrayList<String> getDividedParts() {
        ArrayList<String> divideParts = new ArrayList<>();
        Pattern pattern = Pattern.compile("---");
        Matcher matcher = pattern.matcher(getData());
        int i = 0;
        int start = 0;
        int end;
        while (matcher.find()) {
            i++;
            if (i % 2 == 1) {
                start = matcher.start();
            } else {
                end = matcher.end();
                divideParts.add(getData().substring(start, end)+"\n");
                i = 0;
            }
        }
        return divideParts;
    }

    private ArrayList<String> getSentences(String expression, String text) {
        ArrayList<String> divideParts = new ArrayList<>();
        Pattern patternSen = Pattern.compile(expression);
        Matcher matcherSen = patternSen.matcher(text);
        while (matcherSen.find()) {
            divideParts.add(matcherSen.group());
        }
        return divideParts;
    }

    private ArrayList<String> getWords(String expression, String text) {

        return getSentences(expression, text);
    }

    private ArrayList<String> expression(String expression) {
        ArrayList<String> textParts = getDividedParts();
        ArrayList<String> sentenceParts;
        ArrayList<String> wordParts;
        ArrayList<String> words = new ArrayList<>();
        for (String t : textParts) {
            sentenceParts = getSentences(expression, t.trim());
            for (String s : sentenceParts) {
                wordParts = getWords(":.+", s);
                for (String w : wordParts) {
                    words.add(w.substring(1));
                }
            }
        }
        return words;
    }

    private ArrayList<String> sortInt(ArrayList<Integer> type) {
        ArrayList<String> text = getDividedParts();
        for (int i = 0; i < type.size(); i++) {
            for (int y = 0; y < type.size(); y++) {
                if (type.get(i) < type.get(y)) {
                    int replaceInt = type.get(i);
                    type.set(i, type.get(y));
                    type.set(y, replaceInt);

                    String replaceStr = text.get(i);
                    text.set(i, text.get(y));
                    text.set(y, replaceStr);
                }
            }
        }

        return text;
    }

    private ArrayList<String> sortStr(ArrayList<String> type) {
        ArrayList<String> text = getDividedParts();
        for (int i = 0; i < type.size(); i++) {
            for (int y = 0; y < type.size(); y++) {
                if (type.get(i).trim().charAt(0) < type.get(y).trim().charAt(0)) {
                    String replaceInt = type.get(i);
                    type.set(i, type.get(y));
                    type.set(y, replaceInt);

                    String replaceStr = text.get(i);
                    text.set(i, text.get(y));
                    text.set(y, replaceStr);
                }
            }
        }

        return text;
    }

    private String[]decorate(ArrayList<String> text){
       String[] decorate= new String[text.size()];
       for(int i = 0 ; i <text.size();i++){
           decorate[i]="";
           String[] decorating=text.get(i).split("\n");
           for(int y = 0 ; y < decorating.length ;y++){
               decorating[y]= "\t "+decorating[y]+"\n";
               decorate[i]+=decorating[y];
           }
       }
       return decorate;
    }
}