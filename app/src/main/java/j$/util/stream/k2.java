package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* loaded from: classes2.dex */
public final class k2 extends l2 {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2(u3 u3Var, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator, int i) {
        super(u3Var, spliterator, longFunction, binaryOperator);
        this.k = i;
    }

    @Override // j$.util.stream.l2, j$.util.stream.d
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.k) {
            case 0:
                return a();
            case 1:
                return a();
            case 2:
                return a();
            default:
                return a();
        }
    }

    @Override // j$.util.stream.l2, j$.util.stream.d
    public final d c(Spliterator spliterator) {
        switch (this.k) {
            case 0:
                return new l2(this, spliterator);
            case 1:
                return new l2(this, spliterator);
            case 2:
                return new l2(this, spliterator);
            default:
                return new l2(this, spliterator);
        }
    }
}
