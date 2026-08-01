package defpackage;

import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؑ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0154e implements InterfaceC4528e {
    public final int ad;
    public final long vip;

    public C0154e(AudioTrack audioTrack) {
        int i = audioTrack.vip;
        long j = audioTrack.metrica;
        this.ad = i;
        this.vip = j;
    }

    @Override // defpackage.InterfaceC4528e
    public final int ad() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC4528e
    public final long vip() {
        return this.vip;
    }
}
