/*
 * Repaso1: Pinta un rectángulo en la esquina superior izquierda
 *  
 */
//importamos la librería acm para los objetos gráficos 



import acm.graphics.*;
public class Repaso1 extends acm.program.GraphicsProgram{
	
	//declaro una variable de instancia
	GRect rectangulo;
	
	//recuerda que el init se ejecuta siempre antes que el run
	public void init(){
		setSize(800, 600);
		//el primer parámetro del rectángulo es el ancho
		//y el segundo el alto
		rectangulo = new GRect(120,80);
		
		
		}
	public void run(){
		add(rectangulo);
	}

		
}
