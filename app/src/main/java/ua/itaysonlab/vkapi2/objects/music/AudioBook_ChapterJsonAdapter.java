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
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioBook;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AudioBook_ChapterJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("id", "title", "progress_status", "progress_time", "track_code", "audio_file");
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public AudioBook_ChapterJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(String.class, c3295e, "id");
        this.metrica = c14172e.vip(Integer.TYPE, c3295e, "progress_time");
        this.license = c14172e.vip(AudioBook.Chapter.AudioFile.class, c3295e, "audio_file");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        AudioBook.Chapter chapter = (AudioBook.Chapter) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("id");
        String str = chapter.ad;
        AbstractC13345e abstractC13345e = this.vip;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("title");
        abstractC13345e.purchase(abstractC3442e, chapter.vip);
        abstractC3442e.loadAd("progress_status");
        abstractC13345e.purchase(abstractC3442e, chapter.metrica);
        abstractC3442e.loadAd("progress_time");
        AbstractC8647e.subs(chapter.license, this.metrica, abstractC3442e, "track_code");
        abstractC13345e.purchase(abstractC3442e, chapter.appmetrica);
        abstractC3442e.loadAd("audio_file");
        this.license.purchase(abstractC3442e, chapter.purchase);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioBook.Chapter)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Object obj = null;
        String str = null;
        String str2 = null;
        Set set = C3295e.f7451e;
        int i = -1;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            if (!abstractC17080e.Signature()) {
                abstractC17080e.advert();
                if ((!z) & (str == null)) {
                    set = AbstractC0869e.isPro("id", "id", abstractC17080e, set);
                }
                if ((!z2) & (str2 == null)) {
                    set = AbstractC0869e.isPro("progress_status", "progress_status", abstractC17080e, set);
                }
                if (set.size() != 0) {
                    throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
                }
                if (i == -59) {
                    return new AudioBook.Chapter(str, (String) obj, str2, i2, (String) obj2, (AudioBook.Chapter.AudioFile) obj3);
                }
                int i3 = i2;
                String str3 = (String) obj;
                String str4 = (String) obj2;
                AudioBook.Chapter.AudioFile audioFile = (AudioBook.Chapter.AudioFile) obj3;
                if ((i & 2) != 0) {
                    str3 = BuildConfig.FLAVOR;
                }
                if ((i & 8) != 0) {
                    i3 = 0;
                }
                return new AudioBook.Chapter(str, str3, str2, i3, (i & 16) != 0 ? BuildConfig.FLAVOR : str4, (i & 32) != 0 ? new AudioBook.Chapter.AudioFile(0, 7, 0L, null) : audioFile);
            }
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
                        set = AbstractC0869e.subs("id", "id", abstractC17080e, set);
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
                    if (vip3 != null) {
                        str2 = (String) vip3;
                        break;
                    } else {
                        set = AbstractC0869e.subs("progress_status", "progress_status", abstractC17080e, set);
                        z2 = true;
                        break;
                    }
                case 3:
                    Object vip4 = this.metrica.vip(abstractC17080e);
                    if (vip4 == null) {
                        set = AbstractC0869e.subs("progress_time", "progress_time", abstractC17080e, set);
                    } else {
                        i2 = ((Number) vip4).intValue();
                    }
                    i &= -9;
                    break;
                case 4:
                    Object vip5 = abstractC13345e.vip(abstractC17080e);
                    if (vip5 == null) {
                        set = AbstractC0869e.subs("track_code", "track_code", abstractC17080e, set);
                    } else {
                        obj2 = vip5;
                    }
                    i &= -17;
                    break;
                case 5:
                    Object vip6 = this.license.vip(abstractC17080e);
                    if (vip6 == null) {
                        set = AbstractC0869e.subs("audio_file", "audio_file", abstractC17080e, set);
                    } else {
                        obj3 = vip6;
                    }
                    i &= -33;
                    break;
            }
        }
    }
}
