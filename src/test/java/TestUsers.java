import org.testng.Assert;

public class Test {
    @Test
    public void pressAndHoldDemoTest() {
        CustomAdapterPage customAdapterPage = new HomePage()
                .openVies()
                .openExpandableLists()
                .openCustomAdapter()
                .pressPeopleNamesNote();

        Assert.assertTrue(customAdapterPage.isSampleMenuDisplayed(), "sampleMenu is displayed");
    }
}
