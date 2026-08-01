package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙ٘ٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6458e {
    public final Rect Signature = new Rect();
    public final TextPaint ad;
    public final float adcel;
    public C18464e admob;
    public final boolean advert;
    public final int amazon;
    public C9831e appmetrica;
    public final int billing;
    public final boolean license;
    public final C11286e[] loadAd;
    public final boolean metrica;
    public final float mopub;
    public final Layout purchase;
    public final Paint.FontMetricsInt smaato;
    public final int startapp;
    public final TextUtils.TruncateAt vip;
    public final int yandex;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C6458e(java.lang.CharSequence r22, float r23, android.text.TextPaint r24, int r25, android.text.TextUtils.TruncateAt r26, int r27, boolean r28, int r29, int r30, int r31, int r32, int r33, int r34, defpackage.C5386e r35) {
        /*
            Method dump skipped, instructions count: 841
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6458e.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, eؘِؓ):void");
    }

    public final int ad() {
        boolean z = this.license;
        Layout layout = this.purchase;
        return (z ? layout.getLineBottom(this.billing - 1) : layout.getHeight()) + this.yandex + this.startapp + this.amazon;
    }

    public final C9831e adcel() {
        C9831e c9831e = this.appmetrica;
        if (c9831e != null) {
            return c9831e;
        }
        Layout layout = this.purchase;
        C9831e c9831e2 = new C9831e(layout.getText(), layout.getText().length(), this.ad.getTextLocale());
        this.appmetrica = c9831e2;
        return c9831e2;
    }

    public final float appmetrica(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.billing;
        int i3 = i2 - 1;
        Layout layout = this.purchase;
        if (i != i3 || (fontMetricsInt = this.smaato) == null) {
            return this.yandex + layout.getLineBottom(i) + (i == i2 + (-1) ? this.startapp : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final float billing(int i) {
        return this.purchase.getLineTop(i) + (i == 0 ? 0 : this.yandex);
    }

    public final float license(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.yandex + ((i != this.billing + (-1) || (fontMetricsInt = this.smaato) == null) ? this.purchase.getLineBaseline(i) : billing(i) - fontMetricsInt.ascent);
    }

    public final C18464e metrica() {
        C18464e c18464e = this.admob;
        if (c18464e != null) {
            return c18464e;
        }
        C18464e c18464e2 = new C18464e(this.purchase);
        this.admob = c18464e2;
        return c18464e2;
    }

    public final int purchase(int i) {
        ThreadLocal threadLocal = AbstractC10080e.ad;
        Layout layout = this.purchase;
        return (layout.getEllipsisCount(i) <= 0 || this.vip != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final float startapp(int i, boolean z) {
        return vip(this.purchase.getLineForOffset(i)) + metrica().m4509e(i, false, z);
    }

    public final float vip(int i) {
        if (i == this.billing - 1) {
            return this.adcel + this.mopub;
        }
        return 0.0f;
    }

    public final float yandex(int i, boolean z) {
        return vip(this.purchase.getLineForOffset(i)) + metrica().m4509e(i, true, z);
    }
}
