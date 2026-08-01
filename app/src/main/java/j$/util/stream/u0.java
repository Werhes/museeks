package j$.util.stream;

/* loaded from: classes2.dex */
public final class u0 extends e5 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(int i, k5 k5Var) {
        super(k5Var);
        this.b = i;
    }

    @Override // j$.util.stream.i5, j$.util.stream.k5
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                this.a.accept(i);
                return;
            default:
                this.a.accept(i);
                return;
        }
    }
}
