package com.github.hartorn.dd.webapp.model.generated;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Entity
@Table(schema = "spring", name = "actions")
@Data
public class Actions {
    @Basic
    @Column(name = "action_js", length = 128)
    private String actionJs;

    @Basic
    @Column(name = "affichage_js", nullable = false, length = 32)
    private String affichageJs;

    @Basic
    @Column(columnDefinition = "int4")
    private int competence;

    @Basic
    @Column(columnDefinition = "text", nullable = false, length = 2147483647)
    private String condition;

    @Basic
    @Column(nullable = false)
    private String description;

    @Id
    @Column(columnDefinition = "int4")
    private int id;

    @Basic
    @Column(nullable = false, length = 32)
    private String image;

    @Basic
    @Column(nullable = false, length = 32)
    private String nom;

    @Basic
    @Column(name = "nom_court", length = 32)
    private String nomCourt;

    @Basic
    @Column(columnDefinition = "int2")
    private short pa;

    @Basic
    @Column(columnDefinition = "int2")
    private short parole;

    @Basic
    @Column(columnDefinition = "int2")
    private short pm;

    @Basic
    @Column(nullable = false, length = 64)
    private String script;

    @Basic
    @Column(columnDefinition = "int4")
    private int type;

    @Basic
    @Column(columnDefinition = "int2")
    private short xp;
}