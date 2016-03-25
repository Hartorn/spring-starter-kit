package com.github.hartorn.dd.webapp.model.generated;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: com.lejeu.ideo.model.generated.TitresJoueurs
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class TitresJoueursId
    implements Serializable
{
    static
    {
        // register persistent class in JVM
        try { Class.forName ("com.lejeu.ideo.model.generated.TitresJoueurs"); }
        catch (Exception e) {}
    }

    public int perso;
    public int royaume;
    public int titre;

    public TitresJoueursId ()
    {
    }

    public TitresJoueursId (String str)
    {
        fromString (str);
    }

    public int getPerso ()
    {
        return perso;
    }

    public void setPerso (int perso)
    {
        this.perso = perso;
    }

    public int getRoyaume ()
    {
        return royaume;
    }

    public void setRoyaume (int royaume)
    {
        this.royaume = royaume;
    }

    public int getTitre ()
    {
        return titre;
    }

    public void setTitre (int titre)
    {
        this.titre = titre;
    }

    public String toString ()
    {
        return String.valueOf (perso)
            + "::" + String.valueOf (royaume)
            + "::" + String.valueOf (titre);
    }

    public int hashCode ()
    {
        int rs = 17;
        rs = rs * 37 + perso;
        rs = rs * 37 + royaume;
        rs = rs * 37 + titre;
        return rs;
    }

    public boolean equals (Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null || obj.getClass () != getClass ())
            return false;

        TitresJoueursId other = (TitresJoueursId) obj;
        return (perso == other.perso)
            && (royaume == other.royaume)
            && (titre == other.titre);
    }

    private void fromString (String str)
    {
        Tokenizer toke = new Tokenizer (str);
        str = toke.nextToken ();
        perso = Integer.parseInt (str);
        str = toke.nextToken ();
        royaume = Integer.parseInt (str);
        str = toke.nextToken ();
        titre = Integer.parseInt (str);
    }

    protected static class Tokenizer
    {
        private final String str;
        private int last;

        public Tokenizer (String str)
        {
            this.str = str;
        }

        public String nextToken ()
        {
            int next = str.indexOf ("::", last);
            String part;
            if (next == -1)
            {
                part = str.substring (last);
                last = str.length ();
            }
            else
            {
                part = str.substring (last, next);
                last = next + 2;
            }
            return part;
        }
    }
}