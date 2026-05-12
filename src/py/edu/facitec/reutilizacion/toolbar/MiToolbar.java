package py.edu.facitec.reutilizacion.toolbar;

import javax.swing.JToolBar;
import py.edu.facitec.reutilizacion.botones.MiBoton;

public class MiToolbar extends JToolBar{
	public MiToolbar() {
		setFloatable(false);
		
		MiBoton mbtnNuevo = new MiBoton();
		mbtnNuevo.setText("Nuevo");
		add(mbtnNuevo);
		
		MiBoton mbtnModificar = new MiBoton();
		mbtnModificar.setText("Modificar");
		add(mbtnModificar);
		
		MiBoton mbtnEliminar = new MiBoton();
		mbtnEliminar.setText("Eliminar");
		add(mbtnEliminar);
		
		MiBoton mbtnGuardar = new MiBoton();
		mbtnGuardar.setText("Guardar");
		add(mbtnGuardar);
		
		MiBoton mbtnCancelar = new MiBoton();
		mbtnCancelar.setText("Cancelar");
		add(mbtnCancelar);
		
		MiBoton mbtnSalir = new MiBoton();
		mbtnSalir.setText("Salir");
		add(mbtnSalir);
	}

}
