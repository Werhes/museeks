package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؕٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3413e extends AbstractRunnableC4951e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f7634e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Bundle f7635e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ C17768e f7636e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ String f7637e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ String f7638e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3413e(C17768e c17768e, String str, String str2, Bundle bundle, int i) {
        super(c17768e, true);
        this.f7634e = i;
        switch (i) {
            case 1:
                this.f7638e = str;
                this.f7637e = str2;
                this.f7635e = bundle;
                Objects.requireNonNull(c17768e);
                this.f7636e = c17768e;
                super(c17768e, true);
                return;
            default:
                this.f7638e = str;
                this.f7637e = str2;
                this.f7635e = bundle;
                this.f7636e = c17768e;
                return;
        }
    }

    @Override // defpackage.AbstractRunnableC4951e
    public final void ad() {
        switch (this.f7634e) {
            case 0:
                InterfaceC3741e interfaceC3741e = this.f7636e.purchase;
                AbstractC9528e.startapp(interfaceC3741e);
                interfaceC3741e.clearConditionalUserProperty(this.f7638e, this.f7637e, this.f7635e);
                return;
            default:
                long j = this.f10474e;
                long j2 = this.f10472e;
                InterfaceC3741e interfaceC3741e2 = this.f7636e.purchase;
                AbstractC9528e.startapp(interfaceC3741e2);
                interfaceC3741e2.logEventWithElapsedTime(this.f7638e, this.f7637e, this.f7635e, true, true, j, j2);
                return;
        }
    }
}
