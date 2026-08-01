package defpackage;

import android.graphics.Paint;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۡۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17334e extends AbstractC7279e {
    public float adcel;
    public Paint.Cap advert;
    public float amazon;
    public float appmetrica;
    public float billing;
    public Csuper license;
    public float mopub;
    public Csuper purchase;
    public Paint.Join smaato;
    public float startapp;
    public float yandex;

    @Override // defpackage.AbstractC11583e
    public final boolean ad() {
        return this.purchase.m4643extends() || this.license.m4643extends();
    }

    public float getFillAlpha() {
        return this.yandex;
    }

    public int getFillColor() {
        return this.purchase.f36470e;
    }

    public float getStrokeAlpha() {
        return this.billing;
    }

    public int getStrokeColor() {
        return this.license.f36470e;
    }

    public float getStrokeWidth() {
        return this.appmetrica;
    }

    public float getTrimPathEnd() {
        return this.adcel;
    }

    public float getTrimPathOffset() {
        return this.mopub;
    }

    public float getTrimPathStart() {
        return this.startapp;
    }

    public void setFillAlpha(float f) {
        this.yandex = f;
    }

    public void setFillColor(int i) {
        this.purchase.f36470e = i;
    }

    public void setStrokeAlpha(float f) {
        this.billing = f;
    }

    public void setStrokeColor(int i) {
        this.license.f36470e = i;
    }

    public void setStrokeWidth(float f) {
        this.appmetrica = f;
    }

    public void setTrimPathEnd(float f) {
        this.adcel = f;
    }

    public void setTrimPathOffset(float f) {
        this.mopub = f;
    }

    public void setTrimPathStart(float f) {
        this.startapp = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.AbstractC11583e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean vip(int[] r7) {
        /*
            r6 = this;
            super r0 = r6.purchase
            boolean r1 = r0.m4643extends()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.f36471e
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.f36470e
            if (r1 == r4) goto L1e
            r0.f36470e = r1
            r0 = r2
            goto L1f
        L1e:
            r0 = r3
        L1f:
            super r1 = r6.license
            boolean r4 = r1.m4643extends()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.f36471e
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.f36470e
            if (r7 == r4) goto L3a
            r1.f36470e = r7
            goto L3b
        L3a:
            r2 = r3
        L3b:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17334e.vip(int[]):boolean");
    }
}
