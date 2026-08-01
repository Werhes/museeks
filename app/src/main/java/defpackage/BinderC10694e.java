package defpackage;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَّۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC10694e extends AbstractBinderC5235e implements InterfaceC6486e {
    public final /* synthetic */ AtomicReference metrica;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC10694e(C10640e c10640e, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.metrica = atomicReference;
    }

    @Override // defpackage.AbstractBinderC5235e
    public final boolean adcel(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(C6471e.CREATOR);
        AbstractC1757e.license(parcel);
        mo2189e(createTypedArrayList);
        return true;
    }

    @Override // defpackage.InterfaceC6486e
    /* renamed from: eۣؗۙ */
    public final void mo2189e(List list) {
        AtomicReference atomicReference = this.metrica;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
