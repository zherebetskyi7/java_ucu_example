package tests.science;

import functions.SciencePageFunctions;
import org.testng.annotations.Test;
import settings.OpenBrowser;

/**
 * Created by yurii on 17.02.17.
 */
public class VerifyLinksSciencePage extends OpenBrowser
{
    @Test
    public void church_institute()
    {
        SciencePageFunctions.choose_church_institute(driver);
    }


    //   Institutes
    @Test
    public void management_institute()
    {
        SciencePageFunctions.choose_church_institute(driver);
    }

    @Test
    public void liturgy_science()
    {
        SciencePageFunctions.choose_liturgy_science(driver);
    }

    @Test
    public void mental_health()
    {
        SciencePageFunctions.choose_mental_health(driver);
    }

    @Test
    public void religion_community()
    {
        SciencePageFunctions.choose_religion_community(driver);
    }

    @Test
    public void family()
    {
        SciencePageFunctions.choose_family(driver);
    }

    @Test
    public void catethical()
    {
        SciencePageFunctions.choose_catechetical(driver);
    }


    //   Blocks
    @Test
    public void science_department()
    {
        SciencePageFunctions.click_on_science_department(driver);
    }
    @Test
    public void repository()
    {
        SciencePageFunctions.click_on_repository(driver);
    }
    @Test
    public void opportunities_trainings()
    {
        SciencePageFunctions.click_on_opportunities_and_training(driver);
    }
    @Test
    public void edition()
    {
        SciencePageFunctions.click_on_edition(driver);
    }
    @Test
    public void ucu_events()
    {
        SciencePageFunctions.click_on_ucu_events(driver);
    }
}
