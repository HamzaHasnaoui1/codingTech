public class Chambre {
    private String numero;
    private String type; // "simple", "double", "suite"
    private double prixParNuit;
    private boolean disponible;

    // Constructeur
    public Chambre(String numero, String type, double prixParNuit) {
        this.numero = numero;
        this.type = type;
        this.prixParNuit = prixParNuit;
        this.disponible = true; // Par défaut, la chambre est disponible
    }

    // Getters et Setters
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public double getPrixParNuit() { return prixParNuit; }
    public void setPrixParNuit(double prixParNuit) { this.prixParNuit = prixParNuit; }
    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    @Override
    public String toString() {
        return "Chambre{" +
                "numero='" + numero + '\'' +
                ", type='" + type + '\'' +
                ", prixParNuit=" + prixParNuit +
                ", disponible=" + disponible +
                '}';
    }
}
