package br.ufpe.cin.banco.conta;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import br.ufpe.cin.banco.R;

//Ver anotações TODO no código
public class AdicionarContaActivity extends AppCompatActivity {

    ContaViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_conta);
        viewModel = new ViewModelProvider(this).get(ContaViewModel.class);

        Button btnAtualizar = findViewById(R.id.btnAtualizar);
        Button btnRemover = findViewById(R.id.btnRemover);
        EditText campoNome = findViewById(R.id.nome);
        EditText campoNumero = findViewById(R.id.numero);
        EditText campoCPF = findViewById(R.id.cpf);
        EditText campoSaldo = findViewById(R.id.saldo);

        btnAtualizar.setText("Inserir");
        btnRemover.setVisibility(View.GONE);

        btnAtualizar.setOnClickListener(
                v -> {
                    String nomeCliente = campoNome.getText().toString();
                    String cpfCliente = campoCPF.getText().toString();
                    String numeroConta = campoNumero.getText().toString();
                    String saldoConta = campoSaldo.getText().toString();

                    //TODO: COMPLETED - Incluir validações aqui, antes de criar um objeto Conta (por exemplo, verificar que digitou um nome com pelo menos 5 caracteres, que o campo de saldo tem de fato um número, assim por diante). Se todas as validações passarem, aí sim cria a Conta conforme linha abaixo.

                    if (nomeCliente.isEmpty() || cpfCliente.isEmpty() || numeroConta.isEmpty() || saldoConta.isEmpty())
                    {
                        //Exibir mensagem de erro para o usuário
                        Toast.makeText(this, "Todos os campos são obrigatórios.", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    //Validação de CPF (implementar uma lógica mais robusta para validação de CPF)
                    if (!cpfCliente.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
                        Toast.makeText(this, "CPF inválido.", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    // Validação de saldo (verificar se é um número decimal válido)
                    try {
                        Double.parseDouble(saldoConta);
                    } catch (NumberFormatException e) {
                        Toast.makeText(this, "Saldo inválido.", Toast.LENGTH_SHORT).show();
                        return;

                    }
                    Conta c = new Conta(numeroConta, Double.parseDouble(saldoConta), nomeCliente, cpfCliente);

                    //TODO: COMPLETED - chamar o método que vai salvar a conta no Banco de Dados
                    viewModel.inserir(c);

                    Toast.makeText(this, "Conta salva com sucesso!", Toast.LENGTH_SHORT).show();

                    //Limpar os campos após salvar
                    campoNome.setText("");




                }
        );

    }
}