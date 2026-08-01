package defpackage;

import android.os.HandlerThread;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٟؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12237e implements InterfaceC6823e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f24568e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f24569e;

    public /* synthetic */ C12237e(int i, int i2) {
        this.f24569e = i2;
        this.f24568e = i;
    }

    @Override // defpackage.InterfaceC6823e
    public final Object get() {
        switch (this.f24569e) {
            case 0:
                return new HandlerThread(C10382e.license(this.f24568e, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(C10382e.license(this.f24568e, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
