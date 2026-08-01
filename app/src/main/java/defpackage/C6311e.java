package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6311e {
    public static final String appmetrica;
    public static final String license;
    public static final String purchase;
    public final long ad;
    public final String metrica;
    public final long vip;

    static {
        String str = AbstractC9413e.ad;
        license = Integer.toString(0, 36);
        appmetrica = Integer.toString(1, 36);
        purchase = Integer.toString(2, 36);
    }

    public C6311e(String str, long j, long j2) {
        AbstractC2301e.billing((j == -9223372036854775807L && j2 == -9223372036854775807L && str == null) ? false : true);
        this.ad = j == -9223372036854775807L ? 0L : j;
        this.vip = j2;
        this.metrica = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6311e.class == obj.getClass()) {
            C6311e c6311e = (C6311e) obj;
            if (this.ad == c6311e.ad && this.vip == c6311e.vip && Objects.equals(this.metrica, c6311e.metrica)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.ad), Long.valueOf(this.vip), this.metrica);
    }
}
