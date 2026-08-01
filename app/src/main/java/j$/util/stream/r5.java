package j$.util.stream;

/* loaded from: classes2.dex */
public final class r5 extends d5 {
    public long b;
    public long c;
    public final /* synthetic */ s5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(s5 s5Var, k5 k5Var) {
        super(k5Var);
        this.d = s5Var;
        this.b = s5Var.s;
        long j = s5Var.t;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.h5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        long j = this.b;
        if (j != 0) {
            this.b = j - 1;
            return;
        }
        long j2 = this.c;
        if (j2 > 0) {
            this.c = j2 - 1;
            this.a.accept(d);
        }
    }

    @Override // j$.util.stream.d5, j$.util.stream.k5
    public final void h(long j) {
        this.a.h(u3.X(j, this.d.s, this.c));
    }

    @Override // j$.util.stream.d5, j$.util.stream.k5
    public final boolean m() {
        return this.c == 0 || this.a.m();
    }
}
