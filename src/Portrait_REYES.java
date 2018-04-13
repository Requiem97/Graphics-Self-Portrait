import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.geom.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Portrait_REYES extends Frame {
	@Override
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		GeneralPath hair = new GeneralPath();
		hair.moveTo(219, 404);
		hair.lineTo(209, 316);
		hair.lineTo(214, 293);
		hair.lineTo(215, 292);
		hair.lineTo(215, 252);
		hair.lineTo(217, 231);
		hair.curveTo(236, 198, 309, 171, 395, 176);
		hair.curveTo(407, 177, 420, 188, 430, 199);
		hair.quadTo(447, 210, 464, 199);
		hair.lineTo(466, 227);
		hair.lineTo(486, 263);
		hair.lineTo(484, 268);
		hair.lineTo(496, 288);
		hair.lineTo(499, 380);
		hair.lineTo(508, 356);
		hair.lineTo(508, 333);
		hair.lineTo(535, 298);
		hair.lineTo(530, 169);
		hair.lineTo(524, 156);
		hair.curveTo(516, 145, 497, 126, 477, 120);
		hair.quadTo(496, 99, 477, 78);
		hair.curveTo(433, 60, 380, 47, 332, 41);
		hair.curveTo(281, 43, 206, 101, 179, 139);
		hair.curveTo(173, 157, 171, 175, 171, 200);
		hair.lineTo(171, 257);
		hair.lineTo(175, 317);
		hair.lineTo(178, 330);
		hair.lineTo(188, 346);
		hair.lineTo(191, 347);
		hair.lineTo(208, 393);
		hair.closePath();

		GeneralPath face = new GeneralPath();
		face.moveTo(499, 380);
		face.lineTo(499, 147);
		face.lineTo(209, 147);
		face.lineTo(209, 316);
		face.lineTo(219, 404);
		face.lineTo(226, 449);
		face.curveTo(241, 501, 288, 548, 350, 570);
		face.curveTo(373, 570, 396, 564, 418, 549);
		face.curveTo(462, 505, 491, 459, 499, 380);
		face.lineTo(499, 147);

		GeneralPath mouth = new GeneralPath();
		mouth.moveTo(317, 476);
		mouth.curveTo(334, 467, 351, 467, 365, 470);
		mouth.curveTo(374, 463, 389, 463, 410, 468);
		mouth.curveTo(381, 482, 354, 484, 317, 476);
		mouth.moveTo(307, 475);
		mouth.curveTo(320, 492, 328, 496, 347, 498);
		mouth.curveTo(363, 501, 379, 500, 391, 495);
		mouth.curveTo(408, 488, 416, 478, 420, 465);
		mouth.lineTo(410, 468);
		mouth.curveTo(381, 482, 354, 484, 317, 476);
		mouth.closePath();

		GeneralPath mouthLine = new GeneralPath();
		mouthLine.moveTo(307, 475);
		mouthLine.lineTo(317, 476);
		mouthLine.curveTo(354, 484, 381, 482, 410, 468);
		mouthLine.lineTo(420, 465);

		GeneralPath eyebrows = new GeneralPath();
		eyebrows.moveTo(230, 317);
		eyebrows.curveTo(232, 303, 238, 296, 251, 286);
		eyebrows.curveTo(269, 283, 285, 286, 311, 293);
		eyebrows.lineTo(331, 311);
		eyebrows.curveTo(294, 303, 254, 303, 230, 317);
		eyebrows.moveTo(480, 301);
		eyebrows.curveTo(474, 282, 468, 275, 448, 265);
		eyebrows.curveTo(429, 269, 414, 274, 398, 285);
		eyebrows.lineTo(386, 303);
		eyebrows.curveTo(415, 293, 452, 290, 480, 301);
		
		GeneralPath eyes = new GeneralPath();
		eyes.moveTo(320, 339);
		eyes.curveTo(309, 322, 273, 322, 262, 340);
		eyes.curveTo(272, 349, 287, 350, 320, 339);
		eyes.moveTo(395, 331);
		eyes.curveTo(402, 311, 433, 303, 451, 323);
		eyes.curveTo(438, 332, 425, 334, 395, 331);
		
		Ellipse2D.Double iris[] = new Ellipse2D.Double[2];
		iris[0] = new Ellipse2D.Double(278, 319, 25, 25);
		iris[1] = new Ellipse2D.Double(412, 303, 25, 25);
		
		GeneralPath nose = new  GeneralPath();
		nose.moveTo(341, 331);
		nose.curveTo(350, 348, 351, 382, 334, 402);
		nose.moveTo(370, 329);
		nose.curveTo(361, 350, 365, 378, 383, 397);
		nose.moveTo(324, 401);
		nose.curveTo(312, 415, 312, 430, 322, 434);
		nose.lineTo(341, 434);
		nose.curveTo(351, 444, 368, 444, 382, 431);
		nose.lineTo(399, 428);
		nose.curveTo(408, 424, 410, 413, 395, 393);
		
		GeneralPath ear = new GeneralPath();
		ear.moveTo(175,  317);
		ear.curveTo(167, 327, 166, 335, 177, 365);
		ear.lineTo(187, 375);
		ear.lineTo(197, 395);
		ear.lineTo(211, 412);
		ear.curveTo(203, 424, 216, 439, 225, 434);
		ear.lineTo(225, 400);
		ear.closePath();
		ear.moveTo(535, 298);
		ear.lineTo(542, 306);
		ear.lineTo(542, 309);
		ear.lineTo(529, 364);
		ear.lineTo(508, 398);
		ear.curveTo(515, 408, 514, 416, 490, 421);
		ear.lineTo(495, 298);
		ear.closePath();
		
		GeneralPath polo = new GeneralPath();
		polo.moveTo(210, 549);
		polo.lineTo(233, 492);
		polo.lineTo(238, 478);
		polo.curveTo(236, 503, 248, 543, 364, 644);
		polo.lineTo(292, 692);
		polo.lineTo(240, 692);
		polo.curveTo(200, 579, 200, 569, 210, 549);
		
		polo.moveTo(0, 652);
		polo.lineTo(210, 549);
		polo.curveTo(200, 569, 200, 579, 240, 692);
		polo.lineTo(0, 692);
		polo.closePath();
	
		polo.moveTo(292, 692);
		polo.lineTo(426, 692);
		polo.lineTo(377, 652);
		polo.lineTo(379, 644);
		polo.lineTo(364, 644);
		polo.closePath();
		
		polo.moveTo(377, 652);
		polo.curveTo(454, 553, 454, 542, 457, 502);
		polo.lineTo(477, 575);
		polo.curveTo(483, 638, 483, 653, 467, 692);
		polo.lineTo(426, 692);
		polo.closePath();
		
		polo.moveTo(477, 575);
		polo.lineTo(668, 692);
		polo.lineTo(467, 692);
		
		GeneralPath neck = new GeneralPath();
		neck.moveTo(457, 502);
		neck.lineTo(457, 692);
		neck.lineTo(249, 692);
		neck.lineTo(249, 531);
		neck.lineTo(251, 502);
		neck.closePath();
		
		GeneralPath space = new GeneralPath();
		space.moveTo(251, 502);
		space.lineTo(251, 477);
		space.lineTo(238, 478);
		space.lineTo(239, 532);
		space.lineTo(249, 532);
		space.closePath();
		
		Area AFace = new Area(face);
		Area AEyes = new Area(eyes);
		Area APolo = new Area(polo);
		AFace.subtract(AEyes);
		
		Color colorHair = new Color(19, 17, 22);
		//Color skinColor = new Color(188, 145, 138);
		Color skinColor = new Color(234, 192, 134);
		Color lipColor = new Color(149, 67, 81);
		Color eyeColor = new Color(35,24,32);
		Color poloColor = new Color(26,28,51);
		
		g2d.setColor(eyeColor);
		for (Ellipse2D.Double ir : iris) {
			g2d.fill(ir);
		}
		
		g2d.setColor(Color.BLACK);
		g2d.fill(space);
		
		g2d.setColor(skinColor);
		g2d.fill(neck);
		g2d.fill(ear);
		
		g2d.setColor(poloColor);
		g2d.fill(APolo);
		
		g2d.setColor(Color.BLACK);
		g2d.draw(polo);
		g2d.draw(ear);
		
		g2d.setColor(skinColor);
		g2d.fill(AFace);
		g2d.setColor(lipColor);
		g2d.fill(mouth);

		g2d.setColor(Color.BLACK);
		g2d.draw(eyes);
		g2d.draw(mouthLine);
		g2d.draw(nose);
		g2d.draw(polo);
		g2d.draw(face);
		
		g2d.setColor(colorHair);
		g2d.fill(hair);
		g2d.fill(eyebrows);
		
		
		

	}

	public static void main(String args[]) {
		Portrait_REYES p = new Portrait_REYES();
		p.setTitle("Self Portrait");
		p.setSize(692, 692);
		p.setVisible(true);
		p.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}
}
