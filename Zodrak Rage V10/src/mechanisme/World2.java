package mechanisme;

import java.util.ArrayList;
import java.util.Iterator;

import animals.BearF;
import animals.BearM;
import animals.BearNid;
import animals.BlaireauF;
import animals.BlaireauM;
import animals.BlaireauNid;
import animals.BoarF;
import animals.BoarM;
import animals.DeerF;
import animals.DeerM;
import animals.EcureuilF;
import animals.EcureuilM;
import animals.EcureuilNid;
import animals.FoxF;
import animals.FoxM;
import animals.FoxNid;
import animals.FuretF;
import animals.FuretM;
import animals.FuretNid;
import animals.LapinF;
import animals.LapinM;
import animals.LapinNid;
import animals.PapillonB;
import animals.PapillonBchenille;
import animals.PapillonBegg;
import animals.SourisF;
import animals.SourisM;
import animals.SourisNid;
import animals.VoleF;
import animals.VoleM;
import animals.WolfF;
import animals.WolfM;
import animals.WolfNid;
import animals.insect1M;
import entity.Buisson;
import entity.BuissonFruitJaune;
import entity.BuissonFruitRouge;
import entity.Champi;
import entity.Feuillu;
import entity.Flower;
import entity.FruitTree;
import entity.GrassFeuillu;
import entity.Meat;
import entity.Player;
import entity.Player2;
import entity.Rock;
import objects.Bedlvl0;
import objects.Branch;
import objects.Colet;
import objects.FireCampLvl1;
import objects.Furr;
import objects.Log;
import objects.RedBerry;
import objects.Souche;
import objects.Stocklvl0;
import objects.TentLvl0;
import objects.WoodStocklvl0;
import objects.YellowBerry;
import objects.smallBranch;
import objects.vegetalString;
import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PGraphics;
import processing.core.PImage;
import processing.core.PVector;

public class World2 extends PApplet{
	PApplet parent;
	
	public int worldW = 3840; //modif pour la taille de map 1600
	public int worldH = 3840;
	
	
	
	Player player;
	
	ArrayList<Player2> player2;
	
	ArrayList<ZoneFeuillu> zonefeuillu;
	
	ArrayList<Buisson> buisson;
	ArrayList<BuissonFruitJaune> buissonfruitjaune;
	ArrayList<BuissonFruitRouge> buissonfruitrouge;
	ArrayList<Champi> champi;
	ArrayList<Feuillu> feuillu;
	ArrayList<Flower> flower;
	ArrayList<FruitTree> fruittree;
	ArrayList<GrassFeuillu> grassfeuillu;
	ArrayList<Rock> rock;
	
	ArrayList<RedBerry> redberry;
	ArrayList<YellowBerry> yellowberry;
	
	ArrayList<insect1M> insect1m;
	
	ArrayList<PapillonB> papillonb;
	ArrayList<PapillonBegg> papillonbegg;
	ArrayList<PapillonBchenille> papillonbchenille;
	
	ArrayList<SourisM> sourism;
	ArrayList<SourisF> sourisf;
	ArrayList<SourisNid> sourisnid;
	
	ArrayList<LapinM> lapinm;
	ArrayList<LapinF> lapinf;
	ArrayList<LapinNid> lapinnid;
	
	ArrayList<EcureuilM> ecureuilm;
	ArrayList<EcureuilF> ecureuilf;
	ArrayList<EcureuilNid> ecureuilnid;
	
	ArrayList<FuretM> furetm;
	ArrayList<FuretF> furetf;
	ArrayList<FuretNid> furetnid;
	
	ArrayList<FoxM> foxm;
	ArrayList<FoxF> foxf;
	ArrayList<FoxNid> foxnid;
	
	ArrayList<BlaireauM> blaireaum;
	ArrayList<BlaireauF> blaireauf;
	ArrayList<BlaireauNid> blaireaunid;
	
	ArrayList<BoarM> boarm;
	ArrayList<BoarF> boarf;
	
	ArrayList<WolfM> wolfm;
	ArrayList<WolfF> wolff;
	ArrayList<WolfNid> wolfnid;
	
	ArrayList<BearM> bearm;
	ArrayList<BearF> bearf;
	ArrayList<BearNid> bearnid;
	
	ArrayList<DeerM> deerm;
	ArrayList<DeerF> deerf;
	
	ArrayList<VoleM> volem;
	ArrayList<VoleF> volef;
	
	ArrayList<Meat> meat;
	ArrayList<Branch> branch;
	ArrayList<Furr> furr;
	ArrayList<Log> log;
	ArrayList<smallBranch> smallbranch;
	ArrayList<Souche> souche;
	ArrayList<vegetalString> vegetalstring;
	
	ArrayList<InGameClock> ingameclock;
	
	ArrayList<Inventory> inventory;
	
	ArrayList<Crafting> crafting;
	
	ArrayList<FireCampLvl1> firecamplvl1;
	
	ArrayList<WoodStocklvl0> woodStocklvl0;
	
	ArrayList<TentLvl0> tentlvl0;
	
	ArrayList<Stocklvl0> stocklvl0;
	
	ArrayList<Colet> colet;
	
	ArrayList<Bedlvl0> bedlvl0;
	
	
	PImage[] ImgBuisson = new PImage[8];
	PImage[] ImgBuissonFruitJaune = new PImage[1];
	PImage[] ImgBuissonFruitRouge = new PImage[4];
	PImage[] Imgchampignons = new PImage[5];
	PImage[] ImgFeuillu = new PImage[12];
	PImage[] ImgFlower = new PImage[10];
	PImage[] ImgFruitTree = new PImage[2];
	PImage[] ImgGrassFeuillu = new PImage[2];
	PImage[] ImgRock = new PImage[4];
	
	PImage[] ImgRedBerry = new PImage[1];
	PImage[] ImgYellowBerry = new PImage[1];
	
	PImage[] ImgSourisNid = new PImage[1];
	PImage[] ImgLapinNid = new PImage[1];
	PImage[] ImgEcureuilNid = new PImage[1];
	
	
	////////test fond/////
	
	////pour la generation random du terrain
	int locX, locY;
	final int unit = 128; //32
	byte[][] terrain = new byte[30][30];  //modif pour la taille de map 50
	
	ArrayList<Tuile> tuile;
	
	ArrayList<tileGrassL> tilegrassl;
	ArrayList<tileGrassD> tilegrassd;
	ArrayList<tileDirt> tiledirt;
	ArrayList<tileWater> tilewater;
	
	PImage[] ImgGrassL = new PImage[5];
	PImage[] ImgGrassD = new PImage[4];
	PImage[] ImgDirt = new PImage[3];
	PImage[] ImgWater = new PImage[1];
	//////////////////////
	
	
	//////////test respawn plant
	
	float makePlants = 0;
	
	float resChampi = 500;
	float resFlower = 500;
	float resGrass = 500;
	
	
	///////////test light
	ArrayList<Light> lights;
	PImage screen;
	
	//test 2
	ArrayList<DrawLight> drawlight;
	ArrayList<DrawShadow> drawshadow;
	PImage bg;
	PImage light2;
	PGraphics lightMask;
	
	
	public World2(PApplet p){
		parent = p;
		
		//////player2//////
		player2 = new ArrayList<Player2>();
		///////////////////
		
		/////BUISSON///////
		for(int i = 0; i < ImgBuisson.length; i++){
			ImgBuisson[i] = p.loadImage("res/newvegetal/buisson/buisson" +i+".png");
		}
		buisson = new ArrayList<Buisson>();
		//////////////////////
		
		//////buissonfruitjaune////
		for(int i = 0; i < ImgBuissonFruitJaune.length; i++){
			ImgBuissonFruitJaune[i] = p.loadImage("res/newvegetal/buissonfruit/buissonfruit" +i+ ".png");
		}
		buissonfruitjaune = new ArrayList<BuissonFruitJaune>();
		///////////////////////////
		
		//////buissonfruitrouge////
		for(int i = 0; i < ImgBuissonFruitRouge.length; i++){
			ImgBuissonFruitRouge[i] = p.loadImage("res/newvegetal/buissonfruit/buissonfruit" +i+ ".png");
		}
		buissonfruitrouge = new ArrayList<BuissonFruitRouge>();
		///////////////////////////
		
		//////CHAMPIGNON///////
		for(int i = 0; i < Imgchampignons.length; i++){
			Imgchampignons[i] = p.loadImage("res/newvegetal/champi/champi" +i+ ".png");
		}
		champi = new ArrayList<Champi>();
		///////////////////
		
		///////feuillu//////
		for(int i = 0; i < ImgFeuillu.length; i++){
			ImgFeuillu[i] = p.loadImage("res/newvegetal/feuillu/tree" +i+ ".png");
		}
		feuillu = new ArrayList<Feuillu>();
		////////////////////
		
		/////FLOWER///////////
		for(int i = 0; i < ImgFlower.length; i++){
			ImgFlower[i] = p.loadImage("res/newvegetal/flower/flower" +i+".png");
		}
		flower = new ArrayList<Flower>();
		//////////////////////
		
		//////fruittree////////
		for(int i = 0; i < ImgFruitTree.length; i++){
			ImgFruitTree[i] = p.loadImage("res/vegetal/fruittree/fruit-tree" +i+ ".png");
		}
		fruittree = new ArrayList<FruitTree>();
		///////////////////////
		
		/////GRASSfeuillu/////////
		for(int i = 0; i < ImgGrassFeuillu.length; i++){
			ImgGrassFeuillu[i] = p.loadImage("res/newvegetal/grassfeuillu/grassfeuillu" +i+ ".png");
		}
		grassfeuillu = new ArrayList<GrassFeuillu>();
		//////////////////////////
		
		//////rock//////////////
		for(int i = 0; i < ImgRock.length; i++){
			ImgRock[i] = p.loadImage("res/vegetal/rock/rock" +i+ ".png");
		}
		rock = new ArrayList<Rock>();
		////////////////////////
		
		/////Zone feuillu///////
		zonefeuillu = new ArrayList<ZoneFeuillu>();
		////////////////////////
		
		/////RedBerry/////////
		for(int i = 0; i < ImgRedBerry.length; i++){
			ImgRedBerry[i] = p.loadImage("res/vegetal/berry/redberry.png");
		}
		redberry = new ArrayList<RedBerry>();
		//////////////////////
		
		/////YellowBerry/////////
		for(int i = 0; i < ImgYellowBerry.length; i++){
			ImgYellowBerry[i] = p.loadImage("res/vegetal/berry/jellowberry.png");
		}
		yellowberry = new ArrayList<YellowBerry>();
		//////////////////////
		
		///////INSECT/////////
		insect1m = new ArrayList<insect1M>();
		//////////////////////
		
		///////papillon///////
		papillonb = new ArrayList<PapillonB>();
		papillonbegg = new ArrayList<PapillonBegg>();
		papillonbchenille = new ArrayList<PapillonBchenille>();
		//////////////////////
		
		//////SOURIS///////////
		sourism = new ArrayList<SourisM>();
		sourisf = new ArrayList<SourisF>();
		ImgSourisNid[0] = p.loadImage("res/animal/souris/terrier0.png");
		sourisnid = new ArrayList<SourisNid>();
		///////////////////////
		
		///////LAPIN//////////
		lapinm = new ArrayList<LapinM>();
		lapinf = new ArrayList<LapinF>();
		ImgLapinNid[0] = p.loadImage("res/animal/lapin/lapinTerrier0.png");
		lapinnid = new ArrayList<LapinNid>();
		//////////////////////
		
		//////ECUREUIL////////
		ecureuilm = new ArrayList<EcureuilM>();
		ecureuilf = new ArrayList<EcureuilF>();
		ecureuilnid = new ArrayList<EcureuilNid>();
		//////////////////////
		
		//////FURET///////////
		furetm = new ArrayList<FuretM>();
		furetf = new ArrayList<FuretF>();
		furetnid = new ArrayList<FuretNid>();
		//////////////////////
		
		/////FOX//////////////
		foxm = new ArrayList<FoxM>();
		foxf = new ArrayList<FoxF>();
		foxnid = new ArrayList<FoxNid>();
		//////////////////////
		
		///////BLAIREAU///////
		blaireaum = new ArrayList<BlaireauM>();
		blaireauf = new ArrayList<BlaireauF>();
		blaireaunid = new ArrayList<BlaireauNid>();
		//////////////////////
		
		///////BOAR///////////
		boarm = new ArrayList<BoarM>();
		boarf = new ArrayList<BoarF>();
		//////////////////////
		
		///////WOLF///////////
		wolfnid = new ArrayList<WolfNid>();
		wolfm = new ArrayList<WolfM>();
		wolff = new ArrayList<WolfF>();
		//////////////////////
		
		//////BEAR///////////////
		bearnid = new ArrayList<BearNid>();
		bearm = new ArrayList<BearM>();
		bearf = new ArrayList<BearF>();
		//////////////////////
		
		//////DEER//////////////////
		deerm = new ArrayList<DeerM>();
		deerf = new ArrayList<DeerF>();
		////////////////////////////
		
		//////VOLE//////////////////
		volem = new ArrayList<VoleM>();
		volef = new ArrayList<VoleF>();
		////////////////////////////
		
		
		//////MEAT///////////
		meat = new ArrayList<Meat>();
		/////////////////////
		
		//////BRANCH/////////
		branch = new ArrayList<Branch>();
		/////////////////////
		
		//////FURR///////////
		furr = new ArrayList<Furr>();
		/////////////////////
		
		//////LOG////////////
		log = new ArrayList<Log>();
		/////////////////////
		
		/////SMALLBRANCH/////
		smallbranch = new ArrayList<smallBranch>();
		/////////////////////
		
		/////SOUCHE//////////
		souche = new ArrayList<Souche>();
		/////////////////////
		
		/////VEGETALSTRING///
		vegetalstring = new ArrayList<vegetalString>();
		/////////////////////
		
		//////InGameClock///////
		ingameclock = new ArrayList<InGameClock>();
		////////////////////////
		
		//////Inventory/////////
		inventory = new ArrayList<Inventory>();
		////////////////////////
		
		//////crafting//////////
		crafting = new ArrayList<Crafting>();
		////////////////////////
		
		//////LIGHT//////////////
		lights = new ArrayList<Light>();
		/////////////////////////
		
		/////draw shadow and light///////
		drawlight = new ArrayList<DrawLight>();
		drawshadow = new ArrayList<DrawShadow>();
		
		//////FIRECAMPLVL1////////////////
		firecamplvl1 = new ArrayList<FireCampLvl1>();
		
		woodStocklvl0 = new ArrayList<WoodStocklvl0>();
		
		tentlvl0 = new ArrayList<TentLvl0>();
		
		stocklvl0 = new ArrayList<Stocklvl0>();
		
		colet = new ArrayList<Colet>();
		
		bedlvl0 = new ArrayList<Bedlvl0>();
		
		
		////////fond/////
		////pour la generation random du terrain
		for (int i = 0; i < 30; i++){  //modif pour la taille de map  50
			for (int j = 0; j < 30; j++){
				terrain[i][j] = (byte) PApplet.ceil(p.noise((float) (i*0.05),(float) (j*0.05))*60);
			}
		}
		//locX = (int) (p.random(6,94)); //si random beaucoup de gris apparait
		//locY = (int) (p.random(6,94));
		locX = (int) 6;
		locY = (int) 6;
		
		tuile = new ArrayList<Tuile>();
		tilegrassl = new ArrayList<tileGrassL>();
		tilegrassd = new ArrayList<tileGrassD>();
		tiledirt = new ArrayList<tileDirt>();
		tilewater = new ArrayList<tileWater>();
		
		for(int i = 0; i < ImgGrassL.length; i++){
			ImgGrassL[i] = p.loadImage("res/floor/grassL" +i+ ".png");
		}
		
		for(int i = 0; i < ImgGrassD.length; i++){
			ImgGrassD[i] = p.loadImage("res/floor/grassD" +i+ ".png");
		}
		
		for(int i = 0; i < ImgDirt.length; i++){
			ImgDirt[i] = p.loadImage("res/floor/dirt" +i+ ".png");
		}
		
		for(int i = 0; i < ImgWater.length; i++){
			ImgWater[i] = p.loadImage("res/floor/water" +i+ ".png");
		}
		//////////////////////
		
	}
	
	public void makeWorld(){
		
		
		//////le fond blanc//////
		parent.fill(255); ///le monde en lui meme
		parent.rect(0, 0, worldW, worldH);
		parent.noFill();
		/////////////////////////
		
		/////le fond vert /////////
		parent.noStroke();
		parent.fill(0,153,0,50);
		parent.rect(0, 0, worldW, worldH,7);
		parent.noFill();
		/////////////////////////
		
		////////test fond/////
		while(tilegrassl.size() < 1){
			
			for (int i = 0; i < 30; i++){  //modif pour la taille de map 50
				for (int j = 0; j < 30; j++){
					int offsetX = locX+i-6;
				    int offsetY = locY+j-6;
				    
				    PVector l = new PVector();
				    l.x = offsetX*128;
				    l.y = offsetY*128;
				    
				    boolean grassL = false;
				    boolean grassD = false;
				    boolean dirt = false;
				    boolean water = false;
				    
				    if (offsetX < 0 || offsetX > 99 || offsetY < 0 || offsetY > 99) parent.fill(0xff808080);
				    else{
				    	if (terrain[offsetX][offsetY]>25){  //32 16
				    		parent.fill(0xff005000); //vert sombre
				    		grassD = true;
				    	}
				    	else if (terrain[offsetX][offsetY]>22){  //29 14
				    		parent.fill(0xff005000); //vert sombre
				    		grassD = true;
				    	}
				    	else if (terrain[offsetX][offsetY]>18){  //20 10
				    		parent.fill(0xff008000); //vert clair
				    		grassL = true;
				    	}
				    	else if (terrain[offsetX][offsetY]>14){  //12 12
				    		//parent.fill(0xff0000c0); //bleu
				    		parent.fill(0xff008000); //vert clair
				    		
				    		grassL = true;
				    	}
				    	else{
				    		parent.fill(0xff0000c0); //bleu
				    		water = true;
				    	}
				    }
				    parent.rect(i*unit, j*unit, unit, unit);
				    if(grassL){
				    	int randomgrassl = (int) parent.random(0, 100);
				    	if(randomgrassl < 96){
				    		tilegrassl.add(new tileGrassL(ImgGrassL[0], parent, l));
				    	}
				    	if(randomgrassl >= 96 && randomgrassl <= 97){
				    		tilegrassl.add(new tileGrassL(ImgGrassL[1], parent, l));
				    	}
				    	if(randomgrassl >= 98 && randomgrassl <= 98){
				    		tilegrassl.add(new tileGrassL(ImgGrassL[2], parent, l));
				    	}
				    	if(randomgrassl >= 99 && randomgrassl <= 99){
				    		tilegrassl.add(new tileGrassL(ImgGrassL[3], parent, l));
				    	}
				    	if(randomgrassl > 99){
				    		tilegrassl.add(new tileGrassL(ImgGrassL[4], parent, l));
				    	}
				    	
				    }
				    if(grassD){
				    	int randomgrassd = (int) parent.random(0, 100);
				    	if(randomgrassd < 97){
				    		tilegrassd.add(new tileGrassD(ImgGrassD[0], parent, l));
				    	}
				    	if(randomgrassd >= 97 && randomgrassd <= 98){
				    		tilegrassd.add(new tileGrassD(ImgGrassD[1], parent, l));
				    	}
				    	if(randomgrassd >= 99 && randomgrassd <= 99){
				    		tilegrassd.add(new tileGrassD(ImgGrassD[2], parent, l));
				    	}
				    	if(randomgrassd > 99){
				    		tilegrassd.add(new tileGrassD(ImgGrassD[3], parent, l));
				    	}
				    }
				    if(water){
				    	int index = (int) (parent.random(0,ImgWater.length));
				    	tilewater.add(new tileWater(ImgWater[index], parent, l));
				    }
				}
			}
		}
		
		while(makePlants < 1){
			/////////plantes/////////
			//int totalBuisson = 40;
			int totalBuisson = (tilegrassd.size()/10);
			
			int totalbuissonfruitjaune = 10;
			int totalbuissonfruitrouge = 10;
			//int totalChampi = 140;
			int totalChampi = tilegrassd.size()/15;
			
			//int totalfeuillu = 200;
			int totalfeuillu = tilegrassd.size()/2;
			
			int totalfruittree = 10;
			
			//int totalflower = 200;
			int totalflower = tilegrassl.size() /10;
			
			//int totalgrassfeuillu = 1000;
			int totalgrassfeuillu = ((tilegrassd.size()+tilegrassl.size())/4);
			
			while(buisson.size() < totalBuisson){
				PVector l1 = new PVector();
				l1.x = parent.random(worldW-(worldW-50) , worldW-50);  //test modif pour map big
				l1.y	= parent.random(worldH-(worldH-50) , worldH-50);
				boolean overlapping1 = false;
				for(int a = 0; a < buisson.size(); a++){
					Buisson other = buisson.get(a);
					float d = PApplet.dist(l1.x, l1.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping1 = true;
						break;
					}
				}
				for(int a = 0; a < tilegrassd.size(); a++){
					tileGrassD other = tilegrassd.get(a);
					float d = PApplet.dist(l1.x, l1.y, other.position.x, other.position.y);
					if(d < 50){
						overlapping1 = true;
						break;
					}
				}
				
				for(int a = 0; a < tilewater.size(); a++){
					tileWater other = tilewater.get(a);
					float d = PApplet.dist(l1.x, l1.y, other.position.x, other.position.y);
					if(d < 60){
						overlapping1 = true;
						break;
					}
				}
				
				if(!overlapping1){
					int index = (int) (parent.random(0,ImgBuisson.length));
					buisson.add(new Buisson(ImgBuisson[index], parent, l1));
				}
			}
			
			/////BUISSON FOOD//////
			//int totalbuissonfruitjaune = 10;
			while(buissonfruitjaune.size() < totalbuissonfruitjaune){
				PVector l2 = new PVector();
				l2.x = parent.random(worldW-(worldW-50) , worldW-50);
				l2.y	= parent.random(worldH-(worldH-50) , worldH-50);
				boolean overlapping2 = false;
				for(int a = 0; a < buissonfruitjaune.size(); a++){
					BuissonFruitJaune other = buissonfruitjaune.get(a);
					float d = PApplet.dist(l2.x, l2.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping2 = true;
						break;
					}
				}
				for(int a = 0; a < tilegrassd.size(); a++){
					tileGrassD other = tilegrassd.get(a);
					float d = PApplet.dist(l2.x, l2.y, other.position.x, other.position.y);
					if(d < 50){
						overlapping2 = true;
						break;
					}
				}
				
				for(int a = 0; a < tilewater.size(); a++){
					tileWater other = tilewater.get(a);
					float d = PApplet.dist(l2.x, l2.y, other.position.x, other.position.y);
					if(d < 60){
						overlapping2 = true;
						break;
					}
				}
				
				for(int a = 0; a < buisson.size(); a++){
					Buisson other = buisson.get(a);
					float d = PApplet.dist(l2.x, l2.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping2 = true;
						break;
					}
				}
				if(!overlapping2){
					int index = (int) (parent.random(0,ImgBuissonFruitJaune.length));
					buissonfruitjaune.add(new BuissonFruitJaune(ImgBuissonFruitJaune[index], parent, l2));
				}
			}
			
			//////BUISSON ROUGE///////
			//int totalbuissonfruitrouge = 10;
			while(buissonfruitrouge.size() < totalbuissonfruitrouge){
				PVector l = new PVector();
				l.x = parent.random(worldW-(worldW-50) , worldW-50);
				l.y	= parent.random(worldH-(worldH-50) , worldH-50);
				boolean overlapping = false;
				for(int a = 0; a < buissonfruitrouge.size(); a++){
					BuissonFruitRouge other = buissonfruitrouge.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < tilegrassd.size(); a++){
					tileGrassD other = tilegrassd.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 50){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < tilewater.size(); a++){
					tileWater other = tilewater.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 60){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < buisson.size(); a++){
					Buisson other = buisson.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < buissonfruitjaune.size(); a++){
					BuissonFruitJaune other = buissonfruitjaune.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				if(!overlapping){
					int index = (int) (parent.random(0,ImgBuissonFruitRouge.length));
					buissonfruitrouge.add(new BuissonFruitRouge(ImgBuissonFruitRouge[index], parent, l));
				}
			}
			
			////CHAMPI///////
			//int totalChampi = 140;
			while(champi.size() < totalChampi){
				PVector l = new PVector();
				l.x = parent.random(worldW-(worldW-50) , worldW-50);
				l.y	= parent.random(worldH-(worldH-50) , worldH-50);
				boolean overlapping = false;
				boolean tooFar = false;
				for(int a = 0; a < champi.size(); a++){
					Champi other = champi.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < tilegrassl.size(); a++){
					tileGrassL other = tilegrassl.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 50){
						overlapping = true;
						break;
					}
				}
				
				for(int a = 0; a < tilewater.size(); a++){
					tileWater other = tilewater.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 60){
						overlapping = true;
						break;
					}
				}
				
				for(int a = 0; a < buisson.size(); a++){
					Buisson other = buisson.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < buissonfruitjaune.size(); a++){
					BuissonFruitJaune other = buissonfruitjaune.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < buissonfruitrouge.size(); a++){
					BuissonFruitRouge other = buissonfruitrouge.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				if(!overlapping && !tooFar){
					int index = (int) (parent.random(0,Imgchampignons.length));
					champi.add(new Champi(Imgchampignons[index], parent, l));
				}
			}
			//////////////////////////
			
			////ARBRE//////
			//int totalfeuillu = 200;
			while(feuillu.size() < totalfeuillu){
				PVector l = new PVector();
				l.x = parent.random(worldW-(worldW-50) , worldW-50);
				l.y	= parent.random(worldH-(worldH-50) , worldH-50);
				boolean overlapping = false;
				boolean tooFar = false;
				//boolean tooClose = false;
				for(int a = 0; a < feuillu.size(); a++){
					Feuillu other = feuillu.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 160){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < tilegrassl.size(); a++){
					tileGrassL other = tilegrassl.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 50){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < tilewater.size(); a++){
					tileWater other = tilewater.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 160){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < buisson.size(); a++){
					Buisson other = buisson.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < buissonfruitjaune.size(); a++){
					BuissonFruitJaune other = buissonfruitjaune.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < buissonfruitrouge.size(); a++){
					BuissonFruitRouge other = buissonfruitrouge.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < champi.size(); a++){
					Champi other = champi.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				if(!overlapping && !tooFar){
					int index = (int) (parent.random(0,ImgFeuillu.length));
					feuillu.add(new Feuillu(ImgFeuillu[index], parent, l));
				}
			}
			///////////////////////
			
			/////ARBRE FOOD/////
			//int totalfruittree = 10;
			while(fruittree.size() < totalfruittree){
				PVector l = new PVector();
				l.x = parent.random(worldW-(worldW-50) , worldW-50);
				l.y	= parent.random(worldH-(worldH-50) , worldH-50);
				boolean overlapping = false;
				for(int a = 0; a < fruittree.size(); a++){
					FruitTree other = fruittree.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 90){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < tilegrassd.size(); a++){
					tileGrassD other = tilegrassd.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 50){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < tilewater.size(); a++){
					tileWater other = tilewater.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 60){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < buisson.size(); a++){
					Buisson other = buisson.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < buissonfruitjaune.size(); a++){
					BuissonFruitJaune other = buissonfruitjaune.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < buissonfruitrouge.size(); a++){
					BuissonFruitRouge other = buissonfruitrouge.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < champi.size(); a++){
					Champi other = champi.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				if(!overlapping){
					int index = (int) (parent.random(0,ImgFruitTree.length));
					fruittree.add(new FruitTree(ImgFruitTree[index], parent, l));
				}
			}
			//////////////////////
			
			////FLOWER/////
			//int totalflower = 200;
			while(flower.size() < totalflower){
				PVector l = new PVector();
				l.x = parent.random(worldW-(worldW-50) , worldW-50);
				l.y	= parent.random(worldH-(worldH-50) , worldH-50);
				boolean overlapping = false;
				for(int a = 0; a < flower.size(); a++){
					Flower other = flower.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < fruittree.size(); a++){
					FruitTree other = fruittree.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < tilegrassd.size(); a++){
					tileGrassD other = tilegrassd.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 50){
						overlapping = true;
						break;
					}
				}
				
				for(int a = 0; a < tilewater.size(); a++){
					tileWater other = tilewater.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 60){
						overlapping = true;
						break;
					}
				}
				
				for(int a = 0; a < buisson.size(); a++){
					Buisson other = buisson.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < buissonfruitjaune.size(); a++){
					BuissonFruitJaune other = buissonfruitjaune.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < buissonfruitrouge.size(); a++){
					BuissonFruitRouge other = buissonfruitrouge.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < champi.size(); a++){
					Champi other = champi.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				if(!overlapping){
					int index = (int) (parent.random(0,ImgFlower.length));
					flower.add(new Flower(ImgFlower[index], parent, l));
				}
			}
			//////////////////////
			
			/////ROCK//////
			int totalrock = 100;
			while(rock.size() < totalrock){
				PVector l = new PVector();
				l.x = parent.random(worldW-(worldW-50) , worldW-50);
				l.y	= parent.random(worldH-(worldH-50) , worldH-50);
				boolean overlapping = false;
				for(int a = 0; a < rock.size(); a++){
					Rock other = rock.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < flower.size(); a++){
					Flower other = flower.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < fruittree.size(); a++){
					FruitTree other = fruittree.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < feuillu.size(); a++){
					Feuillu other = feuillu.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < buisson.size(); a++){
					Buisson other = buisson.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < buissonfruitjaune.size(); a++){
					BuissonFruitJaune other = buissonfruitjaune.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < buissonfruitrouge.size(); a++){
					BuissonFruitRouge other = buissonfruitrouge.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < champi.size(); a++){
					Champi other = champi.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < tilewater.size(); a++){
					tileWater other = tilewater.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 60){
						overlapping = true;
						break;
					}
				}
				if(!overlapping){
					int index = (int) (parent.random(0,ImgRock.length));
					rock.add(new Rock(ImgRock[index], parent, l));
				}
			}
			////////////////////
			
			//////HERBE//////
			//int totalgrassfeuillu = 1000;
			while(grassfeuillu.size() < totalgrassfeuillu){
				PVector l = new PVector();
				l.x = parent.random(worldW-(worldW-50) , worldW-50);
				l.y	= parent.random(worldH-(worldH-50) , worldH-50);
				boolean overlapping = false;
				for(int a = 0; a < grassfeuillu.size(); a++){
					GrassFeuillu other = grassfeuillu.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < rock.size(); a++){
					Rock other = rock.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < flower.size(); a++){
					Flower other = flower.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < fruittree.size(); a++){
					FruitTree other = fruittree.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < feuillu.size(); a++){
					Feuillu other = feuillu.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < buisson.size(); a++){
					Buisson other = buisson.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < buissonfruitjaune.size(); a++){
					BuissonFruitJaune other = buissonfruitjaune.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < buissonfruitrouge.size(); a++){
					BuissonFruitRouge other = buissonfruitrouge.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < champi.size(); a++){
					Champi other = champi.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 32){
						overlapping = true;
						break;
					}
				}
				for(int a = 0; a < tilewater.size(); a++){
					tileWater other = tilewater.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 60){
						overlapping = true;
						break;
					}
				}
				if(!overlapping){
					int index = (int) (parent.random(0,ImgGrassFeuillu.length));
					grassfeuillu.add(new GrassFeuillu(ImgGrassFeuillu[index], parent, l));
				}
			}
			
			////drop pour que le bug de "il n'y a rien dans la liste" s'annule/////
			int dropdebug = 1;
			PVector l = new PVector();
			l.x = (worldW - worldW) - 500;
			l.y	= (worldH - worldH) - 500;
			while(smallbranch.size() < dropdebug){
				smallbranch.add(new smallBranch(parent, l));
			}
			while(furr.size() < dropdebug){
				furr.add(new Furr(parent, l));
			}
			while(meat.size() < dropdebug){
				meat.add(new Meat(parent, l));
			}
			while(log.size() < dropdebug){
				log.add(new Log(parent, l));
			}
			while(vegetalstring.size() < dropdebug){
				vegetalstring.add(new vegetalString(parent, l));
			}
			while(firecamplvl1.size() < dropdebug){
				firecamplvl1.add(new FireCampLvl1(parent,l));
			}
			while(woodStocklvl0.size() < dropdebug){
				woodStocklvl0.add(new WoodStocklvl0(parent,l));
			}
			while(tentlvl0.size() < dropdebug){
				tentlvl0.add(new TentLvl0(parent,l));
			}
			while(stocklvl0.size() < dropdebug){
				stocklvl0.add(new Stocklvl0(parent,l));
			}
			while(colet.size() < dropdebug){
				colet.add(new Colet(parent,l));
			}
			while(bedlvl0.size() < dropdebug){
				bedlvl0.add(new Bedlvl0(parent,l));
			}
			while(ingameclock.size() < dropdebug){
				ingameclock.add(new InGameClock(parent));
			}
			/////////
			
			makePlants +=1;
		}
		
		///////RED BERRY///////
		int totalredberry = buissonfruitrouge.size()*4;
		if(parent.random(1) < 0.01 && redberry.size() < totalredberry){
			Iterator<BuissonFruitRouge> BFR = buissonfruitrouge.iterator();
			while(BFR.hasNext()){
				BuissonFruitRouge bfr = BFR.next();
				PVector l = new PVector(parent.random(bfr.position.x -50, bfr.position.x +50), 
										parent.random(bfr.position.y-50, bfr.position.y +50));
				int index = (int) (parent.random(0,ImgRedBerry.length));
				redberry.add(new RedBerry(ImgRedBerry[index],parent,l));
			}
		}
		///////////////////////
		
		////////YELLOWBERRY/////
		int totalyellowberry = buissonfruitjaune.size()*4;
		if(parent.random(1) < 0.01 && yellowberry.size() < totalyellowberry){
			Iterator<BuissonFruitJaune> BFJ = buissonfruitjaune.iterator();
			while(BFJ.hasNext()){
				BuissonFruitJaune bfj = BFJ.next();
				PVector l = new PVector(parent.random(bfj.position.x -50, bfj.position.x +50), 
										parent.random(bfj.position.y-50, bfj.position.y +50));
				int index = (int) (parent.random(0,ImgYellowBerry.length));
				yellowberry.add(new YellowBerry(ImgYellowBerry[index],parent,l));
			}
		}
		////////////////////////

		int totalBranch = feuillu.size()/10;
		int totalSmallBranch = feuillu.size()/10;
		Iterator<Feuillu> Tree = feuillu.iterator();
		while(Tree.hasNext()){
			Feuillu tree = Tree.next();
			PVector l = new PVector(parent.random(tree.position.x -50, tree.position.x +50), 
									parent.random(tree.position.y -50, tree.position.y +50));
			if(parent.random(1) < 0.01 && branch.size() < totalBranch){
				branch.add(new Branch(parent, l));
			}
			if(parent.random(1) < 0.01 && branch.size() < totalSmallBranch){
				smallbranch.add(new smallBranch(parent, l));
			}
		}
		
		
		///////////////////////
		
	}
	
	public void runWorld(){
		
		
		///respawn plante/////
		//////////////////////
		int totalChampi = 140;
		resChampi += 1;
		if(resChampi > 500) resChampi = 500;
		
		while(champi.size() < totalChampi && resChampi >= 500){
			PVector l = new PVector();
			l.x = parent.random(worldW-(worldW-50) , worldW-50);
			l.y	= parent.random(worldH-(worldH-50) , worldH-50);
			boolean overlapping = false;
			boolean tooFar = false;
			for(int a = 0; a < champi.size(); a++){
				Champi other = champi.get(a);
				float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
				if(d < 32){
					overlapping = true;
					break;
				}
			}
			for(int a = 0; a < tilegrassl.size(); a++){
				tileGrassL other = tilegrassl.get(a);
				float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
				if(d < 50){
					overlapping = true;
					break;
				}
			}
			
			for(int a = 0; a < tilewater.size(); a++){
				tileWater other = tilewater.get(a);
				float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
				if(d < 60){
					overlapping = true;
					break;
				}
			}
			
			for(int a = 0; a < buisson.size(); a++){
				Buisson other = buisson.get(a);
				float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
				if(d < 32){
					overlapping = true;
					break;
				}
			}
			for(int a = 0; a < buissonfruitjaune.size(); a++){
				BuissonFruitJaune other = buissonfruitjaune.get(a);
				float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
				if(d < 32){
					overlapping = true;
					break;
				}
			}
			for(int a = 0; a < buissonfruitrouge.size(); a++){
				BuissonFruitRouge other = buissonfruitrouge.get(a);
				float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
				if(d < 32){
					overlapping = true;
					break;
				}
			}
			if(!overlapping && !tooFar){
				int index = (int) (parent.random(0,Imgchampignons.length));
				
				champi.add(new Champi(Imgchampignons[index], parent, l));
				resChampi = 0;
			}
		}
		//////////////////////////

		//////HERBE//////
		int totalgrassfeuillu = 1000;
		resGrass += 1;
		if(resGrass > 500) resGrass = 500;
		
		while(grassfeuillu.size() < totalgrassfeuillu && resGrass >= 500){
			PVector l = new PVector();
			l.x = parent.random(worldW-(worldW-50) , worldW-50);
			l.y	= parent.random(worldH-(worldH-50) , worldH-50);
			boolean overlapping = false;
			for(int a = 0; a < grassfeuillu.size(); a++){
				GrassFeuillu other = grassfeuillu.get(a);
				float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
				if(d < 32){
					overlapping = true;
					break;
				}
			}
			for(int a = 0; a < rock.size(); a++){
				Rock other = rock.get(a);
				float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
				if(d < 32){
					overlapping = true;
					break;
				}
			}
			for(int a = 0; a < flower.size(); a++){
				Flower other = flower.get(a);
				float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
				if(d < 32){
					overlapping = true;
					break;
				}
			}
			for(int a = 0; a < fruittree.size(); a++){
				FruitTree other = fruittree.get(a);
				float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
				if(d < 32){
					overlapping = true;
					break;
				}
			}
			for(int a = 0; a < feuillu.size(); a++){
				Feuillu other = feuillu.get(a);
				float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
				if(d < 32){
					overlapping = true;
					break;
				}
			}
			for(int a = 0; a < buisson.size(); a++){
				Buisson other = buisson.get(a);
				float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
				if(d < 32){
					overlapping = true;
					break;
				}
			}
			for(int a = 0; a < buissonfruitjaune.size(); a++){
				BuissonFruitJaune other = buissonfruitjaune.get(a);
				float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
				if(d < 32){
					overlapping = true;
					break;
				}
			}
			for(int a = 0; a < buissonfruitrouge.size(); a++){
				BuissonFruitRouge other = buissonfruitrouge.get(a);
				float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
				if(d < 32){
					overlapping = true;
					break;
				}
			}
			for(int a = 0; a < champi.size(); a++){
				Champi other = champi.get(a);
				float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
				if(d < 32){
					overlapping = true;
					break;
				}
			}
			for(int a = 0; a < tilewater.size(); a++){
				tileWater other = tilewater.get(a);
				float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
				if(d < 60){
					overlapping = true;
					break;
				}
			}
			if(!overlapping){
				int index = (int) (parent.random(0,ImgGrassFeuillu.length));
				int nbrgrass = 10; //fct, nbr random pour plus de rdm ?
				for(int a = 0; a < nbrgrass; a++){
					grassfeuillu.add(new GrassFeuillu(ImgGrassFeuillu[index], parent, l));
				}
				
				//grassfeuillu.add(new GrassFeuillu(ImgGrassFeuillu[index], parent, l));
				resGrass = 0;
			}
		}

		//coupe des arbres et drop des log
		Iterator<Feuillu> Tree = feuillu.iterator();
		while(Tree.hasNext()){
			Feuillu tree = Tree.next();
			tree.checkDead();
			if(tree.dead == true){
				Tree.remove();
				PVector trunkPos = new PVector(tree.position.x,tree.position.y);
				int randomLog = (int) parent.random(5, 10);
				for(int a = 0; a < randomLog; a++){
					PVector l = new PVector(parent.random(tree.position.x-50, tree.position.x+50), parent.random(tree.position.y-50, tree.position.y+50));
					log.add(new Log(parent,l));
				}
				souche.add(new Souche(parent,trunkPos));
			}
		}
		
	}
	
	
	
	public void launchPrey(){
		int totalinsect1m = 60;
		int totalpapillonb = 10;
		int totalsourisM = 5;
		int totalsourisF = 5;
		int totallapinM = 5;
		int totallapinF = 5;
		int totalecureuilm = 5;
		int totalecureuilf = 5;
		int totalboarm = 2;
		int totalboarf = 2;
		int totaldeerm = 3;
		int totaldeerf = 3;
		int totalvolem = 5;
		int totalvolef = 5;
		
		/////insectes//////
		for(int i = 0; i < totalinsect1m; i++){
			PVector l = new PVector();
			l.x = parent.random(worldW-(worldW-50) , worldW-50);
			l.y	= parent.random(worldH-(worldH-50) , worldH-50);
			boolean overlapping = false;
			for(int a = 0; a < tilewater.size(); a++){
				tileWater other = tilewater.get(a);
				float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
				if(d < 160){
					overlapping = true;
					break;
				}
			}
			if(!overlapping && insect1m.size() < 80){
				DNAinsect dnainsect = new DNAinsect(parent);
				insect1m.add(new insect1M(l, dnainsect, parent));
			}
		}
		
		Iterator<insect1M> I1M = insect1m.iterator();
		while(I1M.hasNext()){
			insect1M i1m = I1M.next();
			i1m.run(parent);
			if(i1m.faim() == false){
				i1m.randomMv();
				i1m.mvtUpdate();
			}
			if(i1m.faim() == true){
				i1m.eatFood();
			}
			Iterator<tileWater> tileW = tilewater.iterator();
			while(tileW.hasNext()){
				tileWater tilew = tileW.next();
				PVector target = new PVector(tilew.position.x, tilew.position.y);
				if(i1m.isTooClose(target)){
					i1m.goAway(target);
				}
			}
		}
		//////////////////////

		/////papillon/////////
		while(papillonb.size() < 1){
			for(int i = 0; i < totalpapillonb; i++){
				PVector l = new PVector();
				l.x = parent.random(worldW-(worldW-50) , worldW-50);
				l.y	= parent.random(worldH-(worldH-50) , worldH-50);
				DNAinsect dnainsect = new DNAinsect(parent);
				papillonb.add(new PapillonB(l,dnainsect,parent));
			}
		}
		
		Iterator<PapillonB> PB = papillonb.iterator();
		while(PB.hasNext()){
			PapillonB pb = PB.next();
			pb.run(parent);
			pb.boundaries();
			pb.wander(parent);
			pb.mvtUpdate();
			if(pb.dead() == true){
				PB.remove();
			}
		}
		
		//////find flower/food////////
		if(papillonb.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = papillonb.size()-1; a >= 0; a--){
				PapillonB papb = papillonb.get(a);
				if(papb.faim() == true){
					PVector target = new PVector(0,0);
					currentSmallest = (worldH * worldH) + (worldW * worldW);
					for(int b = flower.size()-1; b >= 0; b--){
						Flower flo = flower.get(b);
						dist = ((papb.position.x - flo.position.x) * (papb.position.x - flo.position.x)) +
							   ((papb.position.y - flo.position.y) * (papb.position.y - flo.position.y));
						if( dist < currentSmallest){
							currentSmallest = dist;
							target.x = flo.position.x;
							target.y = flo.position.y;
						}
						if(dist < 32){
							papb.eatFood();
						}
					}
					papb.findFlower(target);
				}
			}
		}
		//////////////////////////////
		
		/////find nest//////
		if(papillonb.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = papillonb.size()-1; a >= 0; a--){
				PapillonB papb = papillonb.get(a);
				if(papb.reproduceTime()== true && papillonb.size() < 50){
					PVector target = new PVector(0,0);
					currentSmallest = (worldH * worldH) + (worldW * worldW);
					for(int b = buisson.size()-1; b >= 0; b--){
						Buisson bui = buisson.get(b);
						dist = ((papb.position.x - bui.position.x) * (papb.position.x - bui.position.x)) +
							   ((papb.position.y - bui.position.y) * (papb.position.y - bui.position.y));
						if( dist < currentSmallest){
							currentSmallest = dist;
							target.x = bui.position.x;
							target.y = bui.position.y;
						}
					}
					papb.findNest(target);
				}
			}
		}
		//////////////////////
		
		//////drop eggs///////
		for(int a = papillonb.size()-1; a >= 0; a--){
			PapillonB papb = papillonb.get(a);
			for(int b = buisson.size()-1; b >= 0; b--){
				Buisson bui = buisson.get(b);
				PVector papbpos = papb.position;
				PVector buipos = bui.position;
				float d = PVector.dist(papbpos, buipos);
				if(d < 10 && papb.reproduceTime() == true && papillonb.size() < 50){
					papillonbegg.add(new PapillonBegg(papbpos,parent));
					papb.resetReproduce();
				}
			}
		}
		//////////////////////
		
		/////////EGGS/////////
		Iterator<PapillonBegg> PBE = papillonbegg.iterator();
		while(PBE.hasNext()){
			PapillonBegg pbe = PBE.next();
			pbe.run(parent);
			if(pbe.growUp()== true){
				PBE.remove();
				PVector pbepos = pbe.position;
				DNAinsect dnainsect = new DNAinsect(parent);
				papillonbchenille.add(new PapillonBchenille(pbepos,dnainsect,parent));
			}
		}
		//////////////////////
		
		///////chenille///////
		Iterator<PapillonBchenille> PBC = papillonbchenille.iterator();
		while(PBC.hasNext()){
			PapillonBchenille pbc = PBC.next();
			pbc.update();
			pbc.randomMv();
			pbc.mvtUpdate();
			if(pbc.growUp() == true){
				PBC.remove();
				PVector l = pbc.position;
				DNAinsect dnainsect = new DNAinsect(parent);
				papillonb.add(new PapillonB(l,dnainsect,parent));
			}
		}
		//////////////////////
		
		///////find buisson/////
		if(papillonbchenille.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = papillonbchenille.size()-1; a >= 0; a--){
				PapillonBchenille papbc = papillonbchenille.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				for(int b = buisson.size()-1; b >= 0; b--){
					Buisson bui = buisson.get(b);
					dist = ((papbc.position.x - bui.position.x) * (papbc.position.x - bui.position.x)) +
						   ((papbc.position.y - bui.position.y) * (papbc.position.y - bui.position.y));
					if( dist < currentSmallest){
						currentSmallest = dist;
						target.x = bui.position.x;
						target.y = bui.position.y;
					}
				}
				papbc.stayCloseBuisson(target);
			}
		}
		////////////////////////
		
		/////SOURIS/////////////
		
		///////SourisNid//////////
		int totalnid = 1;
		while(sourisnid.size() < totalnid){
			PVector l = new PVector();
			l.x = parent.random(worldW-(worldW-50) , worldW-50);
			l.y	= parent.random(worldH-(worldH-50) , worldH-50);
			boolean overlapping = false;
			for(int a = 0; a < tilewater.size(); a++){
				tileWater other = tilewater.get(a);
				float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
				if(d < 160){
					overlapping = true;
					break;
				}
			}
			if(!overlapping){
				sourisnid.add(new SourisNid(parent, l));
			}
		}
		/////////////////////////
		
		///////SourisM//////////
		while(sourism.size() < 1){
			for(int i = 0; i < totalsourisM; i++){
				PVector l = new PVector();
				l.x = parent.random(worldW-(worldW-50) , worldW-50);
				l.y	= parent.random(worldH-(worldH-50) , worldH-50);
				boolean overlapping = false;
				for(int a = 0; a < tilewater.size(); a++){
					tileWater other = tilewater.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 160){
						overlapping = true;
						break;
					}
				}
				if(!overlapping){
					DNAsouris dnasouris = new DNAsouris(parent);
					sourism.add(new SourisM(l,dnasouris,parent));
				}
			}
		}
		
		Iterator<SourisM> SM = sourism.iterator();
		while(SM.hasNext()){
			SourisM sm = SM.next();
			sm.run(parent);
			sm.boundaries();
			if(sm.eatingTime() == false ){
				sm.mvtUpdate();
			}
			Iterator<tileWater> tileW = tilewater.iterator();
			while(tileW.hasNext()){
				tileWater tilew = tileW.next();
				PVector target = new PVector(tilew.position.x, tilew.position.y);
				if(sm.isTooClose(target)){
					sm.goAway(target);
				}
			}
			
			/////runaway mechanisme//////
			Iterator<BearM> BM = bearm.iterator();
			while(BM.hasNext()){
				BearM bm = BM.next();
				PVector target = new PVector(bm.position.x, bm.position.y);
				if(bm.NstarvingLvl2() == true && sm.isInDanger(target)){
					sm.runaway(target);
				}
			}
			Iterator<BearF> BF = bearf.iterator();
			while(BF.hasNext()){
				BearF bf = BF.next();
				PVector target = new PVector(bf.position.x, bf.position.y);
				if(bf.NstarvingLvl2() == true && sm.isInDanger(target)){
					sm.runaway(target);
				}
			}
			Iterator<BlaireauM> BLM = blaireaum.iterator();
			while(BLM.hasNext()){
				BlaireauM blm = BLM.next();
				PVector target = new PVector(blm.position.x, blm.position.y);
				if(blm.NstarvingLvl2() == true && sm.isInDanger(target)){
					sm.runaway(target);
				}
			}
			Iterator<BlaireauF> BLF = blaireauf.iterator();
			while(BLF.hasNext()){
				BlaireauF blf = BLF.next();
				PVector target = new PVector(blf.position.x, blf.position.y);
				if(blf.NstarvingLvl2() == true && sm.isInDanger(target)){
					sm.runaway(target);
				}
			}
			Iterator<BoarM> BOM = boarm.iterator();
			while(BOM.hasNext()){
				BoarM bom = BOM.next();
				PVector target = new PVector(bom.position.x, bom.position.y);
				if(bom.NstarvingLvl2() == true && sm.isInDanger(target)){
					sm.runaway(target);
				}
			}
			Iterator<BoarF> BOF = boarf.iterator();
			while(BOF.hasNext()){
				BoarF bof = BOF.next();
				PVector target = new PVector(bof.position.x, bof.position.y);
				if(bof.NstarvingLvl2() == true && sm.isInDanger(target)){
					sm.runaway(target);
				}
			}
			Iterator<FoxM> FM = foxm.iterator();
			while(FM.hasNext()){
				FoxM fm = FM.next();
				PVector target = new PVector(fm.position.x, fm.position.y);
				if(fm.NstarvingLvl2() == true && sm.isInDanger(target)){
					sm.runaway(target);
				}
			}
			Iterator<FoxF> FF = foxf.iterator();
			while(FF.hasNext()){
				FoxF ff = FF.next();
				PVector target = new PVector(ff.position.x, ff.position.y);
				if(ff.NstarvingLvl2() == true && sm.isInDanger(target)){
					sm.runaway(target);
				}
			}
			Iterator<FuretM> FUM = furetm.iterator();
			while(FUM.hasNext()){
				FuretM fum = FUM.next();
				PVector target = new PVector(fum.position.x, fum.position.y);
				if(fum.NstarvingLvl2() == true && sm.isInDanger(target)){
					sm.runaway(target);
				}
			}
			Iterator<FuretF> FUF = furetf.iterator();
			while(FUF.hasNext()){
				FuretF fuf = FUF.next();
				PVector target = new PVector(fuf.position.x, fuf.position.y);
				if(fuf.NstarvingLvl2() == true && sm.isInDanger(target)){
					sm.runaway(target);
				}
			}
			Iterator<WolfM> WM = wolfm.iterator();
			while(WM.hasNext()){
				WolfM wm = WM.next();
				PVector target = new PVector(wm.position.x, wm.position.y);
				if(wm.NstarvingLvl2() == true && sm.isInDanger(target)){
					sm.runaway(target);
				}
			}
			Iterator<WolfF> WF = wolff.iterator();
			while(WF.hasNext()){
				WolfF wf = WF.next();
				PVector target = new PVector(wf.position.x, wf.position.y);
				if(wf.NstarvingLvl2() == true && sm.isInDanger(target)){
					sm.runaway(target);
				}
			}
			/////////////////////////////
		}
		
		///////find food insecte/ chenille/////////
		if(sourism.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = sourism.size()-1; a >=0; a--){
				SourisM soum = sourism.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(soum.Nfaim() == false){
					soum.wander(parent);
				}
				if(soum.Nfaim() == true){
					for(int b = insect1m.size()-1; b >=0; b--){
						insect1M i1m = insect1m.get(b);
						dist = ((soum.position.x - i1m.position.x) * (soum.position.x - i1m.position.x)) +
							   ((soum.position.y - i1m.position.y) * (soum.position.y - i1m.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = i1m.position.x;
							target.y = i1m.position.y;
						}
					}
					for(int c = papillonbchenille.size()-1; c >=0; c--){
						PapillonBchenille pbc = papillonbchenille.get(c);
						dist = ((soum.position.x - pbc.position.x) * (soum.position.x - pbc.position.x)) +
							   ((soum.position.y - pbc.position.y) * (soum.position.y - pbc.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = pbc.position.x;
							target.y = pbc.position.y;
						}
					}
					soum.findPray(target);
				}
			}
		}
		/////////////////////////
		
		////////eat insect////////
		Iterator<SourisM> SouM = sourism.iterator();
		while(SouM.hasNext()){
			SourisM soum = SouM.next();
			Iterator<insect1M> i1M = insect1m.iterator();
			while(i1M.hasNext()){
				insect1M i1m = i1M.next();
				PVector i1mpos = i1m.position;
				PVector soumpos = soum.position;
				float d = PVector.dist(i1mpos, soumpos);
				if(soum.Nfaim() == true){
					if(d < soum.getR()){
						float food = 100;
						soum.eat(food);
						i1M.remove();
						soum.resetEating();
					}
				}
			}
		}
		//////////////////////////
		
		////////eat chenille////////
		Iterator<SourisM> SourM = sourism.iterator();
		while(SourM.hasNext()){
			SourisM sourm = SourM.next();
			Iterator<PapillonBchenille> Pbc = papillonbchenille.iterator();
			while(Pbc.hasNext()){
				PapillonBchenille pbc = Pbc.next();
				PVector pbcpos = pbc.position;
				PVector soumpos = sourm.position;
				float d = PVector.dist(pbcpos, soumpos);
				if(sourm.Nfaim() == true){
					if(d < sourm.getR()){
						float food = 100;
						sourm.eat(food);
						Pbc.remove();
						sourm.resetEating();
					}
				}
			}
		}
		//////////////////////////
		
		///////SourisF//////////
		while(sourisf.size() < 1){
			for(int i = 0; i < totalsourisF; i++){
				PVector l = new PVector();
				l.x = parent.random(worldW-(worldW-50) , worldW-50);
				l.y	= parent.random(worldH-(worldH-50) , worldH-50);
				boolean overlapping = false;
				for(int a = 0; a < tilewater.size(); a++){
					tileWater other = tilewater.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 160){
						overlapping = true;
						break;
					}
				}
				if(!overlapping){
					DNAsouris dnasouris = new DNAsouris(parent);
					sourisf.add(new SourisF(l,dnasouris,parent));
				}
			}
		}

		
		Iterator<SourisF> SF = sourisf.iterator();
		while(SF.hasNext()){
			SourisF sf = SF.next();
			sf.run(parent);
			sf.boundaries();
			if(sf.eatingTime() == false ){
				sf.mvtUpdate();
			}
			Iterator<tileWater> tileW = tilewater.iterator();
			while(tileW.hasNext()){
				tileWater tilew = tileW.next();
				PVector target = new PVector(tilew.position.x, tilew.position.y);
				if(sf.isTooClose(target)){
					sf.goAway(target);
				}
			}
			/////runaway mechanisme//////
			Iterator<BearM> BM = bearm.iterator();
			while(BM.hasNext()){
				BearM bm = BM.next();
				PVector target = new PVector(bm.position.x, bm.position.y);
				if(bm.NstarvingLvl2() == true && sf.isInDanger(target)){
					sf.runaway(target);
				}
			}
			Iterator<BearF> BF = bearf.iterator();
			while(BF.hasNext()){
				BearF bf = BF.next();
				PVector target = new PVector(bf.position.x, bf.position.y);
				if(bf.NstarvingLvl2() == true && sf.isInDanger(target)){
					sf.runaway(target);
				}
			}
			Iterator<BlaireauM> BLM = blaireaum.iterator();
			while(BLM.hasNext()){
				BlaireauM blm = BLM.next();
				PVector target = new PVector(blm.position.x, blm.position.y);
				if(blm.NstarvingLvl2() == true && sf.isInDanger(target)){
					sf.runaway(target);
				}
			}
			Iterator<BlaireauF> BLF = blaireauf.iterator();
			while(BLF.hasNext()){
				BlaireauF blf = BLF.next();
				PVector target = new PVector(blf.position.x, blf.position.y);
				if(blf.NstarvingLvl2() == true && sf.isInDanger(target)){
					sf.runaway(target);
				}
			}
			Iterator<BoarM> BOM = boarm.iterator();
			while(BOM.hasNext()){
				BoarM bom = BOM.next();
				PVector target = new PVector(bom.position.x, bom.position.y);
				if(bom.NstarvingLvl2() == true && sf.isInDanger(target)){
					sf.runaway(target);
				}
			}
			Iterator<BoarF> BOF = boarf.iterator();
			while(BOF.hasNext()){
				BoarF bof = BOF.next();
				PVector target = new PVector(bof.position.x, bof.position.y);
				if(bof.NstarvingLvl2() == true && sf.isInDanger(target)){
					sf.runaway(target);
				}
			}
			Iterator<FoxM> FM = foxm.iterator();
			while(FM.hasNext()){
				FoxM fm = FM.next();
				PVector target = new PVector(fm.position.x, fm.position.y);
				if(fm.NstarvingLvl2() == true && sf.isInDanger(target)){
					sf.runaway(target);
				}
			}
			Iterator<FoxF> FF = foxf.iterator();
			while(FF.hasNext()){
				FoxF ff = FF.next();
				PVector target = new PVector(ff.position.x, ff.position.y);
				if(ff.NstarvingLvl2() == true && sf.isInDanger(target)){
					sf.runaway(target);
				}
			}
			Iterator<FuretM> FUM = furetm.iterator();
			while(FUM.hasNext()){
				FuretM fum = FUM.next();
				PVector target = new PVector(fum.position.x, fum.position.y);
				if(fum.NstarvingLvl2() == true && sf.isInDanger(target)){
					sf.runaway(target);
				}
			}
			Iterator<FuretF> FUF = furetf.iterator();
			while(FUF.hasNext()){
				FuretF fuf = FUF.next();
				PVector target = new PVector(fuf.position.x, fuf.position.y);
				if(fuf.NstarvingLvl2() == true && sf.isInDanger(target)){
					sf.runaway(target);
				}
			}
			Iterator<WolfM> WM = wolfm.iterator();
			while(WM.hasNext()){
				WolfM wm = WM.next();
				PVector target = new PVector(wm.position.x, wm.position.y);
				if(wm.NstarvingLvl2() == true && sf.isInDanger(target)){
					sf.runaway(target);
				}
			}
			Iterator<WolfF> WF = wolff.iterator();
			while(WF.hasNext()){
				WolfF wf = WF.next();
				PVector target = new PVector(wf.position.x, wf.position.y);
				if(wf.NstarvingLvl2() == true && sf.isInDanger(target)){
					sf.runaway(target);
				}
			}
			/////////////////////////////
		}
		
		///////find food insecte/chenille /////////
		if(sourisf.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = sourisf.size()-1; a >=0; a--){
				SourisF souf = sourisf.get(a);
				
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(souf.Nfaim() == false){
					souf.wander(parent);
				}
				if(souf.Nfaim() == true){
					for(int b = insect1m.size()-1; b >=0; b--){
						insect1M i1m = insect1m.get(b);
						dist = ((souf.position.x - i1m.position.x) * (souf.position.x - i1m.position.x)) +
							   ((souf.position.y - i1m.position.y) * (souf.position.y - i1m.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = i1m.position.x;
							target.y = i1m.position.y;
						}
					}
					for(int c = papillonbchenille.size()-1; c >=0; c--){
						PapillonBchenille pbc = papillonbchenille.get(c);
						dist = ((souf.position.x - pbc.position.x) * (souf.position.x - pbc.position.x)) +
							   ((souf.position.y - pbc.position.y) * (souf.position.y - pbc.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = pbc.position.x;
							target.y = pbc.position.y;
						}
					}
					souf.findPray(target);
				}
				
			}
		}
		/////////////////////////
		
		////////eat insect////////
		Iterator<SourisF> SouF = sourisf.iterator();
		while(SouF.hasNext()){
			SourisF souf = SouF.next();
			Iterator<insect1M> i1M = insect1m.iterator();
			while(i1M.hasNext()){
				insect1M i1m = i1M.next();
				PVector i1mpos = i1m.position;
				PVector soufpos = souf.position;
				float d = PVector.dist(i1mpos, soufpos);
				if(souf.Nfaim() == true){
					if(d < souf.getR()){
						float food = 100;
						souf.eat(food);
						i1M.remove();
						souf.resetEating();
					}
				}
			}
		}
		//////////////////////////
		
		////////eat chenille////////
		Iterator<SourisF> SourF = sourisf.iterator();
		while(SourF.hasNext()){
			SourisF sourf = SourF.next();
			Iterator<PapillonBchenille> Pbc = papillonbchenille.iterator();
			while(Pbc.hasNext()){
				PapillonBchenille pbc = Pbc.next();
				PVector pbcpos = pbc.position;
				PVector soufpos = sourf.position;
				float d = PVector.dist(pbcpos, soufpos);
				if(sourf.Nfaim() == true){
					if(d < sourf.getR()){
						float food = 100;
						sourf.eat(food);
						Pbc.remove();
						sourf.resetEating();
					}
				}
			}
		}
		//////////////////////////
		
		//////reproduction//////
		
		//////find female///////
		
		if(sourisf.size() >= 1){
			float currentSmallest;
			float dist;
			for(int a = sourism.size()-1; a >=0; a--){
				SourisM soum = sourism.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(soum.reproduceTime() == false){
					soum.wander(parent);
				}
				if(soum.reproduceTime() == true && soum.dead() == false){
					if(sourism.size() < 10 || sourisf.size() < 10){
						for(int b = sourisf.size()-1; b >= 0; b--){
							SourisF souf = sourisf.get(b);
							if(souf.dead() == false){
								dist = ((soum.position.x - souf.position.x) * (soum.position.x - souf.position.x)) +
								   ((soum.position.y - souf.position.y) * (soum.position.y - souf.position.y));
								if( dist < currentSmallest){
									currentSmallest = dist;
									target.x = souf.position.x;
									target.y = souf.position.y;
								}
							}
						}
						soum.findFemale(target);
					}
				}
			}
		}
		
		
		////////////////////////
		
		/////reproduction///////
		for(int a = sourism.size()-1; a >= 0; a--){
			for(int b = sourisf.size()-1; b >= 0; b--){
				for(int c = sourisnid.size()-1; c >=0; c--){
					SourisM sm = sourism.get(a);
					SourisF sf = sourisf.get(b);
					SourisNid nid = sourisnid.get(c);
					PVector smpos = sm.position;
					PVector sfpos = sf.position;
					PVector nidpos = nid.position;
					float d = PVector.dist(smpos, sfpos);
					if(d < sf.getR() && sf.reproduceTime() == true && sf.dead() == false){  /////a changer juste pour test
						DNAsouris momgenes = sm.getDNAsouris();
						DNAsouris dadgenes = sf.getDNAsouris();
						DNAsouris childdna = momgenes.crossover(dadgenes, parent);
						//if(parent.random(1) < 0.9){
							if(parent.random(10) > 5 && sourism.size() < 10){
								sourism.add(new SourisM(nidpos, childdna, parent));
								sf.resetReproduce();
								sm.resetReproduce();
							}
							if(parent.random(10) < 5 && sourisf.size() < 10){
								sourisf.add(new SourisF(nidpos, childdna, parent));
								sf.resetReproduce();
								sm.resetReproduce();
							}
						//}
					}
				}
			}
		}
		////////////////////////

		////////LAPIN///////////
		///////LapinNid//////////
		int totallapinnid = 1;
		while(lapinnid.size() < totallapinnid){
			PVector l = new PVector();
			l.x = parent.random(worldW-(worldW-50) , worldW-50);
			l.y	= parent.random(worldH-(worldH-50) , worldH-50);
			boolean overlapping = false;
			for(int a = 0; a < tilewater.size(); a++){
				tileWater other = tilewater.get(a);
				float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
				if(d < 160){
					overlapping = true;
					break;
				}
			}
			if(!overlapping){
				lapinnid.add(new LapinNid(parent, l));
			}
		}
		///////////////////
		
		///////LapinM//////////
		while(lapinm.size() < 1){
			for(int i = 0; i < totallapinM; i++){
				PVector l = new PVector();
				l.x = parent.random(worldW-(worldW-50) , worldW-50);
				l.y	= parent.random(worldH-(worldH-50) , worldH-50);
				boolean overlapping = false;
				for(int a = 0; a < tilewater.size(); a++){
					tileWater other = tilewater.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 160){
						overlapping = true;
						break;
					}
				}
				if(!overlapping){
					DNAlapin dnalapin = new DNAlapin(parent);
					lapinm.add(new LapinM(l,dnalapin,parent));
				}
			}
		}

		
		Iterator<LapinM> LM = lapinm.iterator();
		while(LM.hasNext()){
			LapinM lm = LM.next();
			lm.run(parent);
			lm.boundaries();
			if(lm.eatingTime() == false ){
				//lm.wander(parent);
				lm.mvtUpdate();
			}
			/*
			if(lm.dead() == true){
				LM.remove();
				int randomMeat = (int) parent.random(1, 5);
				for(int a = 0; a < randomMeat; a++){
					PVector l = new PVector(parent.random(lm.position.x-10, lm.position.x+10), parent.random(lm.position.y-10, lm.position.y+10));
					meat.add(new Meat(parent,l));
				}
			}
			*/
			Iterator<tileWater> tileW = tilewater.iterator();
			while(tileW.hasNext()){
				tileWater tilew = tileW.next();
				PVector target = new PVector(tilew.position.x, tilew.position.y);
				if(lm.isTooClose(target)){
					lm.goAway(target);
				}
			}
			
			/////runaway mechanisme//////
			Iterator<BearM> BM = bearm.iterator();
			while(BM.hasNext()){
				BearM bm = BM.next();
				PVector target = new PVector(bm.position.x, bm.position.y);
				if(bm.NstarvingLvl3() == true && lm.isInDanger(target)){
					lm.runaway(target);
				}
			}
			Iterator<BearF> BF = bearf.iterator();
			while(BF.hasNext()){
				BearF bf = BF.next();
				PVector target = new PVector(bf.position.x, bf.position.y);
				if(bf.NstarvingLvl3() == true && lm.isInDanger(target)){
					lm.runaway(target);
				}
			}
			Iterator<BlaireauM> BLM = blaireaum.iterator();
			while(BLM.hasNext()){
				BlaireauM blm = BLM.next();
				PVector target = new PVector(blm.position.x, blm.position.y);
				if(blm.NstarvingLvl3() == true && lm.isInDanger(target)){
					lm.runaway(target);
				}
			}
			Iterator<BlaireauF> BLF = blaireauf.iterator();
			while(BLF.hasNext()){
				BlaireauF blf = BLF.next();
				PVector target = new PVector(blf.position.x, blf.position.y);
				if(blf.NstarvingLvl3() == true && lm.isInDanger(target)){
					lm.runaway(target);
				}
			}
			Iterator<FoxM> FM = foxm.iterator();
			while(FM.hasNext()){
				FoxM fm = FM.next();
				PVector target = new PVector(fm.position.x, fm.position.y);
				if(fm.NstarvingLvl3() == true && lm.isInDanger(target)){
					lm.runaway(target);
				}
			}
			Iterator<FoxF> FF = foxf.iterator();
			while(FF.hasNext()){
				FoxF ff = FF.next();
				PVector target = new PVector(ff.position.x, ff.position.y);
				if(ff.NstarvingLvl3() == true && lm.isInDanger(target)){
					lm.runaway(target);
				}
			}
			Iterator<FuretM> FUM = furetm.iterator();
			while(FUM.hasNext()){
				FuretM fum = FUM.next();
				PVector target = new PVector(fum.position.x, fum.position.y);
				if(fum.NstarvingLvl3() == true && lm.isInDanger(target)){
					lm.runaway(target);
				}
			}
			Iterator<FuretF> FUF = furetf.iterator();
			while(FUF.hasNext()){
				FuretF fuf = FUF.next();
				PVector target = new PVector(fuf.position.x, fuf.position.y);
				if(fuf.NstarvingLvl3() == true && lm.isInDanger(target)){
					lm.runaway(target);
				}
			}
			Iterator<WolfM> WM = wolfm.iterator();
			while(WM.hasNext()){
				WolfM wm = WM.next();
				PVector target = new PVector(wm.position.x, wm.position.y);
				if(wm.NstarvingLvl3() == true && lm.isInDanger(target)){
					lm.runaway(target);
				}
			}
			Iterator<WolfF> WF = wolff.iterator();
			while(WF.hasNext()){
				WolfF wf = WF.next();
				PVector target = new PVector(wf.position.x, wf.position.y);
				if(wf.NstarvingLvl3() == true && lm.isInDanger(target)){
					lm.runaway(target);
				}
			}
			/////////////////////////////

			
		}
		
		///////find food grassfeuillu/ red and yellow fruit flower / /////////
		if(lapinm.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = lapinm.size()-1; a >=0; a--){
				LapinM lm = lapinm.get(a);
				
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(lm.Nfaim() == false){
					lm.wander(parent);
				}
				if(lm.Nfaim() == true){
					for(int b = grassfeuillu.size()-1; b >=0; b--){
						GrassFeuillu gf = grassfeuillu.get(b);
						dist = ((lm.position.x - gf.position.x) * (lm.position.x - gf.position.x)) +
							   ((lm.position.y - gf.position.y) * (lm.position.y - gf.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = gf.position.x;
							target.y = gf.position.y;
						}
					}
					for(int c = redberry.size()-1; c >=0; c--){
						RedBerry rb = redberry.get(c);
						dist = ((lm.position.x - rb.position.x) * (lm.position.x - rb.position.x)) +
							   ((lm.position.y - rb.position.y) * (lm.position.y - rb.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = rb.position.x;
							target.y = rb.position.y;
						}
					}
					for(int d = yellowberry.size()-1; d >=0; d--){
						YellowBerry yb = yellowberry.get(d);
						dist = ((lm.position.x - yb.position.x) * (lm.position.x - yb.position.x)) +
							   ((lm.position.y - yb.position.y) * (lm.position.y - yb.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = yb.position.x;
							target.y = yb.position.y;
						}
					}
					for(int e = flower.size()-1; e >=0; e--){
						Flower fl = flower.get(e);
						dist = ((lm.position.x - fl.position.x) * (lm.position.x - fl.position.x)) +
							   ((lm.position.y - fl.position.y) * (lm.position.y - fl.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = fl.position.x;
							target.y = fl.position.y;
						}
					}
					lm.findFood(target);
				}
				
			}
		}
		/////////////////////////
		
		////////eat grassfeuillu/ redberry/ yellow and flower////////
		Iterator<LapinM> LaM = lapinm.iterator();
		while(LaM.hasNext()){
			LapinM lam = LaM.next();
			Iterator<GrassFeuillu> GrF = grassfeuillu.iterator();
			while(GrF.hasNext()){
				GrassFeuillu grf = GrF.next();
				PVector grasspos = grf.position;
				PVector lapinmpos = lam.position;
				float d = PVector.dist(grasspos, lapinmpos);
				if(lam.Nfaim() == true){
					if(d < lam.getR()){
						float food = 100;
						lam.eat(food);
						GrF.remove(); 
						lam.resetEating();
					}
				}
			}
			Iterator<RedBerry> ReB = redberry.iterator();
			while(ReB.hasNext()){
				RedBerry reb = ReB.next();
				PVector rebpos = reb.position;
				PVector lapinmpos = lam.position;
				float d = PVector.dist(rebpos, lapinmpos);
				if(lam.Nfaim() == true){
					if(d < lam.getR()){
						float food = 100;
						lam.eat(food);
						ReB.remove(); 
						lam.resetEating();
					}
				}
			}
			Iterator<YellowBerry> YeB = yellowberry.iterator();
			while(YeB.hasNext()){
				YellowBerry yeb = YeB.next();
				PVector yebpos = yeb.position;
				PVector lapinmpos = lam.position;
				float d = PVector.dist(yebpos, lapinmpos);
				if(lam.Nfaim() == true){
					if(d < lam.getR()){
						float food = 100;
						lam.eat(food);
						YeB.remove(); //pas de remove pour l'instant
						lam.resetEating();
					}
				}
			}
			Iterator<Flower> Fl = flower.iterator();
			while(Fl.hasNext()){
				Flower fl = Fl.next();
				PVector flpos = fl.position;
				PVector lapinmpos = lam.position;
				float d = PVector.dist(flpos, lapinmpos);
				if(lam.Nfaim() == true){
					if(d < lam.getR()){
						float food = 100;
						lam.eat(food);
						Fl.remove(); 
						lam.resetEating();
					}
				}
			}

		}
		//////////////////////////
		
		///////LapinF//////////
		while(lapinf.size() < 1){
			for(int i = 0; i < totallapinF; i++){
				PVector l = new PVector();
				l.x = parent.random(worldW-(worldW-50) , worldW-50);
				l.y	= parent.random(worldH-(worldH-50) , worldH-50);
				boolean overlapping = false;
				for(int a = 0; a < tilewater.size(); a++){
					tileWater other = tilewater.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 160){
						overlapping = true;
						break;
					}
				}
				if(!overlapping){
					DNAlapin dnalapin = new DNAlapin(parent);
					lapinf.add(new LapinF(l,dnalapin,parent));
				}
			}
		}

		
		Iterator<LapinF> LF = lapinf.iterator();
		while(LF.hasNext()){
			LapinF lf = LF.next();
			lf.run(parent);
			lf.boundaries();
			if(lf.eatingTime() == false ){
				lf.mvtUpdate();
			}
			/*
			if(lf.dead() == true){
				LF.remove();
				int randomMeat = (int) parent.random(1, 5);
				for(int a = 0; a < randomMeat; a++){
					PVector l = new PVector(parent.random(lf.position.x-10, lf.position.x+10), parent.random(lf.position.y-10, lf.position.y+10));
					meat.add(new Meat(parent,l));
				}
			}
			*/
			Iterator<tileWater> tileW = tilewater.iterator();
			while(tileW.hasNext()){
				tileWater tilew = tileW.next();
				PVector target = new PVector(tilew.position.x, tilew.position.y);
				if(lf.isTooClose(target)){
					lf.goAway(target);
				}
			}
			
			/////runaway mechanisme//////
			Iterator<BearM> BM = bearm.iterator();
			while(BM.hasNext()){
				BearM bm = BM.next();
				PVector target = new PVector(bm.position.x, bm.position.y);
				if(bm.NstarvingLvl3() == true && lf.isInDanger(target)){
					lf.runaway(target);
				}
			}
			Iterator<BearF> BF = bearf.iterator();
			while(BF.hasNext()){
				BearF bf = BF.next();
				PVector target = new PVector(bf.position.x, bf.position.y);
				if(bf.NstarvingLvl3() == true && lf.isInDanger(target)){
					lf.runaway(target);
				}
			}
			Iterator<BlaireauM> BLM = blaireaum.iterator();
			while(BLM.hasNext()){
				BlaireauM blm = BLM.next();
				PVector target = new PVector(blm.position.x, blm.position.y);
				if(blm.NstarvingLvl3() == true && lf.isInDanger(target)){
					lf.runaway(target);
				}
			}
			Iterator<BlaireauF> BLF = blaireauf.iterator();
			while(BLF.hasNext()){
				BlaireauF blf = BLF.next();
				PVector target = new PVector(blf.position.x, blf.position.y);
				if(blf.NstarvingLvl3() == true && lf.isInDanger(target)){
					lf.runaway(target);
				}
			}
			Iterator<FoxM> FM = foxm.iterator();
			while(FM.hasNext()){
				FoxM fm = FM.next();
				PVector target = new PVector(fm.position.x, fm.position.y);
				if(fm.NstarvingLvl3() == true && lf.isInDanger(target)){
					lf.runaway(target);
				}
			}
			Iterator<FoxF> FF = foxf.iterator();
			while(FF.hasNext()){
				FoxF ff = FF.next();
				PVector target = new PVector(ff.position.x, ff.position.y);
				if(ff.NstarvingLvl3() == true && lf.isInDanger(target)){
					lf.runaway(target);
				}
			}
			Iterator<FuretM> FUM = furetm.iterator();
			while(FUM.hasNext()){
				FuretM fum = FUM.next();
				PVector target = new PVector(fum.position.x, fum.position.y);
				if(fum.NstarvingLvl3() == true && lf.isInDanger(target)){
					lf.runaway(target);
				}
			}
			Iterator<FuretF> FUF = furetf.iterator();
			while(FUF.hasNext()){
				FuretF fuf = FUF.next();
				PVector target = new PVector(fuf.position.x, fuf.position.y);
				if(fuf.NstarvingLvl3() == true && lf.isInDanger(target)){
					lf.runaway(target);
				}
			}
			Iterator<WolfM> WM = wolfm.iterator();
			while(WM.hasNext()){
				WolfM wm = WM.next();
				PVector target = new PVector(wm.position.x, wm.position.y);
				if(wm.NstarvingLvl3() == true && lf.isInDanger(target)){
					lf.runaway(target);
				}
			}
			Iterator<WolfF> WF = wolff.iterator();
			while(WF.hasNext()){
				WolfF wf = WF.next();
				PVector target = new PVector(wf.position.x, wf.position.y);
				if(wf.NstarvingLvl3() == true && lf.isInDanger(target)){
					lf.runaway(target);
				}
			}
			/////////////////////////////

			
		}
		
		///////find food grassfeuillu/////////
		if(lapinf.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = lapinf.size()-1; a >=0; a--){
				LapinF lf = lapinf.get(a);
				
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(lf.Nfaim() == false){
					lf.wander(parent);
				}
				if(lf.Nfaim() == true){
					for(int b = grassfeuillu.size()-1; b >=0; b--){
						GrassFeuillu gf = grassfeuillu.get(b);
						dist = ((lf.position.x - gf.position.x) * (lf.position.x - gf.position.x)) +
							   ((lf.position.y - gf.position.y) * (lf.position.y - gf.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = gf.position.x;
							target.y = gf.position.y;
						}
					}
					for(int c = redberry.size()-1; c >=0; c--){
						RedBerry rb = redberry.get(c);
						dist = ((lf.position.x - rb.position.x) * (lf.position.x - rb.position.x)) +
							   ((lf.position.y - rb.position.y) * (lf.position.y - rb.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = rb.position.x;
							target.y = rb.position.y;
						}
					}
					for(int d = yellowberry.size()-1; d >=0; d--){
						YellowBerry yb = yellowberry.get(d);
						dist = ((lf.position.x - yb.position.x) * (lf.position.x - yb.position.x)) +
							   ((lf.position.y - yb.position.y) * (lf.position.y - yb.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = yb.position.x;
							target.y = yb.position.y;
						}
					}
					for(int e = flower.size()-1; e >=0; e--){
						Flower fl = flower.get(e);
						dist = ((lf.position.x - fl.position.x) * (lf.position.x - fl.position.x)) +
							   ((lf.position.y - fl.position.y) * (lf.position.y - fl.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = fl.position.x;
							target.y = fl.position.y;
						}
					}
					lf.findFood(target);
				}
				
			}
		}
		/////////////////////////
		
		////////eat grassfeuillu////////
		Iterator<LapinF> LaF = lapinf.iterator();
		while(LaF.hasNext()){
			LapinF laf = LaF.next();
			Iterator<GrassFeuillu> GrF = grassfeuillu.iterator();
			while(GrF.hasNext()){
				GrassFeuillu grf = GrF.next();
				PVector grasspos = grf.position;
				PVector lapinfpos = laf.position;
				float d = PVector.dist(grasspos, lapinfpos);
				if(laf.Nfaim() == true){
					if(d < laf.getR()){
						float food = 100;
						laf.eat(food);
						GrF.remove(); 
						laf.resetEating();
					}
				}
			}
			Iterator<RedBerry> ReB = redberry.iterator();
			while(ReB.hasNext()){
				RedBerry reb = ReB.next();
				PVector rebpos = reb.position;
				PVector lapinfpos = laf.position;
				float d = PVector.dist(rebpos, lapinfpos);
				if(laf.Nfaim() == true){
					if(d < laf.getR()){
						float food = 100;
						laf.eat(food);
						ReB.remove(); //pas de remove pour l'instant
						laf.resetEating();
					}
				}
			}
			Iterator<YellowBerry> YeB = yellowberry.iterator();
			while(YeB.hasNext()){
				YellowBerry yeb = YeB.next();
				PVector yebpos = yeb.position;
				PVector lapinfpos = laf.position;
				float d = PVector.dist(yebpos, lapinfpos);
				if(laf.Nfaim() == true){
					if(d < laf.getR()){
						float food = 100;
						laf.eat(food);
						YeB.remove(); 
						laf.resetEating();
					}
				}
			}
			Iterator<Flower> Fl = flower.iterator();
			while(Fl.hasNext()){
				Flower fl = Fl.next();
				PVector flpos = fl.position;
				PVector lapinfpos = laf.position;
				float d = PVector.dist(flpos, lapinfpos);
				if(laf.Nfaim() == true){
					if(d < laf.getR()){
						float food = 100;
						laf.eat(food);
						Fl.remove(); 
						laf.resetEating();
					}
				}
			}

		}
		//////////////////////////
		
		////////////////////////
		//////reproduction//////
		
		//////find female///////
		if(lapinf.size() >= 1){
			float currentSmallest;
			float dist;
			for(int a = lapinm.size()-1; a >=0; a--){
				LapinM lm = lapinm.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(lm.reproduceTime() == false){
					lm.wander(parent);
				}
				if(lm.reproduceTime() == true){
					if(lapinm.size() < 10 || lapinf.size() < 10){
						for(int b = lapinf.size()-1; b >= 0; b--){
							LapinF lf = lapinf.get(b);
							dist = ((lm.position.x - lf.position.x) * (lm.position.x - lf.position.x)) +
								   ((lm.position.y - lf.position.y) * (lm.position.y - lf.position.y));
							if( dist < currentSmallest){
								currentSmallest = dist;
								target.x = lf.position.x;
								target.y = lf.position.y;
							}
						}
						lm.findFemale(target);
					}
				}
			}
		}
		////////////////////////
		
		/////reproduction///////
		for(int a = lapinm.size()-1; a >= 0; a--){
			for(int b = lapinf.size()-1; b >= 0; b--){
				for(int c = lapinnid.size()-1; c >=0; c--){
					LapinM lm = lapinm.get(a);
					LapinF lf = lapinf.get(b);
					LapinNid nid = lapinnid.get(c);
					PVector lmpos = lm.position;
					PVector lfpos = lf.position;
					PVector nidpos = nid.position;
					float d = PVector.dist(lmpos, lfpos);
					if(d < lf.getR() && lf.reproduceTime() == true){  /////a changer juste pour test
						DNAlapin momgenes = lm.getDNAlapin();
						DNAlapin dadgenes = lf.getDNAlapin();
						DNAlapin childdna = momgenes.crossover(dadgenes, parent);
						if(parent.random(10) > 5 && lapinm.size() < 10){
							lapinm.add(new LapinM(nidpos, childdna, parent));
							lf.resetReproduce();
							lm.resetReproduce();
						}
						if(parent.random(10) < 5 && lapinf.size() < 10){
							lapinf.add(new LapinF(nidpos, childdna, parent));
							lf.resetReproduce();
							lm.resetReproduce();
						}
					}
				}
			}
		}
		////////////////////////

		//////ECUREUIL//////////
		//////MALE//////////////
		while(ecureuilm.size() < 1){
			for(int i = 0; i < totalecureuilm; i++){
				PVector l = new PVector();
				l.x = parent.random(worldW-(worldW-50) , worldW-50);
				l.y	= parent.random(worldH-(worldH-50) , worldH-50);
				boolean overlapping = false;
				for(int a = 0; a < tilewater.size(); a++){
					tileWater other = tilewater.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 60){
						overlapping = true;
						break;
					}
				}
				if(!overlapping){
					DNAecureuil dnaecureuil = new DNAecureuil(parent);
					ecureuilm.add(new EcureuilM(l,dnaecureuil,parent));
				}
			}
		}


		Iterator<EcureuilM> EM = ecureuilm.iterator();
		while(EM.hasNext()){
			EcureuilM em = EM.next();
			em.run(parent);
			em.boundaries();
			if(em.eatingTime() == false ){
				em.mvtUpdate();
			}
			/*
			if(em.dead() == true){
				EM.remove();
				PVector l = new PVector(parent.random(em.position.x-10, em.position.x+10), parent.random(em.position.y-10, em.position.y+10));
				meat.add(new Meat(parent,l));
			}
			*/
			Iterator<tileWater> tileW = tilewater.iterator();
			while(tileW.hasNext()){
				tileWater tilew = tileW.next();
				PVector target = new PVector(tilew.position.x, tilew.position.y);
				if(em.isTooClose(target)){
					em.goAway(target);
				}
			}
			
			/////runaway mechanisme//////
			Iterator<FuretM> FUM = furetm.iterator();
			while(FUM.hasNext()){
				FuretM fum = FUM.next();
				PVector target = new PVector(fum.position.x, fum.position.y);
				if(fum.NstarvingLvl2() == true && em.isInDanger(target)){
					em.runaway(target);
				}
			}
			Iterator<FuretF> FUF = furetf.iterator();
			while(FUF.hasNext()){
				FuretF fuf = FUF.next();
				PVector target = new PVector(fuf.position.x, fuf.position.y);
				if(fuf.NstarvingLvl2() == true && em.isInDanger(target)){
					em.runaway(target);
				}
			}
			Iterator<WolfM> WM = wolfm.iterator();
			while(WM.hasNext()){
				WolfM wm = WM.next();
				PVector target = new PVector(wm.position.x, wm.position.y);
				if(wm.NstarvingLvl2() == true && em.isInDanger(target)){
					em.runaway(target);
				}
			}
			Iterator<WolfF> WF = wolff.iterator();
			while(WF.hasNext()){
				WolfF wf = WF.next();
				PVector target = new PVector(wf.position.x, wf.position.y);
				if(wf.NstarvingLvl2() == true && em.isInDanger(target)){
					em.runaway(target);
				}
			}
			/////////////////////////////
		}

		///////find food insecte/flower/berry/champi/////////
		if(ecureuilm.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = ecureuilm.size()-1; a >=0; a--){
				EcureuilM ecum = ecureuilm.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(ecum.Nfaim() == false){
					ecum.wander(parent);
				}
				if(ecum.Nfaim() == true){
					for(int b = insect1m.size()-1; b >=0; b--){
						insect1M i1m = insect1m.get(b);
						dist = ((ecum.position.x - i1m.position.x) * (ecum.position.x - i1m.position.x)) +
							   ((ecum.position.y - i1m.position.y) * (ecum.position.y - i1m.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = i1m.position.x;
							target.y = i1m.position.y;
						}
					}
					for(int c = redberry.size()-1; c >=0; c--){
						RedBerry rb = redberry.get(c);
						dist = ((ecum.position.x - rb.position.x) * (ecum.position.x - rb.position.x)) +
							   ((ecum.position.y - rb.position.y) * (ecum.position.y - rb.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = rb.position.x;
							target.y = rb.position.y;
						}
					}
					for(int d = yellowberry.size()-1; d >=0; d--){
						YellowBerry yb = yellowberry.get(d);
						dist = ((ecum.position.x - yb.position.x) * (ecum.position.x - yb.position.x)) +
							   ((ecum.position.y - yb.position.y) * (ecum.position.y - yb.position.y));
						if( dist < currentSmallest){
							currentSmallest = dist;
							target.x = yb.position.x;
							target.y = yb.position.y;
						}
					}
					for(int e = flower.size()-1; e >=0; e--){
						Flower fl = flower.get(e);
						dist = ((ecum.position.x - fl.position.x) * (ecum.position.x - fl.position.x)) +
							   ((ecum.position.y - fl.position.y) * (ecum.position.y - fl.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = fl.position.x;
							target.y = fl.position.y;
						}
					}
					for(int f = champi.size()-1; f >=0; f--){
						Champi ch = champi.get(f);
						dist = ((ecum.position.x - ch.position.x) * (ecum.position.x - ch.position.x)) +
								   ((ecum.position.y - ch.position.y) * (ecum.position.y - ch.position.y));
							if( dist < currentSmallest ){
								currentSmallest = dist;
								target.x = ch.position.x;
								target.y = ch.position.y;
							}
					}
					ecum.findPray(target);
				}
			}
		}
		/////////////////////////
		
		////////eat insect redberry yellow berry flower champi////////
		Iterator<EcureuilM> EcuM = ecureuilm.iterator();
		while(EcuM.hasNext()){
			EcureuilM ecum = EcuM.next();
			Iterator<insect1M> i1M = insect1m.iterator();
			while(i1M.hasNext()){
				insect1M i1m = i1M.next();
				PVector i1mpos = i1m.position;
				PVector ecumpos = ecum.position;
				float d = PVector.dist(i1mpos, ecumpos);
				if(ecum.Nfaim() == true){
					if(d < ecum.getR()){
						float food = 100;
						ecum.eat(food);
						i1M.remove();
						ecum.resetEating();
					}
				}
			}
			Iterator<RedBerry> ReB = redberry.iterator();
			while(ReB.hasNext()){
				RedBerry reb = ReB.next();
				PVector rebpos = reb.position;
				PVector ecumpos = ecum.position;
				float d = PVector.dist(rebpos, ecumpos);
				if(ecum.Nfaim() == true){
					if(d < ecum.getR()){
						float food = 100;
						ecum.eat(food);
						ReB.remove();
						ecum.resetEating();
					}
				}
			}
			Iterator<YellowBerry> YeB = yellowberry.iterator();
			while(YeB.hasNext()){
				YellowBerry yeb = YeB.next();
				PVector yebpos = yeb.position;
				PVector ecumpos = ecum.position;
				float d = PVector.dist(yebpos, ecumpos);
				if(ecum.Nfaim() == true){
					if(d < ecum.getR()){
						float food = 100;
						ecum.eat(food);
						YeB.remove();
						ecum.resetEating();
					}
				}
			}
			Iterator<Flower> Fl = flower.iterator();
			while(Fl.hasNext()){
				Flower fl = Fl.next();
				PVector flpos = fl.position;
				PVector ecumpos = ecum.position;
				float d = PVector.dist(flpos, ecumpos);
				if(ecum.Nfaim() == true){
					if(d < ecum.getR()){
						float food = 100;
						ecum.eat(food);
						Fl.remove(); 
						ecum.resetEating();
					}
				}
			}
			Iterator<Champi> Ch = champi.iterator();
			while(Ch.hasNext()){
				Champi ch = Ch.next();
				PVector chpos = ch.position;
				PVector ecumpos = ecum.position;
				float d = PVector.dist(chpos, ecumpos);
				if(ecum.Nfaim() == true){
					if(d < ecum.getR()){
						float food = 100;
						ecum.eat(food);
						Ch.remove(); 
						ecum.resetEating();
					}
				}
			}
		}
		//////////////////////////
		
		//////FEMALE////////////
		while(ecureuilf.size() < 1){
			for(int i = 0; i < totalecureuilf; i++){
				PVector l = new PVector();
				l.x = parent.random(worldW-(worldW-50) , worldW-50);
				l.y	= parent.random(worldH-(worldH-50) , worldH-50);
				boolean overlapping = false;
				for(int a = 0; a < tilewater.size(); a++){
					tileWater other = tilewater.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 160){
						overlapping = true;
						break;
					}
				}
				if(!overlapping){
					DNAecureuil dnaecureuil = new DNAecureuil(parent);
					ecureuilf.add(new EcureuilF(l,dnaecureuil,parent));
				}
			}
		}

		
		Iterator<EcureuilF> EF = ecureuilf.iterator();
		while(EF.hasNext()){
			EcureuilF ef = EF.next();
			ef.run(parent);
			ef.boundaries();
			if(ef.eatingTime() == false ){
				ef.mvtUpdate();
			}
			/*
			if(ef.dead() == true){
				EF.remove();
				PVector l = new PVector(parent.random(ef.position.x-10, ef.position.x+10), parent.random(ef.position.y-10, ef.position.y+10));
				meat.add(new Meat(parent,l));
			}
			*/
			Iterator<tileWater> tileW = tilewater.iterator();
			while(tileW.hasNext()){
				tileWater tilew = tileW.next();
				PVector target = new PVector(tilew.position.x, tilew.position.y);
				if(ef.isTooClose(target)){
					ef.goAway(target);
				}
			}
			/////runaway mechanisme//////
			Iterator<FuretM> FUM = furetm.iterator();
			while(FUM.hasNext()){
				FuretM fum = FUM.next();
				PVector target = new PVector(fum.position.x, fum.position.y);
				if(fum.NstarvingLvl2() == true && ef.isInDanger(target)){
					ef.runaway(target);
				}
			}
			Iterator<FuretF> FUF = furetf.iterator();
			while(FUF.hasNext()){
				FuretF fuf = FUF.next();
				PVector target = new PVector(fuf.position.x, fuf.position.y);
				if(fuf.NstarvingLvl2() == true && ef.isInDanger(target)){
					ef.runaway(target);
				}
			}
			Iterator<WolfM> WM = wolfm.iterator();
			while(WM.hasNext()){
				WolfM wm = WM.next();
				PVector target = new PVector(wm.position.x, wm.position.y);
				if(wm.NstarvingLvl2() == true && ef.isInDanger(target)){
					ef.runaway(target);
				}
			}
			Iterator<WolfF> WF = wolff.iterator();
			while(WF.hasNext()){
				WolfF wf = WF.next();
				PVector target = new PVector(wf.position.x, wf.position.y);
				if(wf.NstarvingLvl2() == true && ef.isInDanger(target)){
					ef.runaway(target);
				}
			}
			/////////////////////////////

		}

		///////find food insecte redberry yellow berry flower champi/////////
		if(ecureuilf.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = ecureuilf.size()-1; a >=0; a--){
				EcureuilF ecuf = ecureuilf.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(ecuf.Nfaim() == false){
					ecuf.wander(parent);
				}
				if(ecuf.Nfaim() == true){
					for(int b = insect1m.size()-1; b >=0; b--){
						insect1M i1m = insect1m.get(b);
						dist = ((ecuf.position.x - i1m.position.x) * (ecuf.position.x - i1m.position.x)) +
							   ((ecuf.position.y - i1m.position.y) * (ecuf.position.y - i1m.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = i1m.position.x;
							target.y = i1m.position.y;
						}
					}
					for(int c = redberry.size()-1; c >=0; c--){
						RedBerry rb = redberry.get(c);
						dist = ((ecuf.position.x - rb.position.x) * (ecuf.position.x - rb.position.x)) +
							   ((ecuf.position.y - rb.position.y) * (ecuf.position.y - rb.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = rb.position.x;
							target.y = rb.position.y;
						}
					}
					for(int d = yellowberry.size()-1; d >=0; d--){
						YellowBerry yb = yellowberry.get(d);
						dist = ((ecuf.position.x - yb.position.x) * (ecuf.position.x - yb.position.x)) +
							   ((ecuf.position.y - yb.position.y) * (ecuf.position.y - yb.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = yb.position.x;
							target.y = yb.position.y;
						}
					}
					for(int e = flower.size()-1; e >=0; e--){
						Flower fl = flower.get(e);
						dist = ((ecuf.position.x - fl.position.x) * (ecuf.position.x - fl.position.x)) +
							   ((ecuf.position.y - fl.position.y) * (ecuf.position.y - fl.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = fl.position.x;
							target.y = fl.position.y;
						}
					}
					for(int f = champi.size()-1; f >=0; f--){
						Champi ch = champi.get(f);
						dist = ((ecuf.position.x - ch.position.x) * (ecuf.position.x - ch.position.x)) +
							   ((ecuf.position.y - ch.position.y) * (ecuf.position.y - ch.position.y));
							if( dist < currentSmallest ){
								currentSmallest = dist;
								target.x = ch.position.x;
								target.y = ch.position.y;
							}
					}
					ecuf.findPray(target);
				}
			}
		}
		/////////////////////////
		
		////////eat insect////////
		Iterator<EcureuilF> EcuF = ecureuilf.iterator();
		while(EcuF.hasNext()){
			EcureuilF ecuf = EcuF.next();
			Iterator<insect1M> i1M = insect1m.iterator();
			while(i1M.hasNext()){
				insect1M i1m = i1M.next();
				PVector i1mpos = i1m.position;
				PVector ecufpos = ecuf.position;
				float d = PVector.dist(i1mpos, ecufpos);
				if(ecuf.Nfaim() == true){
					if(d < ecuf.getR()){
						float food = 100;
						ecuf.eat(food);
						i1M.remove();
						ecuf.resetEating();
					}
				}
			}
			Iterator<RedBerry> ReB = redberry.iterator();
			while(ReB.hasNext()){
				RedBerry reb = ReB.next();
				PVector rebpos = reb.position;
				PVector ecufpos = ecuf.position;
				float d = PVector.dist(rebpos, ecufpos);
				if(ecuf.Nfaim() == true){
					if(d < ecuf.getR()){
						float food = 100;
						ecuf.eat(food);
						ReB.remove();
						ecuf.resetEating();
					}
				}
			}
			Iterator<YellowBerry> YeB = yellowberry.iterator();
			while(YeB.hasNext()){
				YellowBerry yeb = YeB.next();
				PVector yebpos = yeb.position;
				PVector ecufpos = ecuf.position;
				float d = PVector.dist(yebpos, ecufpos);
				if(ecuf.Nfaim() == true){
					if(d < ecuf.getR()){
						float food = 100;
						ecuf.eat(food);
						YeB.remove();
						ecuf.resetEating();
					}
				}
			}
			Iterator<Flower> Fl = flower.iterator();
			while(Fl.hasNext()){
				Flower fl = Fl.next();
				PVector flpos = fl.position;
				PVector ecufpos = ecuf.position;
				float d = PVector.dist(flpos, ecufpos);
				if(ecuf.Nfaim() == true){
					if(d < ecuf.getR()){
						float food = 100;
						ecuf.eat(food);
						Fl.remove(); 
						ecuf.resetEating();
					}
				}
			}
			Iterator<Champi> Ch = champi.iterator();
			while(Ch.hasNext()){
				Champi ch = Ch.next();
				PVector chpos = ch.position;
				PVector ecufpos = ecuf.position;
				float d = PVector.dist(chpos, ecufpos);
				if(ecuf.Nfaim() == true){
					if(d < ecuf.getR()){
						float food = 100;
						ecuf.eat(food);
						Ch.remove(); 
						ecuf.resetEating();
					}
				}
			}
		}
		//////////////////////////

		////////reproduction SANS NID//////
		//////find female///////
		if(ecureuilf.size() >= 1){
			float currentSmallest;
			float dist;
			for(int a = ecureuilm.size()-1; a >=0; a--){
				EcureuilM em = ecureuilm.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(em.reproduceTime() == false){
					em.wander(parent);
				}
				if(em.reproduceTime() == true){
					if(ecureuilm.size() < 10 || ecureuilf.size() < 10){
						for(int b = ecureuilf.size()-1; b >= 0; b--){
							EcureuilF ef = ecureuilf.get(b);
							dist = ((em.position.x - ef.position.x) * (em.position.x - ef.position.x)) +
								   ((em.position.y - ef.position.y) * (em.position.y - ef.position.y));
							if( dist < currentSmallest){
								currentSmallest = dist;
								target.x = ef.position.x;
								target.y = ef.position.y;
							}
						}
						em.findFemale(target);
					}
				}
			}
		}
		////////////////////////
		
		/////reproduction///////
		for(int a = ecureuilm.size()-1; a >= 0; a--){
			for(int b = ecureuilf.size()-1; b >= 0; b--){
				for(int c = feuillu.size()-1; c >=0; c--){
					EcureuilM em = ecureuilm.get(a);
					EcureuilF ef = ecureuilf.get(b);
					Feuillu feuill = feuillu.get(c);
					PVector lmpos = em.position;
					PVector lfpos = ef.position;
					PVector nidpos = feuill.position;
					float d = PVector.dist(lmpos, lfpos);
					if(d < ef.getR() && ef.reproduceTime() == true){  /////a changer juste pour test
						DNAecureuil momgenes = em.getDNAecureuil();
						DNAecureuil dadgenes = ef.getDNAecureuil();
						DNAecureuil childdna = momgenes.crossover(dadgenes, parent);
						if(parent.random(10) > 5 && ecureuilm.size() < 10){
							ecureuilm.add(new EcureuilM(nidpos, childdna, parent));
							ef.resetReproduce();
							em.resetReproduce();
						}
						if(parent.random(10) < 5 && ecureuilf.size() < 10){
							ecureuilf.add(new EcureuilF(nidpos, childdna, parent));
							ef.resetReproduce();
							em.resetReproduce();
						}
					}
				}
			}
		}
		////////////////////////

		//////BOAR////////////////
		//////MALE//////////////
		
		PVector herdSpawn = new PVector();
		herdSpawn.x = parent.random(worldW-(worldW-200) , worldW-200);
		herdSpawn.y	= parent.random(worldH-(worldH-200) , worldH-200);
		
		while(boarm.size() < 1){
			for(int i = 0; i < totalboarm; i++){
				PVector l = new PVector(parent.random(herdSpawn.x-100, herdSpawn.x+100), parent.random(herdSpawn.y-100, herdSpawn.y+100));
				DNAboar dnaboar = new DNAboar(parent);
				boarm.add(new BoarM(l,dnaboar,parent));
				Iterator<BoarM> BoM = boarm.iterator();
				while(BoM.hasNext()){
					BoarM bom = BoM.next();
					bom.gettingOld();
				}
			}
		}

		Iterator<BoarM> BoM = boarm.iterator();
		while(BoM.hasNext()){
			BoarM bom = BoM.next();
			bom.run(parent);
			bom.boundaries();
			
			if(bom.eatingTime() == false ){
				bom.mvtUpdate();
			}
			
			
			Iterator<tileWater> tileW = tilewater.iterator();
			while(tileW.hasNext()){
				tileWater tilew = tileW.next();
				PVector target = new PVector(tilew.position.x, tilew.position.y);
				if(bom.isTooClose(target)){
					bom.goAway(target);
				}
			}
			/////runaway mechanisme//////
			Iterator<WolfM> WM = wolfm.iterator();
			while(WM.hasNext()){
				WolfM wm = WM.next();
				PVector target = new PVector(wm.position.x, wm.position.y);
				if(wm.NstarvingLvl4() == true && bom.isInDanger(target)){
					bom.runaway(target);
				}
			}
			Iterator<WolfF> WF = wolff.iterator();
			while(WF.hasNext()){
				WolfF wf = WF.next();
				PVector target = new PVector(wf.position.x, wf.position.y);
				if(wf.NstarvingLvl4() == true && bom.isInDanger(target)){
					bom.runaway(target);
				}
			}
			/////////////////////////////
		}
		
		//////find water//////
		if(boarm.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = boarm.size()-1; a >=0; a--){
				BoarM bom = boarm.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(bom.soif() == false){
					bom.wander(parent);
				}
				if(bom.soif() == true){
					for(int b = tilewater.size()-1 ; b >=0; b--){
						tileWater tw = tilewater.get(b);
						dist = ((bom.position.x - tw.position.x) * (bom.position.x - tw.position.x)) +
							   ((bom.position.y - tw.position.y) * (bom.position.y - tw.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = tw.position.x;
							target.y = tw.position.y;
						}
					}
					bom.findWater(target);
				}
			}
		}

		
		///////find food insecte chenille champi red and yellow berry souris ///////// 
		if(boarm.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = boarm.size()-1; a >=0; a--){
				BoarM bm = boarm.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				
				if(bm.NstarvingLvl1() == false || bm.NstarvingLvl2() == false){
					bm.wander(parent);
				}
				
				if(bm.NstarvingLvl1() == true){
					for(int b = insect1m.size()-1; b >=0; b--){
						insect1M i1m = insect1m.get(b);
						dist = ((bm.position.x - i1m.position.x) * (bm.position.x - i1m.position.x)) +
							   ((bm.position.y - i1m.position.y) * (bm.position.y - i1m.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = i1m.position.x;
							target.y = i1m.position.y;
						}
					}
					for(int c = papillonbchenille.size()-1; c >=0; c--){
						PapillonBchenille pbc = papillonbchenille.get(c);
						dist = ((bm.position.x - pbc.position.x) * (bm.position.x - pbc.position.x)) +
							   ((bm.position.y - pbc.position.y) * (bm.position.y - pbc.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = pbc.position.x;
							target.y = pbc.position.y;
						}
					}
					for(int d = champi.size()-1; d >=0; d--){
						Champi ch = champi.get(d);
						dist = ((bm.position.x - ch.position.x) * (bm.position.x - ch.position.x)) +
							   ((bm.position.y - ch.position.y) * (bm.position.y - ch.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = ch.position.x;
							target.y = ch.position.y;
						}
					}
					for(int e = redberry.size()-1; e >=0; e--){
						RedBerry rb = redberry.get(e);
						dist = ((bm.position.x - rb.position.x) * (bm.position.x - rb.position.x)) +
							   ((bm.position.y - rb.position.y) * (bm.position.y - rb.position.y));
						if( dist < currentSmallest){
							currentSmallest = dist;
							target.x = rb.position.x;
							target.y = rb.position.y;
						}
					}
					for(int f = yellowberry.size()-1; f >=0; f--){
						YellowBerry yb = yellowberry.get(f);
						dist = ((bm.position.x - yb.position.x) * (bm.position.x - yb.position.x)) +
							   ((bm.position.y - yb.position.y) * (bm.position.y - yb.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = yb.position.x;
							target.y = yb.position.y;
						}
					}
					/*
					for(int i = meat.size()-1; i >=0; i--){
						Meat me = meat.get(i);
						dist = ((bm.position.x - me.position.x) * (bm.position.x - me.position.x)) +
							   ((bm.position.y - me.position.y) * (bm.position.y - me.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = me.position.x;
							target.y = me.position.y;
						}
					}
					*/
					bm.findPray(target);
				}
				
				if(bm.NstarvingLvl2() == true){
					for(int g = sourism.size()-1; g >=0; g--){
						SourisM sm = sourism.get(g);
						dist = ((bm.position.x - sm.position.x) * (bm.position.x - sm.position.x)) +
							   ((bm.position.y - sm.position.y) * (bm.position.y - sm.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = sm.position.x;
							target.y = sm.position.y;
						}
					}
					for(int h = sourisf.size()-1; h >=0; h--){
						SourisF sf = sourisf.get(h);
						dist = ((bm.position.x - sf.position.x) * (bm.position.x - sf.position.x)) +
							   ((bm.position.y - sf.position.y) * (bm.position.y - sf.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = sf.position.x;
							target.y = sf.position.y;
						}
					}
					bm.findPray(target);
				}
			}
		}
		/////////////////////////
		
		////////eat insect chenille champi red and yellow berry souris////////
		Iterator<BoarM> BoarM = boarm.iterator();
		while(BoarM.hasNext()){
			BoarM bm = BoarM.next();
			Iterator<insect1M> i1M = insect1m.iterator();
			while(i1M.hasNext()){
				insect1M i1m = i1M.next();
				PVector i1mpos = i1m.position;
				PVector bmpos = bm.position;
				float d = PVector.dist(i1mpos, bmpos);
				if(bm.NstarvingLvl1() == true){
					if(d < bm.getR()){
						float food = 100;
						bm.eat(food);
						i1M.remove();
						bm.resetEating();
					}
				}
			}
			Iterator<PapillonBchenille> PBc = papillonbchenille.iterator();
			while(PBc.hasNext()){
				PapillonBchenille pbc = PBc.next();
				PVector pbcpos = pbc.position;
				PVector bmpos = bm.position;
				float d = PVector.dist(pbcpos, bmpos);
				if(bm.NstarvingLvl1() == true){
					if(d < bm.getR()){
						float food = 100;
						bm.eat(food);
						PBc.remove();
						bm.resetEating();
					}
				}
			}
			Iterator<Champi> CH = champi.iterator();
			while(CH.hasNext()){
				Champi ch = CH.next();
				PVector chpos = ch.position;
				PVector bmpos = bm.position;
				float d = PVector.dist(chpos, bmpos);
				if(bm.NstarvingLvl1() == true){
					if(d < bm.getR()){
						float food = 100;
						bm.eat(food);
						CH.remove();
						bm.resetEating();
					}
				}
			}
			Iterator<RedBerry> ReB = redberry.iterator();
			while(ReB.hasNext()){
				RedBerry reb = ReB.next();
				PVector rebpos = reb.position;
				PVector bmpos = bm.position;
				float d = PVector.dist(rebpos, bmpos);
				if(bm.NstarvingLvl1() == true){
					if(d < bm.getR()){
						float food = 100;
						bm.eat(food);
						ReB.remove();
						bm.resetEating();
					}
				}
			}
			Iterator<YellowBerry> YeB = yellowberry.iterator();
			while(YeB.hasNext()){
				YellowBerry yeb = YeB.next();
				PVector yebpos = yeb.position;
				PVector bmpos = bm.position;
				float d = PVector.dist(yebpos, bmpos);
				if(bm.NstarvingLvl1() == true){
					if(d < bm.getR()){
						float food = 100;
						bm.eat(food);
						YeB.remove();
						bm.resetEating();
					}
				}
			}
			Iterator<SourisM> SoM = sourism.iterator();
			while(SoM.hasNext()){
				SourisM som = SoM.next();
				PVector sompos = som.position;
				PVector bmpos = bm.position;
				float d = PVector.dist(sompos, bmpos);
				if(bm.NstarvingLvl2() == true){
					if(d < bm.getR()){
						float food = som.getWeight();
						bm.eat(food);
						SoM.remove();
						bm.resetEating();
					}
				}
			}
			Iterator<SourisF> SoF = sourisf.iterator();
			while(SoF.hasNext()){
				SourisF sof = SoF.next();
				PVector sofpos = sof.position;
				PVector bmpos = bm.position;
				float d = PVector.dist(sofpos, bmpos);
				if(bm.NstarvingLvl2() == true){
					if(d < bm.getR()){
						float food = sof.getWeight();
						bm.eat(food);
						SoF.remove();
						bm.resetEating();
					}
				}
			}
			/*
			Iterator<Meat> Me = meat.iterator();
			while(Me.hasNext()){
				Meat me = Me.next();
				PVector mepos = me.position;
				PVector bmpos = bm.position;
				float d = PVector.dist(mepos, bmpos);
				if(bm.NstarvingLvl1() == true){
					if(d < bm.getR()){
						float food = 1000;
						bm.eat(food);
						Me.remove();
						bm.resetEating();
					}
				}
			}
			*/
			Iterator<tileWater> TW = tilewater.iterator();
			while(TW.hasNext()){
				tileWater tw = TW.next();
				PVector bfpos = bm.position;
				PVector twpos = tw.position;
				float d = PVector.dist(twpos, bfpos);
				if(bm.soif() == true){
					if(d < bm.getR()){
						bm.drinkWater();
					}
				}
			}

		}
		//////////////////////////


		/////////////////////////
		
		//////FEMALE//////////////
		while(boarf.size() < 1){
			for(int i = 0; i < totalboarf; i++){
				PVector l = new PVector(parent.random(herdSpawn.x-100, herdSpawn.x+100), parent.random(herdSpawn.y-100, herdSpawn.y+100));
				DNAboar dnaboar = new DNAboar(parent);
				boarf.add(new BoarF(l,dnaboar,parent));
				Iterator<BoarF> BoF = boarf.iterator();
				while(BoF.hasNext()){
					BoarF bof = BoF.next();
					bof.gettingOld();
				}
			}
		}

		Iterator<BoarF> BoF = boarf.iterator();
		while(BoF.hasNext()){
			BoarF bof = BoF.next();
			bof.run(parent);
			bof.boundaries();
			if(bof.eatingTime() == false ){
				bof.mvtUpdate();
			}
			
			/*
			if(bof.dead() == true){
				BoF.remove();
				int randomMeat = (int) parent.random(1, 2);
				int randomFurr = (int) parent.random(1, 2);
				for(int a = 0; a < randomMeat; a++){
					PVector l = new PVector(parent.random(bof.position.x-20, bof.position.x+20), parent.random(bof.position.y-20, bof.position.y+20));
					meat.add(new Meat(parent,l));
				}
				for(int b = 0; b < randomFurr; b++){
					PVector l = new PVector(parent.random(bof.position.x-20, bof.position.x+20), parent.random(bof.position.y-20, bof.position.y+20));
					furr.add(new Furr(parent, l));
				}
			}
			*/
			Iterator<tileWater> tileW = tilewater.iterator();
			while(tileW.hasNext()){
				tileWater tilew = tileW.next();
				PVector target = new PVector(tilew.position.x, tilew.position.y);
				if(bof.isTooClose(target)){
					bof.goAway(target);
				}
			}
			/////runaway mechanisme//////
			Iterator<WolfM> WM = wolfm.iterator();
			while(WM.hasNext()){
				WolfM wm = WM.next();
				PVector target = new PVector(wm.position.x, wm.position.y);
				if(wm.NstarvingLvl4() == true && bof.isInDanger(target)){
					bof.runaway(target);
				}
			}
			Iterator<WolfF> WF = wolff.iterator();
			while(WF.hasNext()){
				WolfF wf = WF.next();
				PVector target = new PVector(wf.position.x, wf.position.y);
				if(wf.NstarvingLvl4() == true && bof.isInDanger(target)){
					bof.runaway(target);
				}
			}
			/////////////////////////////
		}
		
		//////find water//////
		if(boarf.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = boarf.size()-1; a >=0; a--){
				BoarF bof = boarf.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(bof.soif() == false){
					bof.wander(parent);
				}
				if(bof.soif() == true){
					for(int b = tilewater.size()-1 ; b >=0; b--){
						tileWater tw = tilewater.get(b);
						dist = ((bof.position.x - tw.position.x) * (bof.position.x - tw.position.x)) +
							   ((bof.position.y - tw.position.y) * (bof.position.y - tw.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = tw.position.x;
							target.y = tw.position.y;
						}
					}
					bof.findWater(target);
				}
			}
		}


		///////find food insecte chenille champi red and yellow berry souris///////// 
		if(boarf.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = boarf.size()-1; a >=0; a--){
				BoarF bf = boarf.get(a);
				
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(bf.NstarvingLvl1() == false || bf.NstarvingLvl2() == false){
					bf.wander(parent);
				}
				
				if(bf.NstarvingLvl1() == true){
					for(int b = insect1m.size()-1; b >=0; b--){
						insect1M i1m = insect1m.get(b);
						dist = ((bf.position.x - i1m.position.x) * (bf.position.x - i1m.position.x)) +
							   ((bf.position.y - i1m.position.y) * (bf.position.y - i1m.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = i1m.position.x;
							target.y = i1m.position.y;
						}
					}
					for(int c = papillonbchenille.size()-1; c >=0; c--){
						PapillonBchenille pbc = papillonbchenille.get(c);
						dist = ((bf.position.x - pbc.position.x) * (bf.position.x - pbc.position.x)) +
							   ((bf.position.y - pbc.position.y) * (bf.position.y - pbc.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = pbc.position.x;
							target.y = pbc.position.y;
						}
					}
					for(int d = champi.size()-1; d >=0; d--){
						Champi ch = champi.get(d);
						dist = ((bf.position.x - ch.position.x) * (bf.position.x - ch.position.x)) +
							   ((bf.position.y - ch.position.y) * (bf.position.y - ch.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = ch.position.x;
							target.y = ch.position.y;
						}
					}
					for(int e = redberry.size()-1; e >=0; e--){
						RedBerry rb = redberry.get(e);
						dist = ((bf.position.x - rb.position.x) * (bf.position.x - rb.position.x)) +
							   ((bf.position.y - rb.position.y) * (bf.position.y - rb.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = rb.position.x;
							target.y = rb.position.y;
						}
					}
					for(int f = yellowberry.size()-1; f >=0; f--){
						YellowBerry yb = yellowberry.get(f);
						dist = ((bf.position.x - yb.position.x) * (bf.position.x - yb.position.x)) +
							   ((bf.position.y - yb.position.y) * (bf.position.y - yb.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = yb.position.x;
							target.y = yb.position.y;
						}
					}
					/*
					for(int i = meat.size()-1; i >=0; i--){
						Meat me = meat.get(i);
						dist = ((bf.position.x - me.position.x) * (bf.position.x - me.position.x)) +
							   ((bf.position.y - me.position.y) * (bf.position.y - me.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = me.position.x;
							target.y = me.position.y;
						}
					}
					*/
					bf.findPray(target);
				}
				
				if(bf.NstarvingLvl2() == true){
					for(int g = sourism.size()-1; g >=0; g--){
						SourisM sm = sourism.get(g);
						dist = ((bf.position.x - sm.position.x) * (bf.position.x - sm.position.x)) +
							   ((bf.position.y - sm.position.y) * (bf.position.y - sm.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = sm.position.x;
							target.y = sm.position.y;
						}
					}
					for(int h = sourisf.size()-1; h >=0; h--){
						SourisF sf = sourisf.get(h);
						dist = ((bf.position.x - sf.position.x) * (bf.position.x - sf.position.x)) +
							   ((bf.position.y - sf.position.y) * (bf.position.y - sf.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = sf.position.x;
							target.y = sf.position.y;
						}
					}
					bf.findPray(target);
				}
			}
		}
		/////////////////////////
		
		////////eat insect////////
		Iterator<BoarF> BoarF = boarf.iterator();
		while(BoarF.hasNext()){
			BoarF bf = BoarF.next();
			Iterator<insect1M> i1M = insect1m.iterator();
			while(i1M.hasNext()){
				insect1M i1m = i1M.next();
				PVector i1mpos = i1m.position;
				PVector bfpos = bf.position;
				float d = PVector.dist(i1mpos, bfpos);
				if(bf.NstarvingLvl1() == true){
					if(d < bf.getR()){
						float food = 100;
						bf.eat(food);
						i1M.remove();
						bf.resetEating();
					}
				}
			}
			Iterator<PapillonBchenille> PBc = papillonbchenille.iterator();
			while(PBc.hasNext()){
				PapillonBchenille pbc = PBc.next();
				PVector pbcpos = pbc.position;
				PVector bmpos = bf.position;
				float d = PVector.dist(pbcpos, bmpos);
				if(bf.NstarvingLvl1() == true){
					if(d < bf.getR()){
						float food = 100;
						bf.eat(food);
						PBc.remove();
						bf.resetEating();
					}
				}
			}
			Iterator<Champi> CH = champi.iterator();
			while(CH.hasNext()){
				Champi ch = CH.next();
				PVector chpos = ch.position;
				PVector bmpos = bf.position;
				float d = PVector.dist(chpos, bmpos);
				if(bf.NstarvingLvl1() == true){
					if(d < bf.getR()){
						float food = 100;
						bf.eat(food);
						CH.remove();
						bf.resetEating();
					}
				}
			}
			Iterator<RedBerry> ReB = redberry.iterator();
			while(ReB.hasNext()){
				RedBerry reb = ReB.next();
				PVector rebpos = reb.position;
				PVector bfpos = bf.position;
				float d = PVector.dist(rebpos, bfpos);
				if(bf.NstarvingLvl1() == true){
					if(d < bf.getR()){
						float food = 100;
						bf.eat(food);
						ReB.remove();
						bf.resetEating();
					}
				}
			}
			Iterator<YellowBerry> YeB = yellowberry.iterator();
			while(YeB.hasNext()){
				YellowBerry yeb = YeB.next();
				PVector yebpos = yeb.position;
				PVector bfpos = bf.position;
				float d = PVector.dist(yebpos, bfpos);
				if(bf.NstarvingLvl1() == true){
					if(d < bf.getR()){
						float food = 100;
						bf.eat(food);
						YeB.remove();
						bf.resetEating();
					}
				}
			}
			Iterator<SourisM> SoM = sourism.iterator();
			while(SoM.hasNext()){
				SourisM som = SoM.next();
				PVector sompos = som.position;
				PVector bfpos = bf.position;
				float d = PVector.dist(sompos, bfpos);
				if(bf.NstarvingLvl2() == true){
					if(d < bf.getR()){
						float food = som.getWeight();
						bf.eat(food);
						SoM.remove();
						bf.resetEating();
					}
				}
			}
			Iterator<SourisF> SoF = sourisf.iterator();
			while(SoF.hasNext()){
				SourisF sof = SoF.next();
				PVector sofpos = sof.position;
				PVector bfpos = bf.position;
				float d = PVector.dist(sofpos, bfpos);
				if(bf.NstarvingLvl2() == true){
					if(d < bf.getR()){
						float food = sof.getWeight();
						bf.eat(food);
						SoF.remove();
						bf.resetEating();
					}
				}
			}
			/*
			Iterator<Meat> Me = meat.iterator();
			while(Me.hasNext()){
				Meat me = Me.next();
				PVector mepos = me.position;
				PVector bfpos = bf.position;
				float d = PVector.dist(mepos, bfpos);
				if(bf.NstarvingLvl1() == true){
					if(d < bf.getR()){
						float food = 1000;
						bf.eat(food);
						Me.remove();
						bf.resetEating();
					}
				}
			}
			*/
			Iterator<tileWater> TW = tilewater.iterator();
			while(TW.hasNext()){
				tileWater tw = TW.next();
				PVector bfpos = bf.position;
				PVector twpos = tw.position;
				float d = PVector.dist(twpos, bfpos);
				if(bf.soif() == true){
					if(d < bf.getR()){
						bf.drinkWater();
					}
				}
			}
		}
		//////////////////////////
		
		//////herd behavior///////
		Iterator<BoarM> BM = boarm.iterator();
		while(BM.hasNext()){
			BoarM bm = BM.next();
			Iterator<BoarF> BF = boarf.iterator();
			while(BF.hasNext()){
				BoarF bf = BF.next();
				PVector bfpos = bf.position;
				PVector bmpos = bm.position;
				float d = PVector.dist(bfpos, bmpos);
				if(d > 400){
					bf.stayInPack(bmpos);
					bm.stayInPack(bfpos);
				}
			}
		}
		
		//////find female///////
		
		if(boarf.size() >= 1){
			float currentSmallest;
			float dist;
			for(int a = boarm.size()-1; a >=0; a--){
				BoarM bm = boarm.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(bm.reproduceTime() == false){
					bm.wander(parent);
				}
				if(bm.reproduceTime() == true){
					if(boarm.size() < 5 || boarf.size() < 5){
						for(int b = boarf.size()-1; b >= 0; b--){
							BoarF bf = boarf.get(b);
							dist = ((bm.position.x - bf.position.x) * (bm.position.x - bf.position.x)) +
								   ((bm.position.y - bf.position.y) * (bm.position.y - bf.position.y));
							if( dist < currentSmallest){
								currentSmallest = dist;
								target.x = bf.position.x;
								target.y = bf.position.y;
							}
						}
						bm.findFemale(target);
					}
				}
			}
		}
		
		/////reproduction///////
		for(int a = boarm.size()-1; a >= 0; a--){
			for(int b = boarf.size()-1; b >= 0; b--){
				BoarM bm = boarm.get(a);
				BoarF bf = boarf.get(b);
				PVector bmpos = bm.position;
				PVector bfpos = bf.position;
				float d = PVector.dist(bmpos, bfpos);
				if(d < bf.getR() && bf.reproduceTime() == true){  /////a changer juste pour test
					DNAboar momgenes = bm.getDNAboar();
					DNAboar dadgenes = bf.getDNAboar();
					DNAboar childdna = momgenes.crossover(dadgenes, parent);
					if(parent.random(10) > 5 && boarm.size() < 5){
						boarm.add(new BoarM(bfpos, childdna, parent));
						bf.resetReproduce();
						bm.resetReproduce();
					}
					if(parent.random(10) < 5 && boarf.size() < 5){
						boarf.add(new BoarF(bfpos, childdna, parent));
						bf.resetReproduce();
						bm.resetReproduce();
					}
				}
			}
		}
		
		
		///visiblement ca fonctionne
		if(boarf.size() >= 1){
			float currentSmallest;
			float dist;
			for(int a = boarm.size()-1; a >=0; a--){
				BoarM bm = boarm.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				for(int b = boarf.size()-1; b >= 0; b--){
					BoarF bf = boarf.get(b);
					if(bm.reproduceTime() == false ){
						bm.wander(parent);
					}
					if(bm.reproduceTime() == true && bf.reproduceTime() == true && bf.young() == false && bf.pup() == false){
						if(boarm.size() < 5 || boarf.size() < 5){
							dist = ((bm.position.x - bf.position.x) * (bm.position.x - bf.position.x)) +
								   ((bm.position.y - bf.position.y) * (bm.position.y - bf.position.y));
							if( dist < currentSmallest){
								currentSmallest = dist;
								target.x = bf.position.x;
								target.y = bf.position.y;
							}
						}
					}
				}
				bm.findFemale(target);
			}
		}
		
		
		/////reproduction///////
		for(int a = boarm.size()-1; a >= 0; a--){
			for(int b = boarf.size()-1; b >= 0; b--){
				BoarM bm = boarm.get(a);
				BoarF bf = boarf.get(b);
				PVector bmpos = bm.position;
				PVector bfpos = bf.position;
				float d = PVector.dist(bmpos, bfpos);
				if(d < bf.getR() && bf.reproduceTime() == true && bf.pup() == false && bf.young() == false){ 
					bm.resetReproduce();
					bf.resetReproduce();
					bf.resetGestation();
				}
				if(bf.gestationReady() == false){
					bf.wander(parent);
				}
				if(bf.gestationReady() == true){
					DNAboar momgenes = bm.getDNAboar();
					DNAboar dadgenes = bf.getDNAboar();
					DNAboar childdna = momgenes.crossover(dadgenes, parent);
					if(parent.random(10) > 5 && boarm.size() < 5){
						boarm.add(new BoarM(bfpos, childdna, parent));
						bf.gestationFinish();
					}
					if(parent.random(10) < 5 && boarf.size() < 5){
						boarf.add(new BoarF(bfpos, childdna, parent));
						bf.gestationFinish();
					}

				}
				
			}
		}
		//////////////////////////

		//////DEER//////////////
		
		//////MALE//////////////
		
		PVector herdSpawnDeer = new PVector();
		herdSpawnDeer.x = parent.random(worldW-(worldW-200) , worldW-200);
		herdSpawnDeer.y	= parent.random(worldH-(worldH-200) , worldH-200);
		
		while(deerm.size() < 1){
			for(int i = 0; i < totaldeerm; i++){
				PVector l = new PVector(parent.random(herdSpawnDeer.x-100, herdSpawnDeer.x+100), parent.random(herdSpawnDeer.y-100, herdSpawnDeer.y+100));
				DNAdeer dnadeer = new DNAdeer(parent);
				deerm.add(new DeerM(l,dnadeer,parent));
				Iterator<DeerM> DeM = deerm.iterator();
				while(DeM.hasNext()){
					DeerM dem = DeM.next();
					//dem.gettingOld();
				}
			}
		}

		Iterator<DeerM> DeM = deerm.iterator();
		while(DeM.hasNext()){
			DeerM dem = DeM.next();
			dem.run(parent);
			dem.boundaries();
			
			if(dem.eatingTime() == false ){
				dem.mvtUpdate();
			}
			
			
			Iterator<tileWater> tileW = tilewater.iterator();
			while(tileW.hasNext()){
				tileWater tilew = tileW.next();
				PVector target = new PVector(tilew.position.x, tilew.position.y);
				if(dem.isTooClose(target)){
					dem.goAway(target);
				}
			}
			/////runaway mechanisme//////
			Iterator<WolfM> WM = wolfm.iterator();
			while(WM.hasNext()){
				WolfM wm = WM.next();
				PVector target = new PVector(wm.position.x, wm.position.y);
				if(wm.NstarvingLvl4() == true && dem.isInDanger(target)){
					dem.runaway(target);
				}
			}
			Iterator<WolfF> WF = wolff.iterator();
			while(WF.hasNext()){
				WolfF wf = WF.next();
				PVector target = new PVector(wf.position.x, wf.position.y);
				if(wf.NstarvingLvl4() == true && dem.isInDanger(target)){
					dem.runaway(target);
				}
			}
			/////////////////////////////
		}
		
		//////find water//////
		if(deerm.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = deerm.size()-1; a >=0; a--){
				DeerM dem = deerm.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(dem.soif() == false){
					dem.wander(parent);
				}
				if(dem.soif() == true){
					for(int b = tilewater.size()-1 ; b >=0; b--){
						tileWater tw = tilewater.get(b);
						dist = ((dem.position.x - tw.position.x) * (dem.position.x - tw.position.x)) +
							   ((dem.position.y - tw.position.y) * (dem.position.y - tw.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = tw.position.x;
							target.y = tw.position.y;
						}
					}
					dem.findWater(target);
				}
			}
		}
		
		///////find food  champi red and yellow berry grass ///////// 
		if(deerm.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = deerm.size()-1; a >=0; a--){
				DeerM dm = deerm.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				
				if(dm.NstarvingLvl1() == false ){
					dm.wander(parent);
				}
				
				if(dm.NstarvingLvl1() == true){
					for(int d = champi.size()-1; d >=0; d--){
						Champi ch = champi.get(d);
						dist = ((dm.position.x - ch.position.x) * (dm.position.x - ch.position.x)) +
							   ((dm.position.y - ch.position.y) * (dm.position.y - ch.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = ch.position.x;
							target.y = ch.position.y;
						}
					}
					for(int e = redberry.size()-1; e >=0; e--){
						RedBerry rb = redberry.get(e);
						dist = ((dm.position.x - rb.position.x) * (dm.position.x - rb.position.x)) +
							   ((dm.position.y - rb.position.y) * (dm.position.y - rb.position.y));
						if( dist < currentSmallest){
							currentSmallest = dist;
							target.x = rb.position.x;
							target.y = rb.position.y;
						}
					}
					for(int f = yellowberry.size()-1; f >=0; f--){
						YellowBerry yb = yellowberry.get(f);
						dist = ((dm.position.x - yb.position.x) * (dm.position.x - yb.position.x)) +
							   ((dm.position.y - yb.position.y) * (dm.position.y - yb.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = yb.position.x;
							target.y = yb.position.y;
						}
					}
					for(int e = flower.size()-1; e >=0; e--){
						Flower fl = flower.get(e);
						dist = ((dm.position.x - fl.position.x) * (dm.position.x - fl.position.x)) +
							   ((dm.position.y - fl.position.y) * (dm.position.y - fl.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = fl.position.x;
							target.y = fl.position.y;
						}
					}
					for(int b = grassfeuillu.size()-1; b >=0; b--){
						GrassFeuillu gf = grassfeuillu.get(b);
						dist = ((dm.position.x - gf.position.x) * (dm.position.x - gf.position.x)) +
							   ((dm.position.y - gf.position.y) * (dm.position.y - gf.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = gf.position.x;
							target.y = gf.position.y;
						}
					}
					dm.findFood(target);
				}
				

			}
		}
		/////////////////////////
		
		////////eat grassfeuillu/ redberry/ yellow and flower////////
		Iterator<DeerM> DeeM = deerm.iterator();
		while(DeeM.hasNext()){
			DeerM dm = DeeM.next();
			Iterator<GrassFeuillu> GrF = grassfeuillu.iterator();
			while(GrF.hasNext()){
				GrassFeuillu grf = GrF.next();
				PVector grasspos = grf.position;
				PVector lapinmpos = dm.position;
				float d = PVector.dist(grasspos, lapinmpos);
				if(dm.NstarvingLvl1() == true){
					if(d < dm.getR()){
						float food = 100;
						dm.eat(food);
						GrF.remove(); 
						dm.resetEating();
					}
				}
			}
			Iterator<RedBerry> ReB = redberry.iterator();
			while(ReB.hasNext()){
				RedBerry reb = ReB.next();
				PVector rebpos = reb.position;
				PVector lapinmpos = dm.position;
				float d = PVector.dist(rebpos, lapinmpos);
				if(dm.NstarvingLvl1() == true){
					if(d < dm.getR()){
						float food = 100;
						dm.eat(food);
						ReB.remove(); 
						dm.resetEating();
					}
				}
			}
			Iterator<YellowBerry> YeB = yellowberry.iterator();
			while(YeB.hasNext()){
				YellowBerry yeb = YeB.next();
				PVector yebpos = yeb.position;
				PVector lapinmpos = dm.position;
				float d = PVector.dist(yebpos, lapinmpos);
				if(dm.NstarvingLvl1() == true){
					if(d < dm.getR()){
						float food = 100;
						dm.eat(food);
						YeB.remove(); //pas de remove pour l'instant
						dm.resetEating();
					}
				}
			}
			Iterator<Flower> Fl = flower.iterator();
			while(Fl.hasNext()){
				Flower fl = Fl.next();
				PVector flpos = fl.position;
				PVector lapinmpos = dm.position;
				float d = PVector.dist(flpos, lapinmpos);
				if(dm.NstarvingLvl1() == true){
					if(d < dm.getR()){
						float food = 100;
						dm.eat(food);
						Fl.remove(); 
						dm.resetEating();
					}
				}
			}
			Iterator<Champi> CH = champi.iterator();
			while(CH.hasNext()){
				Champi ch = CH.next();
				PVector chpos = ch.position;
				PVector bmpos = dm.position;
				float d = PVector.dist(chpos, bmpos);
				if(dm.NstarvingLvl1() == true){
					if(d < dm.getR()){
						float food = 100;
						dm.eat(food);
						CH.remove();
						dm.resetEating();
					}
				}
			}

		}
		//////////////////////////
		
		
		//////FEMALE//////////////
		
		
		while(deerf.size() < 1){
			for(int i = 0; i < totaldeerf; i++){
				PVector l = new PVector(parent.random(herdSpawnDeer.x-100, herdSpawnDeer.x+100), parent.random(herdSpawnDeer.y-100, herdSpawnDeer.y+100));
				DNAdeer dnadeer = new DNAdeer(parent);
				deerf.add(new DeerF(l,dnadeer,parent));
				Iterator<DeerF> DeF = deerf.iterator();
				while(DeF.hasNext()){
					DeerF def = DeF.next();
					//dem.gettingOld();
				}
			}
		}

		Iterator<DeerF> DeF = deerf.iterator();
		while(DeF.hasNext()){
			DeerF def = DeF.next();
			def.run(parent);
			def.boundaries();
			
			if(def.eatingTime() == false ){
				def.mvtUpdate();
			}
			
			
			Iterator<tileWater> tileW = tilewater.iterator();
			while(tileW.hasNext()){
				tileWater tilew = tileW.next();
				PVector target = new PVector(tilew.position.x, tilew.position.y);
				if(def.isTooClose(target)){
					def.goAway(target);
				}
			}
			/////runaway mechanisme//////
			Iterator<WolfM> WM = wolfm.iterator();
			while(WM.hasNext()){
				WolfM wm = WM.next();
				PVector target = new PVector(wm.position.x, wm.position.y);
				if(wm.NstarvingLvl4() == true && def.isInDanger(target)){
					def.runaway(target);
				}
			}
			Iterator<WolfF> WF = wolff.iterator();
			while(WF.hasNext()){
				WolfF wf = WF.next();
				PVector target = new PVector(wf.position.x, wf.position.y);
				if(wf.NstarvingLvl4() == true && def.isInDanger(target)){
					def.runaway(target);
				}
			}
			/////////////////////////////
		}
		
		//////find water//////
		if(deerf.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = deerf.size()-1; a >=0; a--){
				DeerF def = deerf.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(def.soif() == false){
					def.wander(parent);
				}
				if(def.soif() == true){
					for(int b = tilewater.size()-1 ; b >=0; b--){
						tileWater tw = tilewater.get(b);
						dist = ((def.position.x - tw.position.x) * (def.position.x - tw.position.x)) +
							   ((def.position.y - tw.position.y) * (def.position.y - tw.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = tw.position.x;
							target.y = tw.position.y;
						}
					}
					def.findWater(target);
				}
			}
		}
		
		///////find food  champi red and yellow berry grass ///////// 
		if(deerf.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = deerf.size()-1; a >=0; a--){
				DeerF df = deerf.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				
				if(df.NstarvingLvl1() == false ){
					df.wander(parent);
				}
				
				if(df.NstarvingLvl1() == true){
					for(int d = champi.size()-1; d >=0; d--){
						Champi ch = champi.get(d);
						dist = ((df.position.x - ch.position.x) * (df.position.x - ch.position.x)) +
							   ((df.position.y - ch.position.y) * (df.position.y - ch.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = ch.position.x;
							target.y = ch.position.y;
						}
					}
					for(int e = redberry.size()-1; e >=0; e--){
						RedBerry rb = redberry.get(e);
						dist = ((df.position.x - rb.position.x) * (df.position.x - rb.position.x)) +
							   ((df.position.y - rb.position.y) * (df.position.y - rb.position.y));
						if( dist < currentSmallest){
							currentSmallest = dist;
							target.x = rb.position.x;
							target.y = rb.position.y;
						}
					}
					for(int f = yellowberry.size()-1; f >=0; f--){
						YellowBerry yb = yellowberry.get(f);
						dist = ((df.position.x - yb.position.x) * (df.position.x - yb.position.x)) +
							   ((df.position.y - yb.position.y) * (df.position.y - yb.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = yb.position.x;
							target.y = yb.position.y;
						}
					}
					for(int e = flower.size()-1; e >=0; e--){
						Flower fl = flower.get(e);
						dist = ((df.position.x - fl.position.x) * (df.position.x - fl.position.x)) +
							   ((df.position.y - fl.position.y) * (df.position.y - fl.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = fl.position.x;
							target.y = fl.position.y;
						}
					}
					for(int b = grassfeuillu.size()-1; b >=0; b--){
						GrassFeuillu gf = grassfeuillu.get(b);
						dist = ((df.position.x - gf.position.x) * (df.position.x - gf.position.x)) +
							   ((df.position.y - gf.position.y) * (df.position.y - gf.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = gf.position.x;
							target.y = gf.position.y;
						}
					}
					df.findFood(target);
				}
				

			}
		}
		/////////////////////////
		
		////////eat grassfeuillu/ redberry/ yellow and flower////////
		Iterator<DeerF> DeeF = deerf.iterator();
		while(DeeF.hasNext()){
			DeerF df = DeeF.next();
			Iterator<GrassFeuillu> GrF = grassfeuillu.iterator();
			while(GrF.hasNext()){
				GrassFeuillu grf = GrF.next();
				PVector grasspos = grf.position;
				PVector lapinmpos = df.position;
				float d = PVector.dist(grasspos, lapinmpos);
				if(df.NstarvingLvl1() == true){
					if(d < df.getR()){
						float food = 100;
						df.eat(food);
						GrF.remove(); 
						df.resetEating();
					}
				}
			}
			Iterator<RedBerry> ReB = redberry.iterator();
			while(ReB.hasNext()){
				RedBerry reb = ReB.next();
				PVector rebpos = reb.position;
				PVector lapinmpos = df.position;
				float d = PVector.dist(rebpos, lapinmpos);
				if(df.NstarvingLvl1() == true){
					if(d < df.getR()){
						float food = 100;
						df.eat(food);
						ReB.remove(); 
						df.resetEating();
					}
				}
			}
			Iterator<YellowBerry> YeB = yellowberry.iterator();
			while(YeB.hasNext()){
				YellowBerry yeb = YeB.next();
				PVector yebpos = yeb.position;
				PVector lapinmpos = df.position;
				float d = PVector.dist(yebpos, lapinmpos);
				if(df.NstarvingLvl1() == true){
					if(d < df.getR()){
						float food = 100;
						df.eat(food);
						YeB.remove(); //pas de remove pour l'instant
						df.resetEating();
					}
				}
			}
			Iterator<Flower> Fl = flower.iterator();
			while(Fl.hasNext()){
				Flower fl = Fl.next();
				PVector flpos = fl.position;
				PVector lapinmpos = df.position;
				float d = PVector.dist(flpos, lapinmpos);
				if(df.NstarvingLvl1() == true){
					if(d < df.getR()){
						float food = 100;
						df.eat(food);
						Fl.remove(); 
						df.resetEating();
					}
				}
			}
			Iterator<Champi> CH = champi.iterator();
			while(CH.hasNext()){
				Champi ch = CH.next();
				PVector chpos = ch.position;
				PVector bmpos = df.position;
				float d = PVector.dist(chpos, bmpos);
				if(df.NstarvingLvl1() == true){
					if(d < df.getR()){
						float food = 100;
						df.eat(food);
						CH.remove();
						df.resetEating();
					}
				}
			}

		}
		//////////////////////////
		//////herd behavior///////
		Iterator<DeerM> DM = deerm.iterator();
		while(DM.hasNext()){
			DeerM dm = DM.next();
			Iterator<DeerF> DF = deerf.iterator();
			while(DF.hasNext()){
				DeerF df = DF.next();
				PVector bfpos = df.position;
				PVector bmpos = dm.position;
				float d = PVector.dist(bfpos, bmpos);
				if(d > 400){
					df.stayInPack(bmpos);
					dm.stayInPack(bfpos);
				}
			}
		}
		
		//////find female///////
		
		if(deerf.size() >= 1){
			float currentSmallest;
			float dist;
			for(int a = deerm.size()-1; a >=0; a--){
				DeerM dm = deerm.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(dm.reproduceTime() == false){
					dm.wander(parent);
				}
				if(dm.reproduceTime() == true){
					if(deerm.size() < 5 || deerf.size() < 5){
						for(int b = deerf.size()-1; b >= 0; b--){
							DeerF df = deerf.get(b);
							dist = ((dm.position.x - df.position.x) * (dm.position.x - df.position.x)) +
								   ((dm.position.y - df.position.y) * (dm.position.y - df.position.y));
							if( dist < currentSmallest){
								currentSmallest = dist;
								target.x = df.position.x;
								target.y = df.position.y;
							}
						}
						dm.findFemale(target);
					}
				}
			}
		}
		
		/////reproduction///////
		for(int a = deerm.size()-1; a >= 0; a--){
			for(int b = deerf.size()-1; b >= 0; b--){
				DeerM dm = deerm.get(a);
				DeerF df = deerf.get(b);
				PVector dmpos = dm.position;
				PVector dfpos = df.position;
				float d = PVector.dist(dmpos, dfpos);
				if(d < df.getR() && df.reproduceTime() == true){  /////a changer juste pour test
					DNAdeer momgenes = dm.getDNAdeer();
					DNAdeer dadgenes = df.getDNAdeer();
					DNAdeer childdna = momgenes.crossover(dadgenes, parent);
					if(parent.random(10) > 5 && boarm.size() < 5){
						deerm.add(new DeerM(dfpos, childdna, parent));
						df.resetReproduce();
						dm.resetReproduce();
					}
					if(parent.random(10) < 5 && boarf.size() < 5){
						deerf.add(new DeerF(dfpos, childdna, parent));
						df.resetReproduce();
						dm.resetReproduce();
					}
				}
			}
		}
		
		
		///visiblement ca fonctionne
		if(deerf.size() >= 1){
			float currentSmallest;
			float dist;
			for(int a = deerm.size()-1; a >=0; a--){
				DeerM dm = deerm.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				for(int b = deerf.size()-1; b >= 0; b--){
					DeerF df = deerf.get(b);
					if(dm.reproduceTime() == false ){
						dm.wander(parent);
					}
					if(dm.reproduceTime() == true && df.reproduceTime() == true ){
						if(deerm.size() < 5 || deerf.size() < 5){
							dist = ((dm.position.x - df.position.x) * (dm.position.x - df.position.x)) +
								   ((dm.position.y - df.position.y) * (dm.position.y - df.position.y));
							if( dist < currentSmallest){
								currentSmallest = dist;
								target.x = df.position.x;
								target.y = df.position.y;
							}
						}
					}
				}
				dm.findFemale(target);
			}
		}
		
		
		/////reproduction avec gestation///////
		/*
		for(int a = boarm.size()-1; a >= 0; a--){
			for(int b = boarf.size()-1; b >= 0; b--){
				BoarM bm = boarm.get(a);
				BoarF bf = boarf.get(b);
				PVector bmpos = bm.position;
				PVector bfpos = bf.position;
				float d = PVector.dist(bmpos, bfpos);
				if(d < bf.getR() && bf.reproduceTime() == true && bf.pup() == false && bf.young() == false){ 
					bm.resetReproduce();
					bf.resetReproduce();
					bf.resetGestation();
				}
				if(bf.gestationReady() == false){
					bf.wander(parent);
				}
				if(bf.gestationReady() == true){
					DNAboar momgenes = bm.getDNAboar();
					DNAboar dadgenes = bf.getDNAboar();
					DNAboar childdna = momgenes.crossover(dadgenes, parent);
					if(parent.random(10) > 5 && boarm.size() < 5){
						boarm.add(new BoarM(bfpos, childdna, parent));
						bf.gestationFinish();
					}
					if(parent.random(10) < 5 && boarf.size() < 5){
						boarf.add(new BoarF(bfpos, childdna, parent));
						bf.gestationFinish();
					}

				}
				
			}
		}
		*/
		//////////////////////////		
		
		//////////////////////////

		
		///////VOLE/////////////////
		
		///////MALE//////////
		while(volem.size() < 1){
			for(int i = 0; i < totalvolem; i++){
				PVector l = new PVector();
				l.x = parent.random(worldW-(worldW-50) , worldW-50);
				l.y	= parent.random(worldH-(worldH-50) , worldH-50);
				boolean overlapping = false;
				for(int a = 0; a < tilewater.size(); a++){
					tileWater other = tilewater.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 160){
						overlapping = true;
						break;
					}
				}
				if(!overlapping){
					DNAvole dnavole = new DNAvole(parent);
					volem.add(new VoleM(l,dnavole,parent));
				}
			}
		}
		
		Iterator<VoleM> VM = volem.iterator();
		while(VM.hasNext()){
			VoleM vm = VM.next();
			vm.run(parent);
			vm.boundaries();
			if(vm.eatingTime() == false ){
				vm.mvtUpdate();
			}
			Iterator<tileWater> tileW = tilewater.iterator();
			while(tileW.hasNext()){
				tileWater tilew = tileW.next();
				PVector target = new PVector(tilew.position.x, tilew.position.y);
				if(vm.isTooClose(target)){
					vm.goAway(target);
				}
			}
			
			/////runaway mechanisme//////
			Iterator<BearM> BeM = bearm.iterator();
			while(BeM.hasNext()){
				BearM bm = BeM.next();
				PVector target = new PVector(bm.position.x, bm.position.y);
				if(bm.NstarvingLvl2() == true && vm.isInDanger(target)){
					vm.runaway(target);
				}
			}
			Iterator<BearF> BF = bearf.iterator();
			while(BF.hasNext()){
				BearF bf = BF.next();
				PVector target = new PVector(bf.position.x, bf.position.y);
				if(bf.NstarvingLvl2() == true && vm.isInDanger(target)){
					vm.runaway(target);
				}
			}
			Iterator<BlaireauM> BLM = blaireaum.iterator();
			while(BLM.hasNext()){
				BlaireauM blm = BLM.next();
				PVector target = new PVector(blm.position.x, blm.position.y);
				if(blm.NstarvingLvl2() == true && vm.isInDanger(target)){
					vm.runaway(target);
				}
			}
			Iterator<BlaireauF> BLF = blaireauf.iterator();
			while(BLF.hasNext()){
				BlaireauF blf = BLF.next();
				PVector target = new PVector(blf.position.x, blf.position.y);
				if(blf.NstarvingLvl2() == true && vm.isInDanger(target)){
					vm.runaway(target);
				}
			}
			Iterator<BoarM> BOM = boarm.iterator();
			while(BOM.hasNext()){
				BoarM bom = BOM.next();
				PVector target = new PVector(bom.position.x, bom.position.y);
				if(bom.NstarvingLvl2() == true && vm.isInDanger(target)){
					vm.runaway(target);
				}
			}
			Iterator<BoarF> BOF = boarf.iterator();
			while(BOF.hasNext()){
				BoarF bof = BOF.next();
				PVector target = new PVector(bof.position.x, bof.position.y);
				if(bof.NstarvingLvl2() == true && vm.isInDanger(target)){
					vm.runaway(target);
				}
			}
			Iterator<FoxM> FM = foxm.iterator();
			while(FM.hasNext()){
				FoxM fm = FM.next();
				PVector target = new PVector(fm.position.x, fm.position.y);
				if(fm.NstarvingLvl2() == true && vm.isInDanger(target)){
					vm.runaway(target);
				}
			}
			Iterator<FoxF> FF = foxf.iterator();
			while(FF.hasNext()){
				FoxF ff = FF.next();
				PVector target = new PVector(ff.position.x, ff.position.y);
				if(ff.NstarvingLvl2() == true && vm.isInDanger(target)){
					vm.runaway(target);
				}
			}
			Iterator<FuretM> FUM = furetm.iterator();
			while(FUM.hasNext()){
				FuretM fum = FUM.next();
				PVector target = new PVector(fum.position.x, fum.position.y);
				if(fum.NstarvingLvl2() == true && vm.isInDanger(target)){
					vm.runaway(target);
				}
			}
			Iterator<FuretF> FUF = furetf.iterator();
			while(FUF.hasNext()){
				FuretF fuf = FUF.next();
				PVector target = new PVector(fuf.position.x, fuf.position.y);
				if(fuf.NstarvingLvl2() == true && vm.isInDanger(target)){
					vm.runaway(target);
				}
			}
			Iterator<WolfM> WM = wolfm.iterator();
			while(WM.hasNext()){
				WolfM wm = WM.next();
				PVector target = new PVector(wm.position.x, wm.position.y);
				if(wm.NstarvingLvl2() == true && vm.isInDanger(target)){
					vm.runaway(target);
				}
			}
			Iterator<WolfF> WF = wolff.iterator();
			while(WF.hasNext()){
				WolfF wf = WF.next();
				PVector target = new PVector(wf.position.x, wf.position.y);
				if(wf.NstarvingLvl2() == true && vm.isInDanger(target)){
					vm.runaway(target);
				}
			}
		}
		
		///////find food insecte/ chenille/////////
		if(volem.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = volem.size()-1; a >=0; a--){
				VoleM vm = volem.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(vm.Nfaim() == false){
					vm.wander(parent);
				}
				if(vm.Nfaim() == true){
					for(int b = insect1m.size()-1; b >=0; b--){
						insect1M i1m = insect1m.get(b);
						dist = ((vm.position.x - i1m.position.x) * (vm.position.x - i1m.position.x)) +
							   ((vm.position.y - i1m.position.y) * (vm.position.y - i1m.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = i1m.position.x;
							target.y = i1m.position.y;
						}
					}
					for(int c = papillonbchenille.size()-1; c >=0; c--){
						PapillonBchenille pbc = papillonbchenille.get(c);
						dist = ((vm.position.x - pbc.position.x) * (vm.position.x - pbc.position.x)) +
							   ((vm.position.y - pbc.position.y) * (vm.position.y - pbc.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = pbc.position.x;
							target.y = pbc.position.y;
						}
					}
					vm.findPray(target);
				}
			}
		}
		/////////////////////////
		
		////////eat insect////////
		Iterator<VoleM> VoM = volem.iterator();
		while(VM.hasNext()){
			VoleM vm = VoM.next();
			Iterator<insect1M> i1M = insect1m.iterator();
			while(i1M.hasNext()){
				insect1M i1m = i1M.next();
				PVector i1mpos = i1m.position;
				PVector soumpos = vm.position;
				float d = PVector.dist(i1mpos, soumpos);
				if(vm.Nfaim() == true){
					if(d < vm.getR()){
						float food = 100;
						vm.eat(food);
						i1M.remove();
						vm.resetEating();
					}
				}
			}
		}
		//////////////////////////
		
		////////eat chenille////////
		Iterator<VoleM> VolM = volem.iterator();
		while(VolM.hasNext()){
			VoleM volm = VolM.next();
			Iterator<PapillonBchenille> Pbc = papillonbchenille.iterator();
			while(Pbc.hasNext()){
				PapillonBchenille pbc = Pbc.next();
				PVector pbcpos = pbc.position;
				PVector soumpos = volm.position;
				float d = PVector.dist(pbcpos, soumpos);
				if(volm.Nfaim() == true){
					if(d < volm.getR()){
						float food = 100;
						volm.eat(food);
						Pbc.remove();
						volm.resetEating();
					}
				}
			}
		}
		//////////////////////////
		
		
		///////FEMALE//////////
		while(volef.size() < 1){
			for(int i = 0; i < totalvolef; i++){
				PVector l = new PVector();
				l.x = parent.random(worldW-(worldW-50) , worldW-50);
				l.y	= parent.random(worldH-(worldH-50) , worldH-50);
				boolean overlapping = false;
				for(int a = 0; a < tilewater.size(); a++){
					tileWater other = tilewater.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 160){
						overlapping = true;
						break;
					}
				}
				if(!overlapping){
					DNAvole dnavole = new DNAvole(parent);
					volef.add(new VoleF(l,dnavole,parent));
				}
			}
		}

		
		Iterator<VoleF> VF = volef.iterator();
		while(VF.hasNext()){
			VoleF vf = VF.next();
			vf.run(parent);
			vf.boundaries();
			if(vf.eatingTime() == false ){
				vf.mvtUpdate();
			}
			Iterator<tileWater> tileW = tilewater.iterator();
			while(tileW.hasNext()){
				tileWater tilew = tileW.next();
				PVector target = new PVector(tilew.position.x, tilew.position.y);
				if(vf.isTooClose(target)){
					vf.goAway(target);
				}
			}
			/////runaway mechanisme//////
			Iterator<BearM> BeM = bearm.iterator();
			while(BeM.hasNext()){
				BearM bm = BeM.next();
				PVector target = new PVector(bm.position.x, bm.position.y);
				if(bm.NstarvingLvl2() == true && vf.isInDanger(target)){
					vf.runaway(target);
				}
			}
			Iterator<BearF> BF = bearf.iterator();
			while(BF.hasNext()){
				BearF bf = BF.next();
				PVector target = new PVector(bf.position.x, bf.position.y);
				if(bf.NstarvingLvl2() == true && vf.isInDanger(target)){
					vf.runaway(target);
				}
			}
			Iterator<BlaireauM> BLM = blaireaum.iterator();
			while(BLM.hasNext()){
				BlaireauM blm = BLM.next();
				PVector target = new PVector(blm.position.x, blm.position.y);
				if(blm.NstarvingLvl2() == true && vf.isInDanger(target)){
					vf.runaway(target);
				}
			}
			Iterator<BlaireauF> BLF = blaireauf.iterator();
			while(BLF.hasNext()){
				BlaireauF blf = BLF.next();
				PVector target = new PVector(blf.position.x, blf.position.y);
				if(blf.NstarvingLvl2() == true && vf.isInDanger(target)){
					vf.runaway(target);
				}
			}
			Iterator<BoarM> BOM = boarm.iterator();
			while(BOM.hasNext()){
				BoarM bom = BOM.next();
				PVector target = new PVector(bom.position.x, bom.position.y);
				if(bom.NstarvingLvl2() == true && vf.isInDanger(target)){
					vf.runaway(target);
				}
			}
			Iterator<BoarF> BOF = boarf.iterator();
			while(BOF.hasNext()){
				BoarF bof = BOF.next();
				PVector target = new PVector(bof.position.x, bof.position.y);
				if(bof.NstarvingLvl2() == true && vf.isInDanger(target)){
					vf.runaway(target);
				}
			}
			Iterator<FoxM> FM = foxm.iterator();
			while(FM.hasNext()){
				FoxM fm = FM.next();
				PVector target = new PVector(fm.position.x, fm.position.y);
				if(fm.NstarvingLvl2() == true && vf.isInDanger(target)){
					vf.runaway(target);
				}
			}
			Iterator<FoxF> FF = foxf.iterator();
			while(FF.hasNext()){
				FoxF ff = FF.next();
				PVector target = new PVector(ff.position.x, ff.position.y);
				if(ff.NstarvingLvl2() == true && vf.isInDanger(target)){
					vf.runaway(target);
				}
			}
			Iterator<FuretM> FUM = furetm.iterator();
			while(FUM.hasNext()){
				FuretM fum = FUM.next();
				PVector target = new PVector(fum.position.x, fum.position.y);
				if(fum.NstarvingLvl2() == true && vf.isInDanger(target)){
					vf.runaway(target);
				}
			}
			Iterator<FuretF> FUF = furetf.iterator();
			while(FUF.hasNext()){
				FuretF fuf = FUF.next();
				PVector target = new PVector(fuf.position.x, fuf.position.y);
				if(fuf.NstarvingLvl2() == true && vf.isInDanger(target)){
					vf.runaway(target);
				}
			}
			Iterator<WolfM> WM = wolfm.iterator();
			while(WM.hasNext()){
				WolfM wm = WM.next();
				PVector target = new PVector(wm.position.x, wm.position.y);
				if(wm.NstarvingLvl2() == true && vf.isInDanger(target)){
					vf.runaway(target);
				}
			}
			Iterator<WolfF> WF = wolff.iterator();
			while(WF.hasNext()){
				WolfF wf = WF.next();
				PVector target = new PVector(wf.position.x, wf.position.y);
				if(wf.NstarvingLvl2() == true && vf.isInDanger(target)){
					vf.runaway(target);
				}
			}
			/////////////////////////////
		}
		
		///////find food insecte/chenille /////////
		if(volef.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = volef.size()-1; a >=0; a--){
				VoleF vof = volef.get(a);
				
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(vof.Nfaim() == false){
					vof.wander(parent);
				}
				if(vof.Nfaim() == true){
					for(int b = insect1m.size()-1; b >=0; b--){
						insect1M i1m = insect1m.get(b);
						dist = ((vof.position.x - i1m.position.x) * (vof.position.x - i1m.position.x)) +
							   ((vof.position.y - i1m.position.y) * (vof.position.y - i1m.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = i1m.position.x;
							target.y = i1m.position.y;
						}
					}
					for(int c = papillonbchenille.size()-1; c >=0; c--){
						PapillonBchenille pbc = papillonbchenille.get(c);
						dist = ((vof.position.x - pbc.position.x) * (vof.position.x - pbc.position.x)) +
							   ((vof.position.y - pbc.position.y) * (vof.position.y - pbc.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = pbc.position.x;
							target.y = pbc.position.y;
						}
					}
					vof.findPray(target);
				}
				
			}
		}
		/////////////////////////
		
		////////eat insect////////
		Iterator<VoleF> VolF = volef.iterator();
		while(VolF.hasNext()){
			VoleF volf = VolF.next();
			Iterator<insect1M> i1M = insect1m.iterator();
			while(i1M.hasNext()){
				insect1M i1m = i1M.next();
				PVector i1mpos = i1m.position;
				PVector soufpos = volf.position;
				float d = PVector.dist(i1mpos, soufpos);
				if(volf.Nfaim() == true){
					if(d < volf.getR()){
						float food = 100;
						volf.eat(food);
						i1M.remove();
						volf.resetEating();
					}
				}
			}
		}
		//////////////////////////
		
		////////eat chenille////////
		Iterator<VoleF> VoF = volef.iterator();
		while(VoF.hasNext()){
			VoleF vof = VoF.next();
			Iterator<PapillonBchenille> Pbc = papillonbchenille.iterator();
			while(Pbc.hasNext()){
				PapillonBchenille pbc = Pbc.next();
				PVector pbcpos = pbc.position;
				PVector soufpos = vof.position;
				float d = PVector.dist(pbcpos, soufpos);
				if(vof.Nfaim() == true){
					if(d < vof.getR()){
						float food = 100;
						vof.eat(food);
						Pbc.remove();
						vof.resetEating();
					}
				}
			}
		}
		//////////////////////////
		
		//////reproduction//////
		
		//////find female///////
		
		if(volef.size() >= 1){
			float currentSmallest;
			float dist;
			for(int a = volem.size()-1; a >=0; a--){
				VoleM vm = volem.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(vm.reproduceTime() == false){
					vm.wander(parent);
				}
				if(vm.reproduceTime() == true && vm.dead() == false){
					if(volem.size() < 10 || volef.size() < 10){
						for(int b = volef.size()-1; b >= 0; b--){
							VoleF vf = volef.get(b);
							if(vf.dead() == false){
								dist = ((vm.position.x - vf.position.x) * (vm.position.x - vf.position.x)) +
								   ((vm.position.y - vf.position.y) * (vm.position.y - vf.position.y));
								if( dist < currentSmallest){
									currentSmallest = dist;
									target.x = vf.position.x;
									target.y = vf.position.y;
								}
							}
						}
						vm.findFemale(target);
					}
				}
			}
		}
		
		
		////////////////////////
		
		/////reproduction///////
		for(int a = volem.size()-1; a >= 0; a--){
			for(int b = volef.size()-1; b >= 0; b--){
				for(int c = sourisnid.size()-1; c >=0; c--){  //ATTENTION AJOUT DE VOLE NID ET REMPLACEMENT DU NID SOURIS
					VoleM sm = volem.get(a);
					VoleF sf = volef.get(b);
					SourisNid nid = sourisnid.get(c);
					PVector smpos = sm.position;
					PVector sfpos = sf.position;
					PVector nidpos = nid.position;
					float d = PVector.dist(smpos, sfpos);
					if(d < sf.getR() && sf.reproduceTime() == true && sf.dead() == false){  /////a changer juste pour test
						DNAvole momgenes = sm.getDNAvole();
						DNAvole dadgenes = sf.getDNAvole();
						DNAvole childdna = momgenes.crossover(dadgenes, parent);
						//if(parent.random(1) < 0.9){
							if(parent.random(10) > 5 && volem.size() < 10){
								volem.add(new VoleM(nidpos, childdna, parent));
								sf.resetReproduce();
								sm.resetReproduce();
							}
							if(parent.random(10) < 5 && volef.size() < 10){
								volef.add(new VoleF(nidpos, childdna, parent));
								sf.resetReproduce();
								sm.resetReproduce();
							}
						//}
					}
				}
			}
		}
		////////////////////////
		
		
		/////////////////////////////
		
	}
	
	public void launchPredator(){
		int totalfuretM = 2;
		int totalfuretF = 2;
		int totalfoxM = 2;
		int totalfoxF = 2;
		int totalblaireauM = 2;
		int totalblaireauf = 2;
		int totalwolfm = 2;
		int totalwolff = 2;
		int totalbearm = 1;
		int totalbearf = 1;

		///////FURET////////////
		///////FuretNid//////////
		int totalfuretnid = 1;
		while(furetnid.size() < totalfuretnid){
			PVector l = new PVector();
			l.x = parent.random(worldW-(worldW-50) , worldW-50);
			l.y	= parent.random(worldH-(worldH-50) , worldH-50);
			boolean overlapping = false;
			for(int a = 0; a < tilewater.size(); a++){
				tileWater other = tilewater.get(a);
				float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
				if(d < 160){
					overlapping = true;
					break;
				}
			}
			if(!overlapping){
				furetnid.add(new FuretNid(parent, l));
			}
			
		}
		/////////////////////////
		
		///////FuretM//////////
		while(furetm.size() < 1){
			for(int i = 0; i < totalfuretM; i++){
				PVector l = new PVector();
				l.x = parent.random(worldW-(worldW-50) , worldW-50);
				l.y	= parent.random(worldH-(worldH-50) , worldH-50);
				boolean overlapping = false;
				for(int a = 0; a < tilewater.size(); a++){
					tileWater other = tilewater.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 60){
						overlapping = true;
						break;
					}
				}
				if(!overlapping){
					DNAfuret dnafuret = new DNAfuret(parent);
					furetm.add(new FuretM(l,dnafuret,parent));
				}
			}
		}

		
		Iterator<FuretM> FM = furetm.iterator();
		while(FM.hasNext()){
			FuretM fm = FM.next();
			fm.run(parent);
			fm.boundaries();
			if(fm.eatingTime() == false ){
				fm.mvtUpdate();
			}
			/*
			if(fm.dead() == true){
				FM.remove();
				int randomMeat = (int) parent.random(1, 5);
				for(int a = 0; a < randomMeat; a++){
					PVector l = new PVector(parent.random(fm.position.x-10, fm.position.x+10), parent.random(fm.position.y-10, fm.position.y+10));
					meat.add(new Meat(parent,l));
				}
			}
			*/
			Iterator<tileWater> tileW = tilewater.iterator();
			while(tileW.hasNext()){
				tileWater tilew = tileW.next();
				PVector target = new PVector(tilew.position.x, tilew.position.y);
				if(fm.isTooClose(target)){
					fm.goAway(target);
				}
			}
			
		}
		
		///////find food insecte ecureuil souris lapin/////////
		if(furetm.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = furetm.size()-1; a >=0; a--){
				FuretM fum = furetm.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				
				if(fum.NstarvingLvl1() == false || fum.NstarvingLvl2() == false || fum.NstarvingLvl3() == false){
					fum.wander(parent);
				}
				
				if(fum.NstarvingLvl1() == true){
					for(int b = insect1m.size()-1; b >=0; b--){
						insect1M i1m = insect1m.get(b);
						dist = ((fum.position.x - i1m.position.x) * (fum.position.x - i1m.position.x)) +
							   ((fum.position.y - i1m.position.y) * (fum.position.y - i1m.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = i1m.position.x;
							target.y = i1m.position.y;
						}
					}
					/*
					for(int i = meat.size()-1; i >=0; i--){
						Meat me = meat.get(i);
						dist = ((fum.position.x - me.position.x) * (fum.position.x - me.position.x)) +
							   ((fum.position.y - me.position.y) * (fum.position.y - me.position.y));
							if( dist < currentSmallest ){
								currentSmallest = dist;
								target.x = me.position.x;
								target.y = me.position.y;
							}
					}
					*/
					fum.findPray(target);
				}
				
				if(fum.NstarvingLvl2() == true){
					for(int c = ecureuilm.size()-1; c >=0; c--){
						EcureuilM ecm = ecureuilm.get(c);
						dist = ((fum.position.x - ecm.position.x) * (fum.position.x - ecm.position.x)) +
								   ((fum.position.y - ecm.position.y) * (fum.position.y - ecm.position.y));
							if( dist < currentSmallest ){
								currentSmallest = dist;
								target.x = ecm.position.x;
								target.y = ecm.position.y;
							}
					}
					for(int d = ecureuilf.size()-1; d >=0; d--){
						EcureuilF ecf = ecureuilf.get(d);
						dist = ((fum.position.x - ecf.position.x) * (fum.position.x - ecf.position.x)) +
							   ((fum.position.y - ecf.position.y) * (fum.position.y - ecf.position.y));
							if( dist < currentSmallest ){
								currentSmallest = dist;
								target.x = ecf.position.x;
								target.y = ecf.position.y;
							}
					}
					for(int e = sourism.size()-1; e >=0; e--){
						SourisM som = sourism.get(e);
						dist = ((fum.position.x - som.position.x) * (fum.position.x - som.position.x)) +
							   ((fum.position.y - som.position.y) * (fum.position.y - som.position.y));
							if( dist < currentSmallest ){
								currentSmallest = dist;
								target.x = som.position.x;
								target.y = som.position.y;
							}
					}
					for(int f = sourisf.size()-1; f >=0; f--){
						SourisF sof = sourisf.get(f);
						dist = ((fum.position.x - sof.position.x) * (fum.position.x - sof.position.x)) +
							   ((fum.position.y - sof.position.y) * (fum.position.y - sof.position.y));
							if( dist < currentSmallest ){
								currentSmallest = dist;
								target.x = sof.position.x;
								target.y = sof.position.y;
							}
					}
					fum.findPray(target);
				}
				
				if(fum.NstarvingLvl3() == true){
					for(int g = lapinm.size()-1; g >=0; g--){
						LapinM lam = lapinm.get(g);
						dist = ((fum.position.x - lam.position.x) * (fum.position.x - lam.position.x)) +
							   ((fum.position.y - lam.position.y) * (fum.position.y - lam.position.y));
							if( dist < currentSmallest ){
								currentSmallest = dist;
								target.x = lam.position.x;
								target.y = lam.position.y;
							}
					}
					for(int h = lapinf.size()-1; h >=0; h--){
						LapinF laf = lapinf.get(h);
						dist = ((fum.position.x - laf.position.x) * (fum.position.x - laf.position.x)) +
							   ((fum.position.y - laf.position.y) * (fum.position.y - laf.position.y));
							if( dist < currentSmallest ){
								currentSmallest = dist;
								target.x = laf.position.x;
								target.y = laf.position.y;
							}
					}
					fum.findPray(target);
				}
			}
		}
		/////////////////////////
		
		////////eat insect ecureuil souris lapin////////
		Iterator<FuretM> FUM = furetm.iterator();
		while(FUM.hasNext()){
			FuretM fum = FUM.next();
			Iterator<insect1M> i1M = insect1m.iterator();
			while(i1M.hasNext()){
				insect1M i1m = i1M.next();
				PVector i1mpos = i1m.position;
				PVector fumpos = fum.position;
				float d = PVector.dist(i1mpos, fumpos);
				if(fum.NstarvingLvl1() == true){
					if(d < fum.getR()){
						float food = 100;
						fum.eat(food);
						i1M.remove();
						fum.resetEating();
					}
				}
			}
			Iterator<EcureuilM> EcM = ecureuilm.iterator();
			while(EcM.hasNext()){
				EcureuilM ecm = EcM.next();
				PVector fumpos = fum.position;
				PVector ecmpos = ecm.position;
				float d = PVector.dist(ecmpos, fumpos);
				if(fum.NstarvingLvl2() == true){
					if(d < fum.getR()){
						float food = ecm.getWeight();
						fum.eat(food);
						EcM.remove();
						fum.resetEating();
					}
				}
			}
			Iterator<EcureuilF> EcF = ecureuilf.iterator();
			while(EcF.hasNext()){
				EcureuilF ecf = EcF.next();
				PVector fumpos = fum.position;
				PVector ecfpos = ecf.position;
				float d = PVector.dist(ecfpos, fumpos);
				if(fum.NstarvingLvl2() == true){
					if(d < fum.getR()){
						float food = ecf.getWeight();
						fum.eat(food);
						EcF.remove();
						fum.resetEating();
					}
				}
			}
			Iterator<SourisM> SoM = sourism.iterator();
			while(SoM.hasNext()){
				SourisM som = SoM.next();
				PVector fumpos = fum.position;
				PVector sompos = som.position;
				float d = PVector.dist(sompos, fumpos);
				if(fum.NstarvingLvl2() == true){
					if(d < fum.getR()){
						float food = som.getWeight();
						fum.eat(food);
						SoM.remove();
						fum.resetEating();
					}
				}
			}
			Iterator<SourisF> SoF = sourisf.iterator();
			while(SoF.hasNext()){
				SourisF sof = SoF.next();
				PVector fumpos = fum.position;
				PVector sofpos = sof.position;
				float d = PVector.dist(sofpos, fumpos);
				if(fum.NstarvingLvl2() == true){
					if(d < fum.getR()){
						float food = sof.getWeight();
						fum.eat(food);
						SoF.remove();
						fum.resetEating();
					}
				}
			}
			Iterator<LapinM> LapM = lapinm.iterator();
			while(LapM.hasNext()){
				LapinM lapm = LapM.next();
				PVector fumpos = fum.position;
				PVector lapmpos = lapm.position;
				float d = PVector.dist(lapmpos, fumpos);
				if(fum.NstarvingLvl3() == true){
					if(d < fum.getR()){
						float food = lapm.getWeight();
						fum.eat(food);
						LapM.remove();
						fum.resetEating();
					}
				}
			}
			Iterator<LapinF> LapF = lapinf.iterator();
			while(LapF.hasNext()){
				LapinF lapf = LapF.next();
				PVector fumpos = fum.position;
				PVector lapfpos = lapf.position;
				float d = PVector.dist(lapfpos, fumpos);
				if(fum.NstarvingLvl3() == true){
					if(d < fum.getR()){
						float food = lapf.getWeight();
						fum.eat(food);
						LapF.remove();
						fum.resetEating();
					}
				}
			}
			/*
			Iterator<Meat> Me = meat.iterator();
			while(Me.hasNext()){
				Meat me = Me.next();
				PVector fumpos = fum.position;
				PVector mepos = me.position;
				float d = PVector.dist(mepos, fumpos);
				if(fum.NstarvingLvl1() == true){
					if(d < fum.getR()){
						float food = 1000;
						fum.eat(food);
						Me.remove();
						fum.resetEating();

					}
				}
			}
			*/
		}
		//////////////////////////
		
		///////FuretF//////////
		while(furetf.size() < 1){
			for(int i = 0; i < totalfuretF; i++){
				PVector l = new PVector();
				l.x = parent.random(worldW-(worldW-50) , worldW-50);
				l.y	= parent.random(worldH-(worldH-50) , worldH-50);
				boolean overlapping = false;
				for(int a = 0; a < tilewater.size(); a++){
					tileWater other = tilewater.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 160){
						overlapping = true;
						break;
					}
				}
				if(!overlapping){
					DNAfuret dnafuret = new DNAfuret(parent);
					furetf.add(new FuretF(l,dnafuret,parent));
				}
			}
		}

		
		Iterator<FuretF> FF = furetf.iterator();
		while(FF.hasNext()){
			FuretF ff = FF.next();
			ff.run(parent);
			ff.boundaries();
			
			if(ff.eatingTime() == false ){
				ff.mvtUpdate();
			}
			/*
			if(ff.dead() == true){
				FF.remove();
				int randomMeat = (int) parent.random(1, 5);
				for(int a = 0; a < randomMeat; a++){
					PVector l = new PVector(parent.random(ff.position.x-10, ff.position.x+10), parent.random(ff.position.y-10, ff.position.y+10));
					meat.add(new Meat(parent,l));
				}
			}
			*/
			Iterator<tileWater> tileW = tilewater.iterator();
			while(tileW.hasNext()){
				tileWater tilew = tileW.next();
				PVector target = new PVector(tilew.position.x, tilew.position.y);
				if(ff.isTooClose(target)){
					ff.goAway(target);
				}
			}
		}
		////////////////////////

		///////find food insecte/////////
		if(furetf.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = furetf.size()-1; a >=0; a--){
				FuretF fuf = furetf.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(fuf.NstarvingLvl1() == false || fuf.NstarvingLvl2() == false || fuf.NstarvingLvl3() == false){
					fuf.wander(parent);
				}
				
				if(fuf.NstarvingLvl1() == true){
					for(int b = insect1m.size()-1; b >=0; b--){
						insect1M i1m = insect1m.get(b);
						dist = ((fuf.position.x - i1m.position.x) * (fuf.position.x - i1m.position.x)) +
							   ((fuf.position.y - i1m.position.y) * (fuf.position.y - i1m.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = i1m.position.x;
							target.y = i1m.position.y;
						}
					}
					/*
					for(int i = meat.size()-1; i >=0; i--){
						Meat me = meat.get(i);
						dist = ((fuf.position.x - me.position.x) * (fuf.position.x - me.position.x)) +
							   ((fuf.position.y - me.position.y) * (fuf.position.y - me.position.y));
							if( dist < currentSmallest ){
								currentSmallest = dist;
								target.x = me.position.x;
								target.y = me.position.y;
							}
					}
					*/
					fuf.findPray(target);
				}
				
				if(fuf.NstarvingLvl2() == true){
					for(int c = ecureuilm.size()-1; c >=0; c--){
						EcureuilM ecm = ecureuilm.get(c);
						dist = ((fuf.position.x - ecm.position.x) * (fuf.position.x - ecm.position.x)) +
								   ((fuf.position.y - ecm.position.y) * (fuf.position.y - ecm.position.y));
							if( dist < currentSmallest ){
								currentSmallest = dist;
								target.x = ecm.position.x;
								target.y = ecm.position.y;
							}
					}
					for(int d = ecureuilf.size()-1; d >=0; d--){
						EcureuilF ecf = ecureuilf.get(d);
						dist = ((fuf.position.x - ecf.position.x) * (fuf.position.x - ecf.position.x)) +
							   ((fuf.position.y - ecf.position.y) * (fuf.position.y - ecf.position.y));
							if( dist < currentSmallest ){
								currentSmallest = dist;
								target.x = ecf.position.x;
								target.y = ecf.position.y;
							}
					}
					for(int e = sourism.size()-1; e >=0; e--){
						SourisM som = sourism.get(e);
						dist = ((fuf.position.x - som.position.x) * (fuf.position.x - som.position.x)) +
							   ((fuf.position.y - som.position.y) * (fuf.position.y - som.position.y));
							if( dist < currentSmallest ){
								currentSmallest = dist;
								target.x = som.position.x;
								target.y = som.position.y;
							}
					}
					for(int f = sourisf.size()-1; f >=0; f--){
						SourisF sof = sourisf.get(f);
						dist = ((fuf.position.x - sof.position.x) * (fuf.position.x - sof.position.x)) +
							   ((fuf.position.y - sof.position.y) * (fuf.position.y - sof.position.y));
							if( dist < currentSmallest ){
								currentSmallest = dist;
								target.x = sof.position.x;
								target.y = sof.position.y;
							}
					}
					fuf.findPray(target);
				}
				
				if(fuf.NstarvingLvl3() == true){
					for(int g = lapinm.size()-1; g >=0; g--){
						LapinM lam = lapinm.get(g);
						dist = ((fuf.position.x - lam.position.x) * (fuf.position.x - lam.position.x)) +
							   ((fuf.position.y - lam.position.y) * (fuf.position.y - lam.position.y));
							if( dist < currentSmallest ){
								currentSmallest = dist;
								target.x = lam.position.x;
								target.y = lam.position.y;
							}
					}
					for(int h = lapinf.size()-1; h >=0; h--){
						LapinF laf = lapinf.get(h);
						dist = ((fuf.position.x - laf.position.x) * (fuf.position.x - laf.position.x)) +
							   ((fuf.position.y - laf.position.y) * (fuf.position.y - laf.position.y));
							if( dist < currentSmallest ){
								currentSmallest = dist;
								target.x = laf.position.x;
								target.y = laf.position.y;
							}
					}
					fuf.findPray(target);
				}
			}
		}
		/////////////////////////
		
		////////eat insect////////
		Iterator<FuretF> FUF = furetf.iterator();
		while(FUF.hasNext()){
			FuretF fuf = FUF.next();
			Iterator<insect1M> i1M = insect1m.iterator();
			while(i1M.hasNext()){
				insect1M i1m = i1M.next();
				PVector i1mpos = i1m.position;
				PVector fufpos = fuf.position;
				float d = PVector.dist(i1mpos, fufpos);
				if(fuf.NstarvingLvl1() == true){
					if(d < fuf.getR()){
						float food = 100;
						fuf.eat(food);
						i1M.remove();
						fuf.resetEating();
					}
				}
			}
			Iterator<EcureuilM> EcM = ecureuilm.iterator();
			while(EcM.hasNext()){
				EcureuilM ecm = EcM.next();
				PVector fufpos = fuf.position;
				PVector ecmpos = ecm.position;
				float d = PVector.dist(ecmpos, fufpos);
				if(fuf.NstarvingLvl2() == true){
					if(d < fuf.getR()){
						float food = ecm.getWeight();
						fuf.eat(food);
						EcM.remove();
						fuf.resetEating();
					}
				}
			}
			Iterator<EcureuilF> EcF = ecureuilf.iterator();
			while(EcF.hasNext()){
				EcureuilF ecf = EcF.next();
				PVector fufpos = fuf.position;
				PVector ecfpos = ecf.position;
				float d = PVector.dist(ecfpos, fufpos);
				if(fuf.NstarvingLvl2() == true){
					if(d < fuf.getR()){
						float food = ecf.getWeight();
						fuf.eat(food);
						EcF.remove();
						fuf.resetEating();
					}
				}
			}
			Iterator<SourisM> SoM = sourism.iterator();
			while(SoM.hasNext()){
				SourisM som = SoM.next();
				PVector fufpos = fuf.position;
				PVector sompos = som.position;
				float d = PVector.dist(sompos, fufpos);
				if(fuf.NstarvingLvl2() == true){
					if(d < fuf.getR()){
						float food = som.getWeight();
						fuf.eat(food);
						SoM.remove();
						fuf.resetEating();
					}
				}
			}
			Iterator<SourisF> SoF = sourisf.iterator();
			while(SoF.hasNext()){
				SourisF sof = SoF.next();
				PVector fufpos = fuf.position;
				PVector sofpos = sof.position;
				float d = PVector.dist(sofpos, fufpos);
				if(fuf.NstarvingLvl2() == true){
					if(d < fuf.getR()){
						float food = sof.getWeight();
						fuf.eat(food);
						SoF.remove();
						fuf.resetEating();
					}
				}
			}
			Iterator<LapinM> LapM = lapinm.iterator();
			while(LapM.hasNext()){
				LapinM lapm = LapM.next();
				PVector fufpos = fuf.position;
				PVector lapmpos = lapm.position;
				float d = PVector.dist(lapmpos, fufpos);
				if(fuf.NstarvingLvl3() == true){
					if(d < fuf.getR()){
						float food = lapm.getWeight();
						fuf.eat(food);
						LapM.remove();
						fuf.resetEating();
					}
				}
			}
			Iterator<LapinF> LapF = lapinf.iterator();
			while(LapF.hasNext()){
				LapinF lapf = LapF.next();
				PVector fufpos = fuf.position;
				PVector lapfpos = lapf.position;
				float d = PVector.dist(lapfpos, fufpos);
				if(fuf.NstarvingLvl3() == true){
					if(d < fuf.getR()){
						float food = lapf.getWeight();
						fuf.eat(food);
						LapF.remove();
						fuf.resetEating();
					}
				}
			}
			/*
			Iterator<Meat> Me = meat.iterator();
			while(Me.hasNext()){
				Meat me = Me.next();
				PVector fufpos = fuf.position;
				PVector mepos = me.position;
				float d = PVector.dist(mepos, fufpos);
				if(fuf.NstarvingLvl1() == true){
					if(d < fuf.getR()){
						float food = 1000;
						fuf.eat(food);
						Me.remove();
						fuf.resetEating();
					}
				}
			}
			*/
		}
		//////////////////////////

		//////reproduction//////
		//////find female///////
		if(furetf.size() >= 1){
			float currentSmallest;
			float dist;
			for(int a = furetm.size()-1; a >=0; a--){
				FuretM fum = furetm.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(fum.reproduceTime() == false){
					fum.wander(parent);
				}
				if(fum.reproduceTime() == true){
					if(furetm.size() < 5 || furetf.size() < 5){
						for(int b = furetf.size()-1; b >= 0; b--){
							FuretF fuf = furetf.get(b);
							dist = ((fum.position.x - fuf.position.x) * (fum.position.x - fuf.position.x)) +
								   ((fum.position.y - fuf.position.y) * (fum.position.y - fuf.position.y));
							if( dist < currentSmallest){
								currentSmallest = dist;
								target.x = fuf.position.x;
								target.y = fuf.position.y;
							}
						}
						fum.findFemale(target);
					}
				}
			}
		}
		////////////////////////
		
		/////reproduction///////
		for(int a = furetm.size()-1; a >= 0; a--){
			for(int b = furetf.size()-1; b >= 0; b--){
				for(int c = furetnid.size()-1; c >=0; c--){
					FuretM fm = furetm.get(a);
					FuretF ff = furetf.get(b);
					FuretNid nid = furetnid.get(c);
					PVector fmpos = fm.position;
					PVector ffpos = ff.position;
					PVector nidpos = nid.position;
					float d = PVector.dist(fmpos, ffpos);
					if(d < ff.getR() && ff.reproduceTime() == true){  /////a changer juste pour test
						DNAfuret momgenes = fm.getDNAfuret();
						DNAfuret dadgenes = ff.getDNAfuret();
						DNAfuret childdna = momgenes.crossover(dadgenes, parent);
						if(parent.random(10) > 5 && furetm.size() < 5){
							furetm.add(new FuretM(nidpos, childdna, parent));
							ff.resetReproduce();
							fm.resetReproduce();
						}
						if(parent.random(10) < 5 && furetf.size() < 5){
							furetf.add(new FuretF(nidpos, childdna, parent));
							ff.resetReproduce();
							fm.resetReproduce();
						}
					}
				}
			}
		}
		////////////////////////

		///////FOX//////////////
		
		///////FoxNid//////////
		int totalfoxnid = 1;
		while(foxnid.size() < totalfoxnid){
			PVector l = new PVector();
			l.x = parent.random(worldW-(worldW-50) , worldW-50);
			l.y	= parent.random(worldH-(worldH-50) , worldH-50);
			boolean overlapping = false;
			for(int a = 0; a < tilewater.size(); a++){
				tileWater other = tilewater.get(a);
				float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
				if(d < 160){
					overlapping = true;
					break;
				}
			}
			if(!overlapping){
				foxnid.add(new FoxNid(parent, l));
			}
			
		}
		/////////////////////////
		
		///////FoxM//////////
		while(foxm.size() < 1){
			for(int i = 0; i < totalfoxM; i++){
				PVector l = new PVector();
				l.x = parent.random(worldW-(worldW-50) , worldW-50);
				l.y	= parent.random(worldH-(worldH-50) , worldH-50);
				boolean overlapping = false;
				for(int a = 0; a < tilewater.size(); a++){
					tileWater other = tilewater.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 160){
						overlapping = true;
						break;
					}
				}
				if(!overlapping){
					DNAfox dnafox = new DNAfox(parent);
					foxm.add(new FoxM(l,dnafox,parent));
				}
			}
		}

		
		Iterator<FoxM> FoM = foxm.iterator();
		while(FoM.hasNext()){
			FoxM fom = FoM.next();
			fom.run(parent);
			fom.boundaries();
			if(fom.eatingTime() == false ){
				fom.mvtUpdate();
			}
			Iterator<tileWater> tileW = tilewater.iterator();
			while(tileW.hasNext()){
				tileWater tilew = tileW.next();
				PVector target = new PVector(tilew.position.x, tilew.position.y);
				if(fom.isTooClose(target)){
					fom.goAway(target);
				}
			}
		}
		
		//////find water//////
		if(foxm.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = foxm.size()-1; a >=0; a--){
				FoxM fom = foxm.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(fom.soif() == false){
					fom.wander(parent);
				}
				if(fom.soif() == true){
					for(int b = tilewater.size()-1 ; b >=0; b--){
						tileWater tw = tilewater.get(b);
						dist = ((fom.position.x - tw.position.x) * (fom.position.x - tw.position.x)) +
							   ((fom.position.y - tw.position.y) * (fom.position.y - tw.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = tw.position.x;
							target.y = tw.position.y;
						}
					}
					fom.findWater(target);
				}
			}
		}
		
		///////find food insecte champi souris lapin ecureuil furet ?///////// ////ajout des autres proie à faire
		if(foxm.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = foxm.size()-1; a >=0; a--){
				FoxM fom = foxm.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(fom.NstarvingLvl1() == false || fom.NstarvingLvl2() == false || fom.NstarvingLvl3() == false){
					fom.wander(parent);
				}
				if(fom.NstarvingLvl1() == true){
					for(int b = insect1m.size()-1; b >=0; b--){
						insect1M i1m = insect1m.get(b);
						dist = ((fom.position.x - i1m.position.x) * (fom.position.x - i1m.position.x)) +
							   ((fom.position.y - i1m.position.y) * (fom.position.y - i1m.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = i1m.position.x;
							target.y = i1m.position.y;
						}
					}
					for(int c = champi.size()-1; c >=0; c--){
						Champi ch = champi.get(c);
						dist = ((fom.position.x - ch.position.x) * (fom.position.x - ch.position.x)) +
							   ((fom.position.y - ch.position.y) * (fom.position.y - ch.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = ch.position.x;
							target.y = ch.position.y;
						}
					}
					/*
					for(int j = meat.size()-1; j >=0; j--){
						Meat me = meat.get(j);
						dist = ((fom.position.x - me.position.x) * (fom.position.x - me.position.x)) +
							   ((fom.position.y - me.position.y) * (fom.position.y - me.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = me.position.x;
							target.y = me.position.y;
						}
					}
					*/
					fom.findPray(target);
				}
				
				if(fom.NstarvingLvl2() == true){
					for(int d = sourism.size()-1; d >=0; d--){
						SourisM soum = sourism.get(d);
						dist = ((fom.position.x - soum.position.x) * (fom.position.x - soum.position.x)) +
							   ((fom.position.y - soum.position.y) * (fom.position.y - soum.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = soum.position.x;
							target.y = soum.position.y;
						}
					}
					for(int e = sourisf.size()-1; e >=0; e--){
						SourisF souf = sourisf.get(e);
						dist = ((fom.position.x - souf.position.x) * (fom.position.x - souf.position.x)) +
							   ((fom.position.y - souf.position.y) * (fom.position.y - souf.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = souf.position.x;
							target.y = souf.position.y;
						}
					}
					for(int h = ecureuilm.size()-1; h >=0; h--){
						EcureuilM ecm = ecureuilm.get(h);
						dist = ((fom.position.x - ecm.position.x) * (fom.position.x - ecm.position.x)) +
							   ((fom.position.y - ecm.position.y) * (fom.position.y - ecm.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = ecm.position.x;
							target.y = ecm.position.y;
						}
					}
					for(int i = ecureuilf.size()-1; i >=0; i--){
						EcureuilF ecf = ecureuilf.get(i);
						dist = ((fom.position.x - ecf.position.x) * (fom.position.x - ecf.position.x)) +
							   ((fom.position.y - ecf.position.y) * (fom.position.y - ecf.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = ecf.position.x;
							target.y = ecf.position.y;
						}
					}
					fom.findPray(target);
				}
				
				if(fom.NstarvingLvl3() == true){
					for(int f = lapinm.size()-1; f >=0; f--){
						LapinM lam = lapinm.get(f);
						dist = ((fom.position.x - lam.position.x) * (fom.position.x - lam.position.x)) +
							   ((fom.position.y - lam.position.y) * (fom.position.y - lam.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = lam.position.x;
							target.y = lam.position.y;
						}
					}
					for(int g = lapinf.size()-1; g >=0; g--){
						LapinF laf = lapinf.get(g);
						dist = ((fom.position.x - laf.position.x) * (fom.position.x - laf.position.x)) +
							   ((fom.position.y - laf.position.y) * (fom.position.y - laf.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = laf.position.x;
							target.y = laf.position.y;
						}
					}
					fom.findPray(target);
				}
			}
		}
		/////////////////////////
		
		////////eat insect champi souris lapin ecureuil furet and drink water////////
		Iterator<FoxM> FOM = foxm.iterator();
		while(FOM.hasNext()){
			FoxM fom = FOM.next();
			Iterator<insect1M> i1M = insect1m.iterator();
			while(i1M.hasNext()){
				insect1M i1m = i1M.next();
				PVector i1mpos = i1m.position;
				PVector fompos = fom.position;
				float d = PVector.dist(i1mpos, fompos);
				if(fom.NstarvingLvl1() == true){
					if(d < fom.getR()){
						float food = 100;
						fom.eat(food);
						i1M.remove();
						fom.resetEating();
					}
				}
			}
			Iterator<Champi> Ch = champi.iterator();
			while(Ch.hasNext()){
				Champi ch = Ch.next();
				PVector fompos = fom.position;
				PVector chpos = ch.position;
				float d = PVector.dist(chpos, fompos);
				if(fom.NstarvingLvl1() == true){
					if(d < fom.getR()){
						float food = 100;
						fom.eat(food);
						Ch.remove(); 
						fom.resetEating();
					}
				}
			}
			Iterator<SourisM> SoM = sourism.iterator();
			while(SoM.hasNext()){
				SourisM som = SoM.next();
				PVector fompos = fom.position;
				PVector sompos = som.position;
				float d = PVector.dist(sompos, fompos);
				if(fom.NstarvingLvl2() == true){
					if(d < fom.getR()){
						float food = som.getWeight();
						fom.eat(food);
						SoM.remove(); 
						fom.resetEating();
					}
				}
			}
			Iterator<SourisF> SoF = sourisf.iterator();
			while(SoF.hasNext()){
				SourisF sof = SoF.next();
				PVector fompos = fom.position;
				PVector sofpos = sof.position;
				float d = PVector.dist(sofpos, fompos);
				if(fom.NstarvingLvl2() == true){
					if(d < fom.getR()){
						float food = sof.getWeight();
						fom.eat(food);
						SoF.remove(); 
						fom.resetEating();
					}
				}
			}
			Iterator<LapinM> LapM = lapinm.iterator();
			while(LapM.hasNext()){
				LapinM lapm = LapM.next();
				PVector fompos = fom.position;
				PVector lapmpos = lapm.position;
				float d = PVector.dist(lapmpos, fompos);
				if(fom.NstarvingLvl3() == true){
					if(d < fom.getR()){
						float food = lapm.getWeight();
						fom.eat(food);
						LapM.remove(); 
						fom.resetEating();
					}
				}
			}
			Iterator<LapinF> LapF = lapinf.iterator();
			while(LapF.hasNext()){
				LapinF lapf = LapF.next();
				PVector fompos = fom.position;
				PVector lapfpos = lapf.position;
				float d = PVector.dist(lapfpos, fompos);
				if(fom.NstarvingLvl3() == true){
					if(d < fom.getR()){
						float food = lapf.getWeight();
						fom.eat(food);
						LapF.remove(); 
						fom.resetEating();
					}
				}
			}
			/*
			Iterator<Meat> Me = meat.iterator();
			while(Me.hasNext()){
				Meat me = Me.next();
				PVector fompos = fom.position;
				PVector mepos = me.position;
				float d = PVector.dist(mepos, fompos);
				if(fom.NstarvingLvl1() == true){
					if(d < fom.getR()){
						float food = 1000;
						fom.eat(food);
						Me.remove(); 
						fom.resetEating();
					}
				}
			}
			*/
			Iterator<tileWater> TW = tilewater.iterator();
			while(TW.hasNext()){
				tileWater tw = TW.next();
				PVector fompos = fom.position;
				PVector twpos = tw.position;
				float d = PVector.dist(twpos, fompos);
				if(fom.soif() == true){
					if(d < fom.getR()){
						fom.drinkWater();
					}
				}
			}
			
			Iterator<EcureuilM> ECM = ecureuilm.iterator();
			while(ECM.hasNext()){
				EcureuilM ecm = ECM.next();
				PVector fompos = fom.position;
				PVector ecmpos = ecm.position;
				float d = PVector.dist(ecmpos, fompos);
				if(fom.NstarvingLvl2() == true){
					if(d < fom.getR()){
						float food = ecm.getWeight();
						fom.eat(food);
						ECM.remove();
						fom.resetEating();
					}
				}
			}
			Iterator<EcureuilF> ECF = ecureuilf.iterator();
			while(ECF.hasNext()){
				EcureuilF ecf = ECF.next();
				PVector fompos = fom.position;
				PVector ecfpos = ecf.position;
				float d = PVector.dist(ecfpos, fompos);
				if(fom.NstarvingLvl2() == true){
					if(d < fom.getR()){
						float food = ecf.getWeight();
						fom.eat(food);
						ECF.remove();
						fom.resetEating();
					}
				}
			}
			
		}
		//////////////////////////
		
		///////FoxF//////////
		while(foxf.size() < 1){
			for(int i = 0; i < totalfoxF; i++){
				PVector l = new PVector();
				l.x = parent.random(worldW-(worldW-50) , worldW-50);
				l.y	= parent.random(worldH-(worldH-50) , worldH-50);
				boolean overlapping = false;
				for(int a = 0; a < tilewater.size(); a++){
					tileWater other = tilewater.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 160){
						overlapping = true;
						break;
					}
				}
				if(!overlapping){
					DNAfox dnafox = new DNAfox(parent);
					foxf.add(new FoxF(l,dnafox,parent));
				}
			}
		}

		
		Iterator<FoxF> FoF = foxf.iterator();
		while(FoF.hasNext()){
			FoxF fof = FoF.next();
			fof.run(parent);
			fof.boundaries();
			if(fof.eatingTime() == false ){
				fof.mvtUpdate();
			}
			Iterator<tileWater> tileW = tilewater.iterator();
			while(tileW.hasNext()){
				tileWater tilew = tileW.next();
				PVector target = new PVector(tilew.position.x, tilew.position.y);
				if(fof.isTooClose(target)){
					fof.goAway(target);
				}
			}
		}
		
		//////find water//////
		if(foxf.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = foxf.size()-1; a >=0; a--){
				FoxF fof = foxf.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(fof.soif() == false){
					fof.wander(parent);
				}
				if(fof.soif() == true){
					for(int b = tilewater.size()-1 ; b >=0; b--){
						tileWater tw = tilewater.get(b);
						dist = ((fof.position.x - tw.position.x) * (fof.position.x - tw.position.x)) +
							   ((fof.position.y - tw.position.y) * (fof.position.y - tw.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = tw.position.x;
							target.y = tw.position.y;
						}
					}
					fof.findWater(target);
				}
			}
		}
		
		///////find food insecte///////// ////ajout des autres proie à faire
		if(foxf.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = foxf.size()-1; a >=0; a--){
				FoxF fof = foxf.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(fof.NstarvingLvl1() == false || fof.NstarvingLvl2() == false || fof.NstarvingLvl3() == false){
					fof.wander(parent);
				}
				if(fof.NstarvingLvl1() == true){
					for(int b = insect1m.size()-1; b >=0; b--){
						insect1M i1m = insect1m.get(b);
						dist = ((fof.position.x - i1m.position.x) * (fof.position.x - i1m.position.x)) +
							   ((fof.position.y - i1m.position.y) * (fof.position.y - i1m.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = i1m.position.x;
							target.y = i1m.position.y;
						}
					}
					for(int c = champi.size()-1; c >=0; c--){
						Champi ch = champi.get(c);
						dist = ((fof.position.x - ch.position.x) * (fof.position.x - ch.position.x)) +
							   ((fof.position.y - ch.position.y) * (fof.position.y - ch.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = ch.position.x;
							target.y = ch.position.y;
						}
					}
					/*
					for(int j = meat.size()-1; j >=0; j--){
						Meat me = meat.get(j);
						dist = ((fof.position.x - me.position.x) * (fof.position.x - me.position.x)) +
							   ((fof.position.y - me.position.y) * (fof.position.y - me.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = me.position.x;
							target.y = me.position.y;
						}
					}
					*/
					fof.findPray(target);
				}
				
				if(fof.NstarvingLvl2() == true){
					for(int d = sourism.size()-1; d >=0; d--){
						SourisM soum = sourism.get(d);
						dist = ((fof.position.x - soum.position.x) * (fof.position.x - soum.position.x)) +
							   ((fof.position.y - soum.position.y) * (fof.position.y - soum.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = soum.position.x;
							target.y = soum.position.y;
						}
					}
					for(int e = sourisf.size()-1; e >=0; e--){
						SourisF souf = sourisf.get(e);
						dist = ((fof.position.x - souf.position.x) * (fof.position.x - souf.position.x)) +
							   ((fof.position.y - souf.position.y) * (fof.position.y - souf.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = souf.position.x;
							target.y = souf.position.y;
						}
					}
					for(int h = ecureuilm.size()-1; h >=0; h--){
						EcureuilM ecm = ecureuilm.get(h);
						dist = ((fof.position.x - ecm.position.x) * (fof.position.x - ecm.position.x)) +
							   ((fof.position.y - ecm.position.y) * (fof.position.y - ecm.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = ecm.position.x;
							target.y = ecm.position.y;
						}
					}
					for(int i = ecureuilf.size()-1; i >=0; i--){
						EcureuilF ecf = ecureuilf.get(i);
						dist = ((fof.position.x - ecf.position.x) * (fof.position.x - ecf.position.x)) +
							   ((fof.position.y - ecf.position.y) * (fof.position.y - ecf.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = ecf.position.x;
							target.y = ecf.position.y;
						}
					}
					fof.findPray(target);
				}
				
				if(fof.NstarvingLvl3() == true){
					for(int f = lapinm.size()-1; f >=0; f--){
						LapinM lam = lapinm.get(f);
						dist = ((fof.position.x - lam.position.x) * (fof.position.x - lam.position.x)) +
							   ((fof.position.y - lam.position.y) * (fof.position.y - lam.position.y));
						if( dist < currentSmallest){
							currentSmallest = dist;
							target.x = lam.position.x;
							target.y = lam.position.y;
						}
					}
					for(int g = lapinf.size()-1; g >=0; g--){
						LapinF laf = lapinf.get(g);
						dist = ((fof.position.x - laf.position.x) * (fof.position.x - laf.position.x)) +
							   ((fof.position.y - laf.position.y) * (fof.position.y - laf.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = laf.position.x;
							target.y = laf.position.y;
						}
					}
					fof.findPray(target);
				}
			}
		}
		/////////////////////////
		
		////////eat insect////////
		Iterator<FoxF> FOF = foxf.iterator();
		while(FOF.hasNext()){
			FoxF fof = FOF.next();
			Iterator<insect1M> i1M = insect1m.iterator();
			while(i1M.hasNext()){
				insect1M i1m = i1M.next();
				PVector i1mpos = i1m.position;
				PVector fofpos = fof.position;
				float d = PVector.dist(i1mpos, fofpos);
				if(fof.NstarvingLvl1() == true){
					if(d < fof.getR()){
						float food = 100;
						fof.eat(food);
						i1M.remove();
						fof.resetEating();
					}
				}
			}
			Iterator<Champi> Ch = champi.iterator();
			while(Ch.hasNext()){
				Champi ch = Ch.next();
				PVector fofpos = fof.position;
				PVector chpos = ch.position;
				float d = PVector.dist(chpos, fofpos);
				if(fof.NstarvingLvl1() == true){
					if(d < fof.getR()){
						float food = 100;
						fof.eat(food);
						Ch.remove(); 
						fof.resetEating();
					}
				}
			}
			Iterator<SourisM> SoM = sourism.iterator();
			while(SoM.hasNext()){
				SourisM som = SoM.next();
				PVector fofpos = fof.position;
				PVector sompos = som.position;
				float d = PVector.dist(sompos, fofpos);
				if(fof.NstarvingLvl2() == true){
					if(d < fof.getR()){
						float food = som.getWeight();
						fof.eat(food);
						SoM.remove(); 
						fof.resetEating();
					}
				}
			}
			Iterator<SourisF> SoF = sourisf.iterator();
			while(SoF.hasNext()){
				SourisF sof = SoF.next();
				PVector fofpos = fof.position;
				PVector sofpos = sof.position;
				float d = PVector.dist(sofpos, fofpos);
				if(fof.NstarvingLvl2() == true){
					if(d < fof.getR()){
						float food = sof.getWeight();
						fof.eat(food);
						SoF.remove(); 
						fof.resetEating();
					}
				}
			}
			Iterator<LapinM> LapM = lapinm.iterator();
			while(LapM.hasNext()){
				LapinM lapm = LapM.next();
				PVector fofpos = fof.position;
				PVector lapmpos = lapm.position;
				float d = PVector.dist(lapmpos, fofpos);
				if(fof.NstarvingLvl3() == true){
					if(d < fof.getR()){
						float food = lapm.getWeight();
						fof.eat(food);
						LapM.remove(); 
						fof.resetEating();
					}
				}
			}
			Iterator<LapinF> LapF = lapinf.iterator();
			while(LapF.hasNext()){
				LapinF lapf = LapF.next();
				PVector fofpos = fof.position;
				PVector lapfpos = lapf.position;
				float d = PVector.dist(lapfpos, fofpos);
				if(fof.NstarvingLvl3() == true){
					if(d < fof.getR()){
						float food = lapf.getWeight();
						fof.eat(food);
						LapF.remove(); 
						fof.resetEating();
					}
				}
			}
			/*
			Iterator<Meat> Me = meat.iterator();
			while(Me.hasNext()){
				Meat me = Me.next();
				PVector fofpos = fof.position;
				PVector mepos = me.position;
				float d = PVector.dist(mepos, fofpos);
				if(fof.NstarvingLvl1() == true){
					if(d < fof.getR()){
						float food = 1000;
						fof.eat(food);
						Me.remove(); 
						fof.resetEating();
					}
				}
			}
			*/
			Iterator<tileWater> TW = tilewater.iterator();
			while(TW.hasNext()){
				tileWater tw = TW.next();
				PVector fofpos = fof.position;
				PVector twpos = tw.position;
				float d = PVector.dist(twpos, fofpos);
				if(fof.soif() == true){
					if(d < fof.getR()){
						fof.drinkWater();
					}
				}
			}
			
			Iterator<EcureuilM> ECM = ecureuilm.iterator();
			while(ECM.hasNext()){
				EcureuilM ecm = ECM.next();
				PVector fofpos = fof.position;
				PVector ecmpos = ecm.position;
				float d = PVector.dist(ecmpos, fofpos);
				if(fof.NstarvingLvl2() == true){
					if(d < fof.getR()){
						float food = ecm.getWeight();
						fof.eat(food);
						ECM.remove();
						fof.resetEating();
					}
				}
			}
			Iterator<EcureuilF> ECF = ecureuilf.iterator();
			while(ECF.hasNext()){
				EcureuilF ecf = ECF.next();
				PVector fofpos = fof.position;
				PVector ecfpos = ecf.position;
				float d = PVector.dist(ecfpos, fofpos);
				if(fof.NstarvingLvl2() == true){
					if(d < fof.getR()){
						float food = ecf.getWeight();
						fof.eat(food);
						ECF.remove();
						fof.resetEating();
					}
				}
			}
		}
		//////////////////////////
		
		//////reproduction//////
		//////find female///////
		if(foxf.size() >= 1){
			float currentSmallest;
			float dist;
			for(int a = foxm.size()-1; a >=0; a--){
				FoxM fom = foxm.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(fom.reproduceTime() == false){
					fom.wander(parent);
				}
				if(fom.reproduceTime() == true){
					if(foxm.size() < 5 || foxf.size() < 5){
						for(int b = foxf.size()-1; b >= 0; b--){
							FoxF fof = foxf.get(b);
							dist = ((fom.position.x - fof.position.x) * (fom.position.x - fof.position.x)) +
								   ((fom.position.y - fof.position.y) * (fom.position.y - fof.position.y));
							if( dist < currentSmallest){
								currentSmallest = dist;
								target.x = fof.position.x;
								target.y = fof.position.y;
							}
						}
						fom.findFemale(target);
					}
				}
			}
		}
		
		/////reproduction///////
		for(int a = foxm.size()-1; a >= 0; a--){
			for(int b = foxf.size()-1; b >= 0; b--){
				for(int c = foxnid.size()-1; c >=0; c--){
					FoxM fm = foxm.get(a);
					FoxF ff = foxf.get(b);
					FoxNid nid = foxnid.get(c);
					PVector fmpos = fm.position;
					PVector ffpos = ff.position;
					PVector nidpos = nid.position;
					float d = PVector.dist(fmpos, ffpos);
					if(d < ff.getR() && ff.reproduceTime() == true){  /////a changer juste pour test
						DNAfox momgenes = fm.getDNAfox();
						DNAfox dadgenes = ff.getDNAfox();
						DNAfox childdna = momgenes.crossover(dadgenes, parent);
						if(parent.random(10) > 5 && foxm.size() < 5){
							foxm.add(new FoxM(nidpos, childdna, parent));
							ff.resetReproduce();
							fm.resetReproduce();
						}
						if(parent.random(10) < 5 && foxf.size() < 5){
							foxf.add(new FoxF(nidpos, childdna, parent));
							ff.resetReproduce();
							fm.resetReproduce();
						}
					}
				}
			}
		}
		//////////////////////////
		
		///////BLAIREAU///////////
		///////BlaireauNid//////////
		int totalblaireaunid = 1;
		while(blaireaunid.size() < totalblaireaunid){
			PVector l = new PVector();
			l.x = parent.random(worldW-(worldW-50) , worldW-50);
			l.y	= parent.random(worldH-(worldH-50) , worldH-50);
			boolean overlapping = false;
			for(int a = 0; a < tilewater.size(); a++){
				tileWater other = tilewater.get(a);
				float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
				if(d < 160){
					overlapping = true;
					break;
				}
			}
			if(!overlapping){
				blaireaunid.add(new BlaireauNid(parent, l));
			}
			
		}
		/////////////////////////
		
		///////BlaireauxM//////////
		while(blaireaum.size() < 1){
			for(int i = 0; i < totalblaireauM; i++){
				PVector l = new PVector();
				l.x = parent.random(worldW-(worldW-50) , worldW-50);
				l.y	= parent.random(worldH-(worldH-50) , worldH-50);
				boolean overlapping = false;
				for(int a = 0; a < tilewater.size(); a++){
					tileWater other = tilewater.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 60){
						overlapping = true;
						break;
					}
				}
				if(!overlapping){
					DNAblaireau dnablaireau = new DNAblaireau(parent);
					blaireaum.add(new BlaireauM(l,dnablaireau,parent));
				}
			}
		}

		
		Iterator<BlaireauM> BLM = blaireaum.iterator();
		while(BLM.hasNext()){
			BlaireauM blm = BLM.next();
			blm.run(parent);
			blm.boundaries();
			if(blm.eatingTime() == false ){
				blm.mvtUpdate();
			}
			Iterator<tileWater> tileW = tilewater.iterator();
			while(tileW.hasNext()){
				tileWater tilew = tileW.next();
				PVector target = new PVector(tilew.position.x, tilew.position.y);
				if(blm.isTooClose(target)){
					blm.goAway(target);
				}
			}
		}
		
		//////find water//////
		if(blaireaum.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = blaireaum.size()-1; a >=0; a--){
				BlaireauM bm = blaireaum.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(bm.soif() == false){
					bm.wander(parent);
				}
				if(bm.soif() == true){
					for(int b = tilewater.size()-1 ; b >=0; b--){
						tileWater tw = tilewater.get(b);
						dist = ((bm.position.x - tw.position.x) * (bm.position.x - tw.position.x)) +
							   ((bm.position.y - tw.position.y) * (bm.position.y - tw.position.y));
						if( dist < currentSmallest){
							currentSmallest = dist;
							target.x = tw.position.x;
							target.y = tw.position.y;
						}
					}
					bm.findWater(target);
				}
			}
		}

		
		///////find food insecte champi red yellow berry chenille lapin souris ///////// 
		if(blaireaum.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = blaireaum.size()-1; a >=0; a--){
				BlaireauM bm = blaireaum.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(bm.NstarvingLvl1() == false || bm.NstarvingLvl2() == false || bm.NstarvingLvl3() == false){
					bm.wander(parent);
				}
				if(bm.NstarvingLvl1() == true){
					for(int b = insect1m.size()-1; b >=0; b--){
						insect1M i1m = insect1m.get(b);
						dist = ((bm.position.x - i1m.position.x) * (bm.position.x - i1m.position.x)) +
							   ((bm.position.y - i1m.position.y) * (bm.position.y - i1m.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = i1m.position.x;
							target.y = i1m.position.y;
						}
					}
					for(int c = champi.size()-1; c >=0; c--){
						Champi ch = champi.get(c);
						dist = ((bm.position.x - ch.position.x) * (bm.position.x - ch.position.x)) +
							   ((bm.position.y - ch.position.y) * (bm.position.y - ch.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = ch.position.x;
							target.y = ch.position.y;
						}
					}
					for(int d = redberry.size()-1; d >=0; d--){
						RedBerry rb = redberry.get(d);
						dist = ((bm.position.x - rb.position.x) * (bm.position.x - rb.position.x)) +
							   ((bm.position.y - rb.position.y) * (bm.position.y - rb.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = rb.position.x;
							target.y = rb.position.y;
						}
					}
					for(int e = yellowberry.size()-1; e >=0; e--){
						YellowBerry yb = yellowberry.get(e);
						dist = ((bm.position.x - yb.position.x) * (bm.position.x - yb.position.x)) +
							   ((bm.position.y - yb.position.y) * (bm.position.y - yb.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = yb.position.x;
							target.y = yb.position.y;
						}
					}
					for(int f = papillonbchenille.size()-1; f >=0; f--){
						PapillonBchenille pbc = papillonbchenille.get(f);
						dist = ((bm.position.x - pbc.position.x) * (bm.position.x - pbc.position.x)) +
							   ((bm.position.y - pbc.position.y) * (bm.position.y - pbc.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = pbc.position.x;
							target.y = pbc.position.y;
						}
					}
					/*
					for(int k = meat.size()-1; k >=0; k--){
						Meat me = meat.get(k);
						dist = ((bm.position.x - me.position.x) * (bm.position.x - me.position.x)) +
							   ((bm.position.y - me.position.y) * (bm.position.y - me.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = me.position.x;
							target.y = me.position.y;
						}
					}
					*/
					bm.findPray(target);
				}
				
				if(bm.NstarvingLvl2() == true){
					for(int i = sourism.size()-1; i >=0; i--){
						SourisM sm = sourism.get(i);
						dist = ((bm.position.x - sm.position.x) * (bm.position.x - sm.position.x)) +
							   ((bm.position.y - sm.position.y) * (bm.position.y - sm.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = sm.position.x;
							target.y = sm.position.y;
						}
					}
					for(int j = sourisf.size()-1; j >=0; j--){
						SourisF sf = sourisf.get(j);
						dist = ((bm.position.x - sf.position.x) * (bm.position.x - sf.position.x)) +
							   ((bm.position.y - sf.position.y) * (bm.position.y - sf.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = sf.position.x;
							target.y = sf.position.y;
						}
					}
					for(int l = ecureuilm.size()-1; l >=0; l--){
						EcureuilM em = ecureuilm.get(l);
						dist = ((bm.position.x - em.position.x) * (bm.position.x - em.position.x)) +
							   ((bm.position.y - em.position.y) * (bm.position.y - em.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = em.position.x;
							target.y = em.position.y;
						}
					}
					for(int m = ecureuilf.size()-1; m >=0; m--){
						EcureuilF ef = ecureuilf.get(m);
						dist = ((bm.position.x - ef.position.x) * (bm.position.x - ef.position.x)) +
							   ((bm.position.y - ef.position.y) * (bm.position.y - ef.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = ef.position.x;
							target.y = ef.position.y;
						}
					}
					bm.findPray(target);
				}
				
				if(bm.NstarvingLvl3() == true){
					for(int g = lapinm.size()-1; g >=0; g--){
						LapinM lm = lapinm.get(g);
						dist = ((bm.position.x - lm.position.x) * (bm.position.x - lm.position.x)) +
							   ((bm.position.y - lm.position.y) * (bm.position.y - lm.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = lm.position.x;
							target.y = lm.position.y;
						}
					}
					for(int h = lapinf.size()-1; h >=0; h--){
						LapinF lf = lapinf.get(h);
						dist = ((bm.position.x - lf.position.x) * (bm.position.x - lf.position.x)) +
							   ((bm.position.y - lf.position.y) * (bm.position.y - lf.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = lf.position.x;
							target.y = lf.position.y;
						}
					}
					bm.findPray(target);
				}
			}
		}
		/////////////////////////
		
		////////eat insect////////
		Iterator<BlaireauM> BM = blaireaum.iterator();
		while(BM.hasNext()){
			BlaireauM bm = BM.next();
			Iterator<insect1M> i1M = insect1m.iterator();
			while(i1M.hasNext()){
				insect1M i1m = i1M.next();
				PVector i1mpos = i1m.position;
				PVector bmpos = bm.position;
				float d = PVector.dist(i1mpos, bmpos);
				if(bm.NstarvingLvl1() == true){
					if(d < bm.getR()){
						float food = 100;
						bm.eat(food);
						i1M.remove();
						bm.resetEating();
					}
				}
			}
			Iterator<Champi> CH = champi.iterator();
			while(CH.hasNext()){
				Champi ch = CH.next();
				PVector chpos = ch.position;
				PVector bmpos = bm.position;
				float d = PVector.dist(chpos, bmpos);
				if(bm.NstarvingLvl1() == true){
					if(d < bm.getR()){
						float food = 100;
						bm.eat(food);
						CH.remove(); 
						bm.resetEating();
					}
				}
			}
			Iterator<RedBerry> ReB = redberry.iterator();
			while(ReB.hasNext()){
				RedBerry reb = ReB.next();
				PVector rebpos = reb.position;
				PVector bmpos = bm.position;
				float d = PVector.dist(rebpos, bmpos);
				if(bm.NstarvingLvl1() == true){
					if(d < bm.getR()){
						float food = 100;
						bm.eat(food);
						ReB.remove(); 
						bm.resetEating();
					}
				}
			}
			Iterator<YellowBerry> YeB = yellowberry.iterator();
			while(YeB.hasNext()){
				YellowBerry yeb = YeB.next();
				PVector yebpos = yeb.position;
				PVector bmpos = bm.position;
				float d = PVector.dist(yebpos, bmpos);
				if(bm.NstarvingLvl1() == true){
					if(d < bm.getR()){
						float food = 100;
						bm.eat(food);
						YeB.remove(); 
						bm.resetEating();
					}
				}
			}
			Iterator<PapillonBchenille> PbC = papillonbchenille.iterator();
			while(PbC.hasNext()){
				PapillonBchenille pbc = PbC.next();
				PVector pbcpos = pbc.position;
				PVector bmpos = bm.position;
				float d = PVector.dist(pbcpos, bmpos);
				if(bm.NstarvingLvl1() == true){
					if(d < bm.getR()){
						float food = 100;
						bm.eat(food);
						PbC.remove(); 
						bm.resetEating();
					}
				}
			}
			Iterator<LapinM> LapM = lapinm.iterator();
			while(LapM.hasNext()){
				LapinM lapm = LapM.next();
				PVector lapmpos = lapm.position;
				PVector bmpos = bm.position;
				float d = PVector.dist(lapmpos, bmpos);
				if(bm.NstarvingLvl3() == true){
					if(d < bm.getR()){
						float food = lapm.getWeight();
						bm.eat(food);
						LapM.remove(); 
						bm.resetEating();
					}
				}
			}
			Iterator<LapinF> LapF = lapinf.iterator();
			while(LapF.hasNext()){
				LapinF lapf = LapF.next();
				PVector lappos = lapf.position;
				PVector bmpos = bm.position;
				float d = PVector.dist(lappos, bmpos);
				if(bm.NstarvingLvl3() == true){
					if(d < bm.getR()){
						float food = lapf.getWeight();
						bm.eat(food);
						LapF.remove(); 
						bm.resetEating();
					}
				}
			}
			Iterator<SourisM> SoM = sourism.iterator();
			while(SoM.hasNext()){
				SourisM som = SoM.next();
				PVector sompos = som.position;
				PVector bmpos = bm.position;
				float d = PVector.dist(sompos, bmpos);
				if(bm.NstarvingLvl2() == true){
					if(d < bm.getR()){
						float food = som.getWeight();
						bm.eat(food);
						SoM.remove(); 
						bm.resetEating();
					}
				}
			}
			Iterator<SourisF> SoF = sourisf.iterator();
			while(SoF.hasNext()){
				SourisF sof = SoF.next();
				PVector sofpos = sof.position;
				PVector bmpos = bm.position;
				float d = PVector.dist(sofpos, bmpos);
				if(bm.NstarvingLvl2() == true){
					if(d < bm.getR()){
						float food = sof.getWeight();
						bm.eat(food);
						SoF.remove(); 
						bm.resetEating();
					}
				}
			}
			/*
			Iterator<Meat> Me = meat.iterator();
			while(Me.hasNext()){
				Meat me = Me.next();
				PVector mepos = me.position;
				PVector bmpos = bm.position;
				float d = PVector.dist(mepos, bmpos);
				if(bm.NstarvingLvl1() == true){
					if(d < bm.getR()){
						float food = 1000;
						bm.eat(food);
						Me.remove();
						bm.resetEating();
					}
				}
			}
			*/
			Iterator<tileWater> TW = tilewater.iterator();
			while(TW.hasNext()){
				tileWater tw = TW.next();
				PVector bmpos = bm.position;
				PVector twpos = tw.position;
				float d = PVector.dist(twpos, bmpos);
				if(bm.soif() == true){
					if(d < bm.getR()){
						bm.drinkWater();
					}
				}
			}
			
			Iterator<EcureuilM> ECM = ecureuilm.iterator();
			while(ECM.hasNext()){
				EcureuilM ecm = ECM.next();
				PVector bmpos = bm.position;
				PVector ecmpos = ecm.position;
				float d = PVector.dist(ecmpos, bmpos);
				if(bm.NstarvingLvl2() == true){
					if(d < bm.getR()){
						float food = ecm.getWeight();
						bm.eat(food);
						ECM.remove();
						bm.resetEating();
					}
				}
			}
			Iterator<EcureuilF> ECF = ecureuilf.iterator();
			while(ECF.hasNext()){
				EcureuilF ecf = ECF.next();
				PVector bmpos = bm.position;
				PVector ecfpos = ecf.position;
				float d = PVector.dist(ecfpos, bmpos);
				if(bm.NstarvingLvl2() == true){
					if(d < bm.getR()){
						float food = ecf.getWeight();
						bm.eat(food);
						ECF.remove();
						bm.resetEating();
					}
				}
			}
			
		}
		//////////////////////////

		///////BlaireauxF//////////
		while(blaireauf.size() < 1){
			for(int i = 0; i < totalblaireauf; i++){
				PVector l = new PVector();
				l.x = parent.random(worldW-(worldW-50) , worldW-50);
				l.y	= parent.random(worldH-(worldH-50) , worldH-50);
				boolean overlapping = false;
				for(int a = 0; a < tilewater.size(); a++){
					tileWater other = tilewater.get(a);
					float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
					if(d < 160){
						overlapping = true;
						break;
					}
				}
				if(!overlapping){
					DNAblaireau dnablaireau = new DNAblaireau(parent);
					blaireauf.add(new BlaireauF(l,dnablaireau,parent));
				}
			}
		}

		
		Iterator<BlaireauF> BLF = blaireauf.iterator();
		while(BLF.hasNext()){
			BlaireauF blf = BLF.next();
			blf.run(parent);
			blf.boundaries();
			if(blf.eatingTime() == false ){
				blf.mvtUpdate();
			}
			/*
			if(blf.dead() == true){
				BLF.remove();
				int randomMeat = (int) parent.random(5, 10);
				for(int a = 0; a < randomMeat; a++){
					PVector l = new PVector(parent.random(blf.position.x-10, blf.position.x+10), parent.random(blf.position.y-10, blf.position.y+10));
					meat.add(new Meat(parent,l));
				}
				int randomFurr = (int) parent.random(1, 3);
				for(int b = 0; b < randomFurr; b++){
					PVector l = new PVector(parent.random(blf.position.x-10, blf.position.x+10), parent.random(blf.position.y-10, blf.position.y+10));
					furr.add(new Furr(parent,l));
				}
			}
			*/
			Iterator<tileWater> tileW = tilewater.iterator();
			while(tileW.hasNext()){
				tileWater tilew = tileW.next();
				PVector target = new PVector(tilew.position.x, tilew.position.y);
				if(blf.isTooClose(target)){
					blf.goAway(target);
				}
			}
		}
		
		//////find water//////
		if(blaireauf.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = blaireauf.size()-1; a >=0; a--){
				BlaireauF bf = blaireauf.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(bf.soif() == false){
					bf.wander(parent);
				}
				if(bf.soif() == true){
					for(int b = tilewater.size()-1 ; b >=0; b--){
						tileWater tw = tilewater.get(b);
						dist = ((bf.position.x - tw.position.x) * (bf.position.x - tw.position.x)) +
							   ((bf.position.y - tw.position.y) * (bf.position.y - tw.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = tw.position.x;
							target.y = tw.position.y;
						}
					}
					bf.findWater(target);
				}
			}
		}
		
		///////find food insecte champi red yellow berry chenille lapin souris///////// 
		if(blaireauf.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = blaireauf.size()-1; a >=0; a--){
				BlaireauF bf = blaireauf.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(bf.NstarvingLvl1() == false || bf.NstarvingLvl2() == false || bf.NstarvingLvl3() == false){
					bf.wander(parent);
				}
				if(bf.NstarvingLvl1() == true){
					for(int b = insect1m.size()-1; b >=0; b--){
						insect1M i1m = insect1m.get(b);
						dist = ((bf.position.x - i1m.position.x) * (bf.position.x - i1m.position.x)) +
							   ((bf.position.y - i1m.position.y) * (bf.position.y - i1m.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = i1m.position.x;
							target.y = i1m.position.y;
						}
					}
					for(int c = champi.size()-1; c >=0; c--){
						Champi ch = champi.get(c);
						dist = ((bf.position.x - ch.position.x) * (bf.position.x - ch.position.x)) +
							   ((bf.position.y - ch.position.y) * (bf.position.y - ch.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = ch.position.x;
							target.y = ch.position.y;
						}
					}
					for(int d = redberry.size()-1; d >=0; d--){
						RedBerry rb = redberry.get(d);
						dist = ((bf.position.x - rb.position.x) * (bf.position.x - rb.position.x)) +
							   ((bf.position.y - rb.position.y) * (bf.position.y - rb.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = rb.position.x;
							target.y = rb.position.y;
						}
					}
					for(int e = yellowberry.size()-1; e >=0; e--){
						YellowBerry yb = yellowberry.get(e);
						dist = ((bf.position.x - yb.position.x) * (bf.position.x - yb.position.x)) +
							   ((bf.position.y - yb.position.y) * (bf.position.y - yb.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = yb.position.x;
							target.y = yb.position.y;
						}
					}
					for(int f = papillonbchenille.size()-1; f >=0; f--){
						PapillonBchenille pbc = papillonbchenille.get(f);
						dist = ((bf.position.x - pbc.position.x) * (bf.position.x - pbc.position.x)) +
							   ((bf.position.y - pbc.position.y) * (bf.position.y - pbc.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = pbc.position.x;
							target.y = pbc.position.y;
						}
					}
					/*
					for(int k = meat.size()-1; k >=0; k--){
						Meat me = meat.get(k);
						dist = ((bf.position.x - me.position.x) * (bf.position.x - me.position.x)) +
							   ((bf.position.y - me.position.y) * (bf.position.y - me.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = me.position.x;
							target.y = me.position.y;
						}
					}
					*/
					bf.findPray(target);
				}
				
				if(bf.NstarvingLvl2() == true){
					for(int i = sourism.size()-1; i >=0; i--){
						SourisM sm = sourism.get(i);
						dist = ((bf.position.x - sm.position.x) * (bf.position.x - sm.position.x)) +
							   ((bf.position.y - sm.position.y) * (bf.position.y - sm.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = sm.position.x;
							target.y = sm.position.y;
						}
					}
					for(int j = sourisf.size()-1; j >=0; j--){
						SourisF sf = sourisf.get(j);
						dist = ((bf.position.x - sf.position.x) * (bf.position.x - sf.position.x)) +
							   ((bf.position.y - sf.position.y) * (bf.position.y - sf.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = sf.position.x;
							target.y = sf.position.y;
						}
					}
					for(int l = ecureuilm.size()-1; l >=0; l--){
						EcureuilM em = ecureuilm.get(l);
						dist = ((bf.position.x - em.position.x) * (bf.position.x - em.position.x)) +
							   ((bf.position.y - em.position.y) * (bf.position.y - em.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = em.position.x;
							target.y = em.position.y;
						}
					}
					for(int m = ecureuilf.size()-1; m >=0; m--){
						EcureuilF ef = ecureuilf.get(m);
						dist = ((bf.position.x - ef.position.x) * (bf.position.x - ef.position.x)) +
							   ((bf.position.y - ef.position.y) * (bf.position.y - ef.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = ef.position.x;
							target.y = ef.position.y;
						}
					}
					bf.findPray(target);
				}
				
				if(bf.NstarvingLvl3() == true){
					for(int g = lapinm.size()-1; g >=0; g--){
						LapinM lm = lapinm.get(g);
						dist = ((bf.position.x - lm.position.x) * (bf.position.x - lm.position.x)) +
							   ((bf.position.y - lm.position.y) * (bf.position.y - lm.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = lm.position.x;
							target.y = lm.position.y;
						}
					}
					for(int h = lapinf.size()-1; h >=0; h--){
						LapinF lf = lapinf.get(h);
						dist = ((bf.position.x - lf.position.x) * (bf.position.x - lf.position.x)) +
							   ((bf.position.y - lf.position.y) * (bf.position.y - lf.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = lf.position.x;
							target.y = lf.position.y;
						}
					}
					bf.findPray(target);
				}
			}
		}
		/////////////////////////
		
		////////eat insect////////
		Iterator<BlaireauF> BF = blaireauf.iterator();
		while(BF.hasNext()){
			BlaireauF bf = BF.next();
			Iterator<insect1M> i1M = insect1m.iterator();
			while(i1M.hasNext()){
				insect1M i1m = i1M.next();
				PVector i1mpos = i1m.position;
				PVector bfpos = bf.position;
				float d = PVector.dist(i1mpos, bfpos);
				if(bf.NstarvingLvl1() == true){
					if(d < bf.getR()){
						float food = 100;
						bf.eat(food);
						i1M.remove();
						bf.resetEating();
					}
				}
			}
			Iterator<Champi> CH = champi.iterator();
			while(CH.hasNext()){
				Champi ch = CH.next();
				PVector chpos = ch.position;
				PVector bfpos = bf.position;
				float d = PVector.dist(chpos, bfpos);
				if(bf.NstarvingLvl1() == true){
					if(d < bf.getR()){
						float food = 100;
						bf.eat(food);
						CH.remove(); 
						bf.resetEating();
					}
				}
			}
			Iterator<RedBerry> ReB = redberry.iterator();
			while(ReB.hasNext()){
				RedBerry reb = ReB.next();
				PVector rebpos = reb.position;
				PVector bfpos = bf.position;
				float d = PVector.dist(rebpos, bfpos);
				if(bf.NstarvingLvl1() == true){
					if(d < bf.getR()){
						float food = 100;
						bf.eat(food);
						ReB.remove(); 
						bf.resetEating();
					}
				}
			}
			Iterator<YellowBerry> YeB = yellowberry.iterator();
			while(YeB.hasNext()){
				YellowBerry yeb = YeB.next();
				PVector yebpos = yeb.position;
				PVector bfpos = bf.position;
				float d = PVector.dist(yebpos, bfpos);
				if(bf.NstarvingLvl1() == true){
					if(d < bf.getR()){
						float food = 100;
						bf.eat(food);
						YeB.remove(); 
						bf.resetEating();
					}
				}
			}
			Iterator<PapillonBchenille> PbC = papillonbchenille.iterator();
			while(PbC.hasNext()){
				PapillonBchenille pbc = PbC.next();
				PVector pbcpos = pbc.position;
				PVector bfpos = bf.position;
				float d = PVector.dist(pbcpos, bfpos);
				if(bf.NstarvingLvl1() == true){
					if(d < bf.getR()){
						float food = 100;
						bf.eat(food);
						PbC.remove(); 
						bf.resetEating();
					}
				}
			}
			Iterator<LapinM> LapM = lapinm.iterator();
			while(LapM.hasNext()){
				LapinM lapm = LapM.next();
				PVector lapmpos = lapm.position;
				PVector bfpos = bf.position;
				float d = PVector.dist(lapmpos, bfpos);
				if(bf.NstarvingLvl3() == true){
					if(d < bf.getR()){
						float food = lapm.getWeight();
						bf.eat(food);
						LapM.remove(); 
						bf.resetEating();
					}
				}
			}
			Iterator<LapinF> LapF = lapinf.iterator();
			while(LapF.hasNext()){
				LapinF lapf = LapF.next();
				PVector lappos = lapf.position;
				PVector bfpos = bf.position;
				float d = PVector.dist(lappos, bfpos);
				if(bf.NstarvingLvl3() == true){
					if(d < bf.getR()){
						float food = lapf.getWeight();
						bf.eat(food);
						LapF.remove(); 
						bf.resetEating();
					}
				}
			}
			Iterator<SourisM> SoM = sourism.iterator();
			while(SoM.hasNext()){
				SourisM som = SoM.next();
				PVector sompos = som.position;
				PVector bfpos = bf.position;
				float d = PVector.dist(sompos, bfpos);
				if(bf.NstarvingLvl2() == true){
					if(d < bf.getR()){
						float food = som.getWeight();
						bf.eat(food);
						SoM.remove(); 
						bf.resetEating();
					}
				}
			}
			Iterator<SourisF> SoF = sourisf.iterator();
			while(SoF.hasNext()){
				SourisF sof = SoF.next();
				PVector sofpos = sof.position;
				PVector bfpos = bf.position;
				float d = PVector.dist(sofpos, bfpos);
				if(bf.NstarvingLvl2() == true){
					if(d < bf.getR()){
						float food = sof.getWeight();
						bf.eat(food);
						SoF.remove(); 
						bf.resetEating();
					}
				}
			}
			/*
			Iterator<Meat> Me = meat.iterator();
			while(Me.hasNext()){
				Meat me = Me.next();
				PVector mepos = me.position;
				PVector bfpos = bf.position;
				float d = PVector.dist(mepos, bfpos);
				if(bf.NstarvingLvl1() == true){
					if(d < bf.getR()){
						float food = 1000;
						bf.eat(food);
						Me.remove();
						bf.resetEating();
					}
				}
			}
			*/
			Iterator<tileWater> TW = tilewater.iterator();
			while(TW.hasNext()){
				tileWater tw = TW.next();
				PVector bfpos = bf.position;
				PVector twpos = tw.position;
				float d = PVector.dist(twpos, bfpos);
				if(bf.soif() == true){
					if(d < bf.getR()){
						bf.drinkWater();
					}
				}
			}
			
			Iterator<EcureuilM> ECM = ecureuilm.iterator();
			while(ECM.hasNext()){
				EcureuilM ecm = ECM.next();
				PVector bfpos = bf.position;
				PVector ecmpos = ecm.position;
				float d = PVector.dist(ecmpos, bfpos);
				if(bf.NstarvingLvl2() == true){
					if(d < bf.getR()){
						float food = ecm.getWeight();
						bf.eat(food);
						ECM.remove();
						bf.resetEating();
					}
				}
			}
			Iterator<EcureuilF> ECF = ecureuilf.iterator();
			while(ECF.hasNext()){
				EcureuilF ecf = ECF.next();
				PVector bfpos = bf.position;
				PVector ecfpos = ecf.position;
				float d = PVector.dist(ecfpos, bfpos);
				if(bf.NstarvingLvl2() == true){
					if(d < bf.getR()){
						float food = ecf.getWeight();
						bf.eat(food);
						ECF.remove();
						bf.resetEating();
					}
				}
			}
			

		}
		//////////////////////////

		//////find female///////
		if(blaireauf.size() >= 1){
			float currentSmallest;
			float dist;
			for(int a = blaireaum.size()-1; a >=0; a--){
				BlaireauM bm = blaireaum.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(bm.reproduceTime() == false){
					bm.wander(parent);
				}
				if(bm.reproduceTime() == true){
					if(blaireaum.size() < 5 || blaireauf.size() < 5){
						for(int b = blaireauf.size()-1; b >= 0; b--){
							BlaireauF bf = blaireauf.get(b);
							dist = ((bm.position.x - bf.position.x) * (bm.position.x - bf.position.x)) +
								   ((bm.position.y - bf.position.y) * (bm.position.y - bf.position.y));
							if( dist < currentSmallest){
								currentSmallest = dist;
								target.x = bf.position.x;
								target.y = bf.position.y;
							}
						}
						bm.findFemale(target);
					}
				}
			}
		}
		
		/////reproduction///////
		for(int a = blaireaum.size()-1; a >= 0; a--){
			for(int b = blaireauf.size()-1; b >= 0; b--){
				for(int c = blaireaunid.size()-1; c >=0; c--){
					BlaireauM bm = blaireaum.get(a);
					BlaireauF bf = blaireauf.get(b);
					BlaireauNid nid = blaireaunid.get(c);
					PVector bmpos = bm.position;
					PVector bfpos = bf.position;
					PVector nidpos = nid.position;
					float d = PVector.dist(bmpos, bfpos);
					if(d < bf.getR() && bf.reproduceTime() == true){  /////a changer juste pour test
						DNAblaireau momgenes = bm.getDNAblaireau();
						DNAblaireau dadgenes = bf.getDNAblaireau();
						DNAblaireau childdna = momgenes.crossover(dadgenes, parent);
						if(parent.random(10) > 5 && blaireaum.size() < 5){
							blaireaum.add(new BlaireauM(nidpos, childdna, parent));
							bf.resetReproduce();
							bm.resetReproduce();
						}
						if(parent.random(10) < 5 && blaireauf.size() < 5){
							blaireauf.add(new BlaireauF(nidpos, childdna, parent));
							bf.resetReproduce();
							bm.resetReproduce();
						}
					}
				}
			}
		}
		//////////////////////////

		////////WOLF//////////////
		///////WolfNid//////////
		int totalwolfnid = 1;
		while(wolfnid.size() < totalwolfnid){
			PVector l = new PVector();
			l.x = parent.random(worldW-(worldW-50) , worldW-50);
			l.y	= parent.random(worldH-(worldH-50) , worldH-50);
			boolean overlapping = false;
			for(int a = 0; a < tilewater.size(); a++){
				tileWater other = tilewater.get(a);
				float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
				if(d < 60){
					overlapping = true;
					break;
				}
			}
			if(!overlapping){
				wolfnid.add(new WolfNid(parent, l));
			}
			
		}
		/////////////////////////
		
		//////packbehavior//////// 
		Iterator<WolfM> WoM = wolfm.iterator();
		while(WoM.hasNext()){
			WolfM wom = WoM.next();
			Iterator<WolfF> WoF = wolff.iterator();
			while(WoF.hasNext()){
				WolfF wof = WoF.next();
				PVector wofpos = wof.position;
				PVector wompos = wom.position;
				float d = PVector.dist(wofpos, wompos);
				//if(d > 400){
				//	wom.stayInPack(wofpos);
				//	wof.stayInPack(wompos);
				//}
				if(wof.gestationReady() == true){
					if(d > 400){
						wom.stayInPack(wofpos);
						//wof.stayInPack(wompos);
					}

				}
				if(wof.gestationReady() == false){
					if(d > 400){
						wom.stayInPack(wofpos);
						wof.stayInPack(wompos);
					}

				}
			}
		}
		/////////////////////////

		//////MALE//////////////
		
		PVector wolfpackspawn = new PVector();
		wolfpackspawn.x = parent.random(worldW-(worldW-200) , worldW-50);
		wolfpackspawn.y	= parent.random(worldH-(worldH-200) , worldH-50);
		
		while(wolfm.size() < 1){
			for(int i = 0; i < totalwolfm; i++){
				PVector l = new PVector(parent.random(wolfpackspawn.x -100, wolfpackspawn.x+100), parent.random(wolfpackspawn.y-100, wolfpackspawn.y+100));
				DNAwolf dnawolf = new DNAwolf(parent);
				wolfm.add(new WolfM(l,dnawolf,parent));
				//test viellir les premiers
				Iterator<WolfM> WM = wolfm.iterator();
				while(WM.hasNext()){
					WolfM wm = WM.next();
					wm.gettingOld();
				}
			}
		}

		Iterator<WolfM> WM = wolfm.iterator();
		while(WM.hasNext()){
			WolfM wm = WM.next();
			wm.run(parent);
			wm.boundaries();
			if(wm.eatingTime() == false ){
				wm.mvtUpdate();
			}
			/*
			if(wm.dead() == true){
				WM.remove();
				int randomMeat = (int) parent.random(5, 10);
				for(int a = 0; a < randomMeat; a++){
					PVector l = new PVector(parent.random(wm.position.x-20, wm.position.x+20), parent.random(wm.position.y-20, wm.position.y+20));
					meat.add(new Meat(parent,l));
				}
				int randomFurr = (int) parent.random(2, 10);
				for(int b = 0; b < randomFurr; b++){
					PVector l = new PVector(parent.random(wm.position.x-20, wm.position.x+20), parent.random(wm.position.y-20, wm.position.y+20));
					furr.add(new Furr(parent,l));
				}
			}
			*/
			Iterator<tileWater> tileW = tilewater.iterator();
			while(tileW.hasNext()){
				tileWater tilew = tileW.next();
				PVector target = new PVector(tilew.position.x, tilew.position.y);
				if(wm.isTooClose(target)){
					wm.goAway(target);
				}
			}
		}
		
		//////find water//////
		if(wolfm.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = wolfm.size()-1; a >=0; a--){
				WolfM wm = wolfm.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(wm.soif() == false){
					wm.wander(parent);
				}
				if(wm.soif() == true){
					for(int b = tilewater.size()-1 ; b >=0; b--){
						tileWater tw = tilewater.get(b);
						dist = ((wm.position.x - tw.position.x) * (wm.position.x - tw.position.x)) +
							   ((wm.position.y - tw.position.y) * (wm.position.y - tw.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = tw.position.x;
							target.y = tw.position.y;
						}
					}
					wm.findWater(target);
				}
			}
		}
		
		///////find food lapin souris ecureuil boar ///////// 
		if(wolfm.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = wolfm.size()-1; a >=0; a--){
				WolfM wm = wolfm.get(a);
				
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				
				if(wm.NstarvingLvl1() == false || wm.NstarvingLvl2() == false || wm.NstarvingLvl3() == false 
										 	  || wm.NstarvingLvl4() == false || wm.NstarvingLvl5() == false){
					wm.wander(parent);
				}
				
				if(wm.NstarvingLvl4() == true){
					for(int j = insect1m.size()-1; j >=0; j--){
						insect1M i1m = insect1m.get(j);
						dist = ((wm.position.x - i1m.position.x) * (wm.position.x - i1m.position.x)) +
							   ((wm.position.y - i1m.position.y) * (wm.position.y - i1m.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = i1m.position.x;
							target.y = i1m.position.y;
						}
					}
					/*
					for(int k = meat.size()-1; k >=0; k--){
						Meat me = meat.get(k);
						dist = ((wm.position.x - me.position.x) * (wm.position.x - me.position.x)) +
							   ((wm.position.y - me.position.y) * (wm.position.y - me.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = me.position.x;
							target.y = me.position.y;
						}
					}
					*/
					wm.findPray(target);
				}
				
				if(wm.NstarvingLvl3() == true){
					for(int d = sourism.size()-1; d >=0; d--){
						SourisM sm = sourism.get(d);
						dist = ((wm.position.x - sm.position.x) * (wm.position.x - sm.position.x)) +
							   ((wm.position.y - sm.position.y) * (wm.position.y - sm.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = sm.position.x;
							target.y = sm.position.y;
						}
					}
					for(int e = sourisf.size()-1; e >=0; e--){
						SourisF sf = sourisf.get(e);
						dist = ((wm.position.x - sf.position.x) * (wm.position.x - sf.position.x)) +
							   ((wm.position.y - sf.position.y) * (wm.position.y - sf.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = sf.position.x;
							target.y = sf.position.y;
						}
					}
					for(int f = ecureuilm.size()-1; f >=0; f--){
						EcureuilM em = ecureuilm.get(f);
						dist = ((wm.position.x - em.position.x) * (wm.position.x - em.position.x)) +
							   ((wm.position.y - em.position.y) * (wm.position.y - em.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = em.position.x;
							target.y = em.position.y;
						}
					}
					for(int g = ecureuilf.size()-1; g >=0; g--){
						EcureuilF ef = ecureuilf.get(g);
						dist = ((wm.position.x - ef.position.x) * (wm.position.x - ef.position.x)) +
							   ((wm.position.y - ef.position.y) * (wm.position.y - ef.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = ef.position.x;
							target.y = ef.position.y;
						}
					}
					wm.findPray(target);
				}
				
				if(wm.NstarvingLvl2() == true){
					for(int b = lapinm.size()-1; b >=0; b--){
						LapinM lm = lapinm.get(b);
						dist = ((wm.position.x - lm.position.x) * (wm.position.x - lm.position.x)) +
							   ((wm.position.y - lm.position.y) * (wm.position.y - lm.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = lm.position.x;
							target.y = lm.position.y;
						}
					}
					for(int c = lapinf.size()-1; c >=0; c--){
						LapinF lf = lapinf.get(c);
						dist = ((wm.position.x - lf.position.x) * (wm.position.x - lf.position.x)) +
							   ((wm.position.y - lf.position.y) * (wm.position.y - lf.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = lf.position.x;
							target.y = lf.position.y;
						}
					}
					wm.findPray(target);
				}
				
				if(wm.NstarvingLvl1() == true){
					for(int h = boarm.size()-1; h >=0; h--){
						BoarM bm = boarm.get(h);
						dist = ((wm.position.x - bm.position.x) * (wm.position.x - bm.position.x)) +
							   ((wm.position.y - bm.position.y) * (wm.position.y - bm.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = bm.position.x;
							target.y = bm.position.y;
						}
					}
					for(int i = boarf.size()-1; i >=0; i--){
						BoarF bf = boarf.get(i);
						dist = ((wm.position.x - bf.position.x) * (wm.position.x - bf.position.x)) +
							   ((wm.position.y - bf.position.y) * (wm.position.y - bf.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = bf.position.x;
							target.y = bf.position.y;
						}
					}
					wm.findPray(target);
				}
				
				if(wm.NstarvingLvl5() == true){
					//le joueur
					//wm.findPray(target);
				}
			}
		}
		/////////////////////////
		
		////////eat lapin souris ecureuil boar////////
		Iterator<WolfM> Wom = wolfm.iterator();
		while(Wom.hasNext()){
			WolfM wm = Wom.next();
			Iterator<LapinM> lM = lapinm.iterator();
			while(lM.hasNext()){
				LapinM lm = lM.next();
				PVector lmpos = lm.position;
				PVector wmpos = wm.position;
				float d = PVector.dist(lmpos, wmpos);
				if(wm.NstarvingLvl2() == true){
					if(d < wm.getR()){
						float food = lm.getWeight();
						wm.eat(food);
						lM.remove();
						wm.resetEating();
					}
				}
			}
			Iterator<LapinF> lF = lapinf.iterator();
			while(lF.hasNext()){
				LapinF lf = lF.next();
				PVector lfpos = lf.position;
				PVector wmpos = wm.position;
				float d = PVector.dist(lfpos, wmpos);
				if(wm.NstarvingLvl2() == true){
					if(d < wm.getR()){
						float food = lf.getWeight();
						wm.eat(food);
						lF.remove();
						wm.resetEating();
					}
				}
			}
			Iterator<SourisM> SoM = sourism.iterator();
			while(SoM.hasNext()){
				SourisM som = SoM.next();
				PVector sompos = som.position;
				PVector wmpos = wm.position;
				float d = PVector.dist(sompos, wmpos);
				if(wm.NstarvingLvl3() == true){
					if(d < wm.getR()){
						float food = som.getWeight();
						wm.eat(food);
						SoM.remove();
						wm.resetEating();
					}
				}
			}
			Iterator<SourisF> SoF = sourisf.iterator();
			while(SoF.hasNext()){
				SourisF sof = SoF.next();
				PVector sofpos = sof.position;
				PVector wmpos = wm.position;
				float d = PVector.dist(sofpos, wmpos);
				if(wm.NstarvingLvl3() == true){
					if(d < wm.getR()){
						float food = sof.getWeight();
						wm.eat(food);
						SoF.remove();
						wm.resetEating();
					}
				}
			}
			Iterator<EcureuilM> EcM = ecureuilm.iterator();
			while(EcM.hasNext()){
				EcureuilM ecm = EcM.next();
				PVector ecmpos = ecm.position;
				PVector wmpos = wm.position;
				float d = PVector.dist(ecmpos, wmpos);
				if(wm.NstarvingLvl3() == true){
					if(d < wm.getR()){
						float food = ecm.getWeight();
						wm.eat(food);
						EcM.remove();
						wm.resetEating();
					}
				}
			}
			Iterator<EcureuilF> EcF = ecureuilf.iterator();
			while(EcF.hasNext()){
				EcureuilF ecf = EcF.next();
				PVector ecfpos = ecf.position;
				PVector wmpos = wm.position;
				float d = PVector.dist(ecfpos, wmpos);
				if(wm.NstarvingLvl3() == true){
					if(d < wm.getR()){
						float food = ecf.getWeight();
						wm.eat(food);
						EcF.remove();
						wm.resetEating();
					}
				}
			}
			Iterator<BoarM> BoaM = boarm.iterator();
			while(BoaM.hasNext()){
				BoarM boam = BoaM.next();
				PVector boampos = boam.position;
				PVector wmpos = wm.position;
				float d = PVector.dist(boampos, wmpos);
				if(wm.NstarvingLvl1() == true){
					if(d < wm.getR()){
						boam.health = 0;
						float food = boam.getWeight();
						food = PApplet.max(wm.foodPerDay, wm.maxFoodPerDay);
						wm.eat(food);
						//BoaM.remove();
						wm.resetEating();
					}
				}
			}
			Iterator<BoarF> BoaF = boarf.iterator();
			while(BoaF.hasNext()){
				BoarF boaf = BoaF.next();
				PVector boafpos = boaf.position;
				PVector wmpos = wm.position;
				float d = PVector.dist(boafpos, wmpos);
				if(wm.NstarvingLvl1() == true){
					if(d < wm.getR()){
						boaf.health = 0;
						float food = boaf.getWeight();
						food = PApplet.max(wm.foodPerDay, wm.maxFoodPerDay);
						wm.eat(food);
						//BoaF.remove();
						wm.resetEating();
					}
				}
			}
			Iterator<insect1M> i1M = insect1m.iterator();
			while(i1M.hasNext()){
				insect1M i1m = i1M.next();
				PVector inspos = i1m.position;
				PVector wmpos = wm.position;
				float d = PVector.dist(inspos, wmpos);
				if(wm.NstarvingLvl4() == true){
					if(d < wm.getR()){
						float food = 100;
						wm.eat(food);
						i1M.remove();
						wm.resetEating();
					}
				}
			}
			/*
			Iterator<Meat> Me = meat.iterator();
			while(Me.hasNext()){
				Meat me = Me.next();
				PVector mepos = me.position;
				PVector wmpos = wm.position;
				float d = PVector.dist(mepos, wmpos);
				if(wm.NstarvingLvl1() == true){
					if(d < wm.getR()){
						float food = 1000;
						wm.eat(food);
						Me.remove();
						wm.resetEating();
					}
				}
			}
			*/
			Iterator<tileWater> TW = tilewater.iterator();
			while(TW.hasNext()){
				tileWater tw = TW.next();
				PVector wmpos = wm.position;
				PVector twpos = tw.position;
				float d = PVector.dist(twpos, wmpos);
				if(wm.soif() == true){
					if(d < wm.getR()){
						wm.drinkWater();
					}
				}
			}

		}
		//////////////////////////

		//////FEMALE//////////////
		while(wolff.size() < 1){
			//int totalwolff = 1;
			for(int i = 0; i < totalwolff; i++){
				PVector l = new PVector(parent.random(wolfpackspawn.x -100, wolfpackspawn.x+100), parent.random(wolfpackspawn.y-100, wolfpackspawn.y+100));
				DNAwolf dnawolf = new DNAwolf(parent);
				wolff.add(new WolfF(l,dnawolf,parent));
				Iterator<WolfF> WF = wolff.iterator();
				while(WF.hasNext()){
					WolfF wf = WF.next();
					wf.gettingOld();
				}
			}
		}

		Iterator<WolfF> WF = wolff.iterator();
		while(WF.hasNext()){
			WolfF wf = WF.next();
			wf.run(parent);
			wf.boundaries();
			if(wf.eatingTime() == false ){
				wf.mvtUpdate();
			}
			/*
			if(wf.dead() == true){
				WF.remove();
				int randomMeat = (int) parent.random(5, 10);
				for(int a = 0; a < randomMeat; a++){
					PVector l = new PVector(parent.random(wf.position.x-20, wf.position.x+20), parent.random(wf.position.y-20, wf.position.y+20));
					meat.add(new Meat(parent,l));
				}
				int randomFurr = (int) parent.random(2, 10);
				for(int b = 0; b < randomFurr; b++){
					PVector l = new PVector(parent.random(wf.position.x-20, wf.position.x+20), parent.random(wf.position.y-20, wf.position.y+20));
					furr.add(new Furr(parent,l));
				}
			}
			*/
			Iterator<tileWater> tileW = tilewater.iterator();
			while(tileW.hasNext()){
				tileWater tilew = tileW.next();
				PVector target = new PVector(tilew.position.x, tilew.position.y);
				if(wf.isTooClose(target)){
					wf.goAway(target);
				}
			}
		}
		//////////////////////////

		//////find water//////
		if(wolff.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = wolff.size()-1; a >=0; a--){
				WolfF wf = wolff.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(wf.soif() == false){
					wf.wander(parent);
				}
				if(wf.soif() == true){
					for(int b = tilewater.size()-1 ; b >=0; b--){
						tileWater tw = tilewater.get(b);
						dist = ((wf.position.x - tw.position.x) * (wf.position.x - tw.position.x)) +
							   ((wf.position.y - tw.position.y) * (wf.position.y - tw.position.y));
						if( dist < currentSmallest){
							currentSmallest = dist;
							target.x = tw.position.x;
							target.y = tw.position.y;
						}
					}
					wf.findWater(target);
				}
			}
		}

		
		///////find food lapin souris ecureuil boar ////////
		if(wolff.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = wolff.size()-1; a >=0; a--){
				WolfF wf = wolff.get(a);
				
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(wf.NstarvingLvl1() == false || wf.NstarvingLvl2() == false || wf.NstarvingLvl3() == false 
					 	  || wf.NstarvingLvl4() == false || wf.NstarvingLvl5() == false){
					wf.wander(parent);
				}

				if(wf.NstarvingLvl4() == true){
					for(int j = insect1m.size()-1; j >=0; j--){
						insect1M i1m = insect1m.get(j);
						dist = ((wf.position.x - i1m.position.x) * (wf.position.x - i1m.position.x)) +
							   ((wf.position.y - i1m.position.y) * (wf.position.y - i1m.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = i1m.position.x;
							target.y = i1m.position.y;
						}
					}
					/*
					for(int k = meat.size()-1; k >=0; k--){
						Meat me = meat.get(k);
						dist = ((wf.position.x - me.position.x) * (wf.position.x - me.position.x)) +
							   ((wf.position.y - me.position.y) * (wf.position.y - me.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = me.position.x;
							target.y = me.position.y;
						}
					}
					*/
					wf.findPray(target);
				}
				
				if(wf.NstarvingLvl3() == true){
					for(int d = sourism.size()-1; d >=0; d--){
						SourisM sm = sourism.get(d);
						dist = ((wf.position.x - sm.position.x) * (wf.position.x - sm.position.x)) +
							   ((wf.position.y - sm.position.y) * (wf.position.y - sm.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = sm.position.x;
							target.y = sm.position.y;
						}
					}
					for(int e = sourisf.size()-1; e >=0; e--){
						SourisF sf = sourisf.get(e);
						dist = ((wf.position.x - sf.position.x) * (wf.position.x - sf.position.x)) +
							   ((wf.position.y - sf.position.y) * (wf.position.y - sf.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = sf.position.x;
							target.y = sf.position.y;
						}
					}
					for(int f = ecureuilm.size()-1; f >=0; f--){
						EcureuilM em = ecureuilm.get(f);
						dist = ((wf.position.x - em.position.x) * (wf.position.x - em.position.x)) +
							   ((wf.position.y - em.position.y) * (wf.position.y - em.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = em.position.x;
							target.y = em.position.y;
						}
					}
					for(int g = ecureuilf.size()-1; g >=0; g--){
						EcureuilF ef = ecureuilf.get(g);
						dist = ((wf.position.x - ef.position.x) * (wf.position.x - ef.position.x)) +
							   ((wf.position.y - ef.position.y) * (wf.position.y - ef.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = ef.position.x;
							target.y = ef.position.y;
						}
					}
					wf.findPray(target);
				}
				
				if(wf.NstarvingLvl2() == true){
					for(int b = lapinm.size()-1; b >=0; b--){
						LapinM lm = lapinm.get(b);
						dist = ((wf.position.x - lm.position.x) * (wf.position.x - lm.position.x)) +
							   ((wf.position.y - lm.position.y) * (wf.position.y - lm.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = lm.position.x;
							target.y = lm.position.y;
						}
					}
					for(int c = lapinf.size()-1; c >=0; c--){
						LapinF lf = lapinf.get(c);
						dist = ((wf.position.x - lf.position.x) * (wf.position.x - lf.position.x)) +
							   ((wf.position.y - lf.position.y) * (wf.position.y - lf.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = lf.position.x;
							target.y = lf.position.y;
						}
					}
					wf.findPray(target);
				}
				
				if(wf.NstarvingLvl1() == true){
					for(int h = boarm.size()-1; h >=0; h--){
						BoarM bm = boarm.get(h);
						dist = ((wf.position.x - bm.position.x) * (wf.position.x - bm.position.x)) +
							   ((wf.position.y - bm.position.y) * (wf.position.y - bm.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = bm.position.x;
							target.y = bm.position.y;
						}
					}
					for(int i = boarf.size()-1; i >=0; i--){
						BoarF bf = boarf.get(i);
						dist = ((wf.position.x - bf.position.x) * (wf.position.x - bf.position.x)) +
							   ((wf.position.y - bf.position.y) * (wf.position.y - bf.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = bf.position.x;
							target.y = bf.position.y;
						}
					}
					wf.findPray(target);
				}
				
				if(wf.NstarvingLvl5() == true){
					//le joueur
					//wm.findPray(target);
				}
			}
		}
		/////////////////////////
		
		////////eat lapinm////////
		Iterator<WolfF> Wof = wolff.iterator();
		while(Wof.hasNext()){
			WolfF wf = Wof.next();
			Iterator<LapinM> lM = lapinm.iterator();
			while(lM.hasNext()){
				LapinM lm = lM.next();
				PVector lmpos = lm.position;
				PVector wfpos = wf.position;
				float d = PVector.dist(lmpos, wfpos);
				if(wf.NstarvingLvl2() == true){
					if(d < wf.getR()){
						float food = lm.getWeight();
						wf.eat(food);
						lM.remove();
						wf.resetEating();
					}
				}
			}
			Iterator<LapinF> lF = lapinf.iterator();
			while(lF.hasNext()){
				LapinF lf = lF.next();
				PVector lfpos = lf.position;
				PVector wfpos = wf.position;
				float d = PVector.dist(lfpos, wfpos);
				if(wf.NstarvingLvl2() == true){
					if(d < wf.getR()){
						float food = lf.getWeight();
						wf.eat(food);
						lF.remove();
						wf.resetEating();
					}
				}
			}
			Iterator<SourisM> SoM = sourism.iterator();
			while(SoM.hasNext()){
				SourisM som = SoM.next();
				PVector sompos = som.position;
				PVector wfpos = wf.position;
				float d = PVector.dist(sompos, wfpos);
				if(wf.NstarvingLvl3() == true){
					if(d < wf.getR()){
						float food = som.getWeight();
						wf.eat(food);
						SoM.remove();
						wf.resetEating();
					}
				}
			}
			Iterator<SourisF> SoF = sourisf.iterator();
			while(SoF.hasNext()){
				SourisF sof = SoF.next();
				PVector sofpos = sof.position;
				PVector wfpos = wf.position;
				float d = PVector.dist(sofpos, wfpos);
				if(wf.NstarvingLvl3() == true){
					if(d < wf.getR()){
						float food = sof.getWeight();
						wf.eat(food);
						SoF.remove();
						wf.resetEating();
					}
				}
			}
			Iterator<EcureuilM> EcM = ecureuilm.iterator();
			while(EcM.hasNext()){
				EcureuilM ecm = EcM.next();
				PVector ecmpos = ecm.position;
				PVector wfpos = wf.position;
				float d = PVector.dist(ecmpos, wfpos);
				if(wf.NstarvingLvl3() == true){
					if(d < wf.getR()){
						float food = ecm.getWeight();
						wf.eat(food);
						EcM.remove();
						wf.resetEating();
					}
				}
			}
			Iterator<EcureuilF> EcF = ecureuilf.iterator();
			while(EcF.hasNext()){
				EcureuilF ecf = EcF.next();
				PVector ecfpos = ecf.position;
				PVector wfpos = wf.position;
				float d = PVector.dist(ecfpos, wfpos);
				if(wf.NstarvingLvl3() == true){
					if(d < wf.getR()){
						float food = ecf.getWeight();
						wf.eat(food);
						EcF.remove();
						wf.resetEating();
					}
				}
			}
			Iterator<BoarM> BoaM = boarm.iterator();
			while(BoaM.hasNext()){
				BoarM boam = BoaM.next();
				PVector boampos = boam.position;
				PVector wfpos = wf.position;
				float d = PVector.dist(boampos, wfpos);
				if(wf.NstarvingLvl1() == true){
					if(d < wf.getR()){
						boam.health = 0;
						float food = boam.getWeight();
						food = PApplet.max(wf.foodPerDay, wf.maxFoodPerDay);
						wf.eat(food);
						//BoaM.remove();
						wf.resetEating();
					}
				}
			}
			Iterator<BoarF> BoaF = boarf.iterator();
			while(BoaF.hasNext()){
				BoarF boaf = BoaF.next();
				PVector boafpos = boaf.position;
				PVector wfpos = wf.position;
				float d = PVector.dist(boafpos, wfpos);
				if(wf.NstarvingLvl1() == true){
					if(d < wf.getR()){
						boaf.health = 0;
						float food = boaf.getWeight();
						food = PApplet.max(wf.foodPerDay, wf.maxFoodPerDay);
						wf.eat(food);
						//BoaF.remove();
						wf.resetEating();
					}
				}
			}
			Iterator<insect1M> i1M = insect1m.iterator();
			while(i1M.hasNext()){
				insect1M i1m = i1M.next();
				PVector inspos = i1m.position;
				PVector wfpos = wf.position;
				float d = PVector.dist(inspos, wfpos);
				if(wf.NstarvingLvl4() == true){
					if(d < wf.getR()){
						float food = 100;
						wf.eat(food);
						i1M.remove();
						wf.resetEating();
					}
				}
			}
			/*
			Iterator<Meat> Me = meat.iterator();
			while(Me.hasNext()){
				Meat me = Me.next();
				PVector mepos = me.position;
				PVector wfpos = wf.position;
				float d = PVector.dist(mepos, wfpos);
				if(wf.NstarvingLvl1() == true){
					if(d < wf.getR()){
						float food = 1000;
						wf.eat(food);
						Me.remove();
						wf.resetEating();
					}
				}
			}
			*/
			Iterator<tileWater> TW = tilewater.iterator();
			while(TW.hasNext()){
				tileWater tw = TW.next();
				PVector wfpos = wf.position;
				PVector twpos = tw.position;
				float d = PVector.dist(twpos, wfpos);
				if(wf.soif() == true){
					if(d < wf.getR()){
						wf.drinkWater();
					}
				}
			}
		}
		//////////////////////////
		

		//////REPRODUCTION/////////
		
		//////find female///////
		
		///visiblement ca fonctionne
		if(wolff.size() >= 1){
			float currentSmallest;
			float dist;
			for(int a = wolfm.size()-1; a >=0; a--){
				WolfM wm = wolfm.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				for(int b = wolff.size()-1; b >= 0; b--){
					WolfF wf = wolff.get(b);
					if(wm.reproduceTime() == false ){
						wm.wander(parent);
					}
					if(wm.reproduceTime() == true && wf.reproduceTime() == true && wf.young() == false && wf.pup() == false){
						if(wolfm.size() < 5 || wolff.size() < 5){
							dist = ((wm.position.x - wf.position.x) * (wm.position.x - wf.position.x)) +
								   ((wm.position.y - wf.position.y) * (wm.position.y - wf.position.y));
							if( dist < currentSmallest){
								currentSmallest = dist;
								target.x = wf.position.x;
								target.y = wf.position.y;
							}
						}
					}
				}
				wm.findFemale(target);
			}
		}
		
		
		/////reproduction///////
		for(int a = wolfm.size()-1; a >= 0; a--){
			for(int b = wolff.size()-1; b >= 0; b--){
				WolfM wm = wolfm.get(a);
				WolfF wf = wolff.get(b);
				PVector wmpos = wm.position;
				PVector wfpos = wf.position;
				float d = PVector.dist(wmpos, wfpos);
				if(d < wf.getR() && wf.reproduceTime() == true && wf.pup() == false && wf.young() == false){  /////a changer juste pour test
					wm.resetReproduce();
					wf.resetReproduce();
					wf.resetGestation();
				}
				if(wf.gestationReady() == false){
					wf.wander(parent);
				}
				if(wf.gestationReady() == true){
					for(int c = wolfnid.size()-1; c >=0; c--){
						WolfNid wn = wolfnid.get(c);
						PVector target = new PVector(wn.position.x,wn.position.y);
						PVector wnpos = wn.position;
						DNAwolf momgenes = wm.getDNAwolf();
						DNAwolf dadgenes = wf.getDNAwolf();
						DNAwolf childdna = momgenes.crossover(dadgenes, parent);
						wf.goToNest(target);
						float d2 = PVector.dist(wfpos, wnpos);
						if(d2 < 200){
							if(parent.random(10) > 5 && wolfm.size() < 5){
								wolfm.add(new WolfM(wfpos, childdna, parent));
								wf.gestationFinish();
							}
							if(parent.random(10) < 5 && wolff.size() < 5){
								wolff.add(new WolfF(wfpos, childdna, parent));
								wf.gestationFinish();
							}
						}
					}
				}
				
			}
		}
		//////////////////////////

		////////BEAR//////////////
		///////bearNid//////////
		int totalbearnid = 1;
		while(bearnid.size() < totalbearnid){
			PVector l = new PVector();
			l.x = parent.random(worldW-(worldW-50) , worldW-50);
			l.y	= parent.random(worldH-(worldH-50) , worldH-50);
			boolean overlapping = false;
			for(int a = 0; a < tilewater.size(); a++){
				tileWater other = tilewater.get(a);
				float d = PApplet.dist(l.x, l.y, other.position.x, other.position.y);
				if(d < 60){
					overlapping = true;
					break;
				}
			}
			if(!overlapping){
				bearnid.add(new BearNid(parent, l));
			}
			
		}
		
		/////////////////////////

		//////MALE//////////////
		while(bearm.size() < 1){
			for(int i = 0; i < totalbearm; i++){
				PVector l = new PVector();
				l.x = parent.random(worldW-(worldW-50) , worldW-50);
				l.y	= parent.random(worldH-(worldH-50) , worldH-50);
				DNAbear dnabear = new DNAbear(parent);
				bearm.add(new BearM(l,dnabear,parent));
			}
		}

		Iterator<BearM> BeM = bearm.iterator();
		while(BeM.hasNext()){
			BearM bem = BeM.next();
			bem.run(parent);
			bem.boundaries();
			
			if(bem.eatingTime() == false ){
				bem.mvtUpdate();
			}
			/*
			if(bem.dead() == true){
				BeM.remove();
				int randomMeat = (int) parent.random(5, 10);
				for(int a = 0; a < randomMeat; a++){
					PVector l = new PVector(parent.random(bem.position.x-20, bem.position.x+20), parent.random(bem.position.y-20, bem.position.y+20));
					meat.add(new Meat(parent,l));
				}
				int randomFurr = (int) parent.random(5, 15);
				for(int b = 0; b < randomFurr; b++){
					PVector l = new PVector(parent.random(bem.position.x-20, bem.position.x+20), parent.random(bem.position.y-20, bem.position.y+20));
					furr.add(new Furr(parent,l));
				}
			}
			*/
			Iterator<tileWater> tileW = tilewater.iterator();
			while(tileW.hasNext()){
				tileWater tilew = tileW.next();
				PVector target = new PVector(tilew.position.x, tilew.position.y);
				if(bem.isTooClose(target)){
					bem.goAway(target);
				}
			}
			
		}
		
		//////find water//////
		if(bearm.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = bearm.size()-1; a >=0; a--){
				BearM bm = bearm.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(bm.soif() == false){
					bm.wander(parent);
				}
				if(bm.soif() == true){
					for(int b = tilewater.size()-1 ; b >=0; b--){
						tileWater tw = tilewater.get(b);
						dist = ((bm.position.x - tw.position.x) * (bm.position.x - tw.position.x)) +
							   ((bm.position.y - tw.position.y) * (bm.position.y - tw.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = tw.position.x;
							target.y = tw.position.y;
						}
					}
					bm.findWater(target);
				}
			}
		}


		///////find food red yellow berry champi insect papillon chenille souris lapin///////// ////ajout des autres proie à faire
		if(bearm.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = bearm.size()-1; a >=0; a--){
				BearM bm = bearm.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(bm.NstarvingLvl1() == false || bm.NstarvingLvl2() == false || bm.NstarvingLvl3() == false){
					bm.wander(parent);
				}
				if(bm.NstarvingLvl1() == true){
					for(int b = redberry.size()-1; b >=0; b--){
						RedBerry rb = redberry.get(b);
						dist = ((bm.position.x - rb.position.x) * (bm.position.x - rb.position.x)) +
							   ((bm.position.y - rb.position.y) * (bm.position.y - rb.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = rb.position.x;
							target.y = rb.position.y;
						}
					}
					for(int c = yellowberry.size()-1; c >=0; c--){
						YellowBerry yb = yellowberry.get(c);
						dist = ((bm.position.x - yb.position.x) * (bm.position.x - yb.position.x)) +
							   ((bm.position.y - yb.position.y) * (bm.position.y - yb.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = yb.position.x;
							target.y = yb.position.y;
						}
					}
					for(int d = champi.size()-1; d >=0; d--){
						Champi ch = champi.get(d);
						dist = ((bm.position.x - ch.position.x) * (bm.position.x - ch.position.x)) +
							   ((bm.position.y - ch.position.y) * (bm.position.y - ch.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = ch.position.x;
							target.y = ch.position.y;
						}
					}
					for(int e = insect1m.size()-1; e >=0; e--){
						insect1M i1m = insect1m.get(e);
						dist = ((bm.position.x - i1m.position.x) * (bm.position.x - i1m.position.x)) +
							   ((bm.position.y - i1m.position.y) * (bm.position.y - i1m.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = i1m.position.x;
							target.y = i1m.position.y;
						}
					}
					for(int f = papillonb.size()-1 ; f >=0; f--){
						PapillonB pb = papillonb.get(f);
						dist = ((bm.position.x - pb.position.x) * (bm.position.x - pb.position.x)) +
							   ((bm.position.y - pb.position.y) * (bm.position.y - pb.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = pb.position.x;
							target.y = pb.position.y;
						}
					}
					for(int g = papillonbchenille.size()-1; g >=0; g--){
						PapillonBchenille pbc = papillonbchenille.get(g);
						dist = ((bm.position.x - pbc.position.x) * (bm.position.x - pbc.position.x)) +
							   ((bm.position.y - pbc.position.y) * (bm.position.y - pbc.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = pbc.position.x;
							target.y = pbc.position.y;
						}
					}
					/*
					for(int l = meat.size()-1; l >=0; l--){
						Meat me = meat.get(l);
						dist = ((bm.position.x - me.position.x) * (bm.position.x - me.position.x)) +
							   ((bm.position.y - me.position.y) * (bm.position.y - me.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = me.position.x;
							target.y = me.position.y;
						}
					}
					*/
					bm.findPray(target);
				}
				
				if(bm.NstarvingLvl2() == true){
					for(int h = sourism.size()-1; h >=0; h--){
						SourisM sm = sourism.get(h);
						dist = ((bm.position.x - sm.position.x) * (bm.position.x - sm.position.x)) +
							   ((bm.position.y - sm.position.y) * (bm.position.y - sm.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = sm.position.x;
							target.y = sm.position.y;
						}
					}
					for(int i = sourisf.size()-1; i >=0; i--){
						SourisF sf = sourisf.get(i);
						dist = ((bm.position.x - sf.position.x) * (bm.position.x - sf.position.x)) +
							   ((bm.position.y - sf.position.y) * (bm.position.y - sf.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = sf.position.x;
							target.y = sf.position.y;
						}
					}
					bm.findPray(target);
				}
				
				if(bm.NstarvingLvl3() == true){
					for(int j = lapinm.size()-1; j >=0; j--){
						LapinM lm = lapinm.get(j);
						dist = ((bm.position.x - lm.position.x) * (bm.position.x - lm.position.x)) +
							   ((bm.position.y - lm.position.y) * (bm.position.y - lm.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = lm.position.x;
							target.y = lm.position.y;
						}
					}
					for(int k = lapinf.size()-1; k >=0; k--){
						LapinF lf = lapinf.get(k);
						dist = ((bm.position.x - lf.position.x) * (bm.position.x - lf.position.x)) +
							   ((bm.position.y - lf.position.y) * (bm.position.y - lf.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = lf.position.x;
							target.y = lf.position.y;
						}
					}
					bm.findPray(target);
				}
				
			}
		}
		/////////////////////////
		
		////////eat redberry////////
		Iterator<BearM> Bm = bearm.iterator();
		while(Bm.hasNext()){
			BearM bm = Bm.next();
			Iterator<RedBerry> ReB = redberry.iterator();
			while(ReB.hasNext()){
				RedBerry reb = ReB.next();
				PVector rbpos = reb.position;
				PVector bmpos = bm.position;
				float d = PVector.dist(rbpos, bmpos);
				if(bm.NstarvingLvl1() == true){
					if(d < bm.getR()){
						float food = 100;
						bm.eat(food);
						ReB.remove();
						bm.resetEating();
					}
				}
			}
			Iterator<YellowBerry> YeB = yellowberry.iterator();
			while(YeB.hasNext()){
				YellowBerry yeb = YeB.next();
				PVector ybpos = yeb.position;
				PVector bmpos = bm.position;
				float d = PVector.dist(ybpos, bmpos);
				if(bm.NstarvingLvl1() == true){
					if(d < bm.getR()){
						float food = 100;
						bm.eat(food);
						YeB.remove();
						bm.resetEating();
					}
				}
			}
			Iterator<Champi> Ch = champi.iterator();
			while(Ch.hasNext()){
				Champi ch = Ch.next();
				PVector chpos = ch.position;
				PVector bmpos = bm.position;
				float d = PVector.dist(chpos, bmpos);
				if(bm.NstarvingLvl1() == true){
					if(d < bm.getR()){
						float food = 100;
						bm.eat(food);
						Ch.remove();
						bm.resetEating();
					}
				}
			}
			Iterator<insect1M> i1M = insect1m.iterator();
			while(i1M.hasNext()){
				insect1M i1m = i1M.next();
				PVector i1mpos = i1m.position;
				PVector bmpos = bm.position;
				float d = PVector.dist(i1mpos, bmpos);
				if(bm.NstarvingLvl1() == true){
					if(d < bm.getR()){
						float food = 100;
						bm.eat(food);
						i1M.remove();
						bm.resetEating();
					}
				}
			}
			Iterator<PapillonB> PaB = papillonb.iterator();
			while(PaB.hasNext()){
				PapillonB pab = PaB.next();
				PVector pabpos = pab.position;
				PVector bmpos = bm.position;
				float d = PVector.dist(pabpos, bmpos);
				if(bm.NstarvingLvl1() == true){
					if(d < bm.getR()){
						float food = 100;
						bm.eat(food);
						PaB.remove();
						bm.resetEating();
					}
				}
			}
			Iterator<PapillonBchenille> PaBc = papillonbchenille.iterator();
			while(PaBc.hasNext()){
				PapillonBchenille pabc = PaBc.next();
				PVector pabcpos = pabc.position;
				PVector bmpos = bm.position;
				float d = PVector.dist(pabcpos, bmpos);
				if(bm.NstarvingLvl1() == true){
					if(d < bm.getR()){
						float food = 100;
						bm.eat(food);
						PaBc.remove();
						bm.resetEating();
					}
				}
			}
			Iterator<SourisM> SoM = sourism.iterator();
			while(SoM.hasNext()){
				SourisM som = SoM.next();
				PVector sompos = som.position;
				PVector bmpos = bm.position;
				float d = PVector.dist(sompos, bmpos);
				if(bm.NstarvingLvl2() == true){
					if(d < bm.getR()){
						float food = som.getWeight();
						bm.eat(food);
						SoM.remove();
						bm.resetEating();
					}
				}
			}
			Iterator<SourisF> SoF = sourisf.iterator();
			while(SoF.hasNext()){
				SourisF sof = SoF.next();
				PVector sofpos = sof.position;
				PVector bmpos = bm.position;
				float d = PVector.dist(sofpos, bmpos);
				if(bm.NstarvingLvl2() == true){
					if(d < bm.getR()){
						float food = sof.getWeight();
						bm.eat(food);
						SoF.remove();
						bm.resetEating();
					}
				}
			}
			Iterator<LapinM> LapM = lapinm.iterator();
			while(LapM.hasNext()){
				LapinM lapm = LapM.next();
				PVector lapmpos = lapm.position;
				PVector bmpos = bm.position;
				float d = PVector.dist(lapmpos, bmpos);
				if(bm.NstarvingLvl3() == true){
					if(d < bm.getR()){
						float food = lapm.getWeight();
						bm.eat(food);
						LapM.remove();
						bm.resetEating();
					}
				}
			}
			Iterator<LapinF> LapF = lapinf.iterator();
			while(LapF.hasNext()){
				LapinF lapf = LapF.next();
				PVector lapfpos = lapf.position;
				PVector bmpos = bm.position;
				float d = PVector.dist(lapfpos, bmpos);
				if(bm.NstarvingLvl3() == true){
					if(d < bm.getR()){
						float food = lapf.getWeight();
						bm.eat(food);
						LapF.remove();
						bm.resetEating();
					}
				}
			}
			/*
			Iterator<Meat> Me = meat.iterator();
			while(Me.hasNext()){
				Meat me = Me.next();
				PVector mepos = me.position;
				PVector bmpos = bm.position;
				float d = PVector.dist(mepos, bmpos);
				if(bm.NstarvingLvl1() == true){
					if(d < bm.getR()){
						float food = 1000;
						bm.eat(food);
						Me.remove();
						bm.resetEating();
					}
				}
			}
			*/
			Iterator<tileWater> TW = tilewater.iterator();
			while(TW.hasNext()){
				tileWater tw = TW.next();
				PVector bmpos = bm.position;
				PVector twpos = tw.position;
				float d = PVector.dist(twpos, bmpos);
				if(bm.soif() == true){
					if(d < bm.getR()){
						bm.drinkWater();
					}
				}
			}

		}
		//////////////////////////

		//////FEMALE//////////////
		while(bearf.size() < 1){
			for(int i = 0; i < totalbearf; i++){
				PVector l = new PVector();
				l.x = parent.random(worldW-(worldW-50) , worldW-50);
				l.y	= parent.random(worldH-(worldH-50) , worldH-50);
				DNAbear dnabear = new DNAbear(parent);
				bearf.add(new BearF(l,dnabear,parent));
			}
		}

		Iterator<BearF> BeF = bearf.iterator();
		while(BeF.hasNext()){
			BearF bef = BeF.next();
			bef.run(parent);
			bef.boundaries();
			
			if(bef.eatingTime() == false ){
				bef.mvtUpdate();
			}
			/*
			if(bef.dead() == true){
				BeF.remove();
				int randomMeat = (int) parent.random(5, 10);
				for(int a = 0; a < randomMeat; a++){
					PVector l = new PVector(parent.random(bef.position.x-20, bef.position.x+20), parent.random(bef.position.y-20, bef.position.y+20));
					meat.add(new Meat(parent,l));
				}
				int randomFurr = (int) parent.random(5, 15);
				for(int b = 0; b < randomMeat; b++){
					PVector l = new PVector(parent.random(bef.position.x-20, bef.position.x+20), parent.random(bef.position.y-20, bef.position.y+20));
					furr.add(new Furr(parent,l));
				}
			}
			*/
			Iterator<tileWater> tileW = tilewater.iterator();
			while(tileW.hasNext()){
				tileWater tilew = tileW.next();
				PVector target = new PVector(tilew.position.x, tilew.position.y);
				if(bef.isTooClose(target)){
					bef.goAway(target);
				}
			}
		}
		
		//////find water//////
		if(bearf.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = bearf.size()-1; a >=0; a--){
				BearF bf = bearf.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(bf.soif() == false){
					bf.wander(parent);
				}
				if(bf.soif() == true){
					for(int b = tilewater.size()-1 ; b >=0; b--){
						tileWater tw = tilewater.get(b);
						dist = ((bf.position.x - tw.position.x) * (bf.position.x - tw.position.x)) +
							   ((bf.position.y - tw.position.y) * (bf.position.y - tw.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = tw.position.x;
							target.y = tw.position.y;
						}
					}
					bf.findWater(target);
				}
			}
		}

		
		///////find food redberry///////// ////ajout des autres proie à faire
		if(bearf.size() > 0){
			float currentSmallest;
			float dist;
			for(int a = bearf.size()-1; a >=0; a--){
				BearF bf = bearf.get(a);
				
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(bf.NstarvingLvl1() == false || bf.NstarvingLvl2() == false || bf.NstarvingLvl3() == false){
					bf.wander(parent);
				}
				if(bf.NstarvingLvl1() == true){
					for(int b = redberry.size()-1; b >=0; b--){
						RedBerry rb = redberry.get(b);
						dist = ((bf.position.x - rb.position.x) * (bf.position.x - rb.position.x)) +
							   ((bf.position.y - rb.position.y) * (bf.position.y - rb.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = rb.position.x;
							target.y = rb.position.y;
						}
					}
					for(int c = yellowberry.size()-1; c >=0; c--){
						YellowBerry yb = yellowberry.get(c);
						dist = ((bf.position.x - yb.position.x) * (bf.position.x - yb.position.x)) +
							   ((bf.position.y - yb.position.y) * (bf.position.y - yb.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = yb.position.x;
							target.y = yb.position.y;
						}
					}
					for(int d = champi.size()-1; d >=0; d--){
						Champi ch = champi.get(d);
						dist = ((bf.position.x - ch.position.x) * (bf.position.x - ch.position.x)) +
							   ((bf.position.y - ch.position.y) * (bf.position.y - ch.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = ch.position.x;
							target.y = ch.position.y;
						}
					}
					for(int e = insect1m.size()-1; e >=0; e--){
						insect1M i1m = insect1m.get(e);
						dist = ((bf.position.x - i1m.position.x) * (bf.position.x - i1m.position.x)) +
							   ((bf.position.y - i1m.position.y) * (bf.position.y - i1m.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = i1m.position.x;
							target.y = i1m.position.y;
						}
					}
					for(int f = papillonb.size()-1 ; f >=0; f--){
						PapillonB pb = papillonb.get(f);
						dist = ((bf.position.x - pb.position.x) * (bf.position.x - pb.position.x)) +
							   ((bf.position.y - pb.position.y) * (bf.position.y - pb.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = pb.position.x;
							target.y = pb.position.y;
						}
					}
					for(int g = papillonbchenille.size()-1; g >=0; g--){
						PapillonBchenille pbc = papillonbchenille.get(g);
						dist = ((bf.position.x - pbc.position.x) * (bf.position.x - pbc.position.x)) +
							   ((bf.position.y - pbc.position.y) * (bf.position.y - pbc.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = pbc.position.x;
							target.y = pbc.position.y;
						}
					}
					/*
					for(int l = meat.size()-1; l >=0; l--){
						Meat me = meat.get(l);
						dist = ((bf.position.x - me.position.x) * (bf.position.x - me.position.x)) +
							   ((bf.position.y - me.position.y) * (bf.position.y - me.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = me.position.x;
							target.y = me.position.y;
						}
					}
					*/
					bf.findPray(target);
				}
				
				if(bf.NstarvingLvl2() == true){
					for(int h = sourism.size()-1; h >=0; h--){
						SourisM sm = sourism.get(h);
						dist = ((bf.position.x - sm.position.x) * (bf.position.x - sm.position.x)) +
							   ((bf.position.y - sm.position.y) * (bf.position.y - sm.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = sm.position.x;
							target.y = sm.position.y;
						}
					}
					for(int i = sourisf.size()-1; i >=0; i--){
						SourisF sf = sourisf.get(i);
						dist = ((bf.position.x - sf.position.x) * (bf.position.x - sf.position.x)) +
							   ((bf.position.y - sf.position.y) * (bf.position.y - sf.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = sf.position.x;
							target.y = sf.position.y;
						}
					}
					bf.findPray(target);
				}
				
				if(bf.NstarvingLvl3() == true){
					for(int j = lapinm.size()-1; j >=0; j--){
						LapinM lm = lapinm.get(j);
						dist = ((bf.position.x - lm.position.x) * (bf.position.x - lm.position.x)) +
							   ((bf.position.y - lm.position.y) * (bf.position.y - lm.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = lm.position.x;
							target.y = lm.position.y;
						}
					}
					for(int k = lapinf.size()-1; k >=0; k--){
						LapinF lf = lapinf.get(k);
						dist = ((bf.position.x - lf.position.x) * (bf.position.x - lf.position.x)) +
							   ((bf.position.y - lf.position.y) * (bf.position.y - lf.position.y));
						if( dist < currentSmallest ){
							currentSmallest = dist;
							target.x = lf.position.x;
							target.y = lf.position.y;
						}
					}
					bf.findPray(target);
				}
			}
		}
		/////////////////////////
		
		////////eat redberry////////
		Iterator<BearF> Bf = bearf.iterator();
		while(Bf.hasNext()){
			BearF bf = Bf.next();
			Iterator<RedBerry> ReB = redberry.iterator();
			while(ReB.hasNext()){
				RedBerry reb = ReB.next();
				PVector rbpos = reb.position;
				PVector bfpos = bf.position;
				float d = PVector.dist(rbpos, bfpos);
				if(bf.NstarvingLvl1() == true){
					if(d < bf.getR()){
						float food = 100;
						bf.eat(food);
						ReB.remove();
						bf.resetEating();
					}
				}
			}
			Iterator<YellowBerry> YeB = yellowberry.iterator();
			while(YeB.hasNext()){
				YellowBerry yeb = YeB.next();
				PVector ybpos = yeb.position;
				PVector bfpos = bf.position;
				float d = PVector.dist(ybpos, bfpos);
				if(bf.NstarvingLvl1() == true){
					if(d < bf.getR()){
						float food = 100;
						bf.eat(food);
						YeB.remove();
						bf.resetEating();
					}
				}
			}
			Iterator<Champi> Ch = champi.iterator();
			while(Ch.hasNext()){
				Champi ch = Ch.next();
				PVector chpos = ch.position;
				PVector bfpos = bf.position;
				float d = PVector.dist(chpos, bfpos);
				if(bf.NstarvingLvl1() == true){
					if(d < bf.getR()){
						float food = 100;
						bf.eat(food);
						Ch.remove();
						bf.resetEating();
					}
				}
			}
			Iterator<insect1M> i1M = insect1m.iterator();
			while(i1M.hasNext()){
				insect1M i1m = i1M.next();
				PVector i1mpos = i1m.position;
				PVector bfpos = bf.position;
				float d = PVector.dist(i1mpos, bfpos);
				if(bf.NstarvingLvl1() == true){
					if(d < bf.getR()){
						float food = 100;
						bf.eat(food);
						i1M.remove();
						bf.resetEating();
					}
				}
			}
			Iterator<PapillonB> PaB = papillonb.iterator();
			while(PaB.hasNext()){
				PapillonB pab = PaB.next();
				PVector pabpos = pab.position;
				PVector bfpos = bf.position;
				float d = PVector.dist(pabpos, bfpos);
				if(bf.NstarvingLvl1() == true){
					if(d < bf.getR()){
						float food = 100;
						bf.eat(food);
						PaB.remove();
						bf.resetEating();
					}
				}
			}
			Iterator<PapillonBchenille> PaBc = papillonbchenille.iterator();
			while(PaBc.hasNext()){
				PapillonBchenille pabc = PaBc.next();
				PVector pabcpos = pabc.position;
				PVector bfpos = bf.position;
				float d = PVector.dist(pabcpos, bfpos);
				if(bf.NstarvingLvl1() == true){
					if(d < bf.getR()){
						float food = 100;
						bf.eat(food);
						PaBc.remove();
						bf.resetEating();
					}
				}
			}
			Iterator<SourisM> SoM = sourism.iterator();
			while(SoM.hasNext()){
				SourisM som = SoM.next();
				PVector sompos = som.position;
				PVector bfpos = bf.position;
				float d = PVector.dist(sompos, bfpos);
				if(bf.NstarvingLvl2() == true){
					if(d < bf.getR()){
						float food = som.getWeight();
						bf.eat(food);
						SoM.remove();
						bf.resetEating();
					}
				}
			}
			Iterator<SourisF> SoF = sourisf.iterator();
			while(SoF.hasNext()){
				SourisF sof = SoF.next();
				PVector sofpos = sof.position;
				PVector bfpos = bf.position;
				float d = PVector.dist(sofpos, bfpos);
				if(bf.NstarvingLvl2() == true){
					if(d < bf.getR()){
						float food = sof.getWeight();
						bf.eat(food);
						SoF.remove();
						bf.resetEating();
					}
				}
			}
			Iterator<LapinM> LapM = lapinm.iterator();
			while(LapM.hasNext()){
				LapinM lapm = LapM.next();
				PVector lapmpos = lapm.position;
				PVector bfpos = bf.position;
				float d = PVector.dist(lapmpos, bfpos);
				if(bf.NstarvingLvl3() == true){
					if(d < bf.getR()){
						float food = lapm.getWeight();
						bf.eat(food);
						LapM.remove();
						bf.resetEating();
					}
				}
			}
			Iterator<LapinF> LapF = lapinf.iterator();
			while(LapF.hasNext()){
				LapinF lapf = LapF.next();
				PVector lapfpos = lapf.position;
				PVector bfpos = bf.position;
				float d = PVector.dist(lapfpos, bfpos);
				if(bf.NstarvingLvl3() == true){
					if(d < bf.getR()){
						float food = lapf.getWeight();
						bf.eat(food);
						LapF.remove();
						bf.resetEating();
					}
				}
			}
			/*
			Iterator<Meat> Me = meat.iterator();
			while(Me.hasNext()){
				Meat me = Me.next();
				PVector mepos = me.position;
				PVector bfpos = bf.position;
				float d = PVector.dist(mepos, bfpos);
				if(bf.NstarvingLvl1() == true){
					if(d < bf.getR()){
						float food = 1000;
						bf.eat(food);
						Me.remove();
						bf.resetEating();
					}
				}
			}
			*/
			Iterator<tileWater> TW = tilewater.iterator();
			while(TW.hasNext()){
				tileWater tw = TW.next();
				PVector bfpos = bf.position;
				PVector twpos = tw.position;
				float d = PVector.dist(twpos, bfpos);
				if(bf.soif() == true){
					if(d < bf.getR()){
						bf.drinkWater();
					}
				}
			}

		}
		//////////////////////////

		//////find female///////
		if(bearf.size() >= 1){
			float currentSmallest;
			float dist;
			for(int a = bearm.size()-1; a >=0; a--){
				BearM bm = bearm.get(a);
				PVector target = new PVector(0,0);
				currentSmallest = (worldH * worldH) + (worldW * worldW);
				if(bm.reproduceTime() == false){
					bm.wander(parent);
				}
				if(bm.reproduceTime() == true){
					if(bearm.size() < 5 || bearf.size() < 5){
						for(int b = bearf.size()-1; b >= 0; b--){
							BearF bf = bearf.get(b);
							dist = ((bm.position.x - bf.position.x) * (bm.position.x - bf.position.x)) +
								   ((bm.position.y - bf.position.y) * (bm.position.y - bf.position.y));
							if( dist < currentSmallest){
								currentSmallest = dist;
								target.x = bf.position.x;
								target.y = bf.position.y;
							}
						}
						bm.findFemale(target);
					}
				}
			}
		}
		
		/////reproduction///////
		for(int a = bearm.size()-1; a >= 0; a--){
			for(int b = bearf.size()-1; b >= 0; b--){
				BearM bm = bearm.get(a);
				BearF bf = bearf.get(b);
				PVector bmpos = bm.position;
				PVector bfpos = bf.position;
				float d = PVector.dist(bmpos, bfpos);
				if(d < bf.getR() && bf.reproduceTime() == true){  /////a changer juste pour test
					DNAbear momgenes = bm.getDNAbear();
					DNAbear dadgenes = bf.getDNAbear();
					DNAbear childdna = momgenes.crossover(dadgenes, parent);
					if(parent.random(10) > 5 && bearm.size() < 5){
						bearm.add(new BearM(bfpos, childdna, parent));
						bf.resetReproduce();
						bm.resetReproduce();
					}
					if(parent.random(10) < 5 && bearf.size() < 5){
						bearf.add(new BearF(bfpos, childdna, parent));
						bf.resetReproduce();
						bm.resetReproduce();
					}
				}
			}
		}
		//////////////////////////


	}
	
	
	
	public void run(){
		
		/////////test meat juste pour bien les voir////
		Iterator<Meat> MT = meat.iterator();
		while(MT.hasNext()){
			Meat mt = MT.next();
			mt.growOld();
			if(mt.rotten()){
				MT.remove();
			}
		}
		
		Iterator<Furr> FR = furr.iterator();
		while(FR.hasNext()){
			Furr fr = FR.next();
			fr.growOld();
			if(fr.rotten()){
				FR.remove();
			}
		}
		///////////////////////////////////////////////
		
		/////////player2 TEST///////////
		while(player2.size() < 1){
			int totalplayer2 = 1;
			for(int i = 0; i < totalplayer2; i++){
				PVector l = new PVector(worldW/2,worldH/2);
				player2.add(new Player2(l,parent));
			}
		}
		///////////IngameClock/////////////////////
		while(ingameclock.size() < 1){
			int totalclock = 1;
			for(int a = 0; a < totalclock; a++){
				ingameclock.add(new InGameClock(parent));
			}
		}
		///////////Inventory///////////////////////
		while(inventory.size() < 1){
			int totalinv = 1;
			for(int a = 0; a < totalinv; a++){
				inventory.add(new Inventory(parent));
			}
		}
		//////////crafting//////////////////////////
		while(crafting.size() < 1){
			int totalcraft = 1;
			for(int a = 0; a < totalcraft; a++){
				crafting.add(new Crafting(parent));
			}
		}
		
		
	}
	
	public void displayAll(){
		
		parent.background(0,0,0);
		
		
			
			Iterator<Player2> Pla2 = player2.iterator();
			while(Pla2.hasNext()){
				Player2 pla2 = Pla2.next();
				PVector view = PVector.lerp(pla2.position, pla2.position, (float) 0.0);
				parent.translate(parent.width/2, parent.height/2);
				parent.translate(-view.x, -view.y);
			}

		
		
		
		
		
		parent.noFill();
		Iterator<Player2> Pl2 = player2.iterator();
		while(Pl2.hasNext()){
			Player2 pl2 = Pl2.next();
			
			pl2.PlayerMvt(parent);
			pl2.update();
			pl2.updateCarac();
		}
		
		
		
		/////SOL///////////
		Iterator<tileDirt> TD = tiledirt.iterator();
		while(TD.hasNext()){
			tileDirt td = TD.next();
			td.display(parent);
		}
		Iterator<tileGrassD> TGD = tilegrassd.iterator();
		while(TGD.hasNext()){
			tileGrassD tgd = TGD.next();
			tgd.display(parent);
		}
		Iterator<tileGrassL> TGL = tilegrassl.iterator();
		while(TGL.hasNext()){
			tileGrassL tgl = TGL.next();
			tgl.display(parent);
		}
		Iterator<tileWater> TW = tilewater.iterator();
		while(TW.hasNext()){
			tileWater tw = TW.next();
			tw.display(parent);
		}
		Iterator<Tuile> T = tuile.iterator();
		while(T.hasNext()){
			Tuile t = T.next();
			t.display(parent);
		}
		////////////////////////
		
		
		/////NID//////////////
		Iterator<SourisNid> SN = sourisnid.iterator();
		while(SN.hasNext()){
			SourisNid sn = SN.next();
			sn.display(parent);
		}
		Iterator<LapinNid> LN = lapinnid.iterator();
		while(LN.hasNext()){
			LapinNid ln = LN.next();
			ln.display(parent);
		}
		Iterator<FuretNid> FN = furetnid.iterator();
		while(FN.hasNext()){
			FuretNid fn = FN.next();
			fn.display(parent);
		}
		Iterator<FoxNid> FoN = foxnid.iterator();
		while(FoN.hasNext()){
			FoxNid fon = FoN.next();
			fon.display(parent);
		}
		Iterator<BlaireauNid> BN = blaireaunid.iterator();
		while(BN.hasNext()){
			BlaireauNid bn = BN.next();
			bn.display(parent);
		}
		Iterator<WolfNid> WN = wolfnid.iterator();
		while(WN.hasNext()){
			WolfNid wn = WN.next();
			wn.display(parent);
		}
		Iterator<BearNid> BeN = bearnid.iterator();
		while(BeN.hasNext()){
			BearNid ben = BeN.next();
			ben.display(parent);
		}
		/////////////////////
		
		///////INSECT////////
		Iterator<insect1M> I1M = insect1m.iterator();
		while(I1M.hasNext()){
			insect1M i1m = I1M.next();
			i1m.display();
		}
		/////////////////////
		
		//////FRUIT ET MEAT//////////
		Iterator<RedBerry> RB = redberry.iterator();
		while(RB.hasNext()){
			RedBerry rb = RB.next();
			rb.display(parent);
			rb.growOld(rb);
			if(rb.rotten()){
				RB.remove();
			}
		}
		Iterator<YellowBerry> YB = yellowberry.iterator();
		while(YB.hasNext()){
			YellowBerry yb = YB.next();
			yb.display(parent);
			yb.growOld(yb);
			if(yb.rotten()){
				YB.remove();
			}
		}
		Iterator<Meat> MT = meat.iterator();
		while(MT.hasNext()){
			Meat mt = MT.next();
			mt.display(parent);
		}
		/////////////////////
		
		////BRANCH///////////
		Iterator<Branch> BRA = branch.iterator();
		while(BRA.hasNext()){
			Branch bra = BRA.next();
			bra.display(parent);
		}
		/////////////////////
		
		//////smallBranch/////
		Iterator<smallBranch> SBRA = smallbranch.iterator();
		while(SBRA.hasNext()){
			smallBranch sbra = SBRA.next();
			sbra.display(parent);
		}
		//////////////////////
		
		Iterator<Furr> FU = furr.iterator();
		while(FU.hasNext()){
			Furr fu = FU.next();
			fu.display(parent);
		}
		Iterator<Log> LG = log.iterator();
		while(LG.hasNext()){
			Log lg = LG.next();
			lg.display(parent);
		}
		Iterator<vegetalString> VST = vegetalstring.iterator();
		while(VST.hasNext()){
			vegetalString vst = VST.next();
			vst.display(parent);
		}
		Iterator<Souche> SC = souche.iterator();
		while(SC.hasNext()){
			Souche sc = SC.next();
			sc.display(parent);
		}
		
		///////PETIT ANIMAUX/////
		Iterator<SourisM> SM = sourism.iterator();
		while(SM.hasNext()){
			SourisM sm = SM.next();
			sm.display(parent);
		}
		Iterator<SourisF> SF = sourisf.iterator();
		while(SF.hasNext()){
			SourisF sf = SF.next();
			sf.display(parent);
		}
		Iterator<LapinM> LM = lapinm.iterator();
		while(LM.hasNext()){
			LapinM lm = LM.next();
			lm.display(parent);
		}
		Iterator<LapinF> LF = lapinf.iterator();
		while(LF.hasNext()){
			LapinF lf = LF.next();
			lf.display(parent);
		}
		Iterator<EcureuilM> EM = ecureuilm.iterator();
		while(EM.hasNext()){
			EcureuilM em = EM.next();
			em.display(parent);
		}
		Iterator<EcureuilF> EF = ecureuilf.iterator();
		while(EF.hasNext()){
			EcureuilF ef = EF.next();
			ef.display(parent);
		}
		Iterator<FuretM> FM = furetm.iterator();
		while(FM.hasNext()){
			FuretM fm = FM.next();
			fm.display(parent);
		}
		Iterator<FuretF> FF = furetf.iterator();
		while(FF.hasNext()){
			FuretF ff = FF.next();
			ff.display(parent);
		}
		Iterator<VoleM> VM = volem.iterator();
		while(VM.hasNext()){
			VoleM vm = VM.next();
			vm.display(parent);
		}
		Iterator<VoleF> VF = volef.iterator();
		while(VF.hasNext()){
			VoleF vf = VF.next();
			vf.display(parent);
		}
		
		
		
		//////////////////////////////////
		
		///////DECOR PETIT///////
		Iterator<Champi> C = champi.iterator();
		while(C.hasNext()){
			Champi c = C.next();
			c.display(parent);
		}
		Iterator<Flower> FL = flower.iterator();
		while(FL.hasNext()){
			Flower fl = FL.next();
			fl.display(parent);
		}
		Iterator<Rock> R = rock.iterator();
		while(R.hasNext()){
			Rock r = R.next();
			r.display(parent);
		}
		Iterator<GrassFeuillu> GF = grassfeuillu.iterator();
		while(GF.hasNext()){
			GrassFeuillu gf = GF.next();
			gf.display(parent);
		}
		
		Iterator<FireCampLvl1> Fire1 = firecamplvl1.iterator();
		while(Fire1.hasNext()){
			FireCampLvl1 fire1 = Fire1.next();
				fire1.display(parent);
				fire1.checkFire();
		}
		
		Iterator<WoodStocklvl0> WS0 = woodStocklvl0.iterator();
		while(WS0.hasNext()){
			WoodStocklvl0 ws0 = WS0.next();
				ws0.display(parent);
		}
		
		Iterator<TentLvl0> T0 = tentlvl0.iterator();
		while(T0.hasNext()){
			TentLvl0 t0 = T0.next();
				t0.display(parent);
		}
		
		Iterator<Stocklvl0> St0 = stocklvl0.iterator();
		while(St0.hasNext()){
			Stocklvl0 st0 = St0.next();
				st0.display(parent);
		}
		
		Iterator<Colet> Co = colet.iterator();
		while(Co.hasNext()){
			Colet co = Co.next();
				co.display(parent);
		}
		
		Iterator<Bedlvl0> B0 = bedlvl0.iterator();
		while(B0.hasNext()){
			Bedlvl0 b0 = B0.next();
				b0.display(parent);
		}
		
		/////////////////////////
		
		////////ANIMAYX MOYEN/////
		Iterator<FoxM> FoM = foxm.iterator();
		while(FoM.hasNext()){
			FoxM fom = FoM.next();
			fom.display(parent);
		}
		Iterator<FoxF> FoF = foxf.iterator();
		while(FoF.hasNext()){
			FoxF fof = FoF.next();
			fof.display(parent);
		}
		Iterator<BlaireauM> BLM = blaireaum.iterator();
		while(BLM.hasNext()){
			BlaireauM blm = BLM.next();
			blm.display(parent);
		}
		Iterator<BlaireauF> BLF = blaireauf.iterator();
		while(BLF.hasNext()){
			BlaireauF blf = BLF.next();
			blf.display(parent);
		}
		//////////////////////////
		
		////////DECOR MOYEN/////////////
		Iterator<Buisson> B = buisson.iterator();
		while(B.hasNext()){
			Buisson b = B.next();
			b.display(parent);
		}
		Iterator<PapillonBegg> PBE = papillonbegg.iterator();
		while(PBE.hasNext()){
			PapillonBegg pbe = PBE.next();
			pbe.display();
		}
		Iterator<PapillonBchenille> PBC = papillonbchenille.iterator();
		while(PBC.hasNext()){
			PapillonBchenille pbc = PBC.next();
			pbc.display();
		}
		Iterator<BuissonFruitJaune> BJ = buissonfruitjaune.iterator();
		while(BJ.hasNext()){
			BuissonFruitJaune bj = BJ.next();
			bj.display(parent);
		}
		Iterator<BuissonFruitRouge> BR = buissonfruitrouge.iterator();
		while(BR.hasNext()){
			BuissonFruitRouge br = BR.next();
			br.display(parent);
		}
		//////////////////////////////////
		
		////////PLAYER///////
		///MOUSE
		Iterator<Player2> P2 = player2.iterator();
		while(P2.hasNext()){
			Player2 p2 = P2.next();
			float mouseWx = p2.position.x - parent.width/2 + parent.mouseX;//position exacte pour le world
		    float mouseWy = p2.position.y - parent.height/2 + parent.mouseY;//position exacte pour le world
			PVector MP = new PVector(mouseWx,mouseWy);
			p2.display(parent,MP);
			//parent.noCursor();
			//parent.fill(0);
			//parent.noStroke();
			//parent.ellipse(mouseWx, mouseWy, 5, 5);
			//parent.noFill();
		}
		/////////////////////////
		
		///////GRAND ANIMAUX//////////////
		Iterator<BoarM> BoM = boarm.iterator();
		while(BoM.hasNext()){
			BoarM bom = BoM.next();
			bom.display(parent);
		}
		Iterator<BoarF> BoF = boarf.iterator();
		while(BoF.hasNext()){
			BoarF bof = BoF.next();
			bof.display(parent);
		}
		Iterator<WolfM> WM = wolfm.iterator();
		while(WM.hasNext()){
			WolfM wm = WM.next();
			wm.display(parent);
		}
		Iterator<WolfF> WF = wolff.iterator();
		while(WF.hasNext()){
			WolfF wf = WF.next();
			wf.display(parent);
		}
		Iterator<BearM> BeM = bearm.iterator();
		while(BeM.hasNext()){
			BearM bem = BeM.next();
			bem.display(parent);
		}
		Iterator<BearF> BeF = bearf.iterator();
		while(BeF.hasNext()){
			BearF bef = BeF.next();
			bef.display(parent);
		}
		Iterator<DeerM> DeM = deerm.iterator();
		while(DeM.hasNext()){
			DeerM dem = DeM.next();
			dem.display(parent);
		}
		Iterator<DeerF> DeF = deerf.iterator();
		while(DeF.hasNext()){
			DeerF def = DeF.next();
			def.display(parent);
		}
		
		
		//////////////////////////////////
		
		///////papillon/////////
		Iterator<PapillonB> PB = papillonb.iterator();
		while(PB.hasNext()){
			PapillonB pb = PB.next();
			pb.display(parent);
		}
		////////////////////////
		
		///////ARBRES/////////
		Iterator<FruitTree> FT = fruittree.iterator();
		while(FT.hasNext()){
			FruitTree ft = FT.next();
			ft.display(parent);
		}
		Iterator<Feuillu> F = feuillu.iterator();
		while(F.hasNext()){
			Feuillu f = F.next();
			f.display(parent);
		}
		//////////////////////
		
		
	}
	
		
	public void GUIAdmin(){
		///////GUI TEST///////
		Iterator<Player2> Player2 = player2.iterator();
		while(Player2.hasNext()){
			Player2 p2 = Player2.next();
			parent.fill(255,0,0);
			float sW = parent.width / 2;
			float sH = parent.height / 2;
			PVector screen = new PVector(sW,sH);
			
			parent.text("fps " + parent.frameRate, p2.position.x - sW +10 , p2.position.y -sH +20);
			
			
			
			
			//parent.text("redberry " + redberry.size(), p2.position.x - sW +10 , p2.position.y -sH +30);
			
			//parent.text("tilegrassl " + tilegrassl.size(), p2.position.x - sW +10 , p2.position.y -sH +40);
			//parent.text("tilegrassd " + tilegrassd.size(), p2.position.x - sW +10 , p2.position.y -sH +50);
			//parent.text("tilewater " + tilewater.size(), p2.position.x - sW +10 , p2.position.y -sH +60);
			
			//parent.text("papillonB " + papillonb.size(), p2.position.x - sW +10 , p2.position.y -sH +70);
			//parent.text("papillonB egg " + papillonbegg.size(), p2.position.x - sW +10 , p2.position.y -sH +80);
			//parent.text("papillonB chenille " + papillonbchenille.size(), p2.position.x - sW +10 , p2.position.y -sH +90);
			
			//parent.text("insect " + insect1m.size(), p2.position.x - sW +10 , p2.position.y -sH +100);
			
			parent.text("sourisM " + sourism.size(), p2.position.x - sW +10 , p2.position.y -sH +110);
			parent.text("sourisF " + sourisf.size(), p2.position.x - sW +10 , p2.position.y -sH +120);
			
			parent.text("lapinM " + lapinm.size(), p2.position.x - sW +10 , p2.position.y -sH +130);
			parent.text("lapinF " + lapinf.size(), p2.position.x - sW +10 , p2.position.y -sH +140);	
			
			//parent.text("ecureuil nid " + ecureuilnid.size(), p2.position.x - sW +10 , p2.position.y -sH +150);
			parent.text("ecureuilM " + ecureuilm.size(), p2.position.x - sW +10 , p2.position.y -sH +160);
			parent.text("ecureuilF " + ecureuilf.size(), p2.position.x - sW +10 , p2.position.y -sH +170);
			
			//parent.text("furet nid " + furetnid.size(), p2.position.x - sW +10 , p2.position.y -sH +180);
			parent.text("furetM " + furetm.size(), p2.position.x - sW +10 , p2.position.y -sH +190);
			parent.text("furetF " + furetf.size(), p2.position.x - sW +10 , p2.position.y -sH +200);
			
			//parent.text("blaireau nid " + blaireaunid.size(), p2.position.x - sW +10 , p2.position.y -sH +210);
			parent.text("blaireauM " + blaireaum.size(), p2.position.x - sW +10 , p2.position.y -sH +220);
			parent.text("blaireauF " + blaireauf.size(), p2.position.x - sW +10 , p2.position.y -sH +230);
			
			//parent.text("wolf nid " + wolfnid.size(), p2.position.x - sW +10 , p2.position.y -sH +240);
			parent.text("wolfM " + wolfm.size(), p2.position.x - sW +10 , p2.position.y -sH +250);
			parent.text("wolfF " + wolff.size(), p2.position.x - sW +10 , p2.position.y -sH +260);
			
			parent.text("boarM " + boarm.size(), p2.position.x - sW +10 , p2.position.y -sH +270);
			parent.text("boarF " + boarf.size(), p2.position.x - sW +10 , p2.position.y -sH +280);
			
			//parent.text("fox nid " + foxnid.size(), p2.position.x - sW +10 , p2.position.y -sH +290);
			parent.text("foxM " + foxm.size(), p2.position.x - sW +10 , p2.position.y -sH +300);
			parent.text("foxF " + foxf.size(), p2.position.x - sW +10 , p2.position.y -sH +310);
			
			parent.text("bearM " + bearm.size(), p2.position.x - sW +10 , p2.position.y -sH +320);
			parent.text("bearF " + bearf.size(), p2.position.x - sW +10 , p2.position.y -sH +330);
			
			parent.text("MEAT " + meat.size(), p2.position.x - sW +10 , p2.position.y -sH +340);
			
			//parent.text("resChampi " + resChampi, p2.position.x - sW +10 , p2.position.y -sH +370);
			//parent.text("resGrass " + resGrass, p2.position.x - sW +10 , p2.position.y -sH +380);
			
			//parent.text("champi " + champi.size(), p2.position.x - sW +10 , p2.position.y -sH +390);
			//parent.text("flower " + flower.size(), p2.position.x - sW +10 , p2.position.y -sH +400);
			//parent.text("grass " + grassfeuillu.size(), p2.position.x - sW +10 , p2.position.y -sH +410);
			
			//parent.text("tree " + feuillu.size(), p2.position.x - sW +10 , p2.position.y -sH +420);
			
			
			parent.noFill();
			parent.noStroke();
			
			
			
			////IngameClock/////////
			Iterator<InGameClock> IGC = ingameclock.iterator();
			while(IGC.hasNext()){
				InGameClock igc = IGC.next();
				parent.textSize(15);
				parent.fill(0);
				igc.clocktick();
				//parent.text("Real Time " + igc.getTime(), p2.position.x - sW + sW-50 , p2.position.y -sH +20);
				parent.text(igc.hour + " hours", p2.position.x - sW + sW-50 , p2.position.y -sH +30);
				parent.text(igc.getday() + " day", p2.position.x - sW + sW-50 , p2.position.y -sH +50);
				parent.text(igc.time + " time", p2.position.x - sW + sW-50 , p2.position.y -sH +90);
				if(igc.newDay() == true){
					parent.text("a new day start", p2.position.x - sW + sW-50 , p2.position.y -sH +70);
				}
				parent.textSize(12);
				
				Iterator <Bedlvl0> BED = bedlvl0.iterator();
				while(BED.hasNext()){
					Bedlvl0 bed = BED.next();
					if(bed.sleep8h == true){
						
						parent.fill(255,0,0);
						parent.ellipse(p2.position.x + screen.x -314 , p2.position.y +screen.y -186, 50, 50);
						parent.noFill();
						
						igc.startingTime += 8;  
						
						bed.sleep8h = false;
					}
				}
			}
			
			///////inventory////////
			Iterator<Inventory> Inv = inventory.iterator();
			while(Inv.hasNext()){
				Inventory inv = Inv.next();
				PVector P2 = p2.position;
				
				float mouseWx = p2.position.x - parent.width/2 + parent.mouseX;//position exacte pour le world
			    float mouseWy = p2.position.y - parent.height/2 + parent.mouseY;//position exacte pour le world
				PVector MP = new PVector(mouseWx,mouseWy);
				
				parent.noFill(); //ou sinon bug graphic pour le raccourcis 1 donc il manque un nofill quelquepart
				
				inv.invDisplay(parent, P2, screen);
				inv.invCrafting(parent, P2, screen);
				inv.update();
				inv.pressI();
				inv.pressE();
				inv.pressC();
				//racourcis
				inv.press1();
				inv.press2();
				inv.press3();
				
				inv.rightClick(); //actionRM deviens false en restant appuyer sur LMB
				inv.leftClick();  //idem
				inv.checkActionRM();
				inv.checkActionLM();
				inv.blockLMCount();
				inv.blockRMCount();
				
				//drag and drop
				inv.dragLeft();
				
				//cutTree
				inv.cutTree(); //le boolean rest true tant que reste appuié
				
				//spearAttack
				inv.spearAttack();
				
				if(inv.rightClickTime() == true){
					parent.text("true " , p2.position.x - sW +10 , p2.position.y -sH +400);
				}
				
				//1
				Iterator<Champi> Champ = champi.iterator();
				while(Champ.hasNext()){
					Champi ch = Champ.next();
					float dist = PVector.dist(ch.position, p2.position);
					if(dist < 32){
						if(inv.actionE){
							Champ.remove(); 
							inv.addMushroom();
						}
					}
					
					PVector invSlot1 = new PVector(P2.x + screen.x -346 , P2.y +screen.y -344);
					float distMouseInvSlot1 = PVector.dist(invSlot1, MP);
					if(distMouseInvSlot1 < 16 && inv.inventoryOpen){
						if(inv.leftClickTime() == true && inv.invMushroom > 0){
							inv.invMushroom -=1;
							p2.eatMushroom();
							inv.resetLeftClickTime();
						}
					}
				}
				//drop
				for(int a = champi.size()-1; a >= 0; a--){
					int index = (int) (parent.random(0,Imgchampignons.length));
					PVector l = new PVector(p2.position.x +20, p2.position.y);
					PVector invSlot1 = new PVector(P2.x + screen.x -346 , P2.y +screen.y -345);
					float distMouseInvSlot1 = PVector.dist(invSlot1, MP);
					if(distMouseInvSlot1 < 16 && inv.inventoryOpen){
						if(inv.invMushroom >0){
							if(inv.rightClickTime() == true){
								inv.dropMushroom();
								inv.invMushroom -=1;
								champi.add(new Champi(Imgchampignons[index],parent,l));
								inv.resetRightClickTime();
							}
						}
					}
				}
				//2
				Iterator<RedBerry> Redberry = redberry.iterator();
				while(Redberry.hasNext()){
					RedBerry rb = Redberry.next();
					float dist = PVector.dist(rb.position, p2.position);
					if(dist < 32){
						if(inv.actionE){
							Redberry.remove();
							inv.addRedBerry();
						}
					}
					PVector invSlot2 = new PVector(P2.x + screen.x -314 , P2.y +screen.y -345);
					float distMouseInvSlot2 = PVector.dist(invSlot2, MP);
					if(distMouseInvSlot2 < 16 && inv.inventoryOpen){
						if(inv.leftClickTime() == true && inv.invRedBerry > 0){
							inv.invRedBerry -=1;
							//p2.eatRedBerry();
							p2.food += 20;
							inv.resetLeftClickTime();
						}
					}
				}
				//drop
				for(int b = redberry.size()-1; b >= 0; b--){
					int index = (int) (parent.random(0,ImgRedBerry.length));
					PVector l = new PVector(p2.position.x +20, p2.position.y);
					PVector invSlot2 = new PVector(P2.x + screen.x -314 , P2.y +screen.y -345);
					float distMouseInvSlot2 = PVector.dist(invSlot2, MP);
					if(distMouseInvSlot2 < 16 && inv.inventoryOpen){
						if(inv.invRedBerry >0){
							if(inv.rightClickTime() == true){
								inv.dropRedBerry();
								inv.invRedBerry -=1;
								redberry.add(new RedBerry(ImgRedBerry[index],parent,l));
								inv.resetRightClickTime();
							}
						}
					}
				}
				//3
				Iterator<GrassFeuillu> grassFeuillu = grassfeuillu.iterator();
				while(grassFeuillu.hasNext()){
					GrassFeuillu grass = grassFeuillu.next();
					float dist = PVector.dist(grass.position, p2.position);
					if(dist < 32){
						if(inv.actionE){
							grassFeuillu.remove();
							inv.addGrass();
						}
					}
					PVector invSlot3 = new PVector(P2.x + screen.x -282 , P2.y +screen.y -345);
					//pas d'utilisation pour l'instant
				}
				//drop
				for(int c = grassfeuillu.size()-1; c >= 0; c--){
					int index = (int) (parent.random(0,ImgGrassFeuillu.length));
					PVector l = new PVector(p2.position.x +20, p2.position.y);
					PVector invSlot3 = new PVector(P2.x + screen.x -282 , P2.y +screen.y -345);
					float distMouseInvSlot3 = PVector.dist(invSlot3, MP);
					if(distMouseInvSlot3 < 16 && inv.inventoryOpen){
						if(inv.invGrass >0){
							if(inv.rightClickTime() == true){
								inv.dropGrass();
								inv.invGrass -=1;
								grassfeuillu.add(new GrassFeuillu(ImgGrassFeuillu[index],parent,l));
								inv.resetRightClickTime();
							}
						}
					}
				}
				//4
				Iterator<Rock> ROck = rock.iterator();
				while(ROck.hasNext()){
					Rock rock = ROck.next();
					float dist = PVector.dist(rock.position, p2.position);
					if(dist < 32){
						if(inv.actionE){
							ROck.remove();
							inv.addRock();
						}
					}
					PVector invSlot4 = new PVector(P2.x + screen.x -250 , P2.y +screen.y -345);
					//pas d'utilisation pour l'instant
				}
				//drop
				for(int d = rock.size()-1; d >= 0; d--){
					int index = (int) (parent.random(0,ImgRock.length));
					PVector l = new PVector(p2.position.x +20, p2.position.y);
					PVector invSlot4 = new PVector(P2.x + screen.x -250 , P2.y +screen.y -345);
					float distMouseInvSlot4 = PVector.dist(invSlot4, MP);
					if(distMouseInvSlot4 < 16 && inv.inventoryOpen){
						if(inv.invRock >0){
							if(inv.rightClickTime() == true){
								inv.dropRock();
								inv.invRock -=1;
								rock.add(new Rock(ImgRock[index],parent,l));
								inv.resetRightClickTime();
							}
						}
					}
				}
				//5
				Iterator<YellowBerry> Yellowberry = yellowberry.iterator();
				while(Yellowberry.hasNext()){
					YellowBerry yb = Yellowberry.next();
					float dist = PVector.dist(yb.position, p2.position);
					if(dist < 32){
						if(inv.actionE){
							Yellowberry.remove();
							inv.addYellowBerry(); //////
						}
					}
					PVector invSlot5 = new PVector(P2.x + screen.x -218 , P2.y +screen.y -345);
					float distMouseInvSlot5 = PVector.dist(invSlot5, MP);
					if(distMouseInvSlot5 < 16 && inv.inventoryOpen){
						if(inv.leftClickTime() && inv.invJellowBerry >0 ){
							inv.invJellowBerry -= 1;
							p2.eatYellowBerry();
							inv.resetLeftClickTime();
						}
					}
				}
				//drop
				for(int e = yellowberry.size()-1; e >= 0; e--){
					//RedBerry rb = redberry.get(a);
					int index = (int) (parent.random(0,ImgYellowBerry.length));
					PVector l = new PVector(p2.position.x +20, p2.position.y);
					PVector invSlot5 = new PVector(P2.x + screen.x -218 , P2.y +screen.y -345);
					float distMouseInvSlot5 = PVector.dist(invSlot5, MP);
					if(distMouseInvSlot5 < 16 && inv.inventoryOpen){
						if(inv.invJellowBerry >0){
							
							if(inv.rightClickTime() == true){
								inv.dropYellowBerry();
								inv.invJellowBerry -=1;
								yellowberry.add(new YellowBerry(ImgYellowBerry[index],parent,l));
								inv.resetRightClickTime();
							}
						}
					}
				}
				//6
				Iterator<Branch> BRanch = branch.iterator();
				while(BRanch.hasNext()){
					Branch br = BRanch.next();
					float dist = PVector.dist(br.position, p2.position);
					if(dist < 32){
						if(inv.actionE){
							BRanch.remove();
							inv.addBranch(); //////
						}
					}
					PVector invSlot6 = new PVector(P2.x + screen.x -186 , P2.y +screen.y -345);
					float distMouseInvSlot6 = PVector.dist(invSlot6, MP);
					if(distMouseInvSlot6 < 16 && inv.inventoryOpen){
						if(inv.invBranch >0){
							
						}
					}
				}
				//drop
				for(int f = branch.size()-1; f >= 0; f--){
					//RedBerry rb = redberry.get(a);
					//int index = (int) (parent.random(0,ImgYellowBerry.length));
					PVector l = new PVector(p2.position.x +20, p2.position.y);
					PVector invSlot6 = new PVector(P2.x + screen.x -186 , P2.y +screen.y -345);
					float distMouseInvSlot6 = PVector.dist(invSlot6, MP);
					if(distMouseInvSlot6 < 16 && inv.inventoryOpen){
						if(inv.invBranch >0){
							
							if(inv.rightClickTime() == true){
								inv.dropBranch();
								inv.invBranch -=1;
								branch.add(new Branch(parent, l));
								inv.resetRightClickTime();
							}
						}
					}
				}
				//7
				Iterator<smallBranch> smallBRanch = smallbranch.iterator();
				while(smallBRanch.hasNext()){
					smallBranch sbr = smallBRanch.next();
					float dist = PVector.dist(sbr.position, p2.position);
					if(dist < 32){
						if(inv.actionE){
							smallBRanch.remove();
							inv.addSmallBranch(); //////
						}
					}
					PVector invSlot7 = new PVector(P2.x + screen.x -154 , P2.y +screen.y -345);
					float distMouseInvSlot7 = PVector.dist(invSlot7, MP);
					if(distMouseInvSlot7 < 16 && inv.inventoryOpen){
						if(inv.invSmallBranch >0){
							
						}
					}
				}
				//drop
				for(int g = smallbranch.size()-1; g >= 0; g--){
					PVector l = new PVector(p2.position.x +20, p2.position.y);
					PVector invSlot7 = new PVector(P2.x + screen.x -154 , P2.y +screen.y -345);
					float distMouseInvSlot7 = PVector.dist(invSlot7, MP);
					if(distMouseInvSlot7 < 16 && inv.inventoryOpen){
						if(inv.invSmallBranch >0){
							
							if(inv.rightClickTime() == true){
								inv.dropSmallBranch();
								inv.invSmallBranch -=1;
								smallbranch.add(new smallBranch(parent, l));
								inv.resetRightClickTime();
							}
						}
					}
				}
				//8
				Iterator<Furr> fur = furr.iterator();
				while(fur.hasNext()){
					Furr FU = fur.next();
					float dist = PVector.dist(FU.position, p2.position);
					if(dist < 32){
						if(inv.actionE){
							fur.remove();
							inv.addFurr(); //////
						}
					}
					PVector invSlot8 = new PVector(P2.x + screen.x -122 , P2.y +screen.y -345);
					float distMouseInvSlot8 = PVector.dist(invSlot8, MP);
					if(distMouseInvSlot8 < 16 && inv.inventoryOpen){
						if(inv.invFurr >0){
							
						}
					}
				}
				//drop
				for(int h = furr.size()-1; h >= 0; h--){
					PVector l = new PVector(p2.position.x +20, p2.position.y);
					PVector invSlot8 = new PVector(P2.x + screen.x -122 , P2.y +screen.y -345);
					float distMouseInvSlot8 = PVector.dist(invSlot8, MP);
					if(distMouseInvSlot8 < 16 && inv.inventoryOpen){
						if(inv.invFurr >0){
							
							if(inv.rightClickTime() == true){
								inv.dropSmallBranch();
								inv.invFurr -=1;
								furr.add(new Furr(parent, l));
								inv.resetRightClickTime();
							}
						}
					}
				}
				//9
				Iterator<Meat> Meat = meat.iterator();
				while(Meat.hasNext()){
					Meat M = Meat.next();
					float dist = PVector.dist(M.position, p2.position);
					if(dist < 32){
						if(inv.actionE){
							Meat.remove();
							inv.addMeat();
						}
					}
					PVector invSlot9 = new PVector(P2.x + screen.x -90 , P2.y +screen.y -284);
					float distMouseInvSlot9 = PVector.dist(invSlot9, MP);
					if(distMouseInvSlot9 < 16 && inv.inventoryOpen){
						parent.fill(0);
						parent.ellipse(P2.x + screen.x -90 , P2.y +screen.y -284, 16, 16);
						parent.noFill();
						if(inv.invMeat >0){
							inv.eatMeat();
						}
					}
				}
				//drop
				for(int i = meat.size()-1; i >= 0; i--){
					PVector l = new PVector(p2.position.x +20, p2.position.y);
					PVector invSlot9 = new PVector(P2.x + screen.x -90 , P2.y +screen.y -345);
					float distMouseInvSlot9 = PVector.dist(invSlot9, MP);
					if(distMouseInvSlot9 < 16 && inv.inventoryOpen){
						if(inv.invMeat >0){
							
							if(inv.rightClickTime() == true){
								inv.dropMeat();
								inv.invMeat -=1;
								meat.add(new Meat(parent, l));
								inv.resetRightClickTime();
							}
						}
					}
				}
				//10
				
				//drop
				
				
				//11 
				
				//drop
				
				
				//12 
				
				//drop
				
				
				//13 fire 
				//drop
				
				for(int m = firecamplvl1.size()-1; m >= 0; m--){
					PVector l = new PVector(p2.position.x, p2.position.y -32);
					PVector invSlot13 = new PVector(P2.x + screen.x -282 , P2.y +screen.y -218);
					float distMouseInvSlot13 = PVector.dist(invSlot13, MP);
					if(distMouseInvSlot13 < 16 && inv.inventoryOpen){
						if(inv.invFire > 0){
							if(inv.rightClickTime() == true){
								inv.invFire -=1;
								firecamplvl1.add(new FireCampLvl1(parent, l));
								inv.resetRightClickTime();
							}
						}
					}
				}
				
				//light the fire
				Iterator<FireCampLvl1> Fire1 = firecamplvl1.iterator();
				while(Fire1.hasNext()){
					FireCampLvl1 fire1 = Fire1.next();
					PVector firePos = new PVector(fire1.position.x,fire1.position.y);
					float distPlayerFire = PVector.dist(firePos, P2);
					float distMouseFire = PVector.dist(firePos, MP);
					if(inv.invRock >= 2 && distPlayerFire < 50 && distMouseFire < 20){
						if(inv.cutTree && fire1.fuel >= 0){
							fire1.lit = true;
						}
					}
				}
				

				//21 tentlvl0 U
				
				//drop
				for(int u = tentlvl0.size()-1; u >= 0; u--){
					PVector l = new PVector(p2.position.x, p2.position.y -32);
					PVector invSlot21 = new PVector(P2.x + screen.x -346 , P2.y +screen.y -186);
					float distMouseInvSlot21 = PVector.dist(invSlot21, MP);
					if(distMouseInvSlot21 < 16 && inv.inventoryOpen){
						if(inv.invTent > 0){
							if(inv.rightClickTime() == true){
								inv.invTent -=1;
								tentlvl0.add(new TentLvl0(parent, l));
								inv.resetRightClickTime();
							}
						}
					}
				}
				
				//sleep
				
				

				//22 bedlvl0 V
				
				//drop
				for(int v = bedlvl0.size()-1; v >= 0; v--){
					PVector l = new PVector(p2.position.x, p2.position.y -32);
					PVector invSlot22 = new PVector(P2.x + screen.x -314 , P2.y +screen.y -186);
					float distMouseInvSlot22 = PVector.dist(invSlot22, MP);
					if(distMouseInvSlot22 < 16 && inv.inventoryOpen){
						if(inv.invBed > 0){
							if(inv.rightClickTime() == true){
								inv.invBed -=1;
								bedlvl0.add(new Bedlvl0(parent, l));
								inv.resetRightClickTime();
							}
						}
					}
				}
				
				//sleep 
				Iterator<Bedlvl0> Bed = bedlvl0.iterator();
				while(Bed.hasNext()){
					Bedlvl0 bed = Bed.next();
					PVector bedPos = new PVector(bed.position.x,bed.position.y);
					float distPlayerBed = PVector.dist(bedPos, P2);
					float distMouseBed = PVector.dist(bedPos, MP);
					if(distPlayerBed < 50 && distMouseBed < 50){
						
						
						if(inv.rightClickTime() == true){
							bed.sleep8h = true;
							inv.resetRightClickTime();
						}
						if(bed.sleep8h == true){
							//parent.fill(255,0,0);
							//parent.ellipse(P2.x + screen.x -314 , P2.y +screen.y -186, 50, 50);
							//parent.noFill();
						}
						
					}
				}
				
				
				
				//23 stocklvl0 W
				
				//drop
				for(int w = stocklvl0.size()-1; w >= 0; w--){
					PVector l = new PVector(p2.position.x, p2.position.y -32);
					PVector invSlot23 = new PVector(P2.x + screen.x -282 , P2.y +screen.y -186);
					float distMouseInvSlot23 = PVector.dist(invSlot23, MP);
					if(distMouseInvSlot23 < 16 && inv.inventoryOpen){
						if(inv.invStock > 0){
							if(inv.rightClickTime() == true){
								inv.invStock -=1;
								stocklvl0.add(new Stocklvl0(parent, l));
								inv.resetRightClickTime();
							}
						}
					}
				}
				//24 woodstocklvl0 X
				
				//drop
				for(int w = woodStocklvl0.size()-1; w >= 0; w--){
					PVector l = new PVector(p2.position.x, p2.position.y -32);
					PVector invSlot24 = new PVector(P2.x + screen.x -250 , P2.y +screen.y -186);
					float distMouseInvSlot24 = PVector.dist(invSlot24, MP);
					if(distMouseInvSlot24 < 16 && inv.inventoryOpen){
						if(inv.invWoodStock > 0){
							if(inv.rightClickTime() == true){
								inv.invWoodStock -=1;
								woodStocklvl0.add(new WoodStocklvl0(parent, l));
								inv.resetRightClickTime();
							}
						}
					}
				}



				
				//////crafting option////
				PVector craftSlot1 = new PVector(P2.x + screen.x -345 , P2.y +screen.y -345);
				float distMouseCraftSlot1 = PVector.dist(craftSlot1, MP);
				if(distMouseCraftSlot1 < 16 && inv.craftingOpen){
					//parent.fill(0);
					//parent.ellipse(P2.x + screen.x -537 , P2.y +screen.y -345, 16, 16);
					//parent.noFill();
					if(inv.leftClickTime() == true){
						inv.craftSlot = 1;
						inv.resetLeftClickTime();
					}
				}
				PVector craftSlot2 = new PVector(P2.x + screen.x -313 , P2.y +screen.y -345);
				float distMouseCraftSlot2 = PVector.dist(craftSlot2, MP);
				if(distMouseCraftSlot2 < 16 && inv.craftingOpen){
					if(inv.leftClickTime() == true){
						inv.craftSlot = 2;
						inv.resetLeftClickTime();
					}
				}
				PVector craftSlot3 = new PVector(P2.x + screen.x -281 , P2.y +screen.y -345);
				float distMouseCraftSlot3 = PVector.dist(craftSlot3, MP);
				if(distMouseCraftSlot3 < 16 && inv.craftingOpen){
					if(inv.leftClickTime() == true){
						inv.craftSlot = 3;
						inv.resetLeftClickTime();
					}
				}
				PVector craftSlot4 = new PVector(P2.x + screen.x -249 , P2.y +screen.y -345);
				float distMouseCraftSlot4 = PVector.dist(craftSlot4, MP);
				if(distMouseCraftSlot4 < 16 && inv.craftingOpen){
					if(inv.leftClickTime() == true){
						inv.craftSlot = 4;
						inv.resetLeftClickTime();
					}
				}
				PVector craftSlot5 = new PVector(P2.x + screen.x -217 , P2.y +screen.y -345);
				float distMouseCraftSlot5 = PVector.dist(craftSlot5, MP);
				if(distMouseCraftSlot5 < 16 && inv.craftingOpen){
					if(inv.leftClickTime() == true){
						inv.craftSlot = 5;
						inv.resetLeftClickTime();
					}
				}
				PVector craftSlot6 = new PVector(P2.x + screen.x -185 , P2.y +screen.y -345);
				float distMouseCraftSlot6 = PVector.dist(craftSlot6, MP);
				if(distMouseCraftSlot6 < 16 && inv.craftingOpen){
					if(inv.leftClickTime() == true){
						inv.craftSlot = 6;
						inv.resetLeftClickTime();
					}
				}
				PVector craftSlot7 = new PVector(P2.x + screen.x -153 , P2.y +screen.y -345);
				float distMouseCraftSlot7 = PVector.dist(craftSlot7, MP);
				if(distMouseCraftSlot7 < 16 && inv.craftingOpen){
					if(inv.leftClickTime() == true){
						inv.craftSlot = 7;
						inv.resetLeftClickTime();
					}
				}
				PVector craftSlot8 = new PVector(P2.x + screen.x -121 , P2.y +screen.y -345);
				float distMouseCraftSlot8 = PVector.dist(craftSlot8, MP);
				if(distMouseCraftSlot8 < 16 && inv.craftingOpen){
					if(inv.leftClickTime() == true){
						inv.craftSlot = 8;
						inv.resetLeftClickTime();
					}
				}
				PVector craftSlot9 = new PVector(P2.x + screen.x -89 , P2.y +screen.y -345);
				float distMouseCraftSlot9 = PVector.dist(craftSlot9, MP);
				if(distMouseCraftSlot9 < 16 && inv.craftingOpen){
					if(inv.leftClickTime() == true){
						inv.craftSlot = 9;
						inv.resetLeftClickTime();
					}
				}
				PVector craftSlot10 = new PVector(P2.x + screen.x -57 , P2.y +screen.y -345);
				float distMouseCraftSlot10 = PVector.dist(craftSlot10, MP);
				if(distMouseCraftSlot10 < 16 && inv.craftingOpen){
					if(inv.leftClickTime() == true){
						inv.craftSlot = 10;
						inv.resetLeftClickTime();
					}
				}
				PVector craftSlot11 = new PVector(P2.x + screen.x -345 , P2.y +screen.y -312);
				float distMouseCraftSlot11 = PVector.dist(craftSlot11, MP);
				if(distMouseCraftSlot11 < 16 && inv.craftingOpen){
					if(inv.leftClickTime() == true){
						inv.craftSlot = 11;
						inv.resetLeftClickTime();
					}
				}
				PVector craftSlot12 = new PVector(P2.x + screen.x -313 , P2.y +screen.y -312);
				float distMouseCraftSlot12 = PVector.dist(craftSlot12, MP);
				if(distMouseCraftSlot12 < 16 && inv.craftingOpen){
					if(inv.leftClickTime() == true){
						inv.craftSlot = 12;
						inv.resetLeftClickTime();
					}
				}
				PVector craftSlot13 = new PVector(P2.x + screen.x -281 , P2.y +screen.y -312);
				float distMouseCraftSlot13 = PVector.dist(craftSlot13, MP);
				if(distMouseCraftSlot13 < 16 && inv.craftingOpen){
					if(inv.leftClickTime() == true){
						inv.craftSlot = 13;
						inv.resetLeftClickTime();
					}
				}
				PVector craftSlot14 = new PVector(P2.x + screen.x -249 , P2.y +screen.y -312);
				float distMouseCraftSlot14 = PVector.dist(craftSlot14, MP);
				if(distMouseCraftSlot14 < 16 && inv.craftingOpen){
					if(inv.leftClickTime() == true){
						inv.craftSlot = 14;
						inv.resetLeftClickTime();
					}
				}
				PVector craftSlot15 = new PVector(P2.x + screen.x -217 , P2.y +screen.y -312);
				float distMouseCraftSlot15 = PVector.dist(craftSlot15, MP);
				if(distMouseCraftSlot15 < 16 && inv.craftingOpen){
					if(inv.leftClickTime() == true){
						inv.craftSlot = 15;
						inv.resetLeftClickTime();
					}
				}
				PVector craftSlot16 = new PVector(P2.x + screen.x -185 , P2.y +screen.y -312);
				float distMouseCraftSlot16 = PVector.dist(craftSlot16, MP);
				if(distMouseCraftSlot16 < 16 && inv.craftingOpen){
					if(inv.leftClickTime() == true){
						inv.craftSlot = 16;
						inv.resetLeftClickTime();
					}
				}
				PVector craftSlot17 = new PVector(P2.x + screen.x -153 , P2.y +screen.y -312);
				float distMouseCraftSlot17 = PVector.dist(craftSlot17, MP);
				if(distMouseCraftSlot17 < 16 && inv.craftingOpen){
					if(inv.leftClickTime() == true){
						inv.craftSlot = 17;
						inv.resetLeftClickTime();
					}
				}
				
				
				
				//actual crafting//
				//test fct
				PVector craft = new PVector(P2.x + screen.x -409 , P2.y +screen.y -345);
				float distMouseCraft = PVector.dist(craft, MP);
				//craft string slot1
				if(distMouseCraft < 16 && inv.craftingOpen && inv.craftSlot == 1){
					if(inv.leftClickTime() == true && inv.invGrass >= 5){
						inv.invGrass -= 5;
						inv.invString += 1;
						inv.resetLeftClickTime();
					}
				}
				//craft axe slot2
				if(distMouseCraft < 16 && inv.craftingOpen && inv.craftSlot == 2){
				if(inv.leftClickTime() == true && inv.invBranch >= 1 && inv.invRock >= 1 && inv.invString >= 1){
						inv.invBranch -=1;
						inv.invRock -=1;
						inv.invString -=1;
						inv.invStoneAxe +=1;
						inv.resetLeftClickTime();
					}
				}
				//craft firecamp slot3
				if(distMouseCraft < 16 && inv.craftingOpen && inv.craftSlot == 3){
					if(inv.leftClickTime() == true && inv.invBranch >= 10 ){
						inv.invBranch -=10;
						inv.invFire +=1;
						inv.resetLeftClickTime();
					}
				}
				
				
				// craft spear slot4
				if(distMouseCraft < 16 && inv.craftingOpen && inv.craftSlot == 4){
					if(inv.leftClickTime() == true && inv.invBranch >= 1 && inv.invRock >= 1 && inv.invString >= 1){
						inv.invBranch -=1;
						inv.invRock -=1;
						inv.invString -=1;
						inv.invStoneKnife +=1;
						inv.resetLeftClickTime();
					}
				}
				//craft knife slot5
				if(distMouseCraft < 16 && inv.craftingOpen && inv.craftSlot == 5){
					if(inv.leftClickTime() == true && inv.invBranch >= 1 && inv.invRock >= 1 && inv.invString >= 1){
						inv.invBranch -=1;
						inv.invRock -=1;
						inv.invString -=1;
						inv.invStoneLance +=1;
						inv.resetLeftClickTime();
					}
				}
				//craft arrow slot6
				if(distMouseCraft < 16 && inv.craftingOpen && inv.craftSlot == 6){
					if(inv.leftClickTime() == true && inv.invBranch >= 1 && inv.invRock >= 1 && inv.invString >= 1){
						inv.invBranch -=1;
						inv.invRock -=1;
						inv.invString -=1;
						inv.invArrow +=1;
						inv.resetLeftClickTime();
					}
				}
				//craft bow slot7
				if(distMouseCraft < 16 && inv.craftingOpen && inv.craftSlot == 7){
					if(inv.leftClickTime() == true && inv.invStick >= 1 &&  inv.invString >= 1){
						inv.invStick -=1;
						inv.invString -=1;
						inv.invArrow +=1;
						inv.resetLeftClickTime();
					}
				}
				//craft stick slot8
				if(distMouseCraft < 16 && inv.craftingOpen && inv.craftSlot == 8){
					if(inv.leftClickTime() == true && inv.invBranch >= 1 &&  inv.invStoneKnife >= 1){
						inv.invBranch -=1;
						inv.invStick +=1;
						inv.resetLeftClickTime();
					}
				}
				//craft Pointystick slot9
				if(distMouseCraft < 16 && inv.craftingOpen && inv.craftSlot == 9){
					if(inv.leftClickTime() == true && inv.invStick >= 1 &&  inv.invStoneKnife >= 1){
						inv.invStick -=1;
						inv.invPointyStick +=1;
						inv.resetLeftClickTime();
					}
				}
				//craft coockedMeat slot10 //a modif pour inclure la dist joueur firecamp
				if(distMouseCraft < 16 && inv.craftingOpen && inv.craftSlot == 10){
					if(inv.leftClickTime() == true && inv.invMeat >= 1 ){
						inv.invMeat -=1;
						inv.invCookedMeat +=1;
						inv.resetLeftClickTime();
					}
				}
				//craft tentlvl0 slot11 
				if(distMouseCraft < 16 && inv.craftingOpen && inv.craftSlot == 11){
					if(inv.leftClickTime() == true && inv.invStick >= 4 && inv.invBranch >= 10 ){
						inv.invBranch -=10;
						inv.invStick -=4;
						inv.invTent +=1;
						inv.resetLeftClickTime();
					}
				}
				//craft woodstocklvl0 slot12 
				if(distMouseCraft < 16 && inv.craftingOpen && inv.craftSlot == 12){
					if(inv.leftClickTime() == true && inv.invStick >= 4 ){
						inv.invStick -=4;
						inv.invWoodStock +=1;
						inv.resetLeftClickTime();
					}
				}
				//craft colet slot13 
				if(distMouseCraft < 16 && inv.craftingOpen && inv.craftSlot == 13){
					if(inv.leftClickTime() == true && inv.invPointyStick >= 1 && inv.invRope >= 1){
						inv.invPointyStick -=1;
						inv.invRope -=1;
						inv.invColet +=1;
						inv.resetLeftClickTime();
					}
				}
				//craft traplvl0 slot14 
				if(distMouseCraft < 16 && inv.craftingOpen && inv.craftSlot == 14){
					if(inv.leftClickTime() == true && inv.invPointyStick >= 8 ){
						inv.invPointyStick -=8;
						inv.invTrap +=1;
						inv.resetLeftClickTime();
					}
				}
				//craft welllvl0 slot15
				if(distMouseCraft < 16 && inv.craftingOpen && inv.craftSlot == 15){
					if(inv.leftClickTime() == true  ){
						//inv.invPointyStick -=8;
						//inv.invTrap +=1;
						inv.resetLeftClickTime();
					}
				}
				//craft rope slot16 
				if(distMouseCraft < 16 && inv.craftingOpen && inv.craftSlot == 16){
					if(inv.leftClickTime() == true && inv.invGrass >= 10 ){
						inv.invGrass -=10;
						inv.invRope +=1;
						inv.resetLeftClickTime();
					}
				}
				//craft bedlvl0 slot17 
				if(distMouseCraft < 16 && inv.craftingOpen && inv.craftSlot == 17){
					if(inv.leftClickTime() == true && inv.invGrass >= 10 ){
						inv.invGrass -=10;
						inv.invBed +=1;
						inv.resetLeftClickTime();
					}
				}
				
				//dragdrop sur la derniere ligne d'inventaire
				
				//test position
				//parent.ellipseMode(PConstants.CENTER);
				//pos slot 12
				//parent.ellipse(P2.x + screen.x -314 , P2.y +screen.y -312, 16, 16);
				//pos hand 1
				//parent.ellipse(P2.x + screen.x -346 , P2.y +screen.y -56, 16, 16);
				PVector slot12 = new PVector(P2.x + screen.x -314 , P2.y +screen.y -216);
				PVector slot14 = new PVector(P2.x + screen.x -250 , P2.y +screen.y -216);
				PVector slot15 = new PVector(P2.x + screen.x -218 , P2.y +screen.y -216);
				PVector hand1 = new PVector(P2.x + screen.x -346 , P2.y +screen.y -56);
				PVector hand2 = new PVector(P2.x + screen.x -314 , P2.y +screen.y -56);
				PVector hand3 = new PVector(P2.x + screen.x -282 , P2.y +screen.y -56);
				float distMpSlot12 = PVector.dist(MP,slot12);
				float distMpSlot14 = PVector.dist(MP,slot14);
				float distMpSlot15 = PVector.dist(MP,slot15);
				float distMpHand1 = PVector.dist(MP, hand1);
				float distMpHand2 = PVector.dist(MP, hand2);
				float distMpHand3 = PVector.dist(MP, hand3);
				if(inv.inventoryOpen){
					//test dragdrop hache basicdragdrop 2
					//FCT PARFAIT
					//hand1
					//step1
					if(distMpSlot12 < 10 && inv.locked == false && inv.invStoneAxe > 0){
						inv.distInvSlot12 = true;
					}
					//step2
					if(inv.distInvSlot12 == true && inv.dragLeft == true){
						float dragPosX = MP.x;
						float dragPosY = MP.y;
						PVector dragPos1 = new PVector(dragPosX,dragPosY);
						inv.objectDragAxe(parent,dragPos1);
						inv.inHand1 = true;
					}
					//step3
					if(distMpHand1 < 10){
						inv.distHandSlot1 = true;
					}
					if(distMpHand1 > 10){
						inv.distHandSlot1 = false;
					}
					//step4
					if(inv.inHand1 == true){
						if(inv.distHandSlot1 == true){
							inv.canDrop1 = true;
						}
						else{
							inv.canDrop1 = false;
						}
					}
					//step5
					if(inv.canDrop1 == true){
						inv.axeInHand(parent, hand1);
						inv.shortCut1Full = true;
					}
					/////////////////////////////////////
					/////////////////////////////////////
					
					//hand2
					//step1
					if(distMpSlot14 < 10 && inv.locked == false && inv.invStoneKnife > 0){
						inv.distInvSlot14 = true;
					}
					//step2
					if(inv.distInvSlot14 == true && inv.dragLeft == true){
						float dragPosX = MP.x;
						float dragPosY = MP.y;
						PVector dragPos2 = new PVector(dragPosX,dragPosY);
						inv.objectDragKnife(parent,dragPos2);
						inv.inHand2 = true;
					}
					//step3
					if(distMpHand2 < 10){
						inv.distHandSlot2 = true;
					}
					if(distMpHand2 > 10){
						inv.distHandSlot2 = false;
					}
					//step4
					if(inv.inHand2 == true){
						if(inv.distHandSlot2 == true){
							inv.canDrop2 = true;
						}
						else{
							inv.canDrop2 = false;
						}
					}
					//step5
					if(inv.canDrop2 == true){
						inv.knifeInHand(parent, hand2);
						inv.shortCut2Full = true;
					}
					/////////////////////////////////////
					/////////////////////////////////////
					
					//hand3
					//step1
					if(distMpSlot15 < 10 && inv.locked == false && inv.invStoneLance > 0){
						inv.distInvSlot15 = true;
					}
					//step2
					if(inv.distInvSlot15 == true && inv.dragLeft == true){
						float dragPosX = MP.x;
						float dragPosY = MP.y;
						PVector dragPos3 = new PVector(dragPosX,dragPosY);
						inv.objectDragSpear(parent,dragPos3);
						inv.inHand3 = true;
					}
					//step3
					if(distMpHand3 < 10){
						inv.distHandSlot3 = true;
					}
					if(distMpHand3 > 10){
						inv.distHandSlot3 = false;
					}
					//step4
					if(inv.inHand3 == true){
						if(inv.distHandSlot3 == true){
							inv.canDrop3 = true;
						}
						else{
							inv.canDrop3 = false;
						}
					}
					//step5
					if(inv.canDrop3 == true){
						inv.spearInHand(parent, hand3);
						inv.shortCut3Full = true;
					}
					/////////////////////////////////////
					/////////////////////////////////////
					
					
				}
				
				//les if pour changer le skin du perso en fct du racourcis
				if(inv.shortCut1 == true && inv.shortCut1Full == true){
					p2.axeInHand = true;
					
				}
				if(inv.shortCut1 == false || inv.shortCut1Full == false){
					p2.axeInHand = false;
				}
				
				if(inv.shortCut2 == true && inv.shortCut2Full == true){
					p2.knifeInHand = true;
				}
				if(inv.shortCut2 == false || inv.shortCut2Full == false){
					p2.knifeInHand = false;
				}
				
				if(inv.shortCut3 == true && inv.shortCut3Full == true){
					p2.spearInHand = true;
				}
				if(inv.shortCut3 == false || inv.shortCut3Full == false){
					p2.spearInHand = false;
				}
				
				//les if pour ne pas avoir 2 objet en main
				if(p2.axeInHand){
					p2.knifeInHand = false;
					p2.spearInHand = false;
				}
				if(p2.knifeInHand){
					p2.axeInHand = false;
					p2.spearInHand = false;
				}
				if(p2.spearInHand){
					p2.knifeInHand = false;
					p2.axeInHand = false;
				}
				
				
				//test check mouvement pour changement de skin

				
				
				
				//cut tree with axe
				Iterator<Feuillu> Tree = feuillu.iterator();
				while(Tree.hasNext()){
					Feuillu tree = Tree.next();
					PVector treePos = new PVector(tree.position.x,tree.position.y);
					float distPlayerTree = PVector.dist(treePos, P2);
					float distMouseTree = PVector.dist(treePos, MP);
					/*
					if(p2.axeInHand && distPlayerTree < 50 && distMouseTree < 20){
						if(inv.cutTree == true ){
							tree.PV --;
							p2.chop = true;
						}
						if(inv.cutTree == false){
							p2.chop = false;
						}
					}
					*/
					if(p2.axeInHand && inv.cutTree == true){
						if(distPlayerTree < 50 && distMouseTree < 20){
							tree.PV --;
							p2.chop = true;
						}
						
					}
					if(p2.axeInHand && inv.cutTree == false){
						p2.chop = false;
					}
				}
				
				Iterator<BoarF> Boarf = boarf.iterator();
				while(Boarf.hasNext()){
					BoarF boarf = Boarf.next();
					PVector bfpos = new PVector(boarf.position.x,boarf.position.y);
					float distPlayerBf = PVector.dist(bfpos, P2);
					float distMouseBf = PVector.dist(bfpos, MP);
					if(p2.spearInHand && distPlayerBf < 50 && distMouseBf < 20){
						if(inv.spearAttack){
							boarf.health -= 50;
						}
					}
				}
				
				
				Iterator<BoarM> Boarm = boarm.iterator();
				while(Boarm.hasNext()){
					BoarM boarm = Boarm.next();
					PVector bmpos = new PVector(boarm.position.x,boarm.position.y);
					float distPlayerBm = PVector.dist(bmpos, P2);
					float distMouseBm = PVector.dist(bmpos, MP);
					if(p2.spearInHand && distPlayerBm < 50 && distMouseBm < 20){
						if(inv.spearAttack){
							boarm.health -= 50;
						}
					}
				}
				
				
				
			}
			
			
			//les barres (vie ect...)
			PVector P2 = p2.position;
			p2.displayBar(P2, screen);

			
			//test interaction souris
			float mouseWx = p2.position.x - parent.width/2 + parent.mouseX;//position exacte pour le world
		    float mouseWy = p2.position.y - parent.height/2 + parent.mouseY;//position exacte pour le world
			PVector MP = new PVector(mouseWx,mouseWy);
			
			
			///MOUSE
			Iterator<Player2> Pl2 = player2.iterator();
			while(Pl2.hasNext()){
				Player2 pl2 = Pl2.next();
				float MouseWx = pl2.position.x - parent.width/2 + parent.mouseX;//position exacte pour le world
			    float MouseWy = pl2.position.y - parent.height/2 + parent.mouseY;//position exacte pour le world
				//PVector MoP = new PVector(mouseWx,mouseWy);
				//p2.display(parent,MP);
				parent.noCursor();
				parent.fill(0);
				parent.noStroke();
				parent.ellipse(MouseWx, MouseWy, 8, 8);
				//parent.text("x " + (MouseWx) + "y " + (MouseWy), MouseWx, MouseWy);
				parent.noFill();
			}
			
			
			
			
		}
		
		//////////////////////
	}
	
	
	
	
}
