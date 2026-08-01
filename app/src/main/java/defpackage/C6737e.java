package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.catalogkit.objects.Catalog2Response;
import ua.itaysonlab.catalogkit.objects.Catalog2Section;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۢ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6737e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f13922e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C4581e f13923e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6737e(C4581e c4581e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f13923e = c4581e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C6737e(this.f13923e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C6737e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        Object loadAd;
        int i = this.f13922e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            C15802e c15802e = C15802e.f31123e;
            this.f13922e = 1;
            loadAd = c15802e.loadAd(this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (loadAd == enumC2821e) {
                return enumC2821e;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
            loadAd = obj;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) loadAd) {
            CachedPlaylist cachedPlaylist = (CachedPlaylist) obj2;
            if (cachedPlaylist.loadAd() == -1337) {
                long tapsense = cachedPlaylist.tapsense();
                C14027e.ad.getClass();
                if (tapsense == C14027e.metrica()) {
                }
            }
            arrayList.add(obj2);
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((CachedPlaylist) it.next()).metrica());
        }
        String pro = AbstractC14363e.pro();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList(AbstractC0746e.subscription(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList4.add(AbstractC13406e.signatures((AudioPlaylist) it2.next()));
        }
        arrayList3.add(new Catalog2Block.MusicPlaylistsBlock(28, "persist_", null, null, null, arrayList4, C17993e.ad));
        Unit unit = Unit.INSTANCE;
        Unit unit2 = Unit.INSTANCE;
        return new Catalog2Response(null, new Catalog2Section(pro, "Плейлисты и альбомы", null, arrayList3, null, 20), null, null, null, null, null, null, null, null, arrayList2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536869885);
    }
}
