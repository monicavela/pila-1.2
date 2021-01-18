package pila;
public class IntroPila {

    char pila[] = new char[26];
    int cima = 0;


        public IntroPila(int tamaño){
        pila = new char[tamaño];
        cima=0;
        }

        //Metodo insertar
        public void  llenar(){
        for(int i=1; i<=26; i++){
        char c =(char) (Math.random()*26 + 'a');
        pila[cima]=c;
        c++;
        cima++;
        }
        }

        public void mostrar(){
        for(int i=cima-1; i>=0; i--){
        System.out.print(" "+pila[i]);

        }
        }

        public void Eliminar(){
        cima--;
        System.out.println("Datos eliminado");
        }

        public boolean vacio(){
        if (cima==0){
        return true;
        }else{
        return false;
        }
        }

        public int Tamaño(){
        return pila.length ;
        }

        public void  Ordenar(){
        char letra = 'a';
        for(int i=0; i<26;i++){
        pila[cima]=letra;
        letra++;
        cima++;
       }
        }
}

