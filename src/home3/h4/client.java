package home3.h4;

public class client {
    public static void main(String[] args) {
        BMP bmp = new BMP();
        bmp.setLvjing(new blur());
        bmp.process();

        bmp.setLvjing(new Sharpen());
        bmp.process();

        GIF gif = new GIF();
        gif.setLvjing(new blur());
        gif.process();

        gif.setLvjing(new Sharpen());
        gif.process();

    }}
