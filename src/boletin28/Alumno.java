
package boletin28;

public class Alumno {
    int nota;
    String nome;
    Enderezo enderezo;

    public Alumno(String nome,int nota) {
        this.nota = nota;
        this.nome = nome;
   
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Enderezo getEnderezo() {
        return enderezo;
    }

    public void setEnderezo(Enderezo enderezo) {
        this.enderezo = enderezo;
    }
public void amosar(){
          System.out.println("nome"+nome+"nota"+nota+enderezo);
      }
    
    
    public class Enderezo{
        int numero;
        String rua;
        public Enderezo(String rua, int numero) {
            this.rua = rua;
            this.numero = numero;
        }

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }
      public void amosar(){
          System.out.println("nome"+nome+"nota"+nota+enderezo);
      }

        @Override
        public String toString() {
            return "Enderezo{" + "rua=" + rua + ", numero=" + numero + '}';
        }
        
    }

    @Override
    public String toString() {
        return "Alumno{" + "nota=" + nota + ", nome=" + nome + ", enderezo=" + enderezo + '}';
    }
    public void cambiarNota(int nota){
        this.nota=nota;
    }
   
    
}
