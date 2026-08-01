package defpackage;

import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٜؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5751e extends AbstractC16519e {
    public final /* synthetic */ int billing;

    public /* synthetic */ C5751e(int i) {
        this.billing = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC16519e
    public final void appmetrica(C18397e c18397e, float f) {
        switch (this.billing) {
            case 0:
                ((View) c18397e).setAlpha(f);
                return;
            case 1:
                ((View) c18397e).setScaleX(f);
                return;
            case 2:
                ((View) c18397e).setScaleY(f);
                return;
            case 3:
                ((View) c18397e).setRotation(f);
                return;
            case 4:
                ((View) c18397e).setRotationX(f);
                return;
            default:
                ((View) c18397e).setRotationY(f);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC16519e
    public final float metrica(C18397e c18397e) {
        switch (this.billing) {
            case 0:
                return ((View) c18397e).getAlpha();
            case 1:
                return ((View) c18397e).getScaleX();
            case 2:
                return ((View) c18397e).getScaleY();
            case 3:
                return ((View) c18397e).getRotation();
            case 4:
                return ((View) c18397e).getRotationX();
            default:
                return ((View) c18397e).getRotationY();
        }
    }
}
