package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٖۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8739e implements InterfaceC12504e, InterfaceC8427e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ long f17635e;

    public /* synthetic */ C8739e(long j) {
        this.f17635e = j;
    }

    @Override // defpackage.InterfaceC8427e
    public void accept(Object obj) {
        ((C6268e) obj).admob(this.f17635e);
    }

    @Override // defpackage.InterfaceC12504e
    public void invoke(Object obj) {
        C2691e c2691e;
        C3659e c3659e = (C3659e) obj;
        C18536e c18536e = c3659e.vip;
        if (c3659e.equals(c18536e.mopub) && (c2691e = c18536e.loadAd) != null) {
            C9860e c9860e = (C9860e) c2691e.f6570e;
            c9860e.f19462e = true;
            C17424e c17424e = c9860e.f19459e;
            Handler handler = (Handler) c17424e.f34142e;
            if (handler != null) {
                handler.post(new RunnableC0833e(c17424e, this.f17635e, 0));
            }
        }
    }
}
