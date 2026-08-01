package defpackage;

import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؔۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC15218e implements View.OnClickListener {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ DialogC1747e f30117e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30118e;

    public /* synthetic */ ViewOnClickListenerC15218e(DialogC1747e dialogC1747e, int i) {
        this.f30118e = i;
        this.f30117e = dialogC1747e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f30118e) {
            case 0:
                this.f30117e.dismiss();
                return;
            default:
                DialogC1747e dialogC1747e = this.f30117e;
                if (dialogC1747e.f4752e.billing()) {
                    dialogC1747e.f4786e.getClass();
                    C10085e.adcel(2);
                }
                dialogC1747e.dismiss();
                return;
        }
    }
}
