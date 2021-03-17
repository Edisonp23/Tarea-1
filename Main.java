// Creado por: @author Edison Peña
//importa la libreria scanner
import java.util.*;
//clase persona
class persona {

  //variables

   String name = ("");
   String lastName =("");
   int age =0;
   String gender =("");  
}

class Main {
  public static void main(String[] args) {

    //instanciar scanner
  Scanner sc = new Scanner(System.in);

  //instancia la clase persona
  persona person1 = new persona();

//agrega valores a las variables
  System.out.print("Digite su nombre");

  person1.name = sc.nextLine();

  System.out.print("Digite su apellido");

  person1.lastName = sc.nextLine();

   System.out.print("Digite su género");

  person1.gender = sc.nextLine();

  System.out.print("Digite su edad");

  person1.age = sc.nextInt();

 

  // imprime los datos 

System.out.println("Usted ingresó el nombre: " + person1.name);

System.out.println("Usted ingresó el apellido: " + person1.lastName);

System.out.println("Usted ingresó la edad: " + person1.age);

System.out.println("Usted ingresó el género: " + person1.gender);

  }
}