package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public final class w4 extends d {
    public final u3 h;

    public w4(u3 u3Var, u3 u3Var2, Spliterator spliterator) {
        super(u3Var2, spliterator);
        this.h = u3Var;
    }

    public w4(w4 w4Var, Spliterator spliterator) {
        super(w4Var, spliterator);
        this.h = w4Var.h;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        u3 u3Var = this.a;
        p4 D0 = this.h.D0();
        u3Var.E0(this.b, D0);
        return D0;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new w4(this, spliterator);
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.d;
        if (dVar != null) {
            p4 p4Var = (p4) ((w4) dVar).f;
            p4Var.q((p4) ((w4) this.e).f);
            this.f = p4Var;
        }
        super.onCompletion(countedCompleter);
    }
}
