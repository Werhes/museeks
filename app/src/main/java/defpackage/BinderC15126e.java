package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۧۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC15126e extends AbstractBinderC3782e implements InterfaceC15589e {
    public final /* synthetic */ C8988e license;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC15126e(C4480e c4480e, C8988e c8988e) {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks", 2);
        this.license = c8988e;
        Objects.requireNonNull(c4480e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؕؕٗ, java.lang.Object] */
    @Override // defpackage.InterfaceC15589e
    /* renamed from: eؙؖؗ, reason: contains not printable characters */
    public final void mo3922e(Status status, C13975e c13975e) {
        C18187e c18187e = new C18187e(c13975e);
        ?? obj = new Object();
        obj.ad = c18187e;
        AbstractC3697e.yandex(status, obj, this.license);
    }

    @Override // defpackage.AbstractBinderC3782e
    /* renamed from: eٍۡ */
    public final boolean mo399e(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                Status status = (Status) AbstractC3336e.ad(parcel, Status.CREATOR);
                C13975e c13975e = (C13975e) AbstractC3336e.ad(parcel, C13975e.CREATOR);
                AbstractC3336e.license(parcel);
                mo3922e(status, c13975e);
                return true;
            case 3:
                AbstractC3336e.license(parcel);
                throw new IllegalStateException("Not implemented.");
            case 4:
                AbstractC3336e.license(parcel);
                throw new IllegalStateException("Not implemented.");
            case 5:
                Status status2 = (Status) AbstractC3336e.ad(parcel, Status.CREATOR);
                AbstractC3336e.license(parcel);
                mo3923throw(status2);
                return true;
            case 6:
                parcel.createStringArrayList();
                AbstractC3336e.license(parcel);
                throw new IllegalStateException("Not implemented.");
            case 7:
                AbstractC3336e.license(parcel);
                throw new IllegalStateException("Not implemented.");
            case 8:
                parcel.readInt();
                AbstractC3336e.license(parcel);
                throw new IllegalStateException("Not implemented.");
            case 9:
                AbstractC3336e.license(parcel);
                throw new IllegalStateException("Not implemented");
            case 10:
                AbstractC3336e.license(parcel);
                throw new IllegalStateException("Not implemented");
            case 11:
                AbstractC3336e.license(parcel);
                throw new IllegalStateException("Not implemented.");
            case 12:
                AbstractC3336e.license(parcel);
                throw new IllegalStateException("Not implemented.");
            case 13:
                AbstractC3336e.license(parcel);
                throw new IllegalStateException("Not implemented.");
            case 14:
                AbstractC3336e.license(parcel);
                throw new IllegalStateException("Not implemented.");
            case 15:
                AbstractC3336e.license(parcel);
                throw new IllegalStateException("Not implemented.");
            default:
                return false;
        }
    }

    @Override // defpackage.InterfaceC15589e
    /* renamed from: throw, reason: not valid java name */
    public void mo3923throw(Status status) {
        throw new IllegalStateException("Not implemented.");
    }
}
