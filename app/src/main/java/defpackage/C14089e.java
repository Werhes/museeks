package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٓٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C14089e extends C3222e {
    public C7088e remoteconfig;

    public C14089e(C12948e c12948e, WindowInsets windowInsets) {
        super(c12948e, windowInsets);
        this.remoteconfig = null;
    }

    public C14089e(C12948e c12948e, C14089e c14089e) {
        super(c12948e, c14089e);
        this.remoteconfig = null;
        this.remoteconfig = c14089e.remoteconfig;
    }

    @Override // defpackage.C2893e
    public final C7088e advert() {
        if (this.remoteconfig == null) {
            WindowInsets windowInsets = this.metrica;
            this.remoteconfig = C7088e.vip(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.remoteconfig;
    }

    @Override // defpackage.C2893e
    public void applovin(C7088e c7088e) {
        this.remoteconfig = c7088e;
    }

    @Override // defpackage.C2893e
    public C12948e metrica() {
        return C12948e.yandex(null, this.metrica.consumeSystemWindowInsets());
    }

    @Override // defpackage.C2893e
    public boolean remoteconfig() {
        return this.metrica.isConsumed();
    }

    @Override // defpackage.C2893e
    public C12948e vip() {
        return C12948e.yandex(null, this.metrica.consumeStableInsets());
    }
}
