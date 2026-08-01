package defpackage;

import android.media.AudioManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؗ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4805e implements InterfaceC8223e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f10237e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C17790e f10238e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f10239e;

    public /* synthetic */ C4805e(C17790e c17790e, int i, int i2) {
        this.f10239e = i2;
        this.f10238e = c17790e;
        this.f10237e = i;
    }

    @Override // defpackage.InterfaceC8223e
    public final Object apply(Object obj) {
        C13843e c13843e = (C13843e) obj;
        switch (this.f10239e) {
            case 0:
                C17790e c17790e = this.f10238e;
                c17790e.getClass();
                int i = c13843e.vip;
                int i2 = c13843e.ad;
                if (i >= c13843e.appmetrica) {
                    return c13843e;
                }
                AudioManager audioManager = (AudioManager) c17790e.f34884e;
                audioManager.getClass();
                audioManager.adjustStreamVolume(i2, 1, this.f10237e);
                return c17790e.mopub(i2);
            case 1:
                C17790e c17790e2 = this.f10238e;
                c17790e2.getClass();
                int i3 = c13843e.vip;
                int i4 = c13843e.ad;
                if (i3 <= c13843e.license) {
                    return c13843e;
                }
                AudioManager audioManager2 = (AudioManager) c17790e2.f34884e;
                audioManager2.getClass();
                audioManager2.adjustStreamVolume(i4, -1, this.f10237e);
                return c17790e2.mopub(i4);
            default:
                C17790e c17790e3 = this.f10238e;
                c17790e3.getClass();
                int i5 = c13843e.ad;
                int i6 = this.f10237e;
                return i5 == i6 ? c13843e : c17790e3.mopub(i6);
        }
    }
}
