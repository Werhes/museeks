package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class e1 extends h1 {
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(a aVar, int i, Object obj, int i2) {
        super(aVar, i);
        this.s = i2;
        this.t = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(i1 i1Var, LongConsumer longConsumer) {
        super(i1Var, 0);
        this.s = 1;
        this.t = longConsumer;
    }

    @Override // j$.util.stream.a
    public final k5 P0(int i, k5 k5Var) {
        switch (this.s) {
            case 0:
                return new d1(this, k5Var);
            case 1:
                return new b1(this, k5Var, 5);
            case 2:
                return new x4(this, k5Var);
            default:
                return new l(this, k5Var, 5);
        }
    }
}
