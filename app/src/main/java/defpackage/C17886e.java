package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٝؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17886e extends AbstractC9555e {
    public static final C17886e license = new AbstractC9555e(1, 0, 2);

    @Override // defpackage.AbstractC9555e
    public final void license(C11226e c11226e, InterfaceC11305e interfaceC11305e, C14479e c14479e, C14995e c14995e, InterfaceC15989e interfaceC15989e) {
        C3155e c3155e;
        int metrica;
        int purchase = c11226e.purchase(0);
        if (c14479e.amazon != 0) {
            AbstractC1889e.ad("Cannot move a group while inserting");
        }
        if (purchase < 0) {
            AbstractC1889e.ad("Parameter offset is out of bounds");
        }
        if (purchase == 0) {
            return;
        }
        int i = c14479e.pro;
        int i2 = c14479e.tapsense;
        int i3 = c14479e.signatures;
        int i4 = i;
        while (purchase > 0) {
            i4 += c14479e.vip[(c14479e.subscription(i4) * 5) + 3];
            if (i4 > i3) {
                AbstractC1889e.ad("Parameter offset is out of bounds");
            }
            purchase--;
        }
        int i5 = c14479e.vip[(c14479e.subscription(i4) * 5) + 3];
        int billing = c14479e.billing(c14479e.vip, c14479e.subscription(c14479e.pro));
        int billing2 = c14479e.billing(c14479e.vip, c14479e.subscription(i4));
        int i6 = i4 + i5;
        int billing3 = c14479e.billing(c14479e.vip, c14479e.subscription(i6));
        int i7 = billing3 - billing2;
        c14479e.inmobi(i7, Math.max(c14479e.pro - 1, 0));
        c14479e.isVip(i5);
        int[] iArr = c14479e.vip;
        int subscription = c14479e.subscription(i6) * 5;
        AbstractC1660e.advert(c14479e.subscription(i) * 5, subscription, iArr, iArr, (i5 * 5) + subscription);
        if (i7 > 0) {
            Object[] objArr = c14479e.metrica;
            int yandex = c14479e.yandex(billing2 + i7);
            System.arraycopy(objArr, yandex, objArr, billing, c14479e.yandex(billing3 + i7) - yandex);
        }
        int i8 = billing2 + i7;
        int i9 = i8 - billing;
        int i10 = c14479e.mopub;
        int i11 = c14479e.advert;
        int length = c14479e.metrica.length;
        int i12 = c14479e.smaato;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int subscription2 = c14479e.subscription(i14);
            int i15 = i9;
            int[] iArr2 = iArr;
            iArr2[(subscription2 * 5) + 4] = C14479e.startapp(C14479e.startapp(c14479e.billing(iArr, subscription2) - i15, i12 < subscription2 ? 0 : i10, i11, length), c14479e.mopub, c14479e.advert, c14479e.metrica.length);
            i14++;
            i9 = i15;
            iArr = iArr2;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int Signature = c14479e.Signature();
        int vip = AbstractC2855e.vip(c14479e.license, i6, Signature);
        ArrayList arrayList = new ArrayList();
        if (vip >= 0) {
            while (vip < c14479e.license.size() && (metrica = c14479e.metrica((c3155e = (C3155e) c14479e.license.get(vip)))) >= i6 && metrica < i16) {
                arrayList.add(c3155e);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            C3155e c3155e2 = (C3155e) arrayList.get(i18);
            int metrica2 = c14479e.metrica(c3155e2) + i17;
            if (metrica2 >= c14479e.billing) {
                c3155e2.ad = -(Signature - metrica2);
            } else {
                c3155e2.ad = metrica2;
            }
            c14479e.license.add(AbstractC2855e.vip(c14479e.license, metrica2, Signature), c3155e2);
        }
        if (c14479e.m3820this(i6, i5)) {
            AbstractC1889e.ad("Unexpectedly removed anchors");
        }
        c14479e.smaato(i2, c14479e.signatures, i);
        if (i7 > 0) {
            c14479e.m3818native(i8, i7, i6 - 1);
        }
    }
}
