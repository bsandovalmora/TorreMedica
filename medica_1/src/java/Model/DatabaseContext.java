
package Model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseContext {
    private String url;
    private Connection conn;
    private CallableStatement cst;
    
    public DatabaseContext() {
        this.url = "jdbc:sqlserver://;database=prueba1;integratedSecurity=true;";
        this.conn = null;
        this.cst= null;
    }
    public boolean connect() {
        try {
            this.conn = DriverManager.getConnection(this.url);
            return true;
        } catch(SQLException ex) {
            return false;
        } 
    }
    
    public ResultSet SQLProcedure(List<String> parameters, String paramName) {
        try {
            this.cst = this.conn.prepareCall(paramName);
            for(int i=0; i < parameters.size(); i++) {
                this.cst.setNString(i,parameters.get(i));
            }
            return this.cst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseContext.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
