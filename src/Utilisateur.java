public abstract class Utilisateur {
    private Long id;
    private static Long compteur = 0L;
    private String pseudo;
    private String email;
    private String motDePasse;


    public Utilisateur() {
        this.id = compteur++;
    }

    public Utilisateur(String pseudo) {
        this();
        this.pseudo = pseudo;
    }

    public Utilisateur(Long id, String motDePasse, String email, String pseudo) {
        this(pseudo);
        this.motDePasse = motDePasse;
        this.email = email;
    }
}
