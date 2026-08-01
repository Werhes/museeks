package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۧؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9132e implements InterfaceC7189e {
    public final InterfaceC7189e ad;
    public final InterfaceC7189e vip;

    public C9132e(InterfaceC7189e interfaceC7189e, InterfaceC7189e interfaceC7189e2) {
        this.ad = interfaceC7189e;
        this.vip = interfaceC7189e2;
    }

    @Override // defpackage.InterfaceC7189e
    public final Object appmetrica(Object obj, Function2 function2) {
        return this.vip.appmetrica(this.ad.appmetrica(obj, function2), function2);
    }

    @Override // defpackage.InterfaceC7189e
    public final boolean billing(C17187e c17187e) {
        return this.ad.billing(c17187e) && this.vip.billing(c17187e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9132e)) {
            return false;
        }
        C9132e c9132e = (C9132e) obj;
        return AbstractC7890e.billing(this.ad, c9132e.ad) && AbstractC7890e.billing(this.vip, c9132e.vip);
    }

    public final int hashCode() {
        return (this.vip.hashCode() * 31) + this.ad.hashCode();
    }

    @Override // defpackage.InterfaceC7189e
    public final /* synthetic */ InterfaceC7189e purchase(InterfaceC7189e interfaceC7189e) {
        return AbstractC0869e.mopub(this, interfaceC7189e);
    }

    public final String toString() {
        return AbstractC4653e.applovin(new StringBuilder("["), (String) appmetrica(BuildConfig.FLAVOR, new C8171e(17)), ']');
    }

    @Override // defpackage.InterfaceC7189e
    public final boolean yandex(Function1 function1) {
        return this.ad.yandex(function1) || this.vip.yandex(function1);
    }
}
