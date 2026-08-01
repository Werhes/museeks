package defpackage;

import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌّۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8653e implements InterfaceC9153e {
    public final C4993e ad;
    public final Csuper license;
    public final C18055e metrica;
    public final C17213e vip;

    public C8653e(C4993e c4993e, C17213e c17213e, C18055e c18055e, Csuper csuper) {
        this.ad = c4993e;
        this.vip = c17213e;
        this.metrica = c18055e;
        this.license = csuper;
    }

    @Override // defpackage.InterfaceC9153e
    public final int ad() {
        return this.vip.license().f36470e;
    }

    @Override // defpackage.InterfaceC9153e
    public final int appmetrica(Object obj) {
        return this.license.applovin(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8653e)) {
            return false;
        }
        return AbstractC7890e.billing(this.vip, ((C8653e) obj).vip);
    }

    public final int hashCode() {
        return this.vip.hashCode();
    }

    @Override // defpackage.InterfaceC9153e
    public final void license(int i, Object obj, C13770e c13770e, int i2) {
        c13770e.m3671package(-462424778);
        int i3 = (c13770e.license(i) ? 4 : 2) | i2 | (c13770e.yandex(obj) ? 32 : 16) | (c13770e.purchase(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c13770e.m3673protected(i3 & 1, (i3 & 147) != 146)) {
            AbstractC5967e.vip(obj, i, this.ad.remoteconfig, AbstractC16653e.license(-824725566, new C13752e(this, i, 2), c13770e), c13770e, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C0205e(this, i, obj, i2, 10);
        }
    }

    @Override // defpackage.InterfaceC9153e
    public final Object metrica(int i) {
        return this.vip.metrica(i);
    }

    @Override // defpackage.InterfaceC9153e
    public final Object vip(int i) {
        Object premium = this.license.premium(i);
        return premium == null ? this.vip.appmetrica(i) : premium;
    }
}
