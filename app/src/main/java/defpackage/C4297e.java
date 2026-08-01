package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؖۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4297e implements InterfaceC6823e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C8456e f9387e = new C8456e(7);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f9388e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public volatile InterfaceC6823e f9389e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f9390e = new Object();

    public C4297e(InterfaceC6823e interfaceC6823e) {
        interfaceC6823e.getClass();
        this.f9389e = interfaceC6823e;
    }

    @Override // defpackage.InterfaceC6823e
    public final Object get() {
        InterfaceC6823e interfaceC6823e = this.f9389e;
        C8456e c8456e = f9387e;
        if (interfaceC6823e != c8456e) {
            synchronized (this.f9390e) {
                try {
                    if (this.f9389e != c8456e) {
                        Object obj = this.f9389e.get();
                        this.f9388e = obj;
                        this.f9389e = c8456e;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f9388e;
    }

    public final String toString() {
        Object obj = this.f9389e;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == f9387e) {
            obj = "<supplier that returned " + this.f9388e + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
