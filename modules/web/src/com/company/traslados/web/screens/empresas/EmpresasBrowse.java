package com.company.traslados.web.screens.empresas;

import com.haulmont.cuba.gui.screen.*;
import com.company.traslados.entity.Empresas;

@UiController("traslados_Empresas.browse")
@UiDescriptor("empresas-browse.xml")
@LookupComponent("empresasesTable")
@LoadDataBeforeShow
public class EmpresasBrowse extends StandardLookup<Empresas> {
}