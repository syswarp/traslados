package com.company.traslados.web.screens.practicos;

import com.haulmont.cuba.gui.screen.*;
import com.company.traslados.entity.Practicos;

@UiController("traslados_Practicos.edit")
@UiDescriptor("practicos-edit.xml")
@EditedEntityContainer("practicosDc")
@LoadDataBeforeShow
public class PracticosEdit extends StandardEditor<Practicos> {
}