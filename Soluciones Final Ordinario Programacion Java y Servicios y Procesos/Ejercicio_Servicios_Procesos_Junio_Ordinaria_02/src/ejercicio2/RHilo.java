package ejercicio2;



public class RHilo implements Runnable {
	private int posIni, posFin;
	private int [][] matriz;
	private int[][]r;

	
	public RHilo (int ini, int fin, int [][] mat, int [][] re) {
		this.posIni = ini;
		this.posFin = fin;
		this.matriz = mat;
		this.r=re;
	}
	
	@Override
	public void run() {
		int k;
		for (int i = this.posIni; i < this.posFin; i++) {
			k = matriz.length-1;
			for (int j = 0; j < matriz[0].length; j++) {  //para que salte de 0 a 3, a 6
				r[i][j]=matriz[k][i];
				k--;
			}
		}
	}
}
