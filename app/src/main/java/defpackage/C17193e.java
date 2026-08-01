package defpackage;

import android.graphics.Canvas;
import android.graphics.Region;
import android.os.Build;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٗۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17193e extends AbstractC11166e {
    @Override // defpackage.C11252e
    public final void purchase(Canvas canvas) {
        if (this.f22425e.admob.isEmpty()) {
            super.purchase(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f22425e.admob);
        } else {
            canvas.clipRect(this.f22425e.admob, Region.Op.DIFFERENCE);
        }
        super.purchase(canvas);
        canvas.restore();
    }
}
