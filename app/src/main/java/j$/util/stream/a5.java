package j$.util.stream;

/* loaded from: classes2.dex */
public abstract class a5 extends c5 {
    @Override // j$.util.stream.a
    public final boolean O0() {
        return true;
    }

    @Override // j$.util.stream.g
    public final g unordered() {
        return !x6.ORDERED.n(this.m) ? this : new a(this, x6.r);
    }
}
