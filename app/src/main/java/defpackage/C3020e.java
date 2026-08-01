package defpackage;

import android.view.ViewGroup;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۧۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3020e extends AbstractC7326e {
    public boolean ad = false;
    public final ViewGroup vip;

    public C3020e(ViewGroup viewGroup) {
        this.vip = viewGroup;
    }

    @Override // defpackage.AbstractC7326e, defpackage.InterfaceC10190e
    public final void ad(AbstractC18109e abstractC18109e) {
        if (!this.ad) {
            AbstractC8141e.yandex(this.vip, false);
        }
        abstractC18109e.ads(this);
    }

    @Override // defpackage.AbstractC7326e, defpackage.InterfaceC10190e
    public final void billing(AbstractC18109e abstractC18109e) {
        AbstractC8141e.yandex(this.vip, false);
        this.ad = true;
    }

    @Override // defpackage.AbstractC7326e, defpackage.InterfaceC10190e
    public final void purchase() {
        AbstractC8141e.yandex(this.vip, true);
    }

    @Override // defpackage.AbstractC7326e, defpackage.InterfaceC10190e
    public final void vip() {
        AbstractC8141e.yandex(this.vip, false);
    }
}
