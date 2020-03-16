package entity;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;
import processing.core.PVector;

public class Feuillu {
	PApplet parent;
	ArrayList<PVector> feuillu;
	public PVector position;
	
	int r;
	public float PV;
	public boolean dead;
	PImage img;
	
	@SuppressWarnings("deprecation")
	public Feuillu(PImage tempImg,PApplet p,PVector l){
		position = l.get();
		parent = p;
		r = 32;
		feuillu = new ArrayList<PVector>();
		img = tempImg;
		PV = 200;
		
		
	}
	
	@SuppressWarnings("deprecation")
	public void add(PVector l){
		feuillu.add(l.get());
	}
	
	public void checkDead(){
		if(PV <= 0) dead = true;
	}
	
	public void display(PApplet p){
		p.ellipseMode(PConstants.CENTER);
		p.fill(0);
		//p.ellipse(position.x, position.y, r, r);
		p.image(img, position.x-96, position.y-180);
		//p.text(PV, position.x, position.y);
	}
	
	public ArrayList<PVector> getFeuillu(){
		return feuillu;
	}
	
	public PVector position(){
		return position;
	}
	
	public float getR(){
		return r;
	}
}
