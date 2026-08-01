package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٔۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14665e implements InterfaceC16964e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final Object f28900e = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public volatile Object f28901e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public volatile InterfaceC12233e f28902e;

    /* JADX WARN: Type inference failed for: r0v1, types: [eِٔۗ, eِّٗ, java.lang.Object] */
    public static InterfaceC16964e ad(InterfaceC12233e interfaceC12233e) {
        if (interfaceC12233e instanceof C14665e) {
            return interfaceC12233e;
        }
        ?? obj = new Object();
        obj.f28901e = f28900e;
        obj.f28902e = interfaceC12233e;
        return obj;
    }

    @Override // defpackage.InterfaceC16964e
    public final Object get() {
        Object obj;
        Object obj2 = this.f28901e;
        Object obj3 = f28900e;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f28901e;
                if (obj == obj3) {
                    obj = this.f28902e.get();
                    Object obj4 = this.f28901e;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f28901e = obj;
                    this.f28902e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
