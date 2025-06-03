import java.time.LocalDate;

public class Jeu {
    private Long id;
    private Long compteur = 0L;
    private String nom;
    private LocalDate dateSortie;
    private String description;
    private Boolean possedeImage;

    public Jeu() {
        this.id = compteur++;
    }

    public Jeu(String nom) {
        this();
        this.nom = nom;
    }

    public Jeu(String nom,LocalDate dateSortie, String description, Boolean possedeImage) {
        this(nom);
        this.dateSortie = dateSortie;
        this.description = description;
        this.possedeImage = possedeImage;
    }
}
