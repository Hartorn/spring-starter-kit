package com.github.hartorn.dd.webapp.model.generated;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.apache.openjpa.jdbc.meta.ReverseMappingTool$AnnotatedCodeGenerator
 */
@Entity
@Table(schema="ideo", name="batiments")
public class Batiments
{
    @Basic
    @Column(nullable=false, length=128)
    private String avancement;

    @Basic
    @Column(columnDefinition="int2")
    private short banniere;

    @Basic
    @Column(columnDefinition="int2")
    private short chantier;

    @Basic
    @Column(columnDefinition="text", nullable=false, length=2147483647)
    private String description;

    @Basic
    @Column(columnDefinition="int2")
    private short hauteur;

    @Id
    @Column(columnDefinition="int8")
    private long id;

    @Basic
    @Column(name="id_template", columnDefinition="int8")
    private long idTemplate;

    @Basic
    @Column(length=50)
    private String image;

    @Basic
    @Column(columnDefinition="int2")
    private short largeur;

    @Basic
    @Column(name="limite_action", columnDefinition="int8")
    private long limiteAction;

    @Basic
    @Column(nullable=false, length=45)
    private String nom;

    @Basic
    @Column(columnDefinition="int8")
    private long param;

    @Basic
    @Column(columnDefinition="int8")
    private long terrain;

    @Basic
    @Column(columnDefinition="int4")
    private int type;

    @Basic
    @Column(columnDefinition="int2")
    private short ville;

    @Basic
    @Column(columnDefinition="int4")
    private int x;

    @Basic
    @Column(columnDefinition="int4")
    private int y;


    public Batiments ()
    {
    }

    public Batiments (long id)
    {
        this.id = id;
    }

    public String getAvancement ()
    {
        return avancement;
    }

    public void setAvancement (String avancement)
    {
        this.avancement = avancement;
    }

    public short getBanniere ()
    {
        return banniere;
    }

    public void setBanniere (short banniere)
    {
        this.banniere = banniere;
    }

    public short getChantier ()
    {
        return chantier;
    }

    public void setChantier (short chantier)
    {
        this.chantier = chantier;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public short getHauteur ()
    {
        return hauteur;
    }

    public void setHauteur (short hauteur)
    {
        this.hauteur = hauteur;
    }

    public long getId ()
    {
        return id;
    }

    public void setId (long id)
    {
        this.id = id;
    }

    public long getIdTemplate ()
    {
        return idTemplate;
    }

    public void setIdTemplate (long idTemplate)
    {
        this.idTemplate = idTemplate;
    }

    public String getImage ()
    {
        return image;
    }

    public void setImage (String image)
    {
        this.image = image;
    }

    public short getLargeur ()
    {
        return largeur;
    }

    public void setLargeur (short largeur)
    {
        this.largeur = largeur;
    }

    public long getLimiteAction ()
    {
        return limiteAction;
    }

    public void setLimiteAction (long limiteAction)
    {
        this.limiteAction = limiteAction;
    }

    public String getNom ()
    {
        return nom;
    }

    public void setNom (String nom)
    {
        this.nom = nom;
    }

    public long getParam ()
    {
        return param;
    }

    public void setParam (long param)
    {
        this.param = param;
    }

    public long getTerrain ()
    {
        return terrain;
    }

    public void setTerrain (long terrain)
    {
        this.terrain = terrain;
    }

    public int getType ()
    {
        return type;
    }

    public void setType (int type)
    {
        this.type = type;
    }

    public short getVille ()
    {
        return ville;
    }

    public void setVille (short ville)
    {
        this.ville = ville;
    }

    public int getX ()
    {
        return x;
    }

    public void setX (int x)
    {
        this.x = x;
    }

    public int getY ()
    {
        return y;
    }

    public void setY (int y)
    {
        this.y = y;
    }
}