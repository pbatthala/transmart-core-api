package org.transmartproject.core.dataquery.assay

import groovy.transform.Canonical

@Canonical
class Timepoint {

    /**
     * The timepoint code used for querying purposes. Typically a numerical
     * value.
     */
    String code

    /**
     * A label used for displaying purposes.
     */
    String label

}
