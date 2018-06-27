package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ConsultaProdutos {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @param Dados
	 * @return Var
	 */
	// ConsultaProdutos
	public static Var Executar(Var Dados) throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				return cronapi.database.Operations.query(Var.valueOf("app.entity.Produtos"),
						Var.valueOf("select a, p.descricao from Produtos p, Alunos a where a.nome = \'Edson\'"));
			}
		}.call();
	}

}
