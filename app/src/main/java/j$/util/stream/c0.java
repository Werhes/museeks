package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public interface c0 extends g {
    IntStream A();

    boolean C();

    c0 a();

    j$.util.a0 average();

    c0 b();

    Stream boxed();

    c0 c();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    c0 d(j$.time.r rVar);

    c0 distinct();

    j$.util.a0 findAny();

    j$.util.a0 findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    @Override // j$.util.stream.g
    j$.util.g0 iterator();

    c0 limit(long j);

    c0 map(DoubleUnaryOperator doubleUnaryOperator);

    Stream mapToObj(DoubleFunction doubleFunction);

    j$.util.a0 max();

    j$.util.a0 min();

    boolean n();

    @Override // j$.util.stream.g
    c0 parallel();

    c0 peek(DoubleConsumer doubleConsumer);

    double reduce(double d, DoubleBinaryOperator doubleBinaryOperator);

    j$.util.a0 reduce(DoubleBinaryOperator doubleBinaryOperator);

    @Override // j$.util.stream.g
    c0 sequential();

    c0 skip(long j);

    c0 sorted();

    @Override // j$.util.stream.g
    j$.util.t0 spliterator();

    double sum();

    j$.util.v summaryStatistics();

    boolean t();

    double[] toArray();

    l1 u();
}
