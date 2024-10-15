class Principal {
	public static void main(String[] args) {
		Curso tads = new Curso();
		Instituicao ifes = new Instituicao();
		ifes.setCurso(tads);

		ifes.imprimirCurso();
		ufes.imprimirCurso();
	}
}