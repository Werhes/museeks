package defpackage;

import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؕۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC3310e extends AbstractBinderC5235e implements InterfaceC7517e {
    public final /* synthetic */ C10640e license;
    public final /* synthetic */ AtomicReference metrica;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC3310e(C10640e c10640e, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.metrica = atomicReference;
        this.license = c10640e;
    }

    @Override // defpackage.AbstractBinderC5235e
    public final boolean adcel(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        C10939e c10939e = (C10939e) AbstractC1757e.ad(parcel, C10939e.CREATOR);
        AbstractC1757e.license(parcel);
        mo1337e(c10939e);
        return true;
    }

    @Override // defpackage.InterfaceC7517e
    /* renamed from: eْٗۚ, reason: contains not printable characters */
    public final void mo1337e(C10939e c10939e) {
        AtomicReference atomicReference = this.metrica;
        synchronized (atomicReference) {
            C13879e c13879e = ((C6936e) this.license.f36443e).f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27497e.vip(Integer.valueOf(c10939e.f21670e.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(c10939e);
            atomicReference.notifyAll();
        }
    }
}
