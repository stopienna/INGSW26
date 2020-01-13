package com.example.ingsw;

public class controllerLogin {
    private login model;
    private login view;

    public controllerLogin ( login model, login view) {
        this.model = model;
        this.view = view;
    }
 public String getNome(){
        return model.getName();
 }
 public String getPass (){
        return model.getPass();
 }
}

