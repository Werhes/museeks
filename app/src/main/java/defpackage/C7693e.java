package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٕؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7693e implements InterfaceC18006e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final Object f15616e = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public volatile Object f15617e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public volatile InterfaceC15269e f15618e;

    /* JADX WARN: Type inference failed for: r0v1, types: [eًٕؔ, java.lang.Object, eْ٘ۛ] */
    public static InterfaceC18006e ad(InterfaceC15269e interfaceC15269e) {
        if (interfaceC15269e instanceof C7693e) {
            return interfaceC15269e;
        }
        ?? obj = new Object();
        obj.f15617e = f15616e;
        obj.f15618e = interfaceC15269e;
        return obj;
    }

    @Override // defpackage.InterfaceC16964e
    public final Object get() {
        Object obj;
        Object obj2 = this.f15617e;
        Object obj3 = f15616e;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f15617e;
                if (obj == obj3) {
                    obj = this.f15618e.get();
                    Object obj4 = this.f15617e;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f15617e = obj;
                    this.f15618e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
