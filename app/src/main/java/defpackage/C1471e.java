package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۦۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1471e implements InterfaceC12067e {
    public static final C1471e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۣٖ, java.lang.Object, eؒۦۢ] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.audio.AudioPlaylistDto", obj, 43);
        c4707e.advert("id", false);
        c4707e.advert("owner_id", false);
        c4707e.advert("type", false);
        c4707e.advert("title", false);
        c4707e.advert("description", false);
        c4707e.advert("count", false);
        c4707e.advert("followers", false);
        c4707e.advert("plays", false);
        c4707e.advert("create_time", false);
        c4707e.advert("update_time", false);
        c4707e.advert("playlist_id", true);
        c4707e.advert("genres", true);
        c4707e.advert("is_following", true);
        c4707e.advert("no_discover", true);
        c4707e.advert("audios", true);
        c4707e.advert("is_curator", true);
        c4707e.advert("year", true);
        c4707e.advert("original", true);
        c4707e.advert("followed", true);
        c4707e.advert("photo", true);
        c4707e.advert("permissions", true);
        c4707e.advert("subtitle_badge", true);
        c4707e.advert("play_button", true);
        c4707e.advert("thumbs", true);
        c4707e.advert("access_key", true);
        c4707e.advert("uma_album_id", true);
        c4707e.advert("subtitle", true);
        c4707e.advert("original_year", true);
        c4707e.advert("is_explicit", true);
        c4707e.advert("artists", true);
        c4707e.advert("main_artists", true);
        c4707e.advert("main_artist", true);
        c4707e.advert("featured_artists", true);
        c4707e.advert("album_type", true);
        c4707e.advert("meta", true);
        c4707e.advert("restriction", true);
        c4707e.advert("track_code", true);
        c4707e.advert("audio_chart_info", true);
        c4707e.advert("match_score", true);
        c4707e.advert("actions", true);
        c4707e.advert("audios_total_file_size", true);
        c4707e.advert("exclusive", true);
        c4707e.advert("icon", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C9885e c9885e = (C9885e) obj;
        Boolean bool = c9885e.subs;
        String str = c9885e.f19485abstract;
        Boolean bool2 = c9885e.f19486break;
        Float f = c9885e.f19492protected;
        List list = c9885e.f19495try;
        Float f2 = c9885e.f19496while;
        C4742e c4742e = c9885e.f19494throw;
        String str2 = c9885e.f19488extends;
        C0448e c0448e = c9885e.f19491native;
        C17575e c17575e = c9885e.f19493this;
        EnumC3616e enumC3616e = c9885e.f19489goto;
        List list2 = c9885e.f19490interface;
        String str3 = c9885e.f19487class;
        List list3 = c9885e.firebase;
        List list4 = c9885e.crashlytics;
        Integer num = c9885e.premium;
        String str4 = c9885e.ads;
        Integer num2 = c9885e.applovin;
        String str5 = c9885e.isPro;
        List list5 = c9885e.inmobi;
        Boolean bool3 = c9885e.isVip;
        Boolean bool4 = c9885e.tapsense;
        C4945e c4945e = c9885e.signatures;
        C18236e c18236e = c9885e.pro;
        C9656e c9656e = c9885e.remoteconfig;
        C9656e c9656e2 = c9885e.subscription;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C9885e.f19484default;
        int i = c9885e.ad;
        Integer num3 = c9885e.admob;
        Boolean bool5 = c9885e.Signature;
        List list6 = c9885e.loadAd;
        Boolean bool6 = c9885e.amazon;
        Boolean bool7 = c9885e.smaato;
        List list7 = c9885e.advert;
        Integer num4 = c9885e.mopub;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.inmobi(0, i, interfaceC9998e);
        abstractC15920e.applovin(interfaceC9998e, 1, C13980e.ad, new C5655e(c9885e.vip));
        abstractC15920e.applovin(interfaceC9998e, 2, (InterfaceC5372e) interfaceC3477eArr[2].getValue(), c9885e.metrica);
        abstractC15920e.ads(interfaceC9998e, 3, c9885e.license);
        abstractC15920e.ads(interfaceC9998e, 4, c9885e.appmetrica);
        abstractC15920e.inmobi(5, c9885e.purchase, interfaceC9998e);
        abstractC15920e.inmobi(6, c9885e.billing, interfaceC9998e);
        abstractC15920e.inmobi(7, c9885e.yandex, interfaceC9998e);
        abstractC15920e.inmobi(8, c9885e.startapp, interfaceC9998e);
        abstractC15920e.inmobi(9, c9885e.adcel, interfaceC9998e);
        if (abstractC15920e.subscription() || num4 != null) {
            abstractC15920e.Signature(interfaceC9998e, 10, C13257e.ad, num4);
        }
        if (abstractC15920e.subscription() || list7 != null) {
            abstractC15920e.Signature(interfaceC9998e, 11, (InterfaceC5372e) interfaceC3477eArr[11].getValue(), list7);
        }
        if (abstractC15920e.subscription() || bool7 != null) {
            abstractC15920e.Signature(interfaceC9998e, 12, C6266e.ad, bool7);
        }
        if (abstractC15920e.subscription() || bool6 != null) {
            abstractC15920e.Signature(interfaceC9998e, 13, C6266e.ad, bool6);
        }
        if (abstractC15920e.subscription() || list6 != null) {
            abstractC15920e.Signature(interfaceC9998e, 14, (InterfaceC5372e) interfaceC3477eArr[14].getValue(), list6);
        }
        if (abstractC15920e.subscription() || bool5 != null) {
            abstractC15920e.Signature(interfaceC9998e, 15, C6266e.ad, bool5);
        }
        if (abstractC15920e.subscription() || num3 != null) {
            abstractC15920e.Signature(interfaceC9998e, 16, C13257e.ad, num3);
        }
        if (abstractC15920e.subscription() || c9656e2 != null) {
            abstractC15920e.Signature(interfaceC9998e, 17, C9491e.ad, c9656e2);
        }
        if (abstractC15920e.subscription() || c9656e != null) {
            abstractC15920e.Signature(interfaceC9998e, 18, C9491e.ad, c9656e);
        }
        if (abstractC15920e.subscription() || c18236e != null) {
            abstractC15920e.Signature(interfaceC9998e, 19, C13144e.ad, c18236e);
        }
        if (abstractC15920e.subscription() || c4945e != null) {
            abstractC15920e.Signature(interfaceC9998e, 20, C7398e.ad, c4945e);
        }
        if (abstractC15920e.subscription() || bool4 != null) {
            abstractC15920e.Signature(interfaceC9998e, 21, C6266e.ad, bool4);
        }
        if (abstractC15920e.subscription() || bool3 != null) {
            abstractC15920e.Signature(interfaceC9998e, 22, C6266e.ad, bool3);
        }
        if (abstractC15920e.subscription() || list5 != null) {
            abstractC15920e.Signature(interfaceC9998e, 23, (InterfaceC5372e) interfaceC3477eArr[23].getValue(), list5);
        }
        if (abstractC15920e.subscription() || str5 != null) {
            abstractC15920e.Signature(interfaceC9998e, 24, C9582e.ad, str5);
        }
        if (abstractC15920e.subscription() || num2 != null) {
            abstractC15920e.Signature(interfaceC9998e, 25, C13257e.ad, num2);
        }
        if (abstractC15920e.subscription() || str4 != null) {
            abstractC15920e.Signature(interfaceC9998e, 26, C9582e.ad, str4);
        }
        if (abstractC15920e.subscription() || num != null) {
            abstractC15920e.Signature(interfaceC9998e, 27, C13257e.ad, num);
        }
        if (abstractC15920e.subscription() || bool != null) {
            abstractC15920e.Signature(interfaceC9998e, 28, C6266e.ad, bool);
        }
        if (abstractC15920e.subscription() || list4 != null) {
            abstractC15920e.Signature(interfaceC9998e, 29, (InterfaceC5372e) interfaceC3477eArr[29].getValue(), list4);
        }
        if (abstractC15920e.subscription() || list3 != null) {
            abstractC15920e.Signature(interfaceC9998e, 30, (InterfaceC5372e) interfaceC3477eArr[30].getValue(), list3);
        }
        if (abstractC15920e.subscription() || str3 != null) {
            abstractC15920e.Signature(interfaceC9998e, 31, C9582e.ad, str3);
        }
        if (abstractC15920e.subscription() || list2 != null) {
            abstractC15920e.Signature(interfaceC9998e, 32, (InterfaceC5372e) interfaceC3477eArr[32].getValue(), list2);
        }
        if (abstractC15920e.subscription() || enumC3616e != null) {
            abstractC15920e.Signature(interfaceC9998e, 33, (InterfaceC5372e) interfaceC3477eArr[33].getValue(), enumC3616e);
        }
        if (abstractC15920e.subscription() || c17575e != null) {
            abstractC15920e.Signature(interfaceC9998e, 34, C17579e.ad, c17575e);
        }
        if (abstractC15920e.subscription() || c0448e != null) {
            abstractC15920e.Signature(interfaceC9998e, 35, C10748e.ad, c0448e);
        }
        if (abstractC15920e.subscription() || str2 != null) {
            abstractC15920e.Signature(interfaceC9998e, 36, C9582e.ad, str2);
        }
        if (abstractC15920e.subscription() || c4742e != null) {
            abstractC15920e.Signature(interfaceC9998e, 37, C11752e.ad, c4742e);
        }
        if (abstractC15920e.subscription() || f2 != null) {
            abstractC15920e.Signature(interfaceC9998e, 38, C13852e.ad, f2);
        }
        if (abstractC15920e.subscription() || list != null) {
            abstractC15920e.Signature(interfaceC9998e, 39, (InterfaceC5372e) interfaceC3477eArr[39].getValue(), list);
        }
        if (abstractC15920e.subscription() || f != null) {
            abstractC15920e.Signature(interfaceC9998e, 40, C13852e.ad, f);
        }
        if (abstractC15920e.subscription() || bool2 != null) {
            abstractC15920e.Signature(interfaceC9998e, 41, C6266e.ad, bool2);
        }
        if (abstractC15920e.subscription() || str != null) {
            abstractC15920e.Signature(interfaceC9998e, 42, C9582e.ad, str);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC3477e[] interfaceC3477eArr = C9885e.f19484default;
        C13257e c13257e = C13257e.ad;
        C9582e c9582e = C9582e.ad;
        C6266e c6266e = C6266e.ad;
        C9491e c9491e = C9491e.ad;
        C13852e c13852e = C13852e.ad;
        return new InterfaceC5372e[]{c13257e, C13980e.ad, interfaceC3477eArr[2].getValue(), c9582e, c9582e, c13257e, c13257e, c13257e, c13257e, c13257e, AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[11].getValue()), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[14].getValue()), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(c9491e), AbstractC6069e.purchase(c9491e), AbstractC6069e.purchase(C13144e.ad), AbstractC6069e.purchase(C7398e.ad), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[23].getValue()), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c13257e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[29].getValue()), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[30].getValue()), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[32].getValue()), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[33].getValue()), AbstractC6069e.purchase(C17579e.ad), AbstractC6069e.purchase(C10748e.ad), AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(C11752e.ad), AbstractC6069e.purchase(c13852e), AbstractC6069e.purchase((InterfaceC5372e) interfaceC3477eArr[39].getValue()), AbstractC6069e.purchase(c13852e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c9582e)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0062. Please report as an issue. */
    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        EnumC3616e enumC3616e;
        String str;
        C5655e c5655e;
        int i;
        List list;
        int i2;
        String str2;
        int i3;
        int i4;
        int i5;
        String str3;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C9885e.f19484default;
        Float f = null;
        EnumC3616e enumC3616e2 = null;
        List list2 = null;
        String str4 = null;
        List list3 = null;
        Float f2 = null;
        Boolean bool = null;
        String str5 = null;
        String str6 = null;
        C4742e c4742e = null;
        C17575e c17575e = null;
        C0448e c0448e = null;
        List list4 = null;
        String str7 = null;
        String str8 = null;
        C5655e c5655e2 = null;
        EnumC4165e enumC4165e = null;
        Integer num = null;
        List list5 = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        List list6 = null;
        Boolean bool4 = null;
        Integer num2 = null;
        C9656e c9656e = null;
        C9656e c9656e2 = null;
        C18236e c18236e = null;
        C4945e c4945e = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        List list7 = null;
        String str9 = null;
        Integer num3 = null;
        String str10 = null;
        Integer num4 = null;
        Boolean bool7 = null;
        List list8 = null;
        int i6 = 0;
        boolean z = true;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (z) {
            List list9 = list4;
            int yandex = metrica.yandex(interfaceC9998e);
            switch (yandex) {
                case -1:
                    enumC3616e = enumC3616e2;
                    str = str4;
                    c5655e = c5655e2;
                    i = i7;
                    list = list2;
                    Unit unit = Unit.INSTANCE;
                    z = false;
                    c5655e2 = c5655e;
                    list4 = list9;
                    i2 = i;
                    str4 = str;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case 0:
                    enumC3616e = enumC3616e2;
                    str = str4;
                    c5655e = c5655e2;
                    int i14 = i7;
                    list = list2;
                    i8 = metrica.remoteconfig(interfaceC9998e, 0);
                    i = i14 | 1;
                    Unit unit2 = Unit.INSTANCE;
                    c5655e2 = c5655e;
                    list4 = list9;
                    i2 = i;
                    str4 = str;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case 1:
                    enumC3616e = enumC3616e2;
                    str = str4;
                    int i15 = i7;
                    list = list2;
                    C5655e c5655e3 = (C5655e) metrica.subscription(interfaceC9998e, 1, C13980e.ad, c5655e2);
                    i = i15 | 2;
                    Unit unit3 = Unit.INSTANCE;
                    c5655e2 = c5655e3;
                    enumC4165e = enumC4165e;
                    list4 = list9;
                    i2 = i;
                    str4 = str;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case 2:
                    enumC3616e = enumC3616e2;
                    str2 = str4;
                    int i16 = i7;
                    list = list2;
                    EnumC4165e enumC4165e2 = (EnumC4165e) metrica.subscription(interfaceC9998e, 2, (InterfaceC5372e) interfaceC3477eArr[2].getValue(), enumC4165e);
                    i3 = i16 | 4;
                    Unit unit4 = Unit.INSTANCE;
                    enumC4165e = enumC4165e2;
                    i2 = i3;
                    list4 = list9;
                    str4 = str2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case 3:
                    enumC3616e = enumC3616e2;
                    str2 = str4;
                    int i17 = i7;
                    list = list2;
                    String smaato = metrica.smaato(interfaceC9998e, 3);
                    i4 = i17 | 8;
                    Unit unit5 = Unit.INSTANCE;
                    str7 = smaato;
                    i2 = i4;
                    list4 = list9;
                    str4 = str2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case 4:
                    enumC3616e = enumC3616e2;
                    str2 = str4;
                    int i18 = i7;
                    list = list2;
                    String smaato2 = metrica.smaato(interfaceC9998e, 4);
                    i4 = i18 | 16;
                    Unit unit6 = Unit.INSTANCE;
                    str8 = smaato2;
                    i2 = i4;
                    list4 = list9;
                    str4 = str2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case 5:
                    enumC3616e = enumC3616e2;
                    str2 = str4;
                    int i19 = i7;
                    list = list2;
                    i9 = metrica.remoteconfig(interfaceC9998e, 5);
                    i5 = i19 | 32;
                    Unit unit7 = Unit.INSTANCE;
                    i2 = i5;
                    list4 = list9;
                    str4 = str2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case 6:
                    enumC3616e = enumC3616e2;
                    str2 = str4;
                    int i20 = i7;
                    list = list2;
                    i10 = metrica.remoteconfig(interfaceC9998e, 6);
                    i5 = i20 | 64;
                    Unit unit72 = Unit.INSTANCE;
                    i2 = i5;
                    list4 = list9;
                    str4 = str2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case 7:
                    enumC3616e = enumC3616e2;
                    str2 = str4;
                    int i21 = i7;
                    list = list2;
                    i11 = metrica.remoteconfig(interfaceC9998e, 7);
                    i5 = i21 | 128;
                    Unit unit722 = Unit.INSTANCE;
                    i2 = i5;
                    list4 = list9;
                    str4 = str2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case 8:
                    enumC3616e = enumC3616e2;
                    str2 = str4;
                    int i22 = i7;
                    list = list2;
                    i12 = metrica.remoteconfig(interfaceC9998e, 8);
                    i5 = i22 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    Unit unit7222 = Unit.INSTANCE;
                    i2 = i5;
                    list4 = list9;
                    str4 = str2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case 9:
                    enumC3616e = enumC3616e2;
                    str2 = str4;
                    int i23 = i7;
                    list = list2;
                    i13 = metrica.remoteconfig(interfaceC9998e, 9);
                    i5 = i23 | AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                    Unit unit72222 = Unit.INSTANCE;
                    i2 = i5;
                    list4 = list9;
                    str4 = str2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case 10:
                    enumC3616e = enumC3616e2;
                    str2 = str4;
                    int i24 = i7;
                    list = list2;
                    Integer num5 = (Integer) metrica.inmobi(interfaceC9998e, 10, C13257e.ad, num);
                    i3 = i24 | 1024;
                    Unit unit8 = Unit.INSTANCE;
                    num = num5;
                    i2 = i3;
                    list4 = list9;
                    str4 = str2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case 11:
                    enumC3616e = enumC3616e2;
                    str2 = str4;
                    int i25 = i7;
                    list = list2;
                    List list10 = (List) metrica.inmobi(interfaceC9998e, 11, (InterfaceC5372e) interfaceC3477eArr[11].getValue(), list5);
                    i3 = i25 | 2048;
                    Unit unit9 = Unit.INSTANCE;
                    list5 = list10;
                    i2 = i3;
                    list4 = list9;
                    str4 = str2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case 12:
                    enumC3616e = enumC3616e2;
                    str2 = str4;
                    int i26 = i7;
                    list = list2;
                    Boolean bool8 = (Boolean) metrica.inmobi(interfaceC9998e, 12, C6266e.ad, bool2);
                    i3 = i26 | 4096;
                    Unit unit10 = Unit.INSTANCE;
                    bool2 = bool8;
                    i2 = i3;
                    list4 = list9;
                    str4 = str2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case 13:
                    enumC3616e = enumC3616e2;
                    str2 = str4;
                    int i27 = i7;
                    list = list2;
                    Boolean bool9 = (Boolean) metrica.inmobi(interfaceC9998e, 13, C6266e.ad, bool3);
                    i3 = i27 | 8192;
                    Unit unit11 = Unit.INSTANCE;
                    bool3 = bool9;
                    i2 = i3;
                    list4 = list9;
                    str4 = str2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case 14:
                    enumC3616e = enumC3616e2;
                    str2 = str4;
                    List list11 = (List) metrica.inmobi(interfaceC9998e, 14, (InterfaceC5372e) interfaceC3477eArr[14].getValue(), list6);
                    i4 = i7 | 16384;
                    Unit unit12 = Unit.INSTANCE;
                    list6 = list11;
                    list = list2;
                    i2 = i4;
                    list4 = list9;
                    str4 = str2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case 15:
                    enumC3616e = enumC3616e2;
                    str2 = str4;
                    Boolean bool10 = (Boolean) metrica.inmobi(interfaceC9998e, 15, C6266e.ad, bool4);
                    i4 = i7 | 32768;
                    Unit unit13 = Unit.INSTANCE;
                    bool4 = bool10;
                    list = list2;
                    i2 = i4;
                    list4 = list9;
                    str4 = str2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case 16:
                    enumC3616e = enumC3616e2;
                    str2 = str4;
                    Integer num6 = (Integer) metrica.inmobi(interfaceC9998e, 16, C13257e.ad, num2);
                    i4 = i7 | 65536;
                    Unit unit14 = Unit.INSTANCE;
                    num2 = num6;
                    list = list2;
                    i2 = i4;
                    list4 = list9;
                    str4 = str2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    enumC3616e = enumC3616e2;
                    str2 = str4;
                    C9656e c9656e3 = (C9656e) metrica.inmobi(interfaceC9998e, 17, C9491e.ad, c9656e);
                    i4 = i7 | 131072;
                    Unit unit15 = Unit.INSTANCE;
                    c9656e = c9656e3;
                    list = list2;
                    i2 = i4;
                    list4 = list9;
                    str4 = str2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    enumC3616e = enumC3616e2;
                    str2 = str4;
                    C9656e c9656e4 = (C9656e) metrica.inmobi(interfaceC9998e, 18, C9491e.ad, c9656e2);
                    i4 = i7 | 262144;
                    Unit unit16 = Unit.INSTANCE;
                    c9656e2 = c9656e4;
                    list = list2;
                    i2 = i4;
                    list4 = list9;
                    str4 = str2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    enumC3616e = enumC3616e2;
                    str2 = str4;
                    C18236e c18236e2 = (C18236e) metrica.inmobi(interfaceC9998e, 19, C13144e.ad, c18236e);
                    i4 = i7 | 524288;
                    Unit unit17 = Unit.INSTANCE;
                    c18236e = c18236e2;
                    list = list2;
                    i2 = i4;
                    list4 = list9;
                    str4 = str2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case 20:
                    enumC3616e = enumC3616e2;
                    str2 = str4;
                    C4945e c4945e2 = (C4945e) metrica.inmobi(interfaceC9998e, 20, C7398e.ad, c4945e);
                    i4 = i7 | 1048576;
                    Unit unit18 = Unit.INSTANCE;
                    c4945e = c4945e2;
                    list = list2;
                    i2 = i4;
                    list4 = list9;
                    str4 = str2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case 21:
                    enumC3616e = enumC3616e2;
                    str2 = str4;
                    Boolean bool11 = (Boolean) metrica.inmobi(interfaceC9998e, 21, C6266e.ad, bool5);
                    i4 = i7 | 2097152;
                    Unit unit19 = Unit.INSTANCE;
                    bool5 = bool11;
                    list = list2;
                    i2 = i4;
                    list4 = list9;
                    str4 = str2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case 22:
                    enumC3616e = enumC3616e2;
                    str2 = str4;
                    Boolean bool12 = (Boolean) metrica.inmobi(interfaceC9998e, 22, C6266e.ad, bool6);
                    i4 = i7 | 4194304;
                    Unit unit20 = Unit.INSTANCE;
                    bool6 = bool12;
                    list = list2;
                    i2 = i4;
                    list4 = list9;
                    str4 = str2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case 23:
                    enumC3616e = enumC3616e2;
                    str2 = str4;
                    List list12 = (List) metrica.inmobi(interfaceC9998e, 23, (InterfaceC5372e) interfaceC3477eArr[23].getValue(), list7);
                    i4 = i7 | 8388608;
                    Unit unit21 = Unit.INSTANCE;
                    list7 = list12;
                    list = list2;
                    i2 = i4;
                    list4 = list9;
                    str4 = str2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    enumC3616e = enumC3616e2;
                    str2 = str4;
                    String str11 = (String) metrica.inmobi(interfaceC9998e, 24, C9582e.ad, str9);
                    i4 = i7 | 16777216;
                    Unit unit22 = Unit.INSTANCE;
                    str9 = str11;
                    list = list2;
                    i2 = i4;
                    list4 = list9;
                    str4 = str2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    enumC3616e = enumC3616e2;
                    str2 = str4;
                    Integer num7 = (Integer) metrica.inmobi(interfaceC9998e, 25, C13257e.ad, num3);
                    i4 = i7 | 33554432;
                    Unit unit23 = Unit.INSTANCE;
                    num3 = num7;
                    list = list2;
                    i2 = i4;
                    list4 = list9;
                    str4 = str2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    enumC3616e = enumC3616e2;
                    str2 = str4;
                    String str12 = (String) metrica.inmobi(interfaceC9998e, 26, C9582e.ad, str10);
                    i4 = i7 | 67108864;
                    Unit unit24 = Unit.INSTANCE;
                    str10 = str12;
                    list = list2;
                    i2 = i4;
                    list4 = list9;
                    str4 = str2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    enumC3616e = enumC3616e2;
                    str2 = str4;
                    Integer num8 = (Integer) metrica.inmobi(interfaceC9998e, 27, C13257e.ad, num4);
                    i4 = i7 | 134217728;
                    Unit unit25 = Unit.INSTANCE;
                    num4 = num8;
                    list = list2;
                    i2 = i4;
                    list4 = list9;
                    str4 = str2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    enumC3616e = enumC3616e2;
                    str2 = str4;
                    Boolean bool13 = (Boolean) metrica.inmobi(interfaceC9998e, 28, C6266e.ad, bool7);
                    i4 = i7 | 268435456;
                    Unit unit26 = Unit.INSTANCE;
                    bool7 = bool13;
                    list = list2;
                    i2 = i4;
                    list4 = list9;
                    str4 = str2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    enumC3616e = enumC3616e2;
                    str2 = str4;
                    List list13 = (List) metrica.inmobi(interfaceC9998e, 29, (InterfaceC5372e) interfaceC3477eArr[29].getValue(), list8);
                    i4 = i7 | 536870912;
                    Unit unit27 = Unit.INSTANCE;
                    list8 = list13;
                    list = list2;
                    i2 = i4;
                    list4 = list9;
                    str4 = str2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case 30:
                    enumC3616e = enumC3616e2;
                    str2 = str4;
                    List list14 = (List) metrica.inmobi(interfaceC9998e, 30, (InterfaceC5372e) interfaceC3477eArr[30].getValue(), list9);
                    int i28 = i7 | 1073741824;
                    Unit unit28 = Unit.INSTANCE;
                    list4 = list14;
                    list = list2;
                    i2 = i28;
                    str4 = str2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case 31:
                    enumC3616e = enumC3616e2;
                    String str13 = (String) metrica.inmobi(interfaceC9998e, 31, C9582e.ad, str4);
                    int i29 = i7 | RecyclerView.UNDEFINED_DURATION;
                    Unit unit29 = Unit.INSTANCE;
                    list = list2;
                    i2 = i29;
                    list4 = list9;
                    str4 = str13;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case 32:
                    str3 = str4;
                    list2 = (List) metrica.inmobi(interfaceC9998e, 32, (InterfaceC5372e) interfaceC3477eArr[32].getValue(), list2);
                    i6 |= 1;
                    Unit unit30 = Unit.INSTANCE;
                    enumC3616e = enumC3616e2;
                    i2 = i7;
                    list4 = list9;
                    str4 = str3;
                    list = list2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    str3 = str4;
                    enumC3616e2 = (EnumC3616e) metrica.inmobi(interfaceC9998e, 33, (InterfaceC5372e) interfaceC3477eArr[33].getValue(), enumC3616e2);
                    i6 |= 2;
                    Unit unit302 = Unit.INSTANCE;
                    enumC3616e = enumC3616e2;
                    i2 = i7;
                    list4 = list9;
                    str4 = str3;
                    list = list2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    str3 = str4;
                    C17575e c17575e2 = (C17575e) metrica.inmobi(interfaceC9998e, 34, C17579e.ad, c17575e);
                    i6 |= 4;
                    Unit unit31 = Unit.INSTANCE;
                    enumC3616e = enumC3616e2;
                    c17575e = c17575e2;
                    i2 = i7;
                    list4 = list9;
                    str4 = str3;
                    list = list2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    str3 = str4;
                    C0448e c0448e2 = (C0448e) metrica.inmobi(interfaceC9998e, 35, C10748e.ad, c0448e);
                    i6 |= 8;
                    Unit unit32 = Unit.INSTANCE;
                    enumC3616e = enumC3616e2;
                    c0448e = c0448e2;
                    i2 = i7;
                    list4 = list9;
                    str4 = str3;
                    list = list2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    str3 = str4;
                    String str14 = (String) metrica.inmobi(interfaceC9998e, 36, C9582e.ad, str6);
                    i6 |= 16;
                    Unit unit33 = Unit.INSTANCE;
                    enumC3616e = enumC3616e2;
                    str6 = str14;
                    i2 = i7;
                    list4 = list9;
                    str4 = str3;
                    list = list2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    str3 = str4;
                    C4742e c4742e2 = (C4742e) metrica.inmobi(interfaceC9998e, 37, C11752e.ad, c4742e);
                    i6 |= 32;
                    Unit unit34 = Unit.INSTANCE;
                    enumC3616e = enumC3616e2;
                    c4742e = c4742e2;
                    i2 = i7;
                    list4 = list9;
                    str4 = str3;
                    list = list2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    str3 = str4;
                    Float f3 = (Float) metrica.inmobi(interfaceC9998e, 38, C13852e.ad, f);
                    i6 |= 64;
                    Unit unit35 = Unit.INSTANCE;
                    enumC3616e = enumC3616e2;
                    f = f3;
                    i2 = i7;
                    list4 = list9;
                    str4 = str3;
                    list = list2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    str3 = str4;
                    List list15 = (List) metrica.inmobi(interfaceC9998e, 39, (InterfaceC5372e) interfaceC3477eArr[39].getValue(), list3);
                    i6 |= 128;
                    Unit unit36 = Unit.INSTANCE;
                    enumC3616e = enumC3616e2;
                    list3 = list15;
                    i2 = i7;
                    list4 = list9;
                    str4 = str3;
                    list = list2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    str3 = str4;
                    Float f4 = (Float) metrica.inmobi(interfaceC9998e, 40, C13852e.ad, f2);
                    i6 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    Unit unit37 = Unit.INSTANCE;
                    enumC3616e = enumC3616e2;
                    f2 = f4;
                    i2 = i7;
                    list4 = list9;
                    str4 = str3;
                    list = list2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    str3 = str4;
                    Boolean bool14 = (Boolean) metrica.inmobi(interfaceC9998e, 41, C6266e.ad, bool);
                    i6 |= AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                    Unit unit38 = Unit.INSTANCE;
                    enumC3616e = enumC3616e2;
                    bool = bool14;
                    i2 = i7;
                    list4 = list9;
                    str4 = str3;
                    list = list2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    str3 = str4;
                    String str15 = (String) metrica.inmobi(interfaceC9998e, 42, C9582e.ad, str5);
                    i6 |= 1024;
                    Unit unit39 = Unit.INSTANCE;
                    enumC3616e = enumC3616e2;
                    str5 = str15;
                    i2 = i7;
                    list4 = list9;
                    str4 = str3;
                    list = list2;
                    list2 = list;
                    enumC3616e2 = enumC3616e;
                    i7 = i2;
                default:
                    throw new C0413e(yandex);
            }
        }
        String str16 = str4;
        List list16 = list4;
        C5655e c5655e4 = c5655e2;
        EnumC4165e enumC4165e3 = enumC4165e;
        int i30 = i7;
        List list17 = list2;
        metrica.vip(interfaceC9998e);
        String str17 = str5;
        return new C9885e(i30, i6, i8, c5655e4, enumC4165e3, str7, str8, i9, i10, i11, i12, i13, num, list5, bool2, bool3, list6, bool4, num2, c9656e, c9656e2, c18236e, c4945e, bool5, bool6, list7, str9, num3, str10, num4, bool7, list8, list16, str16, list17, enumC3616e2, c17575e, c0448e, str6, c4742e, f, list3, f2, bool, str17);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
