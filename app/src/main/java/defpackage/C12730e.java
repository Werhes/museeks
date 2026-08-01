package defpackage;

import android.util.Size;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِّۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12730e {
    public final int ad;
    public final C4996e adcel;
    public final Integer appmetrica;
    public final C17560e billing;
    public final String license;
    public final int metrica;
    public final ArrayList mopub = new ArrayList();
    public final C15802e purchase;
    public final C8469e startapp;
    public final Size vip;
    public final C8487e yandex;

    public C12730e(int i, Size size, int i2, String str, Integer num, C15802e c15802e, C17560e c17560e, C8487e c8487e, C8469e c8469e, C4996e c4996e) {
        this.ad = i;
        this.vip = size;
        this.metrica = i2;
        this.license = str;
        this.appmetrica = num;
        this.purchase = c15802e;
        this.billing = c17560e;
        this.yandex = c8487e;
        this.startapp = c8469e;
        this.adcel = c4996e;
    }

    public final String toString() {
        return AbstractC1786e.admob(this.ad, "OutputConfig-");
    }
}
