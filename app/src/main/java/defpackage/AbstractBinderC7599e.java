package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۦؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC7599e extends AbstractBinderC3782e implements InterfaceC6800e {
    public final int license;

    public AbstractBinderC7599e(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 3);
        AbstractC9528e.vip(bArr.length == 25);
        this.license = Arrays.hashCode(bArr);
    }

    public final boolean equals(Object obj) {
        InterfaceC15751e subscription;
        if (obj instanceof InterfaceC6800e) {
            try {
                InterfaceC6800e interfaceC6800e = (InterfaceC6800e) obj;
                if (interfaceC6800e.yandex() == this.license && (subscription = interfaceC6800e.subscription()) != null) {
                    return Arrays.equals(mo1373e(), (byte[]) BinderC3838e.m1403e(subscription));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return false;
            }
        }
        return false;
    }

    /* renamed from: eٖۤٝ */
    public abstract byte[] mo1373e();

    @Override // defpackage.AbstractBinderC3782e
    /* renamed from: eٍۡ */
    public final boolean mo399e(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            InterfaceC15751e subscription = subscription();
            parcel2.writeNoException();
            AbstractC14342e.vip(parcel2, subscription);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.license);
        return true;
    }

    public final int hashCode() {
        return this.license;
    }

    @Override // defpackage.InterfaceC6800e
    public final InterfaceC15751e subscription() {
        return new BinderC3838e(mo1373e());
    }

    @Override // defpackage.InterfaceC6800e
    public final int yandex() {
        return this.license;
    }
}
