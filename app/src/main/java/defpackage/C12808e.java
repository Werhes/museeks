package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٕۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12808e implements InterfaceC13397e {
    public final /* synthetic */ int ad;
    public int appmetrica;
    public Object billing;
    public int license;
    public long metrica;
    public final Object purchase;
    public boolean vip;

    public C12808e() {
        this.ad = 1;
        this.purchase = new C1292e(10);
        this.metrica = -9223372036854775807L;
    }

    public C12808e(List list) {
        this.ad = 0;
        this.purchase = list;
        this.billing = new InterfaceC18147e[list.size()];
        this.metrica = -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC13397e
    public final void ad(C1292e c1292e) {
        boolean z;
        boolean z2;
        switch (this.ad) {
            case 0:
                if (this.vip) {
                    if (this.license == 2) {
                        if (c1292e.ad() == 0) {
                            z2 = false;
                        } else {
                            if (c1292e.ads() != 32) {
                                this.vip = false;
                            }
                            this.license--;
                            z2 = this.vip;
                        }
                        if (!z2) {
                            return;
                        }
                    }
                    if (this.license == 1) {
                        if (c1292e.ad() == 0) {
                            z = false;
                        } else {
                            if (c1292e.ads() != 0) {
                                this.vip = false;
                            }
                            this.license--;
                            z = this.vip;
                        }
                        if (!z) {
                            return;
                        }
                    }
                    int i = c1292e.vip;
                    int ad = c1292e.ad();
                    for (InterfaceC18147e interfaceC18147e : (InterfaceC18147e[]) this.billing) {
                        c1292e.m571try(i);
                        interfaceC18147e.appmetrica(ad, c1292e);
                    }
                    this.appmetrica += ad;
                    return;
                }
                return;
            default:
                C1292e c1292e2 = (C1292e) this.purchase;
                ((InterfaceC18147e) this.billing).getClass();
                if (this.vip) {
                    int ad2 = c1292e.ad();
                    int i2 = this.appmetrica;
                    if (i2 < 10) {
                        int min = Math.min(ad2, 10 - i2);
                        System.arraycopy(c1292e.ad, c1292e.vip, c1292e2.ad, this.appmetrica, min);
                        if (this.appmetrica + min == 10) {
                            c1292e2.m571try(0);
                            if (73 != c1292e2.ads() || 68 != c1292e2.ads() || 51 != c1292e2.ads()) {
                                AbstractC2803e.smaato("Id3Reader", "Discarding invalid ID3 tag");
                                this.vip = false;
                                return;
                            } else {
                                c1292e2.m568protected(3);
                                this.license = c1292e2.applovin() + 10;
                            }
                        }
                    }
                    int min2 = Math.min(ad2, this.license - this.appmetrica);
                    ((InterfaceC18147e) this.billing).appmetrica(min2, c1292e);
                    this.appmetrica += min2;
                    return;
                }
                return;
        }
    }

    @Override // defpackage.InterfaceC13397e
    public final void appmetrica(InterfaceC5483e interfaceC5483e, C18316e c18316e) {
        switch (this.ad) {
            case 0:
                InterfaceC18147e[] interfaceC18147eArr = (InterfaceC18147e[]) this.billing;
                for (int i = 0; i < interfaceC18147eArr.length; i++) {
                    C2938e c2938e = (C2938e) ((List) this.purchase).get(i);
                    c18316e.ad();
                    c18316e.vip();
                    InterfaceC18147e Signature = interfaceC5483e.Signature(c18316e.license, 3);
                    C11445e c11445e = new C11445e();
                    c18316e.vip();
                    c11445e.ad = c18316e.appmetrica;
                    c11445e.smaato = AbstractC8542e.amazon("video/mp2t");
                    c11445e.amazon = AbstractC8542e.amazon("application/dvbsubs");
                    c11445e.admob = Collections.singletonList(c2938e.vip);
                    c11445e.license = c2938e.ad;
                    AbstractC8647e.firebase(c11445e, Signature);
                    interfaceC18147eArr[i] = Signature;
                }
                return;
            default:
                c18316e.ad();
                c18316e.vip();
                InterfaceC18147e Signature2 = interfaceC5483e.Signature(c18316e.license, 5);
                this.billing = Signature2;
                C11445e c11445e2 = new C11445e();
                c18316e.vip();
                c11445e2.ad = c18316e.appmetrica;
                c11445e2.smaato = AbstractC8542e.amazon("video/mp2t");
                c11445e2.amazon = AbstractC8542e.amazon("application/id3");
                AbstractC8647e.firebase(c11445e2, Signature2);
                return;
        }
    }

    @Override // defpackage.InterfaceC13397e
    public final void license(int i, long j) {
        switch (this.ad) {
            case 0:
                if ((i & 4) == 0) {
                    return;
                }
                this.vip = true;
                this.metrica = j;
                this.appmetrica = 0;
                this.license = 2;
                return;
            default:
                if ((i & 4) == 0) {
                    return;
                }
                this.vip = true;
                this.metrica = j;
                this.license = 0;
                this.appmetrica = 0;
                return;
        }
    }

    @Override // defpackage.InterfaceC13397e
    public final void metrica(boolean z) {
        int i;
        switch (this.ad) {
            case 0:
                if (this.vip) {
                    AbstractC2301e.subscription(this.metrica != -9223372036854775807L);
                    for (InterfaceC18147e interfaceC18147e : (InterfaceC18147e[]) this.billing) {
                        interfaceC18147e.ad(this.metrica, 1, this.appmetrica, 0, null);
                    }
                    this.vip = false;
                    return;
                }
                return;
            default:
                ((InterfaceC18147e) this.billing).getClass();
                if (this.vip && (i = this.license) != 0 && this.appmetrica == i) {
                    AbstractC2301e.subscription(this.metrica != -9223372036854775807L);
                    ((InterfaceC18147e) this.billing).ad(this.metrica, 1, this.license, 0, null);
                    this.vip = false;
                    return;
                }
                return;
        }
    }

    @Override // defpackage.InterfaceC13397e
    public final void vip() {
        switch (this.ad) {
            case 0:
                this.vip = false;
                this.metrica = -9223372036854775807L;
                return;
            default:
                this.vip = false;
                this.metrica = -9223372036854775807L;
                return;
        }
    }
}
