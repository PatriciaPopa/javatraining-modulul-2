package session2_recap;

public abstract class Shape {
	protected String color;

	public String getColor() {
		return color;
	}

	public Shape(String color) {
		super();
		this.color = color;
	}

	public abstract void draw();

	@Override
	public boolean equals(Object obj) {
		/*
		 * Prima data trebuie sa verificam ca obiectul pasat ca parametru este de tip
		 * Shape. Daca nu, putem de la bun inceput sa returnam false. Daca obiectul este
		 * un Shape, il castuim la tipul Shape, ca sa putem accesa atributele specifice
		 * acestuia, si returnam true doar daca fieldul color are aceeasi valoare la
		 * ambele obiecte. Va reamintesc, pentru a compara 2 stringuri folosim metoda
		 * equals(), nu operatorul == (vezi Curs 3)
		 */
		if (obj instanceof Shape && color.equals(((Shape) obj).getColor())) {

			/*
			 * Daca nu am pune acest if, chiar daca am compara un cerc si un triunghi, dar
			 * care au aceeasi culoare, metoda equals ar returna true, ca si cum ele ar fi
			 * acelasi obiect, ceea ce in lumea reala nu ar avea sens
			 */
			if (this.getClass().getName().equals(obj.getClass().getName())) {
				return true;
			}
		}

		return false;
	};

}
