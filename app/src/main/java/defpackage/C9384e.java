package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9384e extends AbstractC15131e {
    public boolean ad = false;
    public final /* synthetic */ C17281e vip;

    public C9384e(C17281e c17281e) {
        this.vip = c17281e;
    }

    @Override // defpackage.AbstractC15131e
    public final void ad(RecyclerView recyclerView, int i) {
        if (i == 0 && this.ad) {
            this.ad = false;
            this.vip.advert();
        }
    }

    @Override // defpackage.AbstractC15131e
    public final void vip(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.ad = true;
    }
}
