package defpackage;

import android.media.AudioManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۨ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12926e implements InterfaceC8223e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f25789e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f25790e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C17790e f25791e;

    public /* synthetic */ C12926e(C17790e c17790e, int i, int i2) {
        this.f25791e = c17790e;
        this.f25790e = i;
        this.f25789e = i2;
    }

    @Override // defpackage.InterfaceC8223e
    public final Object apply(Object obj) {
        C13843e c13843e = (C13843e) obj;
        C17790e c17790e = this.f25791e;
        c17790e.getClass();
        int i = c13843e.vip;
        int i2 = c13843e.ad;
        int i3 = this.f25790e;
        if (i3 == i || i3 < c13843e.license || i3 > c13843e.appmetrica) {
            return c13843e;
        }
        AudioManager audioManager = (AudioManager) c17790e.f34884e;
        audioManager.getClass();
        audioManager.setStreamVolume(i2, i3, this.f25789e);
        return c17790e.mopub(i2);
    }
}
