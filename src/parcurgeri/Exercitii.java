package parcurgeri;

public class Exercitii {

    public static void afisare(int[] v){
        System.out.println("Vectorul afisat");
        for (int i = 0; i <v.length ; i++) {
            System.out.println(v[i]+" ");
        }
    }

    public static void sortareaPrinSelectie(int [] v){
        for (int i = 0; i < v.length-1; i++) {
            for (int j = i+1; j <v.length ; j++) {
                if (v[i] >v[j]){
                    int aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
    }

    public static void bubbleSort(int[] v){
        int flag = 0;
        do {
            flag = 1;
            for (int i = 0; i <v.length-1 ; i++) {
                if (v[i] > v[i+1]){
                    int aux = v[i];
                    v[i] = v[i+1];
                    v[i + 1] = aux;
                    flag = 0;
                }
            }
        } while (flag==0);
    }



    public static int[] stergere(int v[], int p){
        //algoritmul stergere
      for (int i = p; i <v.length-1 ; i++) {
          v[i] = v[i+1];
      }
      int [] nou = new int[v.length-1];
      for (int i = 0; i <nou.length ; i++) {
          nou[i] = v[i];
      }
      return nou;
  }



    public static int[] inserare(int v[], int p, int nr){
        int [] nou = new int[v.length+1];
        //copiem din v in nou
      for (int i = 0; i <v.length ; i++) {
          nou[i]=v[i];
      }
      for (int i = v.length-1; i >=p ; i--) {
          nou[i+1] =nou[i];

      }
      nou[p] =nr;
      return nou;
  }
  /*Se citeste de la tastatura un vector de maxim 200 nr intregi de maxim 4 cifre
  * a. Sa se stearga al 3lea element prim din vector
  * b. Sa se stearga toate elementele ce au cel putin 2 cifre, iar prima = ultima*/


    //todo functie ce returneaaa pozitia celui de al treilea numer prim
     public static int  pozitiaCeluiDeAlTreileaPrim(int v[]){
         int contor = 0;
         for (int i = 0; i <v.length ; i++) {
             if (isPrim(v[i])==true){
              contor++;
              if (contor == 3)
                  return  i;
             }
         }

         return -1;
     }

    public static boolean isPrim(int n){
         if(n==1|| n==0){
             return  false;
         }
         for(int k=2;k<=n/2;k++){
             if(n%k==0){
                 return  false;
             }
         }

         return true;
    }


    public static boolean isUltimEgalaCuPrima(int nr){
         int u=nr%10;
         while(nr>9){
             nr=nr/10;
         }
         return  u==nr;
    }
    //todo functie ce imi returneaza al treilea numar prim
    public static void solutieA(int v[] ){

          int a=pozitiaCeluiDeAlTreileaPrim(v);//pozitia celui de al treilea numar prim
          v= stergere(v,a);//din v sterge pozitia 5
          afisare(v);
    }
    public static void solutieB(int v[] ){
        for (int i = 0; i <v.length ; i++) {

              if(isUltimEgalaCuPrima(v[i])){

                 v= stergere(v,i);
              }
        }
        afisare(v);
    }

//    public static void stergereElemPrim(int v[]){
//        for (int i = 0; i < v.length; i++) {
//            if ()
//
//        }
//    }
}


