package lee.yorizori_mybatis.recipe.serviece;

import lee.yorizori_mybatis.common.web.page.Params;
import lee.yorizori_mybatis.recipe.dto.Recipe;
import lee.yorizori_mybatis.recipe.dto.RecipeJoinRecipePro;

import java.util.List;


public interface RecipeService {
    public void create(RecipeJoinRecipePro recipeJoinRecipePro);
    public List<RecipeJoinRecipePro> findAllRecipe(Params params, int id);
    public int recipeCount(int bookid);

    public List<RecipeJoinRecipePro> findRecipeContents(int bookid);
}
