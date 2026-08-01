package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؖٙۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4189e {
    public static final C7374e Companion = new Object();
    public final C6943e ad;

    public /* synthetic */ C4189e(int i, C6943e c6943e) {
        if (1 == (i & 1)) {
            this.ad = c6943e;
        } else {
            AbstractC5756e.billing(i, 1, C17884e.ad.appmetrica());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4189e) && AbstractC7890e.billing(this.ad, ((C4189e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "AudioBookResultDto(audioBook=" + this.ad + ")";
    }
}
