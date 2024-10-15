public class Calcular {
  Integer days;




  Calcular(Integer days){
    this.days = days;
  }
  void Math(Integer days){
    days = 2024 - days;
    this.days = days * 365;
    
  }
}
