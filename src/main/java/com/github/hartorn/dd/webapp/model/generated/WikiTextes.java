package com.github.hartorn.dd.webapp.model.generated;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.apache.openjpa.jdbc.meta.ReverseMappingTool$AnnotatedCodeGenerator
 */
@Entity
@Table(schema="ideo", name="wiki_textes")
public class WikiTextes
{
    @Id
    @Column(columnDefinition="int8")
    private long id;

    @Basic
    @Column(nullable=false)
    private String menus;

    @Basic
    @Column(length=40)
    private String prefixe;

    @Basic
    @Column(columnDefinition="int2")
    private short securite;

    @Basic
    @Column(columnDefinition="text", nullable=false, length=2147483647)
    private String texte;

    @Basic
    @Column(nullable=false, length=64)
    private String titre;


    public WikiTextes ()
    {
    }

    public WikiTextes (long id)
    {
        this.id = id;
    }

    public long getId ()
    {
        return id;
    }

    public void setId (long id)
    {
        this.id = id;
    }

    public String getMenus ()
    {
        return menus;
    }

    public void setMenus (String menus)
    {
        this.menus = menus;
    }

    public String getPrefixe ()
    {
        return prefixe;
    }

    public void setPrefixe (String prefixe)
    {
        this.prefixe = prefixe;
    }

    public short getSecurite ()
    {
        return securite;
    }

    public void setSecurite (short securite)
    {
        this.securite = securite;
    }

    public String getTexte ()
    {
        return texte;
    }

    public void setTexte (String texte)
    {
        this.texte = texte;
    }

    public String getTitre ()
    {
        return titre;
    }

    public void setTitre (String titre)
    {
        this.titre = titre;
    }
}