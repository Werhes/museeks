package defpackage;

import android.media.AudioManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۦۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10676e implements InterfaceC8223e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f21025e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f21026e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C17790e f21027e;

    public /* synthetic */ C10676e(C17790e c17790e, boolean z, int i) {
        this.f21027e = c17790e;
        this.f21026e = z;
        this.f21025e = i;
    }

    @Override // defpackage.InterfaceC8223e
    public final Object apply(Object obj) {
        C13843e c13843e = (C13843e) obj;
        C17790e c17790e = this.f21027e;
        c17790e.getClass();
        boolean z = c13843e.metrica;
        int i = c13843e.ad;
        boolean z2 = this.f21026e;
        if (z == z2) {
            return c13843e;
        }
        ((AudioManager) c17790e.f34884e).getClass();
        ((AudioManager) c17790e.f34884e).adjustStreamVolume(i, z2 ? -100 : 100, this.f21025e);
        return c17790e.mopub(i);
    }
}
