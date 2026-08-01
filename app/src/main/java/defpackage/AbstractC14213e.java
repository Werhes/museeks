package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۙۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14213e {
    public final String ad;
    public final int metrica;
    public final long vip;

    public AbstractC14213e(long j, int i, String str) {
        this.ad = str;
        this.vip = j;
        this.metrica = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float ad(int i);

    public abstract float appmetrica(float f, float f2, float f3);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC14213e abstractC14213e = (AbstractC14213e) obj;
        if (this.metrica == abstractC14213e.metrica && AbstractC7890e.billing(this.ad, abstractC14213e.ad)) {
            return AbstractC16096e.ad(this.vip, abstractC14213e.vip);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        int i = AbstractC16096e.appmetrica;
        long j = this.vip;
        return ((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.metrica;
    }

    public abstract long license(float f, float f2, float f3);

    public boolean metrica() {
        return false;
    }

    public abstract long purchase(float f, float f2, float f3, float f4, AbstractC14213e abstractC14213e);

    public final String toString() {
        return this.ad + " (id=" + this.metrica + ", model=" + ((Object) AbstractC16096e.vip(this.vip)) + ')';
    }

    public abstract float vip(int i);
}
