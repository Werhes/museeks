package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒؔؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0811e extends AbstractC2929e {
    public final C6936e ad;
    public final C8320e vip;

    public C0811e(C6936e c6936e) {
        AbstractC9528e.startapp(c6936e);
        this.ad = c6936e;
        C8320e c8320e = c6936e.f14199e;
        C6936e.billing(c8320e);
        this.vip = c8320e;
    }

    @Override // defpackage.InterfaceC10173e
    public final void Signature(String str, String str2, Bundle bundle) {
        C8320e c8320e = this.ad.f14199e;
        C6936e.billing(c8320e);
        c8320e.m2405e(str, str2, bundle);
    }

    @Override // defpackage.InterfaceC10173e
    public final List admob(String str, String str2) {
        C8320e c8320e = this.vip;
        C6936e c6936e = (C6936e) c8320e.f36443e;
        C6915e c6915e = c6936e.f14226e;
        C13879e c13879e = c6936e.f14227e;
        C6936e.yandex(c6915e);
        if (c6915e.m2247e()) {
            C6936e.yandex(c13879e);
            c13879e.f27502e.ad("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (C7936e.yandex()) {
            C6936e.yandex(c13879e);
            c13879e.f27502e.ad("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        C6915e c6915e2 = c6936e.f14226e;
        C6936e.yandex(c6915e2);
        c6915e2.m2252e(atomicReference, 5000L, "get conditional user properties", new RunnableC11327e(c8320e, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return C5240e.m1783e(list);
        }
        C6936e.yandex(c13879e);
        c13879e.f27502e.vip(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // defpackage.InterfaceC10173e
    public final String advert() {
        C10693e c10693e = ((C6936e) this.vip.f36443e).f14200e;
        C6936e.billing(c10693e);
        C13288e c13288e = c10693e.f21066e;
        if (c13288e != null) {
            return c13288e.vip;
        }
        return null;
    }

    @Override // defpackage.InterfaceC10173e
    public final void amazon(String str) {
        C6936e c6936e = this.ad;
        C6339e c6339e = c6936e.f14204e;
        C6936e.appmetrica(c6339e);
        c6936e.f14215e.getClass();
        c6339e.m2156e(SystemClock.elapsedRealtime(), str);
    }

    @Override // defpackage.InterfaceC10173e
    public final String billing() {
        C10693e c10693e = ((C6936e) this.vip.f36443e).f14200e;
        C6936e.billing(c10693e);
        C13288e c13288e = c10693e.f21066e;
        if (c13288e != null) {
            return c13288e.ad;
        }
        return null;
    }

    @Override // defpackage.InterfaceC10173e
    public final void loadAd(String str) {
        C6936e c6936e = this.ad;
        C6339e c6339e = c6936e.f14204e;
        C6936e.appmetrica(c6339e);
        c6936e.f14215e.getClass();
        c6339e.m2155e(SystemClock.elapsedRealtime(), str);
    }

    @Override // defpackage.InterfaceC10173e
    public final long mopub() {
        C5240e c5240e = this.ad.f14223e;
        C6936e.purchase(c5240e);
        return c5240e.m1827e();
    }

    @Override // defpackage.InterfaceC10173e
    public final String pro() {
        return this.vip.m2403e();
    }

    @Override // defpackage.InterfaceC10173e
    public final String remoteconfig() {
        return (String) this.vip.f17009e.get();
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [eٕ٘ؔ, java.util.Map] */
    @Override // defpackage.InterfaceC10173e
    public final Map signatures(String str, String str2, boolean z) {
        C8320e c8320e = this.vip;
        C6936e c6936e = (C6936e) c8320e.f36443e;
        C6915e c6915e = c6936e.f14226e;
        C13879e c13879e = c6936e.f14227e;
        C6936e.yandex(c6915e);
        if (c6915e.m2247e()) {
            C6936e.yandex(c13879e);
            c13879e.f27502e.ad("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (C7936e.yandex()) {
            C6936e.yandex(c13879e);
            c13879e.f27502e.ad("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        C6915e c6915e2 = c6936e.f14226e;
        C6936e.yandex(c6915e2);
        c6915e2.m2252e(atomicReference, 5000L, "get user properties", new RunnableC13711e(c8320e, atomicReference, str, str2, z));
        List<C9097e> list = (List) atomicReference.get();
        if (list == null) {
            C6936e.yandex(c13879e);
            c13879e.f27502e.vip(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        ?? c17519e = new C17519e(list.size());
        for (C9097e c9097e : list) {
            Object billing = c9097e.billing();
            if (billing != null) {
                c17519e.put(c9097e.f18221e, billing);
            }
        }
        return c17519e;
    }

    @Override // defpackage.InterfaceC10173e
    public final void smaato(Bundle bundle) {
        C8320e c8320e = this.vip;
        ((C6936e) c8320e.f36443e).f14215e.getClass();
        c8320e.m2408e(bundle, System.currentTimeMillis());
    }

    @Override // defpackage.InterfaceC10173e
    public final int subscription(String str) {
        C8320e c8320e = this.vip;
        c8320e.getClass();
        AbstractC9528e.purchase(str);
        ((C6936e) c8320e.f36443e).getClass();
        return 25;
    }

    @Override // defpackage.InterfaceC10173e
    public final void yandex(String str, String str2, Bundle bundle) {
        this.vip.m2417e(str, str2, bundle);
    }
}
