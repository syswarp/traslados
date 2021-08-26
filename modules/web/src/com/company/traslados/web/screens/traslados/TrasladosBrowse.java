package com.company.traslados.web.screens.traslados;

import com.haulmont.cuba.gui.screen.*;
import com.company.traslados.entity.Traslados;

@UiController("traslados_Traslados.browse")
@UiDescriptor("traslados-browse.xml")
@LookupComponent("trasladosesTable")
@LoadDataBeforeShow
public class TrasladosBrowse extends StandardLookup<Traslados> {
}