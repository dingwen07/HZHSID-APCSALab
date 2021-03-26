package app;

import images.*;

public class App {
    public static void main(String[] args) throws Exception {
        APImage originalImage = new APImage("src/cyberpunk.jpg");
        APImage newImage = originalImage.clone();

        for (int x = 0; x < newImage.getWidth(); x++){
            for (int y=0; y<newImage.getHeight();y++){
                int pixelValue = calcAvg(newImage.getPixel(x, y));
                newImage.setPixel(x, y, new Pixel(pixelValue, pixelValue, pixelValue));
            }
        }

        newImage.draw();

        for (int x = 1; x < originalImage.getWidth(); x++) {
            for (int y = 0; y < originalImage.getHeight() - 1; y++) {
                int pixelValue;
                if (calcDiff(originalImage.getPixel(x - 1, y), originalImage.getPixel(x, y + 1)) > 5) {
                    pixelValue = 0;
                } else {
                    pixelValue = 255;
                }
                newImage.setPixel(x, y, new Pixel(pixelValue, pixelValue, pixelValue));
            }
        }

        newImage.draw();
    }

    private static int calcAvg(Pixel p) {
        return (p.getRed() + p.getGreen() + p.getBlue()) / 3;
    }

    private static int calcDiff(Pixel a, Pixel b) {
        return Math.abs(calcAvg(a) - calcAvg(b));
    }
}