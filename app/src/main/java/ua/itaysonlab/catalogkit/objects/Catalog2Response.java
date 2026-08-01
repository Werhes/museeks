package ua.itaysonlab.catalogkit.objects;

import defpackage.AbstractC0746e;
import defpackage.AbstractC10064e;
import defpackage.AbstractC1815e;
import defpackage.InterfaceC3919e;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/Catalog2Response;", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Catalog2Response {
    public final List Signature;
    public final Catalog2Root ad;
    public final List adcel;
    public final List admob;
    public final List ads;
    public final List advert;
    public final List amazon;
    public final List applovin;
    public final List appmetrica;
    public final List billing;
    public final List inmobi;
    public final List isPro;
    public final List isVip;
    public final Catalog2Replacements license;
    public final List loadAd;
    public final Catalog2Block metrica;
    public final List mopub;
    public final List premium;
    public final List pro;
    public final List purchase;
    public final List remoteconfig;
    public final List signatures;
    public final List smaato;
    public final List startapp;
    public final List subs;
    public final List subscription;
    public final List tapsense;
    public final Catalog2Section vip;
    public final List yandex;

    public Catalog2Response(Catalog2Root catalog2Root, Catalog2Section catalog2Section, Catalog2Block catalog2Block, Catalog2Replacements catalog2Replacements, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, List list22, List list23, List list24, List list25) {
        this.ad = catalog2Root;
        this.vip = catalog2Section;
        this.metrica = catalog2Block;
        this.license = catalog2Replacements;
        this.appmetrica = list;
        this.purchase = list2;
        this.billing = list3;
        this.yandex = list4;
        this.startapp = list5;
        this.adcel = list6;
        this.mopub = list7;
        this.advert = list8;
        this.smaato = list9;
        this.amazon = list10;
        this.loadAd = list11;
        this.Signature = list12;
        this.admob = list13;
        this.subscription = list14;
        this.remoteconfig = list15;
        this.pro = list16;
        this.signatures = list17;
        this.tapsense = list18;
        this.isVip = list19;
        this.inmobi = list20;
        this.isPro = list21;
        this.applovin = list22;
        this.ads = list23;
        this.premium = list24;
        this.subs = list25;
    }

    public /* synthetic */ Catalog2Response(Catalog2Root catalog2Root, Catalog2Section catalog2Section, Catalog2Block catalog2Block, Catalog2Replacements catalog2Replacements, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, List list22, List list23, List list24, List list25, int i) {
        this((i & 1) != 0 ? null : catalog2Root, (i & 2) != 0 ? null : catalog2Section, (i & 4) != 0 ? null : catalog2Block, (i & 8) != 0 ? null : catalog2Replacements, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : list3, (i & 128) != 0 ? null : list4, (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : list5, (i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? null : list6, (i & 1024) != 0 ? null : list7, (i & 2048) != 0 ? null : list8, (i & 4096) != 0 ? null : list9, (i & 8192) != 0 ? null : list10, (i & 16384) != 0 ? null : list11, (i & 32768) != 0 ? null : list12, (i & 65536) != 0 ? null : list13, (i & 131072) != 0 ? null : list14, (i & 262144) != 0 ? null : list15, (i & 524288) != 0 ? null : list16, (i & 1048576) != 0 ? null : list17, (i & 2097152) != 0 ? null : list18, (i & 4194304) != 0 ? null : list19, (i & 8388608) != 0 ? null : list20, (i & 16777216) != 0 ? null : list21, (i & 33554432) != 0 ? null : list22, (i & 67108864) != 0 ? null : list23, (i & 134217728) != 0 ? null : list24, (i & 268435456) != 0 ? null : list25);
    }

    public final LinkedHashMap ad() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List list = this.appmetrica;
        if (list != null) {
            int appmetrica = AbstractC10064e.appmetrica(AbstractC0746e.subscription(list, 10));
            if (appmetrica < 16) {
                appmetrica = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(appmetrica);
            for (Object obj : list) {
                linkedHashMap2.put(String.valueOf(((VKProfile) obj).ad), obj);
            }
            linkedHashMap.putAll(linkedHashMap2);
        }
        List list2 = this.purchase;
        if (list2 != null) {
            int appmetrica2 = AbstractC10064e.appmetrica(AbstractC0746e.subscription(list2, 10));
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(appmetrica2 >= 16 ? appmetrica2 : 16);
            for (Object obj2 : list2) {
                linkedHashMap3.put(String.valueOf(-((VKProfile) obj2).ad), obj2);
            }
            linkedHashMap.putAll(linkedHashMap3);
        }
        return linkedHashMap;
    }
}
