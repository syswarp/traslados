package com.company.traslados.web.screens.tripulacion;

import com.haulmont.cuba.gui.screen.*;
import com.company.traslados.entity.Tripulacion;

@UiController("traslados_Tripulacion.edit")
@UiDescriptor("tripulacion-edit.xml")
@EditedEntityContainer("tripulacionDc")
@LoadDataBeforeShow
public class TripulacionEdit extends StandardEditor<Tripulacion> {
}