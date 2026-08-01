package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class u5 extends b {
    public final a j;
    public final IntFunction k;
    public final long l;
    public final long m;
    public long n;
    public volatile boolean o;

    public u5(a aVar, u3 u3Var, Spliterator spliterator, IntFunction intFunction, long j, long j2) {
        super(u3Var, spliterator);
        this.j = aVar;
        this.k = intFunction;
        this.l = j;
        this.m = j2;
    }

    public u5(u5 u5Var, Spliterator spliterator) {
        super(u5Var, spliterator);
        this.j = u5Var.j;
        this.k = u5Var.k;
        this.l = u5Var.l;
        this.m = u5Var.m;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        if (b()) {
            x6 x6Var = x6.SIZED;
            a aVar = this.j;
            int i = aVar.j;
            int i2 = x6Var.e;
            x1 A0 = this.j.A0((i & i2) == i2 ? aVar.l0(this.b) : -1L, this.k);
            k5 P0 = this.j.P0(((a) this.a).m, A0);
            u3 u3Var = this.a;
            u3Var.h0(this.b, u3Var.F0(P0));
            return A0.build();
        }
        x1 A02 = this.j.A0(-1L, this.k);
        if (this.l == 0) {
            k5 P02 = this.j.P0(((a) this.a).m, A02);
            u3 u3Var2 = this.a;
            u3Var2.h0(this.b, u3Var2.F0(P02));
        } else {
            this.a.E0(this.b, A02);
        }
        f2 build = A02.build();
        this.n = build.count();
        this.o = true;
        this.b = null;
        return build;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new u5(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final void f() {
        this.i = true;
        if (this.o) {
            d(u3.j0(this.j.L0()));
        }
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return u3.j0(this.j.L0());
    }

    public final long j(long j) {
        if (this.o) {
            return this.n;
        }
        u5 u5Var = (u5) this.d;
        u5 u5Var2 = (u5) this.e;
        if (u5Var == null || u5Var2 == null) {
            return this.n;
        }
        long j2 = u5Var.j(j);
        return j2 >= j ? j2 : u5Var2.j(j) + j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e7, code lost:
    
        if (r2 >= r0) goto L49;
     */
    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r12) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.u5.onCompletion(java.util.concurrent.CountedCompleter):void");
    }
}
