package com.example.w4m3;

public class Model {
    String txt;
    String img;

    public Model(String txt, String img) {
        this.txt = txt;
        this.img = img;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {this.img = img;}
}