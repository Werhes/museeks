package defpackage;

import android.graphics.Matrix;
import android.media.Image;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۦٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4507e implements InterfaceC12385e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C1307e f9773e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C13935e[] f9774e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Image f9775e;

    public C4507e(Image image) {
        this.f9775e = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f9774e = new C13935e[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.f9774e[i] = new C13935e(planes[i]);
            }
        } else {
            this.f9774e = new C13935e[0];
        }
        this.f9773e = new C1307e(C18543e.vip, image.getTimestamp(), 0, new Matrix(), 0);
    }

    @Override // defpackage.InterfaceC12385e
    public final Image amazon() {
        return this.f9775e;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f9775e.close();
    }

    @Override // defpackage.InterfaceC12385e
    public final int getFormat() {
        return this.f9775e.getFormat();
    }

    @Override // defpackage.InterfaceC12385e
    public final int getWidth() {
        return this.f9775e.getWidth();
    }

    @Override // defpackage.InterfaceC12385e
    public final InterfaceC15935e[] remoteconfig() {
        return this.f9774e;
    }

    @Override // defpackage.InterfaceC12385e
    /* renamed from: synchronized */
    public final InterfaceC10073e mo691synchronized() {
        return this.f9773e;
    }

    @Override // defpackage.InterfaceC12385e
    public final int vip() {
        return this.f9775e.getHeight();
    }
}
