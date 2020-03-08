import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;

public class Cdgit {


    public static void main(String[] args) throws IOException {
        // If you don't specify the GitHub user id then the sdk will retrieve it via /user endpoint
// GitHub github = new GitHubBuilder().withOAuthToken("520e9f3a603e585eef77c305e437bb1d6adaaf23").build();
        GitHub github =
                GitHubBuilder.fromPropertyFile("/home/local/DANIELCASTELAO/jalonsoriveiro/IdeaProjects/progGit/src/main/java/.github").build();
        GHRepository repo = github.createRepository(
                "CDpruebatoken2","this is my new repository",
                "https://github.com/jalonsoriveiro/",true/*public*/);
//repo.addCollaborators(github.getUser("damiancastelao"));
    }
}