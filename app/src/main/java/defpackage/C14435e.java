package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؐۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C14435e {
    public final long ad;
    public final boolean appmetrica;
    public final boolean billing;
    public final long license;
    public final long metrica;
    public final boolean purchase;
    public final long vip;
    public final boolean yandex;
    public static final C14435e startapp = new C14435e(new C9466e());
    public static final String adcel = Integer.toString(0, 36);
    public static final String mopub = Integer.toString(1, 36);
    public static final String advert = Integer.toString(2, 36);
    public static final String smaato = Integer.toString(3, 36);
    public static final String amazon = Integer.toString(4, 36);
    public static final String loadAd = Integer.toString(5, 36);
    public static final String Signature = Integer.toString(6, 36);
    public static final String admob = Integer.toString(7, 36);

    public C14435e(C9466e c9466e) {
        this.ad = AbstractC9413e.m2567switch(c9466e.ad);
        this.metrica = AbstractC9413e.m2567switch(c9466e.vip);
        this.vip = c9466e.ad;
        this.license = c9466e.vip;
        this.appmetrica = c9466e.metrica;
        this.purchase = c9466e.license;
        this.billing = c9466e.appmetrica;
        this.yandex = c9466e.purchase;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14435e)) {
            return false;
        }
        C14435e c14435e = (C14435e) obj;
        return this.vip == c14435e.vip && this.license == c14435e.license && this.appmetrica == c14435e.appmetrica && this.purchase == c14435e.purchase && this.billing == c14435e.billing && this.yandex == c14435e.yandex;
    }

    public final int hashCode() {
        long j = this.vip;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.license;
        return ((((((((i + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.appmetrica ? 1 : 0)) * 31) + (this.purchase ? 1 : 0)) * 31) + (this.billing ? 1 : 0)) * 31) + (this.yandex ? 1 : 0);
    }
}
