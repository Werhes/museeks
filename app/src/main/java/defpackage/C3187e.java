package defpackage;

import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙُؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3187e implements InterfaceC4111e {
    public final AudioTrack ad;
    public final int metrica = 1;
    public final String vip;

    public C3187e(AudioTrack audioTrack) {
        this.ad = audioTrack;
        this.vip = AbstractC6914e.billing(audioTrack);
    }

    @Override // defpackage.InterfaceC4111e
    public final int ad() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC4111e
    public final String getId() {
        return this.vip;
    }
}
