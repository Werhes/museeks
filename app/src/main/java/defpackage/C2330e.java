package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؓؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2330e {
    public final float ad;
    public final long appmetrica;
    public final long billing;
    public final float license;
    public final float metrica;
    public final long purchase;
    public final float vip;
    public final long yandex;

    static {
        AbstractC13336e.ad(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public C2330e(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.ad = f;
        this.vip = f2;
        this.metrica = f3;
        this.license = f4;
        this.appmetrica = j;
        this.purchase = j2;
        this.billing = j3;
        this.yandex = j4;
    }

    public final float ad() {
        return this.license - this.vip;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2330e)) {
            return false;
        }
        C2330e c2330e = (C2330e) obj;
        return Float.compare(this.ad, c2330e.ad) == 0 && Float.compare(this.vip, c2330e.vip) == 0 && Float.compare(this.metrica, c2330e.metrica) == 0 && Float.compare(this.license, c2330e.license) == 0 && AbstractC14520e.appmetrica(this.appmetrica, c2330e.appmetrica) && AbstractC14520e.appmetrica(this.purchase, c2330e.purchase) && AbstractC14520e.appmetrica(this.billing, c2330e.billing) && AbstractC14520e.appmetrica(this.yandex, c2330e.yandex);
    }

    public final int hashCode() {
        int license = AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(Float.floatToIntBits(this.ad) * 31, this.vip, 31), this.metrica, 31), this.license, 31);
        long j = this.appmetrica;
        long j2 = this.purchase;
        int i = (((int) (j2 ^ (j2 >>> 32))) + ((((int) (j ^ (j >>> 32))) + license) * 31)) * 31;
        long j3 = this.billing;
        int i2 = (((int) (j3 ^ (j3 >>> 32))) + i) * 31;
        long j4 = this.yandex;
        return ((int) (j4 ^ (j4 >>> 32))) + i2;
    }

    public final String toString() {
        String str = AbstractC2270e.adcel(this.ad) + ", " + AbstractC2270e.adcel(this.vip) + ", " + AbstractC2270e.adcel(this.metrica) + ", " + AbstractC2270e.adcel(this.license);
        long j = this.appmetrica;
        long j2 = this.purchase;
        boolean appmetrica = AbstractC14520e.appmetrica(j, j2);
        long j3 = this.billing;
        long j4 = this.yandex;
        if (!appmetrica || !AbstractC14520e.appmetrica(j2, j3) || !AbstractC14520e.appmetrica(j3, j4)) {
            StringBuilder applovin = AbstractC8703e.applovin("RoundRect(rect=", str, ", topLeft=");
            applovin.append((Object) AbstractC14520e.yandex(j));
            applovin.append(", topRight=");
            applovin.append((Object) AbstractC14520e.yandex(j2));
            applovin.append(", bottomRight=");
            applovin.append((Object) AbstractC14520e.yandex(j3));
            applovin.append(", bottomLeft=");
            applovin.append((Object) AbstractC14520e.yandex(j4));
            applovin.append(')');
            return applovin.toString();
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            StringBuilder applovin2 = AbstractC8703e.applovin("RoundRect(rect=", str, ", radius=");
            applovin2.append(AbstractC2270e.adcel(Float.intBitsToFloat(i)));
            applovin2.append(')');
            return applovin2.toString();
        }
        StringBuilder applovin3 = AbstractC8703e.applovin("RoundRect(rect=", str, ", x=");
        applovin3.append(AbstractC2270e.adcel(Float.intBitsToFloat(i)));
        applovin3.append(", y=");
        applovin3.append(AbstractC2270e.adcel(Float.intBitsToFloat(i2)));
        applovin3.append(')');
        return applovin3.toString();
    }

    public final float vip() {
        return this.metrica - this.ad;
    }
}
