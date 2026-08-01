package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٜ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10393e extends AbstractC1600e {
    public final IBinder billing;
    public final /* synthetic */ AbstractC6785e yandex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10393e(AbstractC6785e abstractC6785e, int i, IBinder iBinder, Bundle bundle) {
        super(abstractC6785e, i, bundle);
        this.yandex = abstractC6785e;
        this.billing = iBinder;
    }

    @Override // defpackage.AbstractC1600e
    public final boolean ad() {
        IBinder iBinder = this.billing;
        try {
            AbstractC9528e.startapp(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC6785e abstractC6785e = this.yandex;
            String Signature = abstractC6785e.Signature();
            InterfaceC3440e interfaceC3440e = abstractC6785e.Signature;
            if (!Signature.equals(interfaceDescriptor)) {
                String Signature2 = abstractC6785e.Signature();
                Log.w("GmsClient", AbstractC4653e.ads(new StringBuilder(Signature2.length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", Signature2, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface appmetrica = abstractC6785e.appmetrica(iBinder);
            if (appmetrica == null || !(abstractC6785e.ads(2, 4, appmetrica) || abstractC6785e.ads(3, 4, appmetrica))) {
                return false;
            }
            abstractC6785e.tapsense = null;
            Bundle mopub = abstractC6785e.mopub();
            if (interfaceC3440e == null) {
                return true;
            }
            interfaceC3440e.pro(mopub);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // defpackage.AbstractC1600e
    public final void vip(C14758e c14758e) {
        AbstractC6785e abstractC6785e = this.yandex;
        InterfaceC5560e interfaceC5560e = abstractC6785e.admob;
        if (interfaceC5560e != null) {
            interfaceC5560e.adcel(c14758e);
        }
        abstractC6785e.tapsense(c14758e);
    }
}
