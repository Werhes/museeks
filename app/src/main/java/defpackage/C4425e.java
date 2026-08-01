package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4425e implements InterfaceC12864e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC12864e f9593e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC12864e f9594e;

    public C4425e(InterfaceC12864e interfaceC12864e, InterfaceC12864e interfaceC12864e2) {
        this.f9594e = interfaceC12864e;
        this.f9593e = interfaceC12864e2;
    }

    @Override // defpackage.InterfaceC12864e
    public final Object appmetrica(Object obj, Function2 function2) {
        return this.f9593e.appmetrica(this.f9594e.appmetrica(obj, function2), function2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4425e)) {
            return false;
        }
        C4425e c4425e = (C4425e) obj;
        return AbstractC7890e.billing(this.f9594e, c4425e.f9594e) && AbstractC7890e.billing(this.f9593e, c4425e.f9593e);
    }

    public final int hashCode() {
        return (this.f9593e.hashCode() * 31) + this.f9594e.hashCode();
    }

    @Override // defpackage.InterfaceC12864e
    public final /* synthetic */ InterfaceC12864e premium(InterfaceC12864e interfaceC12864e) {
        return AbstractC5087e.isVip(this, interfaceC12864e);
    }

    public final String toString() {
        return AbstractC4653e.applovin(new StringBuilder("["), (String) appmetrica(BuildConfig.FLAVOR, C14865e.f29426e), ']');
    }

    @Override // defpackage.InterfaceC12864e
    /* renamed from: volatile */
    public final boolean mo256volatile(Function1 function1) {
        return this.f9594e.mo256volatile(function1) && this.f9593e.mo256volatile(function1);
    }
}
