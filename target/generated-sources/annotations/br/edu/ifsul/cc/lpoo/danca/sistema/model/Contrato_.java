package br.edu.ifsul.cc.lpoo.danca.sistema.model;

import br.edu.ifsul.cc.lpoo.danca.sistema.model.FormaPgto;
import br.edu.ifsul.cc.lpoo.danca.sistema.model.ItensContrato;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-31T10:52:37", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Contrato.class)
public class Contrato_ { 

    public static volatile SingularAttribute<Contrato, Double> valorDesconto;
    public static volatile SingularAttribute<Contrato, FormaPgto> forma_Pgto;
    public static volatile ListAttribute<Contrato, ItensContrato> itensContrato;
    public static volatile SingularAttribute<Contrato, Integer> id;
    public static volatile SingularAttribute<Contrato, Calendar> dataInicio;

}