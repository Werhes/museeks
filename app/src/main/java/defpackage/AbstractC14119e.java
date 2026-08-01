package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓٝٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14119e {
    public static final File ad;
    public static final LinkedHashMap vip;

    static {
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        File file = new File(vKXApplication.getDir("devdb", 0), "OnDevice_Blacklist.dat");
        ad = file;
        vip = new LinkedHashMap();
        if (!file.exists()) {
            file.createNewFile();
        }
        AbstractC1641e.amazon(file, new C4526e(4));
    }

    public static ArrayList ad() {
        LinkedHashMap linkedHashMap = vip;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new MainArtist((String) entry.getKey(), (String) null, (String) entry.getValue(), (List) null, false, 26));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String str = ((MainArtist) next).ad;
            if (str != null && str.length() != 0) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public static void metrica() {
        Set entrySet = vip.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entrySet) {
            Map.Entry entry = (Map.Entry) obj;
            if (((CharSequence) entry.getKey()).length() > 0 && ((CharSequence) entry.getValue()).length() > 0) {
                arrayList.add(obj);
            }
        }
        AbstractC1641e.admob(ad, AbstractC13480e.m3608try(arrayList, "\n", null, null, new C4526e(5), 30));
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        AbstractC6232e.billing(C5642e.ad, vKXApplication);
    }

    public static int vip(AudioTrack audioTrack) {
        AudioAlbum audioAlbum;
        C15409e c15409e = C15409e.ad;
        c15409e.getClass();
        C12309e c12309e = C15409e.smaato;
        InterfaceC8614e[] interfaceC8614eArr = C15409e.vip;
        InterfaceC8614e interfaceC8614e = interfaceC8614eArr[7];
        if (((Boolean) c12309e.tapsense(c15409e)).booleanValue() && audioTrack.billing) {
            return 1;
        }
        C12309e c12309e2 = C15409e.adcel;
        InterfaceC8614e interfaceC8614e2 = interfaceC8614eArr[4];
        if (((Boolean) c12309e2.tapsense(c15409e)).booleanValue()) {
            if (Pattern.compile("[А-яёЁ]+").matcher(audioTrack.license).find()) {
                return 1;
            }
        }
        C12309e c12309e3 = C15409e.mopub;
        InterfaceC8614e interfaceC8614e3 = interfaceC8614eArr[5];
        if (((Boolean) c12309e3.tapsense(c15409e)).booleanValue()) {
            if (Pattern.compile("[А-яёЁ]+").matcher(audioTrack.ad).find()) {
                return 1;
            }
        }
        C12309e c12309e4 = C15409e.advert;
        InterfaceC8614e interfaceC8614e4 = interfaceC8614eArr[6];
        if (((Boolean) c12309e4.tapsense(c15409e)).booleanValue() && (audioAlbum = audioTrack.amazon) != null) {
            if (Pattern.compile("[А-яёЁ]+").matcher(audioAlbum.license).find()) {
                return 1;
            }
        }
        List list = audioTrack.Signature;
        LinkedHashMap linkedHashMap = vip;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = ((MainArtist) it.next()).ad;
                if (str != null && linkedHashMap.containsKey(str)) {
                    return 2;
                }
            }
        }
        List list2 = audioTrack.admob;
        if (list2 == null) {
            return 3;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            String str2 = ((MainArtist) it2.next()).ad;
            if (str2 != null && linkedHashMap.containsKey(str2)) {
                return 2;
            }
        }
        return 3;
    }
}
