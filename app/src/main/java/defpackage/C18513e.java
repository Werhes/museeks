package defpackage;

import java.util.Arrays;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C18513e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ String f36299e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f36300e;

    public /* synthetic */ C18513e(String str, int i) {
        this.f36300e = i;
        this.f36299e = str;
    }

    public /* synthetic */ C18513e(String str, String str2) {
        this.f36300e = 12;
        this.f36299e = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f36300e;
        String str = this.f36299e;
        switch (i) {
            case 0:
                ((C14647e) obj).ad = str;
                return Unit.INSTANCE;
            case 1:
                CachedPlaylist cachedPlaylist = (CachedPlaylist) AbstractC18366e.metrica(((C5114e) obj).m1758e(AbstractC3820e.ad.vip(CachedPlaylist.class), "uid == $0", Arrays.copyOf(new Object[]{str}, 1)));
                if (cachedPlaylist == null) {
                    return null;
                }
                cachedPlaylist.m4702strictfp(false);
                return Unit.INSTANCE;
            case 2:
                InterfaceC15671e interfaceC15671e = (InterfaceC15671e) obj;
                InterfaceC8614e[] interfaceC8614eArr = AbstractC14594e.ad;
                C16591e c16591e = AbstractC9058e.mopub;
                InterfaceC8614e interfaceC8614e = AbstractC14594e.ad[3];
                interfaceC15671e.appmetrica(c16591e, new C4802e(1));
                AbstractC14594e.adcel(interfaceC15671e, str);
                return Unit.INSTANCE;
            case 3:
                AbstractC14594e.billing((InterfaceC15671e) obj, str);
                return Unit.INSTANCE;
            case 4:
                return Boolean.valueOf(AbstractC7890e.billing(((C6571e) obj).f13544e, str));
            case 5:
                return C6990e.metrica(str, (String) obj);
            case 6:
                AbstractC14594e.adcel((InterfaceC15671e) obj, str);
                return Unit.INSTANCE;
            case 7:
                InterfaceC15671e interfaceC15671e2 = (InterfaceC15671e) obj;
                AbstractC14594e.billing(interfaceC15671e2, str);
                AbstractC14594e.advert(interfaceC15671e2, 5);
                return Unit.INSTANCE;
            case 8:
                ((C5893e) obj).ad.put(AbstractC2356e.ad, Collections.singletonList(str));
                return Unit.INSTANCE;
            case 9:
                C4680e.license.remove(str);
                return Unit.INSTANCE;
            case 10:
                return Boolean.valueOf(AbstractC7890e.billing(((Catalog2Block) obj).getAd(), str));
            case 11:
                AbstractC14594e.billing((InterfaceC15671e) obj, str);
                return Unit.INSTANCE;
            case 12:
                AbstractC14594e.billing((InterfaceC15671e) obj, str);
                return Unit.INSTANCE;
            case 13:
                InterfaceC15671e interfaceC15671e3 = (InterfaceC15671e) obj;
                AbstractC14594e.adcel(interfaceC15671e3, str);
                C16591e c16591e2 = AbstractC9058e.signatures;
                InterfaceC8614e interfaceC8614e2 = AbstractC14594e.ad[11];
                interfaceC15671e3.appmetrica(c16591e2, Float.valueOf(0.0f));
                return Unit.INSTANCE;
            default:
                InterfaceC8614e[] interfaceC8614eArr2 = AbstractC14594e.ad;
                ((InterfaceC15671e) obj).appmetrica(AbstractC9058e.f18141protected, str);
                return Unit.INSTANCE;
        }
    }
}
