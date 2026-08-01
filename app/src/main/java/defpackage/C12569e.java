package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًّٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12569e {
    public static final C11993e startapp = new C11993e(11);
    public final int ad;
    public final long appmetrica;
    public final boolean billing;
    public final long license;
    public final String metrica;
    public final long purchase;
    public final String vip;
    public final int yandex;

    public C12569e(int i, String str, String str2, long j, long j2, long j3, boolean z, int i2) {
        j3 = (i2 & 32) != 0 ? System.currentTimeMillis() : j3;
        z = (i2 & 64) != 0 ? true : z;
        this.ad = i;
        this.vip = str;
        this.metrica = str2;
        this.license = j;
        this.appmetrica = j2;
        this.purchase = j3;
        this.billing = z;
        if (str.length() == 0 && str2.length() == 0) {
            throw new IllegalArgumentException("Either pre or post text must not be empty");
        }
        this.yandex = (str.length() != 0 || str2.length() <= 0) ? (str.length() <= 0 || str2.length() != 0) ? 3 : 2 : 1;
    }

    public final int ad() {
        if (this.yandex != 2) {
            return 4;
        }
        long j = this.appmetrica;
        if (!C12347e.license(j)) {
            return 4;
        }
        long j2 = this.license;
        if (C12347e.license(j2)) {
            return ((int) (j2 >> 32)) > ((int) (j >> 32)) ? 1 : 2;
        }
        int i = (int) (j2 >> 32);
        return (i == ((int) (j >> 32)) && i == this.ad) ? 3 : 4;
    }
}
