package defpackage;

import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَّٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16157e {
    public final C11388e ad;
    public final String adcel;
    public final C8705e appmetrica;
    public final C4217e billing;
    public final float license;
    public final boolean metrica;
    public final C17013e purchase;
    public int startapp;
    public final C12476e vip;
    public long yandex;

    public C16157e(C11388e c11388e, C12476e c12476e, boolean z, float f, C8705e c8705e) {
        this.ad = c11388e;
        this.vip = c12476e;
        this.metrica = z;
        this.license = f;
        this.appmetrica = c8705e;
        AbstractC13717e adcel = AbstractC12640e.adcel();
        Function1 appmetrica = adcel != null ? adcel.appmetrica() : null;
        AbstractC13717e smaato = AbstractC12640e.smaato(adcel);
        try {
            C17013e license = c11388e.license();
            this.purchase = license;
            this.billing = (C4217e) c11388e.appmetrica.getValue();
            Unit unit = Unit.INSTANCE;
            AbstractC12640e.Signature(adcel, smaato, appmetrica);
            this.yandex = license.f33324e;
            this.adcel = license.f33322e.toString();
        } catch (Throwable th) {
            AbstractC12640e.Signature(adcel, smaato, appmetrica);
            throw th;
        }
    }

    public final void Signature() {
        int i;
        this.appmetrica.f17570e = Float.NaN;
        if (this.adcel.length() > 0) {
            long j = this.yandex;
            int i2 = C12347e.metrica;
            int i3 = (int) (4294967295L & j);
            C12476e c12476e = this.vip;
            if (c12476e != null) {
                i = c12476e.startapp(c12476e.vip.license(C12347e.billing(j)));
            } else {
                i = 0;
            }
            long metrica = AbstractC1376e.metrica(i, i3, this.ad);
            int i4 = (int) (metrica >> 32);
            int license = AbstractC7111e.license(metrica);
            if (i4 != i3 || !C12347e.license(this.yandex)) {
                this.yandex = AbstractC9262e.metrica(i4, i4);
            }
            if (license != 0) {
                this.startapp = license;
            }
        }
    }

    public final void ad() {
        if (this.adcel.length() > 0) {
            C17013e c17013e = this.purchase;
            boolean license = C12347e.license(c17013e.f33324e);
            C11388e c11388e = this.ad;
            if (license) {
                C11388e.startapp(this.ad, BuildConfig.FLAVOR, AbstractC9262e.metrica((int) (c17013e.f33324e >> 32), (int) (this.yandex & 4294967295L)), !this.metrica, 4);
            } else {
                c11388e.metrica();
            }
            this.yandex = c11388e.license().f33324e;
            this.startapp = 1;
        }
    }

    public final void adcel() {
        this.appmetrica.f17570e = Float.NaN;
        String str = this.adcel;
        if (str.length() > 0) {
            long j = this.yandex;
            int i = C12347e.metrica;
            int i2 = (int) (j & 4294967295L);
            long metrica = AbstractC1376e.metrica(AbstractC5032e.metrica(i2, str), i2, this.ad);
            int i3 = (int) (metrica >> 32);
            int license = AbstractC7111e.license(metrica);
            if (i3 != i2 || !C12347e.license(this.yandex)) {
                this.yandex = AbstractC9262e.metrica(i3, i3);
            }
            if (license != 0) {
                this.startapp = license;
            }
        }
    }

    public final void admob() {
        C12476e c12476e = this.vip;
        int metrica = c12476e != null ? metrica(c12476e, -1) : Integer.MIN_VALUE;
        if (metrica == Integer.MIN_VALUE) {
            this.appmetrica.f17570e = Float.NaN;
        }
        if (this.adcel.length() > 0) {
            long j = this.yandex;
            int i = C12347e.metrica;
            int i2 = (int) (j & 4294967295L);
            if (metrica < 0) {
                metrica = 0;
            }
            long metrica2 = AbstractC1376e.metrica(metrica, i2, this.ad);
            int i3 = (int) (metrica2 >> 32);
            int license = AbstractC7111e.license(metrica2);
            if (i3 != i2 || !C12347e.license(this.yandex)) {
                this.yandex = AbstractC9262e.metrica(i3, i3);
            }
            if (license != 0) {
                this.startapp = license;
            }
        }
    }

    public final void advert() {
        this.appmetrica.f17570e = Float.NaN;
        String str = this.adcel;
        if (str.length() > 0) {
            long j = this.yandex;
            int i = C12347e.metrica;
            int i2 = (int) (j & 4294967295L);
            int i3 = 0;
            C12476e c12476e = this.vip;
            if (c12476e != null) {
                int i4 = i2;
                while (true) {
                    if (i4 <= 0) {
                        break;
                    }
                    int length = str.length() - 1;
                    if (i4 <= length) {
                        length = i4;
                    }
                    long advert = c12476e.advert(length);
                    int i5 = C12347e.metrica;
                    int i6 = (int) (advert >> 32);
                    if (i6 < i4) {
                        i3 = i6;
                        break;
                    }
                    i4--;
                }
            }
            long metrica = AbstractC1376e.metrica(i3, i2, this.ad);
            int i7 = (int) (metrica >> 32);
            int license = AbstractC7111e.license(metrica);
            if (i7 != i2 || !C12347e.license(this.yandex)) {
                this.yandex = AbstractC9262e.metrica(i7, i7);
            }
            if (license != 0) {
                this.startapp = license;
            }
        }
    }

    public final void amazon() {
        this.appmetrica.f17570e = Float.NaN;
        if (this.adcel.length() > 0) {
            long j = this.yandex;
            int i = C12347e.metrica;
            int i2 = (int) (j & 4294967295L);
            long metrica = AbstractC1376e.metrica(0, i2, this.ad);
            int i3 = (int) (metrica >> 32);
            int license = AbstractC7111e.license(metrica);
            if (i3 != i2 || !C12347e.license(this.yandex)) {
                this.yandex = AbstractC9262e.metrica(i3, i3);
            }
            if (license != 0) {
                this.startapp = license;
            }
        }
    }

    public final void appmetrica() {
        C12476e c12476e = this.vip;
        int metrica = c12476e != null ? metrica(c12476e, 1) : Integer.MAX_VALUE;
        if (metrica == Integer.MAX_VALUE) {
            this.appmetrica.f17570e = Float.NaN;
        }
        String str = this.adcel;
        if (str.length() > 0) {
            long j = this.yandex;
            int i = C12347e.metrica;
            int i2 = (int) (j & 4294967295L);
            int length = str.length();
            if (metrica > length) {
                metrica = length;
            }
            long metrica2 = AbstractC1376e.metrica(metrica, i2, this.ad);
            int i3 = (int) (metrica2 >> 32);
            int license = AbstractC7111e.license(metrica2);
            if (i3 != i2 || !C12347e.license(this.yandex)) {
                this.yandex = AbstractC9262e.metrica(i3, i3);
            }
            if (license != 0) {
                this.startapp = license;
            }
        }
    }

    public final void billing() {
        this.appmetrica.f17570e = Float.NaN;
        String str = this.adcel;
        if (str.length() > 0) {
            long j = this.yandex;
            int i = C12347e.metrica;
            int i2 = (int) (j & 4294967295L);
            long metrica = AbstractC1376e.metrica(AbstractC5032e.vip(i2, str), i2, this.ad);
            int i3 = (int) (metrica >> 32);
            int license = AbstractC7111e.license(metrica);
            if (i3 != i2 || !C12347e.license(this.yandex)) {
                this.yandex = AbstractC9262e.metrica(i3, i3);
            }
            if (license != 0) {
                this.startapp = license;
            }
        }
    }

    public final int license(int i) {
        long j = this.purchase.f33324e;
        int i2 = C12347e.metrica;
        int i3 = (int) (j & 4294967295L);
        C12476e c12476e = this.vip;
        if (c12476e != null) {
            C12890e c12890e = c12476e.vip;
            float f = this.license;
            if (!Float.isNaN(f)) {
                C0763e smaato = c12476e.metrica(i3).smaato(0.0f, f * i);
                float f2 = smaato.vip;
                float vip = c12890e.vip(c12890e.appmetrica(f2));
                return Math.abs(f2 - vip) > Math.abs(smaato.license - vip) ? c12890e.billing(smaato.yandex()) : c12890e.billing(smaato.license());
            }
        }
        return i3;
    }

    public final void loadAd() {
        int length;
        this.appmetrica.f17570e = Float.NaN;
        String str = this.adcel;
        if (str.length() > 0) {
            long j = this.yandex;
            int i = C12347e.metrica;
            int i2 = (int) (4294967295L & j);
            C12476e c12476e = this.vip;
            if (c12476e != null) {
                C12890e c12890e = c12476e.vip;
                length = c12890e.metrica(c12890e.license(C12347e.purchase(j)), true);
            } else {
                length = str.length();
            }
            long metrica = AbstractC1376e.metrica(length, i2, this.ad);
            int i3 = (int) (metrica >> 32);
            int license = AbstractC7111e.license(metrica);
            if (i3 != i2 || !C12347e.license(this.yandex)) {
                this.yandex = AbstractC9262e.metrica(i3, i3);
            }
            if (license != 0) {
                this.startapp = license;
            }
        }
    }

    public final int metrica(C12476e c12476e, int i) {
        long j = this.yandex;
        int i2 = C12347e.metrica;
        int i3 = (int) (j & 4294967295L);
        C8705e c8705e = this.appmetrica;
        if (Float.isNaN(c8705e.f17570e)) {
            c8705e.f17570e = c12476e.metrica(i3).ad;
        }
        C12890e c12890e = c12476e.vip;
        int license = c12890e.license(i3) + i;
        if (license < 0) {
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (license >= c12890e.purchase) {
            return Alert.DURATION_SHOW_INDEFINITELY;
        }
        float vip = c12890e.vip(license) - 1;
        float f = c8705e.f17570e;
        if ((vip() && f >= c12476e.yandex(license)) || (!vip() && f <= c12476e.billing(license))) {
            return c12890e.metrica(license, true);
        }
        return c12890e.billing((Float.floatToRawIntBits(vip) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    public final void mopub() {
        this.appmetrica.f17570e = Float.NaN;
        String str = this.adcel;
        if (str.length() > 0) {
            long j = this.yandex;
            int i = (int) (4294967295L & j);
            int vip = AbstractC8797e.vip(str, C12347e.billing(j));
            if (vip == C12347e.billing(this.yandex) && vip != 0) {
                vip = AbstractC8797e.vip(str, vip - 1);
            }
            long metrica = AbstractC1376e.metrica(vip, i, this.ad);
            int i2 = (int) (metrica >> 32);
            int license = AbstractC7111e.license(metrica);
            if (i2 != i || !C12347e.license(this.yandex)) {
                this.yandex = AbstractC9262e.metrica(i2, i2);
            }
            if (license != 0) {
                this.startapp = license;
            }
        }
    }

    public final void purchase() {
        if (this.adcel.length() > 0) {
            long j = this.yandex;
            int i = C12347e.metrica;
            int i2 = (int) (j & 4294967295L);
            long metrica = AbstractC1376e.metrica(license(1), i2, this.ad);
            int i3 = (int) (metrica >> 32);
            int license = AbstractC7111e.license(metrica);
            if (i3 != i2 || !C12347e.license(this.yandex)) {
                this.yandex = AbstractC9262e.metrica(i3, i3);
            }
            if (license != 0) {
                this.startapp = license;
            }
        }
    }

    public final void remoteconfig() {
        if (this.adcel.length() > 0) {
            long j = this.purchase.f33324e;
            int i = C12347e.metrica;
            this.yandex = AbstractC9262e.metrica((int) (j >> 32), (int) (this.yandex & 4294967295L));
        }
    }

    public final void smaato() {
        this.appmetrica.f17570e = Float.NaN;
        String str = this.adcel;
        if (str.length() > 0) {
            long j = this.yandex;
            int i = C12347e.metrica;
            int i2 = (int) (j & 4294967295L);
            long metrica = AbstractC1376e.metrica(str.length(), i2, this.ad);
            int i3 = (int) (metrica >> 32);
            int license = AbstractC7111e.license(metrica);
            if (i3 != i2 || !C12347e.license(this.yandex)) {
                this.yandex = AbstractC9262e.metrica(i3, i3);
            }
            if (license != 0) {
                this.startapp = license;
            }
        }
    }

    public final void startapp() {
        int length;
        this.appmetrica.f17570e = Float.NaN;
        String str = this.adcel;
        if (str.length() > 0) {
            long j = this.yandex;
            int i = C12347e.metrica;
            int i2 = (int) (j & 4294967295L);
            C12476e c12476e = this.vip;
            if (c12476e != null) {
                int i3 = i2;
                while (true) {
                    C17013e c17013e = this.purchase;
                    if (i3 < c17013e.f33322e.length()) {
                        int length2 = str.length() - 1;
                        if (i3 <= length2) {
                            length2 = i3;
                        }
                        long advert = c12476e.advert(length2);
                        int i4 = C12347e.metrica;
                        int i5 = (int) (advert & 4294967295L);
                        if (i5 > i3) {
                            length = i5;
                            break;
                        }
                        i3++;
                    } else {
                        length = c17013e.f33322e.length();
                        break;
                    }
                }
            } else {
                length = str.length();
            }
            long metrica = AbstractC1376e.metrica(length, i2, this.ad);
            int i6 = (int) (metrica >> 32);
            int license = AbstractC7111e.license(metrica);
            if (i6 != i2 || !C12347e.license(this.yandex)) {
                this.yandex = AbstractC9262e.metrica(i6, i6);
            }
            if (license != 0) {
                this.startapp = license;
            }
        }
    }

    public final void subscription() {
        if (this.adcel.length() > 0) {
            long j = this.yandex;
            int i = C12347e.metrica;
            int i2 = (int) (j & 4294967295L);
            long metrica = AbstractC1376e.metrica(license(-1), i2, this.ad);
            int i3 = (int) (metrica >> 32);
            int license = AbstractC7111e.license(metrica);
            if (i3 != i2 || !C12347e.license(this.yandex)) {
                this.yandex = AbstractC9262e.metrica(i3, i3);
            }
            if (license != 0) {
                this.startapp = license;
            }
        }
    }

    public final boolean vip() {
        C12476e c12476e = this.vip;
        if (c12476e == null) {
            return true;
        }
        long j = this.yandex;
        int i = C12347e.metrica;
        return c12476e.adcel((int) (j & 4294967295L)) == 1;
    }

    public final void yandex() {
        this.appmetrica.f17570e = Float.NaN;
        String str = this.adcel;
        if (str.length() > 0) {
            long j = this.yandex;
            int i = (int) (4294967295L & j);
            int ad = AbstractC8797e.ad(str, C12347e.purchase(j));
            if (ad == C12347e.purchase(this.yandex) && ad != str.length()) {
                ad = AbstractC8797e.ad(str, ad + 1);
            }
            long metrica = AbstractC1376e.metrica(ad, i, this.ad);
            int i2 = (int) (metrica >> 32);
            int license = AbstractC7111e.license(metrica);
            if (i2 != i || !C12347e.license(this.yandex)) {
                this.yandex = AbstractC9262e.metrica(i2, i2);
            }
            if (license != 0) {
                this.startapp = license;
            }
        }
    }
}
