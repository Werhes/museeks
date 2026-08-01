package defpackage;

import android.content.Intent;
import android.os.SystemClock;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9940e extends AbstractC11861e {
    public final /* synthetic */ int appmetrica;
    public final /* synthetic */ Object purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9940e(Object obj, InterfaceC17023e interfaceC17023e, int i) {
        super(interfaceC17023e);
        this.appmetrica = i;
        this.purchase = obj;
    }

    @Override // defpackage.AbstractC11861e
    public final void ad() {
        switch (this.appmetrica) {
            case 0:
                C18524e c18524e = (C18524e) this.purchase;
                C2285e c2285e = (C2285e) c18524e.f36316e;
                c2285e.mo2250e();
                C6936e c6936e = (C6936e) c2285e.f36443e;
                c6936e.f14215e.getClass();
                c18524e.yandex(SystemClock.elapsedRealtime(), false, false);
                C6339e c6339e = c6936e.f14204e;
                C6936e.appmetrica(c6339e);
                c6936e.f14215e.getClass();
                c6339e.m2158e(SystemClock.elapsedRealtime());
                return;
            case 1:
                C11825e c11825e = (C11825e) this.purchase;
                c11825e.m3276e();
                C13879e c13879e = ((C6936e) c11825e.f36443e).f14227e;
                C6936e.yandex(c13879e);
                c13879e.f27497e.ad("Starting upload from DelayedRunnable");
                c11825e.f19060e.advert();
                return;
            default:
                C15398e c15398e = (C15398e) this.purchase;
                c15398e.mo2262e().mo2250e();
                String str = (String) c15398e.f30361e.pollFirst();
                if (str != null) {
                    c15398e.mo2259e().getClass();
                    c15398e.f30363e = SystemClock.elapsedRealtime();
                    c15398e.mo2261e().f27497e.vip(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    C15398e.m3941try(c15398e.f30352e.f14225e, intent);
                }
                c15398e.subs();
                return;
        }
    }
}
