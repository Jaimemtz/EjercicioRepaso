
import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.util.RandomGenerator;


public class Repaso8 extends acm.program.GraphicsProgram{

	//declaro una variable de instancia para guardar el rectángulo
	GRect rectangulo;
	double distanciaX;
	double distanciaY;
	//declaro una variable de tipo aleatorio
	RandomGenerator aleatorio = new RandomGenerator();

	public void init(){
		setSize(800,600);
		rectangulo = new GRect(120, 80);
		//inserto el "escuchador" del raton
		addMouseListeners();
	}

	public void run(){
			distanciaX = this.getWidth()/2 - rectangulo.getWidth()/2;
			distanciaY = this.getHeight()/2 - rectangulo.getHeight()/2;
			add (rectangulo, distanciaX, distanciaY );
	}

	//añado el método que escucha el evento del clic del ratón

	public void mouseClicked(MouseEvent evento){
		if (getElementAt(evento.getX(), evento.getY())== rectangulo){
			double anchoRectangulo = rectangulo.getWidth();
			double distanciaAlPrincipio = (evento.getX()- rectangulo.getX());
			if (distanciaAlPrincipio > anchoRectangulo/2){
				rectangulo.move(20,0);
			}
			else{
				rectangulo.move(-20,0);
			}
 
		}
	}
}