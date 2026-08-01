package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class t0 extends y0 {
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(a aVar, int i, Object obj, int i2) {
        super(aVar, i);
        this.s = i2;
        this.t = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(z0 z0Var, IntConsumer intConsumer) {
        super(z0Var, 0);
        this.s = 0;
        this.t = intConsumer;
    }

    @Override // j$.util.stream.a
    public final k5 P0(int i, k5 k5Var) {
        switch (this.s) {
            case 0:
                return new s0(this, k5Var, 1);
            case 1:
                return new v0(this, k5Var);
            case 2:
                return new l(this, k5Var, 4);
            default:
                return new x4(this, k5Var);
        }
    }
}
