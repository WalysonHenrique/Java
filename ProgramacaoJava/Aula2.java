


class Main{
	public static void main(String[] args){
	Animal objAnimal = new Animal("cachorro", 3);
    
    objAnimal.exibirInformacoes(objAnimal);
	System.out.println("");
    objAnimal.comer(objAnimal);


	Felino objFelino = new Felino(4.8f, "Felino", 12);

	objFelino.exibirInformacoes(objFelino);
	}
}