package j$.util.stream;

/* loaded from: classes2.dex */
public final class p5 extends f5 {
    public long b;
    public long c;
    public final /* synthetic */ q5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(q5 q5Var, k5 k5Var) {
        super(k5Var);
        this.d = q5Var;
        this.b = q5Var.s;
        long j = q5Var.t;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.j5, j$.util.stream.k5
    public final void accept(long j) {
        long j2 = this.b;
        if (j2 != 0) {
            this.b = j2 - 1;
            return;
        }
        long j3 = this.c;
        if (j3 > 0) {
            this.c = j3 - 1;
            this.a.accept(j);
        }
    }

    @Override // j$.util.stream.f5, j$.util.stream.k5
    public final void h(long j) {
        this.a.h(u3.X(j, this.d.s, this.c));
    }

    @Override // j$.util.stream.f5, j$.util.stream.k5
    public final boolean m() {
        return this.c == 0 || this.a.m();
    }
}
