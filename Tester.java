public class Tester{
  public static void main (String[] args){
    Animal bear = new Animal("bear",20, "I'm hungry");

    bear.speak();

    Bird parrot = new Bird("cereal",50,"Captain Cruch",2,"rainbow");
    parrot.speak();

    Animal a1= new Animal("hi",12,"yes");
    a1.speak();
    Bird b1= new Bird("no",13,"this is",3,"pink");
    b1.speak();
    //Bird b2= new Animal("school",52,"peanuts");
  // b2.speak();
    Animal a2= new Bird("fasdf",14,"i don't care",7,"blue");
      a2.speak();
  }
}
