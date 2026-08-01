package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۙۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16471e extends AbstractC1346e {
    public final AbstractC1346e ad;
    public final /* synthetic */ C8130e vip;

    public C16471e(C8130e c8130e, AbstractC1346e abstractC1346e) {
        this.vip = c8130e;
        this.ad = abstractC1346e;
    }

    @Override // defpackage.AbstractC1346e
    public final void ad(String str, C6114e c6114e) {
        this.ad.ad(str, c6114e);
    }

    @Override // defpackage.AbstractC1346e
    public final void license(String str) {
        this.vip.mopub(str);
        this.ad.license(str);
    }

    @Override // defpackage.AbstractC1346e
    public final void metrica(String str, C12916e c12916e) {
        if (!((Status) c12916e.f25784e).billing()) {
            this.vip.mopub(str);
        }
        this.ad.metrica(str, c12916e);
    }

    @Override // defpackage.AbstractC1346e
    public final void vip(String str, C6524e c6524e) {
        if (c6524e.vip) {
            this.vip.adcel(str);
        }
        this.ad.vip(str, c6524e);
    }
}
