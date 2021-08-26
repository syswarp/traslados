package com.company.traslados.web.screens.puertos;

import com.haulmont.cuba.gui.screen.*;
import com.company.traslados.entity.Puertos;

@UiController("traslados_Puertos.browse")
@UiDescriptor("puertos-browse.xml")
@LookupComponent("puertosesTable")
@LoadDataBeforeShow
public class PuertosBrowse extends StandardLookup<Puertos> {
}