package ExOne;

import static org.junit.Assert.*;

import org.junit.Test;

public class FigureTest {

	@Test
	public void test() {
		Figure[] FigCollection = new Figure[6];
		Castle Nottingham = new Castle(0);
		Queen IsabelI = new Queen(0);
		Castle London = new Castle(1);
		Queen Mary = new Queen(1);
		Castle Gales = new Castle(0);
		Castle Ireland = new Castle(1);
		
		FigCollection[0]=Nottingham;
		FigCollection[1]=IsabelI;
		FigCollection[2]=London;
		FigCollection[3]=Mary;
		FigCollection[4]=Gales;
		FigCollection[5]=Ireland;
		
		for(int it=0;it<FigCollection.length;it++)
		{
			Figure Pieza = FigCollection[it];
			Pieza.whoAmI();
		}
		
	}

}
