package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* loaded from: classes2.dex */
public final /* synthetic */ class a0 implements c0 {
    public final /* synthetic */ DoubleStream a;

    public /* synthetic */ a0(DoubleStream doubleStream) {
        this.a = doubleStream;
    }

    public static /* synthetic */ c0 f(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof b0 ? ((b0) doubleStream).a : new a0(doubleStream);
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ IntStream A() {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(null));
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ boolean C() {
        return this.a.noneMatch(null);
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ c0 a() {
        return f(this.a.takeWhile(null));
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ j$.util.a0 average() {
        return j$.com.android.tools.r8.a.H(this.a.average());
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ c0 b() {
        return f(this.a.filter(null));
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ Stream boxed() {
        return v6.f(this.a.boxed());
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ c0 c() {
        return f(this.a.dropWhile(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.c0
    public final c0 d(j$.time.r rVar) {
        DoubleStream doubleStream = this.a;
        j$.time.r rVar2 = new j$.time.r(5);
        rVar2.b = rVar;
        return f(doubleStream.flatMap(rVar2));
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ c0 distinct() {
        return f(this.a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.a;
        if (obj instanceof a0) {
            obj = ((a0) obj).a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ j$.util.a0 findAny() {
        return j$.com.android.tools.r8.a.H(this.a.findAny());
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ j$.util.a0 findFirst() {
        return j$.com.android.tools.r8.a.H(this.a.findFirst());
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.a.forEachOrdered(doubleConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.c0, j$.util.stream.g
    public final /* synthetic */ j$.util.g0 iterator() {
        ?? it = this.a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.f0 ? ((j$.util.f0) it).a : new j$.util.e0(it);
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ c0 limit(long j) {
        return f(this.a.limit(j));
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ c0 map(DoubleUnaryOperator doubleUnaryOperator) {
        return f(this.a.map(doubleUnaryOperator));
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return v6.f(this.a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ j$.util.a0 max() {
        return j$.com.android.tools.r8.a.H(this.a.max());
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ j$.util.a0 min() {
        return j$.com.android.tools.r8.a.H(this.a.min());
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ boolean n() {
        return this.a.anyMatch(null);
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g onClose(Runnable runnable) {
        return e.f(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.c0, j$.util.stream.g
    public final /* synthetic */ c0 parallel() {
        return f(this.a.parallel());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g parallel() {
        return e.f(this.a.parallel());
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ c0 peek(DoubleConsumer doubleConsumer) {
        return f(this.a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        return this.a.reduce(d, doubleBinaryOperator);
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ j$.util.a0 reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return j$.com.android.tools.r8.a.H(this.a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.c0, j$.util.stream.g
    public final /* synthetic */ c0 sequential() {
        return f(this.a.sequential());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g sequential() {
        return e.f(this.a.sequential());
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ c0 skip(long j) {
        return f(this.a.skip(j));
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ c0 sorted() {
        return f(this.a.sorted());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.d1.a(this.a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.c0, j$.util.stream.g
    public final /* synthetic */ j$.util.t0 spliterator() {
        return j$.util.r0.a(this.a.spliterator());
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ double sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.c0
    public final j$.util.v summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ boolean t() {
        return this.a.allMatch(null);
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ double[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ l1 u() {
        return j1.f(this.a.mapToLong(null));
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g unordered() {
        return e.f(this.a.unordered());
    }
}
