package org.fao.geonet.domain;

import javax.persistence.*;

/**
 * Csw custom element set. This is part of the CSW specification related to what elements are returned by GetRecords and GetRecordById.
 *
 * @author Jesse
 */
@Entity
@Access(AccessType.PROPERTY)
@Table(name = "customelementset")
public class CustomElementSet extends GeonetEntity {
    private static final int XPATH_COLUMN_LENGTH = 1000;
    private String _xpath;

    /**
     * Get the xpath of the element to include in the element set. Each included element is described by a full xpath relative to the
     * document root. <br/>
     * This is a required element.
     */
    @Id
    @Column(length = XPATH_COLUMN_LENGTH, nullable = false)
    public String getXpath() {
        return _xpath;
    }

    /**
     * Get the xpath of the element to include in the element set. Each included element is described by a full xpath relative to the
     * document root. <br/>
     * This is a required element.
     *
     * @param xpath the xpath relative to document root.
     * @return this object
     */
    public CustomElementSet setXpath(final String xpath) {
        this._xpath = xpath;
        return this;
    }
}