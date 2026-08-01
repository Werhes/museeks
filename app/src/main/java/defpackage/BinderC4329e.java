package defpackage;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۘٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC4329e extends Binder implements InterfaceC4342e {
    public int license;
    public final WeakReference metrica;

    public BinderC4329e(C4275e c4275e) {
        attachInterface(this, "androidx.media3.session.IMediaController");
        this.metrica = new WeakReference(c4275e);
        this.license = -1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, eؖۙؗ, eؖۚؔ] */
    public static InterfaceC4342e adcel(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
        if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC4342e)) {
            return (InterfaceC4342e) queryLocalInterface;
        }
        ?? obj = new Object();
        obj.metrica = iBinder;
        return obj;
    }

    @Override // defpackage.InterfaceC4342e
    public final void ad() {
        remoteconfig(new C13415e(13));
    }

    @Override // defpackage.InterfaceC4342e
    public final void advert(int i, int i2, int i3) {
        remoteconfig(new C14422e(i2, i3, 2));
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.InterfaceC4342e
    /* renamed from: continue, reason: not valid java name */
    public final void mo1614continue(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            C3575e ad = C3575e.ad(bundle);
            this.license = ad.vip;
            remoteconfig(new C17687e(17, ad));
        } catch (RuntimeException e) {
            AbstractC2803e.amazon("MediaControllerStub", "Malformed Bundle for ConnectionResult. Disconnected from the session.", e);
            ad();
        }
    }

    @Override // defpackage.InterfaceC4342e
    /* renamed from: eؘٕۚ, reason: contains not printable characters */
    public final void mo1615e(int i, Bundle bundle) {
        int i2;
        if (bundle == null || (i2 = this.license) == -1) {
            return;
        }
        try {
            remoteconfig(new C17687e(18, C12693e.vip(i2, bundle)));
        } catch (RuntimeException e) {
            AbstractC2803e.amazon("MediaControllerStub", "Ignoring malformed Bundle for SessionPositionInfo", e);
        }
    }

    /* renamed from: eًٓؓ, reason: contains not printable characters */
    public final void m1616e(int i, Object obj) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            C4275e c4275e = (C4275e) this.metrica.get();
            if (c4275e == null) {
                return;
            }
            c4275e.vip.mopub(i, obj);
            c4275e.ad.vip(new RunnableC9766e(c4275e, i, 7));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // defpackage.InterfaceC4342e
    /* renamed from: eٌؚۛ, reason: contains not printable characters */
    public final void mo1617e(int i, Bundle bundle, boolean z) {
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean(C1120e.license, z);
        bundle2.putBoolean(C1120e.appmetrica, true);
        mo1618e(i, bundle, bundle2);
    }

    @Override // defpackage.InterfaceC4342e
    /* renamed from: eٍۢؒ, reason: contains not printable characters */
    public final void mo1618e(int i, Bundle bundle, Bundle bundle2) {
        int i2;
        if (bundle == null || bundle2 == null || (i2 = this.license) == -1) {
            return;
        }
        try {
            try {
                remoteconfig(new C18070e(C2411e.subscription(i2, bundle), new C1120e(bundle2.getBoolean(C1120e.license, false), bundle2.getBoolean(C1120e.appmetrica, false)), 1));
            } catch (RuntimeException e) {
                AbstractC2803e.amazon("MediaControllerStub", "Ignoring malformed Bundle for BundlingExclusions", e);
            }
        } catch (RuntimeException e2) {
            AbstractC2803e.amazon("MediaControllerStub", "Ignoring malformed Bundle for PlayerInfo", e2);
        }
    }

    @Override // defpackage.InterfaceC4342e
    /* renamed from: eِؗؓ, reason: contains not printable characters */
    public final void mo1619e(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            remoteconfig(new C8881e(C5298e.vip(bundle)));
        } catch (RuntimeException e) {
            AbstractC2803e.amazon("MediaControllerStub", "Ignoring malformed Bundle for Commands", e);
        }
    }

    @Override // defpackage.InterfaceC4342e
    /* renamed from: eّْٝ, reason: contains not printable characters */
    public final void mo1620e(int i, Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            AbstractC2803e.smaato("MediaControllerStub", "Ignoring custom command with null args.");
            return;
        }
        try {
            remoteconfig(new C17825e(i, C11858e.ad(bundle), bundle2));
        } catch (RuntimeException e) {
            AbstractC2803e.amazon("MediaControllerStub", "Ignoring malformed Bundle for SessionCommand", e);
        }
    }

    @Override // defpackage.InterfaceC4342e
    /* renamed from: eًْٕ, reason: contains not printable characters */
    public final void mo1621e(int i, Bundle bundle) {
        int i2;
        if (bundle == null || (i2 = this.license) == -1) {
            return;
        }
        try {
            m1616e(i, C8802e.ad(i2, bundle));
        } catch (RuntimeException e) {
            AbstractC2803e.amazon("MediaControllerStub", "Ignoring malformed Bundle for LibraryResult", e);
        }
    }

    @Override // defpackage.InterfaceC4342e
    /* renamed from: eؘٟ٘, reason: contains not printable characters */
    public final void mo1622e(int i, int i2, Bundle bundle, String str) {
        if (TextUtils.isEmpty(str)) {
            AbstractC2803e.smaato("MediaControllerStub", "onSearchResultChanged(): Ignoring empty query");
            return;
        }
        if (i2 < 0) {
            AbstractC10257e.pro("onSearchResultChanged(): Ignoring negative itemCount: ", i2, "MediaControllerStub");
            return;
        }
        if (bundle != null) {
            try {
                C11753e.ad(bundle);
            } catch (RuntimeException e) {
                AbstractC2803e.amazon("MediaControllerStub", "Ignoring malformed Bundle for LibraryParams", e);
                return;
            }
        }
        remoteconfig(new C13415e(14));
    }

    @Override // defpackage.InterfaceC4342e
    /* renamed from: e٘ٔ٘, reason: contains not printable characters */
    public final void mo1623e(int i, int i2, Bundle bundle, String str) {
        if (TextUtils.isEmpty(str)) {
            AbstractC2803e.smaato("MediaControllerStub", "onChildrenChanged(): Ignoring empty parentId");
            return;
        }
        if (i2 < 0) {
            AbstractC10257e.pro("onChildrenChanged(): Ignoring negative itemCount: ", i2, "MediaControllerStub");
            return;
        }
        if (bundle != null) {
            try {
                C11753e.ad(bundle);
            } catch (RuntimeException e) {
                AbstractC2803e.amazon("MediaControllerStub", "Ignoring malformed Bundle for LibraryParams", e);
                return;
            }
        }
        remoteconfig(new C13415e(14));
    }

    @Override // defpackage.InterfaceC4342e
    /* renamed from: eَۣ٘, reason: contains not printable characters */
    public final void mo1624e(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            m1616e(i, C9759e.ad(bundle));
        } catch (RuntimeException e) {
            AbstractC2803e.amazon("MediaControllerStub", "Ignoring malformed Bundle for SessionResult", e);
        }
    }

    @Override // defpackage.InterfaceC4342e
    public final void metrica(int i) {
        remoteconfig(new C13415e(12));
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaController");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaController");
            return true;
        }
        if (i == 4001) {
            mo1623e(parcel.readInt(), parcel.readInt(), (Bundle) AbstractC10115e.ad(parcel, Bundle.CREATOR), parcel.readString());
            return true;
        }
        if (i == 4002) {
            mo1622e(parcel.readInt(), parcel.readInt(), (Bundle) AbstractC10115e.ad(parcel, Bundle.CREATOR), parcel.readString());
            return true;
        }
        switch (i) {
            case 3001:
                mo1614continue(parcel.readInt(), (Bundle) AbstractC10115e.ad(parcel, Bundle.CREATOR));
                return true;
            case 3002:
                mo1624e(parcel.readInt(), (Bundle) AbstractC10115e.ad(parcel, Bundle.CREATOR));
                return true;
            case 3003:
                mo1621e(parcel.readInt(), (Bundle) AbstractC10115e.ad(parcel, Bundle.CREATOR));
                return true;
            case 3004:
                premium(parcel.readInt(), parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 3005:
                int readInt = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                mo1620e(readInt, (Bundle) AbstractC10115e.ad(parcel, creator), (Bundle) AbstractC10115e.ad(parcel, creator));
                return true;
            case 3006:
                parcel.readInt();
                ad();
                return true;
            case 3007:
                mo1617e(parcel.readInt(), (Bundle) AbstractC10115e.ad(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3008:
                mo1615e(parcel.readInt(), (Bundle) AbstractC10115e.ad(parcel, Bundle.CREATOR));
                return true;
            case 3009:
                mo1619e(parcel.readInt(), (Bundle) AbstractC10115e.ad(parcel, Bundle.CREATOR));
                return true;
            case 3010:
                parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle = (Bundle) AbstractC10115e.ad(parcel, creator2);
                Bundle bundle2 = (Bundle) AbstractC10115e.ad(parcel, creator2);
                if (bundle != null && bundle2 != null) {
                    try {
                        try {
                            remoteconfig(new C18070e(C6689e.vip(bundle), C5298e.vip(bundle2), 2));
                        } catch (RuntimeException e) {
                            AbstractC2803e.amazon("MediaControllerStub", "Ignoring malformed Bundle for Commands", e);
                        }
                    } catch (RuntimeException e2) {
                        AbstractC2803e.amazon("MediaControllerStub", "Ignoring malformed Bundle for SessionCommands", e2);
                    }
                }
                return true;
            case 3011:
                metrica(parcel.readInt());
                return true;
            case 3012:
                parcel.readInt();
                Bundle Signature = AbstractC9413e.Signature((Bundle) AbstractC10115e.ad(parcel, Bundle.CREATOR));
                if (Signature == null) {
                    AbstractC2803e.smaato("MediaControllerStub", "Ignoring null Bundle for extras");
                    return true;
                }
                remoteconfig(new C17687e(20, Signature));
                return true;
            case 3013:
                int readInt2 = parcel.readInt();
                Parcelable.Creator creator3 = Bundle.CREATOR;
                mo1618e(readInt2, (Bundle) AbstractC10115e.ad(parcel, creator3), (Bundle) AbstractC10115e.ad(parcel, creator3));
                return true;
            case 3014:
                remoteconfig(new C17687e(parcel.readInt(), (PendingIntent) AbstractC10115e.ad(parcel, PendingIntent.CREATOR)));
                return true;
            case 3015:
                try {
                    remoteconfig(new C13415e(parcel.readInt(), C4960e.ad((Bundle) AbstractC10115e.ad(parcel, Bundle.CREATOR))));
                } catch (RuntimeException e3) {
                    AbstractC2803e.amazon("MediaControllerStub", "Ignoring malformed Bundle for SessionError", e3);
                }
                return true;
            case 3016:
                int readInt3 = parcel.readInt();
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                if (createTypedArrayList != null && this.license != -1) {
                    try {
                        C13304e Signature2 = AbstractC17475e.Signature();
                        for (int i3 = 0; i3 < createTypedArrayList.size(); i3++) {
                            Bundle bundle3 = (Bundle) createTypedArrayList.get(i3);
                            bundle3.getClass();
                            Signature2.metrica(C11161e.startapp(this.license, bundle3));
                        }
                        remoteconfig(new C12435e(readInt3, Signature2.billing(), 2));
                    } catch (RuntimeException e4) {
                        AbstractC2803e.amazon("MediaControllerStub", "Ignoring malformed Bundle for CommandButton", e4);
                    }
                }
                return true;
            case 3017:
                int readInt4 = parcel.readInt();
                Parcelable.Creator creator4 = Bundle.CREATOR;
                Bundle bundle4 = (Bundle) AbstractC10115e.ad(parcel, creator4);
                Bundle bundle5 = (Bundle) AbstractC10115e.ad(parcel, creator4);
                Bundle bundle6 = (Bundle) AbstractC10115e.ad(parcel, creator4);
                if (bundle4 == null || bundle5 == null) {
                    AbstractC2803e.smaato("MediaControllerStub", "Ignoring custom command progress update with null args.");
                } else {
                    try {
                        remoteconfig(new C6802e(readInt4, C11858e.ad(bundle4), bundle5, bundle6));
                    } catch (RuntimeException e5) {
                        AbstractC2803e.amazon("MediaControllerStub", "Ignoring malformed Bundle for SessionCommand", e5);
                    }
                }
                return true;
            case 3018:
                advert(parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // defpackage.InterfaceC4342e
    public final void premium(int i, List list) {
        if (list == null || this.license == -1) {
            return;
        }
        try {
            C13304e Signature = AbstractC17475e.Signature();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Bundle bundle = (Bundle) list.get(i2);
                bundle.getClass();
                Signature.metrica(C11161e.startapp(this.license, bundle));
            }
            remoteconfig(new C12435e(i, Signature.billing(), 3));
        } catch (RuntimeException e) {
            AbstractC2803e.amazon("MediaControllerStub", "Ignoring malformed Bundle for CommandButton", e);
        }
    }

    public final void remoteconfig(InterfaceC1360e interfaceC1360e) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            C4275e c4275e = (C4275e) this.metrica.get();
            if (c4275e == null) {
                return;
            }
            AbstractC9413e.m2565strictfp(c4275e.ad.f24699e, new RunnableC7410e(c4275e, interfaceC1360e, 7));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }
}
