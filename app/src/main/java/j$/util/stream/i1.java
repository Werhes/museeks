package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public abstract class i1 extends a implements l1 {
    public static j$.util.z0 T0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.z0) {
            return (j$.util.z0) spliterator;
        }
        if (!f8.a) {
            throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
        }
        f8.a(a.class, "using LongStream.adapt(Spliterator<Long> s)");
        throw null;
    }

    @Override // j$.util.stream.u3
    public final x1 A0(long j, IntFunction intFunction) {
        return u3.t0(j);
    }

    @Override // j$.util.stream.l1
    public final IntStream B() {
        Objects.requireNonNull(null);
        return new s(this, x6.p | x6.n, 4);
    }

    @Override // j$.util.stream.a
    public final f2 J0(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return u3.e0(aVar, spliterator, z);
    }

    @Override // j$.util.stream.a
    public final boolean K0(Spliterator spliterator, k5 k5Var) {
        LongConsumer l0Var;
        boolean m;
        j$.util.z0 T0 = T0(spliterator);
        if (k5Var instanceof LongConsumer) {
            l0Var = (LongConsumer) k5Var;
        } else {
            if (f8.a) {
                f8.a(a.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            Objects.requireNonNull(k5Var);
            l0Var = new j$.util.l0(k5Var, 1);
        }
        do {
            m = k5Var.m();
            if (m) {
                break;
            }
        } while (T0.tryAdvance(l0Var));
        return m;
    }

    @Override // j$.util.stream.a
    public final y6 L0() {
        return y6.LONG_VALUE;
    }

    @Override // j$.util.stream.a
    public final Spliterator S0(a aVar, Supplier supplier, boolean z) {
        return new z6(aVar, supplier, z);
    }

    @Override // j$.util.stream.l1
    public final l1 a() {
        int i = x8.a;
        Objects.requireNonNull(null);
        return new e6(this, x8.a, 1);
    }

    @Override // j$.util.stream.l1
    public final c0 asDoubleStream() {
        return new v(this, x6.n, 4);
    }

    @Override // j$.util.stream.l1
    public final j$.util.a0 average() {
        long j = ((long[]) collect(new a1(0), new a1(1), new a1(2)))[0];
        return j > 0 ? new j$.util.a0(r0[1] / j) : j$.util.a0.c;
    }

    @Override // j$.util.stream.l1
    public final l1 b() {
        Objects.requireNonNull(null);
        return new t(this, x6.t, 5);
    }

    @Override // j$.util.stream.l1
    public final Stream boxed() {
        return new q(this, 0, new n(29), 2);
    }

    @Override // j$.util.stream.l1
    public final l1 c() {
        int i = x8.a;
        Objects.requireNonNull(null);
        return new e6(this, x8.b, 2);
    }

    @Override // j$.util.stream.l1
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        o oVar = new o(biConsumer, 2);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objLongConsumer);
        Objects.requireNonNull(oVar);
        return H0(new z3(y6.LONG_VALUE, oVar, objLongConsumer, supplier, 0));
    }

    @Override // j$.util.stream.l1
    public final long count() {
        return ((Long) H0(new b4(0))).longValue();
    }

    @Override // j$.util.stream.l1
    public final l1 d(j$.time.r rVar) {
        Objects.requireNonNull(rVar);
        return new e1(this, x6.p | x6.n | x6.t, rVar, 0);
    }

    @Override // j$.util.stream.l1
    public final l1 distinct() {
        return ((c5) boxed()).distinct().mapToLong(new n(26));
    }

    @Override // j$.util.stream.l1
    public final l1 e() {
        Objects.requireNonNull(null);
        return new t(this, x6.p | x6.n, 3);
    }

    @Override // j$.util.stream.l1
    public final j$.util.c0 findAny() {
        return (j$.util.c0) H0(g0.d);
    }

    @Override // j$.util.stream.l1
    public final j$.util.c0 findFirst() {
        return (j$.util.c0) H0(g0.c);
    }

    public void forEach(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        H0(new n0(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        H0(new n0(longConsumer, true));
    }

    @Override // j$.util.stream.g
    public final j$.util.o0 iterator() {
        j$.util.z0 spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.g1(spliterator);
    }

    @Override // j$.util.stream.l1
    public final c0 k() {
        Objects.requireNonNull(null);
        return new v(this, x6.p | x6.n, 5);
    }

    @Override // j$.util.stream.l1
    public final l1 limit(long j) {
        if (j >= 0) {
            return u3.z0(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.l1
    public final boolean m() {
        return ((Boolean) H0(u3.y0(s1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.l1
    public final Stream mapToObj(LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return new q(this, x6.p | x6.n, longFunction, 2);
    }

    @Override // j$.util.stream.l1
    public final j$.util.c0 max() {
        return reduce(new a1(3));
    }

    @Override // j$.util.stream.l1
    public final j$.util.c0 min() {
        return reduce(new n(25));
    }

    @Override // j$.util.stream.l1
    public final boolean p() {
        return ((Boolean) H0(u3.y0(s1.ANY))).booleanValue();
    }

    @Override // j$.util.stream.l1
    public final l1 peek(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new e1(this, longConsumer);
    }

    @Override // j$.util.stream.l1
    public final long reduce(long j, LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return ((Long) H0(new v3(y6.LONG_VALUE, longBinaryOperator, j))).longValue();
    }

    @Override // j$.util.stream.l1
    public final j$.util.c0 reduce(LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return (j$.util.c0) H0(new x3(y6.LONG_VALUE, longBinaryOperator, 0));
    }

    @Override // j$.util.stream.l1
    public final l1 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : u3.z0(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.l1
    public final l1 sorted() {
        return new e6(this, x6.q | x6.o, 0);
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final j$.util.z0 spliterator() {
        return T0(super.spliterator());
    }

    @Override // j$.util.stream.l1
    public final long sum() {
        return reduce(0L, new a1(4));
    }

    @Override // j$.util.stream.l1
    public final j$.util.y summaryStatistics() {
        return (j$.util.y) collect(new j$.time.d(17), new n(24), new n(27));
    }

    @Override // j$.util.stream.l1
    public final long[] toArray() {
        return (long[]) u3.q0((d2) I0(new n(28))).b();
    }

    @Override // j$.util.stream.l1
    public final boolean x() {
        return ((Boolean) H0(u3.y0(s1.ALL))).booleanValue();
    }
}
