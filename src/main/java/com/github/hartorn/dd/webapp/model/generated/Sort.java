package com.github.hartorn.dd.webapp.model.generated;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.apache.openjpa.jdbc.meta.ReverseMappingTool$AnnotatedCodeGenerator
 */
@Entity
@Table(schema="ideo", name="sort")
public class Sort
{
    @Basic
    @Column(columnDefinition="int4")
    private int acces;

    @Basic
    @Column(name="cout_mana", columnDefinition="int4")
    private int coutMana;

    @Basic
    @Column(columnDefinition="text", nullable=false, length=2147483647)
    private String description;

    @Basic
    @Column(nullable=false, length=64)
    private String dieux;

    @Basic
    @Column(columnDefinition="int4")
    private int difficulte;

    @Basic
    @Column(nullable=false, length=20)
    private String ecole;

    @Basic
    @Column(nullable=false, length=20)
    private String fichier;

    @Basic
    @Column(name="hit_and_run", columnDefinition="int2")
    private short hitAndRun;

    @Id
    @Column(columnDefinition="int4")
    private int id;

    @Basic
    @Column(length=64)
    private String image;

    @Basic
    @Column(name="image_bouton", length=64)
    private String imageBouton;

    @Basic
    @Column(columnDefinition="int2")
    private short js;

    @Basic
    @Column(columnDefinition="int4")
    private int niveau;

    @Basic
    @Column(nullable=false, length=35)
    private String nom;

    @Basic
    @Column(name="nom_court", nullable=false, length=20)
    private String nomCourt;

    @Basic
    @Column(columnDefinition="int2")
    private short pnj;

    @Basic
    @Column(columnDefinition="int4")
    private int portee;

    @Basic
    @Column(columnDefinition="int2")
    private short soi;

    @Basic
    @Column(nullable=false, length=64)
    private String voie;


    public Sort ()
    {
    }

    public Sort (int id)
    {
        this.id = id;
    }

    public int getAcces ()
    {
        return acces;
    }

    public void setAcces (int acces)
    {
        this.acces = acces;
    }

    public int getCoutMana ()
    {
        return coutMana;
    }

    public void setCoutMana (int coutMana)
    {
        this.coutMana = coutMana;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getDieux ()
    {
        return dieux;
    }

    public void setDieux (String dieux)
    {
        this.dieux = dieux;
    }

    public int getDifficulte ()
    {
        return difficulte;
    }

    public void setDifficulte (int difficulte)
    {
        this.difficulte = difficulte;
    }

    public String getEcole ()
    {
        return ecole;
    }

    public void setEcole (String ecole)
    {
        this.ecole = ecole;
    }

    public String getFichier ()
    {
        return fichier;
    }

    public void setFichier (String fichier)
    {
        this.fichier = fichier;
    }

    public short getHitAndRun ()
    {
        return hitAndRun;
    }

    public void setHitAndRun (short hitAndRun)
    {
        this.hitAndRun = hitAndRun;
    }

    public int getId ()
    {
        return id;
    }

    public void setId (int id)
    {
        this.id = id;
    }

    public String getImage ()
    {
        return image;
    }

    public void setImage (String image)
    {
        this.image = image;
    }

    public String getImageBouton ()
    {
        return imageBouton;
    }

    public void setImageBouton (String imageBouton)
    {
        this.imageBouton = imageBouton;
    }

    public short getJs ()
    {
        return js;
    }

    public void setJs (short js)
    {
        this.js = js;
    }

    public int getNiveau ()
    {
        return niveau;
    }

    public void setNiveau (int niveau)
    {
        this.niveau = niveau;
    }

    public String getNom ()
    {
        return nom;
    }

    public void setNom (String nom)
    {
        this.nom = nom;
    }

    public String getNomCourt ()
    {
        return nomCourt;
    }

    public void setNomCourt (String nomCourt)
    {
        this.nomCourt = nomCourt;
    }

    public short getPnj ()
    {
        return pnj;
    }

    public void setPnj (short pnj)
    {
        this.pnj = pnj;
    }

    public int getPortee ()
    {
        return portee;
    }

    public void setPortee (int portee)
    {
        this.portee = portee;
    }

    public short getSoi ()
    {
        return soi;
    }

    public void setSoi (short soi)
    {
        this.soi = soi;
    }

    public String getVoie ()
    {
        return voie;
    }

    public void setVoie (String voie)
    {
        this.voie = voie;
    }
}