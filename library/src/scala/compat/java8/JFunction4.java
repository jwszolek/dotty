
/*
 * Copyright (C) 2012-2014 Typesafe Inc. <http://www.typesafe.com>
 */

package scala.compat.java8;

@FunctionalInterface
public interface JFunction4<T1, T2, T3, T4, R> extends scala.Function4<T1, T2, T3, T4, R> {
    default void $init$() {
    };

    @SuppressWarnings("unchecked")
    default scala.Function1<T1, scala.Function1<T2, scala.Function1<T3, scala.Function1<T4, R>>>> curried() {
      return scala.Function4$class.curried(this);
    }

    @SuppressWarnings("unchecked")
    default scala.Function1<scala.Tuple4<T1, T2, T3, T4>, R> tupled() {
      return scala.Function4$class.tupled(this);
    }


}
