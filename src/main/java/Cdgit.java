import org.eclipse.jgit.api.Git;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class Cdgit {


    public static void main(String[] args) throws IOException {
            //creamos el objeto GitHUb con las conexion realizada
            GitHub github = new GitHubBuilder().withPassword("jalonsoriveiro", "").build();
            //clonar repositorio
        //Pedimos los valores necesarios para realizar el clonado
        String githubSourceUrl = Integer.parseInt(JOptionPane.showInputDialog('Dame tu repositorio'));
        String branchName = Integer.parseInt(JOptionPane.showInputDialog('rama'));
        String destinationFile = Integer.parseInt(JOptionPane.showInputDialog('url directorio destino'));
        int credentialsProvider = Integer.parseInt(JOptionPane.showInputDialog("credenciales"));
       //Realizamos el clonado
        Git.cloneRepository().setURI(githubSourceUrl)
                .setBranch(branchName)
                .setDirectory(new File(destinationFile))
                .setCredentialsProvider(credentialsProvider)
                .call();


    }
}