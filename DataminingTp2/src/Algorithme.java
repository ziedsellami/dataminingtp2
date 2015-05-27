public class Algorithme {
	float Var_1, Var_2, Var_3, Var_4, Var_5, Var_6;

	
	public Algorithme(float var_1, float var_2, float var_3, float var_4,
			float var_5, float var_6) {
		super();
		Var_1 = var_1;
		Var_2 = var_2;
		Var_3 = var_3;
		Var_4 = var_4;
		Var_5 = var_5;
		Var_6 = var_6;
	}


	public Value id3() {
		Value v = null;
		if (Var_4 < 3.00)
			v = new Value("unacc", 1.0000f, new Resultat(432, 0, 0, 0));
		if (Var_4 >= 3.00 && Var_6 < 1.50)
			v = new Value("unacc", 1.0000f, new Resultat(144, 0, 0, 0));
		if (Var_4 >= 3.00 && Var_6 >= 1.50 && Var_1 >= 2.50 && Var_2 >= 2.50
				&& Var_6 >= 2.50 && Var_5 >= 2.50)
			v = new Value("vgood", 1.0000f, new Resultat(0, 0, 12, 0));
		if (Var_4 >= 3.00 && Var_6 >= 1.50 && Var_1 >= 2.50 && Var_2 >= 2.50
				&& Var_6 >= 2.50 && Var_5 < 2.50 && Var_3 < 3.50)
			v = new Value("good", 0.7500f, new Resultat(0, 4, 0, 12));
		if (Var_4 >= 3.00 && Var_6 >= 1.50 && Var_1 >= 2.50 && Var_2 >= 2.50
				&& Var_6 >= 2.50 && Var_5 < 2.50 && Var_3 >= 3.50)
			v = new Value("vgood", 0.5000f, new Resultat(0, 1, 4, 3));
		if (Var_4 >= 3.00 && Var_6 >= 1.50 && Var_1 >= 2.50 && Var_2 < 2.50
				&& Var_6 >= 2.50)
			v = new Value("acc", 0.8889f, new Resultat(0, 32, 4, 0));
		if (Var_4 >= 3.00 && Var_6 >= 1.50 && Var_1 >= 2.50 && Var_2 < 2.50
				&& Var_6 < 2.50 && Var_5 < 2.50)
			v = new Value("unacc", 0.6250f, new Resultat(15, 9, 0, 0));
		if (Var_4 >= 3.00 && Var_6 >= 1.50 && Var_1 >= 2.50 && Var_2 < 2.50
				&& Var_6 < 2.50 && Var_5 >= 2.50)
			v = new Value("acc", 1.0000f, new Resultat(0, 12, 0, 0));
		if (Var_4 >= 3.00 && Var_6 >= 1.50 && Var_1 >= 2.50 && Var_2 >= 2.50
				&& Var_6 < 2.50 && Var_5 < 2.50)
			v = new Value("acc", 0.8750f, new Resultat(0, 21, 0, 3));
		if (Var_4 >= 3.00 && Var_6 >= 1.50 && Var_1 >= 2.50 && Var_2 >= 2.50
				&& Var_6 < 2.50 && Var_5 >= 2.50)
			v = new Value("good", 0.7500f, new Resultat(0, 3, 0, 9));
		if (Var_4 >= 3.00 && Var_6 >= 1.50 && Var_1 < 2.50 && Var_2 < 1.50)
			v = new Value("unacc", 1.0000f, new Resultat(36, 0, 0, 0));
		if (Var_4 >= 3.00 && Var_6 >= 1.50 && Var_1 < 2.50 && Var_2 >= 1.50
				&& Var_6 >= 2.50 && Var_2 >= 2.50)
			v = new Value("acc", 1.0000f, new Resultat(0, 36, 0, 0));
		if (Var_4 >= 3.00 && Var_6 >= 1.50 && Var_1 < 2.50 && Var_2 >= 1.50
				&& Var_6 >= 2.50 && Var_2 < 2.50 && Var_1 < 1.50)
			v = new Value("unacc", 1.0000f, new Resultat(9, 0, 0, 0));
		if (Var_4 >= 3.00 && Var_6 >= 1.50 && Var_1 < 2.50 && Var_2 >= 1.50
				&& Var_6 >= 2.50 && Var_2 < 2.50 && Var_1 >= 1.50)
			v = new Value("acc", 1.0000f, new Resultat(0, 9, 0, 0));
		if (Var_4 >= 3.00 && Var_6 >= 1.50 && Var_1 < 2.50 && Var_2 >= 1.50
				&& Var_6 < 2.50 && Var_5 >= 2.50 && Var_2 < 2.50)
			v = new Value("acc", 0.5000f, new Resultat(3, 3, 0, 0));
		if (Var_4 >= 3.00 && Var_6 >= 1.50 && Var_1 < 2.50 && Var_2 >= 1.50
				&& Var_6 < 2.50 && Var_5 >= 2.50 && Var_2 >= 2.50)
			v = new Value("acc", 1.0000f, new Resultat(0, 12, 0, 0));
		if (Var_4 >= 3.00 && Var_6 >= 1.50 && Var_1 < 2.50 && Var_2 >= 1.50
				&& Var_6 < 2.50 && Var_5 >= 2.50 && Var_2 >= 2.50)
			v = new Value("acc", 1.0000f, new Resultat(24, 0, 0, 0));
		if (Var_4 >= 3.00 && Var_6 >= 1.50 && Var_1 < 2.50 && Var_2 >= 1.50
				&& Var_6 < 2.50 && Var_5 < 2.50 && Var_3 >= 3.50
				&& Var_5 < 1.50)
			v = new Value("unacc", 1.0000f, new Resultat(6, 0, 0, 0));
		if (Var_4 >= 3.00 && Var_6 >= 1.50 && Var_1 < 2.50 && Var_2 >= 1.50
				&& Var_6 < 2.50 && Var_5 < 2.50 && Var_3 >= 3.50
				&& Var_5 >= 1.50)
			v = new Value("acc", 0.8333f, new Resultat(1, 5, 0, 0));

		return v;

	}
	public Value chaid(){
		Value v = null;
		if (Var_4 < 3.00)
			v = new Value("unacc", 1.0000f, new Resultat(432, 0, 0, 0));
		if (Var_4 >=3.00 && Var_6 < 1.50)
			v = new Value("unacc", 1.0000f, new Resultat(144,0,0,0));
		
		if (Var_4 >=3.00 && Var_6 >=1.50 && Var_1 < 2.50 && Var_2 < 1.50)
			v = new Value("unacc", 1.0000f, new Resultat(36,0,0,0));
		if (Var_4 >=3.00 && Var_6 >=1.50 && Var_1 >=2.50 && Var_2 >=2.50 && Var_6 >=2.50 && Var_5 >=2.50 )
			v = new Value("vgood", 1.0000f, new Resultat(0,0,12,0));
		
		if (Var_4 >=3.00 && Var_6 >=1.50 && Var_1 < 2.50 && Var_2 >=1.50 && Var_6 >=2.50 && Var_2 >=2.50)
			v = new Value("acc", 1.0000f, new Resultat(0,36,0,0));
		
		if (Var_4 >=3.00 && Var_6 >=1.50 && Var_1 >=2.50 && Var_2 < 2.50 && Var_6 >=2.50)
			v = new Value("acc", 0.8889f, new Resultat(0,32,4,0));
		
		if (Var_4 >=3.00 && Var_6 >=1.50 && Var_1 < 2.50 && Var_2 >=1.50 && Var_6 >=2.50 && Var_2 < 2.50 && Var_1 < 1.50)
			v = new Value("unacc", 1.0000f, new Resultat(9,0,0,0));
		if (Var_4 >=3.00 && Var_6 >=1.50 && Var_1 < 2.50 && Var_2 >=1.50 && Var_6 >=2.50 && Var_2 < 2.50 && Var_1 >=1.50)
			v = new Value("acc", 1.0000f, new Resultat(0,9,0,0));
		
		if (Var_4 >=3.00 && Var_6 >=1.50 && Var_1 >=2.50 && Var_2 >=2.50 && Var_6 < 2.50 && Var_5 >=2.50)
			v = new Value("good", 0.7500f, new Resultat(0,3,0,9));
		if (Var_4 >=3.00 && Var_6 >=1.50 && Var_1 >=2.50 && Var_2 < 2.50 && Var_6 < 2.50 && Var_5 < 2.50)
			v = new Value("unacc", 0.6250f, new Resultat(15,9,0,0));
		
		if (Var_4 >=3.00 && Var_6 >=1.50 && Var_1 >=2.50 && Var_2 < 2.50 && Var_6 < 2.50 && Var_5 >=2.50)
			v = new Value("acc", 1.0000f, new Resultat(40,12,0,0));
		if (Var_4 >=3.00 && Var_6 >=1.50 && Var_1 < 2.50 && Var_2 >=1.50 && Var_6 < 2.50 && Var_5 < 2.50 && Var_3 < 3.50)
			v = new Value("unacc", 1.0000f, new Resultat(24,0,0,0));
		if (Var_4 >=3.00 && Var_6 >=1.50 && Var_1 >=2.50 && Var_2 >=2.50 && Var_6 >=2.50 && Var_5 < 2.50 && Var_3 < 3.50)
			v = new Value("good", 0.7500f, new Resultat(0,4,0,12));
		if (Var_4 >=3.00 && Var_6 >=1.50 && Var_1 >=2.50 && Var_2 >=2.50 && Var_6 >=2.50 && Var_5 < 2.50 && Var_3 >=3.50)
			v = new Value("vgood", 0.5000f, new Resultat(0,1,4,3));
		if (Var_4 >=3.00 && Var_6 >=1.50 && Var_1 < 2.50 && Var_2 >=1.50 && Var_6 < 2.50 && Var_5 < 2.50 && Var_3 >=3.50 && Var_5 < 1.50)
			v = new Value("unacc", 1.0000f, new Resultat(6,0,0,0));
		if (Var_4 >=3.00 && Var_6 >=1.50 && Var_1 < 2.50 && Var_2 >=1.50 && Var_6 < 2.50 && Var_5 < 2.50 && Var_3 >=3.50 && Var_5 >=1.50)
			v = new Value("acc", 0.8333f, new Resultat(1,5,0,0));
		if (Var_4 >=3.00 && Var_6 >=1.50 && Var_1 < 2.50 && Var_2 >=1.50 && Var_6 < 2.50 && Var_5 >=2.50 && Var_2 < 2.50)
			v = new Value("acc", 0.5000f, new Resultat(3,3,0,0));
		if (Var_4 >=3.00 && Var_6 >=1.50 && Var_1 < 2.50 && Var_2 >=1.50 && Var_6 < 2.50 && Var_5 >=2.50 && Var_2 >=2.50)
			v = new Value("acc", 1.0000f, new Resultat(0,12,0,0));
		if (Var_4 >=3.00 && Var_6 >=1.50 && Var_1 >=2.50 && Var_2 >=2.50 && Var_6 < 2.50 && Var_5 < 2.50 && Var_3 < 3.50)
			v = new Value("acc", 1.0000f, new Resultat(0,16,0,0));
		if ( Var_4 >=3.00 && Var_6 >=1.50 && Var_1 >=2.50 && Var_2 >=2.50 && Var_6 < 2.50 && Var_5 < 2.50 && Var_3 >=3.50)
			v = new Value("acc", 0.6250f, new Resultat(0,5,0,3));
		
		
		return v;
	}

}
