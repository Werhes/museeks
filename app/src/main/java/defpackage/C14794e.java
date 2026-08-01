package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٔٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14794e extends AbstractC13616e {

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public C10097e f29316e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final /* synthetic */ C0571e f29317e;

    public C14794e(C0571e c0571e) {
        this.f29317e = c0571e;
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eّْٝ */
    public final void mo228e() {
        C0571e c0571e = this.f29317e;
        if (c0571e.f2751e == this) {
            c0571e.f2751e = null;
        }
        C10097e c10097e = this.f29316e;
        if (c10097e != null) {
            c10097e.vip();
        }
        this.f29316e = null;
    }

    /* renamed from: eٌٔٗ, reason: contains not printable characters */
    public final void m3842e() {
        C12439e c12439e = new C12439e(this, this.f29317e, 10);
        C13915e mopub = AbstractC5851e.mopub(this);
        int i = mopub.f27594e;
        C4930e rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC10501e.ad(mopub)).getRectManager();
        C14998e c14998e = rectManager.metrica;
        c14998e.getClass();
        C3123e c3123e = c14998e.ad;
        C10097e c10097e = new C10097e(c14998e, i, this, c12439e);
        Object vip = c3123e.vip(i);
        if (vip == null) {
            c3123e.startapp(i, c10097e);
            vip = c10097e;
        }
        C10097e c10097e2 = (C10097e) vip;
        if (c10097e2 != c10097e) {
            while (true) {
                C10097e c10097e3 = c10097e2.license;
                if (c10097e3 == null) {
                    break;
                } else {
                    c10097e2 = c10097e3;
                }
            }
            c10097e2.license = c10097e;
        }
        if (AbstractC5851e.mopub(this.f27022e).f27624e) {
            rectManager.vip.m4652static(i, true);
        }
        rectManager.appmetrica = true;
        rectManager.yandex();
        this.f29316e = c10097e;
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: e٘ٔ٘ */
    public final void mo229e() {
        C0571e c0571e = this.f29317e;
        c0571e.f2751e = this;
        if (c0571e.f2750e != null) {
            m3842e();
        }
    }
}
