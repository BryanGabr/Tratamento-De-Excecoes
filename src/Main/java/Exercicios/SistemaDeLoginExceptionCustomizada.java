package Main.java.Exercicios;

import javax.swing.*;

public class SistemaDeLoginExceptionCustomizada {
    private String usuario;
    private String senha;

    public SistemaDeLoginExceptionCustomizada(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void login(String usuario, String senha) throws LoginInvalidoException, UsuarioInvalidoException, SenhaInvalidoException {
        if (!this.usuario.equals(usuario) && !this.senha.equals(senha)) throw new LoginInvalidoException();

        if (!this.usuario.equals(usuario)) throw new UsuarioInvalidoException();

        if (!this.senha.equals(senha)) throw new SenhaInvalidoException();

        System.out.println("Login efetuado com sucesso! ");
    }

    @Override
    public String toString() {
        return "SistemaDeLoginExceptionCustomizada{" +
                "usuario='" + usuario + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }

    public static void main(String[] args) {

        SistemaDeLoginExceptionCustomizada user = new SistemaDeLoginExceptionCustomizada("Bryan Gabriel", "1234");

        String usuario = JOptionPane.showInputDialog("Informe o usuário: ");
        String senha = JOptionPane.showInputDialog("Informe a senha: ");

        try {
            user.login(usuario, senha);
        } catch (LoginInvalidoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (UsuarioInvalidoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SenhaInvalidoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}

class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("Usuário e senha inválidos!");
    }
}

class UsuarioInvalidoException extends Exception {

    public UsuarioInvalidoException() {
        super("Usuário inválido!");
    }

}

class SenhaInvalidoException extends Exception {

    public SenhaInvalidoException() {
        super("Senha inválida!");
    }

}