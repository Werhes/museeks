package defpackage;

import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُّۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10965e extends AbstractC11696e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final WeakReference f21720e;

    public C10965e(SwitchCompat switchCompat) {
        this.f21720e = new WeakReference(switchCompat);
    }

    @Override // defpackage.AbstractC11696e
    public final void ad() {
        SwitchCompat switchCompat = (SwitchCompat) this.f21720e.get();
        if (switchCompat != null) {
            switchCompat.metrica();
        }
    }

    @Override // defpackage.AbstractC11696e
    public final void vip() {
        SwitchCompat switchCompat = (SwitchCompat) this.f21720e.get();
        if (switchCompat != null) {
            switchCompat.metrica();
        }
    }
}
