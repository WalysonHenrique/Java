class Principal {
	public static void main(String[] args) {
		Curso tads = new Curso();

		Instituicao ifes = new Instituicao(tads);
		Instituicao ufes = new Instituicao(null);

		ifes.imprimirCurso();
		ufes.imprimirCurso();
	}
}