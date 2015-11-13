/*
 * Repaso6
 * es un programa que hace lo mismo que Repaso5
 * pero que sólo cambia el color del rectángulo
 * si se hace clic dentro de él
 */

import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.util.RandomGenerator;


public class Repaso6 extends acm.program.GraphicsProgram{

	//declaro una variable de instancia para guardar el rectángulo
	GRect rectangulo;
	//declaro una variable de tipo aleatorio
	RandomGenerator aleatorio = new RandomGenerator();

	public void init(){
		setSize(800,600);
		rectangulo = new GRect(120, 80);
		//inserto el "escuchador" del raton
		addMouseListeners();
	}

	public void run(){
		add(rectangulo,
				getWidth()/2 - rectangulo.getWidth()/2,
				getHeight()/2 - rectangulo.getHeight()/2
				);
	}
	
	//añado el método que escucha el evento del clic del ratón
	
	public void mouseClicked(MouseEvent evento){
		if (evento.getButton()== MouseEvent.BUTTON1)
		rectangulo.setFilled(true);
		
		rectangulo.setFillColor(aleatorio.nextColor());
	}

}