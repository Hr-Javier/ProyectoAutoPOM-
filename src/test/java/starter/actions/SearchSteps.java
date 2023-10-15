package starter.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import starter.pageobjects.SearchForm;

import java.util.List;

public class SearchSteps extends UIInteractionSteps {

    SearchForm searchForm;

    @Step("User searches for '{0}'")
    public void searchForTerm(String searchTerm) {
        find(SearchForm.SEARCH_FIELD).sendKeys(searchTerm);
        find(SearchForm.SEARCH_BUTTON).click();
    }

    @Step("Check the search results")
    public List<String> getSearchResults() {
        return findAll(SearchForm.ARTICLE_HEADINGS).texts();
    }
}