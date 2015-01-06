
/*
Copyright 2014 Twitter, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.twitter.scalding

import cascading.tuple.Fields

/**
 * This class is used to bind together a Fields instance which may contain a type array via getTypes,
 * a TupleConverter and TupleSetter, which are inverses of one another. Note the size of the Fields
 * object and the arity values for the converter and setter are all the same. Note in the scalding-macros
 * package there are macros to generate this for case classes, which may be very convenient.
 */

trait TypeDescriptor[T] extends java.io.Serializable {
  def setter: TupleSetter[T]
  def converter: TupleConverter[T]
  def fields: Fields
}
