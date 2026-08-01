package defpackage;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّْۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13224e implements InterfaceC1306e {
    public final Bitmap ad;

    public C13224e(Bitmap bitmap) {
        this.ad = bitmap;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapImageProvider(bitmap=Bitmap(");
        Bitmap bitmap = this.ad;
        sb.append(bitmap.getWidth());
        sb.append("px x ");
        sb.append(bitmap.getHeight());
        sb.append("px))");
        return sb.toString();
    }
}
