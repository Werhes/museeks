package j$.util.stream;

/* loaded from: classes2.dex */
public final class l5 extends g5 {
    public long b;
    public long c;
    public final /* synthetic */ m5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(m5 m5Var, k5 k5Var) {
        super(k5Var);
        this.d = m5Var;
        this.b = m5Var.s;
        long j = m5Var.t;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void t(Object obj) {
        long j = this.b;
        if (j != 0) {
            this.b = j - 1;
            return;
        }
        long j2 = this.c;
        if (j2 > 0) {
            this.c = j2 - 1;
            this.a.t((k5) obj);
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.k5
    public final void h(long j) {
        this.a.h(u3.X(j, this.d.s, this.c));
    }

    @Override // j$.util.stream.g5, j$.util.stream.k5
    public final boolean m() {
        return this.c == 0 || this.a.m();
    }
}
