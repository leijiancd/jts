

/*
 * Copyright (c) 2016 Vivid Solutions.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 *
 * http://www.eclipse.org/org/documents/edl-v10.php.
 */
package org.locationtech.jtstest.test;

import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.IntersectionMatrix;
import org.locationtech.jts.io.ParseException;


/**
 * @version 1.7
 */
public interface Testable {


  String getName();


  Geometry getGeometry(int index);


  void setGeometry(int index, Geometry g);


  IntersectionMatrix getIntersectionMatrix();


  void setIntersectionMatrix(IntersectionMatrix im);

  void initGeometry() throws ParseException;

  String getDescription();

  String getWellKnownText(int i);

  void setName(String name);

}

