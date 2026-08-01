package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَْؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C13065e extends AbstractC4125e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C13886e f25995e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C13886e f25996e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C11467e f25997e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f25998e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C3079e f25992e = new C3079e("Setup");

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C3079e f25994e = new C3079e("Monitoring");

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C3079e f25991e = new C3079e("Plugins");

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C3079e f25990e = new C3079e("Call");

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final C3079e f25993e = new C3079e("Fallback");

    public C13065e(boolean z, C11467e c11467e) {
        super(f25992e, f25994e, f25991e, f25990e, f25993e);
        this.f25998e = z;
        this.f25997e = c11467e;
        this.f25995e = new C13886e(z, 0);
        this.f25996e = new C13886e(z, 1);
    }

    @Override // defpackage.AbstractC4125e
    public final boolean billing() {
        return this.f25998e;
    }
}
