package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٖۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC6435e extends AbstractBinderC3782e implements InterfaceC9072e {
    public final C4627e license;

    public BinderC6435e(C4627e c4627e) {
        super("com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener", 5);
        this.license = c4627e;
    }

    @Override // defpackage.AbstractBinderC3782e
    /* renamed from: eًٖٕ */
    public final boolean mo687e(Parcel parcel, int i) {
        if (i != 2) {
            return false;
        }
        C3777e c3777e = (C3777e) AbstractC0923e.ad(parcel, C3777e.CREATOR);
        AbstractC0923e.vip(parcel);
        Status crashlytics = C7971e.crashlytics(c3777e.f8377e);
        boolean billing = crashlytics.billing();
        C4627e c4627e = this.license;
        if (billing) {
            c4627e.ad.vip(null);
            return true;
        }
        c4627e.getClass();
        c4627e.ad.ad(new C10427e(crashlytics));
        return true;
    }
}
