package defpackage;

import android.hardware.camera2.CameraManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٓۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14246e implements AutoCloseable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C2673e f28157e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final CameraManager f28158e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C8780e f28159e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f28160e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C5981e f28161e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C8419e f28162e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C14826e f28163e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C4013e f28164e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C17280e f28165e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C14688e f28166e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C1615e f28167e;

    public C14246e(InterfaceC16964e interfaceC16964e, C17280e c17280e, String str, InterfaceC10500e interfaceC10500e) {
        this.f28165e = c17280e;
        this.f28160e = str;
        this.f28158e = (CameraManager) interfaceC16964e.get();
        C14826e ad = AbstractC9743e.ad(AbstractC5797e.vip(new C6799e(interfaceC10500e), AbstractC5797e.vip(c17280e.purchase, new C5621e("CXCP-CameraStatusMonitor"))));
        this.f28163e = ad;
        this.f28157e = AbstractC14430e.metrica(false);
        C1615e metrica = AbstractC9180e.metrica(C5099e.ad);
        this.f28167e = metrica;
        this.f28166e = new C14688e(metrica);
        C5981e metrica2 = AbstractC6959e.metrica(0, 0, 7);
        this.f28161e = metrica2;
        this.f28164e = new C4013e(metrica2);
        InterfaceC5083e interfaceC5083e = null;
        this.f28159e = AbstractC7535e.metrica(new C1853e(this, interfaceC5083e, 17));
        this.f28162e = AbstractC5336e.purchase(ad, null, 0, new C15238e(this, interfaceC5083e, 12), 3);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f28157e.ad()) {
            this.f28162e.Signature(null);
            AbstractC9743e.license(this.f28163e, null);
        }
    }
}
