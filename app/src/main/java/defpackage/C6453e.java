package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C6453e extends C4410e {
    public static final C12948e inmobi = C12948e.yandex(null, C2864e.appmetrica());

    public C6453e(C12948e c12948e, WindowInsets windowInsets) {
        super(c12948e, windowInsets);
    }

    public C6453e(C12948e c12948e, C6453e c6453e) {
        super(c12948e, c6453e);
    }

    @Override // defpackage.C3222e, defpackage.C2893e
    public void Signature(View view) {
    }

    @Override // defpackage.C5571e, defpackage.C3222e, defpackage.C2893e
    public C7088e adcel(int i) {
        return C7088e.metrica(this.metrica.getInsetsIgnoringVisibility(AbstractC15634e.ad(i)));
    }

    @Override // defpackage.C5571e, defpackage.C3222e, defpackage.C2893e
    public boolean signatures(int i) {
        return this.metrica.isVisible(AbstractC15634e.ad(i));
    }

    @Override // defpackage.C5571e, defpackage.C3222e, defpackage.C2893e
    public C7088e startapp(int i) {
        return C7088e.metrica(this.metrica.getInsets(AbstractC15634e.ad(i)));
    }
}
