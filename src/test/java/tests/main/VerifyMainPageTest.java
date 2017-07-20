package tests.main;

import functions.MainPageFunctions;
import org.testng.annotations.Test;
import settings.OpenBrowser;
import functions.AllInsetsFunctions;


/**
 * Created by yurii on 07.02.17.
 */
public class VerifyMainPageTest extends OpenBrowser
{
    //   Test main page important news
    @Test
    public void MainPageVerifyImportantNews()
    {
        MainPageFunctions.important_news(driver);
    }

    //   Test slider photo redirect to news
    @Test
    public void MainPageVerifySlider()
    {
        MainPageFunctions.slider_title(driver);
    }

    //   Test verify first news redirect
    @Test
    public void MainPageFirstNews()
    {
        MainPageFunctions.first_news(driver);
    }

    //   Test verify all news redirect
    @Test
    public void MainPageAllNews()
    {
        MainPageFunctions.all_news(driver);
    }

    //   Test verify all events redirect
    @Test
    public void MainPageAllEvents()
    {
        MainPageFunctions.all_events(driver);
    }

    //   Test verify first event
    @Test
    public void MainPageFirstEvent()
    {
        MainPageFunctions.first_event(driver);
    }

    //   Test main page link to photos
    @Test
    public void MainPageVerifyPhotosLink()
    {
        MainPageFunctions.main_page_photo(driver);
    }

    //   Test main page "all photos" link
    @Test
    public void MainPageAllPhotos()
    {
        MainPageFunctions.main_page_all_photos(driver);
    }

    //   Test main page video link
    @Test
    public void MainPageVideo()
    {
        MainPageFunctions.main_page_video(driver);
    }

    @Test
    public void MainPageAllVideos()
    {
        MainPageFunctions.main_page_all_videos(driver);
    }
/*
    @Test
    public void SupportUcuButton()
    {
        MainPageFunctions.support_ucu_button(driver);
    }

    @Test
    public void BecomeStudentButton()
    {
        MainPageFunctions.become_student_button(driver);
    }
*/
}
