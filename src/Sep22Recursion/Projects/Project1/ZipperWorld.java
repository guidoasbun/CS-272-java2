//package Sep22Recursion.Projects.Project1;
//
//public class ZipperWorld
//{
//    public ZipperWord(String word1, String word2)
//    {
//        assert word1.length() == word2.length();
//        first = word1;
//        second = word2;
//    }
//
//    public String toString()
//    {
//        StringBuilder zippedWord = new StringBuilder();
//        int index1 = 0, index2 = 0;
//
//        while (index1 < first.length() || index2 < second.length()) {
//            if (index1 < first.length()) {
//                zippedWord.append(first.charAt(index1));
//                index1++;
//            }
//            if (index2 < second.length()) {
//                zippedWord.append(second.charAt(index2));
//                index2++;
//            }
//        }
//        return zippedWord.toString();
//    }
//
//    private String first;
//    private String second;
//
//    // this method is used to check your work
//
//    public static String check(String word1, String word2)
//    {
//        ZipperWord zippy = new ZipperWord(word1, word2);
//        return zippy.toString();
//    }
//}
