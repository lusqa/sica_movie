package br.edu.uni7.sicamovie.persistence;

import static br.edu.uni7.sicamovie.persistence.tables.Diretor.DIRETOR;
import static br.edu.uni7.sicamovie.persistence.tables.Filme.FILME;
import static br.edu.uni7.sicamovie.persistence.tables.FilmePremio.FILME_PREMIO;
import static br.edu.uni7.sicamovie.persistence.tables.Genero.GENERO;
import static br.edu.uni7.sicamovie.persistence.tables.Ingresso.INGRESSO;
import static br.edu.uni7.sicamovie.persistence.tables.Sala.SALA;
import static br.edu.uni7.sicamovie.persistence.tables.Sessao.SESSAO;
import static br.edu.uni7.sicamovie.persistence.tables.TipoIngresso.TIPO_INGRESSO;
import static org.jooq.impl.DSL.count;
import static org.jooq.impl.DSL.countDistinct;
import static org.jooq.impl.DSL.trunc;
import static org.jooq.impl.DSL.select;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.DatePart;
import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Record6;
import org.jooq.Record9;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.Select;
import org.jooq.conf.Settings;
import org.jooq.impl.DSL;

public class Queries implements Closeable {
	
	private DSLContext dbContext;
	private Connection dbConn;
	
	public Queries() {
	
	}

	private Connection getDbConn() {
		if (dbConn == null) {
			String userName = "root";
			String password = "eus4wg25";
			String url = "jdbc:mysql://localhost:3306/bd_sica_movie?serverTimezone=UTC";

			try {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				dbConn = DriverManager.getConnection(url, userName, password);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dbConn;
	}
	
	
	public DSLContext getDbContext() {
		if (dbContext == null) {
			dbContext = DSL.using(getDbConn(), SQLDialect.MYSQL, new Settings().withRenderFormatted(true));
		}
		return dbContext;
	}
	
	public Object[][] getFilmsPrizesAndExibitions() {
		Select<Record9<Integer, String, String, String, String, String, String, Integer, Integer>> query = getDbContext().
				select(FILME.ID, FILME.NOME_PT, FILME.NOME_OR, DIRETOR.NOME, FILME.ANO_LANCAMENTO, GENERO.DESCRICAO, FILME.SINOPSE,
						countDistinct(FILME_PREMIO.PREMIO_ID).as("premioCount"), 
				countDistinct(SESSAO.ID).as("sessaoCount"))
				.from(FILME)
				.leftJoin(FILME_PREMIO).on(FILME.ID.equal(FILME_PREMIO.FILME_ID))
				.leftJoin(DIRETOR).on(FILME.DIRETOR_ID.equal(DIRETOR.ID))
				.leftJoin(GENERO).on(FILME.TIPO_ID.equal(GENERO.ID))
				.leftJoin(SESSAO).on(SESSAO.FILME_ID.equal(FILME.ID))
				.groupBy(FILME.ID);
		
		System.out.println(query.getSQL());		
		
		Result<Record9<Integer, String, String, String, String, String, String, Integer, Integer>> result = query.fetch();
		
		System.out.println(result.format());
		
		Object[][] filmsPrizeCountAndExibitionCount = new Object[result.size()][9];
		
		int i = 0;

		//iterando os resultados
		for (Record9<Integer, String, String, String, String, String, String, Integer, Integer> r : result) {
			Integer id = r.getValue(FILME.ID);
			String nomePt = r.getValue(FILME.NOME_PT);
			String nomeOr = r.getValue(FILME.NOME_OR);
			String diretor = r.getValue(DIRETOR.NOME);
			String anoLancamento = r.getValue(FILME.ANO_LANCAMENTO);
			String descricao = r.getValue(GENERO.DESCRICAO);
			String sinopse = r.getValue(FILME.SINOPSE);
			Integer premioCount = r.get("premioCount", Integer.class);
			Integer sessaoCount = r.get("sessaoCount", Integer.class);
			
			filmsPrizeCountAndExibitionCount[i][0] = id;
			filmsPrizeCountAndExibitionCount[i][1] = nomePt;
			filmsPrizeCountAndExibitionCount[i][2] = nomeOr;
			filmsPrizeCountAndExibitionCount[i][3] = diretor;
			filmsPrizeCountAndExibitionCount[i][4] = anoLancamento;
			filmsPrizeCountAndExibitionCount[i][5] = descricao;
			filmsPrizeCountAndExibitionCount[i][6] = sinopse;
			filmsPrizeCountAndExibitionCount[i][7] = premioCount;
			filmsPrizeCountAndExibitionCount[i][8] = sessaoCount;
			i++;

//			System.out.println("FILME.ID: " + id + " FILME.NOME_PT: " + nomePt + " premioCount: " + premioCount + " sessaoCount: " + sessaoCount);
		}
		
		return filmsPrizeCountAndExibitionCount;
	}
	
	public Object[][] getRoomsAndExibitions() {
		Select<Record4<Integer, String, Integer, Integer>> query = getDbContext().
				select(SALA.ID, SALA.NOME, SALA.CAPACIDADE, countDistinct(SESSAO.ID).as("sessaoCount"))
				.from(SALA)
				.leftJoin(SESSAO).on(SALA.ID.equal(SESSAO.SALA_ID).and(SESSAO.DIA.lessThan(new Date(System.currentTimeMillis())))) // Até hoje
				.groupBy(SALA.ID);
		
		System.out.println(query.getSQL());
		
		Result<Record4<Integer, String, Integer, Integer>> result = query.fetch();
		
		System.out.println(result.format());
		
		Object[][] roomsAndExibitionCount = new Object[result.size()][4];
		
		int i = 0;

		//iterando os resultados
		for (Record4<Integer, String, Integer, Integer> r : result) {
			Integer id = r.getValue(SALA.ID);
			String nome = r.getValue(SALA.NOME);
			Integer capacidade = r.getValue(SALA.CAPACIDADE);
			Integer exibicaoCount = r.get("sessaoCount", Integer.class);
			
			roomsAndExibitionCount[i][0] = id;
			roomsAndExibitionCount[i][1] = nome;
			roomsAndExibitionCount[i][2] = capacidade;
			roomsAndExibitionCount[i][3] = exibicaoCount;
			i++;

//			System.out.println("SALA.ID: " + id + " SALA.NOME: " + nome);
		}
		
		return roomsAndExibitionCount;
	}

	public Object[][] getTicketsFromRoomCount() {
		Calendar inicioJulho = new GregorianCalendar(2019, Calendar.JULY, 1);
		Calendar fimJulho = new GregorianCalendar(2019, Calendar.JULY, 31);
		
		Select<Record6<Integer, String, Integer, Integer, Integer, Integer>> query = getDbContext().
		select(SALA.ID, SALA.NOME, SALA.CAPACIDADE, count(INGRESSO.ID).as("ticketCount"),
				count(INGRESSO.ID).filterWhere(INGRESSO.TIPO_INGRESSO.eq(select(TIPO_INGRESSO.ID).from(TIPO_INGRESSO).where(TIPO_INGRESSO.DESCRICAO.eq("inteira")))).as("fullTicketCount"),
				count(INGRESSO.ID).filterWhere(INGRESSO.TIPO_INGRESSO.eq(select(TIPO_INGRESSO.ID).from(TIPO_INGRESSO).where(TIPO_INGRESSO.DESCRICAO.eq("meia")))).as("halfTicketCount")).from(SALA)
		.leftJoin(SESSAO).on(
				SALA.ID.equal(SESSAO.SALA_ID)
				.and(SESSAO.DIA.greaterOrEqual(new Date(inicioJulho.getTime().getTime())))
				.and(SESSAO.DIA.lessOrEqual(new Date(fimJulho.getTime().getTime())))
				) // Até hoje
		.leftJoin(INGRESSO).on(SESSAO.ID.equal(INGRESSO.SESSAO_ID))
		.leftJoin(TIPO_INGRESSO).on(TIPO_INGRESSO.ID.equal(INGRESSO.TIPO_INGRESSO))
		.groupBy(SALA.ID);
		
		System.out.println(query.getSQL());
		
		Result<Record6<Integer, String, Integer, Integer, Integer, Integer>> result = query.fetch();
		System.out.println(result.format());
		
		Object[][] roomsAndTicketCount = new Object[result.size()][6];
		
		int i = 0;

		//iterando os resultados
		for (Record6<Integer, String, Integer, Integer, Integer, Integer> r : result) {
			Integer id = r.getValue(SALA.ID);
			String nome = r.getValue(SALA.NOME);
			Integer capacidade = r.getValue(SALA.CAPACIDADE);
			Integer ticketCount = r.get("ticketCount", Integer.class);
			Integer fullTicketCount = r.get("fullTicketCount", Integer.class);
			Integer halfTicketCount = r.get("halfTicketCount", Integer.class);
			
			roomsAndTicketCount[i][0] = id;
			roomsAndTicketCount[i][1] = nome;
			roomsAndTicketCount[i][2] = capacidade;
			roomsAndTicketCount[i][3] = ticketCount;
			roomsAndTicketCount[i][4] = fullTicketCount;
			roomsAndTicketCount[i][5] = halfTicketCount;
			i++;

//			System.out.println("SALA.ID: " + id + " SALA.NOME: " + nome);
		}
		
		return roomsAndTicketCount;
	}

	@Override
	public void close() throws IOException {
		if (dbConn != null) {
			try {
				dbConn.close();
			} catch (SQLException ignore) {
				ignore.printStackTrace();
			}
		} 
	}

}
