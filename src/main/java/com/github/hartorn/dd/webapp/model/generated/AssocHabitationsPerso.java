package com.github.hartorn.dd.webapp.model.generated;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.apache.openjpa.jdbc.meta.ReverseMappingTool$AnnotatedCodeGenerator
 */
@Entity
@Table(schema="ideo", name="assoc_habitations_perso")
@IdClass(com.github.hartorn.dd.webapp.model.generated.AssocHabitationsPersoId.class)
public class AssocHabitationsPerso
{
    @Id
    @Column(columnDefinition="int4")
    private int idhabitation;

    @Id
    @Column(columnDefinition="int2")
    private short idperso;

    @Basic
    @Column(nullable=false, length=32)
    private String status;


    public AssocHabitationsPerso ()
    {
    }

    public AssocHabitationsPerso (int idhabitation, short idperso)
    {
        this.idhabitation = idhabitation;
        this.idperso = idperso;
    }

    public int getIdhabitation ()
    {
        return idhabitation;
    }

    public void setIdhabitation (int idhabitation)
    {
        this.idhabitation = idhabitation;
    }

    public short getIdperso ()
    {
        return idperso;
    }

    public void setIdperso (short idperso)
    {
        this.idperso = idperso;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }
}