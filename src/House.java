public class House extends World{

   public void go() {
       plane.teleport(230, 465);
       person();
   }

   public void pickShape(int x){
       if(x == 1){

         square(8,90);
       }

   }

   public void square(int length, int degrees){

       plane.isTrail=true;
       plane.turn(degrees);
       plane.move(length);
       plane.turn(degrees);
       plane.move(length);
       plane.turn(degrees);
       plane.move(length);
       plane.turn(degrees);
       plane.move(length);
       plane.turn(180);
       plane.move(length);
       plane.turn(330);
       plane.move(length);
       plane.turn(240);
       plane.move(length);

   }

    public void person() {
        plane.isTrail = true;
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

    public void myName(){

       plane.setColor(plane.random(0, 255), plane.random(0, 255), plane.random(0, 225));
       plane.isTrail=true;
       plane.turn(165);
       plane.move(100);
       plane.turn(-150);
       plane.move(100);
       plane.teleport(242, 415);
       plane.startingAngle(0);
       plane.move(25);
       plane.teleport(325, 435);
       plane.startingAngle(90);
       plane.move(30);
       plane.turn(90);
       plane.move(30);
       plane.turn(90);
       plane.move(95);
       plane.turn(90);
       plane.move(30);
       plane.turn(180);
       plane.move(60);
       plane.teleport(420, 465);
       plane.startingAngle(270);
       plane.move(95);
       plane.turn(200);
       plane.move(95);
       plane.turn(140);
       plane.move(95);
       plane.turn(200);
       plane.move(100);


    }

}
