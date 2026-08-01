package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٔۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14725e extends AbstractC5830e {
    public final long ad;
    public final C12618e appmetrica;
    public final /* synthetic */ C13770e billing;
    public HashSet license;
    public final boolean metrica;
    public final C0576e purchase;
    public final boolean vip;

    public C14725e(C13770e c13770e, long j, boolean z, boolean z2, C5389e c5389e) {
        this.billing = c13770e;
        this.ad = j;
        this.vip = z;
        this.metrica = z2;
        C12618e c12618e = AbstractC1710e.ad;
        this.appmetrica = new C12618e();
        this.purchase = new C0576e(C16158e.f31735e, C10990e.f21769e);
    }

    @Override // defpackage.AbstractC5830e
    public final void Signature(C13770e c13770e) {
        this.appmetrica.ad(c13770e);
    }

    @Override // defpackage.AbstractC5830e
    public final void ad(C17489e c17489e, Function2 function2) {
        this.billing.vip.ad(c17489e, function2);
    }

    @Override // defpackage.AbstractC5830e
    public final InterfaceC8850e adcel() {
        return this.billing.vip.adcel();
    }

    @Override // defpackage.AbstractC5830e
    public final void admob(C2846e c2846e) {
        this.billing.vip.admob(c2846e);
    }

    @Override // defpackage.AbstractC5830e
    public final void advert(C17489e c17489e) {
        C13770e c13770e = this.billing;
        c13770e.vip.advert(c13770e.yandex);
        c13770e.vip.advert(c17489e);
    }

    @Override // defpackage.AbstractC5830e
    public final C12618e amazon(C17489e c17489e, InterfaceC15992e interfaceC15992e, C12618e c12618e) {
        return this.billing.vip.amazon(c17489e, interfaceC15992e, c12618e);
    }

    @Override // defpackage.AbstractC5830e
    public final boolean appmetrica() {
        return this.vip;
    }

    @Override // defpackage.AbstractC5830e
    public final long billing() {
        return this.ad;
    }

    public final void isVip() {
        C12618e c12618e = this.appmetrica;
        if (c12618e.startapp()) {
            HashSet hashSet = this.license;
            if (hashSet != null) {
                Object[] objArr = c12618e.vip;
                long[] jArr = c12618e.ad;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    C13770e c13770e = (C13770e) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(c13770e.isVip());
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            c12618e.vip();
        }
    }

    @Override // defpackage.AbstractC5830e
    public final boolean license() {
        return this.billing.vip.license();
    }

    @Override // defpackage.AbstractC5830e
    public final void loadAd(Set set) {
        HashSet hashSet = this.license;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.license = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.AbstractC5830e
    public final void metrica() {
        C13770e c13770e = this.billing;
        c13770e.ads--;
    }

    @Override // defpackage.AbstractC5830e
    public final boolean mopub() {
        return this.billing.vip.mopub();
    }

    @Override // defpackage.AbstractC5830e
    public final void pro() {
        this.billing.ads++;
    }

    @Override // defpackage.AbstractC5830e
    public final boolean purchase() {
        return this.metrica;
    }

    @Override // defpackage.AbstractC5830e
    public final InterfaceC3399e remoteconfig(C17073e c17073e) {
        return this.billing.vip.remoteconfig(c17073e);
    }

    @Override // defpackage.AbstractC5830e
    public final void signatures(C13770e c13770e) {
        HashSet hashSet = this.license;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Set) it.next()).remove(c13770e.isVip());
            }
        }
        if (AbstractC0869e.premium(c13770e)) {
            this.appmetrica.smaato(c13770e);
        }
    }

    @Override // defpackage.AbstractC5830e
    public final AbstractC16572e smaato(AbstractC14546e abstractC14546e) {
        return this.billing.vip.smaato(abstractC14546e);
    }

    @Override // defpackage.AbstractC5830e
    public final InterfaceC3483e startapp() {
        return (InterfaceC3483e) this.purchase.getValue();
    }

    @Override // defpackage.AbstractC5830e
    public final void subscription(C17489e c17489e) {
        this.billing.vip.subscription(c17489e);
    }

    @Override // defpackage.AbstractC5830e
    public final void tapsense(C17489e c17489e) {
        this.billing.vip.tapsense(c17489e);
    }

    @Override // defpackage.AbstractC5830e
    public final C12618e vip(C17489e c17489e, InterfaceC15992e interfaceC15992e, Function2 function2) {
        return this.billing.vip.vip(c17489e, interfaceC15992e, function2);
    }

    @Override // defpackage.AbstractC5830e
    public final InterfaceC12254e yandex() {
        return this.billing.yandex;
    }
}
