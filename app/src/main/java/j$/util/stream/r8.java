package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class r8 extends b {
    public final a j;
    public final IntFunction k;
    public final boolean l;
    public long m;
    public boolean n;
    public volatile boolean o;

    public r8(a aVar, u3 u3Var, Spliterator spliterator, IntFunction intFunction) {
        super(u3Var, spliterator);
        this.j = aVar;
        this.k = intFunction;
        this.l = x6.ORDERED.n(((a) u3Var).m);
    }

    public r8(r8 r8Var, Spliterator spliterator) {
        super(r8Var, spliterator);
        this.j = r8Var.j;
        this.k = r8Var.k;
        this.l = r8Var.l;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        x1 A0 = this.a.A0(-1L, this.k);
        k5 P0 = this.j.P0(((a) this.a).m, A0);
        u3 u3Var = this.a;
        boolean h0 = u3Var.h0(this.b, u3Var.F0(P0));
        this.n = h0;
        if (h0) {
            g();
        }
        f2 build = A0.build();
        this.m = build.count();
        return build;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new r8(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final void f() {
        this.i = true;
        if (this.l && this.o) {
            d(u3.j0(this.j.L0()));
        }
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return u3.j0(this.j.L0());
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        Object f0;
        d dVar = this.d;
        if (dVar != null) {
            this.n = ((r8) dVar).n | ((r8) this.e).n;
            if (this.l && this.i) {
                this.m = 0L;
                f0 = u3.j0(this.j.L0());
            } else {
                if (this.l) {
                    r8 r8Var = (r8) this.d;
                    if (r8Var.n) {
                        this.m = r8Var.m;
                        f0 = (f2) r8Var.i();
                    }
                }
                r8 r8Var2 = (r8) this.d;
                long j = r8Var2.m;
                r8 r8Var3 = (r8) this.e;
                this.m = j + r8Var3.m;
                f0 = r8Var2.m == 0 ? (f2) r8Var3.i() : r8Var3.m == 0 ? (f2) r8Var2.i() : u3.f0(this.j.L0(), (f2) ((r8) this.d).i(), (f2) ((r8) this.e).i());
            }
            d(f0);
        }
        this.o = true;
        super.onCompletion(countedCompleter);
    }
}
