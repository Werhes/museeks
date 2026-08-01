package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۡؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9814e implements InterfaceC4082e {
    public final Bitmap ad;

    public C9814e(Bitmap bitmap) {
        this.ad = bitmap;
    }

    @Override // defpackage.InterfaceC4082e
    public final long appmetrica() {
        return AbstractC11815e.isPro(this.ad);
    }

    @Override // defpackage.InterfaceC4082e
    public final void billing(Canvas canvas) {
        canvas.drawBitmap(this.ad, 0.0f, 0.0f, (Paint) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9814e) && AbstractC7890e.billing(this.ad, ((C9814e) obj).ad);
    }

    @Override // defpackage.InterfaceC4082e
    public final int getWidth() {
        return this.ad.getWidth();
    }

    public final int hashCode() {
        return (this.ad.hashCode() * 31) + 1231;
    }

    @Override // defpackage.InterfaceC4082e
    public final boolean purchase() {
        return true;
    }

    public final String toString() {
        return "BitmapImage(bitmap=" + this.ad + ", shareable=true)";
    }

    @Override // defpackage.InterfaceC4082e
    public final int vip() {
        return this.ad.getHeight();
    }
}
