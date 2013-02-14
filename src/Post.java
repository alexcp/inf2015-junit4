public class Post {
    Auteur auteur;
    String titre;
    String contenu;

   public Post(Auteur auteur, String titre, String contenu){
    this.auteur = auteur;
    this.titre = mettrePremiereLettreEnMaj(titre);
    this.contenu = contenu;
   }

   public boolean estValide() {
       try{
            Valider.presence(auteur);
            Valider.presence(titre);
            Valider.presence(contenu);
       }catch(Exception e){
           return false;
       }
       return true;
   }

   protected static String mettrePremiereLettreEnMaj(String string){
       char premiereLettre = Character.toUpperCase(string.charAt(0));
       return string.substring(1)+premiereLettre;
   }
}
