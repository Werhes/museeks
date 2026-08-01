package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٍّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8587e implements InterfaceC2747e, InterfaceC18089e {
    public final InterfaceC10260e ad;
    public final C14544e vip;

    public C8587e(InterfaceC10260e interfaceC10260e, C14544e c14544e) {
        this.ad = interfaceC10260e;
        this.vip = c14544e;
    }

    @Override // defpackage.InterfaceC2747e
    public final int ad(InterfaceC0732e interfaceC0732e, List list, int i) {
        int mo493e = interfaceC0732e.mo493e(this.ad.appmetrica());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            InterfaceC16719e interfaceC16719e = (InterfaceC16719e) list.get(i4);
            float purchase = AbstractC0607e.purchase(AbstractC0607e.appmetrica(interfaceC16719e));
            int loadAd = interfaceC16719e.loadAd(i);
            if (purchase == 0.0f) {
                i3 += loadAd;
            } else if (purchase > 0.0f) {
                f += purchase;
                i2 = Math.max(i2, Math.round(loadAd / purchase));
            }
        }
        return ((list.size() - 1) * mo493e) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.InterfaceC18089e
    public final int adcel(AbstractC2832e abstractC2832e) {
        return abstractC2832e.f6806e;
    }

    @Override // defpackage.InterfaceC2747e
    public final int appmetrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        int mo493e = interfaceC0732e.mo493e(this.ad.appmetrica());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * mo493e, i);
        int size = list.size();
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC16719e interfaceC16719e = (InterfaceC16719e) list.get(i3);
            float purchase = AbstractC0607e.purchase(AbstractC0607e.appmetrica(interfaceC16719e));
            if (purchase == 0.0f) {
                int min2 = Math.min(interfaceC16719e.loadAd(Alert.DURATION_SHOW_INDEFINITELY), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, interfaceC16719e.mo2529while(min2));
            } else if (purchase > 0.0f) {
                f += purchase;
            }
        }
        int round = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - min, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            InterfaceC16719e interfaceC16719e2 = (InterfaceC16719e) list.get(i4);
            float purchase2 = AbstractC0607e.purchase(AbstractC0607e.appmetrica(interfaceC16719e2));
            if (purchase2 > 0.0f) {
                i2 = Math.max(i2, interfaceC16719e2.mo2529while(round != Integer.MAX_VALUE ? Math.round(round * purchase2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // defpackage.InterfaceC18089e
    public final long billing(int i, int i2, int i3, boolean z) {
        return !z ? AbstractC2278e.ad(i, i2, 0, i3) : AbstractC15118e.license(i, i2, 0, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8587e)) {
            return false;
        }
        C8587e c8587e = (C8587e) obj;
        return AbstractC7890e.billing(this.ad, c8587e.ad) && AbstractC7890e.billing(this.vip, c8587e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC2747e
    public final int license(InterfaceC0732e interfaceC0732e, List list, int i) {
        int mo493e = interfaceC0732e.mo493e(this.ad.appmetrica());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * mo493e, i);
        int size = list.size();
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC16719e interfaceC16719e = (InterfaceC16719e) list.get(i3);
            float purchase = AbstractC0607e.purchase(AbstractC0607e.appmetrica(interfaceC16719e));
            if (purchase == 0.0f) {
                int min2 = Math.min(interfaceC16719e.loadAd(Alert.DURATION_SHOW_INDEFINITELY), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, interfaceC16719e.metrica(min2));
            } else if (purchase > 0.0f) {
                f += purchase;
            }
        }
        int round = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - min, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            InterfaceC16719e interfaceC16719e2 = (InterfaceC16719e) list.get(i4);
            float purchase2 = AbstractC0607e.purchase(AbstractC0607e.appmetrica(interfaceC16719e2));
            if (purchase2 > 0.0f) {
                i2 = Math.max(i2, interfaceC16719e2.metrica(round != Integer.MAX_VALUE ? Math.round(round * purchase2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // defpackage.InterfaceC2747e
    public final int metrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        int mo493e = interfaceC0732e.mo493e(this.ad.appmetrica());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            InterfaceC16719e interfaceC16719e = (InterfaceC16719e) list.get(i4);
            float purchase = AbstractC0607e.purchase(AbstractC0607e.appmetrica(interfaceC16719e));
            int smaato = interfaceC16719e.smaato(i);
            if (purchase == 0.0f) {
                i3 += smaato;
            } else if (purchase > 0.0f) {
                f += purchase;
                i2 = Math.max(i2, Math.round(smaato / purchase));
            }
        }
        return ((list.size() - 1) * mo493e) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.InterfaceC18089e
    public final void purchase(int i, int[] iArr, int[] iArr2, InterfaceC13158e interfaceC13158e) {
        this.ad.tapsense(interfaceC13158e, i, iArr, interfaceC13158e.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.InterfaceC18089e
    public final int startapp(AbstractC2832e abstractC2832e) {
        return abstractC2832e.f6804e;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.ad + ", verticalAlignment=" + this.vip + ')';
    }

    @Override // defpackage.InterfaceC2747e
    public final InterfaceC17242e vip(InterfaceC13158e interfaceC13158e, List list, long j) {
        return AbstractC16704e.appmetrica(this, C5602e.adcel(j), C5602e.startapp(j), C5602e.yandex(j), C5602e.billing(j), interfaceC13158e.mo493e(this.ad.appmetrica()), interfaceC13158e, list, new AbstractC2832e[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.InterfaceC18089e
    public final InterfaceC17242e yandex(AbstractC2832e[] abstractC2832eArr, InterfaceC13158e interfaceC13158e, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        return interfaceC13158e.ads(i, i2, C9139e.f18290e, new C5888e(abstractC2832eArr, this, i2, iArr));
    }
}
