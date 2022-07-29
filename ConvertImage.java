package ru.netology.graphics.image;

public class ConvertImage implements TextColorSchema {

    private char[] typeOfSymbol = {'▇', '●', '◉', '◍', '◎', '○', '☉', '◌', '-'};

    @Override
    public char convert(int color) {
        return typeOfSymbol[color / (255 / 8)];
    }
}
