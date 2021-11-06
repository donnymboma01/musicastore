package be.henallux.java.website.model;

public class Translation {

    private Integer translation_id;
    private String label;
    private Language language;
    private Category category;

    public Translation(Integer translation_id,String label,Language language,Category category){
        this.category = category;
        this.label = label;
        this.translation_id = translation_id;
        this.language = language;
    }

    public Translation(){}

    public Integer getTranslation_id() {
        return translation_id;
    }

    public void setTranslation_id(Integer translation_id) {
        this.translation_id = translation_id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}
