package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌؘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8518e {
    public final int ad;
    public final int[] adcel;
    public int advert;
    public final InterfaceC3886e appmetrica;
    public final EnumC7792e billing;
    public final Object license;
    public final long metrica;
    public int mopub;
    public final C14544e purchase;
    public final int startapp;
    public final List vip;
    public final boolean yandex;

    public C8518e(int i, int i2, List list, long j, Object obj, EnumC17426e enumC17426e, InterfaceC3886e interfaceC3886e, C14544e c14544e, EnumC7792e enumC7792e) {
        this.ad = i;
        this.vip = list;
        this.metrica = j;
        this.license = obj;
        this.appmetrica = interfaceC3886e;
        this.purchase = c14544e;
        this.billing = enumC7792e;
        this.yandex = enumC17426e == EnumC17426e.f34146e;
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC2832e abstractC2832e = (AbstractC2832e) list.get(i4);
            i3 = Math.max(i3, !this.yandex ? abstractC2832e.f6804e : abstractC2832e.f6806e);
        }
        this.startapp = i3;
        this.adcel = new int[this.vip.size() * 2];
        this.advert = RecyclerView.UNDEFINED_DURATION;
    }

    public final void ad(int i) {
        this.mopub += i;
        int[] iArr = this.adcel;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.yandex;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    public final void vip(int i, int i2, int i3) {
        int i4;
        this.mopub = i;
        boolean z = this.yandex;
        this.advert = z ? i3 : i2;
        List list = this.vip;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            AbstractC2832e abstractC2832e = (AbstractC2832e) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.adcel;
            if (z) {
                InterfaceC3886e interfaceC3886e = this.appmetrica;
                if (interfaceC3886e == null) {
                    throw AbstractC5087e.m1749interface("null horizontalAlignment");
                }
                iArr[i6] = interfaceC3886e.ad(abstractC2832e.f6806e, i2, this.billing);
                iArr[i6 + 1] = i;
                i4 = abstractC2832e.f6804e;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                C14544e c14544e = this.purchase;
                if (c14544e == null) {
                    throw AbstractC5087e.m1749interface("null verticalAlignment");
                }
                iArr[i7] = c14544e.ad(abstractC2832e.f6804e, i3);
                i4 = abstractC2832e.f6806e;
            }
            i += i4;
        }
    }
}
