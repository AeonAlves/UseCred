package com.example.sys4web.usecred;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by SYS4WEB on 26/11/2017.
 */

public class CriaBanco extends SQLiteOpenHelper {

    private static final String NOME_BANCO = "usecred.db";
    private static final String TABELAEST = "estabelecimentos";
    private static final String TABELACAT = "categorias";

    //TABELA nomeS
    private static final String EST_ID = "_id ";
    private static final String CATEGORIA = "categoria";
    private static final String EST_NOME = "nome";
    private static final String EST_END = "endereco";
    private static final String BAIRRO = "bairro";
    private static final String CIDADE = "cidade";
    private static final String UF = "uf";
    private static final String EST_CEP = "cep";
    private static final String EST_TEL1 = "telefone_1";
    private static final String EST_TEL2 = "telefone_2";

    //TABELA CATEGORIAS
    private static final String CAT_ID = "_id";
    private static final String CAT_DESC = "categoria";

    private static final int VERSAO = 1;

    public CriaBanco(Context context){
        super(context, NOME_BANCO,null,VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String createEst = "CREATE TABLE " + TABELAEST +"("
                + EST_ID + " integer primary key autoincrement,"
                + CATEGORIA + " integer, "
                + EST_NOME + " text, "
                + EST_END + " text, "
                + BAIRRO + " text, "
                + CIDADE + " text, "
                + UF + " text, "
                + EST_CEP + " text, "
                + EST_TEL1 + " text, "
                + EST_TEL2 + " text "
                +")";
        db.execSQL(createEst);

        String createCat = "CREATE TABLE " + TABELACAT + "("
                + CAT_ID + " integer primary key autoincrement, "
                + CAT_DESC + " text"
                + ")";
        db.execSQL(createCat);

        String insertEst1 = "INSERT INTO " + TABELAEST + " (categoria,nome,endereco,bairro,cidade,uf,cep,telefone_1,telefone_2)" + " VALUES "
                + "('Agropecuária','ALLADIN JASMIN', 'AV MANOEL CONCEICAO, 1169', 'VILA REZENDE','PIRACICABA', 'SP', '13417-620', '(19)3375.0175', ' ') ";
        db.execSQL(insertEst1);
        String insertEst2 = "INSERT INTO " + TABELAEST + " (categoria,nome,endereco,bairro,cidade,uf,cep,telefone_1,telefone_2)" + " VALUES "
                + "('Frios', 'ARMAZEM VILLA FRIOS', 'AV MANOEL CONCEICAO, 820, SALA 4', ' VILA REZENDE', 'PIRACICABA', 'SP', '13417-620', '(19)3375.0175', ' ') ";
        db.execSQL(insertEst2);
        String insertEst3 =  "INSERT INTO " + TABELAEST + " (categoria,nome,endereco,bairro,cidade,uf,cep,telefone_1,telefone_2)" + " VALUES "
                + "('Bares, Lanchonetes e Restaurantes', 'BAIXINHO LANCHES','AV MANOEL CONCEICAO, 1304', 'VILA REZENDE', 'PIRACICABA', 'SP', '13417-670', '(19)3413.0285', ' ') ";
        db.execSQL(insertEst3);
        String insertEst4 = "INSERT INTO " + TABELAEST + " (categoria,nome,endereco,bairro,cidade,uf,cep,telefone_1,telefone_2)" + " VALUES "
                + "('Açougue', 'CASA CARNES CHEIRO VERDE','RUA DONA SANTINA, 1144', 'VILA REZENDE', 'PIRACICABA', 'SP', '13408-172', '(19)3371.7594', '(19)3413.7666') ";
        db.execSQL(insertEst4);
        String insertEst5 = "INSERT INTO " + TABELAEST + " (categoria,nome,endereco,bairro,cidade,uf,cep,telefone_1,telefone_2)" + " VALUES "
                + "('Bares, Lanchonetes e Restaurantes', 'CLUBE DO LANCHE','RUA CRISTO REDENTOR, 111', 'VILA REZENDE', 'PIRACICABA', 'SP', '13420-610', '(19)3421.5969', '(19)3423.2166') ";
        db.execSQL(insertEst5);
        String insertEst6 = "INSERT INTO " + TABELAEST + " (categoria,nome,endereco,bairro,cidade,uf,cep,telefone_1,telefone_2)" + " VALUES "
                + "('Roupas e Acessórios', 'CONFECÇÕES BORGES','AV: MANOEL CONCEIÇÃO, 927', 'VILA REZENDE', 'PIRACICABA', 'SP', '13400-911', '(19)3375.5505', '(19)3375.7400') ";
        db.execSQL(insertEst6);
        String insertEst7 = "INSERT INTO " + TABELAEST + " (categoria,nome,endereco,bairro,cidade,uf,cep,telefone_1,telefone_2)" + " VALUES "
                + "('Materiais para Construção, Elétricos, etc', 'DA VILA MARMORES E GRANITOS','AV PRIMEIRO DE AGOSTO, 400', 'VILA REZENDE', 'PIRACICABA', 'SP', '13411-068', '(19)3371.7099', '(19)3421.7469') ";
        db.execSQL(insertEst7);
        String insertEst8 = "INSERT INTO " + TABELAEST + " (categoria,nome,endereco,bairro,cidade,uf,cep,telefone_1,telefone_2)" + " VALUES "
                + "('Supermercados, Atacados e Mercearias', 'DELTA SUPERMERCADO VILA REZENDE','AVENIDA MONSENHOR MARTINHO SALGOT, 471, AREÃO', 'VILA REZENDE', 'PIRACICABA', 'SP', '13416-240', '(19)3421.9245', ' ') ";
        db.execSQL(insertEst8);
        String insertEst9 = "INSERT INTO " + TABELAEST + " (categoria,nome,endereco,bairro,cidade,uf,cep,telefone_1,telefone_2)" + " VALUES "
                + "('Depósito de Bebidas e Água', 'DEPOSITO DE BEBIDAS VILLA ACQUA','AV MANOEL CONCEICAO, 1950', 'VILA REZENDE', 'PIRACICABA', 'SP', '13400-063', '(19)3412.2022', '(19)3412.2027') ";
        db.execSQL(insertEst9);
        String insertEst10 = "INSERT INTO " + TABELAEST + " (categoria,nome,endereco,bairro,cidade,uf,cep,telefone_1,telefone_2)" + " VALUES "
                + "('Farmácias e Drogarias', 'DISK FARMA DROGARIA','AV RUI BARBOSA, 24', 'VILA REZENDE', 'PIRACICABA', 'SP', '13405-190', '(19)3421.5696', ' ') ";
        db.execSQL(insertEst10);


        String insertCat1 = "INSERT INTO " + TABELACAT + " (categoria) VALUES ('Açougue') ";
        db.execSQL(insertCat1);
        String insertCat2 = "INSERT INTO " + TABELACAT + " (categoria) VALUES ('Agropecuária') ";
        db.execSQL(insertCat2);
        String insertCat3 = "INSERT INTO " + TABELACAT + " (categoria) VALUES ('Bares, Lanchonetes e Restaurantes') ";
        db.execSQL(insertCat3);
        String insertCat4 = "INSERT INTO " + TABELACAT + " (categoria) VALUES ('Depósito de Bebidas e Água') ";
        db.execSQL(insertCat4);
        String insertCat5 = "INSERT INTO " + TABELACAT + " (categoria) VALUES ('Farmácias e Drogarias') ";
        db.execSQL(insertCat5);
        String insertCat6 = "INSERT INTO " + TABELACAT + " (categoria) VALUES ('Frios') ";
        db.execSQL(insertCat6);
        String insertCat7 = "INSERT INTO " + TABELACAT + " (categoria) VALUES ('Materiais para Construção, Elétricos, etc') ";
        db.execSQL(insertCat7);
        String insertCat8 = "INSERT INTO " + TABELACAT + " (categoria) VALUES ('Roupas e Acessórios') ";
        db.execSQL(insertCat8);
        String insertCat9 = "INSERT INTO " + TABELACAT + " (categoria) VALUES ('Supermercados, Atacados e Mercearias') ";
        db.execSQL(insertCat9);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABELAEST);
        db.execSQL("DROP TABLE IF EXISTS " + TABELACAT);
        onCreate(db);
    }
}
