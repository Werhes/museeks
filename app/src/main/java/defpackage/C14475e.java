package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٔؓۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14475e {
    public static final C9680e Companion = new Object();
    public static final InterfaceC3477e[] vip = {AbstractC18039e.appmetrica(2, new C14561e(3))};
    public final List ad;

    public /* synthetic */ C14475e(int i, List list) {
        if ((i & 1) == 0) {
            this.ad = C13664e.f27089e;
        } else {
            this.ad = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14475e) && AbstractC7890e.billing(this.ad, ((C14475e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "AudioGetAudioIdsBySourceResponseDto(audios=" + this.ad + ")";
    }
}
