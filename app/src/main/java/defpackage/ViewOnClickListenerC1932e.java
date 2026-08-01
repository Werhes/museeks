package defpackage;

import android.os.Handler;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؓٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1932e implements View.OnClickListener {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Handler f5124e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4246e f5125e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ DialogC11829e f5126e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5127e;

    public /* synthetic */ ViewOnClickListenerC1932e(C4246e c4246e, Handler handler, DialogC11829e dialogC11829e, int i) {
        this.f5127e = i;
        this.f5125e = c4246e;
        this.f5124e = handler;
        this.f5126e = dialogC11829e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5127e) {
            case 0:
                InterfaceC10500e interfaceC10500e = (InterfaceC10500e) this.f5125e.f9318e;
                if (interfaceC10500e != null) {
                    interfaceC10500e.Signature(null);
                }
                this.f5124e.removeCallbacksAndMessages(null);
                this.f5126e.dismiss();
                return;
            default:
                InterfaceC10500e interfaceC10500e2 = (InterfaceC10500e) this.f5125e.f9318e;
                if (interfaceC10500e2 != null) {
                    interfaceC10500e2.Signature(null);
                }
                this.f5124e.removeCallbacksAndMessages(null);
                this.f5126e.dismiss();
                return;
        }
    }
}
