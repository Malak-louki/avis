public class Plateforme {
    private Long id;
    private String nom;
    private static Long compteur = 0L;

    public Plateforme() {
        this.id = compteur++;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString(){
        return "Plateforme{" +
                "id : "+ id +
                "nom :"+ nom+
                "}";
    }

}