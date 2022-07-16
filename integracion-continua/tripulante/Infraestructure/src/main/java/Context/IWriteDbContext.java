package Context;

import Model.Tripulante.Cargo;
import Model.Tripulante.Tripulante;
import fourteam.db.DbContext;
import fourteam.db.DbSet;

public abstract class IWriteDbContext extends DbContext {

    public IWriteDbContext(Class dbContextClass) {
        super(dbContextClass);
    }

    public DbSet<Tripulante> Tripulante;
    public DbSet<Cargo> Cargo;
}
