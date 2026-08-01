package defpackage;

import ua.itaysonlab.vkxreborn.cache.realm.NewCachedPodcastInfo;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٙٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17087e extends C13506e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C17087e f33441e = new C13506e(NewCachedPodcastInfo.class, "isFavorite", "isFavorite()Z", 0);

    @Override // defpackage.C13506e, defpackage.InterfaceC0716e
    public final Object get(Object obj) {
        return Boolean.valueOf(((NewCachedPodcastInfo) obj).license());
    }

    @Override // defpackage.C13506e, defpackage.InterfaceC0662e
    public final void remoteconfig(Object obj, Object obj2) {
        ((NewCachedPodcastInfo) obj).billing(((Boolean) obj2).booleanValue());
    }
}
