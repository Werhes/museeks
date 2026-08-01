package defpackage;

import android.R;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٕٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15603e {
    public static final int[] ad = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] vip = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] metrica = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] license = {R.attr.name, R.attr.pathData};

    public static StaticLayout ad(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            AbstractC5525e.ad("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            AbstractC5525e.ad("invalid end value");
        }
        if (i3 < 0) {
            AbstractC5525e.ad("invalid maxLines value");
        }
        if (i < 0) {
            AbstractC5525e.ad("invalid width value");
        }
        if (i4 < 0) {
            AbstractC5525e.ad("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        obtain.setTextDirection(textDirectionHeuristic);
        obtain.setAlignment(alignment);
        obtain.setMaxLines(i3);
        obtain.setEllipsize(truncateAt);
        obtain.setEllipsizedWidth(i4);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(z);
        obtain.setBreakStrategy(i6);
        obtain.setHyphenationFrequency(i9);
        obtain.setIndents(null, null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            AbstractC11815e.m3267super(obtain, i5);
        }
        if (i10 >= 28) {
            AbstractC17305e.m4286import(obtain);
        }
        if (i10 >= 33) {
            AbstractC14380e.premium(obtain, i7, i8);
        }
        if (i10 >= 35) {
            AbstractC0879e.ad(obtain);
        }
        return obtain.build();
    }

    public static final C7954e metrica(Object obj) {
        C7954e c7954e;
        C12405e c12405e = obj instanceof C12405e ? (C12405e) obj : null;
        return (c12405e == null || (c7954e = c12405e.ad) == null) ? (C7954e) obj : c7954e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List vip(C14479e c14479e, int i, C14479e c14479e2, boolean z, boolean z2, boolean z3) {
        C13664e c13664e;
        boolean z4;
        int i2;
        int i3;
        int signatures = c14479e.signatures(i);
        int i4 = i + signatures;
        int purchase = c14479e.purchase(i);
        int purchase2 = c14479e.purchase(i4);
        int i5 = purchase2 - purchase;
        boolean z5 = i >= 0 && (c14479e.vip[(c14479e.subscription(i) * 5) + 1] & 201326592) != 0;
        c14479e2.isVip(signatures);
        c14479e2.inmobi(i5, c14479e2.pro);
        if (c14479e.billing < i4) {
            c14479e.premium(i4);
        }
        if (c14479e.mopub < purchase2) {
            c14479e.subs(purchase2, i4);
        }
        int[] iArr = c14479e2.vip;
        int i6 = c14479e2.pro;
        int i7 = i6 * 5;
        AbstractC1660e.advert(i7, i * 5, c14479e.vip, iArr, i4 * 5);
        Object[] objArr = c14479e2.metrica;
        int i8 = c14479e2.startapp;
        System.arraycopy(c14479e.metrica, purchase, objArr, i8, i5);
        int i9 = c14479e2.tapsense;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + signatures;
        int billing = i8 - c14479e2.billing(iArr, i6);
        int i12 = c14479e2.smaato;
        int i13 = c14479e2.advert;
        int length = objArr.length;
        boolean z6 = z5;
        int i14 = i12;
        int i15 = i6;
        while (i15 < i11) {
            if (i15 != i6) {
                int i16 = (i15 * 5) + 2;
                iArr[i16] = iArr[i16] + i10;
            }
            int[] iArr2 = iArr;
            int billing2 = c14479e2.billing(iArr, i15) + billing;
            if (i14 < i15) {
                i2 = i6;
                i3 = 0;
            } else {
                i2 = i6;
                i3 = c14479e2.mopub;
            }
            iArr2[(i15 * 5) + 4] = C14479e.startapp(billing2, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i6 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        c14479e2.smaato = i14;
        int vip2 = AbstractC2855e.vip(c14479e.license, i, c14479e.Signature());
        int vip3 = AbstractC2855e.vip(c14479e.license, i4, c14479e.Signature());
        if (vip2 < vip3) {
            ArrayList arrayList = c14479e.license;
            ArrayList arrayList2 = new ArrayList(vip3 - vip2);
            for (int i17 = vip2; i17 < vip3; i17++) {
                C3155e c3155e = (C3155e) arrayList.get(i17);
                c3155e.ad += i10;
                arrayList2.add(c3155e);
            }
            c14479e2.license.addAll(AbstractC2855e.vip(c14479e2.license, c14479e2.pro, c14479e2.Signature()), arrayList2);
            arrayList.subList(vip2, vip3).clear();
            c13664e = arrayList2;
        } else {
            c13664e = C13664e.f27089e;
        }
        if (!c13664e.isEmpty()) {
            HashMap hashMap = c14479e.appmetrica;
            HashMap hashMap2 = c14479e2.appmetrica;
            if (hashMap != null && hashMap2 != null) {
                int size = c13664e.size();
                for (int i18 = 0; i18 < size; i18++) {
                }
            }
        }
        int i19 = c14479e2.tapsense;
        c14479e2.m3819protected(i9);
        int firebase = c14479e.firebase(c14479e.vip, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = firebase >= 0;
            if (z7) {
                c14479e.m3809break();
                c14479e.ad(firebase - c14479e.pro);
                c14479e.m3809break();
            }
            c14479e.ad(i - c14479e.pro);
            boolean m3815goto = c14479e.m3815goto();
            if (z7) {
                c14479e.m3823while();
                c14479e.adcel();
                c14479e.m3823while();
                c14479e.adcel();
            }
            z4 = m3815goto;
        } else {
            boolean m3820this = c14479e.m3820this(i, signatures);
            c14479e.m3818native(purchase, i5, i - 1);
            z4 = m3820this;
        }
        if (z4) {
            AbstractC1889e.ad("Unexpectedly removed anchors");
        }
        int i20 = c14479e2.loadAd;
        int i21 = iArr3[i7 + 1];
        c14479e2.loadAd = i20 + ((1073741824 & i21) != 0 ? 1 : i21 & 67108863);
        if (z2) {
            c14479e2.pro = i11;
            c14479e2.startapp = i8 + i5;
        }
        if (z6) {
            c14479e2.m3810case(i9);
        }
        return c13664e;
    }
}
