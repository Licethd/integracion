import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import Context.IWriteDbContext;
import core.DomainEvent;
import fourteam.http.Exception.HttpException;
import fourteam.mediator.Mediator;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class UnitOfWork_Test {

	private IWriteDbContext contextTest = Mockito.mock(IWriteDbContext.class);
	private Mediator mediatorTest = Mockito.mock(Mediator.class);

	@Test
	public void UnitOfWork_Ok() throws HttpException {
		UnitOfWork unit = new UnitOfWork(
			any(IWriteDbContext.class),
			any(Mediator.class)
		);
		Assert.assertNotNull(unit);
	}

	@Test
	public void Commit_Test() throws HttpException {
		UnitOfWork unit = new UnitOfWork(contextTest, mediatorTest);
		List<Object> list = new ArrayList<Object>();
		list.add(new DomainEvent());
		when(contextTest.getDomainEvents()).thenReturn(list);
		unit.commit();
		Assert.assertNotNull(unit);
	}
}
