package defpackage;

import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؓۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC12223e implements View.OnClickListener {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C17256e f24542e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f24543e;

    public /* synthetic */ ViewOnClickListenerC12223e(C17256e c17256e, int i) {
        this.f24543e = i;
        this.f24542e = c17256e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f24543e) {
            case 0:
                AbstractC10716e abstractC10716e = this.f24542e.appmetrica;
                if (abstractC10716e != null) {
                    abstractC10716e.mo734case();
                    return;
                }
                return;
            default:
                AbstractC10716e abstractC10716e2 = this.f24542e.appmetrica;
                AbstractC3655e abstractC3655e = abstractC10716e2 instanceof AbstractC3655e ? (AbstractC3655e) abstractC10716e2 : null;
                if (abstractC3655e != null) {
                    abstractC3655e.smaato();
                    return;
                }
                return;
        }
    }
}
