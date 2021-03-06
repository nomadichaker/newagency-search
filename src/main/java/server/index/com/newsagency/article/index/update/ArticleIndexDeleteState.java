/**
 * 
 */
package com.newsagency.article.index.update;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.newsagency.search.workflow.WorkflowState;
import com.newsagency.search.workflow.exception.WorkflowExecutionException;

/**
 * @author bikash
 *
 */
public class ArticleIndexDeleteState implements WorkflowState<ArticleIndexUpdateContext, ArticleIndexUpdateRequest> {

	private static final Logger logger = LoggerFactory.getLogger(ArticleIndexDeleteState.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.newsagency.search.workflow.WorkflowState#execute(com.newsagency.
	 * search.workflow.WorkflowContext,
	 * com.newsagency.search.workflow.WorkflowRequest)
	 */
	@Override
	public void execute(ArticleIndexUpdateContext ctxt, ArticleIndexUpdateRequest request)
			throws WorkflowExecutionException {
		logger.info("Executing state");
	}

}
