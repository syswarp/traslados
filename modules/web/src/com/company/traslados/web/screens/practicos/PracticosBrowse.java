package com.company.traslados.web.screens.practicos;

import com.haulmont.cuba.gui.screen.*;
import com.company.traslados.entity.Practicos;

@UiController("traslados_Practicos.browse")
@UiDescriptor("practicos-browse.xml")
@LookupComponent("practicosesTable")
@LoadDataBeforeShow
public class PracticosBrowse extends StandardLookup<Practicos> {
}