package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.os.Build;
import androidx.appcompat.widget.AppCompatImageView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۗ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7383e extends AppCompatImageView {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f15139e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Path f15140e;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Path path = this.f15140e;
        int save = canvas.save();
        if (this.f15139e) {
            if (Build.VERSION.SDK_INT >= 28) {
                canvas.clipOutPath(path);
            } else {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
        }
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    public Path getClipOutPath() {
        if (this.f15139e) {
            return this.f15140e;
        }
        throw new IllegalStateException("Not using clip path now!");
    }

    public void setClipOut(boolean z) {
        this.f15139e = z;
    }
}
