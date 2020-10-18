/*
 * -------------------------------
 * -- 2020-10-18 (YYYY-MM-DD)
 *
 * --
 *
 * --
 * --
 *
 * --
 * --
 *
 * --
 */

import javax.swing.*;

// --
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
