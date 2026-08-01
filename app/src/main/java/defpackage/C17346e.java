package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٗۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17346e extends C14089e {
    public C17346e(C12948e c12948e, WindowInsets windowInsets) {
        super(c12948e, windowInsets);
    }

    public C17346e(C12948e c12948e, C17346e c17346e) {
        super(c12948e, c17346e);
    }

    @Override // defpackage.C2893e
    public C12948e ad() {
        return C12948e.yandex(null, this.metrica.consumeDisplayCutout());
    }

    @Override // defpackage.C3222e, defpackage.C2893e
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17346e)) {
            return false;
        }
        C17346e c17346e = (C17346e) obj;
        return Objects.equals(this.metrica, c17346e.metrica) && Objects.equals(this.billing, c17346e.billing) && C3222e.m1324while(this.yandex, c17346e.yandex);
    }

    @Override // defpackage.C2893e
    public int hashCode() {
        return this.metrica.hashCode();
    }

    @Override // defpackage.C2893e
    public C10119e yandex() {
        DisplayCutout displayCutout = this.metrica.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C10119e(displayCutout);
    }
}
