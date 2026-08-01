package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؚۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C7002e extends C17346e {
    public C7088e pro;
    public C7088e signatures;
    public C7088e tapsense;

    public C7002e(C12948e c12948e, WindowInsets windowInsets) {
        super(c12948e, windowInsets);
        this.pro = null;
        this.signatures = null;
        this.tapsense = null;
    }

    public C7002e(C12948e c12948e, C7002e c7002e) {
        super(c12948e, c7002e);
        this.pro = null;
        this.signatures = null;
        this.tapsense = null;
    }

    @Override // defpackage.C14089e, defpackage.C2893e
    public void applovin(C7088e c7088e) {
    }

    @Override // defpackage.C2893e
    public C7088e loadAd() {
        if (this.tapsense == null) {
            this.tapsense = C7088e.metrica(this.metrica.getTappableElementInsets());
        }
        return this.tapsense;
    }

    @Override // defpackage.C2893e
    public C7088e mopub() {
        if (this.signatures == null) {
            this.signatures = C7088e.metrica(this.metrica.getMandatorySystemGestureInsets());
        }
        return this.signatures;
    }

    @Override // defpackage.C2893e
    public C7088e smaato() {
        if (this.pro == null) {
            this.pro = C7088e.metrica(this.metrica.getSystemGestureInsets());
        }
        return this.pro;
    }

    @Override // defpackage.C3222e, defpackage.C2893e
    public C12948e subscription(int i, int i2, int i3, int i4) {
        return C12948e.yandex(null, this.metrica.inset(i, i2, i3, i4));
    }
}
