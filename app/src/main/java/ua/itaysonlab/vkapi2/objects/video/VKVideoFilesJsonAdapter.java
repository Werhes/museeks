package ua.itaysonlab.vkapi2.objects.video;

import defpackage.AbstractC13345e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC3442e;
import defpackage.C14172e;
import defpackage.C16911e;
import defpackage.C3295e;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VKVideoFilesJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("mp4_240", "mp4_360", "mp4_480", "mp4_720", "mp4_1080", "mp4_1440", "mp4_2160", "hls");
    public final AbstractC13345e vip;

    public VKVideoFilesJsonAdapter(C14172e c14172e) {
        this.vip = c14172e.vip(String.class, C3295e.f7451e, "mp4_240");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        VKVideoFiles vKVideoFiles = (VKVideoFiles) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("mp4_240");
        String str = vKVideoFiles.ad;
        AbstractC13345e abstractC13345e = this.vip;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("mp4_360");
        abstractC13345e.purchase(abstractC3442e, vKVideoFiles.vip);
        abstractC3442e.loadAd("mp4_480");
        abstractC13345e.purchase(abstractC3442e, vKVideoFiles.metrica);
        abstractC3442e.loadAd("mp4_720");
        abstractC13345e.purchase(abstractC3442e, vKVideoFiles.license);
        abstractC3442e.loadAd("mp4_1080");
        abstractC13345e.purchase(abstractC3442e, vKVideoFiles.appmetrica);
        abstractC3442e.loadAd("mp4_1440");
        abstractC13345e.purchase(abstractC3442e, vKVideoFiles.purchase);
        abstractC3442e.loadAd("mp4_2160");
        abstractC13345e.purchase(abstractC3442e, vKVideoFiles.billing);
        abstractC3442e.loadAd("hls");
        abstractC13345e.purchase(abstractC3442e, vKVideoFiles.yandex);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(VKVideoFiles)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            AbstractC13345e abstractC13345e = this.vip;
            switch (mo2308extends) {
                case -1:
                    abstractC17080e.mo2305break();
                    abstractC17080e.mo2314implements();
                    break;
                case 0:
                    str = (String) abstractC13345e.vip(abstractC17080e);
                    break;
                case 1:
                    str2 = (String) abstractC13345e.vip(abstractC17080e);
                    break;
                case 2:
                    str3 = (String) abstractC13345e.vip(abstractC17080e);
                    break;
                case 3:
                    str4 = (String) abstractC13345e.vip(abstractC17080e);
                    break;
                case 4:
                    str5 = (String) abstractC13345e.vip(abstractC17080e);
                    break;
                case 5:
                    str6 = (String) abstractC13345e.vip(abstractC17080e);
                    break;
                case 6:
                    str7 = (String) abstractC13345e.vip(abstractC17080e);
                    break;
                case 7:
                    str8 = (String) abstractC13345e.vip(abstractC17080e);
                    break;
            }
        }
        abstractC17080e.advert();
        return new VKVideoFiles(str, str2, str3, str4, str5, str6, str7, str8);
    }
}
