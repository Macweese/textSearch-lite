/*
 * Hussein Al Noori, han951108@gmail.com
 * Datum 2020-10-17 (YYYY-MM-DD)
 *
 * Lösning till inlämningsuppgift 1 del 2.1
 *
 * Skapa en klassmetod som räknar hur många gånger ett visst tecken finns i en sträng.
 * Om man t.ex. har variabeln test av typen String och vill veta hur många gånger bokstaven ’t’ förekommer i texten kan man skriva
 *
 * String test = "Lite test text.";
 * int antal = antalTecken(test, 't');
 *
 * Skriv ett testprogram och testkör din klassmetod med olika strängar.
 */

import javax.swing.*;

// Uppgift 1 Del 2
public class textSearch
{
    static String textContents;
    static String[] contents;
    static String keywordSearch;
    static int n;
    static int wordMatch;

    public static void getSearchInputs()
    {
        textContents = JOptionPane.showInputDialog(null, "Enter the text that needs to be searched");
        if (textContents == null)
        {
            System.out.println("No content provided or user canceled operation.\nExiting program.");
            System.exit(0);
        }

        keywordSearch = JOptionPane.showInputDialog(null, "Search for:");
        if (keywordSearch == null)
        {
            System.out.println("No search term provided or user canceled operation.\nExiting program.");
            System.exit(0);
        }

        contents = textContents.split(" ");
    }

    public static void counter()
    {
        if (keywordSearch == null || keywordSearch.equals(""))
        {
            System.out.println("Not a valid search term.\nExiting program.");
            JOptionPane.showMessageDialog(null,  "Not a valid search term.", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        else
        {
            for (int i = 0; i < textContents.length(); i++)
            {
                if (textContents.startsWith(keywordSearch, i))
                    n++;
            }

            for (String content : contents)
            {
                if (content.contains(keywordSearch))
                    wordMatch++;

            }

            JOptionPane.showMessageDialog(null,
                    "The searched keyword '" + keywordSearch + "' was found " + n + " times." +
                    "\nThere were " + wordMatch + " words containing the searched term.");
        }

    }

}

class kursUppgift
{
    public static void main(String[] args)
    {
        textSearch.getSearchInputs();
        textSearch.counter();
    }
}