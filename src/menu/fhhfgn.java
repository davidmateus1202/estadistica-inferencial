package menu;



public class fhhfgn {
	
	static double bayer=0.85;
	static double equipo=0.50;
	static double resultado;
	public static void main(String[] args) {
		
		if(Binomial(bayer,10)>Binomial1(equipo,10)) {
			System.out.println(Binomial(bayer,10)+" marcador "+Binomial1(equipo,10));
			
		}
	resultado=Binomial1(equipo,10);
	}
	public static int Bernoulli(double p) {
		double ri=Math.random();
		if(ri<=p) {
			return(1);
		}else {
			return(0);
		}		
	}
	public static int Binomial(double p, int ensayos) {
		int exitos=0;
		for(int i=0; i<ensayos; i++) {
			if(Bernoulli(p)==1) {
				exitos++;
			}
		}
		return(exitos);
	}
	public static int Bernoulli1(double p) {
		double ri=Math.random();
		if(ri<=p) {
			return(1);
		}else {
			return(0);
		}		
	}
	public static int Binomial1(double p, int ensayos) {
		int exitos=0;
		for(int i=0; i<ensayos; i++) {
			if(Bernoulli(p)==1) {
				exitos++;
			}
		}
		return(exitos);
	}
}

