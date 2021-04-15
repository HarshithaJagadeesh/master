package com.hcl.model;

public class ModifyString {
	
	private String myStr;

	public ModifyString() {
		super();
	}

	public ModifyString(String myStr) {
		super();
		this.myStr = myStr;
	}
	
	public String getMyStr() {
		return myStr;
	}

	public void setMyStr(String myStr) {
		this.myStr = myStr;
	}

	public String checkString() {
		StringBuilder strBuilder = new StringBuilder();
		String modifiedString = "";
		strBuilder.append(myStr);
		if(myStr.charAt(0)!='k' && myStr.charAt(1)!='b') {
				strBuilder.delete(0, 2);
			}
			else if(myStr.charAt(0)!='k') {
				strBuilder.delete(0,1);
			}
			else if(myStr.charAt(1)!='b'){
				strBuilder.delete(1, 2);
		}
			else {
			}
		return strBuilder.toString();
	}
	
}
