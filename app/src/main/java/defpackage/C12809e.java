package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۡٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12809e implements InterfaceC10173e {
    public final /* synthetic */ C17768e ad;

    public C12809e(C17768e c17768e) {
        this.ad = c17768e;
    }

    @Override // defpackage.InterfaceC10173e
    public final void Signature(String str, String str2, Bundle bundle) {
        C17768e c17768e = this.ad;
        c17768e.ad(new C3413e(c17768e, str, str2, bundle, 0));
    }

    @Override // defpackage.InterfaceC10173e
    public final List admob(String str, String str2) {
        BinderC7948e binderC7948e = new BinderC7948e();
        C17768e c17768e = this.ad;
        c17768e.ad(new C2717e(c17768e, str, str2, binderC7948e));
        List list = (List) BinderC7948e.m2360e(binderC7948e.remoteconfig(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // defpackage.InterfaceC10173e
    public final String advert() {
        BinderC7948e binderC7948e = new BinderC7948e();
        C17768e c17768e = this.ad;
        c17768e.ad(new C6058e(c17768e, binderC7948e, 4, false));
        return (String) BinderC7948e.m2360e(binderC7948e.remoteconfig(500L), String.class);
    }

    @Override // defpackage.InterfaceC10173e
    public final void amazon(String str) {
        C17768e c17768e = this.ad;
        c17768e.ad(new C13819e(c17768e, str, 1));
    }

    @Override // defpackage.InterfaceC10173e
    public final String billing() {
        BinderC7948e binderC7948e = new BinderC7948e();
        C17768e c17768e = this.ad;
        c17768e.ad(new C6058e(c17768e, binderC7948e, 3, false));
        return (String) BinderC7948e.m2360e(binderC7948e.remoteconfig(500L), String.class);
    }

    @Override // defpackage.InterfaceC10173e
    public final void loadAd(String str) {
        C17768e c17768e = this.ad;
        c17768e.ad(new C13819e(c17768e, str, 0));
    }

    @Override // defpackage.InterfaceC10173e
    public final long mopub() {
        return this.ad.license();
    }

    @Override // defpackage.InterfaceC10173e
    public final String pro() {
        BinderC7948e binderC7948e = new BinderC7948e();
        C17768e c17768e = this.ad;
        c17768e.ad(new C6058e(c17768e, binderC7948e, 0));
        return (String) BinderC7948e.m2360e(binderC7948e.remoteconfig(500L), String.class);
    }

    @Override // defpackage.InterfaceC10173e
    public final String remoteconfig() {
        BinderC7948e binderC7948e = new BinderC7948e();
        C17768e c17768e = this.ad;
        c17768e.ad(new C6058e(c17768e, binderC7948e, 1));
        return (String) BinderC7948e.m2360e(binderC7948e.remoteconfig(50L), String.class);
    }

    @Override // defpackage.InterfaceC10173e
    public final Map signatures(String str, String str2, boolean z) {
        BinderC7948e binderC7948e = new BinderC7948e();
        C17768e c17768e = this.ad;
        c17768e.ad(new C1653e(c17768e, str, str2, z, binderC7948e));
        Bundle remoteconfig = binderC7948e.remoteconfig(5000L);
        if (remoteconfig == null || remoteconfig.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap(remoteconfig.size());
        for (String str3 : remoteconfig.keySet()) {
            Object obj = remoteconfig.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    @Override // defpackage.InterfaceC10173e
    public final void smaato(Bundle bundle) {
        C17768e c17768e = this.ad;
        c17768e.ad(new C1257e(c17768e, bundle, 1));
    }

    @Override // defpackage.InterfaceC10173e
    public final int subscription(String str) {
        BinderC7948e binderC7948e = new BinderC7948e();
        C17768e c17768e = this.ad;
        c17768e.ad(new C7078e(c17768e, str, binderC7948e, 1));
        Integer num = (Integer) BinderC7948e.m2360e(binderC7948e.remoteconfig(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @Override // defpackage.InterfaceC10173e
    public final void yandex(String str, String str2, Bundle bundle) {
        C17768e c17768e = this.ad;
        c17768e.ad(new C3413e(c17768e, str, str2, bundle, 1));
    }
}
