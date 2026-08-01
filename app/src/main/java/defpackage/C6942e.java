package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؖۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6942e {
    public final C10566e ad;
    public final C13823e appmetrica;
    public final C10566e billing;
    public final InterfaceC6256e license;
    public final C12476e metrica;
    public long purchase;
    public final C0866e startapp;
    public final long vip;
    public final C0398e yandex;

    public C6942e(C0398e c0398e, InterfaceC6256e interfaceC6256e, C0866e c0866e, C13823e c13823e) {
        C10566e c10566e = c0398e.ad;
        long j = c0398e.vip;
        C12476e c12476e = c0866e != null ? c0866e.ad : null;
        this.ad = c10566e;
        this.vip = j;
        this.metrica = c12476e;
        this.license = interfaceC6256e;
        this.appmetrica = c13823e;
        this.purchase = j;
        this.billing = c10566e;
        this.yandex = c0398e;
        this.startapp = c0866e;
    }

    public final void Signature() {
        if (this.billing.f20850e.length() > 0) {
            int i = C12347e.metrica;
            this.purchase = AbstractC9262e.metrica((int) (this.vip >> 32), (int) (this.purchase & 4294967295L));
        }
    }

    public final List ad(Function1 function1) {
        if (!C12347e.license(this.purchase)) {
            return AbstractC6874e.startapp(new C6155e(BuildConfig.FLAVOR, 0), new C8930e(C12347e.billing(this.purchase), C12347e.billing(this.purchase)));
        }
        InterfaceC5366e interfaceC5366e = (InterfaceC5366e) function1.invoke(this);
        if (interfaceC5366e != null) {
            return Collections.singletonList(interfaceC5366e);
        }
        return null;
    }

    public final void adcel() {
        this.appmetrica.ad = null;
        C10566e c10566e = this.billing;
        String str = c10566e.f20850e;
        String str2 = c10566e.f20850e;
        if (str.length() > 0) {
            int ad = AbstractC8797e.ad(str2, C12347e.purchase(this.purchase));
            if (ad == C12347e.purchase(this.purchase) && ad != str2.length()) {
                ad = AbstractC8797e.ad(str2, ad + 1);
            }
            admob(ad, ad);
        }
    }

    public final void admob(int i, int i2) {
        this.purchase = AbstractC9262e.metrica(i, i2);
    }

    public final void advert() {
        this.appmetrica.ad = null;
        C10566e c10566e = this.billing;
        String str = c10566e.f20850e;
        String str2 = c10566e.f20850e;
        if (str.length() > 0) {
            int vip = AbstractC8797e.vip(str2, C12347e.billing(this.purchase));
            if (vip == C12347e.billing(this.purchase) && vip != 0) {
                vip = AbstractC8797e.vip(str2, vip - 1);
            }
            admob(vip, vip);
        }
    }

    public final void amazon() {
        Integer vip;
        this.appmetrica.ad = null;
        if (this.billing.f20850e.length() <= 0 || (vip = vip()) == null) {
            return;
        }
        int intValue = vip.intValue();
        admob(intValue, intValue);
    }

    public final Integer appmetrica() {
        int i;
        C12476e c12476e = this.metrica;
        if (c12476e == null) {
            return null;
        }
        int subscription = subscription();
        while (true) {
            if (subscription <= 0) {
                i = 0;
                break;
            }
            int length = this.billing.f20850e.length() - 1;
            if (subscription <= length) {
                length = subscription;
            }
            long advert = c12476e.advert(length);
            int i2 = C12347e.metrica;
            int i3 = (int) (advert >> 32);
            if (i3 < subscription) {
                i = this.license.license(i3);
                break;
            }
            subscription--;
        }
        return Integer.valueOf(i);
    }

    public final int billing(C12476e c12476e, int i) {
        int subscription = subscription();
        C13823e c13823e = this.appmetrica;
        if (c13823e.ad == null) {
            c13823e.ad = Float.valueOf(c12476e.metrica(subscription).ad);
        }
        C12890e c12890e = c12476e.vip;
        int license = c12890e.license(subscription) + i;
        if (license < 0) {
            return 0;
        }
        if (license >= c12890e.purchase) {
            return this.billing.f20850e.length();
        }
        float vip = c12890e.vip(license) - 1;
        Float f = c13823e.ad;
        float floatValue = f.floatValue();
        if ((purchase() && floatValue >= c12476e.yandex(license)) || (!purchase() && floatValue <= c12476e.billing(license))) {
            return c12890e.metrica(license, true);
        }
        return this.license.license(c12890e.billing((Float.floatToRawIntBits(vip) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    public final Integer license() {
        int length;
        C12476e c12476e = this.metrica;
        if (c12476e == null) {
            return null;
        }
        int subscription = subscription();
        while (true) {
            C10566e c10566e = this.ad;
            if (subscription < c10566e.f20850e.length()) {
                int length2 = this.billing.f20850e.length() - 1;
                if (subscription <= length2) {
                    length2 = subscription;
                }
                long advert = c12476e.advert(length2);
                int i = C12347e.metrica;
                int i2 = (int) (advert & 4294967295L);
                if (i2 > subscription) {
                    length = this.license.license(i2);
                    break;
                }
                subscription++;
            } else {
                length = c10566e.f20850e.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final void loadAd() {
        Integer metrica;
        this.appmetrica.ad = null;
        if (this.billing.f20850e.length() <= 0 || (metrica = metrica()) == null) {
            return;
        }
        int intValue = metrica.intValue();
        admob(intValue, intValue);
    }

    public final Integer metrica() {
        C12476e c12476e = this.metrica;
        if (c12476e == null) {
            return null;
        }
        int billing = C12347e.billing(this.purchase);
        InterfaceC6256e interfaceC6256e = this.license;
        return Integer.valueOf(interfaceC6256e.license(c12476e.startapp(c12476e.vip.license(interfaceC6256e.billing(billing)))));
    }

    public final void mopub() {
        this.appmetrica.ad = null;
        C10566e c10566e = this.billing;
        if (c10566e.f20850e.length() > 0) {
            String str = c10566e.f20850e;
            long j = this.purchase;
            int i = C12347e.metrica;
            int metrica = AbstractC5032e.metrica((int) (j & 4294967295L), str);
            if (metrica != -1) {
                admob(metrica, metrica);
            }
        }
    }

    public final boolean purchase() {
        C12476e c12476e = this.metrica;
        return (c12476e != null ? c12476e.adcel(subscription()) : 0) != 2;
    }

    public final void smaato() {
        C13823e c13823e = this.appmetrica;
        c13823e.ad = null;
        C10566e c10566e = this.billing;
        if (c10566e.f20850e.length() > 0) {
            if (!purchase()) {
                mopub();
                return;
            }
            c13823e.ad = null;
            if (c10566e.f20850e.length() > 0) {
                String str = c10566e.f20850e;
                long j = this.purchase;
                int i = C12347e.metrica;
                int vip = AbstractC5032e.vip((int) (j & 4294967295L), str);
                if (vip != -1) {
                    admob(vip, vip);
                }
            }
        }
    }

    public final void startapp() {
        C13823e c13823e = this.appmetrica;
        c13823e.ad = null;
        C10566e c10566e = this.billing;
        if (c10566e.f20850e.length() > 0) {
            if (purchase()) {
                mopub();
                return;
            }
            c13823e.ad = null;
            if (c10566e.f20850e.length() > 0) {
                String str = c10566e.f20850e;
                long j = this.purchase;
                int i = C12347e.metrica;
                int vip = AbstractC5032e.vip((int) (j & 4294967295L), str);
                if (vip != -1) {
                    admob(vip, vip);
                }
            }
        }
    }

    public final int subscription() {
        long j = this.purchase;
        int i = C12347e.metrica;
        return this.license.billing((int) (j & 4294967295L));
    }

    public final Integer vip() {
        C12476e c12476e = this.metrica;
        if (c12476e == null) {
            return null;
        }
        C12890e c12890e = c12476e.vip;
        int purchase = C12347e.purchase(this.purchase);
        InterfaceC6256e interfaceC6256e = this.license;
        return Integer.valueOf(interfaceC6256e.license(c12890e.metrica(c12890e.license(interfaceC6256e.billing(purchase)), true)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r9 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int yandex(defpackage.C0866e r9, int r10) {
        /*
            r8 = this;
            eؑؒۛ r0 = r9.vip
            eِّٔ r1 = r9.ad
            if (r0 == 0) goto L13
            eؑؒۛ r9 = r9.metrica
            if (r9 == 0) goto L10
            r2 = 1
            eؒؐۥ r9 = r9.mo208goto(r0, r2)
            goto L11
        L10:
            r9 = 0
        L11:
            if (r9 != 0) goto L15
        L13:
            eؒؐۥ r9 = defpackage.C0763e.appmetrica
        L15:
            eؑٚٞ r0 = r8.yandex
            long r2 = r0.vip
            int r0 = defpackage.C12347e.metrica
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r0 = (int) r2
            eؙؚۗ r2 = r8.license
            int r0 = r2.billing(r0)
            eؒؐۥ r0 = r1.metrica(r0)
            float r3 = r0.ad
            float r0 = r0.vip
            long r6 = r9.billing()
            long r6 = r6 & r4
            int r9 = (int) r6
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r10 = (float) r10
            float r9 = r9 * r10
            float r9 = r9 + r0
            int r10 = java.lang.Float.floatToRawIntBits(r3)
            long r6 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            r0 = 32
            long r6 = r6 << r0
            long r9 = r9 & r4
            long r9 = r9 | r6
            eّۦٌ r0 = r1.vip
            int r9 = r0.billing(r9)
            int r9 = r2.license(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6942e.yandex(eؒؗٞ, int):int");
    }
}
