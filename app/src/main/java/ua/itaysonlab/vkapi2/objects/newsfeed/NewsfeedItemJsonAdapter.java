package ua.itaysonlab.vkapi2.objects.newsfeed;

import defpackage.AbstractC13345e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC18453e;
import defpackage.AbstractC3442e;
import defpackage.C14172e;
import defpackage.C16911e;
import defpackage.C3295e;
import java.util.List;
import kotlin.Metadata;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NewsfeedItemJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("type", "post_type", "source_id", "from_id", "title", "text", "date", "button", "post_id", "audio", "audios", "audio_playlist", "copy_history", "attachments", "caption", "marked_as_ads");
    public final AbstractC13345e adcel;
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e billing;
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e mopub;
    public final AbstractC13345e purchase;
    public final AbstractC13345e startapp;
    public final AbstractC13345e vip;
    public final AbstractC13345e yandex;

    public NewsfeedItemJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(String.class, c3295e, "type");
        this.metrica = c14172e.vip(Integer.class, c3295e, "source_id");
        this.license = c14172e.vip(Long.class, c3295e, "date");
        this.appmetrica = c14172e.vip(Catalog2Button.class, c3295e, "button");
        this.purchase = c14172e.vip(NewsfeedAudios.class, c3295e, "audio");
        this.billing = c14172e.vip(AbstractC18453e.purchase(List.class, AudioTrack.class), c3295e, "audios");
        this.yandex = c14172e.vip(NewsfeedPlaylists.class, c3295e, "audio_playlist");
        this.startapp = c14172e.vip(AbstractC18453e.purchase(List.class, NewsfeedItem.class), c3295e, "copy_history");
        this.adcel = c14172e.vip(AbstractC18453e.purchase(List.class, NewsfeedAttachment.class), c3295e, "attachments");
        this.mopub = c14172e.vip(NewsfeedCaption.class, c3295e, "caption");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        NewsfeedItem newsfeedItem = (NewsfeedItem) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("type");
        String str = newsfeedItem.ad;
        AbstractC13345e abstractC13345e = this.vip;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("post_type");
        abstractC13345e.purchase(abstractC3442e, newsfeedItem.vip);
        abstractC3442e.loadAd("source_id");
        Integer num = newsfeedItem.metrica;
        AbstractC13345e abstractC13345e2 = this.metrica;
        abstractC13345e2.purchase(abstractC3442e, num);
        abstractC3442e.loadAd("from_id");
        abstractC13345e2.purchase(abstractC3442e, newsfeedItem.license);
        abstractC3442e.loadAd("title");
        abstractC13345e.purchase(abstractC3442e, newsfeedItem.appmetrica);
        abstractC3442e.loadAd("text");
        abstractC13345e.purchase(abstractC3442e, newsfeedItem.purchase);
        abstractC3442e.loadAd("date");
        this.license.purchase(abstractC3442e, newsfeedItem.billing);
        abstractC3442e.loadAd("button");
        this.appmetrica.purchase(abstractC3442e, newsfeedItem.yandex);
        abstractC3442e.loadAd("post_id");
        abstractC13345e2.purchase(abstractC3442e, newsfeedItem.startapp);
        abstractC3442e.loadAd("audio");
        this.purchase.purchase(abstractC3442e, newsfeedItem.adcel);
        abstractC3442e.loadAd("audios");
        this.billing.purchase(abstractC3442e, newsfeedItem.mopub);
        abstractC3442e.loadAd("audio_playlist");
        this.yandex.purchase(abstractC3442e, newsfeedItem.advert);
        abstractC3442e.loadAd("copy_history");
        this.startapp.purchase(abstractC3442e, newsfeedItem.smaato);
        abstractC3442e.loadAd("attachments");
        this.adcel.purchase(abstractC3442e, newsfeedItem.amazon);
        abstractC3442e.loadAd("caption");
        this.mopub.purchase(abstractC3442e, newsfeedItem.loadAd);
        abstractC3442e.loadAd("marked_as_ads");
        abstractC13345e2.purchase(abstractC3442e, newsfeedItem.Signature);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(NewsfeedItem)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        String str = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        String str3 = null;
        String str4 = null;
        Long l = null;
        Catalog2Button catalog2Button = null;
        Integer num3 = null;
        NewsfeedAudios newsfeedAudios = null;
        List list = null;
        NewsfeedPlaylists newsfeedPlaylists = null;
        List list2 = null;
        List list3 = null;
        NewsfeedCaption newsfeedCaption = null;
        Integer num4 = null;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            AbstractC13345e abstractC13345e = this.vip;
            AbstractC13345e abstractC13345e2 = this.metrica;
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
                    num = (Integer) abstractC13345e2.vip(abstractC17080e);
                    break;
                case 3:
                    num2 = (Integer) abstractC13345e2.vip(abstractC17080e);
                    break;
                case 4:
                    str3 = (String) abstractC13345e.vip(abstractC17080e);
                    break;
                case 5:
                    str4 = (String) abstractC13345e.vip(abstractC17080e);
                    break;
                case 6:
                    l = (Long) this.license.vip(abstractC17080e);
                    break;
                case 7:
                    catalog2Button = (Catalog2Button) this.appmetrica.vip(abstractC17080e);
                    break;
                case 8:
                    num3 = (Integer) abstractC13345e2.vip(abstractC17080e);
                    break;
                case 9:
                    newsfeedAudios = (NewsfeedAudios) this.purchase.vip(abstractC17080e);
                    break;
                case 10:
                    list = (List) this.billing.vip(abstractC17080e);
                    break;
                case 11:
                    newsfeedPlaylists = (NewsfeedPlaylists) this.yandex.vip(abstractC17080e);
                    break;
                case 12:
                    list2 = (List) this.startapp.vip(abstractC17080e);
                    break;
                case 13:
                    list3 = (List) this.adcel.vip(abstractC17080e);
                    break;
                case 14:
                    newsfeedCaption = (NewsfeedCaption) this.mopub.vip(abstractC17080e);
                    break;
                case 15:
                    num4 = (Integer) abstractC13345e2.vip(abstractC17080e);
                    break;
            }
        }
        abstractC17080e.advert();
        return new NewsfeedItem(str, str2, num, num2, str3, str4, l, catalog2Button, num3, newsfeedAudios, list, newsfeedPlaylists, list2, list3, newsfeedCaption, num4);
    }
}
