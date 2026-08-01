package defpackage;

import android.content.DialogInterface;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُُؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC10930e implements DialogInterface.OnClickListener {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f21647e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f21648e;

    public /* synthetic */ DialogInterfaceOnClickListenerC10930e(int i, Object obj) {
        this.f21648e = i;
        this.f21647e = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f21648e) {
            case 0:
                C15820e c15820e = (C15820e) this.f21647e;
                dialogInterface.dismiss();
                AbstractC16519e.ad(c15820e, c15820e.pro(), false, new C17716e(c15820e, null, 1));
                return;
            case 1:
                C15820e c15820e2 = (C15820e) this.f21647e;
                dialogInterface.dismiss();
                C15820e.m4026switch(c15820e2, new C16668e(c15820e2, 2));
                return;
            default:
                C16200e c16200e = (C16200e) this.f21647e;
                dialogInterface.dismiss();
                c16200e.invoke();
                return;
        }
    }
}
