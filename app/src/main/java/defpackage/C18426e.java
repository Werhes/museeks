package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18426e implements InterfaceC11206e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final Object f36126e = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public volatile Object f36127e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public volatile C13572e f36128e;

    @Override // defpackage.InterfaceC16964e
    public final Object get() {
        Object obj = this.f36127e;
        if (obj != f36126e) {
            return obj;
        }
        C13572e c13572e = this.f36128e;
        if (c13572e == null) {
            return this.f36127e;
        }
        Object obj2 = c13572e.get();
        this.f36127e = obj2;
        this.f36128e = null;
        return obj2;
    }
}
