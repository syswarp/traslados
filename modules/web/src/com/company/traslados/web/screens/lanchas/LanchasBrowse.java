package com.company.traslados.web.screens.lanchas;

import com.haulmont.cuba.gui.screen.*;
import com.company.traslados.entity.Lanchas;

@UiController("traslados_Lanchas.browse")
@UiDescriptor("lanchas-browse.xml")
@LookupComponent("lanchasesTable")
@LoadDataBeforeShow
public class LanchasBrowse extends StandardLookup<Lanchas> {
}