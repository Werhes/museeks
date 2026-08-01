package defpackage;

import android.media.MediaCodec;
import android.view.Surface;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۚۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1311e implements InterfaceC17421e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C18405e f4029e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Surface f4030e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f4031e = new Object();

    public C1311e(C18405e c18405e) {
        this.f4029e = c18405e;
    }

    public final Surface ad() {
        Surface surface;
        synchronized (this.f4031e) {
            try {
                if (this.f4030e == null) {
                    this.f4030e = MediaCodec.createPersistentInputSurface();
                }
                surface = this.f4030e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return surface;
    }
}
