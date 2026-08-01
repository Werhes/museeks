package defpackage;

import android.app.Activity;
import android.view.KeyEvent;
import android.widget.Toast;
import androidx.car.app.navigation.model.Maneuver;
import io.realm.kotlin.dynamic.DynamicMutableRealmObject;
import java.security.KeyStore;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkx.activity.ShortcutBridgeActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10981e extends C7460e implements Function1 {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ int f21736e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10981e(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f21736e = i4;
    }

    /* JADX WARN: Type inference failed for: r3v15, types: [eٍؚؔ, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer ad;
        EnumC1320e adcel;
        boolean z;
        int i = this.f21736e;
        String str = "CachedPlaylist";
        String str2 = "uid";
        int i2 = 18;
        int i3 = 17;
        int i4 = 8;
        int i5 = 0;
        int i6 = 6;
        Object obj2 = this.f7266e;
        switch (i) {
            case 0:
                ((C16110e) obj2).ad(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            case 1:
                ((C16110e) obj2).ad(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            case 2:
                ((C16110e) obj2).ad(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            case 3:
                C13424e c13424e = (C13424e) obj2;
                InterfaceC5307e interfaceC5307e = c13424e.f26687e;
                int ordinal = ((EnumC4248e) obj).ordinal();
                if (ordinal == 0) {
                    new C6621e(interfaceC5307e).signatures(c13424e.f10582e);
                } else if (ordinal == 1) {
                    String isPro = c13424e.isPro();
                    DecimalFormat decimalFormat = C5575e.ad;
                    C5575e.ad(isPro);
                } else if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new C14803e(10);
                    }
                    new C2160e(c13424e.isPro()).signatures(c13424e.f10582e);
                } else if (interfaceC5307e instanceof C10702e) {
                    C11519e c11519e = C11519e.f23146e;
                    Activity activity = c13424e.f10582e;
                    AudioPlaylist audioPlaylist = ((C10702e) interfaceC5307e).ad;
                    c11519e.getClass();
                    C11519e.vip(activity, "https://" + AbstractC7205e.metrica + "/music/playlist/" + AbstractC13406e.pro(audioPlaylist), audioPlaylist.subs, AbstractC13406e.mopub(audioPlaylist));
                } else if (interfaceC5307e instanceof C5175e) {
                    C11519e c11519e2 = C11519e.f23146e;
                    Activity activity2 = c13424e.f10582e;
                    AudioTrack audioTrack = ((C5175e) interfaceC5307e).ad;
                    c11519e2.getClass();
                    C11519e.vip(activity2, "https://" + AbstractC7205e.metrica + "/audio" + AbstractC6914e.purchase(audioTrack), audioTrack.ad + " - " + audioTrack.license, audioTrack.getLicense());
                } else {
                    if (!(interfaceC5307e instanceof C12721e)) {
                        throw new C14803e(10);
                    }
                    C11519e c11519e3 = C11519e.f23146e;
                    Activity activity3 = c13424e.f10582e;
                    CatalogArtist catalogArtist = ((C12721e) interfaceC5307e).ad;
                    c11519e3.getClass();
                    C11519e.vip(activity3, C11519e.appmetrica(catalogArtist), catalogArtist.ad, catalogArtist.ad());
                }
                c13424e.purchase();
                return Unit.INSTANCE;
            case 4:
                ((C0073e) obj2).billing.subscription((String) obj);
                return Unit.INSTANCE;
            case 5:
                C6621e c6621e = (C6621e) obj2;
                AbstractC16519e.vip((AppActivity) c6621e.f10582e, new C7602e(c6621e, (C16655e) obj, null, i6));
                return Unit.INSTANCE;
            case 6:
                ShortcutBridgeActivity shortcutBridgeActivity = (ShortcutBridgeActivity) obj2;
                int i7 = ShortcutBridgeActivity.f36550e;
                shortcutBridgeActivity.getClass();
                ((Throwable) obj).printStackTrace();
                Toast.makeText(shortcutBridgeActivity, R.string.shortcut_load_err, 1).show();
                return Unit.INSTANCE;
            case 7:
                ((C10797e) obj2).f21407e.advert((String) obj);
                return Unit.INSTANCE;
            case 8:
                ((C10797e) obj2).f21407e.advert((String) obj);
                return Unit.INSTANCE;
            case 9:
                long j = ((C2152e) obj).ad;
                C8050e c8050e = (C8050e) obj2;
                c8050e.getClass();
                InterfaceC16180e interfaceC16180e = (InterfaceC16180e) AbstractC10432e.vip(c8050e, AbstractC2844e.ad);
                if (interfaceC16180e != null) {
                    AbstractC5336e.purchase(c8050e.m3623e(), null, 0, new C5840e(c8050e, j, interfaceC16180e, new C15091e(c8050e, j), (InterfaceC5083e) null), 3);
                }
                return Unit.INSTANCE;
            case 10:
                ((C0765e) obj2).vip.ad((Function1) obj);
                return Unit.INSTANCE;
            case 11:
                KeyEvent keyEvent = ((C15301e) obj).ad;
                C11873e c11873e = (C11873e) obj2;
                C13823e c13823e = c11873e.purchase;
                boolean z2 = c11873e.license;
                C6155e c6155e = (AbstractC2835e.vip(keyEvent) && (ad = c11873e.startapp.ad(keyEvent)) != null) ? new C6155e(new StringBuilder().appendCodePoint(ad.intValue()).toString(), 1) : null;
                if (c6155e != null) {
                    if (z2) {
                        c11873e.ad(Collections.singletonList(c6155e));
                        c13823e.ad = null;
                        z = true;
                    }
                    z = false;
                } else {
                    if (AbstractC9835e.adcel(keyEvent) == 2 && (adcel = c11873e.adcel.adcel(keyEvent)) != null && (!adcel.f4098e || z2)) {
                        ?? obj3 = new Object();
                        obj3.f18534e = true;
                        C9675e c9675e = new C9675e(i4, adcel, c11873e, obj3);
                        C0398e c0398e = c11873e.metrica;
                        C6942e c6942e = new C6942e(c0398e, c11873e.billing, c11873e.ad.license(), c13823e);
                        c9675e.invoke(c6942e);
                        boolean metrica = C12347e.metrica(c6942e.purchase, c0398e.vip);
                        C10566e c10566e = c6942e.billing;
                        if (!metrica || !AbstractC7890e.billing(c10566e, c0398e.ad)) {
                            c11873e.mopub.invoke(C0398e.ad(c0398e, c10566e, c6942e.purchase, 4));
                        }
                        C3457e c3457e = c11873e.yandex;
                        if (c3457e != null) {
                            c3457e.appmetrica = true;
                        }
                        z = obj3.f18534e;
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 12:
                return ((KeyStore) obj2).getCertificate((String) obj);
            case 13:
                return ((AbstractC11062e) obj2).mo1917goto((C10675e) obj);
            case 14:
                ((C10366e) obj2).ad((C11973e) obj);
                return Unit.INSTANCE;
            case 15:
                ((C10366e) obj2).ad((C11973e) obj);
                return Unit.INSTANCE;
            case 16:
                C15506e c15506e = (C15506e) obj;
                ((C13759e) obj2).getClass();
                C7222e c7222e = c15506e.ad;
                C7222e c7222e2 = c15506e.vip;
                ArrayList arrayList = new ArrayList();
                c15506e.ad("CachedAlbum", new C15709e(arrayList, c7222e2, c7222e));
                String str3 = "CachedTrack";
                c15506e.ad("CachedTrack", new C17706e(14));
                c15506e.ad("CachedArtist", new C17706e(15));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    InterfaceC16120e interfaceC16120e = (InterfaceC16120e) it.next();
                    C12232e c12232e = AbstractC3820e.ad;
                    Class<Long> cls = Long.class;
                    int i8 = i4;
                    long longValue = ((Number) interfaceC16120e.admob(c12232e.vip(cls), "id")).longValue();
                    long longValue2 = ((Number) interfaceC16120e.admob(c12232e.vip(cls), "ownerId")).longValue();
                    String str4 = (String) interfaceC16120e.ads(c12232e.vip(String.class), "title");
                    if (str4 == null) {
                        str4 = BuildConfig.FLAVOR;
                    }
                    int i9 = i5;
                    InterfaceC17101e Signature = interfaceC16120e.Signature("audios");
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<E> it2 = Signature.iterator();
                    while (it2.hasNext()) {
                        Iterator it3 = it;
                        String str5 = str;
                        String str6 = (String) ((InterfaceC16120e) it2.next()).ads(AbstractC3820e.ad.vip(String.class), str2);
                        if (str6 != null) {
                            arrayList2.add(str6);
                        }
                        str = str5;
                        it = it3;
                    }
                    Iterator it4 = it;
                    String str7 = str;
                    Object[] objArr = new Object[1];
                    objArr[i9] = arrayList2;
                    C0661e metrica2 = AbstractC15365e.metrica(c7222e2.m2267e(str3, "uid IN $0", objArr).metrica());
                    InterfaceC16120e startapp = interfaceC16120e.startapp("photo");
                    C16740e ad2 = startapp != null ? C13759e.ad(startapp) : null;
                    DynamicMutableRealmObject.Companion companion = DynamicMutableRealmObject.INSTANCE;
                    String str8 = str3;
                    StringBuilder sb = new StringBuilder();
                    sb.append(longValue2);
                    sb.append('_');
                    sb.append(longValue);
                    C6571e c6571e = new C6571e(str2, sb.toString());
                    C6571e c6571e2 = new C6571e("id", Long.valueOf(longValue));
                    String str9 = str2;
                    C6571e c6571e3 = new C6571e("ownerId", Long.valueOf(longValue2));
                    C12232e c12232e2 = AbstractC3820e.ad;
                    C6571e c6571e4 = new C6571e("origOwnerId", interfaceC16120e.admob(c12232e2.vip(cls), "origOwnerId"));
                    C6571e c6571e5 = new C6571e("origPlaylistId", interfaceC16120e.admob(c12232e2.vip(cls), "origPlaylistOwnerId"));
                    C6571e c6571e6 = new C6571e("folOwnerId", interfaceC16120e.admob(c12232e2.vip(cls), "folOwnerId"));
                    C6571e c6571e7 = new C6571e("folPlaylistId", interfaceC16120e.admob(c12232e2.vip(cls), "folPlaylistId"));
                    C6571e c6571e8 = new C6571e("type", interfaceC16120e.admob(c12232e2.vip(cls), "type"));
                    C6571e c6571e9 = new C6571e("count", interfaceC16120e.admob(c12232e2.vip(cls), "count"));
                    C6571e c6571e10 = new C6571e("followers", interfaceC16120e.admob(c12232e2.vip(cls), "followers"));
                    C6571e c6571e11 = new C6571e("plays", interfaceC16120e.admob(c12232e2.vip(cls), "plays"));
                    C6571e c6571e12 = new C6571e("year", interfaceC16120e.admob(c12232e2.vip(cls), "year"));
                    C6571e c6571e13 = new C6571e("accessKey", interfaceC16120e.ads(c12232e2.vip(String.class), "accessKey"));
                    C6571e c6571e14 = new C6571e("origAccessKey", interfaceC16120e.ads(c12232e2.vip(String.class), "origAccessKey"));
                    C6571e c6571e15 = new C6571e("title", str4);
                    C6571e c6571e16 = new C6571e("localizedSearchTitle", str4.toLowerCase(Locale.ROOT));
                    C6571e c6571e17 = new C6571e("ownerTitle", interfaceC16120e.ads(c12232e2.vip(String.class), "ownerTitle"));
                    C6571e c6571e18 = new C6571e("subtitle", interfaceC16120e.ads(c12232e2.vip(String.class), "subtitle"));
                    String str10 = (String) interfaceC16120e.ads(c12232e2.vip(String.class), "albumType");
                    if (str10 == null) {
                        str10 = "playlist";
                    }
                    C6571e c6571e19 = new C6571e("albumType", str10);
                    C6571e c6571e20 = new C6571e("description", interfaceC16120e.ads(c12232e2.vip(String.class), "description"));
                    C6571e c6571e21 = new C6571e("createTime", interfaceC16120e.admob(c12232e2.vip(cls), "createTime"));
                    C6571e c6571e22 = new C6571e("updateTime", interfaceC16120e.admob(c12232e2.vip(cls), "updateTime"));
                    C6571e c6571e23 = new C6571e("isExplicit", interfaceC16120e.admob(c12232e2.vip(Boolean.class), "isExplicit"));
                    C6571e c6571e24 = new C6571e("isFollowing", interfaceC16120e.admob(c12232e2.vip(Boolean.class), "isFollowing"));
                    Boolean bool = Boolean.TRUE;
                    C6571e c6571e25 = new C6571e("isAvailableOffline", bool);
                    C6571e c6571e26 = new C6571e("isLegacyCachedArtwork", bool);
                    C6571e c6571e27 = new C6571e("audios", metrica2);
                    InterfaceC17101e Signature2 = interfaceC16120e.Signature("thumbs");
                    C0661e license = AbstractC8116e.license(new Object[i9]);
                    Iterator<E> it5 = Signature2.iterator();
                    while (it5.hasNext()) {
                        license.add(C13759e.ad((InterfaceC16120e) it5.next()));
                    }
                    C6571e c6571e28 = new C6571e("thumbs", license);
                    InterfaceC17101e Signature3 = interfaceC16120e.Signature("genres");
                    C0661e license2 = AbstractC8116e.license(new Object[0]);
                    Iterator it6 = Signature3.iterator();
                    while (it6.hasNext()) {
                        C6571e c6571e29 = c6571e28;
                        InterfaceC16120e interfaceC16120e2 = (InterfaceC16120e) it6.next();
                        DynamicMutableRealmObject.Companion companion2 = DynamicMutableRealmObject.INSTANCE;
                        Iterator it7 = it6;
                        C12232e c12232e3 = AbstractC3820e.ad;
                        C6571e c6571e30 = c6571e24;
                        Class<Long> cls2 = cls;
                        C6571e c6571e31 = new C6571e("id", interfaceC16120e2.admob(c12232e3.vip(cls), "id"));
                        String str11 = (String) interfaceC16120e2.ads(c12232e3.vip(String.class), "name");
                        if (str11 == null) {
                            str11 = BuildConfig.FLAVOR;
                        }
                        Map purchase = AbstractC10064e.purchase(c6571e31, new C6571e("name", str11));
                        companion2.getClass();
                        license2.add(new C16740e("CachedVkGenre", purchase));
                        c6571e28 = c6571e29;
                        it6 = it7;
                        c6571e24 = c6571e30;
                        cls = cls2;
                    }
                    C6571e c6571e32 = c6571e28;
                    C6571e c6571e33 = c6571e24;
                    C6571e c6571e34 = new C6571e("genres", license2);
                    InterfaceC17101e Signature4 = interfaceC16120e.Signature("mainArtists");
                    C0661e license3 = AbstractC8116e.license(new Object[0]);
                    Iterator<E> it8 = Signature4.iterator();
                    while (it8.hasNext()) {
                        license3.add(c7222e2.m2268e((InterfaceC16120e) it8.next()));
                    }
                    C6571e c6571e35 = new C6571e("mainArtists", license3);
                    C6571e c6571e36 = new C6571e("photo", ad2);
                    C6571e[] c6571eArr = new C6571e[31];
                    c6571eArr[0] = c6571e;
                    c6571eArr[1] = c6571e2;
                    c6571eArr[2] = c6571e3;
                    c6571eArr[3] = c6571e4;
                    c6571eArr[4] = c6571e5;
                    c6571eArr[5] = c6571e6;
                    c6571eArr[6] = c6571e7;
                    c6571eArr[7] = c6571e8;
                    c6571eArr[i8] = c6571e9;
                    c6571eArr[9] = c6571e10;
                    c6571eArr[10] = c6571e11;
                    c6571eArr[11] = c6571e12;
                    c6571eArr[12] = c6571e13;
                    c6571eArr[13] = c6571e14;
                    c6571eArr[14] = c6571e15;
                    c6571eArr[15] = c6571e16;
                    c6571eArr[16] = c6571e17;
                    c6571eArr[17] = c6571e18;
                    c6571eArr[18] = c6571e19;
                    c6571eArr[19] = c6571e20;
                    c6571eArr[20] = c6571e21;
                    c6571eArr[21] = c6571e22;
                    c6571eArr[22] = c6571e23;
                    c6571eArr[23] = c6571e33;
                    c6571eArr[24] = c6571e25;
                    c6571eArr[25] = c6571e26;
                    c6571eArr[26] = c6571e27;
                    c6571eArr[27] = c6571e32;
                    c6571eArr[28] = c6571e34;
                    c6571eArr[29] = c6571e35;
                    c6571eArr[30] = c6571e36;
                    Map purchase2 = AbstractC10064e.purchase(c6571eArr);
                    companion.getClass();
                    str = str7;
                    i4 = i8;
                    str2 = str9;
                    it = it4;
                    str3 = str8;
                    i5 = 0;
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C10818e) obj2).getClass();
                C7222e c7222e3 = ((C15506e) obj).vip;
                DynamicMutableRealmObject.Companion companion3 = DynamicMutableRealmObject.INSTANCE;
                C6571e c6571e37 = new C6571e("uid", 1L);
                C1649e metrica3 = c7222e3.m2267e("CachedPlaylist", "TRUEPREDICATE", new Object[0]).vip("uid", new String[0]).metrica();
                ArrayList arrayList3 = new ArrayList();
                Iterator it9 = metrica3.iterator();
                while (it9.hasNext()) {
                    Object next = it9.next();
                    if (!AbstractC6507e.amazon((String) ((DynamicMutableRealmObject) next).admob(AbstractC3820e.ad.vip(String.class), "uid"), "_-1337", false)) {
                        arrayList3.add(next);
                    }
                }
                Map purchase3 = AbstractC10064e.purchase(c6571e37, new C6571e("playlists", AbstractC15365e.metrica(AbstractC13480e.m3607transient(arrayList3))));
                companion3.getClass();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C2243e) obj2).license.ad(new C14772e(i2, new C1772e((C5869e) obj)), new C17084e(9));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((C2243e) obj2).license.ad(new C14772e(i3, new C2095e((String) obj)), new C17084e(8));
                return Unit.INSTANCE;
            case 20:
                ((C2243e) obj2).license.ad(new C14772e(i2, new C1772e((C5869e) obj)), new C17084e(9));
                return Unit.INSTANCE;
            default:
                ((C2243e) obj2).license.ad(new C14772e(i3, new C2095e((String) obj)), new C17084e(8));
                return Unit.INSTANCE;
        }
    }
}
