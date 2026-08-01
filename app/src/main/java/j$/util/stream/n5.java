package j$.util.stream;

/* loaded from: classes2.dex */
public final class n5 extends e5 {
    public long b;
    public long c;
    public final /* synthetic */ o5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(o5 o5Var, k5 k5Var) {
        super(k5Var);
        this.d = o5Var;
        this.b = o5Var.s;
        long j = o5Var.t;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.i5, j$.util.stream.k5
    public final void accept(int i) {
        long j = this.b;
        if (j != 0) {
            this.b = j - 1;
            return;
        }
        long j2 = this.c;
        if (j2 > 0) {
            this.c = j2 - 1;
            this.a.accept(i);
        }
    }

    @Override // j$.util.stream.e5, j$.util.stream.k5
    public final void h(long j) {
        this.a.h(u3.X(j, this.d.s, this.c));
    }

    @Override // j$.util.stream.e5, j$.util.stream.k5
    public final boolean m() {
        return this.c == 0 || this.a.m();
    }
}
