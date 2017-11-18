package nyc.c4q.mustafizurmatin.quiz.model;

/**
 * Created by c4q on 11/16/17.
 */

public class SiliconValleyModel {
    private String url;
    private String question;
    private String[] choices;

    public SiliconValleyModel(String url, String question, String[] choices) {
        this.url = url;
        this.question = question;
        this.choices = choices;
    }

    public String getUrl() {
        return url;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getChoices() {
        return choices;
    }
}
