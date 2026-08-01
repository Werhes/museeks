package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public abstract class a extends u3 implements g {
    public final a h;
    public final a i;
    public final int j;
    public final a k;
    public int l;
    public int m;
    public Spliterator n;
    public boolean o;
    public final boolean p;
    public Runnable q;
    public boolean r;

    public a(Spliterator spliterator, int i, boolean z) {
        this.i = null;
        this.n = spliterator;
        this.h = this;
        int i2 = x6.g & i;
        this.j = i2;
        this.m = (~(i2 << 1)) & x6.l;
        this.l = 0;
        this.r = z;
    }

    public a(a aVar, int i) {
        if (aVar.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        aVar.o = true;
        aVar.k = this;
        this.i = aVar;
        this.j = x6.h & i;
        this.m = x6.i(i, aVar.m);
        a aVar2 = aVar.h;
        this.h = aVar2;
        if (O0()) {
            aVar2.p = true;
        }
        this.l = aVar.l + 1;
    }

    @Override // j$.util.stream.u3
    public final k5 E0(Spliterator spliterator, k5 k5Var) {
        g0(spliterator, F0((k5) Objects.requireNonNull(k5Var)));
        return k5Var;
    }

    @Override // j$.util.stream.u3
    public final k5 F0(k5 k5Var) {
        Objects.requireNonNull(k5Var);
        for (a aVar = this; aVar.l > 0; aVar = aVar.i) {
            k5Var = aVar.P0(aVar.i.m, k5Var);
        }
        return k5Var;
    }

    @Override // j$.util.stream.u3
    public final Spliterator G0(Spliterator spliterator) {
        return this.l == 0 ? spliterator : S0(this, new j$.time.r(4, spliterator), this.h.r);
    }

    public final Object H0(d8 d8Var) {
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.o = true;
        return this.h.r ? d8Var.j(this, Q0(d8Var.v())) : d8Var.f(this, Q0(d8Var.v()));
    }

    public final f2 I0(IntFunction intFunction) {
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.o = true;
        if (!this.h.r || this.i == null || !O0()) {
            return k0(Q0(0), true, intFunction);
        }
        this.l = 0;
        a aVar = this.i;
        return M0(aVar, aVar.Q0(0), intFunction);
    }

    public abstract f2 J0(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction);

    public abstract boolean K0(Spliterator spliterator, k5 k5Var);

    public abstract y6 L0();

    public f2 M0(u3 u3Var, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    public Spliterator N0(a aVar, Spliterator spliterator) {
        return M0(aVar, spliterator, new j$.time.d(14)).spliterator();
    }

    public abstract boolean O0();

    public abstract k5 P0(int i, k5 k5Var);

    public final Spliterator Q0(int i) {
        int i2;
        int i3;
        a aVar = this.h;
        Spliterator spliterator = aVar.n;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        aVar.n = null;
        if (aVar.r && aVar.p) {
            a aVar2 = aVar.k;
            int i4 = 1;
            while (aVar != this) {
                int i5 = aVar2.j;
                if (aVar2.O0()) {
                    if (x6.SHORT_CIRCUIT.n(i5)) {
                        i5 &= ~x6.u;
                    }
                    spliterator = aVar2.N0(aVar, spliterator);
                    if (spliterator.hasCharacteristics(64)) {
                        i2 = (~x6.t) & i5;
                        i3 = x6.s;
                    } else {
                        i2 = (~x6.s) & i5;
                        i3 = x6.t;
                    }
                    i5 = i2 | i3;
                    i4 = 0;
                }
                int i6 = i4 + 1;
                aVar2.l = i4;
                aVar2.m = x6.i(i5, aVar.m);
                a aVar3 = aVar2;
                aVar2 = aVar2.k;
                aVar = aVar3;
                i4 = i6;
            }
        }
        if (i != 0) {
            this.m = x6.i(i, this.m);
        }
        return spliterator;
    }

    public final Spliterator R0() {
        a aVar = this.h;
        if (this != aVar) {
            throw new IllegalStateException();
        }
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.o = true;
        Spliterator spliterator = aVar.n;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        aVar.n = null;
        return spliterator;
    }

    public abstract Spliterator S0(a aVar, Supplier supplier, boolean z);

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.o = true;
        this.n = null;
        a aVar = this.h;
        Runnable runnable = aVar.q;
        if (runnable != null) {
            aVar.q = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.u3
    public final void g0(Spliterator spliterator, k5 k5Var) {
        Objects.requireNonNull(k5Var);
        if (x6.SHORT_CIRCUIT.n(this.m)) {
            h0(spliterator, k5Var);
            return;
        }
        k5Var.h(spliterator.getExactSizeIfKnown());
        spliterator.forEachRemaining(k5Var);
        k5Var.end();
    }

    @Override // j$.util.stream.u3
    public final boolean h0(Spliterator spliterator, k5 k5Var) {
        a aVar = this;
        while (aVar.l > 0) {
            aVar = aVar.i;
        }
        k5Var.h(spliterator.getExactSizeIfKnown());
        boolean K0 = aVar.K0(spliterator, k5Var);
        k5Var.end();
        return K0;
    }

    @Override // j$.util.stream.g
    public final boolean isParallel() {
        return this.h.r;
    }

    @Override // j$.util.stream.u3
    public final f2 k0(Spliterator spliterator, boolean z, IntFunction intFunction) {
        if (this.h.r) {
            return J0(this, spliterator, z, intFunction);
        }
        x1 A0 = A0(l0(spliterator), intFunction);
        E0(spliterator, A0);
        return A0.build();
    }

    @Override // j$.util.stream.u3
    public final long l0(Spliterator spliterator) {
        if (x6.SIZED.n(this.m)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.stream.g
    public final g onClose(Runnable runnable) {
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        Objects.requireNonNull(runnable);
        a aVar = this.h;
        Runnable runnable2 = aVar.q;
        if (runnable2 != null) {
            runnable = new c8(runnable2, runnable);
        }
        aVar.q = runnable;
        return this;
    }

    @Override // j$.util.stream.g
    public final g parallel() {
        this.h.r = true;
        return this;
    }

    @Override // j$.util.stream.g
    public final g sequential() {
        this.h.r = false;
        return this;
    }

    @Override // j$.util.stream.g
    public Spliterator spliterator() {
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.o = true;
        a aVar = this.h;
        if (this != aVar) {
            return S0(this, new j$.time.r(3, this), aVar.r);
        }
        Spliterator spliterator = aVar.n;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        aVar.n = null;
        return spliterator;
    }
}
