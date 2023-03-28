package view;

import java.awt.Image;

import javax.swing.ImageIcon;

/*
 * This class provides static references to any images used within 
 * the front-end package. This prevents repetitive "new ImageIcon" 
 * constructors.
 * */
public class ImageImports {
	
	//Home Page Images
	protected static Image img_customer = new ImageIcon(HomePage.class.getResource("/res/custmrYellow.png")).getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
	protected static Image frameLogo = new ImageIcon(HomePage.class.getResource("/res/swLogo.png")).getImage();
	protected static Image imgTitle = new ImageIcon(HomePage.class.getResource("/res/ssvyTitle.png")).getImage();
	protected static Image imgEating = new ImageIcon(HomePage.class.getResource("/res/eating.png")).getImage().getScaledInstance(250,250, Image.SCALE_SMOOTH);

	//Food Icons for Ordering Page
	protected static Image imgBread = new ImageIcon(HomePage.class.getResource("/res/bread.png")).getImage();
	protected static Image imgProt = new ImageIcon(HomePage.class.getResource("/res/protein.png")).getImage();
	protected static Image imgVegi = new ImageIcon(HomePage.class.getResource("/res/vegi.png")).getImage();
	protected static Image imgSauces = new ImageIcon(HomePage.class.getResource("/res/sauces.png")).getImage();
	protected static Image imgCheeses = new ImageIcon(HomePage.class.getResource("/res/cheese.png")).getImage();
	
	//Image imports
	protected static Image img_restr = new ImageIcon(HomePage.class.getResource("/res/restrRed.png")).getImage().getScaledInstance(250, 210, Image.SCALE_SMOOTH);
	protected static Image img_key = new ImageIcon(HomePage.class.getResource("/res/key.png")).getImage().getScaledInstance(35,35, Image.SCALE_SMOOTH);
	protected static Image img_user = new ImageIcon(HomePage.class.getResource("/res/person.png")).getImage().getScaledInstance(35,  35,  Image.SCALE_SMOOTH);
	protected static Image img_re = new ImageIcon(HomePage.class.getResource("/res/re.png")).getImage().getScaledInstance(35,35, Image.SCALE_SMOOTH);
	
	// MESC image imports
	protected static Image imgBack = new ImageIcon(HomePage.class.getResource("/res/backIcon.png")).getImage();
	protected static Image imgNext = new ImageIcon(HomePage.class.getResource("/res/next.png")).getImage();
	protected static Image imgCart = new ImageIcon(HomePage.class.getResource("/res/addToCart.png")).getImage();

	// Rating Star Images
	protected static Image imgBlackStar = new ImageIcon(HomePage.class.getResource("/res/blackStar.png")).getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
	protected static Image imgOrangeStar = new ImageIcon(HomePage.class.getResource("/res/orangeStar.png")).getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
	protected static Image imgTickMark = new ImageIcon(HomePage.class.getResource("/res/tickMark.png")).getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
	protected static Image imgCrossMark = new ImageIcon(HomePage.class.getResource("/res/crossMark.png")).getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
	
	//Dietary Icons
	protected static Image imgHalal = new ImageIcon(HomePage.class.getResource("/res/halal.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	protected static Image imgVeg = new ImageIcon(HomePage.class.getResource("/res/vegan.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	protected static Image imgKosher = new ImageIcon(HomePage.class.getResource("/res/kosher.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);

	//Diet Legend
	protected static Image imgHLegend = new ImageIcon(HomePage.class.getResource("/res/halalLegend.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	protected static Image imgKLegend = new ImageIcon(HomePage.class.getResource("/res/kosherLegend.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	protected static Image imgVLegend = new ImageIcon(HomePage.class.getResource("/res/veganLegend.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);

	
}
