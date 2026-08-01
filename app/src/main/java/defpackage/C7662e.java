package defpackage;

import android.util.Size;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؒؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7662e {
    public final int ad;
    public C12550e adcel;
    public final C17560e appmetrica;
    public final C8469e billing;
    public final String license;
    public final int metrica;
    public final C8487e purchase;
    public final C4996e startapp;
    public final Size vip;
    public final C15802e yandex;

    public C7662e(int i, int i2, C8487e c8487e, C17560e c17560e, C8469e c8469e, C4996e c4996e, Size size, String str, C15802e c15802e) {
        this.ad = i;
        this.vip = size;
        this.metrica = i2;
        this.license = str;
        this.appmetrica = c17560e;
        this.purchase = c8487e;
        this.billing = c8469e;
        this.yandex = c15802e;
        this.startapp = c4996e;
    }

    public final boolean ad() {
        C4996e c4996e;
        C8469e c8469e = this.billing;
        if (c8469e == null) {
            return true;
        }
        long j = c8469e.ad;
        if (C8469e.ad(j, 0L) || C8469e.ad(j, 1L) || C8469e.ad(j, 3L) || (c4996e = this.startapp) == null) {
            return true;
        }
        long j2 = c4996e.ad;
        return C4996e.ad(j2, 0L) || C4996e.ad(j2, 1L);
    }

    public final String toString() {
        return C18319e.ad(this.ad);
    }
}
