

public class threethingsonground extends World {

    public void go() {
        int r = plane.random(1,4);
            if(r == 1){
                plane.teleport(500, 500);
                for(int x=1;x<=12;x=x+1){
                    house(plane.random(25, 50),90);
                }
            }
            if(r == 2){
                plane.teleport(500, 500);
                tree();
            }
            if(r == 3){
                plane.teleport(500, 500);
                person();
            }
        }
        public void house(int length, int degrees){
            plane.isTrail=true;
            plane.turn(degrees);
            plane.setColor(plane.random(0, 255), plane.random(0, 255), plane.random(0, 225));
            plane.move(length);
            plane.turn(degrees);
            plane.setColor(plane.random(0, 255), plane.random(0, 255), plane.random(0, 225));
            plane.move(length);
            plane.turn(degrees);
            plane.setColor(plane.random(0, 255), plane.random(0, 255), plane.random(0, 225));
            plane.move(length);
            plane.turn(degrees);
            plane.setColor(plane.random(0, 255), plane.random(0, 255), plane.random(0, 225));
            plane.move(length);
            plane.turn(180);
            plane.setColor(plane.random(0, 255), plane.random(0, 255), plane.random(0, 225));
            plane.move(length);
            plane.turn(330);
            plane.setColor(plane.random(0, 255), plane.random(0, 255), plane.random(0, 225));
            plane.move(length);
            plane.turn(240);
            plane.setColor(plane.random(0, 255), plane.random(0, 255), plane.random(0, 225));
            plane.move(length);


    }
    public void tree(){
        plane.isTrail=true;
        plane.setColor(plane.random(0, 255), plane.random(0, 255), plane.random(0, 225));
        plane.move(100);
        plane.turn(180);
        plane.setColor(plane.random(0, 255), plane.random(0, 255), plane.random(0, 225));
        plane.move(100);
        plane.turn(270);
        plane.setColor(plane.random(0, 255), plane.random(0, 255), plane.random(0, 225));
        plane.move(75);
        plane.turn(90);
        plane.setColor(plane.random(0, 255), plane.random(0, 255), plane.random(0, 225));
        plane.move(200);
        plane.turn(90);
        plane.setColor(plane.random(0, 255), plane.random(0, 255), plane.random(0, 225));
        plane.move(200);
        plane.turn(90);
        plane.setColor(plane.random(0, 255), plane.random(0, 255), plane.random(0, 225));
        plane.move(200);
        plane.turn(90);
        plane.setColor(plane.random(0, 255), plane.random(0, 255), plane.random(0, 225));
        plane.move(75);
        plane.turn(270);
        plane.setColor(plane.random(0, 255), plane.random(0, 255), plane.random(0, 225));
        plane.move(100);

    }

    public void person() {
        plane.isTrail = true;
        plane.trailWidth = plane.random(0, 50);
        plane.setColor(plane.random(0, 255), plane.random(0, 255), plane.random(0, 225));
        plane.pausetime=0;
        plane.startingAngle(300);
        plane.move(75);
        plane.turn(240);
        plane.move(75);
        plane.turn(180);
        plane.move(75);
        plane.turn(330);
        plane.move(125);
        plane.turn(210);
        plane.move(75);
        plane.turn(180);
        plane.move(75);
        plane.turn(120);
        plane.move(75);
        plane.turn(180);
        plane.move(75);
        plane.startingAngle(0);
        plane.circle(6.5);
    }


}
