/* This file is part of the OWL API.
 * The contents of this file are subject to the LGPL License, Version 3.0.
 * Copyright 2014, The University of Manchester
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0 in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */
package uk.ac.manchester.cs.owl.owlapi;

import static org.semanticweb.owlapi.util.CollectionFactory.sortOptionally;
import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;

import com.google.common.collect.Sets;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLDisjointUnionAxiomImpl extends OWLClassAxiomImpl implements OWLDisjointUnionAxiom {

    @Nonnull private final OWLClass owlClass;
    @Nonnull private final List<OWLClassExpression> classExpressions;

    /**
     * @param owlClass
     *        union
     * @param classExpressions
     *        disjoint classes
     * @param annotations
     *        annotations
     */
    public OWLDisjointUnionAxiomImpl(OWLClass owlClass, Stream<OWLClassExpression> classExpressions,
        Collection<OWLAnnotation> annotations) {
        super(annotations);
        this.owlClass = checkNotNull(owlClass, "owlClass cannot be null");
        Stream<OWLClassExpression> classes = checkNotNull(classExpressions, "classExpressions cannot be null");
        this.classExpressions = sortOptionally(classes.distinct());
    }

    @Override
    public Stream<OWLClassExpression> classExpressions() {
        return classExpressions.stream();
    }

    @Override
    public OWLDisjointUnionAxiom getAxiomWithoutAnnotations() {
        if (!isAnnotated()) {
            return this;
        }
        return new OWLDisjointUnionAxiomImpl(getOWLClass(), classExpressions.stream(), NO_ANNOTATIONS);
    }

    @Override
    public OWLDisjointUnionAxiom getAnnotatedAxiom(Stream<OWLAnnotation> anns) {
        return new OWLDisjointUnionAxiomImpl(getOWLClass(), classExpressions.stream(), mergeAnnos(anns));
    }

    @Override
    public OWLClass getOWLClass() {
        return owlClass;
    }

    @Override
    public OWLEquivalentClassesAxiom getOWLEquivalentClassesAxiom() {
        return new OWLEquivalentClassesAxiomImpl(Sets.newHashSet(owlClass, new OWLObjectUnionOfImpl(classExpressions
            .stream())), NO_ANNOTATIONS);
    }

    @Override
    public OWLDisjointClassesAxiom getOWLDisjointClassesAxiom() {
        return new OWLDisjointClassesAxiomImpl(classExpressions, NO_ANNOTATIONS);
    }
}
