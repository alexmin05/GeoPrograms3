public class testforfinal extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        System.out.println(".");
        plane.teleport(0, 0);
        plane.showBackGround();
        System.out.println(plane.howMuchRed());
        greytogreen();
        darkbluetopurple();
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
}
