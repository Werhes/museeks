package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import io.realm.kotlin.dynamic.DynamicMutableRealmObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّ٘ٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17706e implements Function2 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f34707e;

    public /* synthetic */ C17706e(int i) {
        this.f34707e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j;
        String str;
        int i = this.f34707e;
        String str2 = BuildConfig.FLAVOR;
        switch (i) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC13328e.amazon.invoke(c13770e, 0);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                int i2 = NextDockView.f36758e;
                return Unit.INSTANCE;
            case 2:
                int intValue2 = ((Integer) obj).intValue();
                if (((InterfaceC15276e) obj2) instanceof C4289e) {
                    intValue2++;
                }
                return Integer.valueOf(intValue2);
            case 3:
                C5678e c5678e = (C5678e) obj;
                InterfaceC15276e interfaceC15276e = (InterfaceC15276e) obj2;
                return ((interfaceC15276e instanceof C12005e) || (interfaceC15276e instanceof C8851e) || (interfaceC15276e instanceof C13917e) || (interfaceC15276e instanceof C0522e)) ? new C5678e(c5678e.ad.purchase(interfaceC15276e), c5678e.vip) : new C5678e(c5678e.ad, c5678e.vip.purchase(interfaceC15276e));
            case 4:
                C10215e.license(((C10675e) obj).f21024e.remoteconfig(), true).f21024e.remoteconfig();
                return new C2771e();
            case 5:
                ((Integer) obj).getClass();
                return ((InterfaceC4111e) obj2).getId();
            case 6:
                return Integer.valueOf(((InterfaceC16719e) obj).mo2529while(((Integer) obj2).intValue()));
            case 7:
                return Integer.valueOf(((InterfaceC16719e) obj).loadAd(((Integer) obj2).intValue()));
            case 8:
                return Integer.valueOf(((InterfaceC16719e) obj).metrica(((Integer) obj2).intValue()));
            case 9:
                return Integer.valueOf(((InterfaceC16719e) obj).smaato(((Integer) obj2).intValue()));
            case 10:
                return Unit.INSTANCE;
            case 11:
                return (Float) ((C11200e) obj2).ad.license();
            case 12:
                return ((InterfaceC17098e) obj2).vip();
            case 13:
                C12783e c12783e = (C12783e) obj;
                InterfaceC17098e interfaceC17098e = (InterfaceC17098e) obj2;
                return interfaceC17098e instanceof C9604e ? ((C9604e) interfaceC17098e).metrica(c12783e) : interfaceC17098e.ad().metrica(c12783e);
            case 14:
                InterfaceC16120e interfaceC16120e = (InterfaceC16120e) obj;
                DynamicMutableRealmObject dynamicMutableRealmObject = (DynamicMutableRealmObject) obj2;
                if (dynamicMutableRealmObject != null) {
                    C12232e c12232e = AbstractC3820e.ad;
                    long longValue = ((Number) interfaceC16120e.admob(c12232e.vip(Long.class), "id")).longValue();
                    long longValue2 = ((Number) interfaceC16120e.admob(c12232e.vip(Long.class), "ownerId")).longValue();
                    StringBuilder sb = new StringBuilder();
                    sb.append(longValue2);
                    sb.append('_');
                    sb.append(longValue);
                    String sb2 = sb.toString();
                    String str3 = (String) interfaceC16120e.ads(c12232e.vip(String.class), "title");
                    if (str3 == null) {
                        str3 = BuildConfig.FLAVOR;
                    }
                    String str4 = (String) interfaceC16120e.ads(c12232e.vip(String.class), "artist");
                    if (str4 == null) {
                        str4 = BuildConfig.FLAVOR;
                    }
                    InterfaceC16120e startapp = interfaceC16120e.startapp("album");
                    if (startapp != null) {
                        j = longValue2;
                        long longValue3 = ((Number) startapp.admob(c12232e.vip(Long.class), "id")).longValue();
                        long longValue4 = ((Number) startapp.admob(c12232e.vip(Long.class), "ownerId")).longValue();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(longValue4);
                        sb3.append('_');
                        sb3.append(longValue3);
                        str = sb3.toString();
                    } else {
                        j = longValue2;
                        str = null;
                    }
                    String str5 = str == null ? BuildConfig.FLAVOR : str;
                    dynamicMutableRealmObject.smaato(sb2, "uid");
                    dynamicMutableRealmObject.smaato(Long.valueOf(longValue), "id");
                    dynamicMutableRealmObject.smaato(Long.valueOf(j), "ownerId");
                    dynamicMutableRealmObject.smaato(interfaceC16120e.ads(c12232e.vip(String.class), "accessKey"), "accessKey");
                    dynamicMutableRealmObject.smaato(str3, "title");
                    Locale locale = Locale.ROOT;
                    dynamicMutableRealmObject.smaato(str3.toLowerCase(locale), "localizedSearchTitle");
                    dynamicMutableRealmObject.smaato(str4, "artist");
                    dynamicMutableRealmObject.smaato(str4.toLowerCase(locale), "localizedSearchArtist");
                    dynamicMutableRealmObject.smaato(str5, "albumFullId");
                    Boolean bool = Boolean.TRUE;
                    dynamicMutableRealmObject.smaato(bool, "isAvailableOffline");
                    dynamicMutableRealmObject.smaato(bool, "isLegacyCachedArtwork");
                    dynamicMutableRealmObject.smaato(bool, "isCachedAsMP3");
                    dynamicMutableRealmObject.smaato(Boolean.FALSE, "isArtworkSeparateFromAlbum");
                }
                return Unit.INSTANCE;
            case 15:
                InterfaceC16120e interfaceC16120e2 = (InterfaceC16120e) obj;
                DynamicMutableRealmObject dynamicMutableRealmObject2 = (DynamicMutableRealmObject) obj2;
                if (dynamicMutableRealmObject2 != null) {
                    String str6 = (String) interfaceC16120e2.ads(AbstractC3820e.ad.vip(String.class), "name");
                    if (str6 != null) {
                        str2 = str6;
                    }
                    dynamicMutableRealmObject2.smaato(str2, "name");
                }
                return Unit.INSTANCE;
            case 16:
                ((C0775e) obj).metrica = (InterfaceC7189e) obj2;
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C0775e) obj).appmetrica = ((C13692e) obj2).ad;
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C0775e) obj).license = ((C2782e) obj2).ad;
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 20:
                C10304e c10304e = (C10304e) obj2;
                Map map = c10304e.f20356e;
                C0583e c0583e = c10304e.f20354e;
                Object[] objArr = c0583e.vip;
                Object[] objArr2 = c0583e.metrica;
                long[] jArr = c0583e.ad;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    int i6 = (i3 << 3) + i5;
                                    Object obj3 = objArr[i6];
                                    Map license = ((InterfaceC5039e) objArr2[i6]).license();
                                    if (license.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, license);
                                    }
                                }
                                j2 >>= 8;
                            }
                            if (i4 != 8) {
                            }
                        }
                        if (i3 != length) {
                            i3++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 21:
                return obj2;
            case 22:
                C10566e c10566e = (C10566e) obj2;
                return AbstractC6874e.ad(c10566e.f20850e, AbstractC4768e.ad(c10566e.f20852e, AbstractC4768e.ad, (C13840e) obj));
            case 23:
                return Integer.valueOf(((C11964e) obj2).ad);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C3759e c3759e = (C3759e) obj2;
                return AbstractC6874e.ad(Float.valueOf(c3759e.ad), Float.valueOf(c3759e.vip));
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C13840e c13840e = (C13840e) obj;
                C5652e c5652e = (C5652e) obj2;
                C12973e c12973e = new C12973e(c5652e.ad);
                C16974e c16974e = AbstractC4768e.tapsense;
                return AbstractC6874e.ad(AbstractC4768e.ad(c12973e, c16974e, c13840e), AbstractC4768e.ad(new C12973e(c5652e.vip), c16974e, c13840e));
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return Integer.valueOf(((C1812e) obj2).f4894e);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C1611e c1611e = (C1611e) obj2;
                return AbstractC6874e.ad(c1611e.ad, AbstractC4768e.ad(c1611e.vip, AbstractC4768e.startapp, (C13840e) obj));
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return Float.valueOf(((C8065e) obj2).ad);
            default:
                C13840e c13840e2 = (C13840e) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i7 = 0; i7 < size; i7++) {
                    arrayList.add(AbstractC4768e.ad((C9363e) list.get(i7), AbstractC4768e.vip, c13840e2));
                }
                return arrayList;
        }
    }
}
