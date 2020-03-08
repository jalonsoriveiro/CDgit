import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;

public class Cdgit {


    public static void main(String[] args) throws IOException {

        //crear el objeto github realizando la autenticación mediante un fichero con el token
        GitHub github =
                GitHubBuilder.fromPropertyFile("/home/local/DANIELCASTELAO/jalonsoriveiro/IdeaProjects/progGit/src/main/java/.github").build();
       //Creamos el repositorio
        GHRepository repo = github.createRepository(
                "CDpruebatoken2","this is my new repository",
                "https://github.com/jalonsoriveiro/",true/*public*/);
        //añadimos colaborador
//repo.addCollaborators(github.getUser("damiancastelao"));
    }
}