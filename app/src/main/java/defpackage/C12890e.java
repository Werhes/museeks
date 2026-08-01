package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۦٌ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12890e {
    public final C18464e ad;
    public final float appmetrica;
    public final ArrayList billing;
    public final float license;
    public final boolean metrica;
    public final int purchase;
    public final int vip;
    public final ArrayList yandex;

    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public C12890e(C18464e c18464e, long j, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int billing;
        int i5;
        this.ad = c18464e;
        this.vip = i;
        if (C5602e.adcel(j) != 0 || C5602e.startapp(j) != 0) {
            AbstractC5525e.ad("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) c18464e.f36192e;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            C17860e c17860e = (C17860e) arrayList2.get(i6);
            C9904e c9904e = c17860e.ad;
            int yandex = C5602e.yandex(j);
            if (C5602e.metrica(j)) {
                i4 = i6;
                billing = C5602e.billing(j) - ((int) Math.ceil(f));
                if (billing < 0) {
                    billing = 0;
                }
            } else {
                i4 = i6;
                billing = C5602e.billing(j);
            }
            i3 = 0;
            C6342e c6342e = new C6342e(c9904e, this.vip - i7, i2, AbstractC2278e.vip(0, yandex, 0, billing, 5));
            C6458e c6458e = (C6458e) c6342e.f13185e;
            float adcel = c6342e.adcel() + f;
            int i8 = i7 + c6458e.billing;
            arrayList.add(new C4864e(c6342e, c17860e.vip, c17860e.metrica, i7, i8, f, adcel));
            if (!c6458e.license) {
                if (i8 == this.vip) {
                    i5 = i4;
                    if (i5 != AbstractC6874e.billing((ArrayList) this.ad.f36192e)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i8;
                f = adcel;
            }
            z = true;
            i7 = i8;
            f = adcel;
            break;
        }
        i3 = 0;
        z = false;
        this.appmetrica = f;
        this.purchase = i7;
        this.metrica = z;
        this.yandex = arrayList;
        this.license = C5602e.yandex(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i9 = i3; i9 < size2; i9++) {
            C4864e c4864e = (C4864e) arrayList.get(i9);
            ?? r8 = c4864e.ad.f13187e;
            ArrayList arrayList4 = new ArrayList(r8.size());
            int size3 = r8.size();
            for (int i10 = i3; i10 < size3; i10++) {
                C0763e c0763e = (C0763e) r8.get(i10);
                arrayList4.add(c0763e != null ? c4864e.ad(c0763e) : null);
            }
            AbstractC13480e.inmobi(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.ad.f36190e).size()) {
            int size4 = ((List) this.ad.f36190e).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i11 = i3; i11 < size4; i11++) {
                arrayList5.add(null);
            }
            arrayList3 = AbstractC13480e.m3584final(arrayList3, arrayList5);
        }
        this.billing = arrayList3;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [eؚؖٞ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, eٔۦْ] */
    public final void ad(long j, float[] fArr) {
        mopub(C12347e.billing(j));
        advert(C12347e.purchase(j));
        ?? obj = new Object();
        obj.f8852e = 0;
        AbstractC7861e.advert(this.yandex, j, new C8830e(j, fArr, (C3967e) obj, (C15096e) new Object()));
    }

    public final void adcel(InterfaceC14576e interfaceC14576e, AbstractC4457e abstractC4457e, float f, C13973e c13973e, C11964e c11964e, AbstractC4970e abstractC4970e) {
        interfaceC14576e.billing();
        ArrayList arrayList = this.yandex;
        if (arrayList.size() <= 1) {
            AbstractC8228e.vip(this, interfaceC14576e, abstractC4457e, f, c13973e, c11964e, abstractC4970e);
        } else if (abstractC4457e instanceof C18466e) {
            AbstractC8228e.vip(this, interfaceC14576e, abstractC4457e, f, c13973e, c11964e, abstractC4970e);
        } else {
            if (!(abstractC4457e instanceof AbstractC9876e)) {
                throw new C14803e(10);
            }
            int size = arrayList.size();
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i = 0; i < size; i++) {
                C4864e c4864e = (C4864e) arrayList.get(i);
                f3 += c4864e.ad.adcel();
                f2 = Math.max(f2, c4864e.ad.amazon());
            }
            Shader metrica = ((AbstractC9876e) abstractC4457e).metrica((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
            Matrix matrix = new Matrix();
            metrica.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C6342e c6342e = ((C4864e) arrayList.get(i2)).ad;
                c6342e.applovin(interfaceC14576e, new C9317e(metrica), f, c13973e, c11964e, abstractC4970e);
                interfaceC14576e.loadAd(0.0f, c6342e.adcel());
                matrix.setTranslate(0.0f, -c6342e.adcel());
                metrica.setLocalMatrix(matrix);
            }
        }
        interfaceC14576e.admob();
    }

    public final void advert(int i) {
        boolean z = false;
        C18464e c18464e = this.ad;
        if (i >= 0 && i <= ((C10566e) c18464e.f36191e).f20850e.length()) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder premium = AbstractC4653e.premium("offset(", i, ") is out of bounds [0, ");
        premium.append(((C10566e) c18464e.f36191e).f20850e.length());
        premium.append(']');
        AbstractC5525e.ad(premium.toString());
    }

    public final int appmetrica(float f) {
        ArrayList arrayList = this.yandex;
        C4864e c4864e = (C4864e) arrayList.get(AbstractC7861e.mopub(arrayList, f));
        int i = c4864e.metrica - c4864e.vip;
        int i2 = c4864e.license;
        if (i == 0) {
            return i2;
        }
        C6342e c6342e = c4864e.ad;
        float f2 = f - c4864e.purchase;
        C6458e c6458e = (C6458e) c6342e.f13185e;
        return c6458e.purchase.getLineForVertical(((int) f2) - c6458e.yandex) + i2;
    }

    public final int billing(long j) {
        int i = (int) (j & 4294967295L);
        float intBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.yandex;
        C4864e c4864e = (C4864e) arrayList.get(AbstractC7861e.mopub(arrayList, intBitsToFloat));
        int i2 = c4864e.metrica;
        int i3 = c4864e.vip;
        if (i2 - i3 == 0) {
            return i3;
        }
        C6342e c6342e = c4864e.ad;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat(i) - c4864e.purchase;
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
        C6458e c6458e = (C6458e) c6342e.f13185e;
        int lineForVertical = c6458e.purchase.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits))) - c6458e.yandex);
        return c6458e.purchase.getOffsetForHorizontal(lineForVertical, (c6458e.vip(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (floatToRawIntBits >> 32))) + i3;
    }

    public final int license(int i) {
        int length = ((C10566e) this.ad.f36191e).f20850e.length();
        ArrayList arrayList = this.yandex;
        C4864e c4864e = (C4864e) arrayList.get(i >= length ? AbstractC6874e.billing(arrayList) : i < 0 ? 0 : AbstractC7861e.startapp(i, arrayList));
        return ((C6458e) c4864e.ad.f13185e).purchase.getLineForOffset(c4864e.license(i)) + c4864e.license;
    }

    public final int metrica(int i, boolean z) {
        int purchase;
        smaato(i);
        ArrayList arrayList = this.yandex;
        C4864e c4864e = (C4864e) arrayList.get(AbstractC7861e.adcel(i, arrayList));
        C6342e c6342e = c4864e.ad;
        int i2 = i - c4864e.license;
        C6458e c6458e = (C6458e) c6342e.f13185e;
        if (z) {
            Layout layout = c6458e.purchase;
            ThreadLocal threadLocal = AbstractC10080e.ad;
            if (layout.getEllipsisCount(i2) <= 0 || c6458e.vip != TextUtils.TruncateAt.END) {
                C18464e metrica = c6458e.metrica();
                Layout layout2 = (Layout) metrica.f36191e;
                purchase = metrica.m4517e(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                purchase = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            purchase = c6458e.purchase(i2);
        }
        return purchase + c4864e.vip;
    }

    public final void mopub(int i) {
        boolean z = false;
        C18464e c18464e = this.ad;
        if (i >= 0 && i < ((C10566e) c18464e.f36191e).f20850e.length()) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder premium = AbstractC4653e.premium("offset(", i, ") is out of bounds [0, ");
        premium.append(((C10566e) c18464e.f36191e).f20850e.length());
        premium.append(')');
        AbstractC5525e.ad(premium.toString());
    }

    public final float purchase(int i) {
        smaato(i);
        ArrayList arrayList = this.yandex;
        C4864e c4864e = (C4864e) arrayList.get(AbstractC7861e.adcel(i, arrayList));
        C6342e c6342e = c4864e.ad;
        return ((C6458e) c6342e.f13185e).billing(i - c4864e.license) + c4864e.purchase;
    }

    public final void smaato(int i) {
        boolean z = false;
        int i2 = this.purchase;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        AbstractC5525e.ad("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }

    public final void startapp(InterfaceC14576e interfaceC14576e, long j, C13973e c13973e, C11964e c11964e, AbstractC4970e abstractC4970e) {
        interfaceC14576e.billing();
        ArrayList arrayList = this.yandex;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C4864e c4864e = (C4864e) arrayList.get(i);
            c4864e.ad.isPro(interfaceC14576e, j, c13973e, c11964e, abstractC4970e);
            interfaceC14576e.loadAd(0.0f, c4864e.ad.adcel());
        }
        interfaceC14576e.admob();
    }

    public final float vip(int i) {
        smaato(i);
        ArrayList arrayList = this.yandex;
        C4864e c4864e = (C4864e) arrayList.get(AbstractC7861e.adcel(i, arrayList));
        C6342e c6342e = c4864e.ad;
        return ((C6458e) c6342e.f13185e).appmetrica(i - c4864e.license) + c4864e.purchase;
    }

    public final long yandex(C0763e c0763e, int i, C11180e c11180e) {
        long j;
        long j2;
        float f = c0763e.vip;
        ArrayList arrayList = this.yandex;
        int mopub = AbstractC7861e.mopub(arrayList, f);
        float f2 = ((C4864e) arrayList.get(mopub)).billing;
        float f3 = c0763e.license;
        if (f2 >= f3 || mopub == AbstractC6874e.billing(arrayList)) {
            C4864e c4864e = (C4864e) arrayList.get(mopub);
            return c4864e.vip(c4864e.ad.mopub(c4864e.metrica(c0763e), i, c11180e), true);
        }
        int mopub2 = AbstractC7861e.mopub(arrayList, f3);
        long j3 = C12347e.vip;
        while (true) {
            j = C12347e.vip;
            if (!C12347e.metrica(j3, j) || mopub > mopub2) {
                break;
            }
            C4864e c4864e2 = (C4864e) arrayList.get(mopub);
            j3 = c4864e2.vip(c4864e2.ad.mopub(c4864e2.metrica(c0763e), i, c11180e), true);
            mopub++;
        }
        if (C12347e.metrica(j3, j)) {
            return j;
        }
        while (true) {
            j2 = C12347e.vip;
            if (!C12347e.metrica(j, j2) || mopub > mopub2) {
                break;
            }
            C4864e c4864e3 = (C4864e) arrayList.get(mopub2);
            j = c4864e3.vip(c4864e3.ad.mopub(c4864e3.metrica(c0763e), i, c11180e), true);
            mopub2--;
        }
        return C12347e.metrica(j, j2) ? j3 : AbstractC9262e.metrica((int) (j3 >> 32), (int) (4294967295L & j));
    }
}
