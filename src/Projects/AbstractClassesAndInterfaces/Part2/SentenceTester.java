package Projects.AbstractClassesAndInterfaces.Part2;

public class SentenceTester
{
    public static void main(String[] args)
    {
        DataSet data = new DataSet();

        data.add(new Sentence("Mary had a little lamb."));
        data.add(new Sentence("Its face was white as snow."));
        data.add(new Sentence("And everywhere that Mary went,"));
        data.add(new Sentence("The lamb was sure to go."));

        System.out.println("Average measure: "
                + data.getAverage());
        System.out.println("Expected: 5.5");
    }
}
