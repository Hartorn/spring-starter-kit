package com.github.hartorn.dd.webapp.model.generated;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: com.lejeu.ideo.model.generated.EvenementsAssoc
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class EvenementsAssocId
    implements Serializable
{
    static
    {
        // register persistent class in JVM
        try { Class.forName ("com.lejeu.ideo.model.generated.EvenementsAssoc"); }
        catch (Exception e) {}
    }

    public long evenement;
    public int perso;
    public short type;

    public EvenementsAssocId ()
    {
    }

    public EvenementsAssocId (String str)
    {
        fromString (str);
    }

    public long getEvenement ()
    {
        return evenement;
    }

    public void setEvenement (long evenement)
    {
        this.evenement = evenement;
    }

    public int getPerso ()
    {
        return perso;
    }

    public void setPerso (int perso)
    {
        this.perso = perso;
    }

    public short getType ()
    {
        return type;
    }

    public void setType (short type)
    {
        this.type = type;
    }

    public String toString ()
    {
        return String.valueOf (evenement)
            + "::" + String.valueOf (perso)
            + "::" + String.valueOf (type);
    }

    public int hashCode ()
    {
        int rs = 17;
        rs = rs * 37 + (int) (evenement ^ (evenement >>> 32));
        rs = rs * 37 + perso;
        rs = rs * 37 + (int) type;
        return rs;
    }

    public boolean equals (Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null || obj.getClass () != getClass ())
            return false;

        EvenementsAssocId other = (EvenementsAssocId) obj;
        return (evenement == other.evenement)
            && (perso == other.perso)
            && (type == other.type);
    }

    private void fromString (String str)
    {
        Tokenizer toke = new Tokenizer (str);
        str = toke.nextToken ();
        evenement = Long.parseLong (str);
        str = toke.nextToken ();
        perso = Integer.parseInt (str);
        str = toke.nextToken ();
        type = Short.parseShort (str);
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