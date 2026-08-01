package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

/* loaded from: classes2.dex */
public final class s0 extends e5 {
    public final /* synthetic */ int b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(a aVar, k5 k5Var, int i) {
        super(k5Var);
        this.b = i;
        this.c = aVar;
    }

    @Override // j$.util.stream.i5, j$.util.stream.k5
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                this.a.accept((k5) ((IntFunction) ((q) this.c).t).apply(i));
                return;
            case 1:
                ((IntConsumer) ((t0) this.c).t).accept(i);
                this.a.accept(i);
                return;
            case 2:
                ((s) this.c).getClass();
                IntUnaryOperator intUnaryOperator = null;
                intUnaryOperator.applyAsInt(i);
                throw null;
            case 3:
                ((t) this.c).getClass();
                IntToLongFunction intToLongFunction = null;
                intToLongFunction.applyAsLong(i);
                throw null;
            case 4:
                ((v) this.c).getClass();
                IntToDoubleFunction intToDoubleFunction = null;
                intToDoubleFunction.applyAsDouble(i);
                throw null;
            default:
                ((s) this.c).getClass();
                IntPredicate intPredicate = null;
                intPredicate.test(i);
                throw null;
        }
    }

    @Override // j$.util.stream.e5, j$.util.stream.k5
    public void h(long j) {
        switch (this.b) {
            case 5:
                this.a.h(-1L);
                return;
            default:
                super.h(j);
                return;
        }
    }
}
