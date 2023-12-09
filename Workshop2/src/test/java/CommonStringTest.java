import org.junit.*;

public class CommonStringTest {
    @Test
    public void GivenTwoStrings_FindCommonCharacters_ThatShouldBeEqual()
    {
        FindCommonString obj = new FindCommonString();
        String a = "rat";
        String b = "cat";
        StringCharacters charArray1 = new StringCharacters(a.toCharArray());
        StringCharacters charArray2 = new StringCharacters(b.toCharArray());
        Assert.assertEquals("at",obj.commonString(charArray1.c,charArray2.c));
    }
}
