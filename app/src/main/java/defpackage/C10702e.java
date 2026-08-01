package defpackage;

import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۨۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10702e implements InterfaceC5307e {
    public final AudioPlaylist ad;

    public C10702e(AudioPlaylist audioPlaylist) {
        this.ad = audioPlaylist;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10702e) && AbstractC7890e.billing(this.ad, ((C10702e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "AudioPlaylist(playlist=" + this.ad + ')';
    }
}
