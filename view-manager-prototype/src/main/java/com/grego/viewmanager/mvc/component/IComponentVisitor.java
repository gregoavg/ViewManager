package com.grego.viewmanager.mvc.component;

/**
 *
 * @author Grigorios
 */
public interface IComponentVisitor {

    void visit(IComponentHandler<?,?> handler);

}
