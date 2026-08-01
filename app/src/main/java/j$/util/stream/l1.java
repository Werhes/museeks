package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public interface l1 extends g {
    IntStream B();

    l1 a();

    c0 asDoubleStream();

    j$.util.a0 average();

    l1 b();

    Stream boxed();

    l1 c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    l1 d(j$.time.r rVar);

    l1 distinct();

    l1 e();

    j$.util.c0 findAny();

    j$.util.c0 findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    @Override // j$.util.stream.g
    j$.util.o0 iterator();

    c0 k();

    l1 limit(long j);

    boolean m();

    Stream mapToObj(LongFunction longFunction);

    j$.util.c0 max();

    j$.util.c0 min();

    boolean p();

    @Override // j$.util.stream.g
    l1 parallel();

    l1 peek(LongConsumer longConsumer);

    long reduce(long j, LongBinaryOperator longBinaryOperator);

    j$.util.c0 reduce(LongBinaryOperator longBinaryOperator);

    @Override // j$.util.stream.g
    l1 sequential();

    l1 skip(long j);

    l1 sorted();

    @Override // j$.util.stream.g
    j$.util.z0 spliterator();

    long sum();

    j$.util.y summaryStatistics();

    long[] toArray();

    boolean x();
}
