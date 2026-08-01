package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِّٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12476e {
    public final C0676e ad;
    public final float appmetrica;
    public final float license;
    public final long metrica;
    public final ArrayList purchase;
    public final C12890e vip;

    public C12476e(C0676e c0676e, C12890e c12890e, long j) {
        this.ad = c0676e;
        this.vip = c12890e;
        this.metrica = j;
        ArrayList arrayList = c12890e.yandex;
        float f = 0.0f;
        this.license = arrayList.isEmpty() ? 0.0f : ((C6458e) ((C4864e) arrayList.get(0)).ad.f13185e).license(0);
        if (!arrayList.isEmpty()) {
            C4864e c4864e = (C4864e) AbstractC13480e.m3570break(arrayList);
            f = ((C6458e) c4864e.ad.f13185e).license(r4.billing - 1) + c4864e.purchase;
        }
        this.appmetrica = f;
        this.purchase = c12890e.billing;
    }

    public static int purchase(C12476e c12476e, int i) {
        return c12476e.vip.metrica(i, false);
    }

    public final int ad(int i) {
        C12890e c12890e = this.vip;
        ArrayList arrayList = c12890e.yandex;
        c12890e.advert(i);
        C4864e c4864e = (C4864e) arrayList.get(i == ((C10566e) c12890e.ad.f36191e).f20850e.length() ? AbstractC6874e.billing(arrayList) : AbstractC7861e.startapp(i, arrayList));
        return ((C6458e) c4864e.ad.f13185e).purchase.isRtlCharAt(c4864e.license(i)) ? 2 : 1;
    }

    public final int adcel(int i) {
        C12890e c12890e = this.vip;
        ArrayList arrayList = c12890e.yandex;
        c12890e.advert(i);
        C4864e c4864e = (C4864e) arrayList.get(i == ((C10566e) c12890e.ad.f36191e).f20850e.length() ? AbstractC6874e.billing(arrayList) : AbstractC7861e.startapp(i, arrayList));
        C6342e c6342e = c4864e.ad;
        int license = c4864e.license(i);
        C6458e c6458e = (C6458e) c6342e.f13185e;
        return c6458e.purchase.getParagraphDirection(c6458e.purchase.getLineForOffset(license)) == 1 ? 1 : 2;
    }

    public final long advert(int i) {
        int m2706static;
        int i2;
        int m2675break;
        C12890e c12890e = this.vip;
        ArrayList arrayList = c12890e.yandex;
        c12890e.advert(i);
        C4864e c4864e = (C4864e) arrayList.get(i == ((C10566e) c12890e.ad.f36191e).f20850e.length() ? AbstractC6874e.billing(arrayList) : AbstractC7861e.startapp(i, arrayList));
        C6342e c6342e = c4864e.ad;
        int license = c4864e.license(i);
        C9831e adcel = ((C6458e) c6342e.f13185e).adcel();
        if (adcel.m2716while(adcel.m2706static(license))) {
            adcel.mopub(license);
            m2706static = license;
            while (m2706static != -1 && (!adcel.m2716while(m2706static) || adcel.m2711this(m2706static))) {
                m2706static = adcel.m2706static(m2706static);
            }
        } else {
            adcel.mopub(license);
            m2706static = adcel.m2712throw(license) ? (!adcel.m2701native(license) || adcel.m2696goto(license)) ? adcel.m2706static(license) : license : adcel.m2696goto(license) ? adcel.m2706static(license) : -1;
        }
        if (m2706static == -1) {
            m2706static = license;
        }
        if (adcel.m2711this(adcel.m2675break(license))) {
            adcel.mopub(license);
            i2 = license;
            while (i2 != -1 && (adcel.m2716while(i2) || !adcel.m2711this(i2))) {
                i2 = adcel.m2675break(i2);
            }
        } else {
            adcel.mopub(license);
            if (adcel.m2696goto(license)) {
                if (!adcel.m2701native(license) || adcel.m2712throw(license)) {
                    m2675break = adcel.m2675break(license);
                    i2 = m2675break;
                } else {
                    i2 = license;
                }
            } else if (adcel.m2712throw(license)) {
                m2675break = adcel.m2675break(license);
                i2 = m2675break;
            } else {
                i2 = -1;
            }
        }
        if (i2 != -1) {
            license = i2;
        }
        return c4864e.vip(AbstractC9262e.metrica(m2706static, license), false);
    }

    public final float appmetrica(int i, boolean z) {
        C12890e c12890e = this.vip;
        ArrayList arrayList = c12890e.yandex;
        c12890e.advert(i);
        C4864e c4864e = (C4864e) arrayList.get(i == ((C10566e) c12890e.ad.f36191e).f20850e.length() ? AbstractC6874e.billing(arrayList) : AbstractC7861e.startapp(i, arrayList));
        C6342e c6342e = c4864e.ad;
        int license = c4864e.license(i);
        C6458e c6458e = (C6458e) c6342e.f13185e;
        return z ? c6458e.yandex(license, false) : c6458e.startapp(license, false);
    }

    public final float billing(int i) {
        C12890e c12890e = this.vip;
        c12890e.smaato(i);
        ArrayList arrayList = c12890e.yandex;
        C4864e c4864e = (C4864e) arrayList.get(AbstractC7861e.adcel(i, arrayList));
        C6342e c6342e = c4864e.ad;
        int i2 = i - c4864e.license;
        C6458e c6458e = (C6458e) c6342e.f13185e;
        return c6458e.purchase.getLineLeft(i2) + (i2 == c6458e.billing + (-1) ? c6458e.adcel : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12476e)) {
            return false;
        }
        C12476e c12476e = (C12476e) obj;
        return this.ad.equals(c12476e.ad) && this.vip.equals(c12476e.vip) && C12729e.vip(this.metrica, c12476e.metrica) && this.license == c12476e.license && this.appmetrica == c12476e.appmetrica && AbstractC7890e.billing(this.purchase, c12476e.purchase);
    }

    public final int hashCode() {
        int hashCode = (this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31;
        long j = this.metrica;
        return this.purchase.hashCode() + AbstractC1414e.license(AbstractC1414e.license((((int) (j ^ (j >>> 32))) + hashCode) * 31, this.license, 31), this.appmetrica, 31);
    }

    public final boolean license() {
        long j = this.metrica;
        float f = (int) (j >> 32);
        C12890e c12890e = this.vip;
        return f < c12890e.license || c12890e.metrica || ((float) ((int) (j & 4294967295L))) < c12890e.appmetrica;
    }

    public final C0763e metrica(int i) {
        C12890e c12890e = this.vip;
        ArrayList arrayList = c12890e.yandex;
        c12890e.advert(i);
        C4864e c4864e = (C4864e) arrayList.get(i == ((C10566e) c12890e.ad.f36191e).f20850e.length() ? AbstractC6874e.billing(arrayList) : AbstractC7861e.startapp(i, arrayList));
        C6342e c6342e = c4864e.ad;
        int license = c4864e.license(i);
        CharSequence charSequence = (CharSequence) c6342e.f13182e;
        C6458e c6458e = (C6458e) c6342e.f13185e;
        if (license < 0 || license > charSequence.length()) {
            StringBuilder premium = AbstractC4653e.premium("offset(", license, ") is out of bounds [0,");
            premium.append(charSequence.length());
            premium.append(']');
            AbstractC5525e.ad(premium.toString());
        }
        float yandex = c6458e.yandex(license, false);
        int lineForOffset = c6458e.purchase.getLineForOffset(license);
        return c4864e.ad(new C0763e(yandex, c6458e.billing(lineForOffset), yandex, c6458e.appmetrica(lineForOffset)));
    }

    public final C17985e mopub(int i, int i2) {
        C12890e c12890e = this.vip;
        C18464e c18464e = c12890e.ad;
        if (i < 0 || i > i2 || i2 > ((C10566e) c18464e.f36191e).f20850e.length()) {
            StringBuilder pro = AbstractC17861e.pro(i, i2, "Start(", ") or End(", ") is out of range [0..");
            pro.append(((C10566e) c18464e.f36191e).f20850e.length());
            pro.append("), or start > end!");
            AbstractC5525e.ad(pro.toString());
        }
        if (i == i2) {
            return AbstractC11972e.ad();
        }
        C17985e ad = AbstractC11972e.ad();
        AbstractC7861e.advert(c12890e.yandex, AbstractC9262e.metrica(i, i2), new C12872e(ad, i, i2, 3));
        return ad;
    }

    public final int startapp(int i) {
        C12890e c12890e = this.vip;
        c12890e.smaato(i);
        ArrayList arrayList = c12890e.yandex;
        C4864e c4864e = (C4864e) arrayList.get(AbstractC7861e.adcel(i, arrayList));
        C6342e c6342e = c4864e.ad;
        return ((C6458e) c6342e.f13185e).purchase.getLineStart(i - c4864e.license) + c4864e.vip;
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.ad + ", multiParagraph=" + this.vip + ", size=" + ((Object) C12729e.metrica(this.metrica)) + ", firstBaseline=" + this.license + ", lastBaseline=" + this.appmetrica + ", placeholderRects=" + this.purchase + ')';
    }

    public final C0763e vip(int i) {
        float startapp;
        float startapp2;
        float yandex;
        float yandex2;
        C12890e c12890e = this.vip;
        c12890e.mopub(i);
        ArrayList arrayList = c12890e.yandex;
        C4864e c4864e = (C4864e) arrayList.get(AbstractC7861e.startapp(i, arrayList));
        C6342e c6342e = c4864e.ad;
        int license = c4864e.license(i);
        CharSequence charSequence = (CharSequence) c6342e.f13182e;
        if (license < 0 || license >= charSequence.length()) {
            StringBuilder premium = AbstractC4653e.premium("offset(", license, ") is out of bounds [0,");
            premium.append(charSequence.length());
            premium.append(')');
            AbstractC5525e.ad(premium.toString());
        }
        C6458e c6458e = (C6458e) c6342e.f13185e;
        Layout layout = c6458e.purchase;
        int lineForOffset = layout.getLineForOffset(license);
        float billing = c6458e.billing(lineForOffset);
        float appmetrica = c6458e.appmetrica(lineForOffset);
        boolean z = layout.getParagraphDirection(lineForOffset) == 1;
        boolean isRtlCharAt = layout.isRtlCharAt(license);
        if (!z || isRtlCharAt) {
            if (z && isRtlCharAt) {
                yandex = c6458e.startapp(license, false);
                yandex2 = c6458e.startapp(license + 1, true);
            } else if (isRtlCharAt) {
                yandex = c6458e.yandex(license, false);
                yandex2 = c6458e.yandex(license + 1, true);
            } else {
                startapp = c6458e.startapp(license, false);
                startapp2 = c6458e.startapp(license + 1, true);
            }
            float f = yandex;
            startapp = yandex2;
            startapp2 = f;
        } else {
            startapp = c6458e.yandex(license, false);
            startapp2 = c6458e.yandex(license + 1, true);
        }
        RectF rectF = new RectF(startapp, billing, startapp2, appmetrica);
        return c4864e.ad(new C0763e(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final float yandex(int i) {
        C12890e c12890e = this.vip;
        c12890e.smaato(i);
        ArrayList arrayList = c12890e.yandex;
        C4864e c4864e = (C4864e) arrayList.get(AbstractC7861e.adcel(i, arrayList));
        C6342e c6342e = c4864e.ad;
        int i2 = i - c4864e.license;
        C6458e c6458e = (C6458e) c6342e.f13185e;
        return c6458e.purchase.getLineRight(i2) + (i2 == c6458e.billing + (-1) ? c6458e.mopub : 0.0f);
    }
}
