package com.github.hartorn.dd.webapp.model.generated;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: com.lejeu.ideo.model.generated.Bannis
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class BannisId
    implements Serializable
{
    static
    {
        // register persistent class in JVM
        try { Class.forName ("com.lejeu.ideo.model.generated.Bannis"); }
        catch (Exception e) {}
    }

    public int perso;
    public int ville;

    public BannisId ()
    {
    }

    public BannisId (String str)
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

    public int getVille ()
    {
        return ville;
    }

    public void setVille (int ville)
    {
        this.ville = ville;
    }

    public String toString ()
    {
        return String.valueOf (perso)
            + "::" + String.valueOf (ville);
    }

    public int hashCode ()
    {
        int rs = 17;
        rs = rs * 37 + perso;
        rs = rs * 37 + ville;
        return rs;
    }

    public boolean equals (Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null || obj.getClass () != getClass ())
            return false;

        BannisId other = (BannisId) obj;
        return (perso == other.perso)
            && (ville == other.ville);
    }

    private void fromString (String str)
    {
        Tokenizer toke = new Tokenizer (str);
        str = toke.nextToken ();
        perso = Integer.parseInt (str);
        str = toke.nextToken ();
        ville = Integer.parseInt (str);
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