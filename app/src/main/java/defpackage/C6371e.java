package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙّْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6371e implements InterfaceC2872e {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6371e) && Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.0f);
    }

    public final String toString() {
        return "FixedScale(value=1.0)";
    }

    @Override // defpackage.InterfaceC2872e
    public final long yandex(long j, long j2) {
        long floatToRawIntBits = (Float.floatToRawIntBits(1.0f) << 32) | (4294967295L & Float.floatToRawIntBits(1.0f));
        int i = AbstractC14770e.ad;
        return floatToRawIntBits;
    }
}
