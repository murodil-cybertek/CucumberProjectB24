package com.cybertek.step_definitions;

import com.cybertek.pages.MockarooPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.ExcelUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class MockarooStepDefs {

    MockarooPage mockarooPage = new MockarooPage();

    @Given("User is on mockaroo homepage")
    public void user_is_on_mockaroo_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("mockaroo.url"));
    }

    @Given("Number of rows is {int}")
    public void number_of_rows_is(int rowsCount) {
        //mockarooPage.numberOfRowsField.clear();
        mockarooPage.numberOfRowsField.sendKeys(Keys.DELETE);
        mockarooPage.numberOfRowsField.sendKeys(rowsCount+"");
    }

    @Given("Format is Excel")
    public void format_is_excel() {
//        mockarooPage.formatDropDown.click();
//        mockarooPage.excelOption.click();
        mockarooPage.selectExcelFormat();
    }

    @When("User clicks on preview")
    public void user_clicks_on_preview() {
        mockarooPage.previewBtn.click();
    }

    @Then("following columns should be displayed:")
    public void following_columns_should_be_displayed(List<String> expectedColumns) {
        System.out.println("ExpectedColumns = " + expectedColumns);

        //List<WebElement> => getText() => List<String> actualColumns => Compare with expectedColumns

        List<String> actualColumns = new ArrayList<>();

        //Read text of each tableHeader and Store into actualColumns list
        for (WebElement headerName : mockarooPage.tableHeaders) {
            actualColumns.add( headerName.getText() );
        }

        //using BrowserUtils method
        List<String> actualHeaderNames = BrowserUtils.getElementsText(mockarooPage.tableHeaders);

        //compare that expectedColumns from feature file matching actual columns
        Assert.assertEquals(expectedColumns , actualColumns);
        Assert.assertEquals(expectedColumns , actualHeaderNames);

    }

    @Then("{int} rows of data should be displayed")
    public void rows_of_data_should_be_displayed(int expectedRowsCount) {
        Assert.assertEquals(expectedRowsCount, mockarooPage.tableRows.size());
    }

    @When("User clicks on download")
    public void userClicksOnDownload() {
        mockarooPage.downloadBtn.click();
    }

    int excelFileRowsCount;

    @Then("following columns should be displayed in excel file:")
    public void followingColumnsShouldBeDisplayedInExcelFile(List<String> expectedColumns)  throws Exception {
        //Open downloaded excel file
        String filePath = System.getProperty("user.home") + "/Downloads/MOCK_DATA.xlsx";
        ExcelUtil excel = new ExcelUtil(filePath, "data");
        Assert.assertEquals(expectedColumns, excel.getColumnsNames());

//        FileInputStream in = new FileInputStream(filePath);
//        XSSFWorkbook workbook = new XSSFWorkbook(in);
//        XSSFSheet worksheet = workbook.getSheetAt(0);
//        //get number of column names. top row and cells count
//        int excelHeadersCount = worksheet.getRow(0).getPhysicalNumberOfCells();
//        excelFileRowsCount = worksheet.getLastRowNum();
//
//        List<String> actualColumns = new ArrayList<>();
//
//        //loop and read column names and store into List<String> actualColumns
//        for(int i = 0; i < excelHeadersCount; i++) {
//            actualColumns.add( worksheet.getRow(0).getCell(i).toString());
//        }
//
//        Assert.assertEquals(expectedColumns, actualColumns);

    }

    @And("{int} rows of data should be displayed in excel file")
    public void rowsOfDataShouldBeDisplayedInExcelFile(int numberOfRows) {
        String filePath = System.getProperty("user.home") + "/Downloads/MOCK_DATA.xlsx";
        ExcelUtil excel = new ExcelUtil(filePath, "data");
        excelFileRowsCount = excel.rowCount();
        Assert.assertEquals(numberOfRows , excelFileRowsCount);
    }
}
