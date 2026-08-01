package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC7835e extends AbstractBinderC3782e {
    @Override // defpackage.AbstractBinderC3782e
    /* renamed from: eؚؑ۟ */
    public final boolean mo1402e(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                AbstractC9126e.metrica(parcel);
                break;
            case 4:
                AbstractC9126e.metrica(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                AbstractC9126e.metrica(parcel);
                break;
            case 7:
                AbstractC9126e.metrica(parcel);
                break;
            case 8:
                C8302e c8302e = (C8302e) AbstractC9126e.ad(parcel, C8302e.CREATOR);
                AbstractC9126e.metrica(parcel);
                BinderC7597e binderC7597e = (BinderC7597e) this;
                binderC7597e.appmetrica.post(new RunnableC17144e(binderC7597e, c8302e, false, 26));
                break;
            case 9:
                AbstractC9126e.metrica(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
