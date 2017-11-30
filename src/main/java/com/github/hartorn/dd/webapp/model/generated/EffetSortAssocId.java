package com.github.hartorn.dd.webapp.model.generated;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: com.lejeu.ideo.model.generated.EffetSortAssoc
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class EffetSortAssocId
    implements Serializable
{
    static
    {
        // register persistent class in JVM
        try { Class.forName ("com.lejeu.ideo.model.generated.EffetSortAssoc"); }
        catch (Exception e) {}
    }

    public int effetSort;
    public int type;

    public EffetSortAssocId ()
    {
    }

    public EffetSortAssocId (String str)
    {
        fromString (str);
    }

    public int getEffetSort ()
    {
        return effetSort;
    }

    public void setEffetSort (int effetSort)
    {
        this.effetSort = effetSort;
    }

    public int getType ()
    {
        return type;
    }

    public void setType (int type)
    {
        this.type = type;
    }

    public String toString ()
    {
        return String.valueOf (effetSort)
            + "::" + String.valueOf (type);
    }

    public int hashCode ()
    {
        int rs = 17;
        rs = rs * 37 + effetSort;
        rs = rs * 37 + type;
        return rs;
    }

    public boolean equals (Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null || obj.getClass () != getClass ())
            return false;

        EffetSortAssocId other = (EffetSortAssocId) obj;
        return (effetSort == other.effetSort)
            && (type == other.type);
    }

    private void fromString (String str)
    {
        Tokenizer toke = new Tokenizer (str);
        str = toke.nextToken ();
        effetSort = Integer.parseInt (str);
        str = toke.nextToken ();
        type = Integer.parseInt (str);
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