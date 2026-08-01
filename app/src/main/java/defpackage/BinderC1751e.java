package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؓؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC1751e extends AbstractBinderC3782e implements InterfaceC9895e, InterfaceC0664e {
    public final C17548e appmetrica;
    public final C2580e license;
    public final C17548e purchase;

    public BinderC1751e(C2580e c2580e) {
        super("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener", 5);
        this.appmetrica = new C17548e(0);
        this.purchase = new C17548e(0);
        this.license = c2580e;
    }

    @Override // defpackage.InterfaceC9895e
    public final synchronized void appmetrica() {
        try {
            C17548e c17548e = this.appmetrica;
            c17548e.getClass();
            C6748e c6748e = new C6748e(c17548e);
            while (c6748e.hasNext()) {
                this.license.ad(new C13496e((String) c6748e.next(), 0));
            }
            this.appmetrica.clear();
            C17548e c17548e2 = this.purchase;
            c17548e2.getClass();
            C6748e c6748e2 = new C6748e(c17548e2);
            while (c6748e2.hasNext()) {
                this.license.ad(new C13496e((String) c6748e2.next(), 1));
            }
            this.purchase.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: eٜؑ٘, reason: contains not printable characters */
    public final synchronized void m686e(C2186e c2186e) {
        try {
            this.appmetrica.remove(c2186e.f5554e);
            Status crashlytics = C7971e.crashlytics(c2186e.f5552e);
            if (crashlytics.billing()) {
                this.purchase.add(c2186e.f5554e);
            }
            this.license.ad(new C16542e(c2186e, crashlytics, 0));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.AbstractBinderC3782e
    /* renamed from: eًٖٕ, reason: contains not printable characters */
    public final boolean mo687e(Parcel parcel, int i) {
        if (i == 2) {
            C6719e c6719e = (C6719e) AbstractC0923e.ad(parcel, C6719e.CREATOR);
            AbstractC0923e.vip(parcel);
            m688e(c6719e);
            return true;
        }
        if (i == 3) {
            C2186e c2186e = (C2186e) AbstractC0923e.ad(parcel, C2186e.CREATOR);
            AbstractC0923e.vip(parcel);
            m686e(c2186e);
            return true;
        }
        if (i != 4) {
            if (i != 5) {
                return false;
            }
            C5090e c5090e = (C5090e) AbstractC0923e.ad(parcel, C5090e.CREATOR);
            AbstractC0923e.vip(parcel);
            this.license.ad(new C12276e(c5090e, 2));
            return true;
        }
        C17470e c17470e = (C17470e) AbstractC0923e.ad(parcel, C17470e.CREATOR);
        AbstractC0923e.vip(parcel);
        synchronized (this) {
            this.purchase.remove(c17470e.f34219e);
            this.license.ad(new C12276e(c17470e, 1));
        }
        return true;
    }

    /* renamed from: eٖۤٝ, reason: contains not printable characters */
    public final synchronized void m688e(C6719e c6719e) {
        this.appmetrica.add(c6719e.f13882e);
        this.license.ad(new C12276e(c6719e, 0));
    }
}
