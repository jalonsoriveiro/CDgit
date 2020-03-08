import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;

public class Cdgit {


    public static void main(String[] args) throws IOException {
        //creamos el objeto github realizando la conexion mediante token
        GitHub github = new GitHubBuilder().withOAuthToken("520e9f3a603e585eef77c305e437bb1d6adaaf23").build();
       //creamnos el repositorio
        GHRepository repo = github.createRepository(
                "new-repositorytoken","this is my new repository",
                "https://github.com/jalonsoriveiro/",true/*public*/);
        //añadimos colaborador
// repo.addCollaborators(github.getUser("damiancastelao"));
    }
}