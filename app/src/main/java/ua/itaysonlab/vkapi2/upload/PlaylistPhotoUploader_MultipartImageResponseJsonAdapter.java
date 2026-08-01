package ua.itaysonlab.vkapi2.upload;

import defpackage.AbstractC0869e;
import defpackage.AbstractC13345e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC3442e;
import defpackage.C14172e;
import defpackage.C14803e;
import defpackage.C16911e;
import defpackage.C3295e;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlaylistPhotoUploader_MultipartImageResponseJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("hash", "photo");
    public final AbstractC13345e vip;

    public PlaylistPhotoUploader_MultipartImageResponseJsonAdapter(C14172e c14172e) {
        this.vip = c14172e.vip(String.class, C3295e.f7451e, "hash");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        PlaylistPhotoUploader$MultipartImageResponse playlistPhotoUploader$MultipartImageResponse = (PlaylistPhotoUploader$MultipartImageResponse) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("hash");
        String str = playlistPhotoUploader$MultipartImageResponse.ad;
        AbstractC13345e abstractC13345e = this.vip;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("photo");
        abstractC13345e.purchase(abstractC3442e, playlistPhotoUploader$MultipartImageResponse.vip);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(PlaylistPhotoUploader.MultipartImageResponse)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        String str = null;
        boolean z = false;
        boolean z2 = false;
        Set set = C3295e.f7451e;
        String str2 = null;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends != -1) {
                AbstractC13345e abstractC13345e = this.vip;
                if (mo2308extends == 0) {
                    Object vip = abstractC13345e.vip(abstractC17080e);
                    if (vip == null) {
                        set = AbstractC0869e.subs("hash", "hash", abstractC17080e, set);
                        z = true;
                    } else {
                        str = (String) vip;
                    }
                } else if (mo2308extends == 1) {
                    Object vip2 = abstractC13345e.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("photo", "photo", abstractC17080e, set);
                        z2 = true;
                    } else {
                        str2 = (String) vip2;
                    }
                }
            } else {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            }
        }
        abstractC17080e.advert();
        if ((!z) & (str == null)) {
            set = AbstractC0869e.isPro("hash", "hash", abstractC17080e, set);
        }
        if ((str2 == null) & (!z2)) {
            set = AbstractC0869e.isPro("photo", "photo", abstractC17080e, set);
        }
        if (set.size() == 0) {
            return new PlaylistPhotoUploader$MultipartImageResponse(str, str2);
        }
        throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
    }
}
