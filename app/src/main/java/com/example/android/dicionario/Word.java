package com.example.android.dicionario;

import java.io.Serializable;

public class Word implements Serializable {

    private String word;
    private String translate;
    private String phrase;

    public Word(String w, String t, String p){
        word=w;
        translate=t;
        phrase=p;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }


}
