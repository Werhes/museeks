package defpackage;

import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؒٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0979e extends C13506e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C0979e f3418e = new C13506e(AudioTrack.class, "isCached", "isCached()Z", 0);

    @Override // defpackage.C13506e, defpackage.InterfaceC0716e
    public final Object get(Object obj) {
        return Boolean.valueOf(((AudioTrack) obj).crashlytics);
    }

    @Override // defpackage.C13506e, defpackage.InterfaceC0662e
    public final void remoteconfig(Object obj, Object obj2) {
        ((AudioTrack) obj).crashlytics = ((Boolean) obj2).booleanValue();
    }
}
