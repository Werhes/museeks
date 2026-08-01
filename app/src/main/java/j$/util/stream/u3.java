package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public abstract class u3 implements d8 {
    public static final x2 a = new Object();
    public static final v2 b = new Object();
    public static final w2 c = new Object();
    public static final u2 d = new Object();
    public static final int[] e = new int[0];
    public static final long[] f = new long[0];
    public static final double[] g = new double[0];

    public static j$.util.concurrent.t B0(s1 s1Var, Predicate predicate) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(s1Var);
        return new j$.util.concurrent.t(y6.REFERENCE, s1Var, new j$.util.concurrent.t(5, s1Var, predicate));
    }

    public static m5 C0(c5 c5Var, long j, long j2) {
        if (j >= 0) {
            return new m5(c5Var, m0(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static void D() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void E(h5 h5Var, Double d2) {
        if (f8.a) {
            f8.a(h5Var.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        h5Var.accept(d2.doubleValue());
    }

    public static void G(i5 i5Var, Integer num) {
        if (f8.a) {
            f8.a(i5Var.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        i5Var.accept(num.intValue());
    }

    public static void I(j5 j5Var, Long l) {
        if (f8.a) {
            f8.a(j5Var.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        j5Var.accept(l.longValue());
    }

    public static void K() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void L() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static Object[] M(e2 e2Var, IntFunction intFunction) {
        if (f8.a) {
            f8.a(e2Var.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (e2Var.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) e2Var.count());
        e2Var.f(objArr, 0);
        return objArr;
    }

    public static void N(z1 z1Var, Double[] dArr, int i) {
        if (f8.a) {
            f8.a(z1Var.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) z1Var.b();
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            dArr[i + i2] = Double.valueOf(dArr2[i2]);
        }
    }

    public static void O(b2 b2Var, Integer[] numArr, int i) {
        if (f8.a) {
            f8.a(b2Var.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) b2Var.b();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = Integer.valueOf(iArr[i2]);
        }
    }

    public static void P(d2 d2Var, Long[] lArr, int i) {
        if (f8.a) {
            f8.a(d2Var.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) d2Var.b();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i + i2] = Long.valueOf(jArr[i2]);
        }
    }

    public static void Q(z1 z1Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            z1Var.d((DoubleConsumer) consumer);
        } else {
            if (f8.a) {
                f8.a(z1Var.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.t0) z1Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void R(b2 b2Var, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            b2Var.d((IntConsumer) consumer);
        } else {
            if (f8.a) {
                f8.a(b2Var.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.w0) b2Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void S(d2 d2Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            d2Var.d((LongConsumer) consumer);
        } else {
            if (f8.a) {
                f8.a(d2Var.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.z0) d2Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static z1 T(z1 z1Var, long j, long j2) {
        if (j == 0 && j2 == z1Var.count()) {
            return z1Var;
        }
        long j3 = j2 - j;
        j$.util.t0 t0Var = (j$.util.t0) z1Var.spliterator();
        u1 i0 = i0(j3);
        i0.h(j3);
        for (int i = 0; i < j && t0Var.tryAdvance((DoubleConsumer) new y1(0)); i++) {
        }
        if (j2 == z1Var.count()) {
            t0Var.forEachRemaining((DoubleConsumer) i0);
        } else {
            for (int i2 = 0; i2 < j3 && t0Var.tryAdvance((DoubleConsumer) i0); i2++) {
            }
        }
        i0.end();
        return i0.build();
    }

    public static b2 U(b2 b2Var, long j, long j2) {
        if (j == 0 && j2 == b2Var.count()) {
            return b2Var;
        }
        long j3 = j2 - j;
        j$.util.w0 w0Var = (j$.util.w0) b2Var.spliterator();
        v1 s0 = s0(j3);
        s0.h(j3);
        for (int i = 0; i < j && w0Var.tryAdvance((IntConsumer) new a2(0)); i++) {
        }
        if (j2 == b2Var.count()) {
            w0Var.forEachRemaining((IntConsumer) s0);
        } else {
            for (int i2 = 0; i2 < j3 && w0Var.tryAdvance((IntConsumer) s0); i2++) {
            }
        }
        s0.end();
        return s0.build();
    }

    public static d2 V(d2 d2Var, long j, long j2) {
        if (j == 0 && j2 == d2Var.count()) {
            return d2Var;
        }
        long j3 = j2 - j;
        j$.util.z0 z0Var = (j$.util.z0) d2Var.spliterator();
        w1 t0 = t0(j3);
        t0.h(j3);
        for (int i = 0; i < j && z0Var.tryAdvance((LongConsumer) new c2(0)); i++) {
        }
        if (j2 == d2Var.count()) {
            z0Var.forEachRemaining((LongConsumer) t0);
        } else {
            for (int i2 = 0; i2 < j3 && z0Var.tryAdvance((LongConsumer) t0); i2++) {
            }
        }
        t0.end();
        return t0.build();
    }

    public static f2 W(f2 f2Var, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == f2Var.count()) {
            return f2Var;
        }
        Spliterator spliterator = f2Var.spliterator();
        long j3 = j2 - j;
        x1 Z = Z(j3, intFunction);
        Z.h(j3);
        for (int i = 0; i < j && spliterator.tryAdvance(new a1(5)); i++) {
        }
        if (j2 == f2Var.count()) {
            spliterator.forEachRemaining(Z);
        } else {
            for (int i2 = 0; i2 < j3 && spliterator.tryAdvance(Z); i2++) {
            }
        }
        Z.end();
        return Z.build();
    }

    public static long X(long j, long j2, long j3) {
        if (j >= 0) {
            return Math.max(-1L, Math.min(j - j2, j3));
        }
        return -1L;
    }

    public static Spliterator Y(y6 y6Var, Spliterator spliterator, long j, long j2) {
        long a0 = a0(j, j2);
        int i = t5.a[y6Var.ordinal()];
        if (i == 1) {
            return new r7(spliterator, j, a0);
        }
        if (i == 2) {
            return new q7((j$.util.w0) spliterator, j, a0);
        }
        if (i == 3) {
            return new q7((j$.util.z0) spliterator, j, a0);
        }
        if (i == 4) {
            return new q7((j$.util.t0) spliterator, j, a0);
        }
        throw new IllegalStateException("Unknown shape " + y6Var);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [j$.util.stream.i2, j$.util.stream.x1] */
    /* JADX WARN: Type inference failed for: r2v1, types: [j$.util.stream.x1, j$.util.stream.u6] */
    public static x1 Z(long j, IntFunction intFunction) {
        return (j < 0 || j >= 2147483639) ? new u6() : new i2(j, intFunction);
    }

    public static long a0(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        if (j3 >= 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.function.LongFunction, j$.util.stream.k0, java.lang.Object] */
    public static f2 b0(u3 u3Var, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long l0 = u3Var.l0(spliterator);
        if (l0 < 0 || !spliterator.hasCharacteristics(16384)) {
            ?? obj = new Object();
            obj.a = intFunction;
            f2 f2Var = (f2) new k2(u3Var, spliterator, obj, new a1(13), 3).invoke();
            return z ? n0(f2Var, intFunction) : f2Var;
        }
        if (l0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) l0);
        new p3(spliterator, u3Var, objArr).invoke();
        return new i2(objArr);
    }

    public static z1 c0(u3 u3Var, Spliterator spliterator, boolean z) {
        long l0 = u3Var.l0(spliterator);
        if (l0 < 0 || !spliterator.hasCharacteristics(16384)) {
            z1 z1Var = (z1) new k2(u3Var, spliterator, new a1(7), new a1(8), 0).invoke();
            return z ? o0(z1Var) : z1Var;
        }
        if (l0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) l0];
        new m3(spliterator, u3Var, dArr).invoke();
        return new r2(dArr);
    }

    public static b2 d0(u3 u3Var, Spliterator spliterator, boolean z) {
        long l0 = u3Var.l0(spliterator);
        if (l0 < 0 || !spliterator.hasCharacteristics(16384)) {
            b2 b2Var = (b2) new k2(u3Var, spliterator, new a1(9), new a1(10), 1).invoke();
            return z ? p0(b2Var) : b2Var;
        }
        if (l0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) l0];
        new n3(spliterator, u3Var, iArr).invoke();
        return new a3(iArr);
    }

    public static d2 e0(u3 u3Var, Spliterator spliterator, boolean z) {
        long l0 = u3Var.l0(spliterator);
        if (l0 < 0 || !spliterator.hasCharacteristics(16384)) {
            d2 d2Var = (d2) new k2(u3Var, spliterator, new a1(11), new a1(12), 2).invoke();
            return z ? q0(d2Var) : d2Var;
        }
        if (l0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) l0];
        new o3(spliterator, u3Var, jArr).invoke();
        return new j3(jArr);
    }

    public static h2 f0(y6 y6Var, f2 f2Var, f2 f2Var2) {
        int i = g2.a[y6Var.ordinal()];
        if (i == 1) {
            return new h2(f2Var, f2Var2);
        }
        if (i == 2) {
            return new h2((b2) f2Var, (b2) f2Var2);
        }
        if (i == 3) {
            return new h2((d2) f2Var, (d2) f2Var2);
        }
        if (i == 4) {
            return new h2((z1) f2Var, (z1) f2Var2);
        }
        throw new IllegalStateException("Unknown shape " + y6Var);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [j$.util.stream.r2, j$.util.stream.u1] */
    /* JADX WARN: Type inference failed for: r2v1, types: [j$.util.stream.t6, j$.util.stream.u1] */
    public static u1 i0(long j) {
        return (j < 0 || j >= 2147483639) ? new t6() : new r2(j);
    }

    public static y2 j0(y6 y6Var) {
        int i = g2.a[y6Var.ordinal()];
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            return b;
        }
        if (i == 3) {
            return c;
        }
        if (i == 4) {
            return d;
        }
        throw new IllegalStateException("Unknown shape " + y6Var);
    }

    public static int m0(long j) {
        return (j != -1 ? x6.u : 0) | x6.t;
    }

    public static f2 n0(f2 f2Var, IntFunction intFunction) {
        if (f2Var.i() <= 0) {
            return f2Var;
        }
        long count = f2Var.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) count);
        new t3(f2Var, objArr, 1).invoke();
        return new i2(objArr);
    }

    public static z1 o0(z1 z1Var) {
        if (z1Var.i() <= 0) {
            return z1Var;
        }
        long count = z1Var.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) count];
        new t3(z1Var, dArr, 0).invoke();
        return new r2(dArr);
    }

    public static b2 p0(b2 b2Var) {
        if (b2Var.i() <= 0) {
            return b2Var;
        }
        long count = b2Var.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) count];
        new t3(b2Var, iArr, 0).invoke();
        return new a3(iArr);
    }

    public static d2 q0(d2 d2Var) {
        if (d2Var.i() <= 0) {
            return d2Var;
        }
        long count = d2Var.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) count];
        new t3(d2Var, jArr, 0).invoke();
        return new j3(jArr);
    }

    public static j$.time.r r0(Function function) {
        j$.time.r rVar = new j$.time.r(6);
        rVar.b = function;
        return rVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [j$.util.stream.a3, j$.util.stream.v1] */
    /* JADX WARN: Type inference failed for: r2v1, types: [j$.util.stream.t6, j$.util.stream.v1] */
    public static v1 s0(long j) {
        return (j < 0 || j >= 2147483639) ? new t6() : new a3(j);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [j$.util.stream.j3, j$.util.stream.w1] */
    /* JADX WARN: Type inference failed for: r2v1, types: [j$.util.stream.t6, j$.util.stream.w1] */
    public static w1 t0(long j) {
        return (j < 0 || j >= 2147483639) ? new t6() : new j3(j);
    }

    public static j$.util.concurrent.t u0(s1 s1Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(s1Var);
        return new j$.util.concurrent.t(y6.DOUBLE_VALUE, s1Var, new m1(s1Var, 2));
    }

    public static s5 v0(z zVar, long j, long j2) {
        if (j >= 0) {
            return new s5(zVar, m0(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static j$.util.concurrent.t w0(s1 s1Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(s1Var);
        return new j$.util.concurrent.t(y6.INT_VALUE, s1Var, new m1(s1Var, 1));
    }

    public static o5 x0(z0 z0Var, long j, long j2) {
        if (j >= 0) {
            return new o5(z0Var, m0(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static j$.util.concurrent.t y0(s1 s1Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(s1Var);
        return new j$.util.concurrent.t(y6.LONG_VALUE, s1Var, new m1(s1Var, 0));
    }

    public static q5 z0(i1 i1Var, long j, long j2) {
        if (j >= 0) {
            return new q5(i1Var, m0(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public abstract x1 A0(long j, IntFunction intFunction);

    public abstract p4 D0();

    public abstract k5 E0(Spliterator spliterator, k5 k5Var);

    public abstract k5 F0(k5 k5Var);

    public abstract Spliterator G0(Spliterator spliterator);

    @Override // j$.util.stream.d8
    public Object f(a aVar, Spliterator spliterator) {
        p4 D0 = D0();
        aVar.E0(spliterator, D0);
        return D0.get();
    }

    public abstract void g0(Spliterator spliterator, k5 k5Var);

    public abstract boolean h0(Spliterator spliterator, k5 k5Var);

    @Override // j$.util.stream.d8
    public Object j(u3 u3Var, Spliterator spliterator) {
        return ((p4) new w4(this, u3Var, spliterator).invoke()).get();
    }

    public abstract f2 k0(Spliterator spliterator, boolean z, IntFunction intFunction);

    public abstract long l0(Spliterator spliterator);

    @Override // j$.util.stream.d8
    public /* synthetic */ int v() {
        return 0;
    }
}
