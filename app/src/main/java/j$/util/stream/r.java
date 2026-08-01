package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class r extends y {
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(a aVar, int i, Object obj, int i2) {
        super(aVar, i);
        this.s = i2;
        this.t = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(z zVar, DoubleConsumer doubleConsumer) {
        super(zVar, 0);
        this.s = 2;
        this.t = doubleConsumer;
    }

    @Override // j$.util.stream.a
    public final k5 P0(int i, k5 k5Var) {
        switch (this.s) {
            case 0:
                return new p(this, k5Var, 1);
            case 1:
                return new u(this, k5Var);
            case 2:
                return new p(this, k5Var, 5);
            case 3:
                return new l(this, k5Var, 6);
            default:
                return new x4(this, k5Var);
        }
    }
}
