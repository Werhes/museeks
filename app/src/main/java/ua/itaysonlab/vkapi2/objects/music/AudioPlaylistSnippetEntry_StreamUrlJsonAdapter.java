package ua.itaysonlab.vkapi2.objects.music;

import defpackage.AbstractC0869e;
import defpackage.AbstractC13345e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC3442e;
import defpackage.AbstractC8647e;
import defpackage.C14172e;
import defpackage.C14803e;
import defpackage.C16911e;
import defpackage.C3295e;
import java.util.Set;
import kotlin.Metadata;
import ua.itaysonlab.vkapi2.objects.music.AudioPlaylistSnippetEntry;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AudioPlaylistSnippetEntry_StreamUrlJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("url", "clip_from", "clip_to");
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public AudioPlaylistSnippetEntry_StreamUrlJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(String.class, c3295e, "url");
        this.metrica = c14172e.vip(Integer.TYPE, c3295e, "clip_from");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        AudioPlaylistSnippetEntry.StreamUrl streamUrl = (AudioPlaylistSnippetEntry.StreamUrl) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("url");
        this.vip.purchase(abstractC3442e, streamUrl.ad);
        abstractC3442e.loadAd("clip_from");
        int i = streamUrl.vip;
        AbstractC13345e abstractC13345e = this.metrica;
        AbstractC8647e.subs(i, abstractC13345e, abstractC3442e, "clip_to");
        abstractC13345e.purchase(abstractC3442e, Integer.valueOf(streamUrl.metrica));
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioPlaylistSnippetEntry.StreamUrl)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        String str = null;
        Integer num = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        Set set = C3295e.f7451e;
        Integer num2 = null;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends == -1) {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            } else if (mo2308extends != 0) {
                AbstractC13345e abstractC13345e = this.metrica;
                if (mo2308extends == 1) {
                    Object vip = abstractC13345e.vip(abstractC17080e);
                    if (vip == null) {
                        set = AbstractC0869e.subs("clip_from", "clip_from", abstractC17080e, set);
                        z2 = true;
                    } else {
                        num2 = (Integer) vip;
                    }
                } else if (mo2308extends == 2) {
                    Object vip2 = abstractC13345e.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("clip_to", "clip_to", abstractC17080e, set);
                        z3 = true;
                    } else {
                        num = (Integer) vip2;
                    }
                }
            } else {
                Object vip3 = this.vip.vip(abstractC17080e);
                if (vip3 == null) {
                    set = AbstractC0869e.subs("url", "url", abstractC17080e, set);
                    z = true;
                } else {
                    str = (String) vip3;
                }
            }
        }
        abstractC17080e.advert();
        if ((!z) & (str == null)) {
            set = AbstractC0869e.isPro("url", "url", abstractC17080e, set);
        }
        if ((!z2) & (num2 == null)) {
            set = AbstractC0869e.isPro("clip_from", "clip_from", abstractC17080e, set);
        }
        if ((num == null) & (!z3)) {
            set = AbstractC0869e.isPro("clip_to", "clip_to", abstractC17080e, set);
        }
        if (set.size() == 0) {
            return new AudioPlaylistSnippetEntry.StreamUrl(str, num2.intValue(), num.intValue());
        }
        throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
    }
}
