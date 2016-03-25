package com.github.hartorn.dd.webapp.model.generated;

import java.io.*;
import java.util.*;

/**
 * Application identity class for: com.lejeu.ideo.model.generated.Carte
 *
 * Auto-generated by:
 * org.apache.openjpa.enhance.ApplicationIdTool
 */
public class CarteId
    implements Serializable
{
    static
    {
        // register persistent class in JVM
        try { Class.forName ("com.lejeu.ideo.model.generated.Carte"); }
        catch (Exception e) {}
    }

    public int id;
    public int x;
    public int y;

    public CarteId ()
    {
    }

    public CarteId (String str)
    {
        fromString (str);
    }

    public int getId ()
    {
        return id;
    }

    public void setId (int id)
    {
        this.id = id;
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

    public String toString ()
    {
        return String.valueOf (id)
            + "::" + String.valueOf (x)
            + "::" + String.valueOf (y);
    }

    public int hashCode ()
    {
        int rs = 17;
        rs = rs * 37 + id;
        rs = rs * 37 + x;
        rs = rs * 37 + y;
        return rs;
    }

    public boolean equals (Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null || obj.getClass () != getClass ())
            return false;

        CarteId other = (CarteId) obj;
        return (id == other.id)
            && (x == other.x)
            && (y == other.y);
    }

    private void fromString (String str)
    {
        Tokenizer toke = new Tokenizer (str);
        str = toke.nextToken ();
        id = Integer.parseInt (str);
        str = toke.nextToken ();
        x = Integer.parseInt (str);
        str = toke.nextToken ();
        y = Integer.parseInt (str);
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