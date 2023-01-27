

class ejercicios_tema3{
  public static void main(String[] args){
     //Primera parte:
    int resultado;
    resultado = funcion_3_parametros(1, 2, 3);
    System.out.println("El resultado de la primera parte es: " + resultado);
      //Segunda parte:
      Coche miCoche = new Coche();
      miCoche.incrementaPuertas();
      miCoche.incrementaPuertas();
      miCoche.incrementaPuertas();
      miCoche.incrementaPuertas();
    System.out.print("El resultado de la segunda parte es: Mi coche tiene " + miCoche.puertas + " puertas.");
  }
  //Primera parte:
  public static int funcion_3_parametros(int a, int b, int c){
    return a + b + c;
  }

}
class Coche {
  public int puertas = 0;
  public void incrementaPuertas(){
    this.puertas ++;
  }
}



