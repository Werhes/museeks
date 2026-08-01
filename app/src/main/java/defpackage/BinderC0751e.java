package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒؐؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC0751e extends AbstractBinderC3782e implements InterfaceC10241e {
    public final /* synthetic */ C8988e appmetrica;
    public final /* synthetic */ int license;

    public BinderC0751e() {
        super("com.google.android.gms.cast.internal.IBundleCallback", 2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BinderC0751e(C4480e c4480e, C8988e c8988e) {
        this();
        this.license = 0;
        this.appmetrica = c8988e;
        Objects.requireNonNull(c4480e);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BinderC0751e(C4480e c4480e, C8988e c8988e, int i) {
        this();
        this.license = i;
        this.appmetrica = c8988e;
    }

    @Override // defpackage.AbstractBinderC3782e
    /* renamed from: eٍۡ, reason: contains not printable characters */
    public final boolean mo399e(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC3336e.ad(parcel, Bundle.CREATOR);
        AbstractC3336e.license(parcel);
        tapsense(bundle);
        return true;
    }

    @Override // defpackage.InterfaceC10241e
    public final void tapsense(Bundle bundle) {
        switch (this.license) {
            case 0:
                this.appmetrica.vip(bundle);
                return;
            case 1:
                this.appmetrica.vip(bundle);
                return;
            default:
                this.appmetrica.vip(bundle);
                return;
        }
    }
}
