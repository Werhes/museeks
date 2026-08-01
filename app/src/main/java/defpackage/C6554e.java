package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٟؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6554e implements InterfaceC11206e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final Object f13482e = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public volatile Object f13483e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public volatile InterfaceC11206e f13484e;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, eؙٟؔ, eُۗۦ] */
    public static InterfaceC11206e ad(InterfaceC11206e interfaceC11206e) {
        if (interfaceC11206e instanceof C6554e) {
            return interfaceC11206e;
        }
        ?? obj = new Object();
        obj.f13483e = f13482e;
        obj.f13484e = interfaceC11206e;
        return obj;
    }

    @Override // defpackage.InterfaceC16964e
    public final Object get() {
        Object obj;
        Object obj2 = this.f13483e;
        Object obj3 = f13482e;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.f13483e;
            if (obj == obj3) {
                obj = this.f13484e.get();
                Object obj4 = this.f13483e;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.f13483e = obj;
                this.f13484e = null;
            }
        }
        return obj;
    }
}
