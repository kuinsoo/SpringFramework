package kr.or.ddit.rangers.model;

public class RangersVo {

	private String ragersId;
	private String name;
	
	@Override
	public String toString() {
		return "RangersVo [ragersId=" + ragersId + ", name=" + name + "]";
	}
	public RangersVo() {
		super();
	}
	public RangersVo(String ragersId, String name) {
		super();
		this.ragersId = ragersId;
		this.name = name;
	}
	public String getRagersId() {
		return ragersId;
	}
	public void setRagersId(String ragersId) {
		this.ragersId = ragersId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
