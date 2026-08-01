package j$.util.stream;

/* loaded from: classes2.dex */
public final class u4 extends v4 {
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.b++;
    }

    @Override // j$.util.stream.q4, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.p4
    public final void q(p4 p4Var) {
        this.b += ((v4) p4Var).b;
    }
}
