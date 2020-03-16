package objects;
import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PVector;

public class smallBranch {
	PApplet parent;
	ArrayList<PVector> smallbranch;
	public PVector position;
	
	int r;
	
	@SuppressWarnings("deprecation")
	public smallBranch(PApplet p, PVector l){
		position = l.get();
		parent = p;
		r = 32;
		smallbranch = new ArrayList<PVector>();
	}
	
	@SuppressWarnings("deprecation")
	public void add(PVector l){
		smallbranch.add(l.get());
	}

	public void display(PApplet p){
		PImage img = parent.loadImage("res/vegetal/object/smallBranch.png");
		p.image(img, position.x-16, position.y-16);
	}
	
	public ArrayList<PVector> getsmallBranch(){
		return smallbranch;
	}
	
	public PVector position(){
		return position;
	}
	
	public float getR(){
		return r;
	}

}
