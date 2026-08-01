package ua.itaysonlab.vkapi2.methods.audio.playlist;

import defpackage.AbstractC0869e;
import defpackage.AbstractC13345e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC18453e;
import defpackage.AbstractC3442e;
import defpackage.C13664e;
import defpackage.C14172e;
import defpackage.C14803e;
import defpackage.C16911e;
import defpackage.C3295e;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AudioGetPlaylist_PlaylistResponseJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("owner", "playlist", "audios");
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public AudioGetPlaylist_PlaylistResponseJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(VKProfile.class, c3295e, "owner");
        this.metrica = c14172e.vip(AudioPlaylist.class, c3295e, "playlist");
        this.license = c14172e.vip(AbstractC18453e.purchase(List.class, AudioTrack.class), c3295e, "audios");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        AudioGetPlaylist$PlaylistResponse audioGetPlaylist$PlaylistResponse = (AudioGetPlaylist$PlaylistResponse) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("owner");
        this.vip.purchase(abstractC3442e, audioGetPlaylist$PlaylistResponse.ad);
        abstractC3442e.loadAd("playlist");
        this.metrica.purchase(abstractC3442e, audioGetPlaylist$PlaylistResponse.vip);
        abstractC3442e.loadAd("audios");
        this.license.purchase(abstractC3442e, audioGetPlaylist$PlaylistResponse.metrica);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioGetPlaylist.PlaylistResponse)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Set set = C3295e.f7451e;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        int i = -1;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends == -1) {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            } else if (mo2308extends == 0) {
                obj = this.vip.vip(abstractC17080e);
                i &= -2;
            } else if (mo2308extends == 1) {
                obj2 = this.metrica.vip(abstractC17080e);
                i &= -3;
            } else if (mo2308extends == 2) {
                Object vip = this.license.vip(abstractC17080e);
                if (vip == null) {
                    set = AbstractC0869e.subs("audios", "audios", abstractC17080e, set);
                } else {
                    obj3 = vip;
                }
                i &= -5;
            }
        }
        abstractC17080e.advert();
        if (set.size() != 0) {
            throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
        }
        if (i == -8) {
            return new AudioGetPlaylist$PlaylistResponse((VKProfile) obj, (AudioPlaylist) obj2, (List) obj3);
        }
        VKProfile vKProfile = (VKProfile) obj;
        AudioPlaylist audioPlaylist = (AudioPlaylist) obj2;
        List list = (List) obj3;
        if ((i & 1) != 0) {
            vKProfile = null;
        }
        AudioPlaylist audioPlaylist2 = (i & 2) == 0 ? audioPlaylist : null;
        if ((i & 4) != 0) {
            list = C13664e.f27089e;
        }
        return new AudioGetPlaylist$PlaylistResponse(vKProfile, audioPlaylist2, list);
    }
}
