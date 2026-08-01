package ua.itaysonlab.vkapi2.objects.newsfeed;

import defpackage.AbstractC1660e;
import defpackage.InterfaceC3919e;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/newsfeed/NewsfeedItem;", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NewsfeedItem {
    public static final String[] subscription = {"recommended_groups", "clips_block", "clips_challenges", "short_video", "tags_suggestions", "ads_easy_promote", "promo_button", "app_widget", "ads", "live_recommended", "inline_user_rec", "user_rec", "friends_recommendations", "friends_recomm"};
    public final Integer Signature;
    public final String ad;
    public final NewsfeedAudios adcel;
    public final transient boolean admob;
    public final NewsfeedPlaylists advert;
    public final List amazon;
    public final String appmetrica;
    public final Long billing;
    public final Integer license;
    public final NewsfeedCaption loadAd;
    public final Integer metrica;
    public final List mopub;
    public final String purchase;
    public final List smaato;
    public final Integer startapp;
    public final String vip;
    public final Catalog2Button yandex;

    public NewsfeedItem(String str, String str2, Integer num, Integer num2, String str3, String str4, Long l, Catalog2Button catalog2Button, Integer num3, NewsfeedAudios newsfeedAudios, List list, NewsfeedPlaylists newsfeedPlaylists, List list2, List list3, NewsfeedCaption newsfeedCaption, Integer num4) {
        this.ad = str;
        this.vip = str2;
        this.metrica = num;
        this.license = num2;
        this.appmetrica = str3;
        this.purchase = str4;
        this.billing = l;
        this.yandex = catalog2Button;
        this.startapp = num3;
        this.adcel = newsfeedAudios;
        this.mopub = list;
        this.advert = newsfeedPlaylists;
        this.smaato = list2;
        this.amazon = list3;
        this.loadAd = newsfeedCaption;
        this.Signature = num4;
        Object obj = str == null ? Boolean.FALSE : str;
        String[] strArr = subscription;
        boolean yandex = AbstractC1660e.yandex(obj, strArr);
        boolean yandex2 = AbstractC1660e.yandex(str2 == null ? Boolean.FALSE : str2, strArr);
        boolean z = true;
        if (!yandex && !yandex2 && ((newsfeedCaption == null || !newsfeedCaption.vip) && (num4 == null || num4.intValue() != 1))) {
            z = false;
        }
        this.admob = z;
    }
}
