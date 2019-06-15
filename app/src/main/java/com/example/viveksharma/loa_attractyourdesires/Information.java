package com.example.viveksharma.loa_attractyourdesires;

public class Information {
    private String Title;
    private String Image;

    public Information(String title, String image) {
        Title = title;
        Image = image;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}
