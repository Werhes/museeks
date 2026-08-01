package j$.util.stream;

/* loaded from: classes2.dex */
public final class t extends h1 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(a aVar, int i, int i2) {
        super(aVar, i);
        this.s = i2;
    }

    @Override // j$.util.stream.a
    public final k5 P0(int i, k5 k5Var) {
        switch (this.s) {
            case 0:
                return new p(this, k5Var, 3);
            case 1:
                return new u0(0, k5Var);
            case 2:
                return new s0(this, k5Var, 3);
            case 3:
                return new b1(this, k5Var, 1);
            case 4:
                return k5Var;
            default:
                return new b1(this, k5Var, 4);
        }
    }
}
