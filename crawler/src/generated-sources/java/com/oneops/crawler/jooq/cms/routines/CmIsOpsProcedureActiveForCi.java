/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.routines;


import com.oneops.crawler.jooq.cms.Kloopzcm;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CmIsOpsProcedureActiveForCi extends AbstractRoutine<Boolean> {

    private static final long serialVersionUID = 736633582;

    /**
     * The parameter <code>kloopzcm.cm_is_ops_procedure_active_for_ci.RETURN_VALUE</code>.
     */
    public static final Parameter<Boolean> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>kloopzcm.cm_is_ops_procedure_active_for_ci.p_ci_id</code>.
     */
    public static final Parameter<Long> P_CI_ID = createParameter("p_ci_id", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * Create a new routine call instance
     */
    public CmIsOpsProcedureActiveForCi() {
        super("cm_is_ops_procedure_active_for_ci", Kloopzcm.KLOOPZCM, org.jooq.impl.SQLDataType.BOOLEAN);

        setReturnParameter(RETURN_VALUE);
        addInParameter(P_CI_ID);
    }

    /**
     * Set the <code>p_ci_id</code> parameter IN value to the routine
     */
    public void setPCiId(Long value) {
        setValue(P_CI_ID, value);
    }

    /**
     * Set the <code>p_ci_id</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setPCiId(Field<Long> field) {
        setField(P_CI_ID, field);
    }
}
