package ua.itaysonlab.vkapi2.objects.music;

import defpackage.AbstractC0869e;
import defpackage.AbstractC13345e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC18453e;
import defpackage.AbstractC3442e;
import defpackage.C14172e;
import defpackage.C14803e;
import defpackage.C16911e;
import defpackage.C3295e;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AudioSnippetEntryJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("type", "title", "text", "nav_url", "image", "track_code", "audios", "audio_ids");
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public AudioSnippetEntryJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(String.class, c3295e, "type");
        this.metrica = c14172e.vip(AbstractC18453e.purchase(List.class, AudioTrack.class), c3295e, "audios");
        this.license = c14172e.vip(AbstractC18453e.purchase(List.class, String.class), c3295e, "audio_ids");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        AudioSnippetEntry audioSnippetEntry = (AudioSnippetEntry) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("type");
        String str = audioSnippetEntry.ad;
        AbstractC13345e abstractC13345e = this.vip;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("title");
        abstractC13345e.purchase(abstractC3442e, audioSnippetEntry.vip);
        abstractC3442e.loadAd("text");
        abstractC13345e.purchase(abstractC3442e, audioSnippetEntry.metrica);
        abstractC3442e.loadAd("nav_url");
        abstractC13345e.purchase(abstractC3442e, audioSnippetEntry.license);
        abstractC3442e.loadAd("image");
        abstractC13345e.purchase(abstractC3442e, audioSnippetEntry.appmetrica);
        abstractC3442e.loadAd("track_code");
        abstractC13345e.purchase(abstractC3442e, audioSnippetEntry.purchase);
        abstractC3442e.loadAd("audios");
        this.metrica.purchase(abstractC3442e, audioSnippetEntry.billing);
        abstractC3442e.loadAd("audio_ids");
        this.license.purchase(abstractC3442e, audioSnippetEntry.yandex);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioSnippetEntry)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Object obj = null;
        Object obj2 = null;
        String str = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Set set = C3295e.f7451e;
        int i = -1;
        boolean z = false;
        Object obj6 = null;
        Object obj7 = null;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            AbstractC13345e abstractC13345e = this.vip;
            switch (mo2308extends) {
                case -1:
                    abstractC17080e.mo2305break();
                    abstractC17080e.mo2314implements();
                    break;
                case 0:
                    Object vip = abstractC13345e.vip(abstractC17080e);
                    if (vip != null) {
                        str = (String) vip;
                        break;
                    } else {
                        set = AbstractC0869e.subs("type", "type", abstractC17080e, set);
                        z = true;
                        break;
                    }
                case 1:
                    Object vip2 = abstractC13345e.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("title", "title", abstractC17080e, set);
                    } else {
                        obj = vip2;
                    }
                    i &= -3;
                    break;
                case 2:
                    Object vip3 = abstractC13345e.vip(abstractC17080e);
                    if (vip3 == null) {
                        set = AbstractC0869e.subs("text", "text", abstractC17080e, set);
                    } else {
                        obj6 = vip3;
                    }
                    i &= -5;
                    break;
                case 3:
                    Object vip4 = abstractC13345e.vip(abstractC17080e);
                    if (vip4 == null) {
                        set = AbstractC0869e.subs("nav_url", "nav_url", abstractC17080e, set);
                    } else {
                        obj7 = vip4;
                    }
                    i &= -9;
                    break;
                case 4:
                    Object vip5 = abstractC13345e.vip(abstractC17080e);
                    if (vip5 == null) {
                        set = AbstractC0869e.subs("image", "image", abstractC17080e, set);
                    } else {
                        obj2 = vip5;
                    }
                    i &= -17;
                    break;
                case 5:
                    Object vip6 = abstractC13345e.vip(abstractC17080e);
                    if (vip6 == null) {
                        set = AbstractC0869e.subs("track_code", "track_code", abstractC17080e, set);
                    } else {
                        obj3 = vip6;
                    }
                    i &= -33;
                    break;
                case 6:
                    Object vip7 = this.metrica.vip(abstractC17080e);
                    if (vip7 == null) {
                        set = AbstractC0869e.subs("audios", "audios", abstractC17080e, set);
                    } else {
                        obj4 = vip7;
                    }
                    i &= -65;
                    break;
                case 7:
                    Object vip8 = this.license.vip(abstractC17080e);
                    if (vip8 == null) {
                        set = AbstractC0869e.subs("audio_ids", "audio_ids", abstractC17080e, set);
                    } else {
                        obj5 = vip8;
                    }
                    i &= -129;
                    break;
            }
        }
        abstractC17080e.advert();
        if ((!z) & (str == null)) {
            set = AbstractC0869e.isPro("type", "type", abstractC17080e, set);
        }
        if (set.size() == 0) {
            return i == -255 ? new AudioSnippetEntry(str, (String) obj, (String) obj6, (String) obj7, (String) obj2, (String) obj3, (List) obj4, (List) obj5) : new AudioSnippetEntry(str, (String) obj, (String) obj6, (String) obj7, (String) obj2, (String) obj3, (List) obj4, (List) obj5, i);
        }
        throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
    }
}
