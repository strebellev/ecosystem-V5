package objects;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PVector;


public class Log {
	PApplet parent;
	ArrayList<PVector> log;
	public PVector position;
	
	int r;

	@SuppressWarnings("deprecation")
	public Log(PApplet p, PVector l){
		position = l.get();
		parent = p;
		r = 32;
		log = new ArrayList<PVector>();
	}
	
	@SuppressWarnings("deprecation")
	public void add(PVector l){
		log.add(l.get());
	}

	public void display(PApplet p){
		PImage img = parent.loadImage("res/vegetal/object/log.png");
		p.image(img, position.x-16, position.y-16);
	}
	
	public ArrayList<PVector> getLog(){
		return log;
	}
	
	public PVector position(){
		return position;
	}
	
	public float getR(){
		return r;
	}

}
