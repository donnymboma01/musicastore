package be.henallux.java.website.model;

public class Language {

    private Integer language_id;

    public Language(Integer language_id){
        this.language_id = language_id;
    }

    public Language(){}

    public Integer getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(Integer language_id) {
        this.language_id = language_id;
    }
}
