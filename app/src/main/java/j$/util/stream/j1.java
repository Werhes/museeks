package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.LongStream;

/* loaded from: classes2.dex */
public final /* synthetic */ class j1 implements l1 {
    public final /* synthetic */ LongStream a;

    public /* synthetic */ j1(LongStream longStream) {
        this.a = longStream;
    }

    public static /* synthetic */ l1 f(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof k1 ? ((k1) longStream).a : new j1(longStream);
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ IntStream B() {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(null));
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ l1 a() {
        return f(this.a.takeWhile(null));
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ c0 asDoubleStream() {
        return a0.f(this.a.asDoubleStream());
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ j$.util.a0 average() {
        return j$.com.android.tools.r8.a.H(this.a.average());
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ l1 b() {
        return f(this.a.filter(null));
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ Stream boxed() {
        return v6.f(this.a.boxed());
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ l1 c() {
        return f(this.a.dropWhile(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.l1
    public final l1 d(j$.time.r rVar) {
        LongStream longStream = this.a;
        j$.time.r rVar2 = new j$.time.r(7);
        rVar2.b = rVar;
        return f(longStream.flatMap(rVar2));
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ l1 distinct() {
        return f(this.a.distinct());
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ l1 e() {
        return f(this.a.map(null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongStream longStream = this.a;
        if (obj instanceof j1) {
            obj = ((j1) obj).a;
        }
        return longStream.equals(obj);
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ j$.util.c0 findAny() {
        return j$.com.android.tools.r8.a.J(this.a.findAny());
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ j$.util.c0 findFirst() {
        return j$.com.android.tools.r8.a.J(this.a.findFirst());
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.a.forEach(longConsumer);
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.a.forEachOrdered(longConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // j$.util.stream.l1, j$.util.stream.g
    public final /* synthetic */ j$.util.o0 iterator() {
        ?? it = this.a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.n0 ? ((j$.util.n0) it).a : new j$.util.m0(it);
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ c0 k() {
        return a0.f(this.a.mapToDouble(null));
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ l1 limit(long j) {
        return f(this.a.limit(j));
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ boolean m() {
        return this.a.noneMatch(null);
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return v6.f(this.a.mapToObj(longFunction));
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ j$.util.c0 max() {
        return j$.com.android.tools.r8.a.J(this.a.max());
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ j$.util.c0 min() {
        return j$.com.android.tools.r8.a.J(this.a.min());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g onClose(Runnable runnable) {
        return e.f(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ boolean p() {
        return this.a.anyMatch(null);
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g parallel() {
        return e.f(this.a.parallel());
    }

    @Override // j$.util.stream.l1, j$.util.stream.g
    public final /* synthetic */ l1 parallel() {
        return f(this.a.parallel());
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ l1 peek(LongConsumer longConsumer) {
        return f(this.a.peek(longConsumer));
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ long reduce(long j, LongBinaryOperator longBinaryOperator) {
        return this.a.reduce(j, longBinaryOperator);
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ j$.util.c0 reduce(LongBinaryOperator longBinaryOperator) {
        return j$.com.android.tools.r8.a.J(this.a.reduce(longBinaryOperator));
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g sequential() {
        return e.f(this.a.sequential());
    }

    @Override // j$.util.stream.l1, j$.util.stream.g
    public final /* synthetic */ l1 sequential() {
        return f(this.a.sequential());
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ l1 skip(long j) {
        return f(this.a.skip(j));
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ l1 sorted() {
        return f(this.a.sorted());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.d1.a(this.a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfLong] */
    @Override // j$.util.stream.l1, j$.util.stream.g
    public final /* synthetic */ j$.util.z0 spliterator() {
        return j$.util.x0.a(this.a.spliterator());
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ long sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.l1
    public final j$.util.y summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ long[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g unordered() {
        return e.f(this.a.unordered());
    }

    @Override // j$.util.stream.l1
    public final /* synthetic */ boolean x() {
        return this.a.allMatch(null);
    }
}
