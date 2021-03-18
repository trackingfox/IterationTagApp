package com.abc.handler;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class IterationApp extends TagSupport {
	private static final long serialVersionUID = 1L;

	int times;
	int count = 1;

	public void setTimes(int times) {
		this.times = times;
	}

	@Override
	public int doStartTag() throws JspException {
		return EVAL_BODY_INCLUDE;
	}

	@Override
	public int doAfterBody() throws JspException {

		if (count <= times) {
			count++;
			return EVAL_BODY_AGAIN;
		}

		return SKIP_BODY;
	}

}
