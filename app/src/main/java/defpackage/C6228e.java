package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؘؙٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6228e {
    public static final C13650e Companion = new Object();
    public final C9950e ad;

    public /* synthetic */ C6228e(int i, C9950e c9950e) {
        if (1 == (i & 1)) {
            this.ad = c9950e;
        } else {
            AbstractC5756e.billing(i, 1, C12924e.ad.appmetrica());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6228e) && AbstractC7890e.billing(this.ad, ((C6228e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "AudioGetStreamMixSettingsResponseDto(settings=" + this.ad + ")";
    }
}
