package com.example.p1;

public class Question {
    private int id_image;

    private String question;
    private String choice1;
    private String choice2;
    private String choice3;
    private String choice4;
    private String answer;
    private boolean rated;


    private int id_image1, id_image2, id_image3, id_image4, id_imageCorrect;


    public Question(int id_image, String question, String choice1, String choice2, String choice3, String choice4, String answer) {
        this.id_image = id_image;
        this.question = question;
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.choice3 = choice3;
        this.choice4 = choice4;
        this.answer = answer;
        this.rated = false;
    }

    public Question(String question, int id_image1, int id_image2, int id_image3, int id_image4, int id_imageCorrect) {
        this.question = question;
        this.id_image1 = id_image1;
        this.id_image2 = id_image2;
        this.id_image3 = id_image3;
        this.id_image4 = id_image4;
        this.id_imageCorrect = id_imageCorrect;
        this.rated = false;
    }


    public int getId_image() {
        return id_image;
    }

    public void setId_image(int id_image) {
        this.id_image = id_image;
    }

    public String getQuestion() {
        System.out.println(question);
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getChoice1() {
        return choice1;
    }

    public void setChoice1(String choice1) {
        this.choice1 = choice1;
    }

    public String getChoice2() {
        return choice2;
    }

    public void setChoice2(String choice2) {
        this.choice2 = choice2;
    }

    public String getChoice3() {
        return choice3;
    }

    public void setChoice3(String choice3) {
        this.choice3 = choice3;
    }

    public String getChoice4() {
        return choice4;
    }

    public void setChoice4(String choice4) {
        this.choice4 = choice4;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isRated() {
        return rated;
    }

    public void setRated(boolean rated) {
        this.rated = rated;
    }

    public boolean isCorrect(String selectedAnswer) {
        System.out.println(selectedAnswer);
        System.out.println(answer);
        return answer.equals(selectedAnswer);

    }

    public int getId_image1() {
        return id_image1;
    }

    public void setId_image1(int id_image1) {
        this.id_image1 = id_image1;
    }

    public int getId_image2() {
        return id_image2;
    }

    public void setId_image2(int id_image2) {
        this.id_image2 = id_image2;
    }

    public int getId_image3() {
        return id_image3;
    }

    public void setId_image3(int id_image3) {
        this.id_image3 = id_image3;
    }

    public int getId_image4() {
        return id_image4;
    }

    public void setId_image4(int id_image4) {
        this.id_image4 = id_image4;
    }

    public int getId_imageCorrect() {
        return id_imageCorrect;
    }

    public void setId_imageCorrect(int id_imageCorrect) {
        this.id_imageCorrect = id_imageCorrect;
    }
}
