/*
 * This file is part of the OWL API.
 *
 * The contents of this file are subject to the LGPL License, Version 3.0.
 *
 * Copyright (C) 2014, The University of Manchester
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0
 * in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 *
 * Copyright 2014, The University of Manchester
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/* Generated By:JavaCC: Do not edit this line. OWLFunctionalSyntaxParserTreeConstants.java Version 5.0 */
package org.coode.owlapi.functionalparser;

@SuppressWarnings("javadoc")
public interface OWLFunctionalSyntaxParserTreeConstants {
    int JJTPARSE = 0;
    int JJTONTOLOGY = 1;
    int JJTPREFIX = 2;
    int JJTIRI = 3;
    int JJTFULLIRI = 4;
    int JJTABBREVIATEDIRI = 5;
    int JJTPREFIXNAME = 6;
    int JJTCLASSEXPRESSION = 7;
    int JJTCLASSIRI = 8;
    int JJTCLASSEXPRESSIONSET = 9;
    int JJTINDIVIDUALMINONESET = 10;
    int JJTOBJECTUNIONOF = 11;
    int JJTOBJECTINTERSECTIONOF = 12;
    int JJTOBJECTCOMPLEMENTOF = 13;
    int JJTOBJECTONEOF = 14;
    int JJTOBJECTALLVALUESFROM = 15;
    int JJTOBJECTSOMEVALUESFROM = 16;
    int JJTOBJECTHASVALUE = 17;
    int JJTOBJECTSELF = 18;
    int JJTOBJECTMINCARDINALITY = 19;
    int JJTOBJECTEXACTCARDINALITY = 20;
    int JJTOBJECTMAXCARDINALITY = 21;
    int JJTDATAALLVALUESFROM = 22;
    int JJTDATASOMEVALUESFROM = 23;
    int JJTDATAHASVALUE = 24;
    int JJTDATAMINCARDINALITY = 25;
    int JJTDATAEXACTCARDINALITY = 26;
    int JJTDATAMAXCARDINALITY = 27;
    int JJTCLASS = 28;
    int JJTOBJECTPROPERTYEXPRESSION = 29;
    int JJTINVERSEOBJECTPROPERTY = 30;
    int JJTOBJECTPROPERTY = 31;
    int JJTDATAPROPERTYEXPRESSION = 32;
    int JJTDATAPROPERTYIRI = 33;
    int JJTDATAPROPERTY = 34;
    int JJTANNOTATIONPROPERTY = 35;
    int JJTANNOTATIONPROPERTYIRI = 36;
    int JJTNAMEDINDIVIDUAL = 37;
    int JJTANONYMOUSINDIVIDUAL = 38;
    int JJTDATATYPE = 39;
    int JJTDATATYPEIRI = 40;
    int JJTCARDINALITY = 41;
    int JJTINTEGER = 42;
    int JJTDATATYPEDEFINITIONAXIOM = 43;
    int JJTDATARANGE = 44;
    int JJTDATACOMPLEMENTOF = 45;
    int JJTDATAONEOF = 46;
    int JJTDATAUNIONOF = 47;
    int JJTDATAINTERSECTIONOF = 48;
    int JJTDATARANGERESTRICTION = 49;
    int JJTDATARANGEFACETRESTRICTION = 50;
    int JJTAXIOM = 51;
    int JJTCLASSAXIOM = 52;
    int JJTSUBCLASSOF = 53;
    int JJTEQUIVALENTCLASSES = 54;
    int JJTDISJOINTCLASSES = 55;
    int JJTDISJOINTUNION = 56;
    int JJTOBJECTPROPERTYAXIOM = 57;
    int JJTSUBOBJECTPROPERTYCHAIN = 58;
    int JJTSUBOBJECTPROPERTYOF = 59;
    int JJTEQUIVALENTOBJECTPROPERTIES = 60;
    int JJTDISJOINTOBJECTPROPERTIES = 61;
    int JJTOBJECTPROPERTYSET = 62;
    int JJTOBJECTPROPERTYRANGE = 63;
    int JJTOBJECTPROPERTYDOMAIN = 64;
    int JJTFUNCTIONALOBJECTPROPERTY = 65;
    int JJTINVERSEOBJECTPROPERTIES = 66;
    int JJTINVERSEFUNCTIONALOBJECTPROPERTY = 67;
    int JJTSYMMETRICOBJECTPROPERTY = 68;
    int JJTASYMMETRICOBJECTPROPERTY = 69;
    int JJTREFLEXIVEOBJECTPROPERTY = 70;
    int JJTIRREFLEXIVEOBJECTPROPERTY = 71;
    int JJTTRANSITIVEOBJECTPROPERTY = 72;
    int JJTDATAPROPERTYAXIOM = 73;
    int JJTSUBDATAPROPERTYOF = 74;
    int JJTEQUIVALENTDATAPROPERTIES = 75;
    int JJTDISJOINTDATAPROPERTIES = 76;
    int JJTDATAPROPERTYSET = 77;
    int JJTDATAPROPERTYDOMAIN = 78;
    int JJTDATAPROPERTYRANGE = 79;
    int JJTFUNCTIONALDATAPROPERTY = 80;
    int JJTINDIVIDUALAXIOM = 81;
    int JJTINDIVIDUALSET = 82;
    int JJTSAMEINDIVIDUALS = 83;
    int JJTDIFFERENTINDIVIDUALS = 84;
    int JJTCLASSASSERTION = 85;
    int JJTOBJECTPROPERTYASSERTION = 86;
    int JJTNEGATIVEOBJECTPROPERTYASSERTION = 87;
    int JJTDATAPROPERTYASSERTION = 88;
    int JJTNEGATIVEDATAPROPERTYASSERTION = 89;
    int JJTINDIVIDUALIRI = 90;
    int JJTINDIVIDUAL = 91;
    int JJTOBJECTPROPERTYIRI = 92;
    int JJTANNOTATIONAXIOM = 93;
    int JJTANNOTATION = 94;
    int JJTANNOTATIONSUBJECT = 95;
    int JJTANNOTATIONVALUE = 96;
    int JJTAXIOMANNOTATIONSET = 97;
    int JJTIMPORTSDECLARATION = 98;
    int JJTANNOTATIONASSERTION = 99;
    int JJTSUBANNOTATIONPROPERTYOF = 100;
    int JJTANNOTATIONPROPERTYDOMAIN = 101;
    int JJTANNOTATIONPROPERTYRANGE = 102;
    int JJTHASKEY = 103;
    int JJTDECLARATION = 104;
    int JJTENTITY = 105;
    int JJTLITERAL = 106;
    int JJTQUOTEDSTRING = 107;
    int JJTLANGTAG = 108;
    int JJTDLSAFERULE = 109;
    int JJTATOM = 110;
    int JJTCLASSATOM = 111;
    int JJTDATARANGEATOM = 112;
    int JJTOBJECTPROPERTYATOM = 113;
    int JJTDATAPROPERTYATOM = 114;
    int JJTBUILTINATOM = 115;
    int JJTSAMEINDIVIDUALATOM = 116;
    int JJTDIFFERENTINDIVIDUALSATOM = 117;
    int JJTIARG = 118;
    int JJTDARG = 119;
    String[] jjtNodeName = { "parse", "Ontology", "Prefix", "IRI", "FullIRI",
            "AbbreviatedIRI", "PrefixName", "ClassExpression", "ClassIRI",
            "ClassExpressionSet", "IndividualMinOneSet", "ObjectUnionOf",
            "ObjectIntersectionOf", "ObjectComplementOf", "ObjectOneOf",
            "ObjectAllValuesFrom", "ObjectSomeValuesFrom", "ObjectHasValue",
            "ObjectSelf", "ObjectMinCardinality", "ObjectExactCardinality",
            "ObjectMaxCardinality", "DataAllValuesFrom", "DataSomeValuesFrom",
            "DataHasValue", "DataMinCardinality", "DataExactCardinality",
            "DataMaxCardinality", "Class", "ObjectPropertyExpression",
            "InverseObjectProperty", "ObjectProperty", "DataPropertyExpression",
            "DataPropertyIRI", "DataProperty", "AnnotationProperty",
            "AnnotationPropertyIRI", "NamedIndividual", "AnonymousIndividual",
            "Datatype", "DatatypeIRI", "Cardinality", "Integer",
            "DatatypeDefinitionAxiom", "DataRange", "DataComplementOf", "DataOneOf",
            "DataUnionOf", "DataIntersectionOf", "DataRangeRestriction",
            "DataRangeFacetRestriction", "Axiom", "ClassAxiom", "SubClassOf",
            "EquivalentClasses", "DisjointClasses", "DisjointUnion",
            "ObjectPropertyAxiom", "SubObjectPropertyChain", "SubObjectPropertyOf",
            "EquivalentObjectProperties", "DisjointObjectProperties",
            "ObjectPropertySet", "ObjectPropertyRange", "ObjectPropertyDomain",
            "FunctionalObjectProperty", "InverseObjectProperties",
            "InverseFunctionalObjectProperty", "SymmetricObjectProperty",
            "AsymmetricObjectProperty", "ReflexiveObjectProperty",
            "IrreflexiveObjectProperty", "TransitiveObjectProperty", "DataPropertyAxiom",
            "SubDataPropertyOf", "EquivalentDataProperties", "DisjointDataProperties",
            "DataPropertySet", "DataPropertyDomain", "DataPropertyRange",
            "FunctionalDataProperty", "IndividualAxiom", "IndividualSet",
            "SameIndividuals", "DifferentIndividuals", "ClassAssertion",
            "ObjectPropertyAssertion", "NegativeObjectPropertyAssertion",
            "DataPropertyAssertion", "NegativeDataPropertyAssertion", "IndividualIRI",
            "Individual", "ObjectPropertyIRI", "AnnotationAxiom", "Annotation",
            "AnnotationSubject", "AnnotationValue", "AxiomAnnotationSet",
            "ImportsDeclaration", "AnnotationAssertion", "SubAnnotationPropertyOf",
            "AnnotationPropertyDomain", "AnnotationPropertyRange", "HasKey",
            "Declaration", "Entity", "Literal", "QuotedString", "LangTag", "DLSafeRule",
            "Atom", "ClassAtom", "DataRangeAtom", "ObjectPropertyAtom",
            "DataPropertyAtom", "BuiltInAtom", "SameIndividualAtom",
            "DifferentIndividualsAtom", "IArg", "DArg", };
}
/*
 * JavaCC - OriginalChecksum=32c75f96bd8346ad7a2680024302ff35 (do not edit this
 * line)
 */
