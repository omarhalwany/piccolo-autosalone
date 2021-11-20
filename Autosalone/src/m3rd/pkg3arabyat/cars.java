
package m3rd.pkg3arabyat;
public class cars implements y{

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    private  int prezzo ;
    private int modelo ;
    private String colore ;
    private  String nome  ;
    
    
   
    
    @Override
    public void stampa(){
    
        System.out.println("il nome "+ " "+ nome );
        System.out.println(" il modello "+""+ modelo);
        System.out.println(  " il colore "+" "+colore); 
        System.out.println (" il prezzo "+" "+prezzo);
    
    
    }
    
    
    
    
    
    
}
