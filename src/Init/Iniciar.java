package Init;

import Telas.MenuInicial;

public class Iniciar {

	public static void main(String[] args) {
		try {
			MenuInicial frame = new MenuInicial();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
