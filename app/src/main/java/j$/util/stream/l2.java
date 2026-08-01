package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* loaded from: classes2.dex */
public class l2 extends d {
    public final u3 h;
    public final LongFunction i;
    public final BinaryOperator j;

    public l2(l2 l2Var, Spliterator spliterator) {
        super(l2Var, spliterator);
        this.h = l2Var.h;
        this.i = l2Var.i;
        this.j = l2Var.j;
    }

    public l2(u3 u3Var, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(u3Var, spliterator);
        this.h = u3Var;
        this.i = longFunction;
        this.j = binaryOperator;
    }

    @Override // j$.util.stream.d
    public d c(Spliterator spliterator) {
        return new l2(this, spliterator);
    }

    @Override // j$.util.stream.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final f2 a() {
        x1 x1Var = (x1) this.i.apply(this.h.l0(this.b));
        this.h.E0(this.b, x1Var);
        return x1Var.build();
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.d;
        if (dVar != null) {
            this.f = (f2) this.j.apply((f2) ((l2) dVar).f, (f2) ((l2) this.e).f);
        }
        super.onCompletion(countedCompleter);
    }
}
