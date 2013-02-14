import java.util.ArrayList;

public class Auteur {
    String nom;
    String description;
    private ArrayList<Post> posts = new ArrayList<Post>();

    public Auteur(String nom, String description){
        this.nom = nom;
        this.description = description;
    }

    public boolean nouveauPost(String titre, String contenu){
        Post post = new Post(this,titre,contenu);
        if(post.estValide())
            posts.add(post);
        return post.estValide();
    }

    public int nombreDePost(){
        return posts.size();
    }
}
