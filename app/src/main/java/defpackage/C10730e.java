package defpackage;

import android.graphics.drawable.Animatable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؑٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10730e extends AbstractC16425e {
    public final /* synthetic */ int appmetrica;
    public final Animatable purchase;

    public /* synthetic */ C10730e(Animatable animatable, int i) {
        this.appmetrica = i;
        this.purchase = animatable;
    }

    @Override // defpackage.AbstractC16425e
    public final void startapp() {
        switch (this.appmetrica) {
            case 0:
                this.purchase.stop();
                return;
            default:
                ((C0497e) this.purchase).stop();
                return;
        }
    }

    @Override // defpackage.AbstractC16425e
    public final void yandex() {
        switch (this.appmetrica) {
            case 0:
                this.purchase.start();
                return;
            default:
                ((C0497e) this.purchase).start();
                return;
        }
    }
}
