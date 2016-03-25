package com.github.hartorn.dd.webapp.model.generated;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.apache.openjpa.jdbc.meta.ReverseMappingTool$AnnotatedCodeGenerator
 */
@Entity
@Table(schema="ideo", name="recettes")
public class Recettes
{
    @Basic
    @Column(nullable=false, length=20)
    private String artisanat;

    @Basic
    @Column(nullable=false, length=10)
    private String carac;

    @Basic
    @Column(nullable=false, length=20)
    private String classe;

    @Basic
    @Column(nullable=false, length=30)
    private String competence;

    @Basic
    @Column(name="competence_pourcentage", columnDefinition="int2")
    private short competencePourcentage;

    @Basic
    @Column(columnDefinition="int4")
    private int dossier;

    @Id
    @Column(columnDefinition="int4")
    private int id;

    @Basic
    @Column(name="id_objet", columnDefinition="int4")
    private int idObjet;

    @Basic
    @Column(nullable=false)
    private String ingredients;

    @Basic
    @Column(nullable=false, length=128)
    private String location;

    @Basic
    @Column(columnDefinition="int2")
    private short niveau;

    @Basic
    @Column(columnDefinition="int2")
    private short nombre;

    @Basic
    @Column(nullable=false)
    private String outils;

    @Basic
    @Column(columnDefinition="int2")
    private short prix;

    @Basic
    @Column(nullable=false, length=10)
    private String race;

    @Basic
    @Column(columnDefinition="int2")
    private short trouvable;


    public Recettes ()
    {
    }

    public Recettes (int id)
    {
        this.id = id;
    }

    public String getArtisanat ()
    {
        return artisanat;
    }

    public void setArtisanat (String artisanat)
    {
        this.artisanat = artisanat;
    }

    public String getCarac ()
    {
        return carac;
    }

    public void setCarac (String carac)
    {
        this.carac = carac;
    }

    public String getClasse ()
    {
        return classe;
    }

    public void setClasse (String classe)
    {
        this.classe = classe;
    }

    public String getCompetence ()
    {
        return competence;
    }

    public void setCompetence (String competence)
    {
        this.competence = competence;
    }

    public short getCompetencePourcentage ()
    {
        return competencePourcentage;
    }

    public void setCompetencePourcentage (short competencePourcentage)
    {
        this.competencePourcentage = competencePourcentage;
    }

    public int getDossier ()
    {
        return dossier;
    }

    public void setDossier (int dossier)
    {
        this.dossier = dossier;
    }

    public int getId ()
    {
        return id;
    }

    public void setId (int id)
    {
        this.id = id;
    }

    public int getIdObjet ()
    {
        return idObjet;
    }

    public void setIdObjet (int idObjet)
    {
        this.idObjet = idObjet;
    }

    public String getIngredients ()
    {
        return ingredients;
    }

    public void setIngredients (String ingredients)
    {
        this.ingredients = ingredients;
    }

    public String getLocation ()
    {
        return location;
    }

    public void setLocation (String location)
    {
        this.location = location;
    }

    public short getNiveau ()
    {
        return niveau;
    }

    public void setNiveau (short niveau)
    {
        this.niveau = niveau;
    }

    public short getNombre ()
    {
        return nombre;
    }

    public void setNombre (short nombre)
    {
        this.nombre = nombre;
    }

    public String getOutils ()
    {
        return outils;
    }

    public void setOutils (String outils)
    {
        this.outils = outils;
    }

    public short getPrix ()
    {
        return prix;
    }

    public void setPrix (short prix)
    {
        this.prix = prix;
    }

    public String getRace ()
    {
        return race;
    }

    public void setRace (String race)
    {
        this.race = race;
    }

    public short getTrouvable ()
    {
        return trouvable;
    }

    public void setTrouvable (short trouvable)
    {
        this.trouvable = trouvable;
    }
}