public class B0_BasicLoop extends World {

    public void go() {
        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.pausetime = 0;
        squareGrid(100);

    }

    public void squareGrid(int length){
        for(int row = 0; row < 8; row = row + 1)
        {
            squareRow(row, length);
        }

    }
    public void squareRow(int row, int length){
        for(int col = 0; col < 10; col = col+1) {
            plane.setColor(row * 25, 100, col * 20);
            plane.teleport(col * length, row * length);
            System.out.println(col);
            plane.square(length);
        }
        System.out.println("the loop is over");
    }
}
