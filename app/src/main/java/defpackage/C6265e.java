package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkxreborn.cache.realm.CachedAlbum;
import ua.itaysonlab.vkxreborn.cache.realm.CachedArtist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;
import ua.itaysonlab.vkxreborn.cache.realm.CachedVkGenre;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؘؙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6265e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ List f13078e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ List f13079e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13080e = 1;

    public /* synthetic */ C6265e(C2091e c2091e, List list, List list2) {
        this.f13079e = list;
        this.f13078e = list2;
    }

    public /* synthetic */ C6265e(ArrayList arrayList, ArrayList arrayList2) {
        this.f13079e = arrayList;
        this.f13078e = arrayList2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f13080e;
        List list = this.f13078e;
        List list2 = this.f13079e;
        switch (i) {
            case 0:
                AbstractC3698e abstractC3698e = (AbstractC3698e) obj;
                if (list2 != null) {
                    int size = list2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        C6571e c6571e = (C6571e) list2.get(i2);
                        AbstractC3698e.adcel(abstractC3698e, (AbstractC2832e) c6571e.f13544e, ((C11490e) c6571e.f13543e).ad);
                    }
                }
                if (list != null) {
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        C6571e c6571e2 = (C6571e) list.get(i3);
                        AbstractC2832e abstractC2832e = (AbstractC2832e) c6571e2.f13544e;
                        Function0 function0 = (Function0) c6571e2.f13543e;
                        AbstractC3698e.adcel(abstractC3698e, abstractC2832e, function0 != null ? ((C11490e) function0.invoke()).ad : 0L);
                    }
                }
                return Unit.INSTANCE;
            default:
                C5114e c5114e = (C5114e) obj;
                if (Boolean.TRUE.booleanValue()) {
                    C1649e metrica = c5114e.m1758e(AbstractC3820e.ad.vip(CachedTrack.class), "@links.@count == 0", Arrays.copyOf(new Object[0], 0)).metrica();
                    Iterator it = metrica.iterator();
                    while (it.hasNext()) {
                        String applovin = ((CachedTrack) it.next()).applovin();
                        if (applovin != null) {
                            list2.add(applovin);
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                    c5114e.m1759e(metrica);
                    C1649e metrica2 = c5114e.m1758e(AbstractC3820e.ad.vip(CachedAlbum.class), "@links.@count == 0", Arrays.copyOf(new Object[0], 0)).metrica();
                    Iterator it2 = metrica2.iterator();
                    while (it2.hasNext()) {
                        String adcel = ((CachedAlbum) it2.next()).adcel();
                        if (adcel != null) {
                            list.add(adcel);
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                    c5114e.m1759e(metrica2);
                    C12232e c12232e = AbstractC3820e.ad;
                    c5114e.m1759e(c5114e.m1758e(c12232e.vip(CachedArtist.class), "@links.@count == 0", Arrays.copyOf(new Object[0], 0)).metrica());
                    c5114e.m1759e(c5114e.m1758e(c12232e.vip(CachedVkGenre.class), "@links.@count == 0", Arrays.copyOf(new Object[0], 0)).metrica());
                }
                return Unit.INSTANCE;
        }
    }
}
