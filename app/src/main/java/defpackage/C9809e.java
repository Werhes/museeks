package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍ۠ۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9809e extends BroadcastReceiver {
    public final C15398e ad;
    public boolean metrica;
    public boolean vip;

    public C9809e(C15398e c15398e) {
        AbstractC9528e.startapp(c15398e);
        this.ad = c15398e;
    }

    public final void ad() {
        C15398e c15398e = this.ad;
        c15398e.m3947else();
        c15398e.mo2262e().mo2250e();
        c15398e.mo2262e().mo2250e();
        if (this.vip) {
            c15398e.mo2261e().f27497e.ad("Unregistering connectivity change receiver");
            this.vip = false;
            this.metrica = false;
            try {
                c15398e.f30352e.f14225e.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                c15398e.mo2261e().f27502e.vip(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C15398e c15398e = this.ad;
        c15398e.m3947else();
        String action = intent.getAction();
        c15398e.mo2261e().f27497e.vip(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            c15398e.mo2261e().f27495e.vip(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        C4172e c4172e = c15398e.f30360e;
        C15398e.m3939break(c4172e);
        boolean m1479e = c4172e.m1479e();
        if (this.metrica != m1479e) {
            this.metrica = m1479e;
            c15398e.mo2262e().m2254e(new RunnableC16721e(this, m1479e));
        }
    }
}
