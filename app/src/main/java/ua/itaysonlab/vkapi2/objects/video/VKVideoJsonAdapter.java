package ua.itaysonlab.vkapi2.objects.video;

import defpackage.AbstractC0869e;
import defpackage.AbstractC13345e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC1815e;
import defpackage.AbstractC18453e;
import defpackage.AbstractC3442e;
import defpackage.AbstractC8647e;
import defpackage.C14172e;
import defpackage.C14803e;
import defpackage.C16911e;
import defpackage.C3295e;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkapi2.objects.music.Genre;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItemPhoto;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VKVideoJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("id", "owner_id", "title", "width", "height", "image", "user_id", "files", "main_artists", "genres", "duration", "direct_url");
    public final AbstractC13345e adcel;
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e billing;
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e purchase;
    public final AbstractC13345e startapp;
    public final AbstractC13345e vip;
    public final AbstractC13345e yandex;

    public VKVideoJsonAdapter(C14172e c14172e) {
        Class cls = Integer.TYPE;
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(cls, c3295e, "id");
        this.metrica = c14172e.vip(Long.class, c3295e, "owner_id");
        this.license = c14172e.vip(String.class, c3295e, "title");
        this.appmetrica = c14172e.vip(Integer.class, c3295e, "width");
        this.purchase = c14172e.vip(AbstractC18453e.purchase(List.class, CustomCatalogBlockItemPhoto.class), c3295e, "image");
        this.billing = c14172e.vip(VKVideoFiles.class, c3295e, "files");
        this.yandex = c14172e.vip(AbstractC18453e.purchase(List.class, MainArtist.class), c3295e, "main_artists");
        this.startapp = c14172e.vip(AbstractC18453e.purchase(List.class, Genre.class), c3295e, "genres");
        this.adcel = c14172e.vip(String.class, c3295e, "direct_url");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        VKVideo vKVideo = (VKVideo) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("id");
        int i = vKVideo.ad;
        AbstractC13345e abstractC13345e = this.vip;
        AbstractC8647e.subs(i, abstractC13345e, abstractC3442e, "owner_id");
        Long l = vKVideo.vip;
        AbstractC13345e abstractC13345e2 = this.metrica;
        abstractC13345e2.purchase(abstractC3442e, l);
        abstractC3442e.loadAd("title");
        this.license.purchase(abstractC3442e, vKVideo.metrica);
        abstractC3442e.loadAd("width");
        Integer num = vKVideo.license;
        AbstractC13345e abstractC13345e3 = this.appmetrica;
        abstractC13345e3.purchase(abstractC3442e, num);
        abstractC3442e.loadAd("height");
        abstractC13345e3.purchase(abstractC3442e, vKVideo.appmetrica);
        abstractC3442e.loadAd("image");
        this.purchase.purchase(abstractC3442e, vKVideo.purchase);
        abstractC3442e.loadAd("user_id");
        abstractC13345e2.purchase(abstractC3442e, vKVideo.billing);
        abstractC3442e.loadAd("files");
        this.billing.purchase(abstractC3442e, vKVideo.yandex);
        abstractC3442e.loadAd("main_artists");
        this.yandex.purchase(abstractC3442e, vKVideo.startapp);
        abstractC3442e.loadAd("genres");
        this.startapp.purchase(abstractC3442e, vKVideo.adcel);
        abstractC3442e.loadAd("duration");
        AbstractC8647e.subs(vKVideo.mopub, abstractC13345e, abstractC3442e, "direct_url");
        this.adcel.purchase(abstractC3442e, vKVideo.advert);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(VKVideo)";
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x003c. Please report as an issue. */
    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Set set = C3295e.f7451e;
        int i = -1;
        boolean z = false;
        Integer num = null;
        boolean z2 = false;
        Object obj = null;
        Object obj2 = null;
        Long l = null;
        String str = null;
        Integer num2 = null;
        Integer num3 = null;
        List list = null;
        Long l2 = null;
        VKVideoFiles vKVideoFiles = null;
        Object obj3 = null;
        int i2 = 0;
        while (true) {
            if (!abstractC17080e.Signature()) {
                Integer num4 = num;
                boolean z3 = z2;
                abstractC17080e.advert();
                if ((!z) & (num4 == null)) {
                    set = AbstractC0869e.isPro("id", "id", abstractC17080e, set);
                }
                if ((!z3) & (str == null)) {
                    set = AbstractC0869e.isPro("title", "title", abstractC17080e, set);
                }
                if (set.size() != 0) {
                    throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
                }
                Object obj4 = obj;
                if (i == -3841) {
                    return new VKVideo(num4.intValue(), l, str, num2, num3, list, l2, vKVideoFiles, (List) obj4, (List) obj2, i2, (String) obj3);
                }
                Object obj5 = obj2;
                int intValue = num4.intValue();
                List list2 = (List) obj4;
                List list3 = (List) obj5;
                String str2 = (String) obj3;
                if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    list2 = null;
                }
                List list4 = (i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? null : list3;
                if ((i & 1024) != 0) {
                    i2 = 0;
                }
                return new VKVideo(intValue, l, str, num2, num3, list, l2, vKVideoFiles, list2, list4, i2, (i & 2048) != 0 ? null : str2);
            }
            boolean z4 = z;
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            AbstractC13345e abstractC13345e = this.appmetrica;
            Integer num5 = num;
            AbstractC13345e abstractC13345e2 = this.metrica;
            boolean z5 = z2;
            AbstractC13345e abstractC13345e3 = this.vip;
            switch (mo2308extends) {
                case -1:
                    abstractC17080e.mo2305break();
                    abstractC17080e.mo2314implements();
                    z = z4;
                    num = num5;
                    z2 = z5;
                    break;
                case 0:
                    Object vip = abstractC13345e3.vip(abstractC17080e);
                    if (vip == null) {
                        set = AbstractC0869e.subs("id", "id", abstractC17080e, set);
                        z = true;
                        num = num5;
                        z2 = z5;
                        break;
                    } else {
                        num = (Integer) vip;
                        z = z4;
                        z2 = z5;
                    }
                case 1:
                    l = (Long) abstractC13345e2.vip(abstractC17080e);
                    z = z4;
                    num = num5;
                    z2 = z5;
                    break;
                case 2:
                    Object vip2 = this.license.vip(abstractC17080e);
                    if (vip2 != null) {
                        str = (String) vip2;
                        z = z4;
                        num = num5;
                        z2 = z5;
                        break;
                    } else {
                        set = AbstractC0869e.subs("title", "title", abstractC17080e, set);
                        z = z4;
                        z2 = true;
                        num = num5;
                        break;
                    }
                case 3:
                    num2 = (Integer) abstractC13345e.vip(abstractC17080e);
                    z = z4;
                    num = num5;
                    z2 = z5;
                    break;
                case 4:
                    num3 = (Integer) abstractC13345e.vip(abstractC17080e);
                    z = z4;
                    num = num5;
                    z2 = z5;
                    break;
                case 5:
                    list = (List) this.purchase.vip(abstractC17080e);
                    z = z4;
                    num = num5;
                    z2 = z5;
                    break;
                case 6:
                    l2 = (Long) abstractC13345e2.vip(abstractC17080e);
                    z = z4;
                    num = num5;
                    z2 = z5;
                    break;
                case 7:
                    vKVideoFiles = (VKVideoFiles) this.billing.vip(abstractC17080e);
                    z = z4;
                    num = num5;
                    z2 = z5;
                    break;
                case 8:
                    obj = this.yandex.vip(abstractC17080e);
                    i &= -257;
                    z = z4;
                    num = num5;
                    z2 = z5;
                    break;
                case 9:
                    obj2 = this.startapp.vip(abstractC17080e);
                    i &= -513;
                    z = z4;
                    num = num5;
                    z2 = z5;
                    break;
                case 10:
                    Object vip3 = abstractC13345e3.vip(abstractC17080e);
                    if (vip3 == null) {
                        set = AbstractC0869e.subs("duration", "duration", abstractC17080e, set);
                    } else {
                        i2 = ((Number) vip3).intValue();
                    }
                    i &= -1025;
                    z = z4;
                    num = num5;
                    z2 = z5;
                    break;
                case 11:
                    obj3 = this.adcel.vip(abstractC17080e);
                    i &= -2049;
                    z = z4;
                    num = num5;
                    z2 = z5;
                    break;
                default:
                    z = z4;
                    num = num5;
                    z2 = z5;
                    break;
            }
        }
    }
}
