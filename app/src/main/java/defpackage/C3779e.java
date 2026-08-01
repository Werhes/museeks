package defpackage;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import java.util.Stack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؕۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3779e extends AbstractC5004e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final boolean f8382e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public AbstractC10347e f8383e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public C1059e f8384e;

    public C3779e(AbstractC10347e abstractC10347e, int i) {
        super(false, false);
        this.f8383e = abstractC10347e;
        this.f8382e = false;
    }

    @Override // defpackage.AbstractC5004e
    public final void admob() {
        super.admob();
        C1059e c1059e = this.f8384e;
        if (c1059e != null) {
            AbstractC16398e.vip(c1059e, C1380e.f4173e);
        }
    }

    @Override // defpackage.AbstractC5004e
    public final void amazon() {
        super.amazon();
        C1059e c1059e = this.f8384e;
        if (c1059e != null) {
            AbstractC16398e.vip(c1059e, C7143e.f14623e);
        }
        C1059e c1059e2 = this.f8384e;
        if (c1059e2 != null) {
            c1059e2.amazon(new Stack(), false);
        }
        C1059e c1059e3 = this.f8384e;
        if (c1059e3 != null) {
            c1059e3.removeAllViews();
        }
        this.f8384e = null;
        this.f8383e = null;
    }

    @Override // defpackage.AbstractC5004e
    public final void appmetrica(int i, int i2) {
        C1059e c1059e = this.f8384e;
        if (c1059e != null) {
            c1059e.metrica(i + i2);
        }
    }

    @Override // defpackage.AbstractC5004e
    public final int billing() {
        return this.f8382e ? -1 : -2;
    }

    @Override // defpackage.AbstractC5004e
    public final void remoteconfig(View view) {
        this.f8384e.smaato(this.f8383e);
        this.f8384e.setBackgroundColor(AbstractC15933e.ad(R.attr.windowBackground));
    }

    @Override // defpackage.AbstractC5004e
    public final View smaato(ViewGroup viewGroup) {
        C1059e c1059e = new C1059e(this.f10582e);
        this.f8384e = c1059e;
        return c1059e;
    }

    @Override // defpackage.AbstractC5004e
    public final void subscription() {
        super.subscription();
        C1059e c1059e = this.f8384e;
        if (c1059e != null) {
            AbstractC16398e.vip(c1059e, C15041e.f29802e);
        }
    }
}
