public final class  PessoaFisica extends Cliente {
  String CPF, Name;


  public PessoaFisica(String CPF, String Name, Integer numberAccount, String agence, Double balance, Double credit ){
    super(numberAccount, agence, balance, credit);
    this.CPF = CPF;
    this.Name = Name;
   
  }
}
