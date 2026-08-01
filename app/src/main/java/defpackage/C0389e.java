package defpackage;

import java.util.List;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑٙۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0389e extends AbstractC3002e {
    public final AudioPlaylist appmetrica;
    public final String purchase;

    public C0389e(AudioPlaylist audioPlaylist, List list, String str) {
        super(AbstractC13406e.remoteconfig(audioPlaylist) + '_' + str, audioPlaylist.subs, list);
        this.appmetrica = audioPlaylist;
        this.purchase = str;
    }
}
