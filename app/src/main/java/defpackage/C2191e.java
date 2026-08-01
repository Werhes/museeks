package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.newsfeed.NewsfeedAttachment;
import ua.itaysonlab.vkapi2.objects.newsfeed.NewsfeedAudios;
import ua.itaysonlab.vkapi2.objects.newsfeed.NewsfeedItem;
import ua.itaysonlab.vkapi2.objects.newsfeed.NewsfeedPlaylists;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؓۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2191e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f5570e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5571e;

    public /* synthetic */ C2191e(int i, ArrayList arrayList) {
        this.f5571e = i;
        this.f5570e = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f5571e) {
            case 0:
                AbstractC3698e abstractC3698e = (AbstractC3698e) obj;
                ArrayList arrayList = this.f5570e;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    AbstractC3698e.advert(abstractC3698e, (AbstractC2832e) arrayList.get(i), 0, 0);
                }
                return Unit.INSTANCE;
            case 1:
                AbstractC16824e abstractC16824e = (AbstractC16824e) obj;
                InterfaceC13033e metrica = abstractC16824e.metrica();
                Iterator it = this.f5570e.iterator();
                while (it.hasNext()) {
                    InterfaceC3552e interfaceC3552e = (InterfaceC3552e) it.next();
                    InterfaceC4911e interfaceC4911e = AbstractC10725e.ad;
                    if (interfaceC4911e.yandex()) {
                        StringBuilder sb = new StringBuilder("Decoding response with ");
                        sb.append(interfaceC3552e);
                        sb.append(" for ");
                        InterfaceC4393e interfaceC4393e = abstractC16824e.vip().f10751e;
                        if (interfaceC4393e == null) {
                            interfaceC4393e = null;
                        }
                        sb.append(interfaceC4393e.getUrl());
                        interfaceC4911e.amazon(sb.toString());
                    }
                    InterfaceC8850e advert = abstractC16824e.advert();
                    ((C1313e) interfaceC3552e).ad.getClass();
                    metrica = AbstractC12534e.mopub(2, advert.mo394const(AbstractC13908e.vip), C5162e.f11047e, new C11146e(true, metrica, null)).ad;
                }
                return metrica;
            case 2:
                AbstractC3698e abstractC3698e2 = (AbstractC3698e) obj;
                ArrayList arrayList2 = this.f5570e;
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    C8518e c8518e = (C8518e) arrayList2.get(i2);
                    List list = c8518e.vip;
                    boolean z = c8518e.yandex;
                    if (c8518e.advert == Integer.MIN_VALUE) {
                        AbstractC8889e.ad("position() should be called first");
                    }
                    int size3 = list.size();
                    int i3 = 0;
                    while (i3 < size3) {
                        AbstractC2832e abstractC2832e = (AbstractC2832e) list.get(i3);
                        int i4 = i2;
                        long license = C11490e.license((r12[r13 + 1] & 4294967295L) | (c8518e.adcel[i3 * 2] << 32), c8518e.metrica);
                        if (z) {
                            AbstractC3698e.admob(abstractC3698e2, abstractC2832e, license);
                        } else {
                            AbstractC3698e.amazon(abstractC3698e2, abstractC2832e, license);
                        }
                        i3++;
                        i2 = i4;
                    }
                    i2++;
                }
                return Unit.INSTANCE;
            case 3:
                AbstractC3698e abstractC3698e3 = (AbstractC3698e) obj;
                ArrayList arrayList3 = this.f5570e;
                int size4 = arrayList3.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    abstractC3698e3.billing((AbstractC2832e) arrayList3.get(i5), 0, 0, 0.0f);
                }
                return Unit.INSTANCE;
            case 4:
                NewsfeedItem newsfeedItem = (NewsfeedItem) obj;
                List list2 = newsfeedItem.amazon;
                ArrayList arrayList4 = this.f5570e;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        AudioTrack audioTrack = ((NewsfeedAttachment) it2.next()).ad;
                        if (audioTrack != null) {
                            arrayList4.add(audioTrack);
                        }
                    }
                }
                NewsfeedAudios newsfeedAudios = newsfeedItem.adcel;
                if (newsfeedAudios != null) {
                    arrayList4.addAll(newsfeedAudios.vip);
                }
                List list3 = newsfeedItem.mopub;
                if (list3 != null) {
                    arrayList4.addAll(list3);
                }
                return Unit.INSTANCE;
            default:
                NewsfeedItem newsfeedItem2 = (NewsfeedItem) obj;
                List list4 = newsfeedItem2.amazon;
                ArrayList arrayList5 = this.f5570e;
                if (list4 != null) {
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        AudioPlaylist audioPlaylist = ((NewsfeedAttachment) it3.next()).vip;
                        if (audioPlaylist != null) {
                            arrayList5.add(audioPlaylist);
                        }
                    }
                }
                NewsfeedPlaylists newsfeedPlaylists = newsfeedItem2.advert;
                if (newsfeedPlaylists != null) {
                    arrayList5.addAll(newsfeedPlaylists.vip);
                }
                return Unit.INSTANCE;
        }
    }
}
