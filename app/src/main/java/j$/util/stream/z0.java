package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public abstract class z0 extends a implements IntStream {
    public static j$.util.w0 T0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.w0) {
            return (j$.util.w0) spliterator;
        }
        if (!f8.a) {
            throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
        }
        f8.a(a.class, "using IntStream.adapt(Spliterator<Integer> s)");
        throw null;
    }

    @Override // j$.util.stream.u3
    public final x1 A0(long j, IntFunction intFunction) {
        return u3.s0(j);
    }

    @Override // j$.util.stream.a
    public final f2 J0(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return u3.d0(aVar, spliterator, z);
    }

    @Override // j$.util.stream.a
    public final boolean K0(Spliterator spliterator, k5 k5Var) {
        IntConsumer h0Var;
        boolean m;
        j$.util.w0 T0 = T0(spliterator);
        if (k5Var instanceof IntConsumer) {
            h0Var = (IntConsumer) k5Var;
        } else {
            if (f8.a) {
                f8.a(a.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            Objects.requireNonNull(k5Var);
            h0Var = new j$.util.h0(k5Var, 1);
        }
        do {
            m = k5Var.m();
            if (m) {
                break;
            }
        } while (T0.tryAdvance(h0Var));
        return m;
    }

    @Override // j$.util.stream.a
    public final y6 L0() {
        return y6.INT_VALUE;
    }

    @Override // j$.util.stream.a
    public final Spliterator S0(a aVar, Supplier supplier, boolean z) {
        return new z6(aVar, supplier, z);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream a() {
        int i = x8.a;
        Objects.requireNonNull(null);
        return new d6(this, x8.a, 1);
    }

    @Override // j$.util.stream.IntStream
    public final c0 asDoubleStream() {
        return new v(this, 0, 2);
    }

    @Override // j$.util.stream.IntStream
    public final l1 asLongStream() {
        return new t(this, 0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.a0 average() {
        long j = ((long[]) collect(new n(21), new n(22), new n(23)))[0];
        return j > 0 ? new j$.util.a0(r0[1] / j) : j$.util.a0.c;
    }

    @Override // j$.util.stream.IntStream
    public final IntStream b() {
        Objects.requireNonNull(null);
        return new s(this, x6.t, 3);
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new q(this, 0, new n(15), 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream c() {
        int i = x8.a;
        Objects.requireNonNull(null);
        return new d6(this, x8.b, 2);
    }

    @Override // j$.util.stream.IntStream
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        o oVar = new o(biConsumer, 1);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objIntConsumer);
        Objects.requireNonNull(oVar);
        return H0(new z3(y6.INT_VALUE, oVar, objIntConsumer, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((Long) H0(new b4(3))).longValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((c5) boxed()).distinct().mapToInt(new n(14));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream e() {
        Objects.requireNonNull(null);
        return new s(this, x6.p | x6.n, 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.b0 findAny() {
        return (j$.util.b0) H0(f0.d);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.b0 findFirst() {
        return (j$.util.b0) H0(f0.c);
    }

    public void forEach(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        H0(new m0(intConsumer, false));
    }

    public void forEachOrdered(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        H0(new m0(intConsumer, true));
    }

    @Override // j$.util.stream.IntStream
    public final c0 g() {
        Objects.requireNonNull(null);
        return new v(this, x6.p | x6.n, 3);
    }

    @Override // j$.util.stream.g
    public final j$.util.k0 iterator() {
        j$.util.w0 spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.f1(spliterator);
    }

    @Override // j$.util.stream.IntStream
    public final l1 l() {
        Objects.requireNonNull(null);
        return new t(this, x6.p | x6.n, 2);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j) {
        if (j >= 0) {
            return u3.x0(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        Objects.requireNonNull(intFunction);
        return new q(this, x6.p | x6.n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.b0 max() {
        return reduce(new n(20));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.b0 min() {
        return reduce(new n(16));
    }

    @Override // j$.util.stream.IntStream
    public final boolean o() {
        return ((Boolean) H0(u3.w0(s1.ALL))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return new t0(this, intConsumer);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream r(k0 k0Var) {
        Objects.requireNonNull(k0Var);
        return new t0(this, x6.p | x6.n | x6.t, k0Var, 1);
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i, IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return ((Integer) H0(new k4(y6.INT_VALUE, intBinaryOperator, i))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.b0 reduce(IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return (j$.util.b0) H0(new x3(y6.INT_VALUE, intBinaryOperator, 3));
    }

    @Override // j$.util.stream.IntStream
    public final boolean s() {
        return ((Boolean) H0(u3.w0(s1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : u3.x0(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new d6(this, x6.q | x6.o, 0);
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final j$.util.w0 spliterator() {
        return T0(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new n(19));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.w summaryStatistics() {
        return (j$.util.w) collect(new j$.time.d(16), new n(17), new n(18));
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) u3.p0((b2) I0(new n(13))).b();
    }

    @Override // j$.util.stream.IntStream
    public final boolean z() {
        return ((Boolean) H0(u3.w0(s1.ANY))).booleanValue();
    }
}
