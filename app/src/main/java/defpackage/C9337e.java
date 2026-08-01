package defpackage;

import android.content.Context;
import android.view.View;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌٍ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9337e extends C13048e {
    public final /* synthetic */ int advert = 0;
    public final /* synthetic */ C13631e smaato;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9337e(C13631e c13631e, Context context, SubMenuC1355e subMenuC1355e, View view) {
        super(context, subMenuC1355e, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.smaato = c13631e;
        if ((subMenuC1355e.f4152e.f19746e & 32) != 32) {
            View view2 = c13631e.f27049e;
            this.appmetrica = view2 == null ? (View) c13631e.f27043e : view2;
        }
        C5389e c5389e = c13631e.f27048e;
        this.yandex = c5389e;
        AbstractC7413e abstractC7413e = this.startapp;
        if (abstractC7413e != null) {
            abstractC7413e.billing(c5389e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9337e(C13631e c13631e, Context context, MenuC8939e menuC8939e, View view) {
        super(context, menuC8939e, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.smaato = c13631e;
        this.purchase = 8388613;
        C5389e c5389e = c13631e.f27048e;
        this.yandex = c5389e;
        AbstractC7413e abstractC7413e = this.startapp;
        if (abstractC7413e != null) {
            abstractC7413e.billing(c5389e);
        }
    }

    @Override // defpackage.C13048e
    public final void metrica() {
        switch (this.advert) {
            case 0:
                C13631e c13631e = this.smaato;
                c13631e.f27053e = null;
                c13631e.getClass();
                super.metrica();
                return;
            default:
                C13631e c13631e2 = this.smaato;
                MenuC8939e menuC8939e = c13631e2.f27034e;
                if (menuC8939e != null) {
                    menuC8939e.metrica(true);
                }
                c13631e2.f27046e = null;
                super.metrica();
                return;
        }
    }
}
