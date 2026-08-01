package j$.util.stream;

/* loaded from: classes2.dex */
public final class h0 extends i0 {
    public static final d0 c;
    public static final d0 d;

    static {
        y6 y6Var = y6.REFERENCE;
        n nVar = new n(10);
        n nVar2 = new n(11);
        j$.util.z zVar = j$.util.z.b;
        c = new d0(true, y6Var, zVar, nVar, nVar2);
        d = new d0(false, y6Var, zVar, new n(10), new n(11));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new j$.util.z(this.b);
        }
        return null;
    }
}
