package j$.util.stream;

import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class q extends b5 {
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(a aVar, int i, Object obj, int i2) {
        super(aVar, i);
        this.s = i2;
        this.t = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(c5 c5Var, Consumer consumer) {
        super(c5Var, 0);
        this.s = 3;
        this.t = consumer;
    }

    @Override // j$.util.stream.a
    public final k5 P0(int i, k5 k5Var) {
        switch (this.s) {
            case 0:
                return new p(this, k5Var, 0);
            case 1:
                return new s0(this, k5Var, 0);
            case 2:
                return new b1(this, k5Var, 0);
            case 3:
                return new l(this, k5Var, 1);
            case 4:
                return new l(this, k5Var, 2);
            case 5:
                return new l(this, k5Var, 3);
            default:
                return new k(this, k5Var);
        }
    }
}
