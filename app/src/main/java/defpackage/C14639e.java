package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٔٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14639e extends AbstractC18292e {
    public final /* synthetic */ Object appmetrica;
    public final /* synthetic */ int license;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14639e(int i, Object obj) {
        super(5);
        this.license = i;
        this.appmetrica = obj;
    }

    private final void adcel(int i) {
    }

    @Override // defpackage.AbstractC18292e
    public final void billing(Typeface typeface, boolean z) {
        switch (this.license) {
            case 0:
                Chip chip = (Chip) this.appmetrica;
                C15411e c15411e = chip.f841e;
                chip.setText(c15411e.f30422e ? c15411e.f30419e : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (z) {
                    return;
                }
                C4925e c4925e = (C4925e) this.appmetrica;
                c4925e.appmetrica = true;
                InterfaceC6586e interfaceC6586e = (InterfaceC6586e) c4925e.purchase.get();
                if (interfaceC6586e != null) {
                    interfaceC6586e.ad();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.AbstractC18292e
    public final void purchase(int i) {
        switch (this.license) {
            case 0:
                return;
            default:
                C4925e c4925e = (C4925e) this.appmetrica;
                c4925e.appmetrica = true;
                InterfaceC6586e interfaceC6586e = (InterfaceC6586e) c4925e.purchase.get();
                if (interfaceC6586e != null) {
                    interfaceC6586e.ad();
                    return;
                }
                return;
        }
    }
}
