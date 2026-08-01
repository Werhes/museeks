package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۤۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12086e {
    public final int ad;
    public final /* synthetic */ C18464e adcel;
    public int appmetrica;
    public int billing;
    public int license;
    public int metrica;
    public int purchase;
    public int startapp;
    public int vip;
    public int yandex;

    public C12086e(C18464e c18464e, int i, int i2) {
        this.adcel = c18464e;
        this.ad = i;
        this.vip = i2;
        ad();
    }

    public final void ad() {
        C18464e c18464e = this.adcel;
        int[] iArr = (int[]) c18464e.f36191e;
        int[] iArr2 = (int[]) c18464e.f36190e;
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = 0;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MIN_VALUE;
        for (int i8 = this.ad; i8 <= this.vip; i8++) {
            int i9 = iArr[i8];
            i4 += iArr2[i9];
            int i10 = (i9 >> 10) & 31;
            int i11 = (i9 >> 5) & 31;
            int i12 = i9 & 31;
            if (i10 > i7) {
                i7 = i10;
            }
            if (i10 < i) {
                i = i10;
            }
            if (i11 > i2) {
                i2 = i11;
            }
            if (i11 < i5) {
                i5 = i11;
            }
            if (i12 > i3) {
                i3 = i12;
            }
            if (i12 < i6) {
                i6 = i12;
            }
        }
        this.license = i;
        this.appmetrica = i7;
        this.purchase = i5;
        this.billing = i2;
        this.yandex = i6;
        this.startapp = i3;
        this.metrica = i4;
    }

    public final int vip() {
        return ((this.startapp - this.yandex) + 1) * ((this.billing - this.purchase) + 1) * ((this.appmetrica - this.license) + 1);
    }
}
