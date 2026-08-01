package defpackage;

import android.media.ImageWriter;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؔۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2935e implements InterfaceC15070e, AutoCloseable, ImageWriter.OnImageReleasedListener {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C7744e f6927e = AbstractC14430e.appmetrica(null);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f6928e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ImageWriter f6929e;

    public C2935e(ImageWriter imageWriter, int i) {
        this.f6929e = imageWriter;
        this.f6928e = i;
        imageWriter.getMaxImages();
        imageWriter.getFormat();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f6929e.close();
    }

    @Override // android.media.ImageWriter.OnImageReleasedListener
    public final void onImageReleased(ImageWriter imageWriter) {
        if (this.f6927e.ad != null) {
            throw new ClassCastException();
        }
    }

    @Override // defpackage.InterfaceC15070e
    /* renamed from: static */
    public final Object mo754static(InterfaceC7227e interfaceC7227e) {
        if (interfaceC7227e.equals(AbstractC3820e.ad.vip(ImageWriter.class))) {
            return this.f6929e;
        }
        return null;
    }

    public final String toString() {
        return "ImageWriter-" + C0299e.ad(this.f6929e.getFormat()) + '-' + ((Object) ("Input-" + this.f6928e));
    }
}
