package defpackage;

import io.realm.kotlin.dynamic.DynamicMutableRealmObject;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٛ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4224e {
    public static final C6575e ad = new C6575e(15);

    public static final void ad(int i, int i2, List list) {
        int license = license(i, list);
        if (license < 0) {
            license = -(license + 1);
        }
        while (license < list.size() && ((C1547e) list.get(license)).vip < i2) {
        }
    }

    public static final InterfaceC7227e adcel(InterfaceC7227e interfaceC7227e) {
        C12232e c12232e = AbstractC3820e.ad;
        return interfaceC7227e.equals(c12232e.vip(C7588e.class)) ? c12232e.vip(InterfaceC17159e.class) : interfaceC7227e.equals(c12232e.vip(C2577e.class)) ? c12232e.vip(InterfaceC6025e.class) : (interfaceC7227e.equals(c12232e.vip(InterfaceC16120e.class)) || interfaceC7227e.equals(c12232e.vip(C16740e.class)) || interfaceC7227e.equals(c12232e.vip(DynamicMutableRealmObject.class))) ? c12232e.vip(InterfaceC14287e.class) : interfaceC7227e.equals(c12232e.vip(C8648e.class)) ? c12232e.vip(InterfaceC5045e.class) : interfaceC7227e;
    }

    public static final String advert(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (AbstractC5304e.isPro(",[]{}\\", charAt)) {
                sb.append('\\');
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static C10675e appmetrica() {
        String str = C10675e.f21023e;
        C5363e c5363e = AbstractC16696e.ad;
        return C10215e.purchase(AbstractC16268e.purchase().vip());
    }

    public static final List billing(String str, List list) {
        if (list == C13664e.f27089e || (list instanceof C16551e)) {
            return list;
        }
        C16551e c16551e = new C16551e(list);
        if (c16551e.contains(null)) {
            throw new IllegalArgumentException(str.concat(".contains(null)").toString());
        }
        return c16551e;
    }

    public static final int license(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int yandex = AbstractC7890e.yandex(((C1547e) list.get(i3)).vip, i);
            if (yandex < 0) {
                i2 = i3 + 1;
            } else {
                if (yandex <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final AbstractC16232e metrica(AbstractC16232e abstractC16232e, InterfaceC16046e interfaceC16046e) {
        if (interfaceC16046e == null || abstractC16232e.ad() == 1) {
            return abstractC16232e;
        }
        if (interfaceC16046e.mo2738e() == abstractC16232e.ad()) {
            return abstractC16232e.metrica() ? new C7878e(1, new C6012e(C6272e.appmetrica, new C3411e(5, abstractC16232e))) : new C7878e(abstractC16232e.vip());
        }
        C0460e c0460e = new C0460e(abstractC16232e);
        C6557e.f13492e.getClass();
        return new C7878e(1, new C18086e(abstractC16232e, c0460e, false, C6557e.f13491e));
    }

    public static final void mopub(C14479e c14479e, int i, Object obj) {
        int yandex = c14479e.yandex(i);
        Object[] objArr = c14479e.metrica;
        Object obj2 = objArr[yandex];
        objArr[yandex] = C2987e.ad;
        if (obj == obj2) {
            return;
        }
        AbstractC1889e.ad("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    public static C10675e purchase(int i, String str) {
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 0) {
            return appmetrica().appmetrica("playlists").appmetrica(str.concat(".png"));
        }
        if (m2467class == 1) {
            return appmetrica().appmetrica("tracks").appmetrica("audio".concat(str)).appmetrica("artwork.png");
        }
        if (m2467class == 2) {
            return appmetrica().appmetrica("images").appmetrica("track_" + str + ".png");
        }
        if (m2467class == 3) {
            return appmetrica().appmetrica("images").appmetrica("album_" + str + ".png");
        }
        if (m2467class == 4) {
            return appmetrica().appmetrica("images").appmetrica("playlist_" + str + ".png");
        }
        if (m2467class != 5) {
            throw new C14803e(10);
        }
        return appmetrica().appmetrica("images").appmetrica("podcast_" + str + ".png");
    }

    public static AbstractC3370e smaato(AbstractC3370e abstractC3370e) {
        if (!(abstractC3370e instanceof C1351e)) {
            return new C12725e(abstractC3370e, 0);
        }
        C1351e c1351e = (C1351e) abstractC3370e;
        InterfaceC16046e[] interfaceC16046eArr = c1351e.vip;
        ArrayList m665catch = AbstractC1660e.m665catch(c1351e.metrica, interfaceC16046eArr);
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(m665catch, 10));
        Iterator it = m665catch.iterator();
        while (it.hasNext()) {
            C6571e c6571e = (C6571e) it.next();
            arrayList.add(metrica((AbstractC16232e) c6571e.f13544e, (InterfaceC16046e) c6571e.f13543e));
        }
        return new C1351e(interfaceC16046eArr, (AbstractC16232e[]) arrayList.toArray(new AbstractC16232e[0]), true);
    }

    public static C10675e startapp(int i, String str) {
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 0) {
            return appmetrica().appmetrica("tracks").appmetrica("audio".concat(str)).appmetrica("index.m3u8");
        }
        if (m2467class == 1) {
            return appmetrica().appmetrica("tracks").appmetrica("audio".concat(str));
        }
        if (m2467class == 2) {
            return appmetrica().appmetrica("tracks").appmetrica("audio".concat(str)).appmetrica("audio.mp3");
        }
        if (m2467class == 3) {
            return appmetrica().appmetrica("tracks").appmetrica("audio".concat(str)).appmetrica("lyrics.json");
        }
        if (m2467class == 4) {
            return appmetrica().appmetrica("tracks").appmetrica("audio".concat(str)).appmetrica("lyrics.txt");
        }
        throw new C14803e(10);
    }

    public static final void vip(C0690e c0690e, ArrayList arrayList, int i) {
        boolean advert = c0690e.advert(i);
        int[] iArr = c0690e.vip;
        if (advert) {
            arrayList.add(c0690e.amazon(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            vip(c0690e, arrayList, i3);
        }
    }

    public static final Map yandex(String str, Map map) {
        if (map.isEmpty()) {
            return C9139e.f18290e;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (linkedHashMap.keySet().contains(null)) {
            throw new IllegalArgumentException(str.concat(".containsKey(null)").toString());
        }
        if (linkedHashMap.values().contains(null)) {
            throw new IllegalArgumentException(str.concat(".containsValue(null)").toString());
        }
        return DesugarCollections.unmodifiableMap(linkedHashMap);
    }
}
