package defpackage;

import android.content.Context;
import androidx.car.app.navigation.model.Maneuver;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;
import io.realm.kotlin.internal.interop.vip;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.Genre;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylistLibrary;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۛٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2091e implements Function1 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5413e;

    public /* synthetic */ C2091e(int i) {
        this.f5413e = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C11974e c11974e;
        int i = this.f5413e;
        int i2 = 10;
        C13664e c13664e = C13664e.f27089e;
        int i3 = 6;
        int i4 = 3;
        InterfaceC5083e interfaceC5083e = null;
        int i5 = 0;
        int i6 = 1;
        switch (i) {
            case 0:
                ((C3566e) obj).m1377this(EnumC10826e.f21457e);
                return Unit.INSTANCE;
            case 1:
                ((C3566e) obj).m1375goto();
                return Unit.INSTANCE;
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                return AbstractC17540e.license("\n                    \"" + entry.getKey() + "\": " + entry.getValue() + "\n                ");
            case 3:
                ((C15104e) obj).vip = true;
                return Unit.INSTANCE;
            case 4:
                Map.Entry entry2 = (Map.Entry) obj;
                return ((String) entry2.getKey()) + ':' + ((String) entry2.getValue());
            case 5:
                return ((Genre) obj).vip;
            case 6:
                return Unit.INSTANCE;
            case 7:
                ((C15104e) obj).vip = true;
                return Unit.INSTANCE;
            case 8:
                ((C15104e) obj).vip = true;
                return Unit.INSTANCE;
            case 9:
                C17213e c17213e = (C17213e) obj;
                AbstractC5087e.premium(c17213e, null, null, AbstractC4265e.vip, 3);
                AbstractC5087e.premium(c17213e, null, null, AbstractC4265e.metrica, 3);
                AbstractC5087e.premium(c17213e, null, null, AbstractC4265e.license, 3);
                return Unit.INSTANCE;
            case 10:
                ((C15104e) obj).vip = true;
                return Unit.INSTANCE;
            case 11:
                CachedPlaylistLibrary cachedPlaylistLibrary = (CachedPlaylistLibrary) ((C5114e) obj).m1758e(AbstractC3820e.ad.vip(CachedPlaylistLibrary.class), "TRUEPREDICATE", Arrays.copyOf(new Object[0], 0)).license().ad();
                if (cachedPlaylistLibrary != null) {
                    InterfaceC17101e ad = cachedPlaylistLibrary.ad();
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : ad) {
                        if (hashSet.add(((CachedPlaylist) obj2).m4683class())) {
                            arrayList.add(obj2);
                        }
                    }
                    cachedPlaylistLibrary.metrica(AbstractC15365e.metrica(arrayList));
                }
                return Unit.INSTANCE;
            case 12:
                C1649e metrica = ((C4199e) obj).m1506e(AbstractC3820e.ad.vip(CachedTrack.class), "TRUEPREDICATE", Arrays.copyOf(new Object[0], 0)).metrica();
                ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(metrica, 10));
                Iterator it = metrica.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((CachedTrack) it.next()).metrica());
                }
                return arrayList2;
            case 13:
                long[] jArr = new long[1];
                long ptr$cinterop_release = ((LongPointerWrapper) ((NativePointer) ((C4199e) obj).m1506e(AbstractC3820e.ad.vip(CachedTrack.class), "TRUEPREDICATE", Arrays.copyOf(new Object[0], 0)).ad().f18315e)).getPtr$cinterop_release();
                int i7 = AbstractC6026e.ad;
                realmcJNI.realm_query_count(ptr$cinterop_release, jArr);
                return Long.valueOf(jArr[0]);
            case 14:
                return C15647e.f30853e;
            case 15:
                return Collections.singletonList(C17224e.ad);
            case 16:
                return C2724e.f6614e;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                InterfaceC8614e[] interfaceC8614eArr = AbstractC16214e.ad;
                return c13664e;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C14528e.f28724e.getClass();
                return C14528e.f28723e;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return Collections.singletonList(new C16191e(new C14648e((Context) obj, i3), AbstractC1660e.m664case(new String[]{"interface_mpswipe", "swipe_nowplaying", "interface_roundednp", "np_slide_hide_systembars", "now_playing_controller", "interface_nowplayingstyle"}), new C15985e(i4, i2, interfaceC5083e), 4));
            case 20:
                return C17384e.f34079e;
            case 21:
                InterfaceC8614e[] interfaceC8614eArr2 = AbstractC5872e.ad;
                return c13664e;
            case 22:
                return C14394e.f28469e;
            case 23:
                Context context = (Context) obj;
                return AbstractC6874e.startapp(new C16191e(new C14648e(context, 9), AbstractC1660e.m664case(new String[]{"theming_last_theme_light", "theming_last_theme_dark", "interface_accent", "interface_theme"}), new C6898e(i4, i5, interfaceC5083e), 4), new C16191e(new C14648e(context, 7), AbstractC1660e.m664case(new String[]{"theming_system", "a12_monet", "ct_override"}), new C6898e(i4, i6, interfaceC5083e), 4), new C16191e(new C14648e(context, 8), null, new C6898e(i4, 2, interfaceC5083e), 6));
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C5114e c5114e = (C5114e) obj;
                NativePointer nativePointer = ((C16981e) c5114e.yandex()).f33290e;
                C17900e advert = ((C16981e) c5114e.yandex()).advert();
                ArrayList metrica2 = vip.metrica(nativePointer);
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = metrica2.iterator();
                while (it2.hasNext()) {
                    long j = ((C10484e) it2.next()).ad;
                    C18234e vip = vip.vip(nativePointer, j);
                    C18085e ad2 = advert.ad(vip.ad);
                    if (ad2 == null || ad2.startapp == null) {
                        c11974e = null;
                    } else {
                        List license = vip.license(nativePointer, j, vip.metrica + vip.license);
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj3 : license) {
                            C16406e c16406e = (C16406e) ad2.appmetrica.get(((C16427e) obj3).ad);
                            if (c16406e != null && c16406e.ad != null) {
                                arrayList4.add(obj3);
                            }
                        }
                        c11974e = new C11974e(vip, arrayList4);
                    }
                    if (c11974e != null) {
                        arrayList3.add(c11974e);
                    }
                }
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    C11974e c11974e2 = (C11974e) it3.next();
                    C18085e ad3 = c5114e.yandex().advert().ad(c11974e2.metrica);
                    InterfaceC7227e interfaceC7227e = ad3 != null ? ad3.startapp : null;
                    if (interfaceC7227e == null) {
                        throw new IllegalStateException(AbstractC17861e.Signature("Could not delete: ", c11974e2.metrica));
                    }
                    c5114e.m1756e(interfaceC7227e);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return Boolean.TRUE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return Collections.singletonList(C10139e.INSTANCE);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return Collections.singletonList(C10139e.INSTANCE);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return Collections.singletonList(C16362e.INSTANCE);
            default:
                return Collections.singletonList(C14907e.INSTANCE);
        }
    }
}
