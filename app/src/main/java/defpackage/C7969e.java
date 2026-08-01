package defpackage;

import j$.time.ZoneId;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e(with = C2161e.class)
/* renamed from: eًٖۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7969e {
    public static final C9663e Companion = new Object();
    public final ZoneId ad;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eٍؙۖ] */
    static {
        C8885e.Companion.getClass();
        C2142e c2142e = C8885e.Companion;
        ZoneId.of("UTC");
    }

    public C7969e(ZoneId zoneId) {
        this.ad = zoneId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7969e) {
            return AbstractC7890e.billing(this.ad, ((C7969e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return this.ad.toString();
    }
}
