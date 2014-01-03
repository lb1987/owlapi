/*
 * This file is part of the OWL API.
 *
 * The contents of this file are subject to the LGPL License, Version 3.0.
 *
 * Copyright (C) 2011, The University of Manchester
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
 * Copyright 2011, The University of Manchester
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
/* Generated By:JJTree: Do not edit this line. SimpleNode.java Version 4.3 */
/* JavaCCOptions:MULTI=false,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.coode.owlapi.functionalparser;

/** node. */
public class SimpleNode implements Node {
    /** The parent. */
    protected Node parent;
    /** The children. */
    protected Node[] children;
    /** The id. */
    protected int id;
    /** The value. */
    protected Object value;
    /** The parser. */
    protected OWLFunctionalSyntaxParser parser;

    /** Instantiates a new simple node.
     * 
     * @param i
     *            id */
    public SimpleNode(int i) {
        id = i;
    }

    /** Instantiates a new simple node.
     * 
     * @param p
     *            parser
     * @param i
     *            id */
    public SimpleNode(OWLFunctionalSyntaxParser p, int i) {
        this(i);
        parser = p;
    }

    @Override
    public void jjtOpen() {}

    @Override
    public void jjtClose() {}

    @Override
    public void jjtSetParent(Node n) {
        parent = n;
    }

    @Override
    public Node jjtGetParent() {
        return parent;
    }

    @Override
    public void jjtAddChild(Node n, int i) {
        if (children == null) {
            children = new Node[i + 1];
        } else if (i >= children.length) {
            Node[] c = new Node[i + 1];
            System.arraycopy(children, 0, c, 0, children.length);
            children = c;
        }
        children[i] = n;
    }

    @Override
    public Node jjtGetChild(int i) {
        return children[i];
    }

    @Override
    public int jjtGetNumChildren() {
        return children == null ? 0 : children.length;
    }

    /** Jjt set value.
     * 
     * @param value1
     *            the value1 */
    public void jjtSetValue(Object value1) {
        value = value1;
    }

    /** Jjt get value.
     * 
     * @return the object */
    public Object jjtGetValue() {
        return value;
    }

    /*
     * You can override these two methods in subclasses of SimpleNode to
     * customize the way the node appears when the tree is dumped. If your
     * output uses more than one line you should override toString(String),
     * otherwise overriding toString() is probably all you need to do.
     */
    @Override
    public String toString() {
        return OWLFunctionalSyntaxParserTreeConstants.jjtNodeName[id];
    }

    /** To string.
     * 
     * @param prefix
     *            prefix to use
     * @return string representation */
    public String toString(String prefix) {
        return prefix + toString();
    }

    /** Override this method if you want to customize how the node dumps out its
     * children.
     * 
     * @param prefix
     *            prefix */
    public void dump(String prefix) {
        System.out.println(toString(prefix));
        if (children != null) {
            for (int i = 0; i < children.length; ++i) {
                SimpleNode n = (SimpleNode) children[i];
                if (n != null) {
                    n.dump(prefix + " ");
                }
            }
        }
    }
}
/*
 * JavaCC - OriginalChecksum=707adbd83a3d277d6fe60dfed1348667 (do not edit this
 * line)
 */