package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٕ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12016e {
    public static final String license;
    public static final String metrica;
    public final String ad;
    public final String vip;

    static {
        String str = AbstractC9413e.ad;
        metrica = Integer.toString(0, 36);
        license = Integer.toString(1, 36);
    }

    public C12016e(String str, String str2) {
        this.ad = AbstractC9413e.m2547catch(str);
        this.vip = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C12016e.class == obj.getClass()) {
            C12016e c12016e = (C12016e) obj;
            if (Objects.equals(this.ad, c12016e.ad) && Objects.equals(this.vip, c12016e.vip)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.vip.hashCode() * 31;
        String str = this.ad;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
