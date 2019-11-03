package com.hacksheffield5.hacksheffield5;

import android.widget.ImageView;

public class Cards {
    private String name;
    private String species;
    private String gender;
    private Integer image;

    public Cards(String name, String species, String gender, Integer Image) {
        this.name = name;
        this.species = species;
        this.gender = gender;
        this.image = image;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies(){
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getImage(){
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
