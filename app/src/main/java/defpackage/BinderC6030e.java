package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۤۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC6030e extends AbstractBinderC3782e implements InterfaceC13316e {
    public final /* synthetic */ C8988e appmetrica;
    public final /* synthetic */ int license;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC6030e(C4480e c4480e, C8988e c8988e, int i) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 1);
        this.license = i;
        this.appmetrica = c8988e;
    }

    @Override // defpackage.AbstractBinderC3782e
    /* renamed from: eؚؑ۟ */
    public final boolean mo1402e(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Status status = (Status) AbstractC9126e.ad(parcel, Status.CREATOR);
            C9810e c9810e = (C9810e) AbstractC9126e.ad(parcel, C9810e.CREATOR);
            AbstractC9126e.metrica(parcel);
            mo2016private(status, c9810e);
            return true;
        }
        if (i == 2) {
            Status status2 = (Status) AbstractC9126e.ad(parcel, Status.CREATOR);
            C4453e c4453e = (C4453e) AbstractC9126e.ad(parcel, C4453e.CREATOR);
            AbstractC9126e.metrica(parcel);
            mo2017super(status2, c4453e);
            return true;
        }
        if (i == 3) {
            AbstractC9126e.metrica(parcel);
            throw new UnsupportedOperationException();
        }
        if (i != 4) {
            return false;
        }
        AbstractC9126e.metrica(parcel);
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC13316e
    /* renamed from: private, reason: not valid java name */
    public void mo2016private(Status status, C9810e c9810e) {
        switch (this.license) {
            case 0:
                AbstractC3697e.startapp(status, c9810e, this.appmetrica);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.InterfaceC13316e
    /* renamed from: super, reason: not valid java name */
    public void mo2017super(Status status, C4453e c4453e) {
        switch (this.license) {
            case 1:
                AbstractC3697e.startapp(status, c4453e, this.appmetrica);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
