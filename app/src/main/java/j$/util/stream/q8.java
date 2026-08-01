package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class q8 extends d {
    public final a h;
    public final IntFunction i;
    public final boolean j;
    public long k;
    public long l;

    public q8(a aVar, u3 u3Var, Spliterator spliterator, IntFunction intFunction) {
        super(u3Var, spliterator);
        this.h = aVar;
        this.i = intFunction;
        this.j = x6.ORDERED.n(((a) u3Var).m);
    }

    public q8(q8 q8Var, Spliterator spliterator) {
        super(q8Var, spliterator);
        this.h = q8Var.h;
        this.i = q8Var.i;
        this.j = q8Var.j;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        long j;
        boolean b = b();
        if (!b && this.j) {
            x6 x6Var = x6.SIZED;
            a aVar = this.h;
            int i = aVar.j;
            int i2 = x6Var.e;
            if ((i & i2) == i2) {
                j = aVar.l0(this.b);
                x1 A0 = this.a.A0(j, this.i);
                p8 i3 = ((o8) this.h).i(A0, (this.j || b) ? false : true);
                this.a.E0(this.b, i3);
                f2 build = A0.build();
                this.k = build.count();
                this.l = i3.n();
                return build;
            }
        }
        j = -1;
        x1 A02 = this.a.A0(j, this.i);
        p8 i32 = ((o8) this.h).i(A02, (this.j || b) ? false : true);
        this.a.E0(this.b, i32);
        f2 build2 = A02.build();
        this.k = build2.count();
        this.l = i32.n();
        return build2;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new q8(this, spliterator);
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.d;
        if (dVar != null) {
            if (this.j) {
                q8 q8Var = (q8) dVar;
                long j = q8Var.l;
                this.l = j;
                if (j == q8Var.k) {
                    this.l = j + ((q8) this.e).l;
                }
            }
            q8 q8Var2 = (q8) dVar;
            long j2 = q8Var2.k;
            q8 q8Var3 = (q8) this.e;
            this.k = j2 + q8Var3.k;
            f2 f0 = q8Var2.k == 0 ? (f2) q8Var3.f : q8Var3.k == 0 ? (f2) q8Var2.f : u3.f0(this.h.L0(), (f2) ((q8) this.d).f, (f2) ((q8) this.e).f);
            if (b() && this.j) {
                f0 = f0.e(this.l, f0.count(), this.i);
            }
            this.f = f0;
        }
        super.onCompletion(countedCompleter);
    }
}
