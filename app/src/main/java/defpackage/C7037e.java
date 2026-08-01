package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؚؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7037e extends AbstractC15131e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C7037e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    @Override // defpackage.AbstractC15131e
    public final void vip(RecyclerView recyclerView, int i, int i2) {
        switch (this.ad) {
            case 0:
                C7187e c7187e = (C7187e) this.vip;
                int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int i3 = c7187e.ad;
                int computeVerticalScrollRange = c7187e.remoteconfig.computeVerticalScrollRange();
                int i4 = c7187e.subscription;
                c7187e.pro = computeVerticalScrollRange - i4 > 0 && i4 >= i3;
                int computeHorizontalScrollRange = c7187e.remoteconfig.computeHorizontalScrollRange();
                int i5 = c7187e.admob;
                boolean z = computeHorizontalScrollRange - i5 > 0 && i5 >= i3;
                c7187e.signatures = z;
                boolean z2 = c7187e.pro;
                if (!z2 && !z) {
                    if (c7187e.tapsense != 0) {
                        c7187e.adcel(0);
                        return;
                    }
                    return;
                }
                if (z2) {
                    float f = i4;
                    c7187e.advert = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
                    c7187e.mopub = Math.min(i4, (i4 * i4) / computeVerticalScrollRange);
                }
                if (c7187e.signatures) {
                    float f2 = computeHorizontalScrollOffset;
                    float f3 = i5;
                    c7187e.loadAd = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
                    c7187e.amazon = Math.min(i5, (i5 * i5) / computeHorizontalScrollRange);
                }
                int i6 = c7187e.tapsense;
                if (i6 == 0 || i6 == 1) {
                    c7187e.adcel(1);
                    return;
                }
                return;
            default:
                AbstractC3655e abstractC3655e = (AbstractC3655e) this.vip;
                if (abstractC3655e.mo1920abstract()) {
                    float f4 = abstractC3655e.f8228e + i2;
                    abstractC3655e.f8228e = f4;
                    Object obj = abstractC3655e.f21116e;
                    if (obj == null) {
                        obj = null;
                    }
                    ((InterfaceC11370e) obj).ad(Math.min(f4 / abstractC3655e.f21118e, 1.0f));
                }
                abstractC3655e.mo1387import();
                return;
        }
    }
}
