package com.github.hartorn.dd.webapp.model.generated;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.apache.openjpa.jdbc.meta.ReverseMappingTool$AnnotatedCodeGenerator
 */
@Entity
@Table(schema="ideo", name="repertoire")
public class Repertoire
{
    @Basic
    @Column(columnDefinition="text", nullable=false, length=2147483647)
    private String bloques;

    @Basic
    @Column(columnDefinition="text", nullable=false, length=2147483647)
    private String commentaires;

    @Basic
    @Column(columnDefinition="text", nullable=false, length=2147483647)
    private String contacts;

    @Id
    @Column(columnDefinition="int4")
    private int perso;


    public Repertoire ()
    {
    }

    public Repertoire (int perso)
    {
        this.perso = perso;
    }

    public String getBloques ()
    {
        return bloques;
    }

    public void setBloques (String bloques)
    {
        this.bloques = bloques;
    }

    public String getCommentaires ()
    {
        return commentaires;
    }

    public void setCommentaires (String commentaires)
    {
        this.commentaires = commentaires;
    }

    public String getContacts ()
    {
        return contacts;
    }

    public void setContacts (String contacts)
    {
        this.contacts = contacts;
    }

    public int getPerso ()
    {
        return perso;
    }

    public void setPerso (int perso)
    {
        this.perso = perso;
    }
}