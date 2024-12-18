package builderDesignPattern;

import java.util.Date;

public class DummyTable {
	
	private int id;
	private String name;
	private Date date;
	private String column;
	
	public int getId()
	{
		return this.id;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public Date getDate()
	{
		return this.date;
	}
	
	public String getColumn()
	{
		return this.column;
	}
	
	public DummyTable(Builder builder)
	{
		this.id = builder.id;
		this.name = builder.name;
		this.date = builder.date;
		this.column = builder.column;
	}
	
	public static class Builder
	{
		private final int id;
		private String name;
		private Date date;
		private String column; 
		
		public Builder(int id)
		{
			this.id = id;
		}
		
		public Builder setName(String name)
		{
			this.name = name;
			return this;
		}
		
		public Builder setDate(Date date)
		{
			this.date = date;
			return this;
		}
		
		public Builder setColumn(String column)
		{
			this.column = column;
			return this;
		}
		
		public DummyTable build()
		{
			return new DummyTable(this);
		}
	}

	@Override
	public String toString() {
		return "DummyTable [id=" + id + ", name=" + name + ", date=" + date + ", column=" + column + "]";
	}
	
}
