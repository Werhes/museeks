package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٙٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17089e implements InterfaceC7004e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C17089e f33442e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C17089e f33443e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C17089e f33444e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C17089e f33445e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C17089e f33446e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C17089e f33447e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f33448e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f33449e;

    static {
        int i = 0;
        f33443e = new C17089e("ASSUME_AES_GCM", i);
        f33445e = new C17089e("ASSUME_XCHACHA20POLY1305", i);
        f33442e = new C17089e("ASSUME_CHACHA20POLY1305", i);
        f33447e = new C17089e("ASSUME_AES_CTR_HMAC", i);
        f33446e = new C17089e("ASSUME_AES_EAX", i);
        f33444e = new C17089e("ASSUME_AES_GCM_SIV", i);
    }

    public /* synthetic */ C17089e(String str, int i) {
        this.f33449e = i;
        this.f33448e = str;
    }

    public final String toString() {
        switch (this.f33449e) {
            case 0:
                return this.f33448e;
            default:
                return AbstractC5087e.m1746extends("\"", this.f33448e, "\"");
        }
    }
}
