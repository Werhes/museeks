package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

/* loaded from: classes2.dex */
public final class b1 extends f5 {
    public final /* synthetic */ int b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(a aVar, k5 k5Var, int i) {
        super(k5Var);
        this.b = i;
        this.c = aVar;
    }

    @Override // j$.util.stream.j5, j$.util.stream.k5
    public final void accept(long j) {
        switch (this.b) {
            case 0:
                this.a.accept((k5) ((LongFunction) ((q) this.c).t).apply(j));
                return;
            case 1:
                ((t) this.c).getClass();
                LongUnaryOperator longUnaryOperator = null;
                longUnaryOperator.applyAsLong(j);
                throw null;
            case 2:
                ((s) this.c).getClass();
                LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j);
                throw null;
            case 3:
                ((v) this.c).getClass();
                LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j);
                throw null;
            case 4:
                ((t) this.c).getClass();
                LongPredicate longPredicate = null;
                longPredicate.test(j);
                throw null;
            default:
                ((LongConsumer) ((e1) this.c).t).accept(j);
                this.a.accept(j);
                return;
        }
    }

    @Override // j$.util.stream.f5, j$.util.stream.k5
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
