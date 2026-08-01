package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;

/* loaded from: classes2.dex */
public final class p extends d5 {
    public final /* synthetic */ int b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(a aVar, k5 k5Var, int i) {
        super(k5Var);
        this.b = i;
        this.c = aVar;
    }

    @Override // j$.util.stream.h5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        switch (this.b) {
            case 0:
                this.a.accept((k5) ((DoubleFunction) ((q) this.c).t).apply(d));
                return;
            case 1:
                this.a.accept(((DoubleUnaryOperator) ((r) this.c).t).applyAsDouble(d));
                return;
            case 2:
                ((s) this.c).getClass();
                DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d);
                throw null;
            case 3:
                ((t) this.c).getClass();
                DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d);
                throw null;
            case 4:
                ((v) this.c).getClass();
                DoublePredicate doublePredicate = null;
                doublePredicate.test(d);
                throw null;
            default:
                ((DoubleConsumer) ((r) this.c).t).accept(d);
                this.a.accept(d);
                return;
        }
    }

    @Override // j$.util.stream.d5, j$.util.stream.k5
    public void h(long j) {
        switch (this.b) {
            case 4:
                this.a.h(-1L);
                return;
            default:
                super.h(j);
                return;
        }
    }
}
