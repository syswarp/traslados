package com.company.traslados.web.screens.tripulacion;

import com.haulmont.cuba.gui.screen.*;
import com.company.traslados.entity.Tripulacion;

@UiController("traslados_Tripulacion.browse")
@UiDescriptor("tripulacion-browse.xml")
@LookupComponent("tripulacionsTable")
@LoadDataBeforeShow
public class TripulacionBrowse extends StandardLookup<Tripulacion> {
}