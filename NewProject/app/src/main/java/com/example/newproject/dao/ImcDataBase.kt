package com.example.newproject.dao

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
//Antes da classe criamos as variaveis que tem valores que serão repetidos várias vezes durante o código:
const val DATABASE_NAME = "imc.db"
const val DATABASE_VERSION = 1


//Dizendo que esta classe herda ":", de outra (SQLiteOpenHelper)
class ImcDataBase(val context: Context) :
    SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION){
    //SQLiteOpenHelper tem um construtor, então devemos preencher os dados de construção

    /*A nossa aplicação android usará o a=banco de dados, mas esse banco ainda não
    *existe Ou seja, enão é o próprio aplicativo que tem que criar o banco de dados,
    *pois é somente ele qume acessa o banco de dados. Então ele executa o oncreate.
    *após executado (o que acontece apenas uma vez, ele nunca mais será executado)
    *
    * */
    override fun onCreate(db: SQLiteDatabase?) {
        //Informando ao banco as entidades que precisamos:
        val criarTabelaUsuario = "CREATE TABLE tb_usuario (" +
                "id INTEGER PRIMARY KEY," +
                "email TEXT NOT NULL," +
                "senha TEXT NOT NULL," +
                "nome TEXT NOT NULL," +
                "profissao TEXT NULL," +
                "data_nascimento TEXT NOT NULL," +
                "altura REAL NOT NULL," +
                "sexo TEXT NOT NULL," +
                "foto BLOB NULL)"
    }
    /**
     * Será executado quando quando mudado a versão do banco. Porém,
     * quando o for feito essa atualização de banco, o mesmo poderá deletar
     * dados, por isso criamos uma tabela nova mas sem deletar o que o suario
     * já cadastrou
     * Na desisntalação do aplicativo, não há como recuperar nada mais. Tudo
     * do aplicativo é deletado.
     * Uma aplicação não pode perder os dados de um usuário
     * */
    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }


}