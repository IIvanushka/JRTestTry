package com.crud.service;

public class CreateInsertStrokes {
    public static void main(String[] args) {
        String inserts = "";
        for (int i = 1; i <= 40; i++) {

            System.out.printf("INSERT INTO book (TITLE,DESCRIPTION,AUTHOR,ISBN,PRINTYEAR)" +
                    " VALUES ('Title_%s','Description_%s','Author_%s','ISBN-1000_%s','" + (1960 + i) + "');\n", i, i, i, i);
        }
    }
}
