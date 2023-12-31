/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thangnc.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContext;
import javax.sql.DataSource;

/**
 *
 * @author Chien Thang
 */
public class DBHelper {

    public static Connection makeConnection()
            throws NamingException, SQLException {

        Context serverContext = new InitialContext();
        Context tomcatContext = (Context) serverContext.lookup("java:comp/env");
        DataSource ds = (DataSource) tomcatContext.lookup("ThangncDS");
        Connection con = ds.getConnection();
        return con;

    }

    public static Properties getSiteMaps(String filePath, ServletContext context)
            throws IOException {
        if (filePath == null) {
            return null;
        }
        if (filePath.trim().isEmpty()) {
            return null;
        }
        Properties result = new Properties();
        InputStream is = null;
        try {
            is = context.getResourceAsStream(filePath);
            result.load(is);
            return result;
        } finally {
            if (is != null) {
                is.close();
            }
        }
    }
}
