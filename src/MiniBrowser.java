import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;

/**
 * A complete Java class that demonstrates how to create an HTML viewer with styles,
 * using the JEditorPane, HTMLEditorKit, StyleSheet, and JFrame.
 * 
 * @author alvin alexander, devdaily.com.
 *
 */
public class MiniBrowser
{
  public static void main(String[] args)
  {
    new MiniBrowser();
  }
  
  public MiniBrowser()
  {
    SwingUtilities.invokeLater(new Runnable()
    {
      public void run()
      {
        // create jeditorpane
        JEditorPane jEditorPane = new JEditorPane();
        
        // make it read-only
        jEditorPane.setEditable(false);
        
        // create a scrollpane; modify its attributes as desired
        JScrollPane scrollPane = new JScrollPane(jEditorPane);
        
        // add an html editor kit
        HTMLEditorKit kit = new HTMLEditorKit();
        jEditorPane.setEditorKit(kit);
        
        // add some styles to the html
        StyleSheet styleSheet = kit.getStyleSheet();
        styleSheet.addRule("body {color:#000; font-family:times; margin: 4px; }");
        styleSheet.addRule("h1 {color: blue;}");
        styleSheet.addRule("h2 {color: #ff0000;}");
        styleSheet.addRule("pre {font : 10px monaco; color : black; background-color : #fafafa; }");

        // create some simple html as a string
        String htmlString = "<html><img  src=\"data:image/jpeg;base64,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\" /></html>";
        
        // create a document, set it on the jeditorpane, then add the html
        Document doc = kit.createDefaultDocument();
        jEditorPane.setDocument(doc);
        jEditorPane.setText(htmlString);

        // now add it all to a frame
        JFrame j = new JFrame("HtmlEditorKit Test");
        j.getContentPane().add(scrollPane, BorderLayout.CENTER);

        // make it easy to close the application
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // display the frame
        j.setSize(new Dimension(300,200));
        
        // pack it, if you prefer
        //j.pack();
        
        // center the jframe, then make it visible
        j.setLocationRelativeTo(null);
        j.setVisible(true);
      }
    });
  }
}