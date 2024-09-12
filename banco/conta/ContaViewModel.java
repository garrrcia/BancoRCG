package br.ufpe.cin.banco.conta;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

import br.ufpe.cin.banco.BancoDB;

//Ver métodos anotados com TODO
public class ContaViewModel extends AndroidViewModel {

    private ContaRepository repository;
    public LiveData<List<Conta>> contas;
    private MutableLiveData<Conta> _contaAtual = new MutableLiveData<>();
    public LiveData<Conta> contaAtual = _contaAtual;

    public ContaViewModel(@NonNull Application application) {
        super(application);
        this.repository = new ContaRepository(BancoDB.getDB(application).contaDAO());
        this.contas = repository.getContas();
    }

    void inserir(Conta c) {

        new Thread(() -> repository.inserir(c)).start();
    }

    void atualizar(Conta c) {
        //TODO COMPLETED - implementar
        new Thread(() -> repository.atualizar(c)).start();
    }

    void remover(Conta c) {
        //TODO COMPLETED - implementar
        new Thread(() -> repository.remover(c)).start();
    }

    void buscarPeloNumero(String numeroConta) {
        //TODO COMPLETED - implementar
        new Thread(() -> {
            Conta conta = repository.buscarPeloNumero(numeroConta);
            _contaAtual.postValue(conta);

        }).start();
    }
}
