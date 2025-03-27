package com.mycompany.Project;

public class Commentator extends Person {

   
    private int views;
    private String language;

    public Commentator() {

    }


    public Commentator(int views, String language, int ID, String name) {
        super(ID, name);
        this.views = views;
        this.language = language;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return String.format("%sviews: %d%nlanguage:%s%n", super.toString(), views, language);

    }

}
