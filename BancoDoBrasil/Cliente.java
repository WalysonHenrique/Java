class Cliente{

  private Integer numberAccount;
  private String agence;
  private Float balance, credit;



  public Cliente(){

  };

  
  public Cliente(Integer numberAccount, String agence,Float balance,Float credit){
    this.numberAccount = numberAccount;
    this.agence = agence;
    this.balance = balance;
    this.credit = credit;
  }



  public Integer getNumberAccount(){



    return 0;
  }


  public String getAgence(){

    return "a";
  }

  public void setAgence(String agence){}

  public Float getBalance(){
    return 1.0f;
    }

  public Float getCredit(){return 0.0f;}


  public void setCredit(Float value){}

  public Float  sacar(Float value){return 0.0f;}

  public void depositar(Float value){}

  public Boolean tansfer(Cliente cliente, Float value){ return true;}

  public void imprimirExtrato(){}



}