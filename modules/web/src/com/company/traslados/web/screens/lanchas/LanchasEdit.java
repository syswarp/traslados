package com.company.traslados.web.screens.lanchas;

import com.haulmont.cuba.gui.screen.*;
import com.company.traslados.entity.Lanchas;

@UiController("traslados_Lanchas.edit")
@UiDescriptor("lanchas-edit.xml")
@EditedEntityContainer("lanchasDc")
@LoadDataBeforeShow
public class LanchasEdit extends StandardEditor<Lanchas> {
}