package com.github.hartorn.dd.webapp.model.generated;

import java.util.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.apache.openjpa.jdbc.meta.ReverseMappingTool$AnnotatedCodeGenerator
 */
@Entity
@Table(schema="ideo", name="tickets_surf")
public class TicketsSurf
{
    @Basic
    @Column(name="date_transaction", nullable=false)
    private Date dateTransaction;

    @Id
    @Column(name="id_transaction", columnDefinition="int8")
    private long idTransaction;

    @Basic
    @Column(columnDefinition="int2")
    private short result;


    public TicketsSurf ()
    {
    }

    public TicketsSurf (long idTransaction)
    {
        this.idTransaction = idTransaction;
    }

    public Date getDateTransaction ()
    {
        return dateTransaction;
    }

    public void setDateTransaction (Date dateTransaction)
    {
        this.dateTransaction = dateTransaction;
    }

    public long getIdTransaction ()
    {
        return idTransaction;
    }

    public void setIdTransaction (long idTransaction)
    {
        this.idTransaction = idTransaction;
    }

    public short getResult ()
    {
        return result;
    }

    public void setResult (short result)
    {
        this.result = result;
    }
}