package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٞؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8846e implements InterfaceC5718e {
    public final C10170e ad;
    public boolean appmetrica;
    public int license;
    public final ArrayList metrica = new ArrayList();
    public final Object vip = new Object();

    public C8846e(AbstractC3317e abstractC3317e, boolean z) {
        this.ad = new C10170e(abstractC3317e, z);
    }

    @Override // defpackage.InterfaceC5718e
    public final AbstractC6690e metrica() {
        return this.ad.loadAd;
    }

    @Override // defpackage.InterfaceC5718e
    public final Object vip() {
        return this.vip;
    }
}
