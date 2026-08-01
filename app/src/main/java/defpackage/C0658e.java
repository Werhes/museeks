package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣٟؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0658e extends C6453e {
    public C0658e(C12948e c12948e, WindowInsets windowInsets) {
        super(c12948e, windowInsets);
    }

    public C0658e(C12948e c12948e, C0658e c0658e) {
        super(c12948e, c0658e);
    }

    @Override // defpackage.C3222e, defpackage.C2893e
    public void admob() {
    }

    @Override // defpackage.C3222e, defpackage.C2893e
    public List<Rect> billing(int i) {
        return this.metrica.getBoundingRectsIgnoringVisibility(AbstractC15634e.ad(i));
    }

    @Override // defpackage.C3222e, defpackage.C2893e
    public List<Rect> purchase(int i) {
        return this.metrica.getBoundingRects(AbstractC15634e.ad(i));
    }
}
