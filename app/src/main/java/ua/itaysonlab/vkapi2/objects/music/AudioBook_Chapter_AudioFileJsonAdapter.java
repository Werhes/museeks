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
import ua.itaysonlab.vkapi2.objects.music.AudioBook;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AudioBook_Chapter_AudioFileJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("url", "duration", "file_size");
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public AudioBook_Chapter_AudioFileJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(String.class, c3295e, "url");
        this.metrica = c14172e.vip(Integer.TYPE, c3295e, "duration");
        this.license = c14172e.vip(Long.TYPE, c3295e, "file_size");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        AudioBook.Chapter.AudioFile audioFile = (AudioBook.Chapter.AudioFile) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("url");
        this.vip.purchase(abstractC3442e, audioFile.ad);
        abstractC3442e.loadAd("duration");
        AbstractC8647e.subs(audioFile.vip, this.metrica, abstractC3442e, "file_size");
        this.license.purchase(abstractC3442e, Long.valueOf(audioFile.metrica));
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioBook.Chapter.AudioFile)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Object obj = null;
        Set set = C3295e.f7451e;
        int i = 0;
        long j = 0;
        int i2 = -1;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends == -1) {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            } else if (mo2308extends == 0) {
                Object vip = this.vip.vip(abstractC17080e);
                if (vip == null) {
                    set = AbstractC0869e.subs("url", "url", abstractC17080e, set);
                } else {
                    obj = vip;
                }
                i2 &= -2;
            } else if (mo2308extends == 1) {
                Object vip2 = this.metrica.vip(abstractC17080e);
                if (vip2 == null) {
                    set = AbstractC0869e.subs("duration", "duration", abstractC17080e, set);
                } else {
                    i = ((Number) vip2).intValue();
                }
                i2 &= -3;
            } else if (mo2308extends == 2) {
                Object vip3 = this.license.vip(abstractC17080e);
                if (vip3 == null) {
                    set = AbstractC0869e.subs("file_size", "file_size", abstractC17080e, set);
                } else {
                    j = ((Number) vip3).longValue();
                }
                i2 &= -5;
            }
        }
        abstractC17080e.advert();
        if (set.size() == 0) {
            return i2 == -8 ? new AudioBook.Chapter.AudioFile(j, i, (String) obj) : new AudioBook.Chapter.AudioFile(i, i2, j, (String) obj);
        }
        throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
    }
}
