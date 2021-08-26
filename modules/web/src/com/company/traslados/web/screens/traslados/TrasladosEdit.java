package com.company.traslados.web.screens.traslados;

import com.haulmont.cuba.gui.screen.*;
import com.company.traslados.entity.Traslados;

@UiController("traslados_Traslados.edit")
@UiDescriptor("traslados-edit.xml")
@EditedEntityContainer("trasladosDc")
@LoadDataBeforeShow
public class TrasladosEdit extends StandardEditor<Traslados> {
}