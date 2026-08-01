package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؕۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10794e {
    public final Long ad;
    public final Long metrica;
    public final Long vip;

    static {
        AbstractC3820e.ad.vip(C10794e.class);
        try {
            AbstractC3820e.ad(C10794e.class);
        } catch (Throwable unused) {
        }
        if (AbstractC5304e.m1866native("TimeoutConfiguration")) {
            throw new IllegalArgumentException("Name can't be blank");
        }
    }

    public C10794e() {
        this.ad = 0L;
        this.vip = 0L;
        this.metrica = 0L;
        this.ad = null;
        this.vip = null;
        this.metrica = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10794e.class != obj.getClass()) {
            return false;
        }
        C10794e c10794e = (C10794e) obj;
        return AbstractC7890e.billing(this.ad, c10794e.ad) && AbstractC7890e.billing(this.vip, c10794e.vip) && AbstractC7890e.billing(this.metrica, c10794e.metrica);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        Long l = this.ad;
        if (l != null) {
            long longValue = l.longValue();
            i = (int) (longValue ^ (longValue >>> 32));
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Long l2 = this.vip;
        if (l2 != null) {
            long longValue2 = l2.longValue();
            i2 = (int) (longValue2 ^ (longValue2 >>> 32));
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Long l3 = this.metrica;
        if (l3 != null) {
            long longValue3 = l3.longValue();
            i3 = (int) ((longValue3 >>> 32) ^ longValue3);
        }
        return i5 + i3;
    }
}
