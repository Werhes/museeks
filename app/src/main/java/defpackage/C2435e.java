package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؔۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2435e {
    public final Uri ad;
    public final Object adcel;
    public final Map appmetrica;
    public final long billing;
    public final byte[] license;
    public final int metrica;
    public final long purchase;
    public final int startapp;
    public final long vip;
    public final String yandex;

    static {
        AbstractC1418e.ad("media3.datasource");
    }

    public C2435e(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj) {
        AbstractC2301e.billing(j + j2 >= 0);
        AbstractC2301e.billing(j2 >= 0);
        AbstractC2301e.billing(j3 > 0 || j3 == -1);
        uri.getClass();
        this.ad = uri;
        this.vip = j;
        this.metrica = i;
        this.license = (bArr == null || bArr.length == 0) ? null : bArr;
        this.appmetrica = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.purchase = j2;
        this.billing = j3;
        this.yandex = str;
        this.startapp = i2;
        this.adcel = obj;
    }

    public static String vip(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eِؖۨ] */
    public final C11537e ad() {
        ?? obj = new Object();
        obj.ad = this.ad;
        obj.vip = this.vip;
        obj.metrica = this.metrica;
        obj.license = this.license;
        obj.appmetrica = this.appmetrica;
        obj.purchase = this.purchase;
        obj.billing = this.billing;
        obj.yandex = this.yandex;
        obj.startapp = this.startapp;
        obj.adcel = this.adcel;
        return obj;
    }

    public final C2435e metrica(long j, long j2) {
        if (j == 0 && this.billing == j2) {
            return this;
        }
        return new C2435e(this.ad, this.vip, this.metrica, this.license, this.appmetrica, this.purchase + j, j2, this.yandex, this.startapp, this.adcel);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(vip(this.metrica));
        sb.append(" ");
        sb.append(this.ad);
        sb.append(", ");
        sb.append(this.purchase);
        sb.append(", ");
        sb.append(this.billing);
        sb.append(", ");
        sb.append(this.yandex);
        sb.append(", ");
        return AbstractC17861e.smaato(this.startapp, "]", sb);
    }
}
