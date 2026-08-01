package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘُؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C5571e extends C7002e {
    public static final C12948e isVip = C12948e.yandex(null, C2864e.appmetrica());

    public C5571e(C12948e c12948e, WindowInsets windowInsets) {
        super(c12948e, windowInsets);
    }

    public C5571e(C12948e c12948e, C5571e c5571e) {
        super(c12948e, c5571e);
    }

    @Override // defpackage.C3222e, defpackage.C2893e
    public C7088e adcel(int i) {
        return C7088e.metrica(this.metrica.getInsetsIgnoringVisibility(AbstractC15837e.ad(i)));
    }

    @Override // defpackage.C3222e, defpackage.C2893e
    public final void license(View view) {
    }

    @Override // defpackage.C3222e, defpackage.C2893e
    public boolean signatures(int i) {
        return this.metrica.isVisible(AbstractC15837e.ad(i));
    }

    @Override // defpackage.C3222e, defpackage.C2893e
    public C7088e startapp(int i) {
        return C7088e.metrica(this.metrica.getInsets(AbstractC15837e.ad(i)));
    }
}
