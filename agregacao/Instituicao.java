class Instituicao {
	private Curso curso;

	public Instituicao(Curso curso) {
		this.curso = curso;
	}

	public void imprimirCurso() {
		System.out.println(curso);
	}
}