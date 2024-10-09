import java.time.LocalDate;

public class MaDate {
    private int jour;
    private int mois;
    private int annee; 

    
    public void setJour(int x) {
        this.jour = x;
    }

    public void setMois(int a) {
        this.mois = a;
    }

    public void setAnnee(int a) {
        this.annee = a;
    }

   
    public int getMois() { 
        return mois;
    }

    public int getJour() {
        return jour;
    }

    public int getAnnee() {
        return annee;
    }

    
    public MaDate(int jour, int mois, int annee) {
        this(annee);
        this.jour = jour;
        this.mois = mois;
       
    }

    
    public MaDate(int annee) {
        LocalDate dateCourante = LocalDate.now(); 
        this.jour = dateCourante.getDayOfMonth();
        this.mois = dateCourante.getMonthValue();
        this.annee = annee;
    }

    
    @Override
    public String toString() {
        return jour + "/" + mois + "/" + annee;
    }

    public void ajouterUnJour() {
        jour++; 
         if ((mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) && jour > 31) {
            jour = 1; 
            mois++;   
         } else if ((mois == 4 || mois == 6 || mois == 9 || mois == 11 || mois == 2) && jour > 30) {
            jour = 1;
            mois++;
        }
        if (mois > 12) {
            mois = 1;
            annee++; 
        }}

    public void ajouterPlusieursJours(int n) {
        for (int i = 0; i < n; i++) {
            ajouterUnJour();
        }
    }
     public void ajouterUnAn() {
        annee++; 
       
    }
    public void ajouterUnMois() {
        mois++; 
        if (mois > 12) {
            mois = 1; 
            annee++;  
        }
        else if ((mois == 4 || mois == 6 || mois == 9 || mois == 11) && jour > 30) {
            jour = 30; 
        }
    }

    
}
