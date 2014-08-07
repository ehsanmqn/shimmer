package org.openmhealth.shim;

import org.joda.time.DateTime;
import org.springframework.beans.BeanUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * A wrapper for encapsulating data requests sent
 * to shims. Prevents from having long method signatures.
 */
public class ShimDataRequest {

    /**
     * Identifier for the type of data being retrieved
     */
    private String dataTypeKey;
    /**
     * parameters required for acessing data, this
     * will likely be oauth token + any extras or some
     * kind of trusted access.
     */
    private AccessParameters accessParameters;

    /**
     * The start date for the data being retrieved
     */

    private DateTime startDate;

    /**
     * The end date for the data being retrieved
     */
    private DateTime endDate;

    /**
     * List of columns required
     */
    private List<String> columnList;

    /**
     * The starting row for the data (for pagination purposes)
     */
    private Long numToSkip;

    /**
     * Number of rows to return
     */
    private Long numToReturn;

    public ShimDataRequest() {
    }

    public ShimDataRequest(String dataTypeKey,
                           AccessParameters accessParameters,
                           DateTime startDate,
                           DateTime endDate,
                           List<String> columnList,
                           Long numToSkip,
                           Long numToReturn) {
        this.dataTypeKey = dataTypeKey;
        this.accessParameters = accessParameters;
        this.startDate = startDate;
        this.endDate = endDate;
        this.columnList = columnList;
        this.numToSkip = numToSkip;
        this.numToReturn = numToReturn;
    }

    public void setDataTypeKey(String dataTypeKey) {
        this.dataTypeKey = dataTypeKey;
    }

    public void setAccessParameters(AccessParameters accessParameters) {
        this.accessParameters = accessParameters;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    public void setColumnList(List<String> columnList) {
        this.columnList = columnList;
    }

    public void setNumToSkip(Long numToSkip) {
        this.numToSkip = numToSkip;
    }

    public void setNumToReturn(Long numToReturn) {
        this.numToReturn = numToReturn;
    }

    public String getDataTypeKey() {
        return dataTypeKey;
    }

    public AccessParameters getAccessParameters() {
        return accessParameters;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public List<String> getColumnList() {
        return columnList;
    }

    public Long getNumToSkip() {
        return numToSkip;
    }

    public Long getNumToReturn() {
        return numToReturn;
    }

    public static ShimDataRequest fromHttpRequest(HttpServletRequest request) {
        ShimDataRequest dataRequest = new ShimDataRequest();
        return dataRequest;
    }
}
