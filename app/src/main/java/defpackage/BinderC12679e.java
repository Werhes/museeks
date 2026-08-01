package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۗٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC12679e extends AbstractBinderC7295e {
    public final /* synthetic */ C4612e license;

    public BinderC12679e(C4612e c4612e) {
        this.license = c4612e;
    }

    @Override // defpackage.InterfaceC12658e
    public final void applovin(int i) {
        this.license.purchase(i);
    }

    @Override // defpackage.InterfaceC12658e
    /* renamed from: break */
    public final void mo1943break(String str, byte[] bArr) {
        C18482e c18482e = C4612e.f9940interface;
        C4612e.f9940interface.vip("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // defpackage.InterfaceC12658e
    /* renamed from: const */
    public final void mo1944const(int i) {
        this.license.yandex().post(new RunnableC7849e(this, i, 3));
    }

    @Override // defpackage.InterfaceC12658e
    /* renamed from: eؒ٘ؗ */
    public final void mo1945e(int i) {
        C4612e c4612e = this.license;
        c4612e.purchase(i);
        if (c4612e.crashlytics != null) {
            c4612e.yandex().post(new RunnableC7849e(this, i, 2));
        }
    }

    @Override // defpackage.InterfaceC12658e
    /* renamed from: eؔٚۚ */
    public final void mo1946e(int i) {
        this.license.purchase(i);
    }

    @Override // defpackage.InterfaceC12658e
    /* renamed from: eِؕٛ */
    public final void mo1947e() {
        C4612e.f9940interface.vip("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }

    @Override // defpackage.InterfaceC12658e
    /* renamed from: eٌۡٔ */
    public final void mo1948e(C18383e c18383e) {
        this.license.yandex().post(new RunnableC12554e(this, c18383e, 0));
    }

    @Override // defpackage.InterfaceC12658e
    /* renamed from: eٍؓۙ */
    public final void mo1949e(C17005e c17005e, String str, String str2, boolean z) {
        C4612e c4612e = this.license;
        c4612e.pro = c17005e;
        c4612e.signatures = str;
        C14045e c14045e = new C14045e(new Status(0, null, null, null), c17005e, str, str2, z);
        synchronized (c4612e.subscription) {
            try {
                C8988e c8988e = c4612e.loadAd;
                if (c8988e != null) {
                    c8988e.vip(c14045e);
                }
                c4612e.loadAd = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC12658e
    /* renamed from: eٍٟٔ */
    public final void mo1950e(int i, long j) {
        this.license.billing(i, j);
    }

    @Override // defpackage.InterfaceC12658e
    /* renamed from: eۣۣٔ */
    public final void mo1951e(long j) {
        this.license.billing(0, j);
    }

    @Override // defpackage.InterfaceC12658e
    /* renamed from: eٕؓٝ */
    public final void mo1952e(int i) {
        this.license.yandex().post(new RunnableC7849e(this, i, 0));
    }

    @Override // defpackage.InterfaceC12658e
    /* renamed from: finally */
    public final void mo1953finally(C17448e c17448e) {
        this.license.yandex().post(new RunnableC17144e(this, c17448e, 29));
    }

    @Override // defpackage.InterfaceC12658e
    /* renamed from: import */
    public final void mo1954import(String str, String str2) {
        C4612e.f9940interface.vip("Receive (type=text, ns=%s) %s", str, str2);
        this.license.yandex().post(new RunnableC11666e(10, this, str, str2));
    }

    @Override // defpackage.InterfaceC12658e
    public final void mopub(int i) {
        this.license.adcel(i);
    }

    @Override // defpackage.InterfaceC12658e
    public final void vip(int i) {
        this.license.yandex().post(new RunnableC7849e(this, i, 1));
    }
}
