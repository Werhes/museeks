package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public abstract class z extends a implements c0 {
    public static j$.util.t0 T0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.t0) {
            return (j$.util.t0) spliterator;
        }
        if (!f8.a) {
            throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
        }
        f8.a(a.class, "using DoubleStream.adapt(Spliterator<Double> s)");
        throw null;
    }

    @Override // j$.util.stream.c0
    public final IntStream A() {
        Objects.requireNonNull(null);
        return new s(this, x6.p | x6.n, 0);
    }

    @Override // j$.util.stream.u3
    public final x1 A0(long j, IntFunction intFunction) {
        return u3.i0(j);
    }

    @Override // j$.util.stream.c0
    public final boolean C() {
        return ((Boolean) H0(u3.u0(s1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.a
    public final f2 J0(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return u3.c0(aVar, spliterator, z);
    }

    @Override // j$.util.stream.a
    public final boolean K0(Spliterator spliterator, k5 k5Var) {
        DoubleConsumer d0Var;
        boolean m;
        j$.util.t0 T0 = T0(spliterator);
        if (k5Var instanceof DoubleConsumer) {
            d0Var = (DoubleConsumer) k5Var;
        } else {
            if (f8.a) {
                f8.a(a.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            Objects.requireNonNull(k5Var);
            d0Var = new j$.util.d0(k5Var, 1);
        }
        do {
            m = k5Var.m();
            if (m) {
                break;
            }
        } while (T0.tryAdvance(d0Var));
        return m;
    }

    @Override // j$.util.stream.a
    public final y6 L0() {
        return y6.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.a
    public final Spliterator S0(a aVar, Supplier supplier, boolean z) {
        return new z6(aVar, supplier, z);
    }

    @Override // j$.util.stream.c0
    public final c0 a() {
        int i = x8.a;
        Objects.requireNonNull(null);
        return new c6(this, x8.a, 1);
    }

    @Override // j$.util.stream.c0
    public final j$.util.a0 average() {
        double[] dArr = (double[]) collect(new j$.time.d(23), new j$.time.d(24), new j$.time.d(25));
        if (dArr[2] <= 0.0d) {
            return j$.util.a0.c;
        }
        int i = j.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        if (Double.isNaN(d) && Double.isInfinite(d2)) {
            d = d2;
        }
        return new j$.util.a0(d / dArr[2]);
    }

    @Override // j$.util.stream.c0
    public final c0 b() {
        Objects.requireNonNull(null);
        return new v(this, x6.t, 1);
    }

    @Override // j$.util.stream.c0
    public final Stream boxed() {
        return new q(this, 0, new j$.time.d(28), 0);
    }

    @Override // j$.util.stream.c0
    public final c0 c() {
        int i = x8.a;
        Objects.requireNonNull(null);
        return new c6(this, x8.b, 2);
    }

    @Override // j$.util.stream.c0
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        o oVar = new o(biConsumer, 0);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objDoubleConsumer);
        Objects.requireNonNull(oVar);
        return H0(new z3(y6.DOUBLE_VALUE, oVar, objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.c0
    public final long count() {
        return ((Long) H0(new b4(1))).longValue();
    }

    @Override // j$.util.stream.c0
    public final c0 d(j$.time.r rVar) {
        Objects.requireNonNull(rVar);
        return new r(this, x6.p | x6.n | x6.t, rVar, 1);
    }

    @Override // j$.util.stream.c0
    public final c0 distinct() {
        return ((c5) boxed()).distinct().mapToDouble(new j$.time.d(29));
    }

    @Override // j$.util.stream.c0
    public final j$.util.a0 findAny() {
        return (j$.util.a0) H0(e0.d);
    }

    @Override // j$.util.stream.c0
    public final j$.util.a0 findFirst() {
        return (j$.util.a0) H0(e0.c);
    }

    public void forEach(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        H0(new l0(doubleConsumer, false));
    }

    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        H0(new l0(doubleConsumer, true));
    }

    @Override // j$.util.stream.g
    public final j$.util.g0 iterator() {
        j$.util.t0 spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.h1(spliterator);
    }

    @Override // j$.util.stream.c0
    public final c0 limit(long j) {
        if (j >= 0) {
            return u3.v0(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.c0
    public final c0 map(DoubleUnaryOperator doubleUnaryOperator) {
        Objects.requireNonNull(doubleUnaryOperator);
        return new r(this, x6.p | x6.n, doubleUnaryOperator, 0);
    }

    @Override // j$.util.stream.c0
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        Objects.requireNonNull(doubleFunction);
        return new q(this, x6.p | x6.n, doubleFunction, 0);
    }

    @Override // j$.util.stream.c0
    public final j$.util.a0 max() {
        return reduce(new n(1));
    }

    @Override // j$.util.stream.c0
    public final j$.util.a0 min() {
        return reduce(new j$.time.d(22));
    }

    @Override // j$.util.stream.c0
    public final boolean n() {
        return ((Boolean) H0(u3.u0(s1.ANY))).booleanValue();
    }

    @Override // j$.util.stream.c0
    public final c0 peek(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new r(this, doubleConsumer);
    }

    @Override // j$.util.stream.c0
    public final double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return ((Double) H0(new d4(y6.DOUBLE_VALUE, doubleBinaryOperator, d))).doubleValue();
    }

    @Override // j$.util.stream.c0
    public final j$.util.a0 reduce(DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return (j$.util.a0) H0(new x3(y6.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }

    @Override // j$.util.stream.c0
    public final c0 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : u3.v0(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.c0
    public final c0 sorted() {
        return new c6(this, x6.q | x6.o, 0);
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final j$.util.t0 spliterator() {
        return T0(super.spliterator());
    }

    @Override // j$.util.stream.c0
    public final double sum() {
        double[] dArr = (double[]) collect(new n(2), new n(3), new j$.time.d(21));
        int i = j.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (Double.isNaN(d) && Double.isInfinite(d2)) ? d2 : d;
    }

    @Override // j$.util.stream.c0
    public final j$.util.v summaryStatistics() {
        return (j$.util.v) collect(new j$.time.d(15), new j$.time.d(26), new j$.time.d(27));
    }

    @Override // j$.util.stream.c0
    public final boolean t() {
        return ((Boolean) H0(u3.u0(s1.ALL))).booleanValue();
    }

    @Override // j$.util.stream.c0
    public final double[] toArray() {
        return (double[]) u3.o0((z1) I0(new n(0))).b();
    }

    @Override // j$.util.stream.c0
    public final l1 u() {
        Objects.requireNonNull(null);
        return new t(this, x6.p | x6.n, 0);
    }
}
