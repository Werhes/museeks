package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕ٘ۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC15538e extends AbstractBinderC5235e {
    public final Object license;
    public final /* synthetic */ int metrica = 2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC15538e(C3355e c3355e, C2580e c2580e) {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
        this.license = c2580e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC15538e(C3355e c3355e, C8988e c8988e) {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
        this.license = c8988e;
    }

    public BinderC15538e(C8988e c8988e) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.license = c8988e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [eُؚؖ, java.lang.Object, eؔؖۥ] */
    @Override // defpackage.AbstractBinderC5235e
    public final boolean adcel(int i, Parcel parcel, Parcel parcel2) {
        switch (this.metrica) {
            case 0:
                if (i != 2) {
                    return false;
                }
                Status status = (Status) AbstractC1757e.ad(parcel, Status.CREATOR);
                byte[] createByteArray = parcel.createByteArray();
                AbstractC1757e.license(parcel);
                C8988e c8988e = (C8988e) this.license;
                if (status.billing()) {
                    try {
                        C17268e c17268e = C17268e.ad;
                        int i2 = AbstractC3433e.ad;
                        AbstractC3697e.yandex(status, C6784e.isVip(createByteArray, C17268e.vip), c8988e);
                    } catch (C10895e e) {
                        c8988e.ad(e);
                    }
                } else {
                    AbstractC3697e.yandex(status, null, c8988e);
                }
                return true;
            case 1:
                C8988e c8988e2 = (C8988e) this.license;
                switch (i) {
                    case 1:
                        Status status2 = (Status) AbstractC1757e.ad(parcel, Status.CREATOR);
                        AbstractC1757e.license(parcel);
                        AbstractC3697e.yandex(status2, null, c8988e2);
                        break;
                    case 2:
                        Status status3 = (Status) AbstractC1757e.ad(parcel, Status.CREATOR);
                        AbstractC1757e.license(parcel);
                        AbstractC3697e.yandex(status3, null, c8988e2);
                        break;
                    case 3:
                        Status status4 = (Status) AbstractC1757e.ad(parcel, Status.CREATOR);
                        AbstractC1757e.license(parcel);
                        AbstractC3697e.yandex(status4, null, c8988e2);
                        break;
                    case 4:
                        Status status5 = (Status) AbstractC1757e.ad(parcel, Status.CREATOR);
                        C12289e c12289e = (C12289e) AbstractC1757e.ad(parcel, C12289e.CREATOR);
                        AbstractC1757e.license(parcel);
                        AbstractC3697e.yandex(status5, c12289e, c8988e2);
                        break;
                    case 5:
                        Status status6 = (Status) AbstractC1757e.ad(parcel, Status.CREATOR);
                        AbstractC1757e.license(parcel);
                        AbstractC3697e.yandex(status6, null, c8988e2);
                        break;
                    case 6:
                        Status status7 = (Status) AbstractC1757e.ad(parcel, Status.CREATOR);
                        C6734e c6734e = (C6734e) AbstractC1757e.ad(parcel, C6734e.CREATOR);
                        AbstractC1757e.license(parcel);
                        AbstractC3697e.yandex(status7, c6734e, c8988e2);
                        break;
                    case 7:
                        Status status8 = (Status) AbstractC1757e.ad(parcel, Status.CREATOR);
                        C5731e c5731e = (C5731e) AbstractC1757e.ad(parcel, C5731e.CREATOR);
                        AbstractC1757e.license(parcel);
                        AbstractC3697e.yandex(status8, c5731e, c8988e2);
                        break;
                    case 8:
                        Status status9 = (Status) AbstractC1757e.ad(parcel, Status.CREATOR);
                        AbstractC1757e.license(parcel);
                        AbstractC3697e.yandex(status9, null, c8988e2);
                        break;
                    case 9:
                        Status status10 = (Status) AbstractC1757e.ad(parcel, Status.CREATOR);
                        C11665e c11665e = (C11665e) AbstractC1757e.ad(parcel, C11665e.CREATOR);
                        AbstractC1757e.license(parcel);
                        AbstractC3697e.yandex(status10, c11665e, c8988e2);
                        break;
                    case 10:
                        Status status11 = (Status) AbstractC1757e.ad(parcel, Status.CREATOR);
                        C12289e c12289e2 = (C12289e) AbstractC1757e.ad(parcel, C12289e.CREATOR);
                        AbstractC1757e.license(parcel);
                        AbstractC3697e.yandex(status11, c12289e2, c8988e2);
                        break;
                    case 11:
                        Status status12 = (Status) AbstractC1757e.ad(parcel, Status.CREATOR);
                        parcel.readLong();
                        AbstractC1757e.license(parcel);
                        AbstractC3697e.yandex(status12, null, c8988e2);
                        break;
                    case 12:
                        Status status13 = (Status) AbstractC1757e.ad(parcel, Status.CREATOR);
                        AbstractC1757e.license(parcel);
                        AbstractC3697e.yandex(status13, null, c8988e2);
                        break;
                    case 13:
                        Status status14 = (Status) AbstractC1757e.ad(parcel, Status.CREATOR);
                        C12464e c12464e = (C12464e) AbstractC1757e.ad(parcel, C12464e.CREATOR);
                        AbstractC1757e.license(parcel);
                        AbstractC3697e.yandex(status14, c12464e, c8988e2);
                        break;
                    case 14:
                        Status status15 = (Status) AbstractC1757e.ad(parcel, Status.CREATOR);
                        AbstractC1757e.license(parcel);
                        AbstractC3697e.yandex(status15, null, c8988e2);
                        break;
                    case 15:
                        Status status16 = (Status) AbstractC1757e.ad(parcel, Status.CREATOR);
                        AbstractC1757e.license(parcel);
                        AbstractC3697e.yandex(status16, null, c8988e2);
                        break;
                    case 16:
                        Status status17 = (Status) AbstractC1757e.ad(parcel, Status.CREATOR);
                        long readLong = parcel.readLong();
                        AbstractC1757e.license(parcel);
                        AbstractC3697e.yandex(status17, Long.valueOf(readLong), c8988e2);
                        break;
                    default:
                        return false;
                }
                return true;
            default:
                if (i != 2) {
                    return false;
                }
                byte[] createByteArray2 = parcel.createByteArray();
                AbstractC1757e.license(parcel);
                ?? obj = new Object();
                obj.f6092e = createByteArray2;
                ((C2580e) this.license).ad(obj);
                return true;
        }
    }
}
