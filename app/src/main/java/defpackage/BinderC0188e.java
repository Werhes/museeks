package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؑٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0188e extends Binder implements InterfaceC16274e {
    public static final /* synthetic */ int license = 0;
    public final WeakReference metrica;

    public BinderC0188e(C2584e c2584e) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.metrica = new WeakReference(c2584e);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.InterfaceC16274e
    public final C4820e billing() {
        C2584e c2584e = (C2584e) this.metrica.get();
        if (c2584e == null) {
            return null;
        }
        C4820e c4820e = c2584e.billing;
        C3737e c3737e = c2584e.startapp;
        if (c4820e != null) {
            float f = c4820e.f10273e;
            long j = c4820e.f10271e;
            int i = c4820e.f10275e;
            long j2 = c4820e.f10270e;
            long j3 = -1;
            if (j2 != -1 && ((i == 3 || i == 4 || i == 5) && j > 0)) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j4 = (f * ((float) (elapsedRealtime - j))) + j2;
                if (c3737e != null && c3737e.f8324e.containsKey("android.media.metadata.DURATION")) {
                    j3 = c3737e.ad("android.media.metadata.DURATION");
                }
                long j5 = (j3 < 0 || j4 <= j3) ? j4 < 0 ? 0L : j4 : j3;
                ArrayList arrayList = new ArrayList();
                long j6 = c4820e.f10268e;
                long j7 = c4820e.f10266e;
                int i2 = c4820e.f10277e;
                CharSequence charSequence = c4820e.f10276e;
                AbstractCollection abstractCollection = c4820e.f10274e;
                if (abstractCollection != null) {
                    arrayList.addAll(abstractCollection);
                }
                return new C4820e(c4820e.f10275e, j5, j6, c4820e.f10273e, j7, i2, charSequence, elapsedRealtime, arrayList, c4820e.f10269e, c4820e.f10272e);
            }
        }
        return c4820e;
    }

    @Override // defpackage.InterfaceC16274e
    /* renamed from: eؚٜ۠, reason: contains not printable characters */
    public final void mo257e(InterfaceC4687e interfaceC4687e) {
        C2584e c2584e = (C2584e) this.metrica.get();
        if (c2584e == null || interfaceC4687e == null) {
            return;
        }
        c2584e.purchase.unregister(interfaceC4687e);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (c2584e.license) {
        }
    }

    @Override // defpackage.InterfaceC16274e
    /* renamed from: eًًؓ, reason: contains not printable characters */
    public final void mo258e(InterfaceC4687e interfaceC4687e) {
        C2584e c2584e = (C2584e) this.metrica.get();
        if (c2584e == null || interfaceC4687e == null) {
            return;
        }
        c2584e.purchase.register(interfaceC4687e, new C18287e("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (c2584e.license) {
        }
    }

    @Override // defpackage.InterfaceC16274e
    public final boolean inmobi() {
        return false;
    }

    @Override // defpackage.InterfaceC16274e
    public final int isVip() {
        C2584e c2584e = (C2584e) this.metrica.get();
        if (c2584e != null) {
            return c2584e.mopub;
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [eٌٓٛ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [eٌٓٛ, java.lang.Object] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Bundle bundle;
        InterfaceC4687e interfaceC4687e = null;
        r2 = null;
        Bundle bundle2 = null;
        InterfaceC4687e interfaceC4687e2 = null;
        if (i == 3) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC4687e)) {
                    ?? obj = new Object();
                    obj.metrica = readStrongBinder;
                    interfaceC4687e = obj;
                } else {
                    interfaceC4687e = (InterfaceC4687e) queryLocalInterface;
                }
            }
            mo258e(interfaceC4687e);
            parcel2.getClass();
            parcel2.writeNoException();
            return true;
        }
        if (i == 4) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof InterfaceC4687e)) {
                    ?? obj2 = new Object();
                    obj2.metrica = readStrongBinder2;
                    interfaceC4687e2 = obj2;
                } else {
                    interfaceC4687e2 = (InterfaceC4687e) queryLocalInterface2;
                }
            }
            mo257e(interfaceC4687e2);
            parcel2.getClass();
            parcel2.writeNoException();
            return true;
        }
        if (i == 28) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            C4820e billing = billing();
            parcel2.getClass();
            parcel2.writeNoException();
            if (billing == null) {
                parcel2.writeInt(0);
                return true;
            }
            parcel2.writeInt(1);
            billing.writeToParcel(parcel2, 1);
            return true;
        }
        if (i == 37) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            int startapp = startapp();
            parcel2.getClass();
            parcel2.writeNoException();
            parcel2.writeInt(startapp);
            return true;
        }
        if (i == 45) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            inmobi();
            parcel2.getClass();
            parcel2.writeNoException();
            parcel2.writeInt(0);
            return true;
        }
        if (i == 47) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            int isVip = isVip();
            parcel2.getClass();
            parcel2.writeNoException();
            parcel2.writeInt(isVip);
            return true;
        }
        if (i != 50) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.getClass();
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        C2584e c2584e = (C2584e) this.metrica.get();
        if (c2584e != null && (bundle = c2584e.appmetrica) != null) {
            bundle2 = new Bundle(bundle);
        }
        parcel2.getClass();
        parcel2.writeNoException();
        if (bundle2 == null) {
            parcel2.writeInt(0);
            return true;
        }
        parcel2.writeInt(1);
        bundle2.writeToParcel(parcel2, 1);
        return true;
    }

    @Override // defpackage.InterfaceC16274e
    public final int startapp() {
        C2584e c2584e = (C2584e) this.metrica.get();
        if (c2584e != null) {
            return c2584e.adcel;
        }
        return -1;
    }
}
