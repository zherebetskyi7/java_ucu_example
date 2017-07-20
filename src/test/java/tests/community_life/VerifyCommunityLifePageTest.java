package tests.community_life;

import functions.CommunityLifePageFunctions;
import org.testng.annotations.Test;
import settings.OpenBrowser;

/**
 * Created by yurii on 21.02.17.
 */
public class VerifyCommunityLifePageTest extends OpenBrowser
{
    //    Tests for block Services
    @Test
    public void CommunityDinningRoom()
    {
        CommunityLifePageFunctions.dinning_room_inset(driver);
    }
    @Test
    public void CommunityCollegium()
    {
        CommunityLifePageFunctions.collegium_inset(driver);
    }
    @Test
    public void CommunityConferenceService()
    {
        CommunityLifePageFunctions.conference_service_inset(driver);
    }

    //   Tests for block Students Lifa
    @Test
    public void CommunityEntranceInto()
    {
        CommunityLifePageFunctions.entrance_into_inset(driver);
    }
    @Test
    public void CommunityFormationProgram()
    {
        CommunityLifePageFunctions.formation_program_inset(driver);
    }
    @Test
    public void CommunityCollegeWorkshops()
    {
        CommunityLifePageFunctions.college_workshops_inset(driver);
    }

    //  museum
    @Test
    public void CommunityAboutMuseum()
    {
        CommunityLifePageFunctions.more_about_museum_inset(driver);
    }
    //  emuas
    @Test
    public void CommunityAboutEmaus()
    {
        CommunityLifePageFunctions.more_about_emuas_inset(driver);
    }
}
