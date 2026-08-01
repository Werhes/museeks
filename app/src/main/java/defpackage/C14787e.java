package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔ٘۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14787e {
    public static final C14787e metrica;
    public static final C11797e vip = new C11797e(28);
    public final C12169e ad;

    static {
        List list = Collections.EMPTY_LIST;
        metrica = new C14787e(new C12169e());
    }

    public C14787e(C12169e c12169e) {
        this.ad = c12169e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C14787e) && ((C14787e) obj).ad.equals(this.ad);
    }

    public final int hashCode() {
        return ~this.ad.hashCode();
    }

    public final String toString() {
        return this.ad.toString();
    }
}
