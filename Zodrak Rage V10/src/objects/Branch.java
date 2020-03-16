package objects;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PVector;


public class Branch {

	PApplet parent;
	ArrayList<PVector> branch;
	public PVector position;
	
	int r;

	@SuppressWarnings("deprecation")
	public Branch(PApplet p, PVector l){
		position = l.get();
		parent = p;
		r = 32;
		branch = new ArrayList<PVector>();
	}

	@SuppressWarnings("deprecation")
	public void add(PVector l){
		branch.add(l.get());
	}

	public void display(PApplet p){
		PImage img = parent.loadImage("res/vegetal/object/branch.png");
		p.image(img, position.x-16, position.y-16);
	}
	
	public ArrayList<PVector> getBranch(){
		return branch;
	}
	
	public PVector position(){
		return position;
	}
	
	public float getR(){
		return r;
	}


	
}
