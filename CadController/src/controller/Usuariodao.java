package controller;

import model.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

public class Usuariodao extends ConectarDao {
    private String sql;

    public Usuariodao () {
         super();
    }
}
