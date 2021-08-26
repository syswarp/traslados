package com.company.traslados.web.screens.empresas;

import com.haulmont.cuba.gui.screen.*;
import com.company.traslados.entity.Empresas;

@UiController("traslados_Empresas.edit")
@UiDescriptor("empresas-edit.xml")
@EditedEntityContainer("empresasDc")
@LoadDataBeforeShow
public class EmpresasEdit extends StandardEditor<Empresas> {
}