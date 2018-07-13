package org.hcjf.layers.query.functions;

import org.hcjf.layers.LayerInterface;

import java.util.Set;

/**
 * @author javaito
 */
public interface QueryAggregateFunctionLayerInterface extends LayerInterface {

    /**
     * Evaluates the specific function.
     * @param resultSet Result set obtained for the query evaluation.
     * @param parameters Function's parameters.
     * @return Function result.
     */
    Object evaluate(Set resultSet, Object... parameters);

}