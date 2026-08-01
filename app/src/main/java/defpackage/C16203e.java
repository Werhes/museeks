package defpackage;

import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٖٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C16203e extends C13506e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C16203e f31824e = new C13506e(CachedPlaylist.class, "id", "getId()J", 0);

    @Override // defpackage.C13506e, defpackage.InterfaceC0716e
    public final Object get(Object obj) {
        return Long.valueOf(((CachedPlaylist) obj).loadAd());
    }

    @Override // defpackage.C13506e, defpackage.InterfaceC0662e
    public final void remoteconfig(Object obj, Object obj2) {
        ((CachedPlaylist) obj).m4696new(((Number) obj2).longValue());
    }
}
