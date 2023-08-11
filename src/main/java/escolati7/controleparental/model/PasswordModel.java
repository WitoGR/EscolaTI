package escolati7.controleparental.model;

import lombok.Getter;

public class PasswordModel {

    @Getter
    private String password;

    private Short[] part = new Short[6];

    public PasswordModel(){
        setPassword();
    }

    private void setPassword(){
        String resposta = "";

        for(int i = 0; i < 6; i++){
            this.part[i] = (short)Math.floor(Math.random()*(9-0+1)+0);// insere um numero aleatorio de 0 a 9 em um dos 8 vetores
            resposta += this.part[i];
        }

        this.password = resposta;// transforma o vetor em string e passa para a senha
    }

}
