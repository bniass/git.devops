public class Personne{
    private int id;
    private String prenom, nom;
    private int age;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getPrenom(){
        return prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
}