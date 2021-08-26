package com.company.traslados.web.screens.puertos;

import com.haulmont.cuba.gui.screen.*;
import com.company.traslados.entity.Puertos;

@UiController("traslados_Puertos.edit")
@UiDescriptor("puertos-edit.xml")
@EditedEntityContainer("puertosDc")
@LoadDataBeforeShow
public class PuertosEdit extends StandardEditor<Puertos> {
}