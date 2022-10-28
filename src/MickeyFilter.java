public class MickeyFilter extends World {
    public int red;
    public int blue;
    public int green;
    public void go(){
        System.out.println(".");
        plane.teleport(0, 0);
        plane.showBackGround();
        System.out.println(plane.howMuchRed());
        filter();
    }

    public void filter(){
        for(int row = 517; row <677; row = row +1){
            for(int col = 67; col<415; col = col+1){
                plane.teleport(col, row);
                red = plane.howMuchRed();
                blue = plane.howMuchBlue();
                green = plane.howMuchGreen();
                if(blue < 150 && red > 200) {
                    plane.setPixelColor(0, 255, 255);
                }
            }
        }
        for(int row = 345; row <520; row = row + 1){
            for(int col = 140; col < 275; col = col +1){
                plane.teleport(col, row);
                red = plane.howMuchRed();
                blue = plane.howMuchBlue();
                green = plane.howMuchGreen();
                if(red > 100 && 160 > green && blue < 250){
                    plane.setPixelColor(255, 255, 51);
                }
            }
        }
    }
}
