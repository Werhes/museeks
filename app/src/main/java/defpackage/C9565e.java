package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٚۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9565e extends AbstractC15825e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f18981e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final View f18982e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f18983e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int[] f18984e;

    public C9565e(View view) {
        super(0);
        this.f18984e = new int[2];
        this.f18982e = view;
    }

    @Override // defpackage.AbstractC15825e
    public final void advert(C12773e c12773e) {
        this.f18982e.setTranslationY(0.0f);
    }

    @Override // defpackage.AbstractC15825e
    public final C12948e amazon(C12948e c12948e, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((C12773e) it.next()).ad.license() & 8) != 0) {
                this.f18982e.setTranslationY(AbstractC16664e.metrica(this.f18981e, r0.ad.metrica(), 0));
                break;
            }
        }
        return c12948e;
    }

    @Override // defpackage.AbstractC15825e
    public final C7302e loadAd(C12773e c12773e, C7302e c7302e) {
        View view = this.f18982e;
        int[] iArr = this.f18984e;
        view.getLocationOnScreen(iArr);
        int i = this.f18983e - iArr[1];
        this.f18981e = i;
        view.setTranslationY(i);
        return c7302e;
    }

    @Override // defpackage.AbstractC15825e
    public final void smaato(C12773e c12773e) {
        View view = this.f18982e;
        int[] iArr = this.f18984e;
        view.getLocationOnScreen(iArr);
        this.f18983e = iArr[1];
    }
}
