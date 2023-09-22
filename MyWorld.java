import mayflower.*;


public class MyWorld extends World {

	private Cat cat;
	private Jack jack;
	private Ninja ninja;
	private Dog dog;
	private Block block;
	private Block block2;
    public MyWorld() 
    {
    	setBackground("img/BG/BG.png");
    	
    	block = new Block();
    	addObject(block, 400, 500);
    	block2 = new Block();
    	addObject(block2, 528, 372);
    	cat = new Cat();
    	addObject(cat, 400, 100);
    	jack = new Jack();
    	addObject(jack, 200, 200);
    	ninja = new Ninja();
    	addObject(ninja, 300, 300);
    	dog = new Dog();
    	addObject(dog, 100, 400);
    	Mayflower.showBounds(true);
    }
    
    public void act()
    {
    }
    
}