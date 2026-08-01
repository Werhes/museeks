package defpackage;

import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَّۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12404e implements InterfaceC15283e {
    public final AudioTrack ad;

    public C12404e(AudioTrack audioTrack) {
        this.ad = audioTrack;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12404e) && AbstractC7890e.billing(this.ad, ((C12404e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "Ready(track=" + this.ad + ')';
    }
}
