package objects;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PVector;

public class FireCampLvl1 {
	PApplet parent;
	ArrayList<PVector> firecamplvl1;
	public PVector position;
	
	int r;
	
	public boolean gotFuel;
	public boolean lit;
	public boolean unlit;
	
	public float fuel;
	
	int animFirenumFrame = 5;
	int currentFrame = 0;
	
	PImage[] animFireLit = new PImage[animFirenumFrame];
	
	int previousDisplayTime;
	int deltaTime;
	
	@SuppressWarnings("deprecation")
	public FireCampLvl1(PApplet p, PVector l){
		position = l.get();
		parent = p;
		r = 32;
		
		fuel = 500;
		
		firecamplvl1 = new ArrayList<PVector>();
		
		
		animFireLit[0] = p.loadImage("res/object/fireCamplvl1/firecampLit0.png");
		animFireLit[1] = p.loadImage("res/object/fireCamplvl1/firecampLit1.png");
		animFireLit[2] = p.loadImage("res/object/fireCamplvl1/firecampLit2.png");
		animFireLit[3] = p.loadImage("res/object/fireCamplvl1/firecampLit3.png");
		animFireLit[4] = p.loadImage("res/object/fireCamplvl1/firecampLit4.png");
		
		deltaTime = 100; // animation speed +=fast -=slow
		previousDisplayTime = 0;
	}
	
	@SuppressWarnings("deprecation")
	public void add(PVector l){
		firecamplvl1.add(l.get());
	}

	public void display(PApplet p){
		if(unlit == true){
			
		}
		
		if(lit == true){
			if(p.millis() > previousDisplayTime + deltaTime){
				currentFrame++;
	    	    if (currentFrame > 2) { 
	    	      currentFrame = 0;
	    	    }
	    	    previousDisplayTime = p.millis();
			}
			p.image(animFireLit[currentFrame],position.x-16,position.y-48);
		}
		else{
			PImage img = parent.loadImage("res/object/fireCamplvl1/firecampUnlit.png");
			p.image(img, position.x-16, position.y-16);
		}
	}
	
	public void checkFire(){
		if(lit == true){
			unlit = false;
			fuel --;
		}
		if(fuel <= 0){
			unlit = true;
			lit = false;
		}
	}
	
	public ArrayList<PVector> getSouche(){
		return firecamplvl1;
	}
	
	public PVector position(){
		return position;
	}
	
	public float getR(){
		return r;
	}
}
