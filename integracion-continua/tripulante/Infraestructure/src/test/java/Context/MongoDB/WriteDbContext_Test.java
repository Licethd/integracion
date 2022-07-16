package Context.MongoDB;

import org.junit.Test;
import org.mockito.Mockito;

import fourteam.db.DbSet;
import fourteam.db.IDbSet.BooleanFunction;

import static org.mockito.ArgumentMatchers.any;

import java.util.ArrayList;


public class WriteDbContext_Test {
    DbSet dbSet = Mockito.mock(DbSet.class);

    
    @Test
    public void test() {
        WriteDbContext writeDbContext = new WriteDbContext();
        writeDbContext.onModelCreating(new ArrayList<DbSet>());
        writeDbContext.isConnected();
        writeDbContext.Commit();
        writeDbContext.Transaction();
        writeDbContext.Rollback();
    }
    
} 
