import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;

public class Cdgit {


    public static void main(String[] args) throws IOException {
            //creamos el objeto GitHUb con las conexion realizada
            GitHub github = new GitHubBuilder().withPassword("jalonsoriveiro", "").build();
            //Creamos el repositorio
            GHRepository repo = github.createRepository(
                    "HelloCD","this is my new repository",
                    "https://github.com/jalonsoriveiro/",true/*public*/);
           //añadimos un colaborador a nuestro repositorio
            // repo.addCollaborators(github.getUser("damiancastelao"));
    }
}