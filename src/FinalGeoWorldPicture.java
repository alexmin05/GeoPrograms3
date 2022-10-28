public class FinalGeoWorldPicture extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        System.out.println(".");
        plane.teleport(0, 0);
        plane.showBackGround();
        System.out.println(plane.howMuchRed());
        squarefilter();
        int r = plane.random(1, 5);
        if (r == 1) {
            greytoblue();
            darkbluetored();
        }
        if (r == 2) {
            greytobronze();
            darkbluetogreen();
        }
        if (r == 3) {
            greytogreen();
            darkbluetopurple();
        }
        if (r == 4) {
            gradientsuit();
            gradientcape();
        }

    }


    public void greytoblue() {
        for (int row = 146; row < 635; row = row + 1) {
            for (int col = 138; col < 489; col = col + 1) {
                plane.teleport(col, row);
                red = plane.howMuchRed();
                blue = plane.howMuchBlue();
                green = plane.howMuchGreen();
                if (blue > 50 && red < 200 && green < 150) {
                    plane.setPixelColor(0, 128, 255);
                }
                if (blue > 50 && green > 150 && red < 200) {
                    plane.setPixelColor(0, 0, 225);
                }
            }
        }
    }

    public void darkbluetored() {
        for (int row = 9; row < 787; row = row + 1) {
            for (int col = 108; col < 773; col = col + 1) {
                plane.teleport(col, row);
                red = plane.howMuchRed();
                blue = plane.howMuchBlue();
                green = plane.howMuchGreen();
                if (red < 10 && green < 10) {
                    plane.setPixelColor(220, 0, 0);
                }
                if (red > 0 && green < 100 && blue < 200)
                    plane.setPixelColor(255, 0, 0);
            }
        }

    }

    public void greytobronze() {
        for (int row = 146; row < 635; row = row + 1) {
            for (int col = 138; col < 489; col = col + 1) {
                plane.teleport(col, row);
                red = plane.howMuchRed();
                blue = plane.howMuchBlue();
                green = plane.howMuchGreen();
                if (blue > 50 && red < 200 && green < 150) {
                    plane.setPixelColor(205, 127, 50);
                }
                if (blue > 50 && green > 150 && red < 200) {
                    plane.setPixelColor(80, 50, 20);
                }
            }
        }
    }

    public void darkbluetogreen() {
        for (int row = 9; row < 787; row = row + 1) {
            for (int col = 108; col < 773; col = col + 1) {
                plane.teleport(col, row);
                red = plane.howMuchRed();
                blue = plane.howMuchBlue();
                green = plane.howMuchGreen();
                if (red < 10 && green < 10) {
                    plane.setPixelColor(0, 153, 76);
                }
                if (red > 0 && green < 100 && blue < 200)
                    plane.setPixelColor(0, 102, 51);
            }
        }
    }

    public void greytogreen() {
        for (int row = 146; row < 635; row = row + 1) {
            for (int col = 138; col < 489; col = col + 1) {
                plane.teleport(col, row);
                red = plane.howMuchRed();
                blue = plane.howMuchBlue();
                green = plane.howMuchGreen();
                if (blue > 50 && red < 200 && green < 150) {
                    plane.setPixelColor(0, 204, 0);
                }
                if (blue > 50 && green > 150 && red < 200) {
                    plane.setPixelColor(0, 255, 0);
                }
            }
        }
    }

    public void darkbluetopurple() {
        for (int row = 9; row < 787; row = row + 1) {
            for (int col = 108; col < 773; col = col + 1) {
                plane.teleport(col, row);
                red = plane.howMuchRed();
                blue = plane.howMuchBlue();
                green = plane.howMuchGreen();
                if (red < 10 && green < 10) {
                    plane.setPixelColor(102, 0, 204);
                }
                if (red > 0 && green < 100 && blue < 200)
                    plane.setPixelColor(76, 0, 153);
            }
        }
    }

    public void gradientsuit() {
        for (int row = 146; row < 635; row = row + 1) {
            for (int col = 138; col < 489; col = col + 1) {
                plane.teleport(col, row);
                red = plane.howMuchRed();
                blue = plane.howMuchBlue();
                green = plane.howMuchGreen();
                if (blue > 50 && red < 200 && green < 150) {
                    plane.setPixelColor(200, (int) col / 4, (int) row / 3);
                }
                if (blue > 50 && green > 150 && red < 200) {
                    plane.setPixelColor(50, (int) col / 2, (int) row / 5);

                }
            }
        }
    }

    public void gradientcape() {
        for (int row = 9; row < 787; row = row + 1) {
            for (int col = 108; col < 773; col = col + 1) {
                plane.teleport(col, row);
                red = plane.howMuchRed();
                blue = plane.howMuchBlue();
                green = plane.howMuchGreen();
                if (red < 10 && green < 10) {
                    plane.setPixelColor((int) col / 8, 70, 80);
                }
                if (red > 0 && green < 100 && blue < 200) {
                    plane.setPixelColor(0, (int) col / 5, 0);
                }
            }
        }
    }

    public void squarefilter(){
        for (int row = 0; row <= 800; row = row +1){
            for (int col = 0; col <= 1000; col = col + 1){
                plane.teleport(col, row);
                red = plane.howMuchRed();
                blue = plane.howMuchBlue();
                green = plane.howMuchGreen();
                if (red > 200 && green > 220 && blue > 220) {
                    plane.setPixelColor(255, 255, 255);
                }

            }
        }
    }
}