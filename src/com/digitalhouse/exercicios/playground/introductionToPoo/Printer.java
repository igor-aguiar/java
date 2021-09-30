package com.digitalhouse.exercicios.playground.introductionToPoo;

import java.util.ArrayList;
import java.util.List;

public class Printer {
    private List<FileToPrint> files = new ArrayList<>();

    public void addSpool(FileToPrint file){
        files.add(file);
    }

    public FileToPrint print(){
        FileToPrint print = files.get(0);
        files.remove(0);
        return print;
    }
}
