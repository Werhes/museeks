package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُِۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11680e {
    public static final String license;
    public static final String metrica;
    public final C16437e ad;
    public final AbstractC17475e vip;

    static {
        String str = AbstractC9413e.ad;
        metrica = Integer.toString(0, 36);
        license = Integer.toString(1, 36);
    }

    public C11680e(C16437e c16437e, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= c16437e.ad)) {
            throw new IndexOutOfBoundsException();
        }
        this.ad = c16437e;
        this.vip = AbstractC17475e.remoteconfig(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C11680e.class == obj.getClass()) {
            C11680e c11680e = (C11680e) obj;
            if (this.ad.equals(c11680e.ad) && this.vip.equals(c11680e.vip)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.vip.hashCode() * 31) + this.ad.hashCode();
    }
}
