package defpackage;

import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؖؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3905e extends C13506e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C3905e f8725e = new C13506e(CachedTrack.class, "duration", "getDuration()I", 0);

    @Override // defpackage.C13506e, defpackage.InterfaceC0716e
    public final Object get(Object obj) {
        return Integer.valueOf(((CachedTrack) obj).billing());
    }

    @Override // defpackage.C13506e, defpackage.InterfaceC0662e
    public final void remoteconfig(Object obj, Object obj2) {
        ((CachedTrack) obj).m4714case(((Number) obj2).intValue());
    }
}
