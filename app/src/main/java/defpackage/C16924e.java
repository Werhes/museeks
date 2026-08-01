package defpackage;

import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrackLyrics;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٗؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C16924e extends C13506e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C16924e f33151e = new C13506e(CachedTrack.class, "lyrics", "getLyrics()Lua/itaysonlab/vkxreborn/cache/realm/CachedTrackLyrics;", 0);

    @Override // defpackage.C13506e, defpackage.InterfaceC0716e
    public final Object get(Object obj) {
        return ((CachedTrack) obj).amazon();
    }

    @Override // defpackage.C13506e, defpackage.InterfaceC0662e
    public final void remoteconfig(Object obj, Object obj2) {
        ((CachedTrack) obj).m4735static((CachedTrackLyrics) obj2);
    }
}
