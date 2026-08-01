package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؕٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3519e implements InterfaceC4082e {
    public final Drawable ad;

    public C3519e(Drawable drawable) {
        this.ad = drawable;
    }

    @Override // defpackage.InterfaceC4082e
    public final long appmetrica() {
        Drawable drawable = this.ad;
        long vip = AbstractC13427e.vip(drawable) * 4 * AbstractC13427e.ad(drawable);
        if (vip < 0) {
            return 0L;
        }
        return vip;
    }

    @Override // defpackage.InterfaceC4082e
    public final void billing(Canvas canvas) {
        this.ad.draw(canvas);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3519e) && AbstractC7890e.billing(this.ad, ((C3519e) obj).ad);
    }

    @Override // defpackage.InterfaceC4082e
    public final int getWidth() {
        return AbstractC13427e.vip(this.ad);
    }

    public final int hashCode() {
        return (this.ad.hashCode() * 31) + 1237;
    }

    @Override // defpackage.InterfaceC4082e
    public final boolean purchase() {
        return false;
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.ad + ", shareable=false)";
    }

    @Override // defpackage.InterfaceC4082e
    public final int vip() {
        return AbstractC13427e.ad(this.ad);
    }
}
