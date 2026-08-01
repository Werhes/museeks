package defpackage;

import java.util.Comparator;
import java.util.List;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؚؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8540e implements Comparator {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ List f17341e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17342e;

    public /* synthetic */ C8540e(int i, List list) {
        this.f17342e = i;
        this.f17341e = list;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f17342e) {
            case 0:
                String applovin = ((CachedTrack) obj).applovin();
                List list = this.f17341e;
                return AbstractC0258e.vip(Integer.valueOf(list.indexOf(applovin)), Integer.valueOf(list.indexOf(((CachedTrack) obj2).applovin())));
            case 1:
                String applovin2 = ((CachedTrack) obj).applovin();
                List list2 = this.f17341e;
                return AbstractC0258e.vip(Integer.valueOf(list2.indexOf(applovin2)), Integer.valueOf(list2.indexOf(((CachedTrack) obj2).applovin())));
            default:
                String applovin3 = ((CachedTrack) obj).applovin();
                List list3 = this.f17341e;
                return AbstractC0258e.vip(Integer.valueOf(list3.indexOf(applovin3)), Integer.valueOf(list3.indexOf(((CachedTrack) obj2).applovin())));
        }
    }
}
