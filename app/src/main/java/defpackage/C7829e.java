package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍَ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7829e {
    public static final C7829e startapp;
    public boolean appmetrica;
    public boolean license;
    public boolean metrica;
    public boolean vip;
    public int ad = 1;
    public long purchase = -1;
    public long billing = -1;
    public C14830e yandex = new C14830e();

    /* JADX WARN: Type inference failed for: r1v0, types: [eًٍَ, java.lang.Object] */
    static {
        C14830e c14830e = new C14830e();
        ?? obj = new Object();
        obj.ad = 1;
        obj.purchase = -1L;
        obj.billing = -1L;
        obj.yandex = new C14830e();
        obj.vip = false;
        int i = Build.VERSION.SDK_INT;
        obj.metrica = false;
        obj.ad = 1;
        obj.license = false;
        obj.appmetrica = false;
        if (i >= 24) {
            obj.yandex = c14830e;
            obj.purchase = -1L;
            obj.billing = -1L;
        }
        startapp = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7829e.class != obj.getClass()) {
            return false;
        }
        C7829e c7829e = (C7829e) obj;
        if (this.vip == c7829e.vip && this.metrica == c7829e.metrica && this.license == c7829e.license && this.appmetrica == c7829e.appmetrica && this.purchase == c7829e.purchase && this.billing == c7829e.billing && this.ad == c7829e.ad) {
            return this.yandex.equals(c7829e.yandex);
        }
        return false;
    }

    public final int hashCode() {
        int m2467class = ((((((((AbstractC8703e.m2467class(this.ad) * 31) + (this.vip ? 1 : 0)) * 31) + (this.metrica ? 1 : 0)) * 31) + (this.license ? 1 : 0)) * 31) + (this.appmetrica ? 1 : 0)) * 31;
        long j = this.purchase;
        int i = (m2467class + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.billing;
        return this.yandex.ad.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }
}
