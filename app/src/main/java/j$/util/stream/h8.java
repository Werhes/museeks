package j$.util.stream;

/* loaded from: classes2.dex */
public final class h8 extends g5 implements p8 {
    public long b;
    public boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ g8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(g8 g8Var, k5 k5Var, boolean z) {
        super(k5Var);
        this.e = g8Var;
        this.d = z;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z;
        boolean z2;
        if (!this.c) {
            boolean test = this.e.t.test(obj);
            this.c = !test;
            if (test) {
                z = false;
                z2 = this.d;
                if (z2 && !z) {
                    this.b++;
                }
                if (!z2 || z) {
                    this.a.accept((k5) obj);
                }
                return;
            }
        }
        z = true;
        z2 = this.d;
        if (z2) {
            this.b++;
        }
        if (z2) {
        }
        this.a.accept((k5) obj);
    }

    @Override // j$.util.stream.p8
    public final long n() {
        return this.b;
    }
}
