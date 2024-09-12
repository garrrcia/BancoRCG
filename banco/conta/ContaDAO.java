package br.ufpe.cin.banco.conta;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

//Ver anotações TODO no código
@Dao
public interface ContaDAO {

    @Insert(entity = Conta.class, onConflict = OnConflictStrategy.REPLACE)
    void adicionar(Conta c);

    //TODO COMPLETED - incluir métodos para atualizar conta e remover conta
    @Delete(entity = Conta.class)
    void remover(Conta c);

    @Update(entity = Conta.class)
    void atualizar(Conta c);

    @Query("SELECT * FROM contas ORDER BY numero ASC")
    LiveData<List<Conta>> contas();

    @Query("SELECT * FROM contas ORDER BY numero ASC")
    List<Conta> getContas();

    //TODO COMPLETED - incluir métodos para buscar pelo (1) número da conta, (2) pelo nome e (3) pelo CPF do Cliente
    @Query("SELECT * FROM Conta WHERE numeroConta = :numeroConta")
    Conta buscarPeloNumero(String numeroConta);

    @Query("SELECT * FROM Conta WHERE nome LIKE :nome")
    List<Conta> buscarPorNome(String nome);

    @Query("SELECT * FROM Conta WHERE cpf = :cpf")
    List<Conta> buscarPorCpf(String cpf);
}
