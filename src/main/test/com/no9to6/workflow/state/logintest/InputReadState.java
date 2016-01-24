package com.no9to6.workflow.state.logintest;

import com.no9to6.workflow.context.logintest.LoginTestContext;
import com.no9to6.workflow.request.test.LoginPageTestRequest;
import com.quickpay.automation.workflow.After;
import com.quickpay.automation.workflow.Before;
import com.quickpay.automation.workflow.WorkflowContext;
import com.quickpay.automation.workflow.WorkflowState;
import com.quickpay.automation.workflow.exception.WorkflowExecutionException;

/**
 * @author sasmita
 *
 */
@Before(names={InputReadBeforeState.class})
@After(names={InputReadAfterState.class})
public class InputReadState implements WorkflowState<LoginTestContext,LoginPageTestRequest> {

	@Override
	public void execute(LoginTestContext ctxt, LoginPageTestRequest request)
			throws WorkflowExecutionException {
		
	}


}
