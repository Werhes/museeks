package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍِٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11770e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C13182e f23645e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23646e;

    public /* synthetic */ C11770e(C13182e c13182e, int i) {
        this.f23646e = i;
        this.f23645e = c13182e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Iterator it;
        String str;
        AudioAlbum audioAlbum;
        switch (this.f23646e) {
            case 0:
                C13182e c13182e = this.f23645e;
                c13182e.f26178e.setValue((String) obj);
                c13182e.isPro();
                return Unit.INSTANCE;
            case 1:
                C13182e c13182e2 = this.f23645e;
                c13182e2.f26181e.setValue((String) obj);
                c13182e2.isPro();
                return Unit.INSTANCE;
            case 2:
                List list = (List) obj;
                C13182e c13182e3 = this.f23645e;
                C11952e c11952e = c13182e3.f26176e;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                InterfaceC8346e applovin = c13182e3.applovin();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : applovin) {
                    AudioTrack audioTrack = (AudioTrack) obj2;
                    if (list == null || !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            String str2 = ((C11973e) it2.next()).ad;
                            audioTrack.getClass();
                            if (AbstractC7890e.billing(str2, AbstractC6914e.billing(audioTrack))) {
                                break;
                            }
                        }
                    }
                    arrayList3.add(obj2);
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list) {
                    C11973e c11973e = (C11973e) obj3;
                    InterfaceC8346e<AudioTrack> applovin2 = c13182e3.applovin();
                    if (applovin2 == null || !applovin2.isEmpty()) {
                        for (AudioTrack audioTrack2 : applovin2) {
                            audioTrack2.getClass();
                            if (AbstractC7890e.billing(AbstractC6914e.billing(audioTrack2), c11973e.ad)) {
                                break;
                            }
                        }
                    }
                    arrayList4.add(obj3);
                }
                Iterator it3 = arrayList3.iterator();
                while (true) {
                    boolean hasNext = it3.hasNext();
                    EnumC10584e enumC10584e = EnumC10584e.f20884e;
                    EnumC10584e enumC10584e2 = EnumC10584e.f20885e;
                    if (!hasNext) {
                        Iterator it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            C11973e c11973e2 = (C11973e) it4.next();
                            String str3 = c11973e2.ad;
                            if (c11952e.get(str3) == enumC10584e) {
                                c11952e.put(str3, EnumC10584e.f20886e);
                                it = it4;
                            } else {
                                C18422e c18422e = c11973e2.vip;
                                int i = c18422e.vip;
                                long j = c18422e.metrica;
                                String str4 = c18422e.license;
                                String str5 = c18422e.ad;
                                C5442e c5442e = c18422e.admob;
                                if (c5442e != null) {
                                    int i2 = c5442e.ad;
                                    str = str5;
                                    long j2 = c5442e.metrica;
                                    it = it4;
                                    String str6 = c5442e.license;
                                    String str7 = c5442e.vip;
                                    C18236e c18236e = c5442e.appmetrica;
                                    audioAlbum = new AudioAlbum(Integer.valueOf(i2), Long.valueOf(j2), str6, str7, new AlbumThumb(c18236e != null ? c18236e.purchase : null, c18236e != null ? c18236e.billing : null, c18236e != null ? c18236e.yandex : null, c18236e != null ? c18236e.startapp : null, c18236e != null ? c18236e.adcel : null), null, false);
                                } else {
                                    it = it4;
                                    str = str5;
                                    audioAlbum = null;
                                }
                                arrayList.add(new AudioTrack(str, i, j, str4, 0, null, false, false, null, null, 0L, null, 0, audioAlbum, null, null, null, null, null, null, false, false, false, false, null, null, 0, null, null, false, false, false, false, false, -8208, 7));
                                c11952e.put(str3, enumC10584e2);
                            }
                            it4 = it;
                        }
                        List m3607transient = AbstractC13480e.m3607transient(arrayList);
                        InterfaceC8346e applovin3 = c13182e3.applovin();
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj4 : applovin3) {
                            AudioTrack audioTrack3 = (AudioTrack) obj4;
                            audioTrack3.getClass();
                            if (!arrayList2.contains(AbstractC6914e.billing(audioTrack3))) {
                                arrayList5.add(obj4);
                            }
                        }
                        c13182e3.f26175e.setValue(AbstractC8228e.metrica(AbstractC13480e.m3584final(m3607transient, arrayList5)));
                        c13182e3.isPro();
                        return Unit.INSTANCE;
                    }
                    AudioTrack audioTrack4 = (AudioTrack) it3.next();
                    audioTrack4.getClass();
                    String billing = AbstractC6914e.billing(audioTrack4);
                    if (c11952e.get(billing) == enumC10584e2) {
                        c11952e.remove(billing);
                        arrayList2.add(billing);
                    } else {
                        c11952e.put(AbstractC6914e.billing(audioTrack4), enumC10584e);
                    }
                }
                break;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                C13182e c13182e4 = this.f23645e;
                c13182e4.f26182e.setValue(bool);
                c13182e4.isPro();
                return Unit.INSTANCE;
            default:
                return C13182e.inmobi(this.f23645e, (Uri) obj);
        }
    }
}
