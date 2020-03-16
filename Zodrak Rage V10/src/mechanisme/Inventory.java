package mechanisme;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;
import processing.core.PVector;
import processing.event.KeyEvent;
import processing.event.MouseEvent;



public class Inventory {
	PApplet parent;
	ArrayList<PVector> inventory;
	
	
	//des int pour chaque objets et pour objets total
	
	
	int mode;
	int craftMode;
	int craftSlot;
	
	public boolean inventoryOpen;
	public boolean craftingOpen;
	
	boolean[] keys=new boolean[8];
	
	boolean[] mouses = new boolean[2];
	
	boolean okayI = true;
	boolean okayE = true;
	boolean okayC = true;
	public boolean actionE = false;
	
	boolean mousseLeft = true;
	boolean mousseRight = true;
	public boolean actionLM ;
	public boolean actionRM ;
	int rightClickTime;
	int leftClickTime;
	//dragdrop
	public boolean dragLeft;
	public boolean canDrop1;
	public boolean canDrop2;
	public boolean canDrop3;
	public boolean inHand1;
	public boolean inHand2;
	public boolean inHand3;
	public boolean locked;
	public boolean distInvSlot12;
	public boolean distInvSlot14;
	public boolean distInvSlot15;
	public boolean distHandSlot1;
	public boolean distHandSlot2;
	public boolean distHandSlot3;
	
	//racourcis
	int shortcut1;
	public boolean shortCut1;
	public boolean shortCut1Full;
	boolean okay1;
	
	int shortcut2;
	public boolean shortCut2;
	public boolean shortCut2Full;
	boolean okay2;
	
	int shortcut3;
	public boolean shortCut3;
	public boolean shortCut3Full;
	boolean okay3;
	
	//cut tree
	public boolean cutTree;
	
	//spear attack
	public boolean spearAttack;
	
	public int invMushroom;
	public int invRedBerry;
	public int invJellowBerry;
	public int invGrass;
	public int invRock;
	public int invBranch;
	public int invLog;
	public int invSmallBranch;
	public int invString;
	public int invFurr;
	public int invMeat;
	public int invFlower;
	
	public int invStoneAxe;
	public int invFire;
	public int invStoneKnife;
	public int invStoneLance;
	public int invArrow;
	public int invBow;
	public int invCookedMeat;
	
	public int invTent;
	public int invWoodStock;
	public int invColet;
	public int invTrap;
	public int invRope;
	public int invStick;
	public int invPointyStick;
	public int invWell;
	public int invBed;
	public int invStock;
	
	
	
	//test zoom
	public float zoom = 1200;
	
	
	String objectmush = "mushroom";
	
	
	public Inventory(PApplet p){
		parent = p;
		inventory = new ArrayList<PVector>();
		p.registerMethod("keyEvent", this);
		p.registerMethod("mouseEvent", this);
		
		
	}
	
	public void update(){
		if(invMushroom < 0) invMushroom = 0;
	}
	
	public void invDisplay(PApplet p, PVector pos, PVector screen){

		PImage imgmush = parent.loadImage("res/vegetal/champi/champi1.png");
		PImage imgRedBerry = parent.loadImage("res/vegetal/berry/redberry.png");
		PImage imgJellowBerry = parent.loadImage("res/vegetal/berry/jellowberry.png");
		PImage imgGrass = parent.loadImage("res/vegetal/grassfeuillu/grassfeuillu1.png");
		PImage imgRock = parent.loadImage("/res/vegetal/rock/rock3.png");
		PImage imgBranch = parent.loadImage("res/vegetal/object/branch.png");
		PImage imgLog = parent.loadImage("res/vegetal/object/log.png");
		PImage imgSmallBranch = parent.loadImage("res/vegetal/object/smallBranch.png");
		PImage imgString = parent.loadImage("res/vegetal/object/string.png");
		
		PImage imgMeat = parent.loadImage("res/animal/meat/meat.png");
		PImage imgFurr = parent.loadImage("res/vegetal/object/furr.png");
		
		PImage imgAxe = parent.loadImage("res/icons/Axe.png");
		PImage imgFireCamp = parent.loadImage("res/icons/Firecamp.png");
		PImage imgKnife = parent.loadImage("res/icons/Dagger.png");
		PImage imgSpear = parent.loadImage("res/icons/Spear.png");
		PImage imgArrow = parent.loadImage("res/icons/Arrow.png");
		PImage imgBow = parent.loadImage("res/icons/Bow.png");
		
		PImage imgTent = parent.loadImage("res/object/tent0.png");
		PImage imgTentLogo = parent.loadImage("res/object/tent0Logo.png");
		PImage imgWoodStock = parent.loadImage("res/object/woodstock0.png");
		PImage imgWoodStockLogo = parent.loadImage("res/object/woodstock0Logo.png");
		PImage imgColet = parent.loadImage("res/object/colet.png");
		PImage imgColetLogo = parent.loadImage("res/object/coletLogo.png");
		PImage imgTrap = parent.loadImage("res/object/trap0.png");
		PImage imgTrapLogo = parent.loadImage("res/object/trap0Logo.png");
		PImage imgRope = parent.loadImage("res/object/ropeLogo.png");
		PImage imgStick = parent.loadImage("res/object/stickLogo.png");
		PImage imgPointyStick = parent.loadImage("res/object/pointyStickLogo.png");
		PImage imgWell = parent.loadImage("res/object/well0.png");
		PImage imgWellLogo = parent.loadImage("res/object/well0Logo.png");
		PImage imgCoockedMeat = parent.loadImage("res/object/coockedMeatLogo.png");
		PImage imgBedLogo = parent.loadImage("res/object/bed0Logo.png");
		PImage imgStockLogo = parent.loadImage("res/object/stock0.png");
		
		switch(mode){
			case 0:
				inventoryOpen = false;
				break;
			case 1:
				inventoryOpen = true;
				//display inventory
				p.fill(255);
				p.rectMode(PConstants.CENTER);
				p.rect(pos.x + screen.x -200 , pos.y +screen.y -152, 320, 224);
				p.noFill();
				
				grid(pos, screen);
				
				
				//display text inv
				//1
				if(invMushroom > 0){
					p.fill(0);
					p.image(imgmush, pos.x + screen.x -362 , pos.y +screen.y -268);
					p.text(invMushroom, pos.x + screen.x -337 , pos.y +screen.y -238);
				}
				//2
				if(invRedBerry > 0){
					p.fill(0);
					p.image(imgRedBerry, pos.x + screen.x -320 , pos.y +screen.y -263);
					p.text(invRedBerry, pos.x + screen.x -305 , pos.y +screen.y -238);
					
				}
				//3
				if(invGrass > 0){
					p.fill(0);
					p.image(imgGrass, pos.x + screen.x -298 , pos.y +screen.y -268);
					p.text(invGrass, pos.x + screen.x -278 , pos.y +screen.y -238);
				}
				//4
				if(invRock > 0){
					p.fill(0);
					p.image(imgRock, pos.x + screen.x -266 , pos.y +screen.y -268);
					p.text(invRock, pos.x + screen.x -248 , pos.y +screen.y -238);
				}
				//5
				if(invJellowBerry > 0){
					p.fill(0);
					p.image(imgJellowBerry, pos.x + screen.x -230 , pos.y +screen.y -263);
					p.text(invJellowBerry, pos.x + screen.x -234 , pos.y +screen.y -238);
				}
				//6
				if(invBranch > 0){
					p.fill(0);
					p.image(imgBranch, pos.x + screen.x -202 , pos.y +screen.y -268);
					p.text(invBranch, pos.x + screen.x -175 , pos.y +screen.y -238);
				}
				//7
				if(invSmallBranch > 0){
					p.fill(0);
					p.image(imgSmallBranch, pos.x + screen.x -170 , pos.y +screen.y -268);
					p.text(invSmallBranch, pos.x + screen.x -143 , pos.y +screen.y -238);
				}
				//8
				if(invFurr > 0){
					p.fill(0);
					p.image(imgFurr, pos.x + screen.x -138 , pos.y +screen.y -268);
					p.text(invFurr, pos.x + screen.x -111 , pos.y +screen.y -238);
				}
				//9
				if(invMeat > 0){
					p.fill(0);
					p.image(imgMeat, pos.x + screen.x -106 , pos.y +screen.y -268);
					p.text(invMeat, pos.x + screen.x -79 , pos.y +screen.y -238);
				}
				//10 logg
				if(invLog > 0){
					p.fill(0);
					p.image(imgLog, pos.x + screen.x -74 , pos.y +screen.y -268);
					p.text(invLog, pos.x + screen.x -47 , pos.y +screen.y -238);
				}
				
				//11
				if(invString > 0){
					p.fill(0);
					p.image(imgString, pos.x + screen.x -362 , pos.y +screen.y -236);
					p.text(invString, pos.x + screen.x -337 , pos.y +screen.y -206);
				}
				//12 stone axe
				if(invStoneAxe > 0){
					p.fill(0);
					p.image(imgAxe, pos.x + screen.x -330 , pos.y +screen.y -234);
					p.text(invStoneAxe, pos.x + screen.x -305 , pos.y +screen.y -206);
				}
				//13 fire unlit
				if(invFire > 0){
					p.fill(0);
					p.image(imgFireCamp, pos.x + screen.x -298 , pos.y +screen.y -234);
					p.text(invFire, pos.x + screen.x -273 , pos.y +screen.y -206);
				}
				//14 stone knife
				if(invStoneKnife > 0){
					p.fill(0);
					p.image(imgKnife, pos.x + screen.x -266 , pos.y +screen.y -234);
					p.text(invStoneKnife, pos.x + screen.x -241 , pos.y +screen.y -206);
				}
				//15 stone spear
				if(invStoneLance > 0){
					p.fill(0);
					p.image(imgSpear, pos.x + screen.x -234 , pos.y +screen.y -234);
					p.text(invStoneLance, pos.x + screen.x -209 , pos.y +screen.y -206);
				}
				//16 arrow
				if(invArrow > 0){
					p.fill(0);
					p.image(imgArrow, pos.x + screen.x -202 , pos.y +screen.y -234);
					p.text(invArrow, pos.x + screen.x -177 , pos.y +screen.y -206);
				}
				//17 bow
				if(invBow > 0){
					p.fill(0);
					p.image(imgBow, pos.x + screen.x -170 , pos.y +screen.y -234);
					p.text(invBow, pos.x + screen.x -145 , pos.y +screen.y -206);
				}
				//18 coocked meat
				if(invCookedMeat > 0){
					p.fill(0);
					p.image(imgCoockedMeat, pos.x + screen.x -138 , pos.y +screen.y -234);
					p.text(invCookedMeat, pos.x + screen.x -113 , pos.y +screen.y -206);
				}
				//19 stick
				if(invStick > 0){
					p.fill(0);
					p.image(imgStick, pos.x + screen.x -106 , pos.y +screen.y -234);
					p.text(invStick, pos.x + screen.x -81 , pos.y +screen.y -206);
				}
				//20 pointyStick
				if(invPointyStick > 0){
					p.fill(0);
					p.image(imgPointyStick, pos.x + screen.x -74 , pos.y +screen.y -234);
					p.text(invPointyStick, pos.x + screen.x -49 , pos.y +screen.y -206);
				}
				//21 tentlvl0
				if(invTent > 0){
					p.fill(0);
					p.image(imgTentLogo, pos.x + screen.x -362 , pos.y +screen.y -202);
					p.text(invTent, pos.x + screen.x -337 , pos.y +screen.y -174);
				}
				//22 bedlvl0
				if(invBed > 0){
					p.fill(0);
					p.image(imgBedLogo, pos.x + screen.x -330 , pos.y +screen.y -202);
					p.text(invBed, pos.x + screen.x -305 , pos.y +screen.y -174);
				}
				//23 stocklvl0
				if(invStock > 0){
					p.fill(0);
					p.image(imgStockLogo, pos.x + screen.x -298 , pos.y +screen.y -202);
					p.text(invStock, pos.x + screen.x -273 , pos.y +screen.y -174);
				}
				//24 woodstocklvl0
				if(invWoodStock > 0){
					p.fill(0);
					p.image(imgWoodStock, pos.x + screen.x -266 , pos.y +screen.y -202);
					p.text(invWoodStock, pos.x + screen.x -241 , pos.y +screen.y -174);
				}
				
				
				break;
		}
		
		
		//racourcis
		switch(shortcut1){
			case 0:
				shortCut1 = false;
				break;
			case 1:
				shortCut1 = true;
				if(inventoryOpen = true){
					p.strokeWeight(2);
					p.rect(pos.x + screen.x -346, pos.y +screen.y -56, 32, 32);
					p.strokeWeight(1);
				}
				break;
		}
		
		switch(shortcut2){
			case 0:
				shortCut2 = false;
				break;
			case 1:
				shortCut2 = true;
				if(inventoryOpen = true){
					p.strokeWeight(2);
					p.rect(pos.x + screen.x -314, pos.y +screen.y -56, 32, 32);
					p.strokeWeight(1);
				}
				break;
		}
		
		switch(shortcut3){
			case 0:
				shortCut3 = false;
				break;
			case 1:
				shortCut3 = true;
				if(inventoryOpen = true){
					p.strokeWeight(2);
					p.rect(pos.x + screen.x -282, pos.y +screen.y -56, 32, 32);
					p.strokeWeight(1);
				}
				break;
		}
		
	}
	
	
	
	public void invCrafting(PApplet p, PVector pos, PVector screen){
		PImage imgmush = parent.loadImage("res/vegetal/champi/champi1.png");
		PImage imgRedBerry = parent.loadImage("res/vegetal/berry/redberry.png");
		PImage imgJellowBerry = parent.loadImage("res/vegetal/berry/jellowberry.png");
		PImage imgGrass = parent.loadImage("res/vegetal/grassfeuillu/grassfeuillu1.png");
		PImage imgRock = parent.loadImage("/res/vegetal/rock/rock3.png");
		PImage imgBranch = parent.loadImage("res/vegetal/object/branch.png");
		PImage imgLog = parent.loadImage("res/vegetal/object/log.png");
		PImage imgSmallBranch = parent.loadImage("res/vegetal/object/smallBranch.png");
		PImage imgString = parent.loadImage("res/vegetal/object/string.png");
		
		PImage imgMeat = parent.loadImage("res/object/meatLogo.png");
		PImage imgFurr = parent.loadImage("res/vegetal/object/furr.png");
		
		PImage imgAxe = parent.loadImage("res/icons/Axe.png");
		PImage imgFireCamp = parent.loadImage("res/icons/Firecamp.png");
		PImage imgKnife = parent.loadImage("res/icons/Dagger.png");
		PImage imgSpear = parent.loadImage("res/icons/Spear.png");
		PImage imgArrow = parent.loadImage("res/icons/Arrow.png");
		PImage imgBow = parent.loadImage("res/icons/Bow.png");
		
		PImage imgStick = parent.loadImage("res/object/stickLogo.png");
		PImage imgPointyStick = parent.loadImage("res/object/pointyStickLogo.png");
		PImage imgCoockedMeat = parent.loadImage("res/object/coockedMeatLogo.png");
		
		PImage imgTentLogo = parent.loadImage("res/object/tent0Logo.png");
		PImage imgWoodStockLogo = parent.loadImage("res/object/woodstock0Logo.png");
		PImage imgColetLogo = parent.loadImage("res/object/coletLogo.png");
		PImage imgTrapLogo = parent.loadImage("res/object/trap0Logo.png");
		PImage imgWellLogo = parent.loadImage("res/object/well0Logo.png");
		PImage imgRope = parent.loadImage("res/object/ropeLogo.png");
		PImage imgBedLogo = parent.loadImage("res/object/bed0Logo.png");
		
		switch(craftMode){
		case 0:
			craftingOpen = false;
			break;
		case 1: 
			craftingOpen = true;
			//display crafting
			
			p.fill(204,204,204);
			p.rectMode(PConstants.CORNER);
			p.rect(pos.x + screen.x -360 , pos.y +screen.y -361, 320, 96); // check position
			p.noFill();
			grid2(pos, screen);
			
			p.fill(204,204,204);
			p.rectMode(PConstants.CORNER);
			p.rect(pos.x + screen.x -457 , pos.y +screen.y -361, 96, 96); // check position
			p.noFill();
			
			parent.noFill();
			p.rectMode(PConstants.CORNER);
			parent.stroke(0);
			parent.strokeWeight(1);
			parent.rect(pos.x + screen.x -457 , pos.y +screen.y -361, 96, 96);
			parent.noStroke();
			
			///les icones dans le grid a gauche
			
			p.image(imgString, pos.x + screen.x -361 , pos.y +screen.y -361);
			p.image(imgAxe, pos.x + screen.x -329 , pos.y +screen.y -359);
			p.image(imgFireCamp, pos.x + screen.x -295 , pos.y +screen.y -359);
			p.image(imgKnife, pos.x + screen.x -263 , pos.y +screen.y -361);
			p.image(imgSpear, pos.x + screen.x -231 , pos.y +screen.y -361);
			p.image(imgArrow, pos.x + screen.x -199 , pos.y +screen.y -361);
			p.image(imgBow, pos.x + screen.x -167 , pos.y +screen.y -361);
			p.image(imgStick, pos.x + screen.x -135 , pos.y +screen.y -361);
			p.image(imgPointyStick, pos.x + screen.x -103 , pos.y +screen.y -361);
			p.image(imgCoockedMeat, pos.x + screen.x -71 , pos.y +screen.y -361);
			
			p.image(imgTentLogo, pos.x + screen.x -361 , pos.y +screen.y -329);
			p.image(imgWoodStockLogo, pos.x + screen.x -329 , pos.y +screen.y -329);
			p.image(imgColetLogo, pos.x + screen.x -297 , pos.y +screen.y -329);
			p.image(imgTrapLogo, pos.x + screen.x -265 , pos.y +screen.y -329);
			p.image(imgWellLogo, pos.x + screen.x -233 , pos.y +screen.y -329);
			p.image(imgRope, pos.x + screen.x -201 , pos.y +screen.y -329);
			p.image(imgBedLogo, pos.x + screen.x -169 , pos.y +screen.y -329);
			
			
			
			///les case craftSlot a droite
			switch(craftSlot){
				case 0:
					
					break;
				case 1:
					p.image(imgString, pos.x + screen.x -425 , pos.y +screen.y -361);
					p.image(imgGrass, pos.x + screen.x -457 , pos.y +screen.y -329);
					p.fill(0);
					p.text(invGrass + "/5", pos.x + screen.x -428 , pos.y +screen.y -300);
					p.noFill();
					break;
				case 2:
					p.image(imgAxe, pos.x + screen.x -425 , pos.y +screen.y -359);
					p.fill(0);
					p.image(imgBranch, pos.x + screen.x -457 , pos.y +screen.y -329);
					p.text(invBranch + "/1", pos.x + screen.x -426 , pos.y +screen.y -300);
					p.image(imgRock, pos.x + screen.x -457 , pos.y +screen.y -297);
					p.text(invRock + "/1", pos.x + screen.x -428 , pos.y +screen.y -268);
					p.image(imgString, pos.x + screen.x -410 , pos.y +screen.y -329);
					p.text(invString + "/1", pos.x + screen.x -383 , pos.y +screen.y -300);
					p.noFill();
					
					break;	
				case 3:
					p.image(imgFireCamp, pos.x + screen.x -425 , pos.y +screen.y -361);
					p.fill(0);
					p.image(imgBranch, pos.x + screen.x -457 , pos.y +screen.y -329);
					p.text(invBranch + "/10", pos.x + screen.x -426 , pos.y +screen.y -300);
					p.noFill();
					break;
				case 4:
					p.image(imgKnife, pos.x + screen.x -425 , pos.y +screen.y -361);
					p.fill(0);
					p.image(imgBranch, pos.x + screen.x -457 , pos.y +screen.y -329);
					p.text(invBranch + "/1", pos.x + screen.x -426 , pos.y +screen.y -300);
					p.image(imgRock, pos.x + screen.x -457 , pos.y +screen.y -297);
					p.text(invRock + "/1", pos.x + screen.x -428 , pos.y +screen.y -268);
					p.image(imgString, pos.x + screen.x -410 , pos.y +screen.y -329);
					p.text(invString + "/1", pos.x + screen.x -383 , pos.y +screen.y -300);
					p.noFill();
					break;
				case 5:
					p.image(imgSpear, pos.x + screen.x -425 , pos.y +screen.y -361);
					p.fill(0);
					p.image(imgBranch, pos.x + screen.x -457 , pos.y +screen.y -329);
					p.text(invBranch + "/1", pos.x + screen.x -426 , pos.y +screen.y -300);
					p.image(imgRock, pos.x + screen.x -457 , pos.y +screen.y -297);
					p.text(invRock + "/1", pos.x + screen.x -428 , pos.y +screen.y -268);
					p.image(imgString, pos.x + screen.x -410 , pos.y +screen.y -329);
					p.text(invString + "/1", pos.x + screen.x -383 , pos.y +screen.y -300);
					p.noFill();
					break;
				case 6:
					p.image(imgArrow, pos.x + screen.x -425 , pos.y +screen.y -361);
					p.fill(0);
					p.image(imgBranch, pos.x + screen.x -457 , pos.y +screen.y -329);
					p.text(invBranch + "/1", pos.x + screen.x -426 , pos.y +screen.y -300);
					p.image(imgRock, pos.x + screen.x -457 , pos.y +screen.y -297);
					p.text(invRock + "/1", pos.x + screen.x -428 , pos.y +screen.y -268);
					p.image(imgString, pos.x + screen.x -410 , pos.y +screen.y -329);
					p.text(invString + "/1", pos.x + screen.x -383 , pos.y +screen.y -300);
					p.noFill();
					break;
				case 7:
					p.image(imgBow, pos.x + screen.x -425 , pos.y +screen.y -361);
					p.fill(0);
					p.image(imgStick, pos.x + screen.x -457 , pos.y +screen.y -329);
					p.text(invStick + "/1", pos.x + screen.x -426 , pos.y +screen.y -300);
					p.image(imgString, pos.x + screen.x -457 , pos.y +screen.y -297);
					p.text(invString + "/1", pos.x + screen.x -428 , pos.y +screen.y -268);
					p.noFill();
					break;	
				case 8:
					p.image(imgStick, pos.x + screen.x -425 , pos.y +screen.y -361);
					p.fill(0);
					p.image(imgBranch, pos.x + screen.x -457 , pos.y +screen.y -329);
					p.text(invBranch + "/1", pos.x + screen.x -426 , pos.y +screen.y -300);
					p.image(imgKnife, pos.x + screen.x -457 , pos.y +screen.y -297);
					p.text(invStoneKnife + "/1", pos.x + screen.x -428 , pos.y +screen.y -268);
					p.noFill();
					break;
				case 9:
					p.image(imgPointyStick, pos.x + screen.x -425 , pos.y +screen.y -361);
					p.fill(0);
					p.image(imgStick, pos.x + screen.x -457 , pos.y +screen.y -329);
					p.text(invStick + "/1", pos.x + screen.x -426 , pos.y +screen.y -300);
					p.image(imgKnife, pos.x + screen.x -457 , pos.y +screen.y -297);
					p.text(invStoneKnife + "/1", pos.x + screen.x -428 , pos.y +screen.y -268);
					p.noFill();
					
					break;
				case 10:
					p.image(imgCoockedMeat, pos.x + screen.x -425 , pos.y +screen.y -361);
					p.fill(0);
					p.image(imgMeat, pos.x + screen.x -457 , pos.y +screen.y -329);
					p.text(invMeat + "/1", pos.x + screen.x -426 , pos.y +screen.y -300);
					p.image(imgFireCamp, pos.x + screen.x -457 , pos.y +screen.y -297);
					p.noFill();
					
					break;
				case 11:
					p.image(imgTentLogo, pos.x + screen.x -425 , pos.y +screen.y -361);
					p.fill(0);
					p.image(imgStick, pos.x + screen.x -457 , pos.y +screen.y -329);
					p.text(invStick + "/4", pos.x + screen.x -426 , pos.y +screen.y -300);
					p.image(imgBranch, pos.x + screen.x -457 , pos.y +screen.y -297);
					p.text(invBranch + "/10", pos.x + screen.x -428 , pos.y +screen.y -268);
					p.noFill();
					
					break;	
				case 12:
					p.image(imgWoodStockLogo, pos.x + screen.x -425 , pos.y +screen.y -361);
					p.fill(0);
					p.image(imgStick, pos.x + screen.x -457 , pos.y +screen.y -329);
					p.text(invStick + "/4", pos.x + screen.x -426 , pos.y +screen.y -300);
					p.noFill();
					
					break;	
				case 13:
					p.image(imgColetLogo, pos.x + screen.x -425 , pos.y +screen.y -361);
					p.fill(0);
					p.image(imgPointyStick, pos.x + screen.x -457 , pos.y +screen.y -329);
					p.text(invPointyStick + "/1", pos.x + screen.x -426 , pos.y +screen.y -300);
					p.image(imgRope, pos.x + screen.x -457 , pos.y +screen.y -297);
					p.text(invRope + "/1", pos.x + screen.x -428 , pos.y +screen.y -268);
					p.noFill();
					
					break;	
				case 14:
					p.image(imgTrapLogo, pos.x + screen.x -425 , pos.y +screen.y -361);
					p.fill(0);
					p.image(imgPointyStick, pos.x + screen.x -457 , pos.y +screen.y -329);
					p.text(invPointyStick + "/8", pos.x + screen.x -426 , pos.y +screen.y -300);
					p.noFill();
					
					break;	
				case 15:
					p.image(imgWellLogo, pos.x + screen.x -425 , pos.y +screen.y -361);
					p.fill(0);
					//p.image(imgPointyStick, pos.x + screen.x -457 , pos.y +screen.y -329);
					//p.text(invPointyStick + "/1", pos.x + screen.x -426 , pos.y +screen.y -300);
					//p.image(imgRope, pos.x + screen.x -457 , pos.y +screen.y -297);
					//p.text(invRope + "/1", pos.x + screen.x -428 , pos.y +screen.y -268);
					p.noFill();
					
					break;	
				case 16:
					p.image(imgRope, pos.x + screen.x -425 , pos.y +screen.y -361);
					p.fill(0);
					p.image(imgGrass, pos.x + screen.x -457 , pos.y +screen.y -329);
					p.text(invGrass + "/10", pos.x + screen.x -426 , pos.y +screen.y -300);
					p.noFill();
					
					break;	
				case 17:
					p.image(imgBedLogo, pos.x + screen.x -425 , pos.y +screen.y -361);
					p.fill(0);
					p.image(imgGrass, pos.x + screen.x -457 , pos.y +screen.y -329);
					p.text(invGrass + "/10", pos.x + screen.x -426 , pos.y +screen.y -300);
					p.noFill();
					
					break;		
				case 18: //basic stock
					
					
					break;		
			}
			break;
		}
		
	}
	
	
	
	//objectDragAxe
	public void objectDragAxe(PApplet p,PVector dragPos){
		PImage imgAxe = parent.loadImage("res/icons/Axe.png");
		p.image(imgAxe, dragPos.x, dragPos.y);
	}
	
	public void axeInHand(PApplet p, PVector pos){
		PImage imgAxe = parent.loadImage("res/icons/Axe.png");
		p.image(imgAxe, pos.x-16, pos.y-16);
	}
	
	//objectDragknife
	public void objectDragKnife(PApplet p,PVector dragPos){
		PImage imgDagger = parent.loadImage("res/icons/Dagger.png");
		p.image(imgDagger, dragPos.x, dragPos.y);
	}
	
	public void knifeInHand(PApplet p, PVector pos){
		PImage imgDagger = parent.loadImage("res/icons/Dagger.png");
		p.image(imgDagger, pos.x-16, pos.y-16);
	}
	
	//objectDragspear
	public void objectDragSpear(PApplet p,PVector dragPos){
		PImage imgSpear = parent.loadImage("res/icons/Spear.png");
		p.image(imgSpear, dragPos.x, dragPos.y);
	}
	
	public void spearInHand(PApplet p, PVector pos){
		PImage imgSpear = parent.loadImage("res/icons/Spear.png");
		p.image(imgSpear, pos.x-16, pos.y-16);
	}
	
	
	//inventory
	//1
	public void addMushroom(){
		invMushroom +=1;
	}
	
	public void removeMushroom(){
		invMushroom -=1;
	}
	
	public void eatMushroom(){
		if(mousseLeft && mouses[0] == true){
			invMushroom -=1;
			mousseLeft = false;
		}
		if(mouses[0] == false){
			mousseLeft = true;
		}
	}
	public void dropMushroom(){
		if(mousseRight && mouses[1] == true){
			invMushroom -=1;
			mousseRight = false;
		}
		if(mouses[1] == false){
			mousseRight = true;
		}
	}
	
	public float getInvMush(){
		return invMushroom;
	}
	
	//2
	public void addRedBerry(){
		invRedBerry +=1;
	}
	
	public void eatRedBerry(){
		if(mousseLeft && mouses[0] == true){
			invRedBerry -=1;
			mousseLeft = false;
		}
		if(mouses[0] == false){
			mousseLeft = true;
		}
	}
	
	//dropberry test//
	public void dropRedBerry(){
		if(mousseRight && mouses[1] == true){
			invRedBerry -=1;
			mousseRight = false;
		}
		if(mouses[1] == false){
			mousseRight = true;
		}
	}
	
	//3 grass
	public void addGrass(){
		invGrass +=1;
	}
	
	public void dropGrass(){
		if(mousseRight && mouses[1] == true){
			invGrass -=1;
			mousseRight = false;
		}
		if(mouses[1] == false){
			mousseRight = true;
		}
	}
	
	//4 rock
	public void addRock(){
		invRock += 1;
	}
	
	public void dropRock(){
		if(mousseRight && mouses[1] == true){
			invRock -=1;
			mousseRight = false;
		}
		if(mouses[1] == false){
			mousseRight = true;
		}
	}
	
	//5 yellowberry
	public void addYellowBerry(){
		invJellowBerry +=1;
	}
	
	public void eatYellowBerry(){
		if(mousseLeft && mouses[0] == true){
			invJellowBerry -=1;
			mousseLeft = false;
		}
		if(mouses[0] == false){
			mousseLeft = true;
		}
	}
	
	//dropberry test//
	public void dropYellowBerry(){
		if(mousseRight && mouses[1] == true){
			invJellowBerry -=1;
			mousseRight = false;
		}
		if(mouses[1] == false){
			mousseRight = true;
		}
	}
	//6
	public void addBranch(){
		invBranch += 1;
	}
	public void dropBranch(){
		if(mousseRight && mouses[1] == true){
			invBranch -=1;
			mousseRight = false;
		}
		if(mouses[1] == false){
			mousseRight = true;
		}
	}
	//7
	public void addSmallBranch(){
		invSmallBranch += 1;
	}
	public void dropSmallBranch(){
		if(mousseRight && mouses[1] == true){
			invSmallBranch -=1;
			mousseRight = false;
		}
		if(mouses[1] == false){
			mousseRight = true;
		}
	}
	//8
	public void addFurr(){
		invFurr += 1;
	}
	public void dropFurr(){
		if(mousseRight && mouses[1] == true){
			invFurr -=1;
			mousseRight = false;
		}
		if(mouses[1] == false){
			mousseRight = true;
		}
	}
	//9
	public void addMeat(){
		invMeat +=1;
	}
	
	public void eatMeat(){
		if(mousseLeft && mouses[0] == true){
			invMeat -=1;
			mousseLeft = false;
		}
		if(mouses[0] == false){
			mousseLeft = true;
		}
	}
	public void dropMeat(){
		if(mousseRight && mouses[1] == true){
			invMeat -=1;
			mousseRight = false;
		}
		if(mouses[1] == false){
			mousseRight = true;
		}
	}
	//10
	public void addLog(){
		invLog += 1;
	}
	//11
	
	
	
	//left mouse
	public void checkActionLM(){
		if(actionLM) leftClickTime +=5;
		if(actionLM == false) resetLeftClickTime();
	}
	
	public boolean leftClickTime(){
		if(leftClickTime > 10){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void resetLeftClickTime(){
		leftClickTime = 0;
	}
	
	public void blockLMCount(){
		if(leftClickTime > 10){
			actionLM = false;
		}
	}
	
	//right mouse
	public void checkActionRM(){
		if(actionRM) rightClickTime+=5;
		if(actionRM == false) resetRightClickTime();
	}
	public boolean rightClickTime(){
		if(rightClickTime > 10){
			return true;
		}
		else{
			return false;
		}
	}
	public void resetRightClickTime(){
		rightClickTime = 0;
	}
	
	public void blockRMCount(){
		if(rightClickTime > 10){
			actionRM = false;
		}
	}
	//////////////////

	//inventory grid
	public void grid(PVector pos, PVector screen){
		float videoScale = 32;
		float cols = 10;
		float rows = 7;
		for (int i = 0; i < cols; i++){
			for (int j = 0; j < rows; j++){
				float x = i*videoScale + pos.x + screen.x -345;
				float y = j*videoScale + pos.y +screen.y -249;
				parent.noFill();
				parent.stroke(0);
				parent.strokeWeight(1);
				parent.rect(x, y, videoScale, videoScale);
				parent.noStroke();
			}
		}
	}
	
	//craft grid
	public void grid2(PVector pos, PVector screen){
		float videoScale = 32;
		float cols = 10;
		float rows = 3;
		for (int i = 0; i < cols; i++){
			for (int j = 0; j < rows; j++){
				float x = i*videoScale + pos.x + screen.x -361; //  check pos
				float y = j*videoScale + pos.y +screen.y -361;  
				parent.noFill();
				parent.stroke(0);
				parent.strokeWeight(1);
				parent.rect(x, y, videoScale, videoScale);
				parent.noStroke();
			}
		}
	}

	public void leftClick(){
		if(mousseLeft && mouses[0] == true){
			mousseLeft = false;
			actionLM = true;
		}
		if(mouses[0] == false){
			mousseLeft = true;
			actionLM = false;
		}
	}
	
	public void cutTree(){
		if(mouses[0] == true){
			cutTree = true;
		}
		if(mouses[0] == false){
			cutTree = false;
		}
	}
	
	public void cutTree2(){
		if(mousseLeft && mouses[0] == true){
			mousseLeft = false;
			cutTree = true;
		}
		if(mouses[0] == false){
			mousseLeft = true;
			cutTree = false;
		}
	}
	
	public void spearAttack(){
		if(mouses[0] == true){
			spearAttack = true;
		}
		if(mouses[0] == false){
			spearAttack = false;
		}
	}
	
	public void rightClick(){
		if(mousseRight && mouses[1] == true){
			actionRM = true;
			mousseRight = false;
		}
		if(mouses[1] == false){
			mousseRight = true;
			actionRM = false;
		}
	}
	
	public void pressI(){ //fct !!!!
		if(okayI && keys[0] == true ){
			mode = (mode+1)%2;
			okayI = false;
		}
		if(keys[0] == false ){
			okayI = true;
		}
	}
	
	public void pressE(){ //fct 
		if(okayE && keys[1] == true ){
			okayE = false;
			actionE = true;
		}
		if(keys[1] == false ){
			okayE = true;
			actionE = false;
		}
	}
	
	//craft
	public void pressC(){ //fct !!!!
		if(okayC && keys[2] == true ){
			craftMode = (craftMode+1)%2;
			okayC = false;
		}
		if(keys[2] == false ){
			okayC = true;
		}
	}
	
	//dragDrop
	public void dragLeft(){
		if(mouses[0] == true){
			dragLeft = true;
		}
		if(mouses[0] == false){
			dragLeft = false;
			inHand1 = false;
			inHand2 = false;
			inHand3 = false;
			distInvSlot12 = false;
			distInvSlot14 = false;
			distInvSlot15 = false;
			distHandSlot1 = false;
			distHandSlot2 = false;
			distHandSlot3 = false;
		}
	}
	
	//racourcis 1234567890
	public void press1(){ 
		if(okay1 && keys[3] == true ){
			shortcut1 = (shortcut1+1)%2;
			okay1 = false;
		}
		if(keys[3] == false ){
			okay1 = true;
		}
	}
	
	public void press2(){ 
		if(okay2 && keys[4] == true ){
			shortcut2 = (shortcut2+1)%2;
			okay2 = false;
		}
		if(keys[4] == false ){
			okay2 = true;
		}
	}
	
	public void press3(){ 
		if(okay3 && keys[5] == true ){
			shortcut3 = (shortcut3+1)%2;
			okay3 = false;
		}
		if(keys[5] == false ){
			okay3 = true;
		}
	}

	
	public void zoom(){
		if (keys[6]) zoom += 10;  
		if (keys[7]) zoom -= 10;  
	}
	
	public void keyEvent(KeyEvent e){ //fct 
		int keyCode = e.getKeyCode();
		char keyChar = e.getKey();
		boolean shiftDown = e.isShiftDown();
		boolean ctrlDown = e.isControlDown();
		int keyID = e.getAction();
		if(keyID == KeyEvent.PRESS){
			keyPressedProcess(keyCode, keyChar, shiftDown, ctrlDown);
		}
		if(keyID == KeyEvent.RELEASE){
			keyReleasedProcess(keyCode, keyChar, shiftDown, ctrlDown);
		}
	}

	protected void keyPressedProcess(int keyCode, char keyChar, boolean shiftDown, boolean ctrlDown){
		if (keyChar=='i') keys[0]=true;
		if (keyChar=='e') keys[1]=true;
		if (keyChar=='c') keys[2]=true;
		if (keyChar=='&') keys[3]=true;
		if (keyChar=='é') keys[4]=true;
		if (keyChar=='"') keys[5]=true;
		if (keyChar=='w') keys[6]=true;
		if (keyChar=='x') keys[7]=true;
	}
	
	protected void keyReleasedProcess(int keyCode, char keyChar, boolean shiftDown, boolean ctrlDown){
		if (keyChar=='i') keys[0]=false;
		if (keyChar=='e') keys[1]=false;
		if (keyChar=='c') keys[2]=false;
		if (keyChar=='&') keys[3]=false;
		if (keyChar=='é') keys[4]=false;
		if (keyChar=='"') keys[5]=false;
		if (keyChar=='w') keys[6]=false;
		if (keyChar=='x') keys[7]=false;
	}

	public void mouseEvent(MouseEvent e){
		int button = e.getButton();
		int buttonID = e.getAction();
		if(buttonID == MouseEvent.PRESS){
			moussePressedProcess(button);
		}
		if(buttonID == MouseEvent.RELEASE){
			mousseReleasedProcess(button);
		}
	}
	
	protected void moussePressedProcess(int button){
		if(button == PConstants.LEFT) mouses[0]=true;
		if(button == PConstants.RIGHT) mouses[1]=true;
	}
	
	protected void mousseReleasedProcess(int button){
		if(button == PConstants.LEFT) mouses[0]=false;
		if(button == PConstants.RIGHT) mouses[1]=false;
	}

	
	
}
