package defpackage;

import android.media.MediaFormat;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC8029e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC14812e f16317e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f16318e;

    public /* synthetic */ RunnableC8029e(InterfaceC14812e interfaceC14812e, int i) {
        this.f16318e = i;
        this.f16317e = interfaceC14812e;
    }

    public /* synthetic */ RunnableC8029e(InterfaceC14812e interfaceC14812e, MediaFormat mediaFormat) {
        this.f16318e = 1;
        this.f16317e = interfaceC14812e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16318e) {
            case 0:
                this.f16317e.getClass();
                return;
            case 1:
                this.f16317e.startapp(new C12582e(24));
                return;
            default:
                this.f16317e.mopub();
                return;
        }
    }
}
