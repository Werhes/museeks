package defpackage;

import android.content.Context;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٔٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14863e implements InterfaceC5379e {
    public final Context ad;
    public boolean metrica;
    public final C3032e vip;

    public C14863e(Context context) {
        this.ad = context;
        C0381e c0381e = new C0381e(context);
        AbstractC2301e.subscription(!c0381e.metrica);
        C3032e c3032e = new C3032e(c0381e);
        c0381e.metrica = true;
        this.vip = c3032e;
    }

    @Override // defpackage.InterfaceC5379e
    public final C15400e ad() {
        return this.vip.ad();
    }

    @Override // defpackage.InterfaceC5379e
    public final C15816e metrica(C4748e c4748e, AbstractC17475e abstractC17475e, C6594e c6594e, C17825e c17825e) {
        if (!this.metrica) {
            return this.vip.metrica(c4748e, abstractC17475e, c6594e, c17825e);
        }
        Context context = this.ad;
        C11389e c11389e = new C11389e(context, "default_channel_id");
        c11389e.appmetrica = C11389e.metrica(context.getString(R.string.op_resume));
        c11389e.purchase = C11389e.metrica(context.getString(R.string.op_resume_text));
        c11389e.applovin.icon = R.drawable.op_brand_icon;
        return new C15816e(c11389e.vip());
    }

    @Override // defpackage.InterfaceC5379e
    public final void vip() {
        if (this.metrica) {
            return;
        }
        this.vip.getClass();
    }
}
