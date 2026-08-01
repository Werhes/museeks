package defpackage;

import j$.time.ZoneOffset;
import java.io.Serializable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e(with = C3035e.class)
/* renamed from: eٌؘۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8885e implements Serializable {
    public static final C2142e Companion = new Object();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ZoneOffset f17842e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؓ۠ٙ, java.lang.Object] */
    static {
        ZoneOffset zoneOffset = ZoneOffset.UTC;
    }

    public C8885e(ZoneOffset zoneOffset) {
        this.f17842e = zoneOffset;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8885e) {
            return AbstractC7890e.billing(this.f17842e, ((C8885e) obj).f17842e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17842e.hashCode();
    }

    public final String toString() {
        return this.f17842e.toString();
    }
}
