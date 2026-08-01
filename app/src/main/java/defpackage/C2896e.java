package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkxreborn.cache.realm.CachedAlbum;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔ۟ۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2896e extends AbstractC7185e implements Function4 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f6884e = 1;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public /* synthetic */ Object f6885e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f6886e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f6887e;

    public /* synthetic */ C2896e(int i, InterfaceC5083e interfaceC5083e) {
        super(i, interfaceC5083e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2896e(C13182e c13182e, InterfaceC5083e interfaceC5083e) {
        super(4, interfaceC5083e);
        this.f6885e = c13182e;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f6884e) {
            case 0:
                C2896e c2896e = new C2896e((C13182e) this.f6885e, (InterfaceC5083e) obj4);
                c2896e.f6887e = (C3225e) obj2;
                c2896e.f6886e = (C3225e) obj3;
                return c2896e.loadAd(Unit.INSTANCE);
            default:
                C2896e c2896e2 = new C2896e(4, (InterfaceC5083e) obj4);
                c2896e2.f6887e = (C0306e) obj;
                c2896e2.f6886e = (C0306e) obj2;
                c2896e2.f6885e = (EnumC2646e) obj3;
                return c2896e2.loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        ArrayList arrayList;
        switch (this.f6884e) {
            case 0:
                C3225e c3225e = (C3225e) this.f6887e;
                C3225e c3225e2 = (C3225e) this.f6886e;
                AbstractC2003e.purchase(obj);
                C13182e c13182e = (C13182e) this.f6885e;
                int i = C13182e.f26171e;
                AudioTrack audioTrack = (AudioTrack) c13182e.applovin().get(c3225e.ad - 2);
                audioTrack.getClass();
                String billing = AbstractC6914e.billing(audioTrack);
                C11952e c11952e = c13182e.f26176e;
                if (c11952e.get(billing) == EnumC10584e.f20887e) {
                    c11952e.put(billing, EnumC10584e.f20886e);
                }
                ArrayList arrayList2 = new ArrayList(c13182e.applovin());
                Collections.swap(arrayList2, c3225e.ad - 2, c3225e2.ad - 2);
                c13182e.f26175e.setValue(AbstractC8228e.license(arrayList2));
                c13182e.isPro();
                return Unit.INSTANCE;
            default:
                C0306e c0306e = (C0306e) this.f6887e;
                C0306e c0306e2 = (C0306e) this.f6886e;
                EnumC2646e enumC2646e = (EnumC2646e) this.f6885e;
                AbstractC2003e.purchase(obj);
                int ordinal = enumC2646e.ordinal();
                if (ordinal == 0) {
                    InterfaceC6912e<CachedPlaylist> ad = c0306e.ad();
                    arrayList = new ArrayList(AbstractC0746e.subscription(ad, 10));
                    for (CachedPlaylist cachedPlaylist : ad) {
                        String str = "playlist_" + cachedPlaylist.m4683class();
                        String remoteconfig = AbstractC12546e.appmetrica(cachedPlaylist).f21024e.remoteconfig();
                        String firebase = cachedPlaylist.firebase();
                        String inmobi = cachedPlaylist.inmobi();
                        arrayList.add(new C11235e(str, remoteconfig, firebase, inmobi == null ? BuildConfig.FLAVOR : inmobi, new C16092e(cachedPlaylist.m4683class())));
                    }
                } else {
                    if (ordinal != 1) {
                        throw new C14803e(10);
                    }
                    InterfaceC6912e<CachedAlbum> ad2 = c0306e2.ad();
                    arrayList = new ArrayList(AbstractC0746e.subscription(ad2, 10));
                    for (CachedAlbum cachedAlbum : ad2) {
                        String str2 = "album_" + cachedAlbum.adcel();
                        String adcel = cachedAlbum.adcel();
                        if (adcel == null) {
                            adcel = BuildConfig.FLAVOR;
                        }
                        String remoteconfig2 = AbstractC4224e.purchase(4, adcel).f21024e.remoteconfig();
                        String yandex = cachedAlbum.yandex();
                        String vip = cachedAlbum.vip();
                        String adcel2 = cachedAlbum.adcel();
                        if (adcel2 == null) {
                            adcel2 = BuildConfig.FLAVOR;
                        }
                        arrayList.add(new C11235e(str2, remoteconfig2, yandex, vip, new C6166e(adcel2)));
                    }
                }
                return arrayList;
        }
    }
}
